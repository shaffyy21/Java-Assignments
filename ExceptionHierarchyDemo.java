public class ExceptionHierarchyDemo{
    public static void main(String[] args) {
        
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: "+e.getMessage());
        }

        try {
            String s=null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: "+e.getMessage());
        }
        try {
            int[] arr={10,20,30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
        }
        try {
            int num = Integer.parseInt("shaffy");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: "+e);
        }
    }
}