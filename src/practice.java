public class practice {//{ Driver Code Starts



        static int binarysearch(int arr[], int n, int k) {

            int res = -1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==k){
                    res=i;
                    break;
                }
            }
            if(res==-1){
                System.out.println(k+"is not present");
            }
            else{
                System.out.println(k+"is  present at "+res);

            }
            return 0;
            // code here
        }
        public static void main(String[] args){
            int a[]={1,2,3,4,5};

            int n=5,k=4;
            binarysearch(a,n,k);


        }

}
