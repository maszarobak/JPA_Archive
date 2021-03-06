/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archiwum.frontend;

import archiwum.backend.BazaDanych;
import archiwum.backend.Pracownik;
import java.util.List;



/**
 *
 * @author annac
 */
public class EdytujPracownikFrame extends javax.swing.JFrame {

    /**
     * Creates new form EdytujPracownikFrame
     */
    public EdytujPracownikFrame() {
        initComponents();
        db = new BazaDanych();
        counter = 0;
        listaPracownikow = db.pracownicy();
        bPoprzedni.setEnabled(false);
        wyswietl(counter);
    }
    
    private void wyswietl(int counter){
         listaPracownikow = db.pracownicy();
         this.p = listaPracownikow.get(counter);
         tImie.setText(p.getImie());
         tNazwisko.setText(p.getNazwisko());
         tPesel.setText(p.getPesel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tImie = new javax.swing.JTextField();
        tNazwisko = new javax.swing.JTextField();
        tPesel = new javax.swing.JTextField();
        bModyfikuj = new javax.swing.JButton();
        bPoprzedni = new javax.swing.JButton();
        bNastepny = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Archiwum osobowe");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Edytuj pracownika");

        jLabel3.setText("Imie");

        jLabel4.setText("Nazwisko");

        jLabel5.setText("Pesel");

        tImie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tImieActionPerformed(evt);
            }
        });

        tNazwisko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNazwiskoActionPerformed(evt);
            }
        });

        bModyfikuj.setText("Modyfikuj");
        bModyfikuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModyfikujActionPerformed(evt);
            }
        });

        bPoprzedni.setText("<");
        bPoprzedni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPoprzedniActionPerformed(evt);
            }
        });

        bNastepny.setText(">");
        bNastepny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNastepnyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tNazwisko, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tPesel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tImie, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(bPoprzedni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bNastepny)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bModyfikuj)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tImie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tPesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bModyfikuj)
                    .addComponent(bPoprzedni)
                    .addComponent(bNastepny))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tImieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tImieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tImieActionPerformed

    private void tNazwiskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNazwiskoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNazwiskoActionPerformed

    private void bPoprzedniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPoprzedniActionPerformed
        // TODO add your handling code here:
        if(counter>0){
            counter-=1;
            this.wyswietl(counter);
            if(counter==0) bPoprzedni.setEnabled(false);
            bNastepny.setEnabled(true);
        }
    }//GEN-LAST:event_bPoprzedniActionPerformed

    private void bModyfikujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModyfikujActionPerformed
        // TODO add your handling code here:
        
        db.edytuj(p.getIdpracownika(),tImie.getText(),tNazwisko.getText(),tPesel.getText());
        
    }//GEN-LAST:event_bModyfikujActionPerformed

    private void bNastepnyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNastepnyActionPerformed
        // TODO add your handling code here:
        if(counter+1<listaPracownikow.size()){
            counter+=1;
            this.wyswietl(counter);
            if(counter==listaPracownikow.size()-1) bNastepny.setEnabled(false);
            bPoprzedni.setEnabled(true);
        }
    }//GEN-LAST:event_bNastepnyActionPerformed

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
            java.util.logging.Logger.getLogger(EdytujPracownikFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdytujPracownikFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdytujPracownikFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdytujPracownikFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdytujPracownikFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bModyfikuj;
    private javax.swing.JButton bNastepny;
    private javax.swing.JButton bPoprzedni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tImie;
    private javax.swing.JTextField tNazwisko;
    private javax.swing.JTextField tPesel;
    // End of variables declaration//GEN-END:variables
    private BazaDanych db;
    private Pracownik p;
    List<Pracownik> listaPracownikow;
    int counter;
}
