package lab3p2_rolandoordoñez;
public class Teatros extends Articulos
{
    private int altavoces;
    private int discos;
    private String limpieza;
    private String lector;

    public Teatros() 
    {
        super();
    }
public Teatros (int altavoces, int discos, String limpieza, String lector)
{
    this.altavoces = altavoces;
        this.discos = discos;
        this.limpieza = limpieza;
        this.lector = lector;
}
    public Teatros(int altavoces, int discos, String limpieza, String lector, int serie, int precio, String color, String garantia, String id, String ubicacion, int Mempleados, int Cpagos, int Mvendido, int Marticulos) {
        super(serie, precio, color, garantia, id, ubicacion, Mempleados, Cpagos, Mvendido, Marticulos);
        this.altavoces = altavoces;
        this.discos = discos;
        this.limpieza = limpieza;
        this.lector = lector;
    }

    public int getAltavoces() {
        return altavoces;
    }

    public void setAltavoces(int altavoces) {
        this.altavoces = altavoces;
    }

    public int getDiscos() {
        return discos;
    }

    public void setDiscos(int discos) {
        this.discos = discos;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(String limpieza) {
        this.limpieza = limpieza;
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return "Teatros{" + "altavoces=" + altavoces + ", discos=" + discos + ", limpieza=" + limpieza + ", lector=" + lector + '}';
    }
    
}
