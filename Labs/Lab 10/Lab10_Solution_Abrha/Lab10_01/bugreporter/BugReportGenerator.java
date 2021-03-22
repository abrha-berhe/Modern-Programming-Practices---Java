package Lab10_01.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import Lab10_01.classfinder.ClassFinder;
import Lab10_01.javapackage.*;

/**
 * This class scans the package Lab10_01.javapackage for classes with
 * annotation @BugReport. It then generates a bug report bugreport.txt,
 * formatted like this:
 * 
 * Joe Smith reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 * Tom Jones reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "Lab10_01.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";

	public void reportGenerator() {
		// List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		Class<ClosedCurve> closed = ClosedCurve.class;
		Class<Circle> circle = Circle.class;
		Class<Rectangle> rectangle = Rectangle.class;
		Class<DataMiner> miner = DataMiner.class;
		List<Class<?>> classes = Arrays.asList(closed, circle, rectangle, miner);

		List<String> names = new ArrayList<String>();
		List<BugReport> bugs = new ArrayList<>();
		List<Class> myClasses = new ArrayList<>();
		for (Class<?> cl : classes) {
			if (cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport) cl.getAnnotation(BugReport.class);
				bugs.add(annotation);
				String name = annotation.assignedTo();
				names.add(name);
				myClasses.add(cl);
			}
		}

		List<String> distinctBugFixerNames = names.stream().distinct().collect(Collectors.toList());

		BiFunction<BugReport, Class, String> myFunc = (bug, cl) -> "\tReported By:" + bug.reportedBy() + "\n"
				+ "\tClass Name:" + cl + "\n" + "\tDescription:" + bug.description() + "\n\tSeverity:" + bug.severity()
				+ "\n\n";

		// String report = distinctBugFixerNames.stream()
		// .flatMap((String name)->
		// bugs.stream()
		// .filter(bug->bug.assignedTo().equals(name))
		// .map(bug->myFunc.apply(bug)))
		// .collect(Collectors.joining());
		// .collect(Collectors.toList());
		String report = "";
		List<BugReport> bugsPerBuilder = new ArrayList<>();
		for (String name : distinctBugFixerNames) {
			report += "\nAssigned Bug Fixer: " + name + "\n";
			for (int i = 0; i < bugs.size(); i++) {
				if (name.equals(bugs.get(i).assignedTo())) {
					report += myFunc.apply(bugs.get(i), myClasses.get(i));
				}

			}
		}
		//System.out.println(report);

		String path = "D:\\Eclipse Oxygen\\MPP\\src\\Lab10_01\\bugreporter\\MyFile.txt";
		File file = new File(path);
		
		try (
				FileWriter fileWriter = new FileWriter(file); 
				PrintWriter printWriter = new PrintWriter(fileWriter);

		) {

			//fileWriter.write(report);
			printWriter.write(report);
			fileWriter.close();
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
