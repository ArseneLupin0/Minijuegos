package Controlador;

import Modelo.ModeloBcm;
import Vista.BcmVistaMain;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorBcm {

    private BcmVistaMain vistaMain;
    private ModeloBcm modeloBcm;

    public ControladorBcm(BcmVistaMain vistaMain, ModeloBcm modeloBcm) {
        this.vistaMain = vistaMain;
        this.modeloBcm = modeloBcm;
        usoGenBCMBT();
        vistaMain.getGenBCMBT().addActionListener(this::genBCMBTActionPerformed); // Evento al ejecutar el botón
    }

    // Generamos clase para los eventos del boton (ratón)
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

    private void genBCMBTActionPerformed(ActionEvent e) {
        modeloBcm.setnFilas(Integer.parseInt(vistaMain.getNFilasTF().getText()));
        modeloBcm.setnColumnas(Integer.parseInt(vistaMain.getNColumnasTF().getText()));
        modeloBcm.generar();
    }
}