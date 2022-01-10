public class ViewAllSportsForm extends javax.swing.JFrame {

    
    public ViewAllSportsForm() {
        initComponents();
        
        String[] sportsinfo = new String[Sport.sports.size()];
        int i = 0;
        for (Sport sp: Sport.sports){
            sportsinfo[i] = sp.getInfo();
            i++;
        }
        sportsJList.setListData(sportsinfo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sportsJList = new javax.swing.JList<>();
        detailsButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        roomLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        coachLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        placesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(975, 482));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sports");

        sportsJList.setBackground(new java.awt.Color(255, 255, 255));
        sportsJList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        sportsJList.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        sportsJList.setForeground(new java.awt.Color(0, 0, 0));
        sportsJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        sportsJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                sportClicked(evt);
            }
        });

        detailsButton.setBackground(new java.awt.Color(255, 204, 204));
        detailsButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        detailsButton.setForeground(new java.awt.Color(0, 0, 0));
        detailsButton.setText("Dismiss");
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
                AddButtonaddButtonPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Name: ");

        idLabel.setBackground(new java.awt.Color(255, 255, 255));
        idLabel.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setText("ID: ");

        roomLabel.setBackground(new java.awt.Color(255, 255, 255));
        roomLabel.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        roomLabel.setForeground(new java.awt.Color(0, 0, 0));
        roomLabel.setText("Room: ");

        timeLabel.setBackground(new java.awt.Color(255, 255, 255));
        timeLabel.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(0, 0, 0));
        timeLabel.setText("Time: ");

        coachLabel.setBackground(new java.awt.Color(255, 255, 255));
        coachLabel.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        coachLabel.setForeground(new java.awt.Color(0, 0, 0));
        coachLabel.setText("Coach: ");

        priceLabel.setBackground(new java.awt.Color(255, 255, 255));
        priceLabel.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(0, 0, 0));
        priceLabel.setText("Price: ");

        placesLabel.setBackground(new java.awt.Color(255, 255, 255));
        placesLabel.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        placesLabel.setForeground(new java.awt.Color(0, 0, 0));
        placesLabel.setText("Available Places: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(placesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(roomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addComponent(coachLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(priceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(9, 9, 9)))
                        .addGap(158, 158, 158))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomLabel)
                    .addComponent(timeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coachLabel)
                    .addComponent(priceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placesLabel)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sportsJList, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(AddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sportsJList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detailsButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsButtonPressed
        this.dispose();
    }//GEN-LAST:event_detailsButtonPressed

    private void AddButtonaddButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonaddButtonPressed
        new SportsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddButtonaddButtonPressed

    private void sportClicked(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_sportClicked
        String sportName = sportsJList.getSelectedValue();
        Sport selectedSport = Sport.searchByInfo(sportName);
        idLabel.setText("ID: " + selectedSport.id);
        nameLabel.setText("Name: " + selectedSport.name);
        roomLabel.setText("Room: " + selectedSport.room);
        timeLabel.setText("Time: " + selectedSport.time);
        coachLabel.setText("Coach: " + selectedSport.coach);
        priceLabel.setText("Price: " + selectedSport.price);
        placesLabel.setText("Available Places: " + selectedSport.availablePlaces);
        
    }//GEN-LAST:event_sportClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel coachLabel;
    private javax.swing.JButton detailsButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel placesLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JList<String> sportsJList;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
