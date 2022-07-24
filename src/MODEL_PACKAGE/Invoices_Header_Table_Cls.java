
package MODEL_PACKAGE;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class Invoices_Header_Table_Cls extends AbstractTableModel {
    
    private ArrayList<Invoices_Header_Cls> invheaderslists;
    private String[] columns = {"No.", "Date", "Customer", "Total"};
    
    
    public Invoices_Header_Table_Cls(ArrayList<Invoices_Header_Cls> InvoicesArrayt) {
        this.invheaderslists = InvoicesArrayt;
    }
    
     public List<Invoices_Header_Cls> getInvoicesArray() {
        return invheaderslists;
    }
    
    
    @Override
    public int getRowCount() {
    return invheaderslists==null  ? 0 : invheaderslists.size();
    }
    @Override
    public int getColumnCount() {
     return columns.length;
    }

   @Override
    public Object getValueAt(int Row, int Column)
    {
      Invoices_Header_Cls InvoicesArrayLst = invheaderslists.get(Row);
        switch (Column)
        {
          case 0: return InvoicesArrayLst.getNumber();
          case 1: return InvoicesArrayLst.getDate();
          case 2: return InvoicesArrayLst.getCustomer();
          case 3: return InvoicesArrayLst.getItemTotal();
          default : return "";
     }
    }
    
   @Override
    public String getColumnName(int ColumnName)
    {
     return columns [ColumnName] ;
    }
}
    


