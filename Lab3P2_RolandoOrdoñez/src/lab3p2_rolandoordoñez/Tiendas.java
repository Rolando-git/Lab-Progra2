package lab3p2_rolandoordoñez;
public class Tiendas 
{
    private String id;
    private String ubicacion;
    private int Mempleados;
    private int Cpagos;
    private int Mvendido;
    private int Marticulos;

    public Tiendas() {
    }

    public Tiendas(String id, String ubicacion, int Mempleados, int Cpagos, int Mvendido, int Marticulos) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.Mempleados = Mempleados;
        this.Cpagos = Cpagos;
        this.Mvendido = Mvendido;
        this.Marticulos = Marticulos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getMempleados() {
        return Mempleados;
    }

    public void setMempleados(int Mempleados) {
        this.Mempleados = Mempleados;
    }

    public int getCpagos() {
        return Cpagos;
    }

    public void setCpagos(int Cpagos) {
        this.Cpagos = Cpagos;
    }

    public int getMvendido() {
        return Mvendido;
    }

    public void setMvendido(int Mvendido) {
        this.Mvendido = Mvendido;
    }

    public int getMarticulos() {
        return Marticulos;
    }

    public void setMarticulos(int Marticulos) {
        this.Marticulos = Marticulos;
    }

    @Override
    public String toString() {
        return "Tiendas{" + "id=" + id + ", ubicacion=" + ubicacion + ", Mempleados=" + Mempleados + ", Cpagos=" + Cpagos + ", Mvendido=" + Mvendido + ", Marticulos=" + Marticulos + '}';
    }
    
}
