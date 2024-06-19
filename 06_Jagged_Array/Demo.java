import java.lang.Math;
class Demo
{
    public static void main(String[] a){

        //Jagged Array (Collection of arrays where array may have different sizes)
        int[][] nums = new int[3][];

        nums[0]= new int[3];
        nums[1]= new int[4];
        nums[2]= new int[2];


        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                //Storing random values using Math library
                nums[i][j]= (int)(Math.random()*10);//TypeCasting to int from double
            }
        }

        //Printing the array values
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
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