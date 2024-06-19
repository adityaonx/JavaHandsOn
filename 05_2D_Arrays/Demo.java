import java.lang.Math;
class Demo
{
    public static void main(String[] a){

        //Storing elements in array
        int[] num = {1,5,7};

        //Creating an empty array
        int[] num1 = new int[4];

        //Creating 2d Array
        int[][] nums = new int[3][4];

        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                //Storing random values using Math library
                nums[i][j]= (int)(Math.random()*10);//TypeCasting to int from double
            }
        }

        //Printing the array values
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(" ");
        
        //Enhanced ForLoop : Printing whole array row wise
        for ( int[] n : nums){ //here n is a 1D Array
            for( int m : n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }


}