import java.util.*;
import java.text.*;

public class Sport {
    public String id;
    public String name;
    public String room;
    public double time;
    public String coach;
    public double price;
    public int availablePlaces;

    // List to store all instance of this class for ease of use when printing
    // https://stackoverflow.com/questions/10071065/getting-all-instances-of-a-class
    public static List<Sport> sports = new ArrayList<Sport>();

    public Sport(String id, String name, String room, double time, String coach, double price, int availablePlaces) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.time = time;
        this.coach = coach;
        this.price = price;
        this.availablePlaces = availablePlaces;
        sports.add(this);
    }
    
    public String getInfo(){
        return (id + " - " + name + "   Room: " + room + " Time: " + time + " Coach: " + coach + " Price: " + price + " Available: " + availablePlaces);
    }
    
    public String getDetails(){
        return (id + " - " + name + ", Room: " + room + " Time: " + time + " Coach: " + coach);
    }
    
    public static Sport searchByName(String name){
        for (Sport sp:sports){
            if (name.equals(sp.name)){
                return sp;
            }
        }
        return null;
    }
    
    public static Sport searchByInfo(String info){
        for (Sport sp:sports){
            if (info.equals(sp.getInfo())){
                return sp;
            }
        }
        return null;
    }
}
