import java.util.*;
import java.time.*;

public class Client extends Stakeholder{
    public int age;
    public double weight;
    public double height;
    public Card card;
    public String subscriptionType;
    public double discount;
    public double gross;
    public double total;
    public List<Sport> sports = new ArrayList<Sport>();
    //public static List<Client> clients = new ArrayList<Client>();
    
    //Constructor to read from forms
    public Client(String firstName, String lastName, String gender, String phone, int age, double weight, double height, int cardNumber, int sub) {
        super(firstName, lastName, gender, phone, "Client");
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gross = 0;
        this.discount = 1.0;
        this.subscriptionType = "Regular";
        LocalDate currentdate = LocalDate.now();
        int currentDay = currentdate.getDayOfMonth();
        int currentMonth = currentdate.getMonthValue();
        int currentYear = currentdate.getYear();
        int[] startDate = {currentDay, currentMonth, currentYear};
        int[] endDate = {currentDay, 0, 0};
        if (currentMonth + sub < 12){
            endDate[1] = (currentMonth + sub);
            endDate[2] = currentYear;
        } else if (currentMonth + sub > 12){
            endDate[1] = (currentMonth + sub) - 12;
            endDate[2] = currentYear + 1;
        }
        this.card = new Card(cardNumber, startDate, endDate);
        //clients.add(this);
    }
    
    //Constructor for code-defined clients
    public Client(String firstName, String lastName, String gender, String phone, int age, double weight, double height, int cardNumber, int[] startDate, int[] endDate) {
        super(firstName, lastName, gender, phone, "Client");
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gross = 0;
        this.discount = 1.0;
        this.subscriptionType = "Regular";
        this.card = new Card(cardNumber, startDate, endDate);
        //clients.add(this);
    }
    
    private void updateTotal(){
        this.total = this.gross * this.discount;
        this.total = Math.round(this.total * 100.0) / 100.0; //round upto 2 decimals
    }

    @Override
    public void addSport(Sport sport) {
        sports.add(sport);
        sport.availablePlaces--;
        this.gross += sport.price;
        updateTotal();
        if (this.sports.size() < 2){
            subscriptionType = "Regular";
            this.discount = 1.00;
            updateTotal();}
        else if (this.sports.size() == 2){
            subscriptionType = "Silver";
            this.discount = 0.90;
            updateTotal();
        } else if (this.sports.size() >= 3){
            subscriptionType = "Gold";
            this.discount = 0.85;
            updateTotal();
        }
    }
    
    @Override
    public void removeSport(Sport sport){
        this.sports.remove(sport);
        sport.availablePlaces++;
        this.gross -= sport.price;
        updateTotal();
        if (this.sports.size() < 2){
            subscriptionType = "Regular";
            this.discount = 1.00;
            updateTotal();}
        else if (this.sports.size() == 2){
            subscriptionType = "Silver";
            this.discount = 0.90;
            updateTotal();
        } else if (this.sports.size() >= 3){
            subscriptionType = "Gold";
            this.discount = 0.85;
            updateTotal();
        }
    }
    
    @Override
    public String getInfo(){
        return (firstName + " " + lastName + 
                " - " + card.getDetails() +
                " - " + subscriptionType);
    }
    
    @Override
    public List<Sport> getSports(){
        return this.sports;
    }
}
