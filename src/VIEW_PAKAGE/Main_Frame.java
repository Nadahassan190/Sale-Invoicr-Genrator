
package VIEW_PAKAGE;

import CONTROLLER_PACKAGER.Controller_Cls;
import MODEL_PACKAGE.Invoice_Line_Cls;
import MODEL_PACKAGE.Invoice_line_Table_Cls;
import MODEL_PACKAGE.Invoices_Header_Cls;
import MODEL_PACKAGE.Invoices_Header_Table_Cls;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Main_Frame extends javax.swing.JFrame {

    public Main_Frame() {
        initComponents();
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InoiceNumberLabel = new javax.swing.JLabel();
        InvoiceDateLabel = new javax.swing.JLabel();
        CustomerNameLabel = new javax.swing.JLabel();
        InvoiceTotalLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InvoiceItemTable = new javax.swing.JTable();
        InvoiceItemTable.getSelectionModel().addListSelectionListener(Controller);
        jScrollPane2 = new javax.swing.JScrollPane();
        InvoiceHeaderTable = new javax.swing.JTable();
        InvoiceHeaderTable.getSelectionModel().addListSelectionListener(Controller);

        jLabel6 = new javax.swing.JLabel();
        CreateNewInvoiceButton = new javax.swing.JButton();
        CreateNewInvoiceButton.addActionListener(Controller);
        DeleteInvoiceButton = new javax.swing.JButton();
        DeleteInvoiceButton.addActionListener(Controller);
        CreateNewItemButton = new javax.swing.JButton();
        CreateNewItemButton.addActionListener(Controller);
        DeleteItemButton = new javax.swing.JButton();
        DeleteItemButton.addActionListener(Controller);
        InvoiceDateField = new javax.swing.JTextField();
        CustomerNameFeild = new javax.swing.JTextField();
        InoiceNumberFeild = new javax.swing.JLabel();
        InvoiceTotalFeild = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadFileButton = new javax.swing.JMenuItem();
        LoadFileButton.addActionListener(Controller);
        SaveFileButton = new javax.swing.JMenuItem();
        SaveFileButton.addActionListener(Controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sale Invoice Genrator");
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        InoiceNumberLabel.setText("Inoice Number");

        InvoiceDateLabel.setText("Invoice Date");

        CustomerNameLabel.setText("Customer Name");

        InvoiceTotalLabel.setText("Invoice Total");

        jLabel5.setText("Invoice Item");

        InvoiceItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Items Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(InvoiceItemTable);

        InvoiceHeaderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(InvoiceHeaderTable);

        jLabel6.setText("Invoice Table");

        CreateNewInvoiceButton.setText("Create New Invoice");

        DeleteInvoiceButton.setText("Delete Invoice");
        DeleteInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteInvoiceButtonActionPerformed(evt);
            }
        });

        CreateNewItemButton.setText("Add new item");
        CreateNewItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewItemButtonActionPerformed(evt);
            }
        });

        DeleteItemButton.setText("Delete Item");

        InoiceNumberFeild.setText(".");

        InvoiceTotalFeild.setText(".");

        jMenu1.setText("File");

        LoadFileButton.setText("Load File");
        LoadFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFileButtonActionPerformed(evt);
            }
        });
        jMenu1.add(LoadFileButton);

        SaveFileButton.setText("Save File");
        jMenu1.add(SaveFileButton);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InoiceNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InoiceNumberFeild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustomerNameLabel)
                            .addComponent(InvoiceTotalLabel)
                            .addComponent(InvoiceDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvoiceDateField)
                            .addComponent(CustomerNameFeild)
                            .addComponent(InvoiceTotalFeild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(CreateNewInvoiceButton)
                .addGap(30, 30, 30)
                .addComponent(DeleteInvoiceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CreateNewItemButton)
                .addGap(62, 62, 62)
                .addComponent(DeleteItemButton)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InoiceNumberLabel)
                            .addComponent(InoiceNumberFeild))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceDateLabel)
                            .addComponent(InvoiceDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerNameLabel)
                            .addComponent(CustomerNameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceTotalLabel)
                            .addComponent(InvoiceTotalFeild))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateNewInvoiceButton)
                    .addComponent(DeleteInvoiceButton)
                    .addComponent(CreateNewItemButton)
                    .addComponent(DeleteItemButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateNewItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewItemButtonActionPerformed

    private void DeleteInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteInvoiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteInvoiceButtonActionPerformed

    private void LoadFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadFileButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Frame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateNewInvoiceButton;
    private javax.swing.JButton CreateNewItemButton;
    private javax.swing.JTextField CustomerNameFeild;
    private javax.swing.JLabel CustomerNameLabel;
    private javax.swing.JButton DeleteInvoiceButton;
    private javax.swing.JButton DeleteItemButton;
    private javax.swing.JLabel InoiceNumberFeild;
    private javax.swing.JLabel InoiceNumberLabel;
    private javax.swing.JTextField InvoiceDateField;
    private javax.swing.JLabel InvoiceDateLabel;
    private javax.swing.JTable InvoiceHeaderTable;
    private javax.swing.JTable InvoiceItemTable;
    private javax.swing.JLabel InvoiceTotalFeild;
    private javax.swing.JLabel InvoiceTotalLabel;
    private javax.swing.JMenuItem LoadFileButton;
    private javax.swing.JMenuItem SaveFileButton;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
     Controller_Cls Controller=new Controller_Cls(this); 
     
     public ArrayList<Invoices_Header_Cls> HeaderArray;
     public ArrayList<Invoice_Line_Cls> ItemArray;
     private Invoices_Header_Table_Cls HeaderTable;
     private Invoice_line_Table_Cls ItemTable;
     public static DateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public ArrayList<Invoice_Line_Cls> GetItemArray() {
        return ItemArray;
    }
    
    public void setItemArray(ArrayList<Invoice_Line_Cls> Items){
        this.ItemArray = Items;
//        ItemTable= new Invoice_line_Table_Cls(ItemArray);
//        this.InvoiceItemTable.setModel(ItemTable);
    }
    
    
        public void setInvheaders(ArrayList<Invoices_Header_Cls> invoices) {
        this.HeaderArray = invoices;
//        HeaderTable= new Invoices_Header_Table_Cls(HeaderArray);
//        this.InvoiceHeaderTable.setModel(HeaderTable);
    }

    
    public ArrayList<Invoices_Header_Cls> getHeaderArray() {
        return HeaderArray;
    }
    



    public Controller_Cls getController() {
        return Controller;
    }

    public Invoices_Header_Cls getHeaderObject(int Code)  {
     for  (Invoices_Header_Cls inv :HeaderArray){
       if (inv.getNumber() == Code){
         return inv; }
     }
       return null;
    }

    public void setHeaderTable(Invoices_Header_Table_Cls HeaderTable) {
        this.HeaderTable = HeaderTable;
    }
     
    public Invoices_Header_Table_Cls getHeaderTable() {
        return HeaderTable;
    }

    
        public Invoice_line_Table_Cls getItemTable() {
        return ItemTable;
    }
    public void setInvLineTableModel(Invoice_line_Table_Cls invLineTableModel) {
        this.ItemTable = invLineTableModel;
    }
    
    public JTable getInvoiceHeaderTable() {
        return InvoiceHeaderTable;
    }

    public JTable getInvoiceItemTable() {
        return InvoiceItemTable;
    }

    public JLabel getInvoiceNumberFeild() {
        return InoiceNumberFeild;
    }

    public JTextField getInvoiceDateField() {
        return InvoiceDateField;
    }

    public JLabel getInvoiceTotalFeild() {
        return InvoiceTotalFeild;
    }

    public JTextField getCustomerNameFeild() {
        return CustomerNameFeild;
    }

 

}
