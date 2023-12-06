package com.example.conectamovil.Controller;

public class Utility {
    public static final String TABLA_USUARIO = "User";
    public static final String CAMPO_NOMBRE = "nombreContacto";
    public static final String CAMPO_EDAD = "edadContacto";
    public static final String CAMPO_CORREO = "correoContacto";
    public static final String CAMPO_NACIONALIDAD = "nacionalidadContacto";

    public static final String CREAR_TABLA_USUARIO = "CREATE TABLE " +
            TABLA_USUARIO + " (" +
            CAMPO_NOMBRE + " TEXT, " +
            CAMPO_EDAD + " TEXT, " +
            CAMPO_CORREO + " TEXT, " +
            CAMPO_NACIONALIDAD + " TEXT);";

    // Campos para la tabla Mensajeria
    public static final String TABLA_MENSAJERIA = "Mensajeria";
    public static final String CAMPO_NOMBRE_MENSAJE = "nombreMensaje";
    public static final String CAMPO_TIPO_MENSAJE = "tipoMensaje";
    public static final String CAMPO_CONTENIDO = "contenido";
    public static final String CAMPO_TIMESTAMP = "timestamp";

    // Sentencia SQL para crear la tabla Mensajeria
    public static final String CREAR_TABLA_MENSAJERIA = "CREATE TABLE " +
            TABLA_MENSAJERIA + " (" +
            CAMPO_NOMBRE_MENSAJE + " TEXT, " +
            CAMPO_TIPO_MENSAJE + " TEXT, " +
            CAMPO_CONTENIDO + " TEXT, " +
            CAMPO_TIMESTAMP + " TEXT);";

    // Campos para la tabla InformacionUsuarios
    public static final String TABLA_INFORMACION = "InformacionUsuarios";
    public static final String CAMPO_NOMBRE_USUARIO = "nombreUsuario";
    public static final String CAMPO_CORREO_USUARIO = "correoUsuario";
    public static final String CAMPO_NOMBRE_COMPLETO = "nombreCompleto";
    public static final String CAMPO_FECHA_NACIMIENTO_USUARIO = "fechaNacimientoUsuario";
    public static final String CAMPO_BIOGRAFIA_USUARIO = "biografiaUsuario";

    // Sentencia SQL para crear la tabla InformacionUsuarios
    public static final String CREAR_TABLA_INFORMACION = "CREATE TABLE " +
            TABLA_INFORMACION + " (" +
            CAMPO_NOMBRE_USUARIO + " TEXT, " +
            CAMPO_CORREO_USUARIO + " TEXT, " +
            CAMPO_NOMBRE_COMPLETO + " TEXT, " +
            CAMPO_FECHA_NACIMIENTO_USUARIO + " TEXT, " +
            CAMPO_BIOGRAFIA_USUARIO + " TEXT);";

    public static final String TABLA_CONTACTOS = "Contactos";
    public static final String CAMPO_ID_CONTACTO = "idContacto";
    public static final String CAMPO_NOMBRE_CONTACTO = "nombreContacto";
    public static final String CAMPO_TELEFONO_CONTACTO = "telefonoContacto";
    public static final String CAMPO_CORREO_CONTACTO = "correoContacto";

    // Sentencia SQL para crear la tabla Contactos
    public static final String CREAR_TABLA_CONTACTOS = "CREATE TABLE " +
            TABLA_CONTACTOS + " (" +
            CAMPO_ID_CONTACTO + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            CAMPO_NOMBRE_CONTACTO + " TEXT, " +
            CAMPO_TELEFONO_CONTACTO + " TEXT, " +
            CAMPO_CORREO_CONTACTO + " TEXT);";
}
