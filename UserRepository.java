package didThat;
import java.util.Hashtable;
import java.util.Collection;
import java.io.*;

public class UserRepository{
	private static UserRepository theInstance;
	private Hashtable<String, User> users;
	
	public static synchronized UserRepository instance(){
		if(theInstance == null){
			theInstance = new UserRepository();
		}
		return theInstance;
	}

	private UserRepository(){
		users = new Hashtable<String, User>();
	}
	public User createNewUser(String first, String last, String username, String password, String email){
                User u = new User(first, last, username, email, password);
                users.put(email, u);
                return u;
        }
	public Collection<User> getAllUsers(){
                return users.values();
        }
        public boolean check(String email){
                return users.containsKey(email);
        }
	public User getUser(String email){
                return users.get(email);
        }
}
