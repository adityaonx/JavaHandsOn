import java.lang.Math;
class Demo
{
    public static void main(String[] a){

        //3D Arrays
        int[][][] nums = new int[3][4][5];


        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                for(int k=0;k<nums[i][j].length;k++){
                //Storing random values using Math library
                nums[i][j][k]= (int)(Math.random()*10);//TypeCasting to int from double
                }
            }
        }
        //Enhanced ForLoop : Printing whole array row wise
        for ( int[][] n : nums){ //here n is a 2D Array
            for( int[] m : n)
            {
                for( int o : m)
                {
                    System.out.print(o);
                    if (o != m[m.length - 1]) 
                    {
                        System.out.print(",");
                    }
                    else{
                        System.out.print(" ");
                    } 
                }
                if (m != n[n.length - 1]) 
                {
                    System.out.print("|| ");
                }
            }
           System.out.println();
        }

    }


}