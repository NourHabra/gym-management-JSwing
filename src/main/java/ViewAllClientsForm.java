
import java.util.ArrayList;
import java.util.List;

public class ViewAllClientsForm extends javax.swing.JFrame {
    
    Stakeholder selectedClient = null;
    
    public ViewAllClientsForm() {
        initComponents();
        
        //collect employees and add them to a list
        //do as usual lol
        List<Client> clients = new ArrayList<Client>();
        
        for (Stakeholder st:Stakeholder.stakeholders){
            if (st.type.equals("Client")){
                Client cl = (Client) st;
                clients.add(cl);
            }
        }
        
        //getting client names only
        String[] clientNames = new String[clients.size()];
        int i = 0;
        for (Client cl:clients){
            clientNames[i] = (cl.firstName + " " + cl.lastName);
            i++;
        }
        clientsJList.setListData(clientNames);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        sportsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clientsJList = new javax.swing.JList<>();
        detailsButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        sportsButton.setBackground(new java.awt.Color(255, 255, 255));
        sportsButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        sportsButton.setForeground(new java.awt.Color(0, 0, 0));
        sportsButton.setText("Manage Sports");
        sportsButton.setToolTipText("");
        sportsButton.setActionCommand("");
        sportsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        sportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsButtonPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Clients");

        clientsJList.setBackground(new java.awt.Color(255, 255, 255));
        clientsJList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clientsJList.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        clientsJList.setForeground(new java.awt.Color(0, 0, 0));
        clientsJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        detailsButton.setBackground(new java.awt.Color(255, 255, 255));
        detailsButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        detailsButton.setForeground(new java.awt.Color(0, 0, 0));
        detailsButton.setText("Details");
        detailsButton.setToolTipText("");
        detailsButton.setActionCommand("");
        detailsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        detailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsButtonPressed(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(255, 255, 255));
        AddButton.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        AddButton.setForeground(new java.awt.Color(0, 0, 0));
        AddButton.setText("Add New");
        AddButton.setBorder(null);
        AddButton.setBorderPainted(false);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(detailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(sportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(clientsJList, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(68, Short.MAX_VALUE)
                    .addComponent(clientsJList, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sportsButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsButtonPressed
        String clientName = clientsJList.getSelectedValue();
        if (clientName != null){
            selectedClient = Stakeholder.searchByName(clientName);
            new AddSportForm(selectedClient).setVisible(true);
        }
    }//GEN-LAST:event_sportsButtonPressed

    private void detailsButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsButtonPressed
        String clientName = clientsJList.getSelectedValue();
        if (clientName != null){
            selectedClient = Stakeholder.searchByName(clientName);
            new ViewClientInfoForm(selectedClient).setVisible(true);
        }
    }//GEN-LAST:event_detailsButtonPressed

    private void addButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonPressed
        new NewClientForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addButtonPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JList<String> clientsJList;
    private javax.swing.JButton detailsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton removeButton1;
    private javax.swing.JButton removeButton2;
    private javax.swing.JButton sportsButton;
    // End of variables declaration//GEN-END:variables
}
