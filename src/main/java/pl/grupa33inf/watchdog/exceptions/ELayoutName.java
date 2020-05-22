package pl.grupa33inf.watchdog.exceptions;

import java.io.File;

public class ELayoutName{
   public static String getNewPath(String directory, String filename, String fileExtennsion)
   {
       //TODO: if file with (number) exists, then increase that number.
       String path=directory+"/"+filename+"(1)"+"."+fileExtennsion;
       return path;
   }
}
