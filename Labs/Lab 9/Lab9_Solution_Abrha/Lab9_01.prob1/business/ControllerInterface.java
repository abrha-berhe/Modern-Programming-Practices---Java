package Lab9_01.prob1.business;

import java.util.List;

import Lab9_01.prob1.business.Book;
import Lab9_01.prob1.dataaccess.DataAccess;
import Lab9_01.prob1.dataaccess.DataAccessFacade;
 

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
