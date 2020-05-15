package Modelo;

import Vista.BcmVistaMain;
import Controlador.ControladorBcm;

import javax.swing.*;
import java.awt.*;

public class ModeloBcm {
    private int nFilas;
    private int nColumnas;
    private int buscaminas;
    private int conMinas = 0, nTotalDeMinas = 0, contador = 0;
    private BcmVistaMain vistaMain = new BcmVistaMain();
    private TableroBcm tablero = new TableroBcm(vistaMain);
    private ControladorBcm controlador = new ControladorBcm(vistaMain, this, tablero);

    public int getnFilas() {
        return nFilas;
    }

    public void setnFilas(int nFilas) {
        this.nFilas = nFilas;
    }

    public int getnColumnas() {
        return nColumnas;
    }

    public void setnColumnas(int nColumnas) {
        this.nColumnas = nColumnas;
    }

    public int getBuscaminas() {
        return buscaminas;
    }

    public void setBuscaminas(int buscaminas) {
        this.buscaminas = buscaminas;
    }

    public int getConMinas() {
        return conMinas;
    }

    public void setConMinas(int conMinas) {
        this.conMinas = conMinas;
    }

    public int getnTotalDeMinas() {
        return nTotalDeMinas;
    }

    public void setnTotalDeMinas(int nTotalDeMinas) {
        this.nTotalDeMinas = nTotalDeMinas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void generar() {
        vistaMain.getPJuego().setLayout(new GridLayout(nFilas, nColumnas));

        nTotalDeMinas = this.nFilas * this.nColumnas;

        for (int i = 0; i < this.nFilas; i++) {
            for (int j = 0; j < this.nColumnas; j++) {
                tablero.addActionListener(controlador::TableroBcmActionPerformed);
                if (tablero.estadoMina()) conMinas++;
                tablero.setVisible(true);
                vistaMain.getPJuego().add(tablero);
            }
        }
    }
}