package pl.grupa33inf.watchdog.exceptions;

import java.io.File;

/**
 * odpowiada za tworzenie poprawnych ścieżek dla zapisywania plików.
 * Pierwotnie ta klasa miała realizować zapis tylko dla plików layout, jednakże została stworzona w
 * ten sposób, aby mogła być używana dla plików o różnych rozszerzeniach.
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class ELayoutName{

    /**
     * Metoda obsługujaca ona również wyjątek w momencie, jeśli plik istnieje dodaje do niego
     * odpowiedni numer (dodaje (1) jeśli już taki plik istnieje, jeśli natomiast plik z (1)
     * istnieje, następuje inkrementacja i plik zostanie zapisany pod numerem nazwa_pliku(2),
     * można w ten sposób zapisać  do 9999 plików o tej samej nazwie).
     * @param directory parametr zawierający ścieżkę
     * @param filename parametr nazwe pliku
     * @param fileExtennsion parametr z rozszerzeniem pliku
     * @return zwrócona nowa ścieżka
     */
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
           }} else path=directory+"/"+filename+"(1)"+"."+fileExtennsion;

       return path;
   }

    /**
     * Metoda służaca do zmiany liczby z nazwy
     * @param i paramtert liczbowy z podanym indeksem
     * @param name paramtert stringowy z podaną nazwą
     * @return zwrócenie nowej liczby
     */
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
