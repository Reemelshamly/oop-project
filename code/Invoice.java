import java.util.Date;
public class Invoice {
    enum Status {
        Paid,Unpaid
    }
    private double amount;
    private int invoiceID;
    private Date dateIssued;
    private Status InvoiceStatus; 
    
    public Invoice(double amount, int invoiceID, Date dateIssued) {
        super();
        this.amount = amount;
        this.invoiceID = invoiceID;
        this.dateIssued = new Date();
        this.InvoiceStatus=InvoiceStatus.Unpaid;
    }
    public Status getInvoiceStatus() {
        return InvoiceStatus;
    }
    
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getInvoiceID() {
        return invoiceID;
    }
    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }
    public Date getDateIssued() {
        return dateIssued;
    } 
    
}