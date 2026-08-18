package library.model;


public abstract class LibraryResource{
    private int resourceId;
    private String title;
    private String author;

    protected static String libraryName = "Thapar Library";

    private static int totalResources = 0 ;

    public LibraryResource(int resourceId,String title, String author ){
        this.resourceId = resourceId;
        this.title = title;
        this.author = author;
        totalResources++;
    }

    protected void displayBasicDetails(){
        System.out.println("resource Id:  "+resourceId);
        System.out.println("title:  "+title);
        System.out.println("author:  "+author);
        System.out.println("library:  "+libraryName);
    }

    public int getResourceId(){
        return resourceId;
    }
    
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
     public abstract double calculateFine( int overdueDays);
    
    public static void displayTotalResources() {
        System.out.println("Total Resources Created: " + totalResources);
    }


}