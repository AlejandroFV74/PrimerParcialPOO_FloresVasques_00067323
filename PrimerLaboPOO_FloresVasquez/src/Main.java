import java.util.Objects;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;




public class Main {
    private static final ArrayList<Articulo_Electronico>articuloElectronico = new ArrayList<>();
    public static void main(String[] args) {

        mostrarMenu();


    }

    private static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        boolean respuesta= false;

            while (!respuesta) {
                try {
                int opcion=0;
                System.out.println("-------------------------------------------------");
                System.out.println("Bienvenido a la tienda de electrónica Fast&Furios");
                System.out.println("Seleccione una opción para continuar:");
                System.out.println("1. Agregar articulo");
                System.out.println("2. Modificar articulo");
                System.out.println("3. Consultar listado de todos los artículos");
                System.out.println("4. Salir del sistema");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        agregarArticulo();
                        break;
                    case 2:
                        modificarArticulo();
                        break;
                    case 3:
                        consultarLista();
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema...");
                        respuesta=true;

                        break;
                    default:
                        System.out.println("Seleccione un número válido");
                        break;

                }


            }catch (InputMismatchException e){
                    System.out.println("Seleccione una opción válida.");
                    sc.nextLine();

                }
        }


    }

    private static void consultarLista() {



        for (int i = 0; i < articuloElectronico.size(); i++) {

            System.out.println("------------------------------------------");
            System.out.println("Listado de todos los artículos en sistema:");
            System.out.println(i+1 + ". ID: " + articuloElectronico.get(i).getId());
            System.out.println(i+1 + ". Marca: " + articuloElectronico.get(i).getMarca());
            System.out.println(i+1 + ". Modelo: " + articuloElectronico.get(i).getModelo());
            System.out.println(i+1 + ". Precio: " + articuloElectronico.get(i).getPrecio());
            System.out.println(i+1 + ". Descripción: " + articuloElectronico.get(i).getDescripcion());



        }
    }

    private static void modificarArticulo() {
        Scanner sc = new Scanner(System.in);
        String id;
        try{
        System.out.println("Ingrese el ID del articulo para modificar nombre:");
        id = sc.nextLine();
        for (int i = 0; i < articuloElectronico.size(); i++){
            String idEstablecido = articuloElectronico.get(i).getId();
            if (Objects.equals(idEstablecido, id)){
                System.out.println("Ingrese el nuevo nomnbre del artículo:");
                String nombre= sc.nextLine();
                articuloElectronico.get(i).setMarca(nombre);
                break;
            }

        }
        }catch (InputMismatchException e){
            System.out.println("Seleccione un dato válido");
        }

    }


    private static void agregarArticulo() {
        Scanner sc = new Scanner(System.in);

        String marca;
        String id;
        String modelo;
        float precio;
        String descripcion;
        String chip;
        String modeloDiscoDuro;
        String modeloLectorCD;
        while(true) {
            try {
                System.out.println("¿Qué artículo desea agregar?");

                System.out.println("1. Celular");
                System.out.println("2. Laptop");
                int opcion = 0;
                opcion = sc.nextInt();
                while (opcion != 1 || opcion != 2) {
                    System.out.println("Ingrese uno de esos números");
                    opcion = sc.nextInt();
                    if (opcion==1 || opcion==2){
                        break;
                    } sc.nextLine();
                }

                System.out.println("Marca: ");
                sc.nextLine();
                marca = sc.nextLine();
                System.out.println("Descripción: ");
                descripcion = sc.nextLine();
                System.out.println("ID: ");
                id = sc.nextLine();
                System.out.println("Modelo: ");
                modelo = sc.nextLine();
                System.out.println("Precio: ");
                precio = sc.nextFloat();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Chip: ");
                        chip = sc.nextLine();

                        Articulo_Electronico articuloElectronico1 = new Articulo_Electronico(id, modelo, precio, descripcion, chip) {
                        };
                        articuloElectronico.add(articuloElectronico1);



                        break;
                    case 2:
                        System.out.println("Modelo disco duro:");
                        modeloDiscoDuro = sc.nextLine();
                        System.out.println("Modelo lector CD: ");
                        modeloLectorCD = sc.nextLine();
                        sc.nextLine();
                        Articulo_Electronico articuloElectronico2 = new Articulo_Electronico(id, modelo, precio, descripcion, modeloDiscoDuro, modeloLectorCD) {
                        };
                        articuloElectronico.add(articuloElectronico2);
                        

                        break;

                    default:
                        System.out.println("Seleccione un número válido");
                        break;
                } break;
            } catch (InputMismatchException e) {
                System.out.println("Seleccione una opción válida.");

            }

        }
    }
}
