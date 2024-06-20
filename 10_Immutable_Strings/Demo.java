class Students{
    int rollno;
    String name;
    int marks;
}

class Demo{
    public static void main(String[] args){
        //(Behind the Scenes) String is a class and each time a new object is created
        String str1= new String("aditya");
        
        //Memory hash before a new refernce given to str1
        System.out.println(str1.hashCode());

        //Abstracted format of a new String 
        String str2 = "Aditya";
        String str3= "Aditya";
        
        //str2 and str3 looks out first in string constant pool, if same string is already inside it, 
        //References the memory address used by str2 to str3 instead of creating new object, else it will create new one.
        System.out.println(str2==str3); //true

        //This will create a new object and reference str1 with new memory address and the old one will be ready for garbage collection.
        str1 = str1 + str2;
        
        //Now we have a different memory hashcode for str1
        System.out.println(str1.hashCode());
    }
}