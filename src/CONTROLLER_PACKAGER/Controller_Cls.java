
package CONTROLLER_PACKAGER;



import MODEL_PACKAGE.Invoice_Line_Cls;
import MODEL_PACKAGE.Invoice_line_Table_Cls;
import MODEL_PACKAGE.Invoices_Header_Cls;
import MODEL_PACKAGE.Invoices_Header_Table_Cls;
import VIEW_PAKAGE.Invoice_Frame_Cls;
import VIEW_PAKAGE.Item_Frame_Cls;

import VIEW_PAKAGE.Main_Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.sound.sampled.Line;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Controller_Cls implements ActionListener, ListSelectionListener {
    private Main_Frame Frame;
    public DateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private JTable InvoiceHeaderTable;
    private  Invoice_Frame_Cls InvoiceFRAME;
    private  Item_Frame_Cls ItemFRAME;
    
    
    
    public Controller_Cls(Main_Frame Frame) {
        this.Frame = Frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String actionCommand = e.getActionCommand();
        System.out.println("Action Handlled");
     
        switch (e.getActionCommand())
        {
            case "Create New Invoice":
            System.out.println("Create New Invoice Action");
                CreatInvoiceFrame();
                break;
                
            case "Delete Invoice":
             System.out.println("Delete Invoice Action");
                DeleteInvoiceFrame();
                break;
                
           case "Invoice OK":
            System.out.println("Invoice OK Action");
                InvoiceOK();
                break;
                
            case "Invoice Cancel":
             System.out.println("Invoice Cancel Action");
               InvoiceCancel();
                break;
                
            case "Save":
             System.out.println("Save Item Action");
                SaveItem();
                break;
                
            case "Delete Item":
             System.out.println("Delete Item Action");
                DeleteItem();
                break;

            case "Add Item OK":
             System.out.println("Add Item Ok Action"); 
                 ItemLineOk();   
                break;
                
            case "Item Cancel":
            System.out.println("Item Cancel Action");
                ItemeLineCancel();
                break;
                
            case "Save File":
             System.out.println("Save File Action");
                SaveFile();
                break;
                
            case "Load File":
            System.out.println("Load File Action");
              LoadFile();
                break;
        }
    }

    
//                                                    INVOICE HEADER CONTROLL
    
    private void CreatInvoiceFrame() 
    {
        InvoiceFRAME = new Invoice_Frame_Cls(Frame);
        InvoiceFRAME.setVisible(true);
       try { 
        int invoiceNumber = 0;
        for (Invoices_Header_Cls NewHeader : Frame.getHeaderArray()){
        if (NewHeader.getNumber()> invoiceNumber)
            invoiceNumber = NewHeader.getNumber();
            }
        invoiceNumber++;
        
        InvoiceFRAME.getCustomerNameField().setText("" + invoiceNumber);
       } catch (Exception exception)
       {
           JOptionPane.showMessageDialog(Frame," Select Headers Files First", "Files Were Not Selected", JOptionPane.ERROR_MESSAGE);
           InvoiceFRAME.setVisible(false);
        }
    }
    
    private void DeleteInvoiceFrame() 
    {
      int selectedIndex = Frame.getInvoiceHeaderTable().getSelectedRow();
        if (selectedIndex != -1) {
           Frame.getHeaderArray().remove(selectedIndex);
           Frame.getHeaderTable().fireTableDataChanged();
           Frame.getInvoiceItemTable().setModel(new Invoice_line_Table_Cls(null));

           Frame.setInvheaders(null);
           Frame.getCustomerNameFeild().setText("");
           Frame.getInvoiceNumberFeild().setText("");
           Frame.getInvoiceDateField().setText("");
           Frame.getInvoiceTotalFeild().setText("");

        }
    }
   
    private void InvoiceOK() 
    {
        String CustomerName=InvoiceFRAME.getCustomerNameField().getText();
        String DATEFORMATE =InvoiceFRAME.getDateField().getText();
        int InvNumber=0;
        for(Invoices_Header_Cls invoice:Frame.getHeaderArray())
        {
            if(invoice.getNumber()>InvNumber)
            {
             InvNumber=invoice.getNumber();
            }
              InvNumber++;
        }
        Invoices_Header_Cls voices=new Invoices_Header_Cls(InvNumber,CustomerName,DATEFORMATE);
        Frame.getHeaderArray().add(voices);
        Frame.getHeaderTable().fireTableDataChanged();
        InvoiceFRAME.setVisible(false); 
        InvoiceFRAME.dispose();
        InvoiceFRAME=null;
    }
    
    private void InvoiceCancel()
    {
       InvoiceFRAME.setVisible(false);  
       InvoiceFRAME.dispose();
       InvoiceFRAME=null;
    }
 
    //                                                    INVOICE ITEM CONTROLL
        
    private void SaveItem() 
    {
      ItemFRAME = new Item_Frame_Cls(Frame);
      ItemFRAME.setVisible(true);
       try { 
        int ItemNumber = 0;
        for (Invoices_Header_Cls NewItem : Frame.getHeaderArray()){
        if (NewItem.getNumber()> ItemNumber)
            ItemNumber = NewItem.getNumber();
       }
        ItemNumber++;
       } catch (Exception exception)
       {
       JOptionPane.showMessageDialog(Frame," Load Invoices First ", "Files Werenot Selected", JOptionPane.ERROR_MESSAGE);
       ItemFRAME.setVisible(false);
      }
      try { 
        int Item = 0;
        for (Invoice_Line_Cls NewIt : Frame.GetItemArray()){
        if (NewIt.getCount()> Item)
            Item = NewIt.getCount();
       }
        Item++;
       } catch (Exception exception)
       {
       JOptionPane.showMessageDialog(Frame," Choose Your Customer & Creat new item first", "Files Werenot Selected", JOptionPane.ERROR_MESSAGE);
         ItemFRAME.setVisible(false);
      }
    }

    
    private void DeleteItem()
    {
     int LineIndex = Frame.getInvoiceItemTable().getSelectedRow();
     int InvoiceIndex = Frame.getInvoiceHeaderTable().getSelectedRow();
        if (LineIndex != -1)
        {
         Invoice_line_Table_Cls lineTeModel = (Invoice_line_Table_Cls) Frame.getInvoiceItemTable().getModel();
         lineTeModel.fireTableDataChanged();
          Frame.GetItemArray().remove(LineIndex);
          Frame.getHeaderTable().fireTableDataChanged();
          Frame.getInvoiceTotalFeild().setText("" + Frame.getHeaderArray().get(InvoiceIndex).getItemTotal());
          Frame.getInvoiceHeaderTable().setRowSelectionInterval(InvoiceIndex, InvoiceIndex);
        }
    }

    
    private void ItemLineOk()
     {
      String item = ItemFRAME.getItemNameField().getText();
      String countStr = ItemFRAME.getItemCountField().getText();
      String priceStr = ItemFRAME.getItemPriceField().getText();
        
      int count=1 ;
      double price=1;
        try
        {  
        count = Integer.parseInt(countStr);
        price = Double.parseDouble(priceStr);
        } 
      catch (NumberFormatException ex) 
      {
       JOptionPane.showMessageDialog(Frame, "Cannot convert ", "Invalid number format", JOptionPane.ERROR_MESSAGE);
      }
      int selectedInvHeader = Frame.getInvoiceHeaderTable().getSelectedRow();  
        if (selectedInvHeader != -1) 
        {
            Invoices_Header_Cls invoice = Frame.getHeaderArray().get(selectedInvHeader);
     
            Invoice_Line_Cls line = new Invoice_Line_Cls(item, price, count, invoice);
            Frame.GetItemArray().add(line);
            Invoice_line_Table_Cls linesTableModel = (Invoice_line_Table_Cls) Frame.getInvoiceItemTable().getModel();
        
            linesTableModel.fireTableDataChanged();
            Frame.getHeaderTable().fireTableDataChanged();
        }
        Frame.getInvoiceHeaderTable().setRowSelectionInterval(selectedInvHeader, selectedInvHeader);
        ItemFRAME.setVisible(false);
        ItemFRAME.dispose();
        ItemFRAME = null;
    }
   
    private void ItemeLineCancel() {
        ItemFRAME.setVisible(false);  
        ItemFRAME.dispose();
        ItemFRAME=null;
    }
    

  //                                                    LOAD & SAVE CONTROLL
    
    private void SaveFile() {

        String headers = "";
        String lines = "";
        
        JFileChooser fileChooser = new JFileChooser();
          int Response = fileChooser.showSaveDialog(Frame);
                if (Response == JFileChooser.APPROVE_OPTION) 
                {
                File HeaderFile = fileChooser.getSelectedFile();
            try {
                    FileWriter HeaderFileWRITER = new FileWriter(HeaderFile);
                    HeaderFileWRITER.write(headers);
                    HeaderFileWRITER.flush();
                    HeaderFileWRITER.close();

                JOptionPane.showMessageDialog(Frame, "Select File to Save Data", "Attention", JOptionPane.WARNING_MESSAGE);
                
                Response = fileChooser.showSaveDialog(Frame);
                if (Response == JFileChooser.APPROVE_OPTION)
                {
                    File ItemsFile = fileChooser.getSelectedFile();
                    FileWriter ItemsFileWRITER = new FileWriter(ItemsFile);
                    ItemsFileWRITER.write(lines);
                    ItemsFileWRITER.flush();
                    ItemsFileWRITER.close();
                }
                JOptionPane.showMessageDialog(null, "File Saved ");
                } 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(Frame, "Could not save " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
                }
        
            for (Invoices_Header_Cls Header : Frame.getHeaderArray())
            {
            headers += Header.getCSV();
            headers += "\n";
            for (Invoice_Line_Cls line : Header.getLines()) 
            {
              lines += line.getItemCSV();
              lines += "\n";
            }
            }  
            JOptionPane.showMessageDialog(Frame, "Select File To Save Data", "Attention", JOptionPane.WARNING_MESSAGE);
    }


    private void LoadFile() 
    {
    JOptionPane.showMessageDialog(Frame, "Choose Header File ", "Attention", JOptionPane.WARNING_MESSAGE);
       JFileChooser Choose = new JFileChooser();
        try {
        int result = Choose.showOpenDialog(Frame);
        if (result == JFileChooser.APPROVE_OPTION) 
        {
            File Header=Choose.getSelectedFile();
            String headerStrpath=Header.getAbsolutePath();
            Path headerPath= Paths.get(headerStrpath);
        
            
           List<String>HeaderLines=Files.readAllLines(headerPath);
           ArrayList<Invoices_Header_Cls> InvHeaders =new ArrayList<>();
                for (String headerLine:HeaderLines)
                {
                    String [] Part =headerLine.split(",");
                    String  Part1 = Part[0];
                    String  Part2 = Part[1];
                    String  Part3 = Part[2];
                
                int Code = Integer.parseInt(Part1);
                Date invoiceDate=DateFormat.parse(Part2);
                Invoices_Header_Cls in = new Invoices_Header_Cls(Code,Part3,Part2);
                InvHeaders.add(in);
                }
                 Frame.setInvheaders(InvHeaders);
                 
                 JOptionPane.showMessageDialog(Frame, "Choose Item File ", "Attention", JOptionPane.WARNING_MESSAGE);  
                 
                result = Choose.showOpenDialog(Frame);
                if (result == JFileChooser.APPROVE_OPTION) 
                {
                File Item=Choose.getSelectedFile();
                Path ItemPath= Paths.get(Item.getAbsolutePath());
        
            
                List<String>ItemLines=Files.readAllLines(ItemPath);
                ArrayList<Invoice_Line_Cls> InvItem =new ArrayList<>();
                for (String itemline :ItemLines)
                    {
                       String[] Part =itemline.split(",");
                       String  Part1 = Part[0];
                       String  Part2 = Part[1];
                       String  Part3 = Part[2];
                       String  Part4 = Part[3];

                   int InvCode = Integer.parseInt(Part1);
                   double Price =Double.parseDouble(Part3);
                   int count = Integer.parseInt(Part4);
                   Invoices_Header_Cls In =Frame.getHeaderObject(InvCode);

                  Invoice_Line_Cls line =new Invoice_Line_Cls(Part2,Price,count,In);
                  In.getLines().add(line);
                  }
                 }
                 Invoices_Header_Table_Cls InvoicesHeaderTable= new Invoices_Header_Table_Cls(InvHeaders);
                    Frame.setHeaderTable(InvoicesHeaderTable);
                    Frame.getInvoiceHeaderTable().setModel(InvoicesHeaderTable);
         
                 System.out.println("file loaded");
        }
        }
        catch (IOException ex)
        {
          Logger.getLogger(Controller_Cls.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(Frame, "Cannot read file", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        catch (ParseException ex) 
        {
        Logger.getLogger(Controller_Cls.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(Frame, "Cannot read file", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } 
    

  //                                                   TABLE LISENTER CHANGE CONTROLL
    
    
    @Override
    public void valueChanged(ListSelectionEvent e)
    {
        int SelectedIndex=Frame.getInvoiceHeaderTable().getSelectedRow();
        System.out.println("Row selected"+SelectedIndex);
        if (SelectedIndex!= -1){
        Invoices_Header_Cls selectedInvoice =Frame.getHeaderArray().get(SelectedIndex);

         ArrayList<Invoice_Line_Cls> Lines =selectedInvoice.getLines();
        Invoice_line_Table_Cls inoicelinetable=new Invoice_line_Table_Cls(Lines);
        Frame.setItemArray(Lines);
        Frame.getInvoiceItemTable().setModel(inoicelinetable);
        Frame.getCustomerNameFeild().setText(selectedInvoice.getCustomer());
        Frame.getInvoiceNumberFeild().setText(""+selectedInvoice.getNumber());
        Frame.getInvoiceDateField().setText(selectedInvoice.getDate());
        Frame.getInvoiceTotalFeild().setText( String.valueOf(selectedInvoice.getItemTotal()));
    }
    }
    }



    
