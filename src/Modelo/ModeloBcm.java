package Modelo;

public class ModeloBcm {
    private int nFilas;
    private int nColumnas;
    private int buscaminas;

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

    public void generar() {
        for (int i = 0; i < this.nFilas; i++) {
            System.out.println("#");
            for (int j = 0; j < this.nColumnas; j++) {
                System.out.println("-");
            }
            System.out.println();
        }
    }
}