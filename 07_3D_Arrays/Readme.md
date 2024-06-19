Jagged Array (Collection of arrays where array may have different sizes)
Example:
    5,2,3,7,1 || 8,5 0,0,5 || 5,3,3,5,4 || 8,0,2 1,2 
    2,9,3,6,0 || 2,2,3,7,8 || 6,7,4,2,8 || 0,1,3,3,2 
    2,7,7,3,8 || 9,6,9,4,0 || 2,1 7,8,1 || 2,4,2,3,7 

    for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                for(int k=0;k<nums[i][j].length;k++){
                //Storing random values using Math library
                nums[i][j][k]= (int)(Math.random()*10);//TypeCasting to int from double
                }
            }
        }