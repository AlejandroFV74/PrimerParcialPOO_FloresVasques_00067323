public class Celular extends Articulo_Electronico implements Precio, Descripcion{
    private String chip;

    //constructors
    public Celular(String id, String marca, String modelo, float precio, String descripcion, String chip) {
        super(id, marca, modelo, precio, descripcion);
        this.chip = chip;
    }

    public Celular() {

    }

    public Celular(String id, String modelo, float precio, String descripcion, String chip) {
    }

    //methods
    public float obtenerPrecio(float precio){
        return precio;
    };
    public void obtenerDescripcion(){
        System.out.println("Seleccione una descripción de celular:");
    };

    //getters and setters

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }
}
