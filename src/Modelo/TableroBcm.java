/*
 * Copyright (c) 2020. Arsene, producido y realizado
 */

package Modelo;

import Vista.BcmVistaMain;

import javax.swing.*;

public class TableroBcm extends JButton {

    private boolean mina;

    public TableroBcm(BcmVistaMain vistaMain){
        super();
        double aleatorio = Math.random();

        if (aleatorio > 0.9) mina = true;
        else mina = false;
    }

    public boolean estadoMina(){
        return mina;
    }
}