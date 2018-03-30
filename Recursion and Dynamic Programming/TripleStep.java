public class TripleStep {
    static int count=0;
    static int[] stepcount = new int[10];
    public static int  ways(int steps,int c[]) {
        int p=0;
        if(steps<0)
            return 0;
        else if (stepcount[steps]!=-1)
            return stepcount[steps];
        else if(steps>0) {
            for (int i = 0; i < c.length; i++) {
                p+=ways(steps-c[i],c);
            }
            stepcount[steps]=p;
            return p;
        }
        else if(steps==0) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
	// write your code here
        int c[] =new int[3];
        for (int i = 1; i <=3 ; i++) {
            c[i-1]=i;
        }
        for (int i = 0; i < 10 ; i++) {
            stepcount[i]=-1;
        }
        int steps=3;
        System.out.println("No of ways "+ways(steps,c));
    }
}
