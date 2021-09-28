package chapterExercise;

public class Invoice {

    private int quantity;
    private double price;
    private String partNumber;
    private String partDescription;


    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.price = price;
        this.quantity = quantity;
    }


    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            quantity = 0;
        }
        this.quantity = quantity;
    }


    public void setPrice(double price) {
        if(price < 0){
            price = 0.0;
        }
        this.price = price;
    }

    public double getInvoiceAmount() {
        double invoiceAmount = quantity * price;
        return invoiceAmount;
    }
}

