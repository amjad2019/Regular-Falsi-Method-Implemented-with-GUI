/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.io.IOException;
import static java.lang.Math.pow;
import static java.lang.System.exit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
/**
 *
 * @author Bhagesh
 */
public class NewJFrame extends javax.swing.JFrame {

    int degree;
    double et;
    Scanner in = new Scanner(System.in);
    int iteration=1; 
    int i = degree;
    int j = degree;
    double[] constants;
    double result;
    double neg, pos;
    double f_of_a=0;
    double f_of_b=0;
    double a=0;
    double b=0;
    double c =0; 
    double f_of_c=0;
    double error;
     double wx=0;
        
    
    boolean neg_check = false, pos_check = false;
    public NewJFrame() {
        initComponents();   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        eq = new javax.swing.JLabel();
        upperRange = new javax.swing.JTextField();
        lowerRange = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        degreeInput = new javax.swing.JTextField();
        degreeInputCheck = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FALSE POSITION METHOD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jScrollPane1.setViewportView(jTextPane1);

        eq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eq.setText("Enter the degree of polynomial");

        lowerRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerRangeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Upper Range");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Lower Range");

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setText("Result");

        degreeInputCheck.setText("OK");
        degreeInputCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeInputCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eq, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lowerRange, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(upperRange, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(degreeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(degreeInputCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 23, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eq, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degreeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degreeInputCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowerRange, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(upperRange, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clear)
                            .addComponent(calculate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        int lower_range = Integer.parseInt(lowerRange.getText());
        int upper_range = Integer.parseInt(upperRange.getText());
        int k = 0;
        
        if (lower_range<upper_range)
        {
            for(int i = lower_range ; i <= upper_range ; i ++)
            {
                k=0;
                result = 0;
                for(int j = degree ; j > 0 ; j--)
                {
                    result = result+(constants[k]*(pow(i,j)));
                    k++;
                }
                result = result+constants[k];
                if(result<0)
                {
                    neg = i;
                    neg_check = true;
                    pos_check = false;
                }
                else if(result>=0)
                {
                    pos = i;
                    pos_check = true;
                }
                if(neg_check==true && pos_check == true)
                    break; }
        }
        a = neg;
        b = pos;
            Cons ob1 = new Cons();
            ob1.setA(neg);
            ob1.setB(pos);
            ob1.setF_of_a(f_of_a);
            ob1.setF_of_b(f_of_b);
            ob1.setC(c);
            ob1.setF_of_c(f_of_c);
            
            
            javax.swing.JOptionPane.showMessageDialog(null, "new interval are "+neg+" and "+pos);

        System.out.println("Enter the value of Error Tolerance (ET):");
        et=in.nextDouble();
           
        System.out.print("\n************************Regula Falsi Method**************************\n\n");
            System.out.printf("\t\ta\t\tb\t\t\tc\t\t\tf(a)\t\t\tf(b)\t\t\tf(c)\n");
            System.out.print("...............................................................................\n");

             int l = degree;
             int ja=degree;
             int jai=degree;
             double xo=b;
             double d, e;
             
//      **************************************************************             

            for(int h = 0 ; h < constants.length; h++)
            {
                f_of_a = f_of_a+(constants[h]*pow(a,l));
                l--;
            }
            
            for(int z = 0 ; z < constants.length; z++)
            {
                f_of_b = f_of_b+(constants[z]*pow(b,ja));
                ja--;
            }


            do{
                // ********** Formula of C *********
                d= (a)*(f_of_b)-(b)*(f_of_a);
                e=  (f_of_b)-(f_of_a);
                c=  d/e;
                System.out.println(c);   
                error = Math.abs((c - xo) / c) * 100;
 
           f_of_c=0;
                
            for(int ij = 0 ; ij < constants.length; ij++)
            {
                //f_of_c=0;
                
                f_of_c = f_of_c+(constants[ij]*pow(c,jai));
                jai--;
            }


           
             System.out.printf(iteration+"\t     %.5f\t   %.5f\t\t   %.5f\t\t    %.5f\t\t      %.5f\t\t    %.5f\t\t",a,b,c,f_of_a,f_of_b,f_of_c);
             System.out.println("\n");
            
            if ( f_of_a*f_of_c <0)
            {        b=c;
                     xo=c;
                     f_of_b=f_of_c;
                     
            }
            else{ a=c;
            xo=c;
            f_of_a=f_of_c;
            }            
      iteration++; 
      
    }//GEN-LAST:event_calculateActionPerformed
          	while (error>et);

             System.out.print("\nthe approximate root containing  ");

             System.out.print(et);
System.out.print(" Root is = ");
System.out.print(c);


    
    }
                  
    
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        degreeInput.setText("");
        lowerRange.setText("");
        upperRange.setText("");
        jTextPane1.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void degreeInputCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeInputCheckActionPerformed
        if(degreeInput.getText()!="")
        {
            degree = Integer.parseInt(degreeInput.getText());
            degree++;
            constants = new double[degree];
            for(int i = 0 ; i < degree ; i ++)
            {
                double n = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Enter value of "+(i+1)+" coefficient"));
                constants[i] = n;
            }
            degree--;
        }
    }//GEN-LAST:event_degreeInputCheckActionPerformed

    private void lowerRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerRangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowerRangeActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JButton clear;
    private javax.swing.JTextField degreeInput;
    private javax.swing.JButton degreeInputCheck;
    private javax.swing.JLabel eq;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField lowerRange;
    private javax.swing.JTextField upperRange;
    // End of variables declaration//GEN-END:variables

  
}
