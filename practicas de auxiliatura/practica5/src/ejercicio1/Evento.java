package ejercicio1;

class Evento {
    private String nombre;
    private EventoNotificacion notificacion;

    public Evento(String nombre) {
        this.nombre = nombre;
    }

    public void registrarNotificacion(EventoNotificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void activar() {
        if (notificacion != null) {
            notificacion.notificar("Evento activado: " + nombre);
        }
    }
}