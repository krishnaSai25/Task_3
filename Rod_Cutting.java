import java.util.Scanner;
class Rod_Cutting {
    public void myfun(int temp,int len)
    {
        int c=0;
         while(temp<=len)
            {
               c++;
               temp=temp*2+1;
            }
             System.out.println(c);
    }
    public static void main(String args[] ) throws Exception {
        TestClass tc=new TestClass();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int len=sc.nextInt();
            int temp=3;
            tc.myfun(temp,len);
        }
    }
}
