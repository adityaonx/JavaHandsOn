class Students{
    int rollno;
    String name;
    int marks;
}

class Demo{
    public static void main(String[] args){
       
        //Mutable String
        //By starting with a reasonable buffer size, StringBuffer avoids frequent reallocations.
        //This is especially beneficial when you need to modify a string multiple times, as each modification doesn’t create a new object
        StringBuffer sb= new StringBuffer();

        //Buffer means an extra space of (default) 16 characters
        System.out.println(sb.capacity());//16
        
        StringBuffer sb1= new StringBuffer("Aditya");

        //Capacity is now 16 + 6 = 22
        System.out.println(sb1.capacity());//22

        //sb1 Before Append
        System.out.println(sb1); //Aditya
        System.out.println(sb1.hashCode());//498931366

        //Mutable String, append didnt create a new Object, instead it adds to the original String Object.
        sb1.append(" Sahu");
        System.out.println(sb1); //Aditya Sahu

        //sb1 Before Append
        System.out.println(sb1.hashCode());//498931366

        //Converting StringBuffer sb1 to Immutable String str1 using .toString()
        String str1 = sb1.toString();
        System.out.println("Converting StringBuffer to Immutable String using .toString() : Result : " + str1);

        //Deleting character from StringBuffer
        sb1.deleteCharAt(5);
        System.out.println("After deleting character at index 5: " + sb1);//Adity Sahu

        //Inserting String into StringBuffer
        sb1.insert(6,"Sanjay ");
        System.out.println("After inserting string at index 6: " + sb1);//Adity Sanjay Sahu

        //Creating substring from StringBuffer using .substring()
        String str2 = sb1.substring(6,12);
        System.out.println("Immutable substring String: " + str2 );//Sanjay

        //Setting newLength for StringBuffer using .setLength()
        sb1.setLength(30);

        //We use .length (field) for arrays and .length()(method) for Strings as its a method here.
        System.out.println("Immutable substring String: " + sb1.length());//30

    }
}