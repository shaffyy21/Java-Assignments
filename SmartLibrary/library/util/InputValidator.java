package library.util;

public class InputValidator{

    private InputValidator(){

    }
    public static boolean validateResourceId(int resourceId){
        return resourceId > 0;
    }
    public static boolean validateFineDays(int fineDays){
        return fineDays >= 0;


}
}