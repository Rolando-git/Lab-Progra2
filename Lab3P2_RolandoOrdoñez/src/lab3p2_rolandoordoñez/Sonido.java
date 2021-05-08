package lab3p2_rolandoordoñez;
public class Sonido extends Articulos
{
    private int altavoces;
    private int maxima;
    private int auxiliares;
    private int discos;
    private int puertos;

    public Sonido() 
    {
        super();
    }
public Sonido (int altavoces, int maxima, int auxiliares, int discos, int puertos)
{
    this.altavoces = altavoces;
        this.maxima = maxima;
        this.auxiliares = auxiliares;
        this.discos = discos;
        this.puertos = puertos;
}
    public Sonido(int altavoces, int maxima, int auxiliares, int discos, int puertos, int serie, int precio, String color, String garantia, String id, String ubicacion, int Mempleados, int Cpagos, int Mvendido, int Marticulos) {
        super(serie, precio, color, garantia, id, ubicacion, Mempleados, Cpagos, Mvendido, Marticulos);
        this.altavoces = altavoces;
        this.maxima = maxima;
        this.auxiliares = auxiliares;
        this.discos = discos;
        this.puertos = puertos;
    }

    public int getAltavoces() {
        return altavoces;
    }

    public void setAltavoces(int altavoces) {
        this.altavoces = altavoces;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    public int getAuxiliares() {
        return auxiliares;
    }

    public void setAuxiliares(int auxiliares) {
        this.auxiliares = auxiliares;
    }

    public int getDiscos() {
        return discos;
    }

    public void setDiscos(int discos) {
        this.discos = discos;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }

    @Override
    public String toString() {
        return "Sonido{" + "altavoces=" + altavoces + ", maxima=" + maxima + ", auxiliares=" + auxiliares + ", discos=" + discos + ", puertos=" + puertos + '}';
    }
    
}
