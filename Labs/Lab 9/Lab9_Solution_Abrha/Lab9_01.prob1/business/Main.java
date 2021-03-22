package Lab9_01.prob1.business;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Lab9_01.prob1.business.Book;
import Lab9_01.prob1.business.LibraryMember;
import Lab9_01.prob1.dataaccess.DataAccess;
import Lab9_01.prob1.dataaccess.DataAccessFacade;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingAtLeastTwoCopies());
		System.out.println(allHavingMultipleAuthors());

	}

	// Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	public static List<String> allWhoseZipContains3() {
		// DataAccess da = new DataAccessFacade();
		// Collection<LibraryMember> members = da.readMemberMap().values();
		// List<LibraryMember> mems1 = new ArrayList<>();
		// mems1.addAll(members);

		/// ============= To save time, Data is created for test purpose because the Data Access from stotage is showing exception
		Address ad1 = new Address("Harned", "Hawzen", "Tigray", "43216");
		Address ad2 = new Address("Belesa", "Wukro", "Tigray", "40016");
		Address ad3 = new Address("Harned", "Hawzen", "Tigray", "33216");
		Address ad4 = new Address("Harned", "Hawzen", "Tigray", "99216");

		List<LibraryMember> mems1 = Arrays.asList(new LibraryMember("00001", "Chala", "Hagos", "921234566", ad1),
				new LibraryMember("00002", "adff", "uuu", "123123", ad2),
				new LibraryMember("00003", "rere", "oooo", "54545455", ad3),
				new LibraryMember("00004", "rere", "oooo", "54545455", ad1),
				new LibraryMember("00005", "bmbn", "wwww", "7777", ad4));

		List<String> str = mems1.stream().filter(s -> s.getAddress().getZip().contains("3")).map(LM -> LM.getMemberId())// LibraryMember::getAddress)
				.collect(Collectors.toList());

		return str;

	}

	// Returns a list of all isbns of books having at least two copies
	public static List<String> allHavingAtLeastTwoCopies() {
		DataAccess da = new DataAccessFacade();
		// Collection<Book> books = da.readBooksMap().values();
		// List<Book> bs = new ArrayList<>();
		// bs.addAll(books);
		// implement

		/// ============= To save time, Data is created for test purpose because the Data Access from stotage is showing exception

		Address ad1 = new Address("Street1", "City1", "State1", "Zip001");
		Address ad2 = new Address("Street2", "City2", "State2", "Zip002");

		List<Author> auth1 = Arrays.asList(new Author("FirstName1", "LastName1", "Phone1", ad1, "Bigiraphy 1"),
				new Author("FirstName2", "LastName2", "Phone2", ad2, "Bigiraphy 2"));

		List<Author> auth2 = Arrays.asList(new Author("FirstName1", "LastName1", "Phone1", ad1, "Bigiraphy 1"),
				new Author("FirstName2", "LastName2", "Phone2", ad2, "Bigiraphy 2"),
				new Author("FirstName3", "LastName3", "Phone3", ad1, "Bigiraphy 3"));

		List<Book> books = Arrays.asList(new Book("ISB001", "Title 1", 1, auth1),
				new Book("ISB002", "Title 2", 2, auth2), new Book("ISB003", "Title 3", 3, auth2),
				new Book("ISB004", "Title 4", 4, auth1), new Book("ISB005", "Title 5", 5, auth2));
		
		for (int i = 0; i < 2; i++) {
			books.get(i).addCopy();
		}
		books.get(3).addCopy();

		List<String> isbns = books.stream().filter(b -> b.getCopies().length >= 2).map(Book::getIsbn)
				.collect(Collectors.toList());

		return isbns;

	}

	// Returns a list of all isbns of Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		// Collection<Book> books = da.readBooksMap().values();
		// List<Book> bs = new ArrayList<>();
		// bs.addAll(books);
		// implement
		
		
		/// ============= To save time, Data is created for test purpose because the Data Access from stotage is showing exception

		Address ad1 = new Address("Street1", "City1", "State1", "Zip001");
		Address ad2 = new Address("Street2", "City2", "State2", "Zip002");

		List<Author> auth1 = Arrays.asList(new Author("FirstName1", "LastName1", "Phone1", ad1, "Bigiraphy 1"));

		List<Author> auth2 = Arrays.asList(new Author("FirstName1", "LastName1", "Phone1", ad1, "Bigiraphy 1"),
				new Author("FirstName2", "LastName2", "Phone2", ad2, "Bigiraphy 2"));

		List<Author> auth3 = Arrays.asList(new Author("FirstName3", "LastName3", "Phone3", ad1, "Bigiraphy 3"));

		List<Author> auth4 = Arrays.asList(new Author("FirstName1", "LastName1", "Phone1", ad1, "Bigiraphy 1"),
				new Author("FirstName2", "LastName2", "Phone2", ad2, "Bigiraphy 2"),
				new Author("FirstName3", "LastName3", "Phone3", ad1, "Bigiraphy 3"),
				new Author("FirstName4", "LastName4", "Phone4", ad1, "Bigiraphy 4"));
		List<Author> auth5 = Arrays.asList(new Author("FirstName5", "LastName5", "Phone5", ad1, "Bigiraphy 5"));

		List<Book> books = Arrays.asList(new Book("ISB001", "Title 1", 1, auth1),
				new Book("ISB002", "Title 2", 2, auth2), new Book("ISB003", "Title 3", 3, auth3),
				new Book("ISB004", "Title 4", 4, auth4), new Book("ISB005", "Title 5", 5, auth5));
		for (int i = 0; i < 2; i++) {
			books.get(i).addCopy();
		}
		books.get(3).addCopy();

		List<String> isbns = books.stream().filter(b -> b.getAuthors().size() >= 2).map(Book::getIsbn)
				.collect(Collectors.toList());

		return isbns;

	}

}
