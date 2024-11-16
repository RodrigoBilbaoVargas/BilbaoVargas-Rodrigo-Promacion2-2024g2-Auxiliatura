package ejercicio3;

import java.util.ArrayList;
import java.util.List;

class Aventura {
    private List<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void iniciar() {
        for (Tarea tarea : tareas) {
            tarea.ejecutar();
        }
    }
}