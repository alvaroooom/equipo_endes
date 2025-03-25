package com.endes.entidad;
/**
 * Clase que representa a un Desarrollador, hereda de la clase abstracta Personal.
 * La productividad puede incrementarse un 10% si el lenguaje principal es "Java" o "Python".
 * 
 * Otros lenguajes no proporcionan ningún bonus adicional.
 * 
 * @author 
 */
public class Desarrollador extends Personal {
    private String lenguajePrincipal;

    /**
     * Constructor para crear un objeto Desarrollador.
     * 
     * @param dni               Documento de identidad
     * @param nombre            Nombre del desarrollador
     * @param sueldoBase        Sueldo base
     * @param lenguajePrincipal Lenguaje de programación principal
     * @throws IllegalArgumentException si el lenguaje principal es nulo o vacío
     */
    public Desarrollador(String dni, String nombre, double sueldoBase, String lenguajePrincipal) {
        super(dni, nombre, sueldoBase);
        setLenguajePrincipal(lenguajePrincipal);
    }

    /**
     * Devuelve el lenguaje de programación principal del desarrollador.
     * 
     * @return el lenguaje como String
     */
    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    /**
     * Establece el lenguaje de programación principal del desarrollador.
     * 
     * @param lenguajePrincipal nuevo lenguaje principal
     * @throws IllegalArgumentException si el lenguaje es nulo o vacío
     */
    public void setLenguajePrincipal(String lenguajePrincipal) {
        if (lenguajePrincipal == null || lenguajePrincipal.trim().isEmpty()) {
            throw new IllegalArgumentException("El lenguaje principal no puede ser nulo ni vacío.");
        }
        this.lenguajePrincipal = lenguajePrincipal;
    }

    /**
     * Calcula la productividad del desarrollador.
     * Si el lenguaje es "Java" o "Python", se incrementa un 10% el sueldo base.
     * 
     * @return productividad calculada
     */
    @Override
    public double calcularProductividad() {
        double productividad = getSueldoBase();
        if (lenguajePrincipal.equalsIgnoreCase("Java") || lenguajePrincipal.equalsIgnoreCase("Python")) {
            productividad *= 1.10;
        }
        return productividad;
    }
    
}
