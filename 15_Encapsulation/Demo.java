class Human{

    //Encapsulation
    //Access or store the values of class's object using class methods.
    //One way is to use private which will make age only accessible inside the class itself.
    private int age = 14;
    private String name = "Aditya";

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    void setName(String s1){
        name = s1;
    }

    void setAge(int n1){
        age = n1;
    }

}

class Demo{
    public static void main(String[] args){
        Human obj = new Human();
        

        //Here obj.name Inaccessible because of the private keyword
        // obj.name = "Aditya";
        // obj.age = 11;
        obj.setAge(26);
        obj.setName("Jimmy");
        System.out.println(obj.getName() + " " +obj.getAge());
    }
}