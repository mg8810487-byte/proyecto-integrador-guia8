package com.uped.notificacion;

import com.uped.notificacion.modelo.*;

public class MainNotificacion {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE NOTIFICACIONES MÓVILES ===");

        Notificacion[] listaNotificaciones = {
                new NotificacionCorreo("m.alexander@uped.edu.sv", "Su clave de acceso ha cambiado.", "Seguridad de la cuenta"),
                new NotificacionSMS("7777-8888", "Su código de verificación es 458921."),
                new NotificacionPush("MelvinA", "Tienes un nuevo mensaje en el foro.", "DEV-ANDROID-9921")
        };

        for (Notificacion n : listaNotificaciones) {
            System.out.println("--------------------------------------------------");
            n.enviar();
            n.registrarHistorial();
        }
    }
}