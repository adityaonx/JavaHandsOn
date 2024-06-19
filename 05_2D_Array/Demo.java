import java.lang.Math;
class Demo
{
    public static void main(String[] a){

        //Storing elements in array
        int num[] = {1,5,7};

        //Creating an empty array
        int num1[] = new int[4];

        //Creating 2d Array
        int num2[][] = new int[3][4];

        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                //Storing random values using Math library
                num2[i][j]= (int)(Math.random()*10);
            }
        }

        //Printing the array values
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(num2[i][j] + " ");
            }
            System.out.println("");
        }
    }


}