package GPS;

public class Tarea {
    private final String descripcion;
    private final int duracion;
    private final Enum fase;

    public Tarea(String descripcion, int duracion, Enum fase) {
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.fase = fase;
    }

    public Tarea (String descripcion, Enum fase){
        this(descripcion, 10, fase);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public Enum getFase() {
        return fase;
    }
}
