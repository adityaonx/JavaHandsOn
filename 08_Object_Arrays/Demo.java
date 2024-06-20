class Students{
    int rollno;
    String name;
    int marks;
}

class Demo{
    public static void main(String[] args){
        
        //Creating new objects and assigning values to object variables
        Students s1= new Students();
        s1.rollno=1;
        s1.name="Aditya";
        s1.marks=100;
        Students s2= new Students();
        s2.rollno=2;
        s2.name="Jimmy";
        s2.marks=90;
        Students s3= new Students();
        s3.rollno=3;
        s3.name="Kuldeep";
        s3.marks=80;

        //Creating an array of Students class type to store object values
        Students[] student = new Students[3];   
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;
        
        //Printing all values of each object s1,s2,s3 using for loop
        for(int i=0;i<student.length;i++){
            System.out.println(student[i].rollno + " " + student[i].name + " " + student[i].marks);
        }
    }
}