class Solution {
    public String[] sortPeople(String[] arr1, int[] arr) {
        for(int i=0;i<arr.length-1;i++){
           for(int j=1;j<arr.length-i;j++){
               if(arr[j]>arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   
                   String temp1=arr1[j];
                   arr1[j]=arr1[j-1];
                   arr1[j-1]=temp1;   
               }
           }
       }
           return arr1;
    }
}