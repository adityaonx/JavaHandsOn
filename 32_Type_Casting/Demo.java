class OS {
    void show1(){
        System.out.println("OS is booting up!");
    }
}
class Linux extends OS{
    void show2(){
        System.out.println("Linux is booting up!");
    }
}

class Demo{
    public static void main(String[] args){
        
        OS obj = new Linux();
        
        //error: cannot find symbol obj.show2();
        //obj.show2();//As obj is of type OS and doesnt know about show2() even if it has child object
       
        //Upcasting hidden by default
        OS obj1 = (OS) new Linux();    
        obj1.show1(); //OS is booting up!

        //Downcasting
        Linux obj2 = (Linux) obj;    
        obj2.show2(); //Linux is booting up!
    }
}
