


public class SecondLargest {
    public static void main(String[] args) {
        int i,lar=0,selar=0,thlar=0;
        int a[]={1000,20,3000,2000,400};
        for(i=0;i<a.length;i++){
            if(a[i]>lar){
               // thlar=selar;
                selar=lar;
                lar=a[i];
            }
            else if(a[i]<lar){
                if(a[i] > selar){
                 //   thlar=selar;
                    selar = a[i];
                }
                //else if(a[i]>thlar){
                  //  thlar=a[i];
                //}
            }

        }
        System.out.println("The third largest element of array is "+thlar);
    }
}
