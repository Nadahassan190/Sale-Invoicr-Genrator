
package MODEL_PACKAGE;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nadah
 */
public class Invoices_Header_Cls {
    
    private int Number;
    private String Customer;
    private String Date;
    private Double ItemTotal;
   private ArrayList<Invoice_Line_Cls> lines; 

    public Invoices_Header_Cls(int Number, String Customer, String Date ) {
        this.Number = Number;
        this.Customer = Customer;
        this.Date = Date;
    }

    
    public int getNumber() {
        return Number;
    }
    public String getCustomer() {
        return Customer;
    }
    public String getDate() {
        return Date;
    }
    public Double getItemTotal() {
       double total = 0.0;
       for (int i=0 ; i< getLines() .size();i++)
       {
        total += getLines().get(i).getItemsTotal();
       } 
       return total;
    }
    public ArrayList<Invoice_Line_Cls> getLines() {
        if (lines ==null)
        {
          lines=new ArrayList<>();
        }
        return lines;
    }

    
    
    public void setNumber(int Number) {
        this.Number = Number;
    }
    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }
    public void setDate(String Date) {
        this.Date = Date;
    }
    public void setTotal(Double Total) {
        this.ItemTotal = Total;
    }
    public void setLines(ArrayList<Invoice_Line_Cls> lines) {
        this.lines = lines;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Invoices_Header_Cls{" + "Number=" + Number + ", Customer=" + Customer + ", Date=" + Date + '}';
    }
    
        public String getCSV() {
        return Number + "," + Date + "," + Customer;
    }

   
   
    
    
   
   
   
   
   
    
}
