package org.catshark.aplicacio.entities;

import java.time.LocalDate;

public class Peces extends Especies{
    private String embarcaciones, num_anzuelos, navegacion, cebo;
    private static int counter = 0;

    public Peces(String nom, String habitat, String nubosidad, String fuerza_viento, String direccion_viento,
                 String sexo, String temperatura, String profunditat, String mida, String pes, String parasitos, String fecha, String embarcaciones, String num_anzuelos, String navegacion, String cebo){
        super(nom, habitat, nubosidad, fuerza_viento, direccion_viento, sexo, temperatura, profunditat, mida, pes, parasitos, fecha);
        this.setNavegacion(navegacion);
        this.setEmbarcaciones(embarcaciones);
        this.setNum_anzuelos(num_anzuelos);
        this.setCebo(cebo);
        counter++;
    }

    public String getNavegacion() {
        return this.navegacion;
    }

    public void setNavegacion(String navegacion) {
        this.navegacion = navegacion;
    }

    public String getEmbarcaciones() {
        return this.embarcaciones;
    }

    public void setEmbarcaciones(String embarcaciones) {
        this.embarcaciones = embarcaciones;
    }

    public String getNum_anzuelos() {
        return this.num_anzuelos;
    }

    public void setNum_anzuelos(String num_anzuelos) {
        this.num_anzuelos = num_anzuelos;
    }

    public String getCebo() {
        return this.cebo;
    }

    public void setCebo(String cebo) {
        this.cebo = cebo;
    }
}
