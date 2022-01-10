
import java.util.ArrayList;
import java.util.List;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        usernameWarning = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        usernameWarning.setBackground(new java.awt.Color(255, 0, 0));
        usernameWarning.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        usernameWarning.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Log in");

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(0, 0, 0));
        usernameField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        loginButton.setBackground(new java.awt.Color(204, 204, 255));
        loginButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Log in");
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonClicked(evt);
            }
        });

        signupButton.setBackground(new java.awt.Color(255, 255, 255));
        signupButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(0, 0, 0));
        signupButton.setText("Sign up");
        signupButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonClicked(evt);
            }
        });

        jPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPasswordField.setCaretColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonClicked
        new SignupForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupButtonClicked

    private void loginButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonClicked
        String user = usernameField.getText();
        String pass = jPasswordField.getText();
        //jPasswordField.
        boolean validUser = true;
        for (int i = 0; i < user.length(); i++){
            if (user.charAt(i) == ' '){
                validUser = false;
                break;
            }
        }
        
        boolean validPass = true;
        for (int i = 0; i < pass.length(); i++){
            if (pass.charAt(i) == ' '){
                validPass = false;
                break;
            }
        }
        
        if (!validUser) {
            usernameWarning.setText("Username cannot contain spaces");
        }
        else if (!validPass){
            usernameWarning.setText("Password cannot contain spaces");
        }
        
        // Validate username and password
        boolean valid = false;
        if (validUser && validPass){
            //collect employees and add them to a list
            //do as usual lol
            List<Employee> employees = new ArrayList<Employee>();
        
            for (Stakeholder st:Stakeholder.stakeholders){
                if (st.type.equals("Employee")){
                    Employee emp = (Employee) st;
                    employees.add(emp);
                }
            }
        
            for (Employee employee : employees) {
                if (employee.username.equals(user) && employee.password.equals(pass)) {
                    valid = true;
                }
            }
        
            if (valid) {
                System.out.println(user + " Logged in");
                new DashboardForm().setVisible(true);
                this.dispose();
            }
            else if (!valid) {
                usernameWarning.setText("Invalid username/password");
            }
        }
        
        
    }//GEN-LAST:event_loginButtonClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameWarning;
    // End of variables declaration//GEN-END:variables
}
