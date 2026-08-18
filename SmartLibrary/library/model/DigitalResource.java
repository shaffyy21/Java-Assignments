package library.model;

import library.service.Printable;

public class DigitalResource extends LibraryResource implements Printable{
    private String fileType;

    public DigitalResource(int resourceId, String title, String author, String fileType){
        super(resourceId, title, author);
        this.fileType = fileType;
    }

    @Override
    public double calculateFine(int overdueDays){
        return overdueDays*2.0;

    }
    @Override
    public void printDetails(){
        System.out.println("-------Book Details---------");
        displayBasicDetails();
        System.out.println("File Type     : "+fileType);
        System.out.println("Fine Rate  : Rs. 2/day");
    }
}