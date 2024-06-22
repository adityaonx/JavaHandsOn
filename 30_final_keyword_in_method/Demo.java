class OS{
    //Making method as final, stops it from being overridden by child's class of same method name.
    final void showBoot(){
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

        //showBoot() in Linux cannot override showBoot() in OS
        obj.showBoot();
        
    }
}