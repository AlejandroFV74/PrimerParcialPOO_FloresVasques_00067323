public abstract class Articulo_Electronico {
    private String marca;
    private String id;
    private String modelo;
    private float precio;
    private String descripcion;

    //constructors
    public Articulo_Electronico(String id ,String marca, String modelo, float precio, String descripcion) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.id= id;
    }

    public  Articulo_Electronico( Celular celular, String chip){

    }
    public Articulo_Electronico(){

    }

    public Articulo_Electronico(String id, String modelo, float precio, String descripcion, String chip) {
    }

    public Articulo_Electronico(String id, String modelo, float precio, String descripcion, String modeloDiscoDuro, String modeloLectorCD) {
    }

    //getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
