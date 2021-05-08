package lab3p2_rolandoordoñez;
public class Televisores extends Articulos
{
    private int pantalla;
    private String smart;
    private String marca;
    private int conexiones;
    private int grosor;

    public Televisores() 
    {
        super();
    }
public Televisores (int pantalla, String smart, String marca, int conexiones, int grosor)
{
    this.pantalla = pantalla;
        this.smart = smart;
        this.marca = marca;
        this.conexiones = conexiones;
        this.grosor = grosor;
}
    public Televisores(int pantalla, String smart, String marca, int conexiones, int grosor, int serie, int precio, String color, String garantia, String id, String ubicacion, int Mempleados, int Cpagos, int Mvendido, int Marticulos) {
        super(serie, precio, color, garantia, id, ubicacion, Mempleados, Cpagos, Mvendido, Marticulos);
        this.pantalla = pantalla;
        this.smart = smart;
        this.marca = marca;
        this.conexiones = conexiones;
        this.grosor = grosor;
    }

    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public String getSmart() {
        return smart;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getConexiones() {
        return conexiones;
    }

    public void setConexiones(int conexiones) {
        this.conexiones = conexiones;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Televisores{" + "pantalla=" + pantalla + ", smart=" + smart + ", marca=" + marca + ", conexiones=" + conexiones + ", grosor=" + grosor + '}';
    }
    
}
