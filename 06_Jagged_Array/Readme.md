Jagged Array (Collection of arrays where array may have different sizes)
Example:
    2 6 7 
    4 1 6 3 
    6 0

    for (int i=0;i<nums.length;i++){
        for(int j=0;j<nums[i].length;j++){
            System.out.print(nums[i][j] + " ");
        }
        System.out.println("");
    }