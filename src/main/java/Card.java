public class Card {
    public int number;
    public int[] startDate = new int[3];
    public int[] endDate = new int[3];

    public Card(int number, int [] startDate, int[] endDate) {
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    
    public String getDetails(){
        return (number + ", "
                + startDate[0] + "/" + startDate[1] + "/" + startDate[2] + " - " +
                + endDate[0] + "/" + endDate[1] + "/" + endDate[2]
                );
    }

}
