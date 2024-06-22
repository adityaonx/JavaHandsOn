//Making class as final, stops it from being inherited.
final class OS{
    void showBoot(){
        System.out.println("OS is booting up!");
    }
}
class Linux extends OS{
    void showBoot(){
        System.out.println("OS is booting up!");
    }
}

class Demo{
    public static void main(String[] args){
        OS obj = new Linux();
        
        //Error: cannot inherit from final OS
        obj.showBoot();
        
    }
}