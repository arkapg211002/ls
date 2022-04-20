import java.util.*;
import java.lang.*;
import java.io.*;

public class l2 {
    static int findlongest(String str,int n)
    {
        int ans=0;
        for(int i=0;i<=n-2;i++)
        {
            int l=i,r=i+1;
            int lsum=0,rsum=0;
            while(r<n && l>=0)
            {
                lsum+=str.charAt(l)-'0';
                rsum+=str.charAt(r)-'0';
                if(lsum == rsum)
                {
                    ans=Math.max(ans,r-l+1);
                }
                l--;
                r++;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        String str="123123";
        int n=str.length();
        System.out.println(findlongest(str,n));
    }
}
