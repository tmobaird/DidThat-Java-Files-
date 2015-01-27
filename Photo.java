package didThat;
import java.util.ArrayList;
import java.util.Comparator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Photo implements Comparable<Photo>{
	private User author;
	private String url;
	private String caption;
	private String location;
	private String date;
	private String otherDate;
	private Date timestamp;
	
	public void setDate(String data){
		date = data;
	}
	public User getAuthor(){
		return author;
	}
	public String getCaption(){
		return caption;
	}
	public String getLocation(){
		return location;
	}
	public String getDate(){
		return date;
	}
	public Date getTimeStamp(){
		return timestamp;
	}
	public String getUrl(){
		return url;
	}
	public void setCaption(String caption){
		this.caption = caption;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public int compareTo(Photo other){
                if(timestamp.before(other.getTimeStamp())){
                        return 1;
                }
                else if(timestamp.after(other.getTimeStamp())){
                        return -1;
                }
                else {
                        return 0;
                }
        }
	public Photo(User author, String url){
                this.author = author;
                this.caption = "";
		this.url = url;
                this.location = "";
                date = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(Calendar.getInstance().getTime());
                otherDate = new SimpleDateFormat("MMddyyyyhhmmss").format(Calendar.getInstance().getTime());
                timestamp = new Date();
        }
} 
