import java.util.*;
class Army{
    public static void main(String args[] ) throws Exception {
        Solution s=new Solution();
	s.mymethod();

}}
class Solution{
	public void mymethod(){
	int i;
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        long minimum_def[]=new long[ch+2];
        long maximum_def[]=new long[ch+2];
        minimum_def[0]=sc.nextLong();
        minimum_def[1]=sc.nextLong();
        maximum_def[0]=minimum_def[0];
        maximum_def[1]=minimum_def[1];
        for(i=2;i<ch+2;i++)
        {
            long pos=sc.nextLong();
            long army=sc.nextLong();
            if((minimum_def[0]<=pos+army)&&(maximum_def[1]>=pos-army)){
                minimum_def[i]=pos-army;
                maximum_def[i]=pos+army;
            }
            else if(minimum_def[0]<pos+army){
                minimum_def[i]=minimum_def[1];
                maximum_def[i]=minimum_def[1];
            }
            else{
                minimum_def[i]=minimum_def[0];
                maximum_def[i]=minimum_def[0];
                }
        }
        Arrays.sort(minimum_def);
        Arrays.sort(maximum_def);
        long final_sum=0;
        for(i=1;i<minimum_def.length;i++){
            if(minimum_def[i]-maximum_def[i-1]>0)
                final_sum+=minimum_def[i]-maximum_def[i-1];}
          System.out.print(final_sum);
    } 
}