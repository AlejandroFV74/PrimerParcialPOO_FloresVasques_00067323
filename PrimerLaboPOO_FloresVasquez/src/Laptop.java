
public class Laptop extends Articulo_Electronico implements Precio, Descripcion{
    private String modeloDiscoDuro;
    private String modeloLectorCD;

    //constructors
    public Laptop(String id, String marca, String modelo, float precio, String descripcion, String modeloDiscoDuro, String modeloLectorCD) {
        super(id, marca, modelo, precio, descripcion);
        this.modeloDiscoDuro = modeloDiscoDuro;
        this.modeloLectorCD= modeloLectorCD;
    }

    public Laptop() {

    }

    public Laptop(String id, String modelo, float precio, String descripcion, String modeloDiscoDuro, String modeloLectorCD) {
    }


//methods

    public float obtenerPrecio(float precio){
        return precio;
    };
    public void obtenerDescripcion(){
        System.out.println("Seleccione una descripción de laptop:");
    };

    //getters and setters

    public String getModeloDiscoDuro() {
        return modeloDiscoDuro;
    }

    public void setModeloDiscoDuro(String modeloDiscoDuro) {
        this.modeloDiscoDuro = modeloDiscoDuro;
    }

    public String getModeloLectorCD() {
        return modeloLectorCD;
    }

    public void setModeloLectorCD(String modeloLectorCD) {
        this.modeloLectorCD = modeloLectorCD;
    }
}

