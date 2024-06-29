

public class Print_first_N_fibonacci {

    public static long[] printFibb(int n)
    {
        if(n==0){
            return new long[0];
        }


        if(n==1){
            long[] fib = new long[1];
            fib[0] = 1;

            return fib;
        }

        if(n==2){
            long[] fib = new long[2];
            fib[0] = 1;
            fib[1] = 1;


            return fib;
        }

        long[] fib = new long[n];
        fib[0] = 1;
        fib[1] = 1;

        for(int i=2;i<fib.length;i++){

            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib;
    }

    public static void main(String[] args) {

        int n=5;
        long[] res = printFibb(n);

        // Considering first 2 numbers of series as 1,1

        System.out.println("The first N fibonacci numbers are: ");

        for(long i:res){
            System.out.print(i + " ");
        }

    }
}
