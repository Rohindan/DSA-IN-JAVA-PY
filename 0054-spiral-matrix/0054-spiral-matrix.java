class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;

        int count = 0;
        int total = matrix.length * matrix[0].length;
        
        List<Integer> arr = new ArrayList<>();

        while(count < total){

            //topwall
            for(int i = minr, j = minc; j <= maxc && count < total; j++){
                  arr.add(matrix[i][j]);
                  count++;
            }
            minr++;

            // right wall
            for(int i = minr, j = maxc; i <= maxr && count < total; i++){
                arr.add(matrix[i][j]);
                count++;
            }
            maxc--;

            // bottom wall
            for(int i = maxr, j = maxc; j >= minc && count < total; j--){
                arr.add(matrix[i][j]);
                count++;
            }
            maxr--;

            // left wall
            for(int i = maxr, j = minc; i >= minr && count < total; i--){
                arr.add(matrix[i][j]);
                count++;
            }
            minc++;
        }

        return arr;

    }
}