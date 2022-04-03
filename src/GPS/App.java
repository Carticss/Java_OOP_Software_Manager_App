package GPS;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        ProyectoSoftware pApp = new ProyectoSoftware("Proyecto_APP");

        pApp.anadirTarea("Definición de casos de uso", 6, Fases.ANALISIS);
        pApp.anadirTarea("Extracción de requisitos", 12, Fases.ANALISIS);
        pApp.anadirTarea("Diseño del modelo de datos", 10, Fases.DISEÑO);
        pApp.anadirTarea("Implementación de la UI", 20, Fases.IMPLEMENTACION);
        pApp.anadirTarea("Implementación del modelo", 20, Fases.IMPLEMENTACION);
        pApp.anadirTarea("Implementación de las pruebas", 8, Fases.IMPLEMENTACION);
        pApp.anadirTarea("Configuración de la base de datos", 4, Fases.DESPLIEGUE);
        pApp.anadirTarea("Instalación en el servidor", 6, Fases.DESPLIEGUE);
        pApp.anadirTarea("Programación nuevos requisitos", 20, Fases.MANTENIMIENTO);

        pApp.borrarMenoresA(7);

        for (int i=0; i<pApp.getListaTareas().size(); i++){
            if (pApp.getListaTareas().get(i).getFase() == Fases.ANALISIS){
                pApp.finalizarTarea(pApp.getListaTareas().get(i));
            }
        }

        System.out.println("Nombre del proyecto: \n");
        System.out.println(pApp.getNombre());
        for (int i=0; i<pApp.getListaTareas().size(); i++){
            System.out.println("Descripción de la tarea: ");
            System.out.println(pApp.getListaTareas().get(i).getDescripcion());
            System.out.println("Fase de la tarea: ");
            System.out.println(pApp.getListaTareas().get(i).getFase());
            System.out.println("Duración de la tarea: ");
            System.out.println(pApp.getListaTareas().get(i).getDuracion());
            System.out.println("\n");
        }

    }
}