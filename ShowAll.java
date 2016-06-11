
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Bhaskar
 */
public class ShowAll extends javax.swing.JFrame {
 DefaultTableModel model;
 LogicManager myLogicManager;
 JFrame myFrame;
    /**
     * Creates new form Delete
     */
    public ShowAll(JFrame frameObj,LogicManager obj) {
        initComponents();
        myFrame = frameObj;
        myLogicManager = obj;
        Container con = this.getContentPane();
        con.setBackground(new java.awt.Color(255,187,85));
        this.setTitle("Show All Contacts");
        this.setLocationRelativeTo(null);
        showall.setContentAreaFilled(false);
        showall.setOpaque(true);
        showall.setBackground(new java.awt.Color(217, 251, 119));
        delete.setContentAreaFilled(false);
        delete.setOpaque(true);
        delete.setBackground(new java.awt.Color(252, 60, 58));
         goback.setContentAreaFilled(false);
        goback.setOpaque(true);
        goback.setBackground(new java.awt.Color(252, 60, 58));  
         genfile.setContentAreaFilled(false);
        genfile.setOpaque(true);
        this.setIconImage(new ImageIcon(getClass().getResource("contacts.png")).getImage());
        genfile.setBackground(new java.awt.Color(252, 60, 58)); 
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name","Number","Address","DOB","email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            public boolean isCellEditable(int row, int col)
      { 
          return false; 
      }
        });
        jScrollPane1.setViewportView(table);
    }
    DefaultTableModel getaModel(){
        return model;
    }
    JTable getTable(){
        return table;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showall = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        goback = new javax.swing.JButton();
        genfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showall.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        showall.setText("SHOW ALL RECORDS");
        showall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showallActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Rate", "Stock in hand"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setText("DELETE SELECTED CONTACT");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        goback.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        goback.setText("GO BACK");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        genfile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        genfile.setText("GENERATE FILE");
        genfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(showall, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(genfile, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goback, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(showall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(genfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showallActionPerformed
   model= (DefaultTableModel) table.getModel();   
           // TODO add your handling code here:
        myLogicManager.showAll(this);                           // TODO add your handling code here:
    }//GEN-LAST:event_showallActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    if (table.getSelectedRow() != -1) {
            myLogicManager.delete(this);
}
    }//GEN-LAST:event_deleteActionPerformed

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        this.dispose();
        new ContactList().setVisible(true);
    }//GEN-LAST:event_gobackActionPerformed

    private void genfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genfileActionPerformed

        
     try {
         myLogicManager.generateFile();
         
         if (Desktop.isDesktopSupported()) {
             File file = new File("ContactsAppResults.txt");
             try {
                 Desktop.getDesktop().edit(file);
             } catch (IOException ex) {
                 
             }
             
         } else {
             System.out.println("Sorry..Desktop not supported");
             
         }
         
         // TODO add your handling code here:
     } catch (Exception ex) {
         Logger.getLogger(ShowAll.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_genfileActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton genfile;
    private javax.swing.JButton goback;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showall;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
