public class MainClass {
    public static void main(String args[]) {
        
        //Nour Habra, 202010515
        //Mustafa Alhasany 202010474
        //Mhd Yamen AL Masri, 202010534
        
        Employee admin = new Employee("Admin", "Admin", "Attack Helicopter", "0900000000", "admin", "admin");
        
        //kinda database
        Sport sp1 = new Sport("0001","Soccer","12",9.30,"Majed",29.99,25);
        Sport sp2 = new Sport("0002","Wrestling","10",5.15,"Logan",59.99,10);
        Sport sp3 = new Sport("0003","Volley Ball","5",5.00,"Harris",39.99,15);
        Sport sp4 = new Sport("0004","Rugby","1",12.45,"Ahmad",99.99,15);
        Sport sp5 = new Sport("0005","Tennis","17",2.00,"Toby",59.99,10);
        Sport sp6 = new Sport("0006","Swimming","3",3.00,"Michael",14.99,20);
        
        
        //3 Clients with Expired Cards
        Client cl1 = new Client("John", "Doe", "Male", "0900000000", 35, 70.0, 180.0, 2020202020, new int[]{1,1,2016}, new int[]{1,7,2016});
        Client cl2 = new Client("Ahmad", "Khaled", "Male", "0900000000", 35, 70.0, 180.0, 2020202020, new int[]{1,6,2021}, new int[]{1,1,2022});
        Client cl3 = new Client("Yousef", "Mustafa", "Male", "0900000000", 35, 70.0, 180.0, 2020202020, new int[]{15,1,2020}, new int[]{15,7,2020});
        
        new LoginForm().setVisible(true);
        //new DashboardForm().setVisible(true);
    }
}
