/*
 * Created by JFormDesigner on Sun May 03 19:09:01 CEST 2020
 */

package Interfaz;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Khanix
 */
public class BcmVistaMain extends JFrame {
    public BcmVistaMain() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        nombreLB = new JLabel();
        nFilasLB = new JLabel();
        nColumnasLB = new JLabel();
        nFilasTF = new JTextField();
        nColumnasTF = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setName("bcmVentana");
        setMinimumSize(new Dimension(128, 128));
        var contentPane = getContentPane();

        //======== panel1 ========
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

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addComponent(nombreLB, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nFilasLB)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nFilasTF, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nColumnasLB)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nColumnasTF, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(185, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(nombreLB)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(nFilasLB)
                            .addComponent(nFilasTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(nColumnasLB)
                            .addComponent(nColumnasTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(184, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel nombreLB;
    private JLabel nFilasLB;
    private JLabel nColumnasLB;
    private JTextField nFilasTF;
    private JTextField nColumnasTF;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
