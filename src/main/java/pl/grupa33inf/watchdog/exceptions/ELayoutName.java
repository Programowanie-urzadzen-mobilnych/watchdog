package pl.grupa33inf.watchdog.exceptions;

import java.io.File;

public class ELayoutName{
   public static String getNewPath(String directory, String filename, String fileExtennsion)
   {
       int l=filename.length();
       String path="";
       String temp="";
       if(filename.charAt(l-1) == ')')
       {
           if(filename.charAt(l-3)=='(') // for one-digit number
           {
               String x = changeNumber(2,filename);
               temp=filename.substring(0,l-3)+'('+x+')';
               path=directory+"/"+temp+""+"."+fileExtennsion;

           }else if(filename.charAt(l-4)=='(') // for two-digit number
           {
               String x = changeNumber(3,filename);
               temp=filename.substring(0,l-4)+'('+x+')';
           }else if(filename.charAt(l-5)=='(') // for three-digit number
           {
               String x = changeNumber(4,filename);
               temp=filename.substring(0,l-5)+'('+x+')';
           }else if(filename.charAt(l-6)=='(') // for four-digit number
           {
               String x = changeNumber(5,filename);
               temp=filename.substring(0,l-6)+'('+x+')';
           }} else path=directory+"/"+filename+"."+fileExtennsion;

       return path;
   }

   private static String changeNumber(int i, String name)
   {
       int num;
       int l=name.length();
       String number="";
       while( i>1 )
       {
           number+=name.charAt(l-i);
           i--;
       }
       num = Integer.parseInt(number);
       num++;
       number=Integer.toString(num);
       return number;
   }
}
