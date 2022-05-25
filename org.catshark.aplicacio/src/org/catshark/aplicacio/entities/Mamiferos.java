package org.catshark.aplicacio.entities;
import java.time.LocalDate;

public class Mamiferos extends Especies{
    private String tipus; //placentarios, los marsupiales y los monotremas
    private static int counter = 0;
    public Mamiferos(String nom, String habitat, String nubosidad, String fuerza_viento, String direccion_viento,
                     String sexo, String temperatura, String profunditat, String mida, String pes, String parasitos, String fecha, String tipus){
        super(nom, habitat, nubosidad, fuerza_viento, direccion_viento, sexo, temperatura, profunditat, mida, pes, parasitos, fecha);
        this.setTipus(tipus);
        counter++;
    }

    public String getTipus() {
        return this.tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}
