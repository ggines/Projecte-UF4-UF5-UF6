package org.catshark.aplicacio.entities;

/**
 * Subclase Aves
 * @author Guillermo
 */
//Subclase de Especies
public class Aves extends Especies{
    /**
     * Atributo específico de la clase Aves
     */
    private String velocitat;
    /**
     * Contador para contar cuantas aves hay
     */
    private static int counter = 0;

    /**
     * Constructor con los atributos de la clase ave y especie
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
     * @param velocitat
     */
    public Aves(String nom, String habitat, String nubosidad, String fuerza_viento, String direccion_viento,
                String sexo, String temperatura, String profunditat, String mida, String pes, String parasitos, String fecha, String velocitat){
        super(nom, habitat, nubosidad, fuerza_viento, direccion_viento, sexo, temperatura, profunditat, mida, pes, parasitos, fecha);
        this.setVelocitat(velocitat);
        counter++;
    }

    /**
     * Método getter para devolver el valor de la variable 'Velocitat'
     * @return velocitat
     */
    public String getVelocitat() {
        return this.velocitat;
    }
    /**
     * Método setter para establecer el valor de la variable 'Velocitat'
     */
    public void setVelocitat(String velocitat) {
        this.velocitat = velocitat;
    }
}
