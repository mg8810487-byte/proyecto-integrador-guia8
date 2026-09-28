package com.uped.notificacion.modelo;

public class NotificacionCorreo extends Notificacion {
    private String asunto;

    public NotificacionCorreo(String destinatario, String mensaje, String asunto) {
        super(destinatario, mensaje);
        this.asunto = asunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Correo Electrónico a <" + destinatario + "> | Asunto: " + asunto + " | Cuerpo: " + mensaje);
    }
}