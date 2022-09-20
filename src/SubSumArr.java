public class SubSumArr {
    static int cotainerWithMaxWater(int a[]){
        int Maxarea=0;
        int l=0;
        int r=a.length-1;
        while(l<r){
            int hight=Math.min(a[l],a[r]);
            int distance=r-l;

            int area=hight*distance;
            Maxarea=Math.max(Maxarea,area);

            if(a[l]<a[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return Maxarea;
    }



//    static int subsumarr(int a[]){
//            int cursum=0;
//            int maxsum=Integer.MIN_VALUE;
//            for(int i=0;i<a.length;i++){
//                cursum+=a[i];
//                if(maxsum<cursum)   maxsum=cursum;
//                if(cursum<0)    cursum=0;
//            }
//        return maxsum;
//    }
    public static void main(String[] args) {
     //   int a[] = {-2,7,-6,4,1,-3,8};
//        int sub=subsumarr(a);
//        System.out.println(sub);
        int a[]={1,8,6,2,4,5,8,3,7};
        int ans=cotainerWithMaxWater(a);
        System.out.println(ans);
    }
    }

