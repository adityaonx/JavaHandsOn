//If same named method are there, then by default searches method in (child class ), if not found then check in parent class
class Android{
    
    void call(){
        System.out.println("Call from Android");
    }
}

class Samsung extends Android{
    
    // void call(){
    //     System.out.println("Call from Samsung");
    // }

}

class Demo {
    public static void main(String[] args){
        Samsung obj = new Samsung();
        obj.call(); //Call from Android
    }
}