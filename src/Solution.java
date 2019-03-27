import java.util.ArrayList;
import java.util.Comparator;

 class Developer{
    private int frontSkill;
    private int backSkill;
    public Developer(int frontSkill, int backSkill)
    {
        this.frontSkill=frontSkill;
        this.backSkill=backSkill;
    }

    public int getBackSkill() {
        return backSkill;
    }

    public int getFrontSkill() {
        return frontSkill;
    }
    public static Comparator<Developer> developerComparator= new Comparator<Developer>() {
        @Override
        public int compare(Developer o1, Developer o2) {
            return ((o2.getFrontSkill() - o2.getBackSkill()) - (o1.getFrontSkill() - o1.getBackSkill()));
        }
    };
}

public class Solution {

    public static int Solution(int[] A, int[]B, int F) {
        int sum=0;
        ArrayList<Developer> developerArrayList=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            developerArrayList.add(new Developer(A[i],B[i]));
        }
        developerArrayList.sort(Developer.developerComparator);
        for (Developer d:developerArrayList) {
            if(F>0){
               sum+=d.getFrontSkill();
               F--;
            }
            else{
                sum+=d.getBackSkill();
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
