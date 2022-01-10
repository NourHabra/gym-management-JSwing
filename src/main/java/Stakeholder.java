import java.util.*;

public class Stakeholder {
    public String firstName;
    public String lastName;
    public String gender;
    public String phone;
    public String type;
    public static List<Stakeholder> stakeholders = new ArrayList<Stakeholder>();

    //constructor
    protected Stakeholder(String firstName, String lastName, String gender, String phone, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phone = phone;
        this.type = type;
        stakeholders.add(this);
    }
    
    public static Stakeholder searchByName(String name){
        for (Stakeholder st: stakeholders){
            if (name.equals(st.firstName + " " + st.lastName)){
                return st;
            }
        }
        return null;
    }
    
    public String getInfo(){
        return (firstName + " " + lastName + 
                " - " + gender +
                " - " + phone);
    }
    
    //Client methods
    public void removeSport(Sport sport){}
    public void addSport(Sport sport){}
    public List<Sport> getSports(){return null;}
    
    //Employee methods
    public void displayInfo(){}
    
}