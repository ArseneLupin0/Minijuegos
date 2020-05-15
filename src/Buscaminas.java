/*
 * Copyright (c) 2020. Arsene, producido y realizado
 */

import Controlador.ControladorBcm;
import Modelo.ModeloBcm;
import Modelo.TableroBcm;
import Vista.BcmVistaMain;

public class Buscaminas {
    public static void main(String[] args) {
        ModeloBcm modeloBcm = new ModeloBcm();
        BcmVistaMain bcmVistaMain = new BcmVistaMain();
        TableroBcm tableroBcm = new TableroBcm(bcmVistaMain);

        new ControladorBcm(bcmVistaMain, modeloBcm,tableroBcm);

        bcmVistaMain.setVisible(true);
        tableroBcm.setVisible(true);
    }
}
