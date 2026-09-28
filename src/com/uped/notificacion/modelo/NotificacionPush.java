package com.uped.notificacion.modelo;

public class NotificacionPush extends Notificacion {
    private String idDispositivo;

    public NotificacionPush(String destinatario, String mensaje, String idDispositivo) {
        super(destinatario, mensaje);
        this.idDispositivo = idDispositivo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Notificación Push al dispositivo [" + idDispositivo + "] del usuario " + destinatario + ": " + mensaje);
    }
}