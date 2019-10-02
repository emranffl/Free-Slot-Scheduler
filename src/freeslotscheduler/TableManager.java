/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freeslotscheduler;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emran
 */
public class TableManager extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form MainFrame
     */
    public TableManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        upperpanel = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        print = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        searchlabel = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        serialrb = new javax.swing.JRadioButton();
        namerb = new javax.swing.JRadioButton();
        idrb = new javax.swing.JRadioButton();
        displayname = new javax.swing.JLabel();
        listtype = new javax.swing.JButton();
        designation = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setExtendedState(this.MAXIMIZED_BOTH);

        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        if(FreeSlotScheduler.faculty ||FreeSlotScheduler.volunteer) {
            delete.setEnabled(true);
        } else {
            delete.setEnabled(false);
        }
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        refresh.setText("Refresh List");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        searchlabel.setLabelFor(search);
        searchlabel.setText("Search");
        searchlabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        search.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        buttonGroup.add(serialrb);
        serialrb.setText("Serial");
        serialrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialrbActionPerformed(evt);
            }
        });

        buttonGroup.add(namerb);
        namerb.setText("Name");
        namerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namerbActionPerformed(evt);
            }
        });

        buttonGroup.add(idrb);
        idrb.setText("ID");
        idrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idrbActionPerformed(evt);
            }
        });

        displayname.setText(FreeSlotScheduler.loginname);
        displayname.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N

        listtype.setText("Volunteer List");
        if(FreeSlotScheduler.student) {
            listtype.setEnabled(false);
        } else {
            listtype.setEnabled(true);
        }
        listtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listtypeActionPerformed(evt);
            }
        });

        designation.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        if(FreeSlotScheduler.student) {
            designation.setText("STUDENT");
        } else if(FreeSlotScheduler.faculty) {
            designation.setText("FACULTY");
        } else {
            designation.setText("VOLUNTEER");
        }

        javax.swing.GroupLayout upperpanelLayout = new javax.swing.GroupLayout(upperpanel);
        upperpanel.setLayout(upperpanelLayout);
        upperpanelLayout.setHorizontalGroup(
            upperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upperpanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(namerb)
                        .addGap(18, 18, 18)
                        .addComponent(idrb)
                        .addGap(18, 18, 18)
                        .addComponent(serialrb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(designation))
                    .addGroup(upperpanelLayout.createSequentialGroup()
                        .addGroup(upperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, upperpanelLayout.createSequentialGroup()
                                .addComponent(searchlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, upperpanelLayout.createSequentialGroup()
                                .addComponent(refresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(print)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listtype)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(upperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(displayname, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        upperpanelLayout.setVerticalGroup(
            upperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchlabel)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(upperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialrb)
                    .addComponent(namerb)
                    .addComponent(idrb)
                    .addComponent(designation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(upperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(print)
                    .addComponent(delete)
                    .addComponent(refresh)
                    .addComponent(listtype)
                    .addComponent(logout)))
        );

        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        table.setAutoCreateRowSorter(true);
        table.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        table.setIntercellSpacing(new java.awt.Dimension(5, 5));
        table.setRowHeight(32);
        table.setShowVerticalLines(false);
        table.setModel(customStudentTableModel("SELECT Serial, Name, ID, CGPA, Semester, Dept FROM `student`"));
        table.setDefaultEditor(Object.class, null);
        table.getTableHeader().setReorderingAllowed(false);
        scrollPane.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(upperpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(upperpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listtypeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_listtypeActionPerformed
        // Displays the type of list; "Student List" or "Volunteer List" with different functionalities
        if (FreeSlotScheduler.volunteer && listtype.getText().equals("Volunteer List")) {
            // Disables the "Delete" button so that the volunteer himself cannot delete an entity from "Volunteer List"
            delete.setEnabled(false);
        } else {
            delete.setEnabled(true);
        }

        if (listtype.getText().equals("Volunteer List")) {

            listtype.setText("Student List");
            // Disables the "Serial" button as "Volunteer List" cannot be searched through serial as it doesn't have it
            serialrb.setEnabled(false);
            // Displays "Volunteer List"
            table.setModel(customStudentTableModel("SELECT ID, Name, `Time Slot` FROM `volunteer`"));
            JOptionPane.showMessageDialog(this, "Displaying volunteer list!", "List Changed", 1);
        } else {
            listtype.setText("Volunteer List");
            serialrb.setEnabled(true);
            // Displays "Student List"
            table.setModel(customStudentTableModel("SELECT Serial, Name, ID, CGPA, Semester, Dept FROM `student`"));
            JOptionPane.showMessageDialog(this, "Displaying student list!", "List Changed", 1);
        }

        buttonGroup.clearSelection();
        search.setText(null);
    }// GEN-LAST:event_listtypeActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_refreshActionPerformed
        // Refreshes the list, clears selected row(s) if any, displays a fresh list
        if (listtype.getText().equals("Volunteer List")) {
            table.setModel(customStudentTableModel("SELECT Serial, Name, ID, CGPA, Semester, Dept FROM `student`"));
        } else {
            table.setModel(customStudentTableModel("SELECT ID, Name, `Time Slot` FROM `volunteer`"));
        }

        buttonGroup.clearSelection();
        search.setText(null);

        JOptionPane.showMessageDialog(this, "List refreshed!", "Success", 1);
    }// GEN-LAST:event_refreshActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_printActionPerformed
        // Prints the displayed list in current displayed mode
        try {
            // The "print(PrintMode, header, footer)" method actually prints the list to various formats
            boolean state = table.print(JTable.PrintMode.FIT_WIDTH, new MessageFormat("Free Slot Scheduling List"),
                    new MessageFormat("Page {0, number, integer} - " + new SimpleDateFormat("E | dd MMM YY - hh:mm a").format(new Date())));
            if (state) {
                JOptionPane.showMessageDialog(this, "List printed successfully!", "Success", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Printing cancelled!", "Aborted", 2);
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", 2);
        }
    }// GEN-LAST:event_printActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteActionPerformed
        // Deletes a single selected entity from displayed list
        if (table.getSelectedRowCount() != 1) {
            // Confirms if only one row is selected 
            if (table.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(this, "Select at least one row to delete!", "Selection Error", 2);
            } else {
                JOptionPane.showMessageDialog(this, "Select only one row to delete!", "Selection Error", 2);
            }
        } else {
            String options[] = new String[2];
            options[0] = "Confirm";
            options[1] = "Cancel";
            // Custom button names
            String idquery;
            String deletequery;

            JLabel jlbl = new JLabel();
            if (listtype.getText().equals("Volunteer List")) {
                // Confirms if the displayed list is "Student List"
                idquery = "select ID from student where ID =";
                deletequery = "DELETE FROM student WHERE ID =";
                String studentlistmsg = "<html>Are you sure to delete serial: <b>"
                        + table.getValueAt(table.getSelectedRow(), table.getColumn("Serial").getModelIndex())
                        + "</b> of name: <b>"
                        + table.getValueAt(table.getSelectedRow(), table.getColumn("Name").getModelIndex())
                        + "</b> and ID: <b>"
                        + table.getValueAt(table.getSelectedRow(), table.getColumn("ID").getModelIndex())
                        + "</b>?</html>";
                jlbl.setText(studentlistmsg);
                // Sets the message text in html format for "Student List"
            } else {
                // Reaches when the displayed list is "Volunteer List"
                idquery = "select ID from volunteer where ID =";
                deletequery = "DELETE FROM volunteer WHERE ID =";
                String volunteerlistmsg = "<html>Are you sure to delete ID: <b>"
                        + table.getValueAt(table.getSelectedRow(), table.getColumn("ID").getModelIndex())
                        + "</b> of name: <b>"
                        + table.getValueAt(table.getSelectedRow(), table.getColumn("Name").getModelIndex())
                        + "</b> and time slot: <b>"
                        + table.getValueAt(table.getSelectedRow(), table.getColumn("Time Slot").getModelIndex())
                        + "</b>?</html>";
                jlbl.setText(volunteerlistmsg);
                // Sets the message text in html format for "Volunteer List"
            }
            jlbl.setFont(new Font("SansSerif", Font.PLAIN, 16));

            // Displays the OptionDialog passing the pre-formatted JLabel as object
            int choice = JOptionPane.showOptionDialog(this, jlbl, "Confirm Delete", 0, 3, null, options, null);

            if (choice == 0) {
                // If and only if "Confirm" is clicked
                DataManager datamanager = new DataManager();

                // Gets the ID from selected row of the displayed table
                String id = table.getValueAt(table.getSelectedRow(), table.getColumn("ID").getModelIndex()).toString();
                // Appends "idquery" with ID 
                idquery += "'" + id + "'";

                try {
                    // Gets the data from database and stores in ResultSet
                    datamanager.getData(idquery);

                    if (DataManager.rset.next()) {// Returns "true" if the selected entity is not deleted by another user from database already
                        // Appends "deletequery" with ID 
                        deletequery += "'" + id + "'";
                        datamanager.updateData(deletequery);

                        tableModel.removeRow(table.getSelectedRow());

                        JOptionPane.showMessageDialog(this, "Data deleted!", "Success", 1);
                    } else {
                        // Reaches if the selected entity is deleted
                        JOptionPane.showMessageDialog(this, "The entity has already been deleted by another user!", "Error", 2);
                        refresh.doClick();
                    }
                } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex, "Error", 2);
                } finally {
                    // Closes the connection
                    datamanager.close();
                }
            }
        }
    }// GEN-LAST:event_deleteActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutActionPerformed
        // Initializing and displaying the JFrame
        new FreeSlotScheduler().setVisible(true);
        // Disposing this frame
        this.dispose();
    }// GEN-LAST:event_logoutActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_searchKeyReleased
        AttributeVerifier av = new AttributeVerifier();

        if (av.checkSearchTableKeyCode(evt)) {// Checks if the KeyCode of the pressed key matches the defined conditions in "AttributeVerifier" class
            if (serialrb.isSelected()) {
                // If searched through "Serial"
                searchQuery = "SELECT Serial, Name, ID, CGPA, Semester, Dept FROM `student` WHERE Serial LIKE ";
            } else if (namerb.isSelected()) {
                // If searched through "Name"
                if (listtype.getText().equals("Volunteer List")) {
                    // Name searching query for "Student List"
                    searchQuery = "SELECT Serial, Name, ID, CGPA, Semester, Dept FROM `student` WHERE Name LIKE ";
                } else {
                    // Name searching query for "Volunteer List"
                    searchQuery = "SELECT ID, Name, `Time Slot` FROM `volunteer` WHERE Name LIKE ";
                }
            } else if (idrb.isSelected()) {
                // If searched through "ID"
                if (listtype.getText().equals("Volunteer List")) {
                    // ID searching query for "Student List"
                    searchQuery = "SELECT Serial, Name, ID, CGPA, Semester, Dept FROM `student` WHERE ID LIKE ";
                } else {
                    // ID searching query for "Volunteer List"
                    searchQuery = "SELECT ID, Name, `Time Slot` FROM `volunteer` WHERE ID LIKE ";
                }
            } else {
                // Reaches if no search mode is selected, sets Name search by default
                String text = search.getText();
                searchMouseClicked(new MouseEvent(search, MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 0, 50,
                        50, 1, false)); // Sets Name search by default upon click on search textfield creating programatical click on "Name" button 
                search.setText(text);

                if (listtype.getText().equals("Volunteer List")) {
                    // Name searching query for "Student List"
                    searchQuery = "SELECT Serial, Name, ID, CGPA, Semester, Dept FROM `student` WHERE Name LIKE ";
                } else {
                    // Name searching query for "Volunteer List"
                    searchQuery = "SELECT ID, Name, `Time Slot` FROM `volunteer` WHERE Name LIKE ";
                }
            }

            if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && search.getText().isEmpty()) {
                // The following section is executed only if the KeyCode is BACK_SPACE and the textfield is empty
                if (listtype.getText().equals("Volunteer List")) {
                    // Query for displaying from "Student List"
                    searchQuery = "SELECT Serial, Name, ID, CGPA, Semester, Dept FROM `student`";
                } else {
                    // Query for displaying from "Volunteer List"
                    searchQuery = "SELECT ID, Name, `Time Slot` FROM `volunteer`";
                }
            } else {
                // If the KeyCode is not BACK_SPACE the "searchQuery" is appended with the search text
                searchQuery += "'%" + search.getText() + "%'";
            }

            // The table is then generated and displayed using the "setModel(TableModel)" method
            table.setModel(customStudentTableModel(searchQuery));
        }
    }// GEN-LAST:event_searchKeyReleased

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_searchMouseClicked
        if (!(serialrb.isSelected() || namerb.isSelected() || idrb.isSelected())) {
            // Setting Name search as default search mode
            namerb.doClick();
        }
    }// GEN-LAST:event_searchMouseClicked

    private void serialrbActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_serialrbActionPerformed
        search.setText(null);
        search.requestFocus();
    }// GEN-LAST:event_serialrbActionPerformed

    private void namerbActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_namerbActionPerformed
        search.setText(null);
        search.requestFocus();
    }// GEN-LAST:event_namerbActionPerformed

    private void idrbActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_idrbActionPerformed
        search.setText(null);
        search.requestFocus();
    }// GEN-LAST:event_idrbActionPerformed

    /**
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TableManager().setVisible(true); // Initializing and displaying the JFrame
        });
    }

    private DefaultTableModel customStudentTableModel(String query) {
        // Generating table and returning the table model 
        DataManager datamanager = new DataManager();

        try {
            // Fetching the data from the database depending on "query" type
            datamanager.getData(query);
            ResultSetMetaData rsetmetadata = DataManager.rset.getMetaData(); // Collecting ResultSet metadata

            int columns = rsetmetadata.getColumnCount(); // Column count
            DataManager.rset.last(); // Moving the cursor to the last row of ResultSet
            int rows = DataManager.rset.getRow(); // Row count
            DataManager.rset.beforeFirst(); // Moving the cursor before the first row of ResultSet

            Object[][] data = new Object[rows][columns]; // 2D matrix object
            Object[] columnNames = new Object[columns];

            // Get column names
            for (int i = 0; i < columns; i++) {
                columnNames[i] = rsetmetadata.getColumnName(i + 1);
            }

            // Get row data
            for (int i = 0; DataManager.rset.next(); i++) {
                Object[] cell = new Object[columns]; // Initializing a single row in size of "columns"
                for (int j = 0; j < columns; j++) {
                    cell[j] = DataManager.rset.getObject(j + 1);
                    data[i][j] = cell[j]; // Storing row data in the 2D matrix
                }
            }

            tableModel = new DefaultTableModel(data, columnNames); // Generading table model
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", 2);
        } finally {
            // Closing connection
            datamanager.close();
        }

        // returning table model
        return tableModel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton delete;
    private javax.swing.JLabel designation;
    private javax.swing.JLabel displayname;
    private javax.swing.JRadioButton idrb;
    private javax.swing.JButton listtype;
    private javax.swing.JButton logout;
    private javax.swing.JRadioButton namerb;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField search;
    private javax.swing.JLabel searchlabel;
    private javax.swing.JRadioButton serialrb;
    private javax.swing.JTable table;
    private javax.swing.JPanel upperpanel;
    // End of variables declaration//GEN-END:variables
    // Custom variables declaration - do not modify
    private String searchQuery;
    private DefaultTableModel tableModel;
    // End of custom variables declaration
}