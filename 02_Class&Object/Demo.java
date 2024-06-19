class Computer
{
    public void playMusic(){
        System.out.println("Playing Music!");
    }
    public String getMeAPen(int cost){
        return "Take this Pen!";
    }
}

class Demo
{
    public static void main(String[] a){

        Computer c1 = new Computer(); 
        c1.playMusic();
        String s1 = c1.getMeAPen(10);
        System.out.println(s1);
    }
    
}