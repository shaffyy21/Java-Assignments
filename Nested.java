public class Nested {
    public static void main(String[] args) {
         try {
             int a =10;
             int b =0;

            try {
                 int[] arr = {20,30,40};

                 try {
                     String s=null;
                     System.out.println(s.length());
                 } catch (NullPointerException e) {
                    System.out.println("NullPointerException: "+e);                            
                 }
                  System.out.println(arr[5]);
                 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: "+e);
            }

            int result =a/b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: "+e);
        }
         System.out.println("Program continues normally.");
    }
}