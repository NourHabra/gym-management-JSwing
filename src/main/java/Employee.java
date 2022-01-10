import java.util.*;

public class Employee extends Stakeholder {
    static private int currEmployeeId = 0001; // auto generating incrementing id numbers
    public int id;
    final String username;
    final String password;
    //public static List<Employee> employees = new ArrayList<Employee>();

    public Employee(String firstName, String lastName, String gender, String phone, String username, String password) {
        super(firstName, lastName, gender, phone, "Employee");
        this.username = username;
        this.password = password;
        this.id = currEmployeeId++;
        //employees.add(this);
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password); 
    }
    
    @Override
    public String getInfo(){
        return (id + " - " +firstName + " " + lastName + ", " + gender + ", " + phone);
    }
    
}
