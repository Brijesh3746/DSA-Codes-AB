import java.util.Arrays;

public class PracProblem {
    static void zero(int[] z, int n){
        int i,count=0;
        for (i=0;i<n;i++){
            if (z[i]!=0){
                z[count]=z[i];
                count++;
            }

        }
        while (count<n){
            z[count]=0;
            count++;
        }
//        for(count=0;count<n;count++){
//            System.out.print(" "+z[count]);
//        }

    }

    static void moveZeroes(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
    static int consecutive(int a[],int n){
        int count = 0;
        int i,result = 0;
        for (i=0;i<n;i++){
            if (a[i]==0){
                count=0;
            }
            else {
                count++;
                result=Math.max(result,count);
            }
        }
        return result;
    }
    static void frequncey(int a[],int n){
        int i,freq=1;
        for (i=1;i<n;i++) {
            if (a[i] == a[i - 1]) {
                freq++;
            } else {
                System.out.println("frequncy of" + a[i - 1] + " is " + freq);
                freq = 1;
            }
        }
            System.out.println("frequncy of"+a[n-1]+" is "+freq);

    }
    public static void main(String[] args) {
//        int a[] = {2,2,2,4,4,6,6,8,10,10};
//        int a[] ={0,1,0,1,0,1,0};
        //int n= a.length;
        int z[]={0,0,2,5,7,0,0,6};
        int n= z.length;
        zero(z, z.length);
        System.out.println(Arrays.toString(z));
//        frequncey(a,n);
//        int ans=consecutive(a,n);
//        System.out.println(ans);
      }
}
