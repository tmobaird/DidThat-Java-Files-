package didThat;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.io.File;

public class User{
	private String username;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private ArrayList<Photo> timeline;

	public User(String f, String l, String u, String e, String pwd){
		username = u;
		email = e;
		password = pwd;
		firstName = f;
		lastName = f;
		timeline = new ArrayList<Photo>();
	}

	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public String getEmail(){
		return email;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getFullName(){
		return firstName + " " + lastName;
	}
	public ArrayList<Photo> getPhotos(){
		return timeline;
	}
	public void addPhoto(Photo p){
		timeline.add(p);
	}		
}
