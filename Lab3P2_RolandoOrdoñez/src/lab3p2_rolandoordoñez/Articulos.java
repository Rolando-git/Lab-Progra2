package lab3p2_rolandoordoñez;

import java.util.ArrayList;

public class Articulos extends Tiendas
{
    private int serie;
    private int precio;
    private String color;
    private String garantia;
    ArrayList<Articulos> articulos = new ArrayList();

    public Articulos() 
    {
        super();
    }

    public Articulos(int serie, int precio, String color, String garantia, String id, String ubicacion, int Mempleados, int Cpagos, int Mvendido, int Marticulos) {
        super(id, ubicacion, Mempleados, Cpagos, Mvendido, Marticulos);
        this.serie = serie;
        this.precio = precio;
        this.color = color;
        this.garantia = garantia;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public ArrayList<Articulos> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulos> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Articulos{" + "serie=" + serie + ", precio=" + precio + ", color=" + color + ", garantia=" + garantia + ", articulos=" + articulos + '}';
    }

    
    
}
