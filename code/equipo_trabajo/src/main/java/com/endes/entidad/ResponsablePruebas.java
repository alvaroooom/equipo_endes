package com.endes.entidad;

/**
 * Clase ResponsablePruebas
 * 
 * @author alvmunferdaw1
 */

public class ResponsablePruebas extends Personal {
    private int bugsDetectados;
    /**
     * 
     * @param dni        Documento Nacional de Identidad del personal
     * @param nombre     Nombre del personal
     * @param sueldoBase Sueldo base del personal (debe ser mayor o igual a 0)
     * @param bugsDetectados BugsDetectados en el programa
     * @author alvmunferdaw1
     */
    
    public ResponsablePruebas(String dni, String nombre, double sueldoBase, int bugsDetectados) {
        super(dni, nombre, sueldoBase);
        setBugsDetectados(bugsDetectados);
    }
    
    /**
     * Método para obtener los Bugs detectados
     * 
     * @return los Bugs detectados
     * @author alvmunferdaw1
     */
    
    public int getBugsDetectados() {
        return bugsDetectados;
    }
    
    /**
     * Método para Setear los bugs
     * 
     * @param bugsDetectados Setea la cantidad de bugs encontrados
     * @author alvmunferdaw1
     */
    
    public void setBugsDetectados(int bugsDetectados) {
        if (bugsDetectados < 0) {
            throw new IllegalArgumentException("El número de bugs detectados no puede ser negativo.");
        }
        this.bugsDetectados = bugsDetectados;
    }
    
    /**
     * Método para Calcular la Productividad
     * 
     * @author alvmunferdaw1
     */
    
    @Override
    public double calcularProductividad() {
        return getSueldoBase() * (1 + 0.02 * bugsDetectados);
    }
}
