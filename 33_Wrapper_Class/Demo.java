//Wrapper Class
//A class created to for primitive data types in java ex: 
//int -> Integer class
//char -> Character class

class Demo{
    public static void main(String[] args){
 
        int num = 7;
        Integer num1 = num; // autoboxing

        int num2 = num1; // auto-unboxing

        System.out.println(num2);

        String str = "12"; 
        int num3 = Integer.parseInt(str);

        System.out.println(num3*2);

    }
}
 