package lab3p2_rolandoordoñez;
public class Consolas extends Articulos
{
    private String marca;
    private int almacenamiento;
    private int controles;
    private int accesorios;
    private String video;

    public Consolas() 
    {
        super();
    }
public Consolas (String marca, int almacenamiento, int controles, int accesorios, String video)
{
    this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.controles = controles;
        this.accesorios = accesorios;
        this.video = video;
}
    public Consolas(String marca, int almacenamiento, int controles, int accesorios, String video, int serie, int precio, String color, String garantia, String id, String ubicacion, int Mempleados, int Cpagos, int Mvendido, int Marticulos) {
        super(serie, precio, color, garantia, id, ubicacion, Mempleados, Cpagos, Mvendido, Marticulos);
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.controles = controles;
        this.accesorios = accesorios;
        this.video = video;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(int accesorios) {
        this.accesorios = accesorios;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Consolas{" + "marca=" + marca + ", almacenamiento=" + almacenamiento + ", controles=" + controles + ", accesorios=" + accesorios + ", video=" + video + '}';
    }
    
}
