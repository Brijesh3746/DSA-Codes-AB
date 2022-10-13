public class mai {
    public static void main(String[] args) {
     int[] a={-2, 1, -4, 5, 3};
     int n=5;
        System.out.println(findSum(a,n));
    }
    public static int findSum(int A[],int N){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<N;i++){
            if(A[i]>max){
                max=A[i];
            }
            if (A[i]<min){
                min=A[i];
            }

        }
        return max+min;
    }
}
