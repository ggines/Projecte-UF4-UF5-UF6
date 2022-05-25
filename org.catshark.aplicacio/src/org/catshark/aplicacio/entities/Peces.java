package org.catshark.aplicacio.entities;
/**
 * Subclase Peces
 * @author Guillermo
 */
//Subclase de Especies
public class Peces extends Especies{
    /**
     * Atributo específicos de la clase peces
     */
    private String embarcaciones, num_anzuelos, navegacion, cebo;
    /**
     * Contador para contar cuantos peces hay
     */
    private static int counter = 0;

    /**
     * Constructor con los atributos de la clase peces y especies
     * @param nom
     * @param habitat
     * @param nubosidad
     * @param fuerza_viento
     * @param direccion_viento
     * @param sexo
     * @param temperatura
     * @param profunditat
     * @param mida
     * @param pes
     * @param parasitos
     * @param fecha
     * @param embarcaciones
     * @param num_anzuelos
     * @param navegacion
     * @param cebo
     */
    public Peces(String nom, String habitat, String nubosidad, String fuerza_viento, String direccion_viento,
                 String sexo, String temperatura, String profunditat, String mida, String pes, String parasitos, String fecha, String embarcaciones, String num_anzuelos, String navegacion, String cebo){
        super(nom, habitat, nubosidad, fuerza_viento, direccion_viento, sexo, temperatura, profunditat, mida, pes, parasitos, fecha);
        this.setNavegacion(navegacion);
        this.setEmbarcaciones(embarcaciones);
        this.setNum_anzuelos(num_anzuelos);
        this.setCebo(cebo);
        counter++;
    }

    /**
     * Método getter para devolver el valor de la variable 'Navegacion'
     * @return navegacion
     */
    public String getNavegacion() {
        return this.navegacion;
    }
    /**
     * Método setter para establecer el valor de la variable 'Navegacion'
     */
    public void setNavegacion(String navegacion) {
        this.navegacion = navegacion;
    }
    /**
     * Método getter para devolver el valor de la variable 'Embarcaciones'
     * @return embarcaciones
     */
    public String getEmbarcaciones() {
        return this.embarcaciones;
    }
    /**
     * Método setter para establecer el valor de la variable 'Embarcaciones'
     */
    public void setEmbarcaciones(String embarcaciones) {
        this.embarcaciones = embarcaciones;
    }
    /**
     * Método getter para devolver el valor de la variable 'Num_anzuelos'
     * @return num_anzuelos
     */
    public String getNum_anzuelos() {
        return this.num_anzuelos;
    }
    /**
     * Método setter para establecer el valor de la variable 'Num_anzuelos'
     */
    public void setNum_anzuelos(String num_anzuelos) {
        this.num_anzuelos = num_anzuelos;
    }
    /**
     * Método getter para devolver el valor de la variable 'Cebo'
     * @return cebo
     */
    public String getCebo() {
        return this.cebo;
    }
    /**
     * Método setter para establecer el valor de la variable 'Cebo'
     */
    public void setCebo(String cebo) {
        this.cebo = cebo;
    }
}
