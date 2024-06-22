//OS is parent and can be the type of the child object's reference variable
class OS{
    void showBoot(){
        System.out.println("OS is booting up!");
    }
}
class Android extends OS{
    void showBoot(){
        System.out.println("Android is booting up!");
    }
}
class Mac extends OS{
    void showBoot(){
        System.out.println("MacOS is booting up!");
    }
}
class Windows extends OS{
    void showBoot(){
        System.out.println("Windows is booting up!");
    }    
}
class Linux extends OS{
    void showBoot(){
        System.out.println("Linux is booting up!");
    }
}

class Demo{
    public static void main(String[] args){
        
        //OS is parent and can be the type of the child object's reference variable
        OS obj = new Android();
        obj.showBoot();
        OS obj1 = new Windows();
        obj1.showBoot();
        OS obj2 = new Linux();
        obj2.showBoot();
    }
}