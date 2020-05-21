package pl.grupa33inf.watchdog.exceptions;

import java.io.File;

public class ELayoutName{
   public static String getNewPath(String directory, String filename, String fileExtennsion)
   {
       String path = "/storage/emulated/0/";
       path=path+directory+"/"+filename+"(1)"+"."+fileExtennsion;
       return path;
   }
}
