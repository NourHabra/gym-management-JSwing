public class ViewClientInfoForm extends javax.swing.JFrame {
    
    public ViewClientInfoForm(Stakeholder cl) {
        initComponents();
        
        //Type casting because we will only read info
        Client client = (Client) cl;
        
        nameLabel.setText(nameLabel.getText() + client.firstName + " " + client.lastName);
        genderLabel.setText(genderLabel.getText() + client.gender);
        weightLabel.setText(weightLabel.getText() + client.weight);
        heightLabel.setText(heightLabel.getText() + client.height);
        typeLabel.setText(typeLabel.getText() + client.subscriptionType);
        cardLabel.setText(cardLabel.getText() + client.card.getDetails());
        totalLabel.setText(totalLabel.getText() + client.total);
        
        String[] subbed = new String[client.sports.size()];
        int i = 0;
        for (Sport sp:client.sports){
            subbed[i] = sp.getDetails();
            i++;
        }
        subscribedJList.setListData(subbed);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        validateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        cardLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        subscribedJList = new javax.swing.JList<>();
        totalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        validateButton.setBackground(new java.awt.Color(255, 255, 255));
        validateButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        validateButton.setForeground(new java.awt.Color(0, 0, 0));
        validateButton.setText("Dismiss");
        validateButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        validateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateButtonPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Client Info");

        nameLabel.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Name: ");

        genderLabel.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(0, 0, 0));
        genderLabel.setText("Gender: ");

        weightLabel.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        weightLabel.setForeground(new java.awt.Color(0, 0, 0));
        weightLabel.setText("Weight: ");

        heightLabel.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        heightLabel.setForeground(new java.awt.Color(0, 0, 0));
        heightLabel.setText("Height: ");

        cardLabel.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        cardLabel.setForeground(new java.awt.Color(0, 0, 0));
        cardLabel.setText("Card: ");

        typeLabel.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(0, 0, 0));
        typeLabel.setText("Sub. Type: ");

        subscribedJList.setBackground(new java.awt.Color(255, 255, 255));
        subscribedJList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        subscribedJList.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        subscribedJList.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(subscribedJList);

        totalLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalLabel.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalLabel.setText("Monthly Payment: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cardLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(weightLabel))
                                .addGap(205, 205, 205)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(heightLabel)
                                    .addComponent(genderLabel)))
                            .addComponent(typeLabel)
                            .addComponent(totalLabel))
                        .addGap(0, 227, Short.MAX_VALUE))
                    .addComponent(validateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(genderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heightLabel)
                    .addComponent(weightLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validateButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateButtonPressed
        this.dispose();
    }//GEN-LAST:event_validateButtonPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JList<String> subscribedJList;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JButton validateButton;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
