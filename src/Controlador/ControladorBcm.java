package Controlador;

import Modelo.ModeloBcm;
import Modelo.TableroBcm;
import Vista.BcmVistaMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorBcm {

    private BcmVistaMain vistaMain;
    private ModeloBcm modeloBcm;
    private TableroBcm tableroBcm2;

    public ControladorBcm(BcmVistaMain vistaMain, ModeloBcm modeloBcm, TableroBcm tableroBcm2) {
        this.vistaMain = vistaMain;
        this.modeloBcm = modeloBcm;
        this.tableroBcm2 = tableroBcm2;
        usoGenBCMBT();
        vistaMain.getGenBCMBT().addActionListener(this::genBCMBTActionPerformed); // Evento al ejecutar el botón
    }

    // Generamos método para los eventos del botón (ratón)
    private void usoGenBCMBT() {
        this.vistaMain.getGenBCMBT().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                vistaMain.getGenBCMBT().setBackground(new Color(0, 62, 255, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                vistaMain.getGenBCMBT().setBackground(new Color(0, 25, 126));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                vistaMain.getGenBCMBT().setBackground(new Color(16, 79, 20, 255));
                vistaMain.getGenBCMBT().setBackground(new Color(0x000000));
            }
        });
    }

    // Método para la acción del botón

    private void genBCMBTActionPerformed(ActionEvent e) {
        modeloBcm.setnFilas(Integer.parseInt(vistaMain.getNFilasTF().getText()));
        System.out.println(vistaMain.getNColumnasTF().getText());
        modeloBcm.setnColumnas(Integer.parseInt(vistaMain.getNColumnasTF().getText()));
        modeloBcm.generar();
        vistaMain.paintAll(vistaMain.getGraphics());
        System.out.println("leo esto");
    }

    public void TableroBcmActionPerformed(ActionEvent e) {
        System.out.println("No llegamos");
        if (this.tableroBcm2.estadoMina()) {
            JOptionPane.showMessageDialog(vistaMain, "Pulsates en una mina, LOSSER");
            modeloBcm.setContador(0);
        } else {
            this.tableroBcm2.setBackground(Color.CYAN);
            modeloBcm.setConMinas(modeloBcm.getConMinas() + 1);
            if (modeloBcm.getnTotalDeMinas() - modeloBcm.getConMinas() == modeloBcm.getContador())
                JOptionPane.showMessageDialog(vistaMain, "¡¡Has ganado!!");
        }
    }
}