Enhanced For Loop is not equivalent to For_each_loop
Enhanced For Loop only works in arrays and on collections.

Here Students is the iterating variable with next value each time from student Object array
    //Printing all values of each object s1,s2,s3 using for loop
        for (Students stud : student){
            System.out.println(stud.rollno + " " + stud.name + " " + stud.marks);
        }