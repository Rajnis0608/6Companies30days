public class UglyNumbers {

    static long getNthUglyNo(int n) {
        long[] ugly_nos = new long[n];
        ugly_nos[0] = 1;
        int i_2 = 0,i_3=0,i_5=0;
        long mul_of_2 = 2;
        long mul_of_3 = 3;
        long mul_of_5 = 5;
        long next_ugly_no = 1;

        for(int i=1;i<n;i++){
            next_ugly_no = Math.min(Math.min(mul_of_2,mul_of_3),mul_of_5);
            ugly_nos[i] = next_ugly_no;

            if(next_ugly_no == mul_of_2){
                i_2++;
                mul_of_2 = ugly_nos[i_2]*2;
            }

            if(next_ugly_no == mul_of_3){
                i_3++;
                mul_of_3 = ugly_nos[i_3]*3;
            }

            if(next_ugly_no == mul_of_5){
                i_5++;
                mul_of_5 = ugly_nos[i_5]*5;
            }
        }
        return ugly_nos[n-1];
    }

    public static void main(String[] args) {
        System.out.println(getNthUglyNo(10));
    }
}
