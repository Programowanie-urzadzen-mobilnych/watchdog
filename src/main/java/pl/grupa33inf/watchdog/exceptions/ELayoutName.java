package pl.grupa33inf.watchdog.exceptions;

public class ELayoutName extends Exception{
    public String newPath;
    public ELayoutName(){
        super();
    }
    public ELayoutName(String newPath, Throwable cause){
        super(newPath,cause);
        this.newPath=newPath+"(1)";

    }
}
