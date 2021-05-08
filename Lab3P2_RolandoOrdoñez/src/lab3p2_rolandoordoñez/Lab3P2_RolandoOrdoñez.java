package lab3p2_rolandoordoñez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_RolandoOrdoñez 
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ArrayList<Articulos> Articulos = new ArrayList();
        ArrayList<Personas> clientes = new ArrayList();
        ArrayList<Personas> Supervisores = new ArrayList();
        ArrayList<Personas> Cajeros = new ArrayList();
        ArrayList<Personas> Asesores = new ArrayList();
        boolean finPrograma = false;
        while(finPrograma==false)
        {
            int opcion;
            System.out.println("1.admin");
            System.out.println("2.cliente");
            System.out.println("3.Supervisor");
            System.out.println("4.Asesor Financiero");
            System.out.println("5.Cajero");
            System.out.println("6.Salir");
            opcion = entrada.nextInt();
            switch(opcion)
            {
                case 1:
                {
                    String usuario;
                    String contra;
                    System.out.println("Usuario:");
                    usuario = entrada.next();
                    System.out.println("contraseña");
                    contra = entrada.next();
                    if (usuario.equals("admin")&&contra.equals("1234"))
                    {
                        int s;
                        char resp='s';
                        while(resp=='s'||resp=='S')
                        {
                            System.out.println("1.Añadir articulo");
                            System.out.println("2.Eliminar articulo");
                            System.out.println("3.Editar articulo");
                            System.out.println("4.Añadir cajero");
                            System.out.println("5.Eliminar cajero");
                            System.out.println("6.Añadir supervisor");
                            System.out.println("7.Eliminar supervisor");
                            System.out.println("8.Añadir asesor");
                            System.out.println("9.Eliminar asesor");
                            s = entrada.nextInt();
                            switch(s)
                            {
                                case 1:
                                {
                                    int a;
                                    System.out.println("1.Televisor");
                                    System.out.println("2.Equipo de sonido");
                                    System.out.println("3.Consola de videojuegos");
                                    System.out.println("4.Teatro en casa");
                                    a = entrada.nextInt();
                                    switch(a)
                                    {
                                        case 1:
                                        {
                                            int pantalla;
                                            System.out.println("Ingrese el tamaño de pantalla en pulgadas");
                                            pantalla = entrada.nextInt();
                                            String smart;
                                            System.out.println("El tele es smart?[si/no]");
                                            smart = entrada.next();
                                            String marca;
                                            System.out.println("Ingrese la marca del tele");
                                            marca = entrada.next();
                                            int conexiones;
                                            System.out.println("Imgrese el numero de conexiones que tiene el tele");
                                            conexiones = entrada.nextInt();
                                            int grosor;
                                            System.out.println("Ingrese el grosor del tele");
                                            grosor = entrada.nextInt();
                                            Articulos.add(new Televisores(pantalla,smart,marca,conexiones,grosor));
                                            System.out.println(Articulos);
                                        }
                                        break;
                                        case 2:
                                        {
                                            int altavoces;
                                            System.out.println("Ingrese cantidad de altavoces");
                                            altavoces = entrada.nextInt();
                                            int maxima;
                                            System.out.println("Ingrese potencia maxima");
                                            maxima = entrada.nextInt();
                                            int auxiliares;
                                            System.out.println("Ingrese numero de puertos auxiliares");
                                            auxiliares = entrada.nextInt();
                                            int discos;
                                            System.out.println("Ingrese cantidad maxima de discos");
                                            discos = entrada.nextInt();
                                            int puertos;
                                            System.out.println("Ingrese cantidad de puertos USB");
                                            puertos = entrada.nextInt();
                                            Articulos.add(new Sonido(altavoces,maxima,auxiliares,discos,puertos));
                                        }
                                        break;
                                        case 3:
                                        {
                                            String marca;
                                            System.out.println("Ingrese la marca de la consola");
                                            marca = entrada.next();
                                            int almacenamiento;
                                            System.out.println("Almacenamiento en GB:");
                                            almacenamiento = entrada.nextInt();
                                            int controles;
                                            System.out.println("NUmero de controles:");
                                            controles = entrada.nextInt();
                                            int accesorios;
                                            System.out.println("NUmero de accesorios:");
                                            accesorios = entrada.nextInt();
                                            String video;
                                            System.out.println("Info de la tarjeta de video");
                                            video = entrada.next();
                                            Articulos.add(new Consolas(marca,almacenamiento,controles,accesorios,video));
                                        }
                                        break;
                                        case 4:
                                        {
                                            int altavoces;
                                            System.out.println("Cantidad de altavoces:");
                                            altavoces = entrada.nextInt();
                                            int discos;
                                            System.out.println("Cantidad de discos:");
                                            discos = entrada.nextInt();
                                            String limpieza;
                                            System.out.println("Info de limpieza del lector");
                                            limpieza = entrada.next();
                                            String lector;
                                            System.out.println("Info del lector");
                                            lector = entrada.next();
                                            Articulos.add(new Teatros(altavoces,discos,limpieza,lector));
                                        }
                                    }
                                }
                                break;
                                case 2:
                                {
                                    int p;
                                    System.out.println("Ingrese la posicion del articulo a eliminar");
                                    p = entrada.nextInt();
                                    Articulos.remove(p);
                                }
                                break;
                                case 3:
                                {
                                    resp='s';
                                    while (resp=='S'||resp=='s')
                                    {
                                        int a;
                                        System.out.println("1.Televisor");
                                        System.out.println("2.Equipo de sonido");
                                        System.out.println("3.Consola de videojuegos");
                                        System.out.println("4.Teatro en casa");
                                        a = entrada.nextInt();
                                        switch(a)
                                        {
                                            case 1:
                                            {
                                                int p;
                                                System.out.println("Ingrese la posicion del articulo a eliminar");
                                                p = entrada.nextInt();
                                                if (Articulos.get(p)instanceof Televisores)
                                                {
                                                    Articulos.remove(p);
                                                    int pantalla;
                                                    System.out.println("Ingrese el tamaño de pantalla en pulgadas");
                                                    pantalla = entrada.nextInt();
                                                    String smart;
                                                    System.out.println("El tele es smart?[si/no]");
                                                    smart = entrada.next();
                                                    String marca;
                                                    System.out.println("Ingrese la marca del tele");
                                                    marca = entrada.next();
                                                    int conexiones;
                                                    System.out.println("Imgrese el numero de conexiones que tiene el tele");
                                                    conexiones = entrada.nextInt();
                                                    int grosor;
                                                    System.out.println("Ingrese el grosor del tele");
                                                    grosor = entrada.nextInt();
                                                    Articulos.add(new Televisores(pantalla,smart,marca,conexiones,grosor));
                                                }
                                                else
                                                {
                                                    System.out.println("No es un televisor");
                                                }
                                            }
                                            break;
                                            case 2:
                                            {
                                                int p;
                                                System.out.println("Ingrese la posicion del articulo a eliminar");
                                                p = entrada.nextInt();
                                                if (Articulos.get(p)instanceof Sonido)
                                                {
                                                    Articulos.remove(p);
                                                    int altavoces;
                                                    System.out.println("Ingrese cantidad de altavoces");
                                                    altavoces = entrada.nextInt();
                                                    int maxima;
                                                    System.out.println("Ingrese potencia maxima");
                                                    maxima = entrada.nextInt();
                                                    int auxiliares;
                                                    System.out.println("Ingrese numero de puertos auxiliares");
                                                    auxiliares = entrada.nextInt();
                                                    int discos;
                                                    System.out.println("Ingrese cantidad maxima de discos");
                                                    discos = entrada.nextInt();
                                                    int puertos;
                                                    System.out.println("Ingrese cantidad de puertos USB");
                                                    puertos = entrada.nextInt();
                                                    Articulos.add(new Sonido(altavoces,maxima,auxiliares,discos,puertos));
                                                }
                                                else
                                                {
                                                    System.out.println("No es un equipo de sonido");
                                                }
                                            }
                                            break;
                                            case 3:
                                            {
                                                int p;
                                                System.out.println("Ingrese la posicion del articulo a eliminar");
                                                p = entrada.nextInt();
                                                if (Articulos.get(p)instanceof Consolas)
                                                {
                                                    Articulos.remove(p);
                                                    String marca;
                                                    System.out.println("Ingrese la marca de la consola");
                                                    marca = entrada.next();
                                                    int almacenamiento;
                                                    System.out.println("Almacenamiento en GB:");
                                                    almacenamiento = entrada.nextInt();
                                                    int controles;
                                                    System.out.println("NUmero de controles:");
                                                    controles = entrada.nextInt();
                                                    int accesorios;
                                                    System.out.println("NUmero de accesorios:");
                                                    accesorios = entrada.nextInt();
                                                    String video;
                                                    System.out.println("Info de la tarjeta de video");
                                                    video = entrada.next();
                                                    Articulos.add(new Consolas(marca,almacenamiento,controles,accesorios,video));
                                                }
                                                else
                                                {
                                                    System.out.println("No es una consola");
                                                }
                                            }
                                            break;
                                            case 4:
                                            {
                                                int p;
                                                System.out.println("Ingrese la posicion del articulo a eliminar");
                                                p = entrada.nextInt();
                                                if (Articulos.get(p)instanceof Teatros)
                                                {
                                                    Articulos.remove(p);
                                                    int altavoces;
                                                    System.out.println("Cantidad de altavoces:");
                                                    altavoces = entrada.nextInt();
                                                    int discos;
                                                    System.out.println("Cantidad de discos:");
                                                    discos = entrada.nextInt();
                                                    String limpieza;
                                                    System.out.println("Info de limpieza del lector");
                                                    limpieza = entrada.next();
                                                    String lector;
                                                    System.out.println("Info del lector");
                                                    lector = entrada.next();
                                                    Articulos.add(new Teatros(altavoces,discos,limpieza,lector));
                                                }
                                                else
                                                {
                                                    System.out.println("No es un teatro encasa");
                                                }
                                            }
                                        }
                                        System.out.println("Editar otro?[s/n]");
                                        resp = entrada.next().charAt(0);
                                    }
                                }
                                break;
                                case 4:
                                {
                                    String nombre1;
                                    System.out.println("Nombre del cajero");
                                    nombre1 = entrada.next();
                                    String apellido1;
                                    System.out.println("Apellido:");
                                    apellido1 = entrada.next();
                                    int salario;
                                    System.out.println("Salario");
                                    salario = entrada.nextInt();
                                    String nacionalidad;
                                    System.out.println("Nacionalida");
                                    nacionalidad = entrada.next();
                                    int trabajo;
                                    System.out.println("horas trabajadas");
                                    trabajo = entrada.nextInt();
                                    int almuerzo;
                                    System.out.println("hora de almuerzo");
                                    almuerzo = entrada.nextInt();
                                    String meta;
                                    System.out.println("meta por mes");
                                    meta = entrada.next();
                                    int atendidos;
                                    System.out.println("Clientes atendidos");
                                    atendidos = entrada.nextInt();
                                    Cajeros.add(new Cajero(nombre1,apellido1,salario,nacionalidad,trabajo,almuerzo,meta,atendidos));
                                }
                                break;
                                case 5:
                                {
                                    int p;
                                    System.out.println("Ingrese la posicion a eliminar");
                                    p = entrada.nextInt();
                                    Cajeros.remove(p);//
                                }
                                break;
                                case 6:
                                {
                                    String nombre2;
                                    System.out.println("nombre:");
                                    nombre2 = entrada.next();
                                    String apellido2;
                                    System.out.println("apellido:");
                                    apellido2 = entrada.next();
                                    int salario1;
                                    System.out.println("Salario:");
                                    salario1 = entrada.nextInt();
                                    String cajero;
                                    System.out.println("Cajero al que supervisa");
                                    cajero = entrada.next();
                                    int salarioP;
                                    System.out.println("salario promedio de su cajero");
                                    salarioP = entrada.nextInt();
                                    String metaP;
                                    System.out.println("meta promedio de su cajero:");
                                    metaP = entrada.next();
                                    Supervisores.add(new Supervisor(nombre2,apellido2,salario1,cajero,salarioP,metaP));
                                }
                                break;
                                case 7:
                                {
                                    int p;
                                    System.out.println("Ingrese la posicion a eliminar");
                                    p = entrada.nextInt();
                                    Supervisores.remove(p);
                                }
                                break;
                                case 8:
                                {
                                    String nombre3;
                                    System.out.println("nombre");
                                    nombre3 = entrada.next();
                                    String apellido3;
                                    System.out.println("apellido:");
                                    apellido3 = entrada.next();
                                    String nacionalidad3;
                                    System.out.println("Nacionalida");
                                    nacionalidad3 = entrada.next();
                                    int salario3;
                                    System.out.println("salario");
                                    salario3 = entrada.nextInt();
                                    int client;
                                    System.out.println("clientes atendidos");
                                    client = entrada.nextInt();
                                    int productos;
                                    System.out.println("productos comprados por sus clientes");
                                    productos = entrada.nextInt();
                                    Asesores.add(new Financiero(nombre3,apellido3,nacionalidad3,salario3,client,productos));
                                }
                                break;
                                case 9:
                                {
                                    int p;
                                    System.out.println("Ingrese la posicion a eliminar");
                                    p = entrada.nextInt();
                                    Asesores.remove(p);
                                }
                                break;
                                default: System.out.println("Error, opcion no valida");
                            }
                            System.out.println("Administrar algo mas?[s/n]");
                            resp = entrada.next().charAt(0);
                        }
                    }
                    else
                    {
                        System.out.println("Usuario o contraseña incorrectos");
                    }
                }
                break;
                case 2:
                {
                    char resp;
                    System.out.println("Crear usuario?[s/n]");
                    resp = entrada.next().charAt(0);
                    if (resp=='s'||resp=='S')
                    {
                        String nombre4;
                        System.out.println("nombre");
                        nombre4 = entrada.next();
                        String apellido4;
                        System.out.println("apellido");
                        apellido4 = entrada.next();
                        String nacionalidad4;
                        System.out.println("Nacionalidad");
                        nacionalidad4 = entrada.next();
                        int salario4;
                        System.out.println("salario");
                        salario4 = entrada.nextInt();
                        int credito;
                        System.out.println("credito disponible");
                        credito = entrada.nextInt();
                        int comprado;
                        System.out.println("articulos comprados");
                        comprado = entrada.nextInt();
                        String domicilio;
                        System.out.println("Ingrese su direccion");
                        domicilio = entrada.next();
                        clientes.add(new Cliente(nombre4,apellido4,nacionalidad4,salario4,credito,comprado,domicilio));
                    }
                    else
                    {
                        if (clientes.isEmpty()==true)
                        {
                            System.out.println("no hay clientes... cree un usuario");
                        }
                        else
                        {
                            System.out.println(clientes);
                        }
                    }
                }
                break;
                case 3:
                {
                    int p;
                    System.out.println("1. crear cajero");
                    System.out.println("2. eliminar cajero");
                    System.out.println("3. editar cajero");
                    System.out.println("4. crear asesor");
                    System.out.println("5. eliminar asesor");
                    System.out.println("6. editar asesor");
                    p = entrada.nextInt();
                    char resp='s';
                    while (resp=='s'||resp=='S')
                    {
                        switch (p)
                        {
                            case 1:
                            {
                                String nombre1;
                                    System.out.println("Nombre del cajero");
                                    nombre1 = entrada.next();
                                    String apellido1;
                                    System.out.println("Apellido:");
                                    apellido1 = entrada.next();
                                    int salario;
                                    System.out.println("Salario");
                                    salario = entrada.nextInt();
                                    String nacionalidad;
                                    System.out.println("Nacionalida");
                                    nacionalidad = entrada.next();
                                    int trabajo;
                                    System.out.println("horas trabajadas");
                                    trabajo = entrada.nextInt();
                                    int almuerzo;
                                    System.out.println("hora de almuerzo");
                                    almuerzo = entrada.nextInt();
                                    String meta;
                                    System.out.println("meta por mes");
                                    meta = entrada.next();
                                    int atendidos;
                                    System.out.println("Clientes atendidos");
                                    atendidos = entrada.nextInt();
                                    Cajeros.add(new Cajero(nombre1,apellido1,salario,nacionalidad,trabajo,almuerzo,meta,atendidos));
                            }
                            break;
                            case 2:
                            {
                                    int a;
                                    System.out.println("Ingrese la posicion a eliminar");
                                    a = entrada.nextInt();
                                    Cajeros.remove(a);
                            }
                            break;
                            case 3:
                            {
                                int a;
                                    System.out.println("Ingrese la posicion a eliminar");
                                    a = entrada.nextInt();
                                    Cajeros.remove(a);
                                    String nombre1;
                                    System.out.println("Nombre del cajero");
                                    nombre1 = entrada.next();
                                    String apellido1;
                                    System.out.println("Apellido:");
                                    apellido1 = entrada.next();
                                    int salario;
                                    System.out.println("Salario");
                                    salario = entrada.nextInt();
                                    String nacionalidad;
                                    System.out.println("Nacionalida");
                                    nacionalidad = entrada.next();
                                    int trabajo;
                                    System.out.println("horas trabajadas");
                                    trabajo = entrada.nextInt();
                                    int almuerzo;
                                    System.out.println("hora de almuerzo");
                                    almuerzo = entrada.nextInt();
                                    String meta;
                                    System.out.println("meta por mes");
                                    meta = entrada.next();
                                    int atendidos;
                                    System.out.println("Clientes atendidos");
                                    atendidos = entrada.nextInt();
                                    Cajeros.add(new Cajero(nombre1,apellido1,salario,nacionalidad,trabajo,almuerzo,meta,atendidos));
                            }
                            break;
                            case 4:
                            {
                                String nombre3;
                                    System.out.println("nombre");
                                    nombre3 = entrada.next();
                                    String apellido3;
                                    System.out.println("apellido:");
                                    apellido3 = entrada.next();
                                    String nacionalidad3;
                                    System.out.println("Nacionalida");
                                    nacionalidad3 = entrada.next();
                                    int salario3;
                                    System.out.println("salario");
                                    salario3 = entrada.nextInt();
                                    int client;
                                    System.out.println("clientes atendidos");
                                    client = entrada.nextInt();
                                    int productos;
                                    System.out.println("productos comprados por sus clientes");
                                    productos = entrada.nextInt();
                                    Asesores.add(new Financiero(nombre3,apellido3,nacionalidad3,salario3,client,productos));
                            }
                            break;
                            case 5:
                            {
                                int b;
                                    System.out.println("Ingrese la posicion a eliminar");
                                    b = entrada.nextInt();
                                    Asesores.remove(b);
                                    String nombre3;
                                    System.out.println("nombre");
                                    nombre3 = entrada.next();
                                    String apellido3;
                                    System.out.println("apellido:");
                                    apellido3 = entrada.next();
                                    String nacionalidad3;
                                    System.out.println("Nacionalida");
                                    nacionalidad3 = entrada.next();
                                    int salario3;
                                    System.out.println("salario");
                                    salario3 = entrada.nextInt();
                                    int client;
                                    System.out.println("clientes atendidos");
                                    client = entrada.nextInt();
                                    int productos;
                                    System.out.println("productos comprados por sus clientes");
                                    productos = entrada.nextInt();
                                    Asesores.add(new Financiero(nombre3,apellido3,nacionalidad3,salario3,client,productos));
                            }
                            break;
                            case 6:
                            {
                                int b;
                                    System.out.println("Ingrese la posicion a eliminar");
                                    b = entrada.nextInt();
                                    Asesores.remove(b);
                            }
                            break;
                            default: System.out.println("Error");
                        }
                        System.out.println("hacer otra accion?[s/n]");
                        resp = entrada.next().charAt(0);
                    }
                }
                break;
                case 4:
                {
                    int p;
                    System.out.println("Ingrese su posicion");
                    p = entrada.nextInt();
                    System.out.println(Asesores.get(p));
                    char resp;
                    System.out.println("Cambiar su info?[s/n]");
                    resp = entrada.next().charAt(0);
                    if (resp=='s'||resp=='S')
                    {
                        Asesores.remove(p);
                        String nombre3;
                        System.out.println("nombre");
                        nombre3 = entrada.next();
                        String apellido3;
                        System.out.println("apellido:");
                        apellido3 = entrada.next();
                        String nacionalidad3;
                        System.out.println("Nacionalida");
                        nacionalidad3 = entrada.next();
                        int salario3;
                        System.out.println("salario");
                        salario3 = entrada.nextInt();
                        int client;
                        System.out.println("clientes atendidos");
                        client = entrada.nextInt();
                        int productos;
                        System.out.println("productos comprados por sus clientes");
                        productos = entrada.nextInt();
                        Asesores.add(new Financiero(nombre3,apellido3,nacionalidad3,salario3,client,productos));
                    }
                }
                break;
                case 5:
                {
                    int p;
                    System.out.println("Ingrese su posicion");
                    p = entrada.nextInt();
                    System.out.println(Cajeros.get(p));
                    System.out.println(Articulos);
                }
                break;
                case 6:
                {
                    finPrograma = true;
                    System.out.println("Fin del programa");
                }
                break;
                default: System.out.println("Error, opcion no valida");
            }
        }
    }
}