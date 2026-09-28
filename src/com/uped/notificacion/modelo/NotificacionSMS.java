package com.uped.notificacion.modelo;

public class NotificacionSMS extends Notificacion {
    private String numeroTelefono;

    public NotificacionSMS(String numeroTelefono, String mensaje) {
        super(numeroTelefono, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS al número (" + numeroTelefono + "): " + mensaje);
    }
}