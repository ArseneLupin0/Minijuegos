/*
 * Copyright (c) 2020. Arsene, producido y realizado
 */

import Controlador.ControladorBcm;
import Modelo.ModeloBcm;
import Vista.BcmVistaMain;

public class Buscaminas {
    public static void main(String[] args) {
        ModeloBcm modeloBcm = new ModeloBcm();
        BcmVistaMain bcmVistaMain = new BcmVistaMain();

        new ControladorBcm(bcmVistaMain, modeloBcm);

        bcmVistaMain.setVisible(true);
    }
}
