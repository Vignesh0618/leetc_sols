class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int[][] temp = new int[mat.length][mat[0].length];
        int count = 4;
        while(count!=0){
            boolean allMatch = true;
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    if(mat[i][j]!=target[j][mat.length-1-i])
                    allMatch = false;
                    temp[j][mat.length-1-i] = mat[i][j];
                }
            }
            if(allMatch) return true;
            int[][] temp1 = temp;
            temp = mat;
            mat = temp1;
            count--;
        }
        return false;
    }
}