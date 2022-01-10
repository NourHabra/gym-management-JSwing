public class DashboardForm extends javax.swing.JFrame {
    
    public DashboardForm() {
        initComponents();
    }   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        sportsButton = new javax.swing.JButton();
        employeesButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        viewallclientsButton = new javax.swing.JButton();
        viewallsportsButton = new javax.swing.JButton();
        newclientButton = new javax.swing.JButton();
        clientButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Dashboard");
        jLabel1.setToolTipText("");

        loginButton.setBackground(new java.awt.Color(255, 153, 153));
        loginButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Log out");
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonPressed(evt);
            }
        });

        sportsButton.setBackground(new java.awt.Color(255, 255, 255));
        sportsButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        sportsButton.setForeground(new java.awt.Color(0, 0, 0));
        sportsButton.setText("New Sport");
        sportsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        sportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsButtonClicked(evt);
            }
        });

        employeesButton.setBackground(new java.awt.Color(255, 255, 255));
        employeesButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        employeesButton.setForeground(new java.awt.Color(0, 0, 0));
        employeesButton.setText("Employees");
        employeesButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        employeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesButtonPressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        viewallclientsButton.setBackground(new java.awt.Color(255, 255, 255));
        viewallclientsButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        viewallclientsButton.setForeground(new java.awt.Color(0, 0, 0));
        viewallclientsButton.setText("View All Clients");
        viewallclientsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        viewallclientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallclientsButtonPressed(evt);
            }
        });

        viewallsportsButton.setBackground(new java.awt.Color(255, 255, 255));
        viewallsportsButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        viewallsportsButton.setForeground(new java.awt.Color(0, 0, 0));
        viewallsportsButton.setText("View All Sports");
        viewallsportsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        viewallsportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallsportsButtonClicked(evt);
            }
        });

        newclientButton.setBackground(new java.awt.Color(255, 255, 255));
        newclientButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        newclientButton.setForeground(new java.awt.Color(0, 0, 0));
        newclientButton.setText("New Client");
        newclientButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        newclientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newclientButtonPressed(evt);
            }
        });

        clientButton.setBackground(new java.awt.Color(255, 255, 255));
        clientButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        clientButton.setForeground(new java.awt.Color(0, 0, 0));
        clientButton.setText("Existing Client");
        clientButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        clientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButtonPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viewallsportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(sportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(newclientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(viewallclientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(employeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(clientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newclientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewallclientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewallsportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void logoutButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonPressed
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonPressed

    private void sportsButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsButtonClicked
        new SportsForm().setVisible(true);
    }//GEN-LAST:event_sportsButtonClicked

    private void clientButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButtonPressed
        new CardValidationForm().setVisible(true);
    }//GEN-LAST:event_clientButtonPressed

    private void employeesButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesButtonPressed
        new ViewAllEmployeesForm().setVisible(true);
    }//GEN-LAST:event_employeesButtonPressed

    private void viewallclientsButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallclientsButtonPressed
        new ViewAllClientsForm().setVisible(true);
    }//GEN-LAST:event_viewallclientsButtonPressed

    private void newclientButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newclientButtonPressed
        new NewClientForm().setVisible(true);
    }//GEN-LAST:event_newclientButtonPressed

    private void viewallsportsButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallsportsButtonClicked
        new ViewAllSportsForm().setVisible(true);
    }//GEN-LAST:event_viewallsportsButtonClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientButton;
    private javax.swing.JButton employeesButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton newclientButton;
    private javax.swing.JButton sportsButton;
    private javax.swing.JButton viewallclientsButton;
    private javax.swing.JButton viewallsportsButton;
    // End of variables declaration//GEN-END:variables
}
