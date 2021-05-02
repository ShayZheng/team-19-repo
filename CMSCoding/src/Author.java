// author: changyi li
// data: 25/04/2021
import java.util.*;

public class Author extends User{

    //field
    private String Email;
    private ArrayList<Paper> personalPaper;
    private ArrayList<String> authorMessage;


    public ArrayList<String> getAuthorMessage()
    {
        return authorMessage;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Author(int newID, String newName, String newPsw, String newType, String Email) {
        super(newID, newName, newPsw, newType); // inherit from User class
        this.Email = Email;
        this.personalPaper = new ArrayList<>();
    }

    public String toString() {
        return "Author" + super.toString() + "Email: " + Email;
    }

    //

}
