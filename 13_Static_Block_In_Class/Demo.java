class Mobile{
    String brand;
    String model;
    int price;
    static String network;

    Mobile(){
        brand="";
        model="";
        price= 20000;
    }

    //static block will only run once when the first object is created.
    //static loads before constructor
    //static block variable values will be shared across objects
    static{
        network = "4G";
    };
}

class Demo{
    public static void main(String[] args){
       
       //Let both the phone have network as 5G as static, so it is a shared variable of a class among its objects.
    //    Mobile.network = "5G"; 

       Mobile mb1= new Mobile();
       mb1.brand = "Apple";
       mb1.model = "iPhone 15";
       
       //mb1.network = "5G";
       mb1.price = 80000;

       Mobile mb2= new Mobile();
       mb2.brand = "Samsung";
       mb2.model = "Galaxy S23";
       //mb2.network = "5G";
       mb2.price = 50000;
    
        Mobile[] mobile = new Mobile[2];
        mobile[0]=mb1;
        mobile[1]=mb2;

        for (Mobile mob : mobile){
            System.out.println("Brand: " + mob.brand + " Model: " + mob.model + " Network: " + mob.network + " Price: " + mob.price);
        }
        //Brand: Apple Model: iPhone 15 Network: 4G Price: 80000
        //Brand: Samsung Model: Galaxy S23 Network: 4G Price: 50000
    }
}