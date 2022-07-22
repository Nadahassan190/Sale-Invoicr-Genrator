
package VIEW_PAKAGE;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author nadah
 */
public class Invoice_Frame_Cls extends JDialog {
    
        private JTextField CustomerNameField;
        private JTextField DateField;
        private JLabel CustNameLabel;
        private JLabel DateLabel;
        private JButton OkayButton;
        private JButton CancelButton;

    public Invoice_Frame_Cls() {
    }

    public Invoice_Frame_Cls(JTextField CustomerNameField, JTextField DateField, JLabel CustNameLabel, JLabel DateLabel, JButton OkayButton, JButton CancelButton)
    {
        this.CustomerNameField = CustomerNameField;
        this.DateField = DateField;
        this.CustNameLabel = CustNameLabel;
        this.DateLabel = DateLabel;
        this.OkayButton = OkayButton;
        this.CancelButton = CancelButton;
    }

    
    public Invoice_Frame_Cls(Main_Frame Frame) {
    
         CustNameLabel = new JLabel("Customer Name");
         add(CustNameLabel);
         DateLabel = new JLabel("Invoice Date");
         add(DateLabel);
         CustomerNameField = new JTextField(25);
         add(CustomerNameField);
         DateField = new JTextField(25);
         add(DateField);
         
         OkayButton = new JButton("OK");
         add(OkayButton);
         CancelButton = new JButton("Cancel");
         add(CancelButton);
    
         
        setLayout(new GridLayout(4, 2));
        setLocation(800, 300);
        setResizable(false);
             
        OkayButton.setActionCommand("Invoice OK");
        OkayButton.addActionListener(Frame.getController());
          
        CancelButton.setActionCommand("Invoice Cancel");
        CancelButton.addActionListener(Frame.getController());
  
        pack();
        
    }

    
    public JTextField getDateField()
    {
     return DateField;
    }
      
    public JTextField getCustomerNameField()
     {
     return CustomerNameField;
     }

    public JLabel getCustNameLabel() {
        return CustNameLabel;
    }

    public JLabel getDateLabel() {
        return DateLabel;
    }

    public JButton getOkayButton() {
        return OkayButton;
    }

    public JButton getCancelButton() {
        return CancelButton;
    }
    }