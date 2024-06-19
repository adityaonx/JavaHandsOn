    //Creating an array of Students class type to store object values
    Students[] student = new Students[3];   
    student[0]=s1;
    student[1]=s2;
    student[2]=s3;

    //Printing all values of each object s1,s2,s3 using for loop
    for(int i=0;i<student.length;i++){
        System.out.println(student[i].rollno + " " + student[i].name + " " + student[i].marks);
    }
