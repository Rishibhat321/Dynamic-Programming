public class YouAndYourBooks {
    public static long max_Books(int arr[], int n, int k) {

        long max=0;
        long res=0;


        if(arr[0]<=k)
        {
            max += arr[0];
            res= Math.max(res,max);
        }

        for(int i=1;i<n;i++)
        {
            if(arr[i]<=k && arr[i-1]<=k)
            {
                max += arr[i];
                res = Math.max(res,max);
            }

            else{
                if(arr[i] <=k){
                    max = arr[i];
                    res=Math.max(res,max);
                }
                else{
                    max=arr[i];
                }
            }


        }

        return res;
    }
    public static void main(String[] args) {

        int[] arr = {3 ,2, 2, 3, 1, 1, 1, 3};
        int n = arr.length;
        int k=2;

        long res = max_Books(arr,n,k);

        System.out.println(res);

    }
}
