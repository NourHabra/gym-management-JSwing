import java.time.*;
import java.util.ArrayList;
import java.util.List;
public class CardValidationForm extends javax.swing.JFrame {

    public boolean isNumber(String str){
        boolean valid = true;
        boolean space = false;
        boolean letter = false;
        if (str.isEmpty()){
            valid = false;}
        else {
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == ' '){
                    valid = false;
                    break;
                }
                if (!Character.isDigit(str.charAt(i))){
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }
    
    Client currClient = null;
    
    public CardValidationForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numberField = new javax.swing.JTextField();
        validateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputWarning = new javax.swing.JTextArea();
        sDayField = new javax.swing.JTextField();
        sMonthField = new javax.swing.JTextField();
        sYearField = new javax.swing.JTextField();
        eDayField = new javax.swing.JTextField();
        eMonthField = new javax.swing.JTextField();
        eYearField = new javax.swing.JTextField();
        viewinfoButton = new javax.swing.JButton();
        addsportsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        numberField.setBackground(new java.awt.Color(255, 255, 255));
        numberField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        numberField.setForeground(new java.awt.Color(0, 0, 0));
        numberField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Card Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        numberField.setCaretColor(new java.awt.Color(0, 0, 0));

        validateButton.setBackground(new java.awt.Color(255, 255, 255));
        validateButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        validateButton.setForeground(new java.awt.Color(0, 0, 0));
        validateButton.setText("Validate");
        validateButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        validateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateButtonPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("End Date");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Card Validation");

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Start Date");

        inputWarning.setEditable(false);
        inputWarning.setBackground(new java.awt.Color(255, 255, 255));
        inputWarning.setColumns(20);
        inputWarning.setForeground(new java.awt.Color(0, 0, 0));
        inputWarning.setLineWrap(true);
        inputWarning.setRows(5);
        inputWarning.setWrapStyleWord(true);
        inputWarning.setBorder(null);

        sDayField.setBackground(new java.awt.Color(255, 255, 255));
        sDayField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        sDayField.setForeground(new java.awt.Color(0, 0, 0));
        sDayField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Day", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        sDayField.setCaretColor(new java.awt.Color(0, 0, 0));

        sMonthField.setBackground(new java.awt.Color(255, 255, 255));
        sMonthField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        sMonthField.setForeground(new java.awt.Color(0, 0, 0));
        sMonthField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Month", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        sMonthField.setCaretColor(new java.awt.Color(0, 0, 0));

        sYearField.setBackground(new java.awt.Color(255, 255, 255));
        sYearField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        sYearField.setForeground(new java.awt.Color(0, 0, 0));
        sYearField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        sYearField.setCaretColor(new java.awt.Color(0, 0, 0));

        eDayField.setBackground(new java.awt.Color(255, 255, 255));
        eDayField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        eDayField.setForeground(new java.awt.Color(0, 0, 0));
        eDayField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Day", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        eDayField.setCaretColor(new java.awt.Color(0, 0, 0));

        eMonthField.setBackground(new java.awt.Color(255, 255, 255));
        eMonthField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        eMonthField.setForeground(new java.awt.Color(0, 0, 0));
        eMonthField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Month", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        eMonthField.setCaretColor(new java.awt.Color(0, 0, 0));

        eYearField.setBackground(new java.awt.Color(255, 255, 255));
        eYearField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        eYearField.setForeground(new java.awt.Color(0, 0, 0));
        eYearField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        eYearField.setCaretColor(new java.awt.Color(0, 0, 0));

        viewinfoButton.setBackground(new java.awt.Color(255, 255, 255));
        viewinfoButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        viewinfoButton.setForeground(new java.awt.Color(0, 0, 0));
        viewinfoButton.setText("View Info");
        viewinfoButton.setActionCommand("");
        viewinfoButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        viewinfoButton.setEnabled(false);
        viewinfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewinfoButtonvalidateButtonPressed(evt);
            }
        });

        addsportsButton.setBackground(new java.awt.Color(255, 255, 255));
        addsportsButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        addsportsButton.setForeground(new java.awt.Color(0, 0, 0));
        addsportsButton.setText("Add Sports");
        addsportsButton.setActionCommand("");
        addsportsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        addsportsButton.setEnabled(false);
        addsportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsportsButtonPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputWarning)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(167, 167, 167)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(sDayField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(eDayField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(validateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewinfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addsportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sDayField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eDayField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewinfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addsportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validateButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateButtonPressed
        String number = numberField.getText();

        boolean validNumber = true;
        //Mobile
        boolean space = false;
        boolean letter = false;
        if (number.isEmpty()){
            validNumber = false;
            inputWarning.setText("Card number cannot be empty");}
        else if (number.length() != 10){
            validNumber = false;
            inputWarning.setText("Card number should be 10 digits");}
        else if (number.length() == 10){
            for (int i = 0; i < number.length(); i++){
                if (number.charAt(i) == ' '){
                    space = true;
                    break;
                }
                if (!Character.isDigit(number.charAt(i))){
                    letter = true;
                    break;
                }
            }
            if (space || letter){
                validNumber = false;
                inputWarning.setText("Card number cannot contain letters or spaces");
            }
        }
        int cardNumber = Integer.parseInt(number);
        
        String sDay = sDayField.getText();
        String sMonth = sMonthField.getText();
        String sYear = sYearField.getText();
        String eDay = eDayField.getText();
        String eMonth = eMonthField.getText();
        String eYear = eYearField.getText();
        
        String[] dates = {sDay, sMonth, sYear, eDay, eMonth, eYear};
        
        boolean validDateNumbers = true;
        for (String dt:dates){
            if (!isNumber(dt)){
                validDateNumbers = false;
                break;
            }
        }
        
        int startDay = 0;
        int startMonth = 0;
        int startYear = 0;
        int endDay = 0;
        int endMonth = 0;
        int endYear = 0;
        
        boolean validDate = true;
        if (!validDateNumbers){
            validDate = false;
            inputWarning.setText("Please enter a valid date");
        } else if (validDateNumbers){
            startDay = Integer.parseInt(sDay);
            startMonth = Integer.parseInt(sMonth);
            startYear = Integer.parseInt(sYear);
            endDay = Integer.parseInt(eDay);
            endMonth = Integer.parseInt(eMonth);
            endYear = Integer.parseInt(eYear);
            
            LocalDate currentdate = LocalDate.now();
            int currentDay = currentdate.getDayOfMonth();
            int currentMonth = currentdate.getMonthValue();
            int currentYear = currentdate.getYear();
            
            if ((startDay > 31 || startDay < 1) || (endDay > 31 || endDay < 1)){
                validDate = false;
                inputWarning.setText("Day is invalid");
            }
            else if ((startMonth > 12 || startMonth < 1) || (endMonth > 12 || endMonth < 1)){
                validDate = false;
                inputWarning.setText("Month is invalid");
            }
            //our amazing gym opened in 2015
            else if ((startYear > 2023 || startYear < 2015) || (endYear > 2023 || endYear < 2015)){
                validDate = false;
                inputWarning.setText("Year is invalid");
            }
            else if (endYear < currentYear){inputWarning.setText("Card is Expired");}
            else if (endYear == currentYear && endMonth < currentMonth){inputWarning.setText("Card is Expired");}
            else if (endYear == currentYear && endMonth == currentMonth && endDay < currentDay){inputWarning.setText("Card is Expired");}
        }
            
        if (validNumber && validDate){
            int[] startDate = {startDay, startMonth, startYear};
            int[] endDate = {endDay, endMonth, endYear};
            boolean found = false;
            
            List<Client> clients = new ArrayList<Client>();
        
        for (Stakeholder st:Stakeholder.stakeholders){
            if (st.type.equals("Client")){
                Client cl = (Client) st;
                clients.add(cl);
            }
        }
            
            for (Client cl:clients){
                if (cardNumber == cl.card.number){
                    inputWarning.setText("Card number found");
                    found = true;
                    boolean day = (startDate[0] == cl.card.startDate[0]) && (endDate[0] == cl.card.endDate[0]);
                    boolean month = (startDate[1] == cl.card.startDate[1]) && (endDate[1] == cl.card.endDate[1]);
                    boolean year = (startDate[2] == cl.card.startDate[2]) && (endDate[2] == cl.card.endDate[2]);
                    if (day && month && year){
                        inputWarning.append("...valid");
                        currClient = cl;
                        viewinfoButton.setEnabled(true);
                        addsportsButton.setEnabled(true);
                        validateButton.setEnabled(false);
                        break;
                    } else {inputWarning.setText("dates do not match");}
                }
            }
            if (!found){
                inputWarning.setText("Card not found");
            }
        }
        
        
    }//GEN-LAST:event_validateButtonPressed

    private void viewinfoButtonvalidateButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewinfoButtonvalidateButtonPressed
        new ViewClientInfoForm(currClient).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewinfoButtonvalidateButtonPressed

    private void addsportsButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsportsButtonPressed
        new AddSportForm(currClient).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addsportsButtonPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addsportsButton;
    private javax.swing.JTextField eDayField;
    private javax.swing.JTextField eMonthField;
    private javax.swing.JTextField eYearField;
    private javax.swing.JTextArea inputWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numberField;
    private javax.swing.JTextField sDayField;
    private javax.swing.JTextField sMonthField;
    private javax.swing.JTextField sYearField;
    private javax.swing.JButton validateButton;
    private javax.swing.JButton viewinfoButton;
    // End of variables declaration//GEN-END:variables
}
