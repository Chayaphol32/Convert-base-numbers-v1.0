
public class Led extends javax.swing.JPanel {

    public Led() {
        initComponents();
        inputText.setText("0");
    }
    boolean a = true;
    String b = "";
    int z = 0;

    public void onoff() {
        if (a == true) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LEDpng/R.png")));
            a = !a;
            inputText.setText("1");
        } else {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LEDpng/T.png")));
            a = !a;
            inputText.setText("0");
        }

    }

    public int[] getnum() {
        z = Integer.parseInt(b);
        int[] zz = {z};
        return zz;
    }

    public void Tow1(String val) {
        if ("+".equals(val)) {
            b = "0";
        } else {
            b = val;
        }
        inputText.setText(b);
        inputnumber();
    }

    public void inputnumber() {
        b = inputText.getText();
        if (b.equals("")) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LEDpng/T.png")));

        } else if (b.equals("1")) {
            a = false;
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LEDpng/R.png")));

        } else if (b.equals("0")) {
            a = true;
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LEDpng/T.png")));
        }

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputText = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LEDpng/T.png"))); // NOI18N

        inputText.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                inputTextCaretUpdate(evt);
            }
        });
        inputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextActionPerformed(evt);
            }
        });

        jToggleButton1.setText("on/off");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jToggleButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextActionPerformed

    }//GEN-LAST:event_inputTextActionPerformed

    private void inputTextCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_inputTextCaretUpdate
        inputnumber();
    }//GEN-LAST:event_inputTextCaretUpdate

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        onoff();
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
