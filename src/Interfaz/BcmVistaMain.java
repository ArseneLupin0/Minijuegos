/*
 * Created by JFormDesigner on Sun May 03 19:09:01 CEST 2020
 */

package Interfaz;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

/**
 * @author Arsene
 */
public class BcmVistaMain extends JFrame {
    public BcmVistaMain() {
        initComponents();
    }

    private void genBCMBTMouseEntered(MouseEvent e) {
        genBCMBT.setBackground(new Color(0, 75, 126, 60));
    }

    private void genBCMBTMouseExited(MouseEvent e) {
        genBCMBT.setBackground(new Color(0, 75, 126));
        genBCMBT.setForeground(Color.white);
    }

    private void genBCMBTMousePressed(MouseEvent e) {
        // TODO add your code here
    }

    private void genBCMBTMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void genBCMBTMouseReleased(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        pInicioPN = new JPanel();
        nombreLB = new JLabel();
        nFilasLB = new JLabel();
        nColumnasLB = new JLabel();
        nFilasTF = new JTextField();
        nColumnasTF = new JTextField();
        genBCMBT = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setName("bcmVentana");
        setMinimumSize(new Dimension(128, 128));
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

            //---- nColumnasTF ----
            nColumnasTF.setFont(new Font("Bahnschrift", Font.PLAIN, 18));

            //---- genBCMBT ----
            genBCMBT.setText("Generar mapeado");
            genBCMBT.setBackground(new Color(0, 75, 126));
            genBCMBT.setForeground(Color.white);
            genBCMBT.setBorder(new LineBorder(Color.black, 2));
            genBCMBT.setHorizontalTextPosition(SwingConstants.CENTER);
            genBCMBT.setFocusPainted(false);
            genBCMBT.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    genBCMBTMouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    genBCMBTMouseEntered(e);
                    genBCMBTMouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    genBCMBTMouseExited(e);
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    genBCMBTMousePressed(e);
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    genBCMBTMouseReleased(e);
                }
            });

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
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(genBCMBT, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(genBCMBT, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(pInicioPN, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(pInicioPN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(184, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel pInicioPN;
    private JLabel nombreLB;
    private JLabel nFilasLB;
    private JLabel nColumnasLB;
    private JTextField nFilasTF;
    private JTextField nColumnasTF;
    private JButton genBCMBT;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
