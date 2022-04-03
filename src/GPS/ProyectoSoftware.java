package GPS;

import java.util.LinkedList;

public class ProyectoSoftware {
    private String nombre;
    private LinkedList<Tarea> listaTareas;
    private LinkedList<Tarea> listaTareasDone;

    public ProyectoSoftware(String nombre) {
        this.nombre = nombre;
        listaTareas = new LinkedList<Tarea>();
        listaTareasDone = new LinkedList<Tarea>();
    }

    public int getDuracionTotal(){
        int total = 0;
        for (int i = 0; i < this.listaTareas.size(); i++) {
            total += this.listaTareas.get(i).getDuracion();
        }
        return total;
    }

    public LinkedList<Tarea> obtenerPorFase(Fases fase){
        LinkedList<Tarea> newList = new LinkedList<Tarea>();
        for (int i = 0; i < this.listaTareas.size(); i++) {
            if (this.listaTareas.get(i).getFase() == fase){
                newList.add(this.listaTareas.get(i));
            }
        }
        return newList;
    }

    public Tarea anadirTarea(String descripcion, int duracion, Enum fase){
        Tarea task = new Tarea(descripcion, duracion, fase);
        this.listaTareas.add(task);
        return task;
    }

    public boolean borrarTarea(Tarea task){
        if (this.listaTareas.contains(task)) {
            for (int i = 0; i < this.listaTareas.size(); i++) {
                if (this.listaTareas.get(i) == task) {
                    this.listaTareas.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean finalizarTarea(Tarea task){
        if (this.listaTareas.contains(task) || !this.listaTareasDone.contains(task)){
            for (int i = 0; i < this.listaTareas.size(); i++) {
                if (this.listaTareas.get(i) == task) {
                    this.listaTareasDone.add(task);
                    this.listaTareas.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public void borrarMenoresA(int num){
        for (int i = 0; i < this.listaTareas.size(); i++) {
            if (this.listaTareas.get(i).getDuracion() == num) {
                this.listaTareas.remove(i);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public LinkedList<Tarea> getListaTareasDone() {
        return listaTareasDone;
    }
}
