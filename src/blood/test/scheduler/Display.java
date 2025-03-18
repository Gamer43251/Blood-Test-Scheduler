/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blood.test.scheduler;

/**
 *
 * @author Dreel
 */
public class Display extends javax.swing.JFrame {

    /**
     * Creates new form Display
     */
    public Display() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainBar = new javax.swing.JPanel();
        mainBarLayer = new javax.swing.JLayeredPane();
        tabLabel = new javax.swing.JLabel();
        patientsBTN = new javax.swing.JLabel();
        noShowBTN = new javax.swing.JLabel();
        cards = new javax.swing.JPanel();
        patientCard = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Hospital Of Jordan Blood Test Schedueler");
        setResizable(false);

        mainBar.setBackground(new java.awt.Color(255, 49, 49));
        mainBar.setMaximumSize(new java.awt.Dimension(1000, 150));
        mainBar.setMinimumSize(new java.awt.Dimension(1000, 150));

        mainBarLayer.setBackground(new java.awt.Color(255, 49, 49));
        mainBarLayer.setOpaque(true);

        tabLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tabLabel.setForeground(new java.awt.Color(0, 0, 0));
        tabLabel.setText("Patients");

        mainBarLayer.setLayer(tabLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainBarLayerLayout = new javax.swing.GroupLayout(mainBarLayer);
        mainBarLayer.setLayout(mainBarLayerLayout);
        mainBarLayerLayout.setHorizontalGroup(
            mainBarLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBarLayerLayout.createSequentialGroup()
                .addComponent(tabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 500, Short.MAX_VALUE))
        );
        mainBarLayerLayout.setVerticalGroup(
            mainBarLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        patientsBTN.setBackground(new java.awt.Color(255, 87, 87));
        patientsBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        patientsBTN.setForeground(new java.awt.Color(0, 0, 0));
        patientsBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientsBTN.setText("Patients");
        patientsBTN.setMaximumSize(new java.awt.Dimension(100, 50));
        patientsBTN.setMinimumSize(new java.awt.Dimension(100, 50));
        patientsBTN.setOpaque(true);
        patientsBTN.setPreferredSize(new java.awt.Dimension(100, 50));

        noShowBTN.setBackground(new java.awt.Color(255, 87, 87));
        noShowBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        noShowBTN.setForeground(new java.awt.Color(0, 0, 0));
        noShowBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noShowBTN.setText("No-Shows");
        noShowBTN.setMaximumSize(new java.awt.Dimension(100, 50));
        noShowBTN.setMinimumSize(new java.awt.Dimension(100, 50));
        noShowBTN.setOpaque(true);
        noShowBTN.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout mainBarLayout = new javax.swing.GroupLayout(mainBar);
        mainBar.setLayout(mainBarLayout);
        mainBarLayout.setHorizontalGroup(
            mainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBarLayer)
            .addGroup(mainBarLayout.createSequentialGroup()
                .addComponent(patientsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(noShowBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainBarLayout.setVerticalGroup(
            mainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBarLayout.createSequentialGroup()
                .addComponent(mainBarLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(mainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientsBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noShowBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cards.setMaximumSize(new java.awt.Dimension(1000, 600));
        cards.setMinimumSize(new java.awt.Dimension(1000, 600));
        cards.setPreferredSize(new java.awt.Dimension(1000, 600));
        cards.setLayout(new java.awt.CardLayout());

        patientCard.setBackground(new java.awt.Color(102, 102, 102));
        patientCard.setMaximumSize(new java.awt.Dimension(1000, 600));
        patientCard.setMinimumSize(new java.awt.Dimension(1000, 600));
        patientCard.setPreferredSize(new java.awt.Dimension(1000, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Priority", "GP ", "Age", "In Hospital"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout patientCardLayout = new javax.swing.GroupLayout(patientCard);
        patientCard.setLayout(patientCardLayout);
        patientCardLayout.setHorizontalGroup(
            patientCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientCardLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        patientCardLayout.setVerticalGroup(
            patientCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientCardLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        cards.add(patientCard, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(600, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(cards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cards;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainBar;
    private javax.swing.JLayeredPane mainBarLayer;
    private javax.swing.JLabel noShowBTN;
    private javax.swing.JPanel patientCard;
    private javax.swing.JLabel patientsBTN;
    private javax.swing.JLabel tabLabel;
    // End of variables declaration//GEN-END:variables
}
