/*
 * Created by JFormDesigner on Sun May 03 19:09:01 CEST 2020
 */

package Vista;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

/**
 * @author Arsene
 */
public class BcmVistaMain extends JFrame {
    public BcmVistaMain() {
        iniciarComponentes();
    }

    public JTextField getNFilasTF() {
        return nFilasTF;
    }

    public JTextField getNColumnasTF() {
        return nColumnasTF;
    }

    public JButton getGenBCMBT() {
        return genBCMBT;
    }

    public JPanel getPJuego() {
        return pJuego;
    }

    private void iniciarComponentes() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        pInicioPN = new JPanel();
        var nombreLB = new JLabel();
        var nFilasLB = new JLabel();
        var nColumnasLB = new JLabel();
        nFilasTF = new JTextField();
        nColumnasTF = new JTextField();
        genBCMBT = new JButton();
        pJuego = new JPanel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setName("bcmVentana");
        setMinimumSize(new Dimension(128, 128));
        setTitle("Buscaminas V-0.2");
        var contentPane = getContentPane();

        //======== pInicioPN ========
        {

            //---- nombreLB ----
            nombreLB.setText("Buscaminas");
            nombreLB.setHorizontalAlignment(SwingConstants.CENTER);
            nombreLB.setHorizontalTextPosition(SwingConstants.CENTER);
            nombreLB.setFont(new Font("Cooper Black", Font.BOLD, 20));
            nombreLB.setForeground(new Color(248, 93, 93));

            //---- nFilasLB ----
            nFilasLB.setText("nFilas:");

            //---- nColumnasLB ----
            nColumnasLB.setText("nColumnas:");

            //---- nFilasTF ----
            nFilasTF.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
            nFilasTF.setText("5");
            nFilasTF.setEditable(false);

            //---- nColumnasTF ----
            nColumnasTF.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
            nColumnasTF.setText("5");
            nColumnasTF.setEditable(false);

            //---- genBCMBT ----
            genBCMBT.setText("Generar Mapeado");
            genBCMBT.setHorizontalTextPosition(SwingConstants.CENTER);
            genBCMBT.setFocusPainted(false);
            genBCMBT.setBackground(new Color(0, 25, 126));
            genBCMBT.setForeground(Color.white);
            genBCMBT.setBorder(new LineBorder(Color.black, 2));

            GroupLayout pInicioPNLayout = new GroupLayout(pInicioPN);
            pInicioPN.setLayout(pInicioPNLayout);
            pInicioPNLayout.setHorizontalGroup(
                pInicioPNLayout.createParallelGroup()
                    .addComponent(nombreLB, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addGroup(pInicioPNLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nFilasLB)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nFilasTF, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nColumnasLB)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nColumnasTF, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(genBCMBT, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            pInicioPNLayout.setVerticalGroup(
                pInicioPNLayout.createParallelGroup()
                    .addGroup(pInicioPNLayout.createSequentialGroup()
                        .addComponent(nombreLB)
                        .addGap(8, 8, 8)
                        .addGroup(pInicioPNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(nFilasLB)
                            .addComponent(nFilasTF, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(nColumnasLB)
                            .addComponent(nColumnasTF, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(genBCMBT, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))
            );
        }

        //======== pJuego ========
        {

            GroupLayout pJuegoLayout = new GroupLayout(pJuego);
            pJuego.setLayout(pJuegoLayout);
            pJuegoLayout.setHorizontalGroup(
                pJuegoLayout.createParallelGroup()
                    .addGap(0, 398, Short.MAX_VALUE)
            );
            pJuegoLayout.setVerticalGroup(
                pJuegoLayout.createParallelGroup()
                    .addGap(0, 178, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(pInicioPN, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pJuego, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(pInicioPN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pJuego, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel pInicioPN;
    private JTextField nFilasTF;
    private JTextField nColumnasTF;
    private JButton genBCMBT;
    private JPanel pJuego;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
