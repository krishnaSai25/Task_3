import java.util.*;
import java.io.*;
class Descending_Weights{
    public static void main(String args[] ) throws Exception {
	Solution s=new Solution();
	s.mymethod();
}}
class Solution{
	public void mymethod(){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();                
        }
        Arrays.sort(arr);
      int mod_arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          mod_arr[i]=arr[i]%k;
      }
      StringBuffer sd=new StringBuffer();
      for(int i=k-1;i>=0;i--)
      {
          for(int j=0;j<n;j++)
          {
             if(mod_arr[j]==i)
             sd.append(arr[j]+" ");
          }
      }
    System.out.println(sd);
    sd.delete(0,sd.length());
    }
}
