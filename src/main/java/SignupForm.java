public class SignupForm extends javax.swing.JFrame {


    public SignupForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstnameField = new javax.swing.JTextField();
        lastnameField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        mobileField = new javax.swing.JTextField();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputWarning = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sign up");

        firstnameField.setBackground(new java.awt.Color(255, 255, 255));
        firstnameField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        firstnameField.setForeground(new java.awt.Color(0, 0, 0));
        firstnameField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "First name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        firstnameField.setCaretColor(new java.awt.Color(0, 0, 0));
        firstnameField.setNextFocusableComponent(lastnameField);

        lastnameField.setBackground(new java.awt.Color(255, 255, 255));
        lastnameField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lastnameField.setForeground(new java.awt.Color(0, 0, 0));
        lastnameField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Last name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        lastnameField.setNextFocusableComponent(mobileField);

        loginButton.setBackground(new java.awt.Color(204, 204, 255));
        loginButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Log in");
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonPressed(evt);
            }
        });

        signupButton.setBackground(new java.awt.Color(255, 255, 255));
        signupButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(0, 0, 0));
        signupButton.setText("Sign up");
        signupButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonPressed(evt);
            }
        });

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(0, 0, 0));
        usernameField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        usernameField.setNextFocusableComponent(passwordField);

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 0, 0));
        passwordField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        passwordField.setNextFocusableComponent(signupButton);

        mobileField.setBackground(new java.awt.Color(255, 255, 255));
        mobileField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        mobileField.setForeground(new java.awt.Color(0, 0, 0));
        mobileField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Mobile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        mobileField.setNextFocusableComponent(maleRadioButton);

        maleRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        maleRadioButton.setText("Male");
        maleRadioButton.setNextFocusableComponent(femaleRadioButton);

        femaleRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        femaleRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        femaleRadioButton.setText("Female");
        femaleRadioButton.setNextFocusableComponent(usernameField);

        inputWarning.setEditable(false);
        inputWarning.setBackground(new java.awt.Color(255, 255, 255));
        inputWarning.setColumns(20);
        inputWarning.setForeground(new java.awt.Color(0, 0, 0));
        inputWarning.setLineWrap(true);
        inputWarning.setRows(5);
        inputWarning.setWrapStyleWord(true);
        inputWarning.setBorder(null);
        jScrollPane1.setViewportView(inputWarning);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstnameField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lastnameField)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 9, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonPressed
        //get info
        String firstName = firstnameField.getText();
        String lastName = lastnameField.getText();
        String mobile = mobileField.getText();
        String gender = maleRadioButton.getText();
        if (femaleRadioButton.isSelected()) {
            gender = femaleRadioButton.getText();}
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        //validate info
        boolean valid = true;
        
        //First name
        boolean space = false;
        boolean number = false;
        if (firstName.isEmpty()){
            valid = false;
            inputWarning.setText("First name cannot be empty");}
        else{
            for (int i = 0; i < firstName.length(); i++){
                if (firstName.charAt(i) == ' '){
                    space = true;
                }
                if (Character.isDigit(firstName.charAt(i))){
                    number = true;
                }
            }
            if (space || number){
                valid = false;
                inputWarning.setText("First name cannot contain numbers or spaces");
            }
            else{
                inputWarning.setText("");
            }
        }
        
        //Last Name
        space = false;
        number = false;
        if (lastName.isEmpty()){
            valid = false;
            inputWarning.setText("Last name cannot be empty");}
        else{
            for (int i = 0; i < lastName.length(); i++){
                if (lastName.charAt(i) == ' '){
                    space = true;
                }
                if (Character.isDigit(lastName.charAt(i))){
                    number = true;
                }
            }
            if (space || number){
                valid = false;
                inputWarning.setText("Last name cannot contain numbers or spaces");
            }
        }
        
        //Mobile
        space = false;
        boolean letter = false;
        if (mobile.isEmpty()){
            valid = false;
            inputWarning.setText("Mobile cannot be empty");}
        else if (mobile.length() != 10){
            valid = false;
            inputWarning.setText("Mobile should be 10 digits");}
        else if (mobile.length() == 10){
            if (mobile.charAt(0) != '0' || mobile.charAt(1) != '9'){
                valid = false;
                inputWarning.setText("Mobile should start with 09...");
            }
            else{
                for (int i = 2; i < mobile.length(); i++){
                    if (mobile.charAt(i) == ' '){
                        space = true;
                        break;
                    }
                    if (!Character.isDigit(mobile.charAt(i))){
                        letter = true;
                        break;
                    }
                }
                if (space || letter){
                    valid = false;
                    inputWarning.setText("Mobile cannot contain letters or spaces");
                }
            }
        }
        
        //Gender
        if (!maleRadioButton.isSelected() && !femaleRadioButton.isSelected()){
            valid = false;
            inputWarning.setText("Please choose your gender.");}
        
        //Username
        if (username.isEmpty()){
            valid = false;
            inputWarning.setText("Username cannot be empty");
        } else {
            for (int i = 0; i < username.length(); i++){
                    if (username.charAt(i) == ' '){
                        valid = false;
                        inputWarning.setText("Username cannot contain spaces");
                        break;
                    }
            }
        }
        
        //Password
        if (password.isEmpty()){
            valid = false;
            inputWarning.setText("Password cannot be empty");
        } else {
            for (int i = 0; i < password.length(); i++){
                    if (password.charAt(i) == ' '){
                        valid = false;
                        inputWarning.setText("Password cannot contain spaces");
                        break;
                    }
            }
        }
        
        if (valid){
            Stakeholder newEmployee = new Employee(firstName, lastName, gender, mobile, username, password);
            new LoginForm().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_signupButtonPressed

    private void loginButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonPressed
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginButtonPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JTextField firstnameField;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JTextArea inputWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JButton loginButton;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField mobileField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
