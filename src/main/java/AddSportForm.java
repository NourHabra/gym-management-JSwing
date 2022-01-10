 import java.util.*;
public class AddSportForm extends javax.swing.JFrame {
    
    //global variable to access in event listeners
    Stakeholder currClient = null;
    
    public AddSportForm(Stakeholder client) {
        initComponents();
        nameField.setText(client.firstName + " " + client.lastName);
        currClient = client;
        String[] subbed = new String[client.getSports().size()];
        int i = 0;
        for (Sport sp:client.getSports()){
            subbed[i] = sp.name;
            i++;
        }
        subscribedJList.setListData(subbed);
        
        List<Sport> available = new ArrayList<Sport>();
        for (Sport sp:Sport.sports){
            if (sp.availablePlaces > 0 && !client.getSports().contains(sp)){
                available.add(sp);
            }
        }
        
        String[] avail = new String[available.size()];
        int j = 0;
        for (Sport sp:available){
            if (sp.availablePlaces > 0 && !client.getSports().contains(sp)){
                avail[j] = sp.name;
                j++;
            }
        }
        availableJList.setListData(avail);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        subscribedJList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        availableJList = new javax.swing.JList<>();
        inputWarning = new javax.swing.JTextArea();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Subscribe to new sport");

        nameField.setEditable(false);
        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(0, 0, 0));
        nameField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Client Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        nameField.setCaretColor(new java.awt.Color(0, 0, 0));

        addButton.setBackground(new java.awt.Color(255, 255, 255));
        addButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 0, 0));
        addButton.setText("Add");
        addButton.setToolTipText("");
        addButton.setActionCommand("");
        addButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonPressed(evt);
            }
        });

        subscribedJList.setBackground(new java.awt.Color(255, 255, 255));
        subscribedJList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        subscribedJList.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        subscribedJList.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(subscribedJList);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Client's Sports:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Available Sports:");

        availableJList.setBackground(new java.awt.Color(255, 255, 255));
        availableJList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        availableJList.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        availableJList.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(availableJList);

        inputWarning.setEditable(false);
        inputWarning.setBackground(new java.awt.Color(255, 255, 255));
        inputWarning.setColumns(20);
        inputWarning.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        inputWarning.setForeground(new java.awt.Color(0, 0, 0));
        inputWarning.setLineWrap(true);
        inputWarning.setRows(5);
        inputWarning.setWrapStyleWord(true);
        inputWarning.setBorder(null);

        removeButton.setBackground(new java.awt.Color(255, 255, 255));
        removeButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        removeButton.setForeground(new java.awt.Color(0, 0, 0));
        removeButton.setText("Remove");
        removeButton.setToolTipText("");
        removeButton.setActionCommand("");
        removeButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputWarning)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonPressed
        if (availableJList.getSelectedValue() == null){
            inputWarning.setText("Please choose a sport to be added");
        } else if(availableJList.getSelectedValuesList().size() == 1){
            currClient.addSport(Sport.searchByName(availableJList.getSelectedValue()));
            this.dispose();
            new AddSportForm(currClient).setVisible(true);
        }
        else {
            List<String> selected = availableJList.getSelectedValuesList();
            for (String sp:selected){
                currClient.addSport(Sport.searchByName(sp));
            }
            this.dispose();
            new AddSportForm(currClient).setVisible(true);
        }
    }//GEN-LAST:event_addButtonPressed

    private void removeButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonPressed
        if (subscribedJList.getSelectedValue() == null){
            inputWarning.setText("Please choose a sport to be removed");
        } else if(subscribedJList.getSelectedValuesList().size() == 1){
            currClient.removeSport(Sport.searchByName(subscribedJList.getSelectedValue()));
            this.dispose();
            new AddSportForm(currClient).setVisible(true);
        }
        else {
            List<String> selected = subscribedJList.getSelectedValuesList();
            for (String sp:selected){
                currClient.removeSport(Sport.searchByName(sp));
            }
            this.dispose();
            new AddSportForm(currClient).setVisible(true);
        }
    }//GEN-LAST:event_removeButtonPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JList<String> availableJList;
    private javax.swing.JTextArea inputWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton removeButton;
    private javax.swing.JList<String> subscribedJList;
    // End of variables declaration//GEN-END:variables
}
