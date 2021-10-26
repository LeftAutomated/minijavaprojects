import java.text.DecimalFormat;
import java.util.Scanner;

class Part{
    private String partNumber;
    private String description;
    private double price;
    private int quantity;

    public Part(){

    }
    public Part(String partNumber,String description,double price,int quantity){
        this.partNumber=partNumber;
        this.description=description;
        this.price=price;
        this.quantity=quantity;
    }
    public String getPartNumber(){
        return partNumber;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Part){
            Part p=(Part)obj;
            return partNumber.equals(p.partNumber)||description.equals(p.description);
        }
        return false;
    }
    @Override
    public String toString(){
        DecimalFormat df=new DecimalFormat(".00");
        return "["+partNumber+", "+description+", "+df.format(price)+","+quantity+"]";
    }
}
