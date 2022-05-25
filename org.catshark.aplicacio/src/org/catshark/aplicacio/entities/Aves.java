package org.catshark.aplicacio.entities;

import java.time.LocalDate;

public class Aves extends Especies{
    private String velocitat;
    private static int counter = 0;
    public Aves(String nom, String habitat, String nubosidad, String fuerza_viento, String direccion_viento,
                String sexo, String temperatura, String profunditat, String mida, String pes, String parasitos, String fecha, String velocitat){
        super(nom, habitat, nubosidad, fuerza_viento, direccion_viento, sexo, temperatura, profunditat, mida, pes, parasitos, fecha);
        this.setVelocitat(velocitat);
        counter++;
    }

    public String getVelocitat() {
        return this.velocitat;
    }

    public void setVelocitat(String velocitat) {
        this.velocitat = velocitat;
    }
}
