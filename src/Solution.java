
public class Solution {

    public static int Solution(int[] A, int[]B, int F) {
        int sum=0;
        int maxDiff =-250000;
        int index=0;
        int i=0;
            while (F>0) {
                if(maxDiff<A[i]-B[i] && A[i]!=-1){
                    maxDiff=A[i]-B[i];
                    index=i;
                    i++;
                }
                else {
                    i++;
                }
                if(i==A.length){
                    sum += A[index];
                    A[index] = -1;
                    i=0;
                    maxDiff=-250000;
                    F--;
                }

            }
            for (int j=0;j<B.length;j++){
                if(A[j]!=-1){
                    sum+=B[j];
                }
            }
        return sum;
    }

    public static void main(String[] args) {
        int []A1={4,2,1};
        int []B1={2, 5, 3};
        int F1=2;
        int []A2={7,1,4,4};
        int []B2={5, 3, 4,3};
        int F2=2;
        int []A3={5,5,5};
        int []B3={5, 5, 5};
        int F3=1;

        System.out.println(Solution(A1,B1,F1));
        System.out.println(Solution(A2,B2,F2));
        System.out.println(Solution(A3,B3,F3));

    }
}
