
package VIEW_PAKAGE;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Item_Frame_Cls extends JDialog{
  
    private JButton OkayItemButton;
    private JButton CancelItemButton;
    private JTextField ItemNameField;
    private JTextField ItemCountField;
    private JTextField ItemPriceField;
    private JLabel ItemNameLabel;
    private JLabel ItemCountLabel;
    private JLabel ItemPriceLabel;

 

    public Item_Frame_Cls(JTextField ItemNameField, JTextField ItemCountField, JTextField ItemPriceField, JLabel ItemNameLabel, JLabel ItemCountLabel, JLabel ItemPriceLabel, JButton OkayItemButton, JButton CancelItemButton)
    {
        this.ItemNameField = ItemNameField;
        this.ItemCountField = ItemCountField;
        this.ItemPriceField = ItemPriceField;
        this.ItemNameLabel = ItemNameLabel;
        this.ItemCountLabel = ItemCountLabel;
        this.ItemPriceLabel = ItemPriceLabel;
        this.OkayItemButton = OkayItemButton;
        this.CancelItemButton = CancelItemButton;
    }

    
    public Item_Frame_Cls(Main_Frame frame) {
                
         ItemNameLabel = new JLabel("Item Name");
         add(ItemNameLabel);
        ItemNameField = new JTextField(25);
         add(ItemNameField);
  
        ItemCountLabel = new JLabel("Item Count");
         add(ItemCountLabel);
        ItemCountField = new JTextField(25);
         add(ItemCountField);
       
         ItemPriceLabel = new JLabel("Item Price");
         add(ItemPriceLabel);
        ItemPriceField = new JTextField(25);
         add(ItemPriceField);
               
        OkayItemButton = new JButton("OK");
         add(OkayItemButton);
        CancelItemButton = new JButton("Cancel");
         add(CancelItemButton);
        
        setLayout(new GridLayout(8, 2));
        setLocation(800, 300);
        setResizable(false);
        
        OkayItemButton.setActionCommand("Add Item OK");
        CancelItemButton.setActionCommand("Item Cancel");
        
        OkayItemButton.addActionListener(frame.getController());
        CancelItemButton.addActionListener(frame.getController());

        pack();
    }

    
    public JTextField getItemNameField() {
        return ItemNameField;
    }

    public JTextField getItemCountField() {
        return ItemCountField;
    }

    public JTextField getItemPriceField() {
        return ItemPriceField;
    }

    public JButton getOkayItemButton() {
        return OkayItemButton;
    }

    public JButton getCancelItemButton() {
        return CancelItemButton;
    }
}
