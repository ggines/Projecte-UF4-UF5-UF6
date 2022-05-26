package org.catshark.aplicacio.entities;
/**
 * Subclase Mamiferos
 * @author Guillermo
 */
//Subclase de Especies
public class Mamiferos extends Especies{
    /**
     * Atributo de la clase Mamiferos
     */
    private String tipus; //placentarios, los marsupiales y los monotremas
    /**
     * Contador para contar cuantos mamíferos hay
     */
    private static int counter = 0;

    /**
     * Constructor con los atributos de la clase memiferos y especies
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
     * @param tipus
     */
    public Mamiferos(String nom, String habitat, String nubosidad, String fuerza_viento, String direccion_viento,
                     String sexo, String temperatura, String profunditat, String mida, String pes, String parasitos, String fecha, String tipus){
        super(nom, habitat, nubosidad, fuerza_viento, direccion_viento, sexo, temperatura, profunditat, mida, pes, parasitos, fecha);
        this.setTipus(tipus);
        counter++;
    }

    /**
     * Método getter para devolver el valor de la variable 'Tipus'
     * @return tipus
     */
    public String getTipus() {
        return this.tipus;
    }
    /**
     * Método setter para establecer el valor de la variable 'Tipus'
     */
    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}
