package org.catshark.aplicacio.entities;
import org.catshark.aplicacio.utils.Operations;

import java.time.LocalDate;
//Clase general
public class Especies implements Operations {
    private String nom, habitat, nubosidad, fuerza_viento, direccion_viento, sexo, fecha, temperatura, profunditat, mida, pes, parasitos;
    //private int temperatura, profunditat;
    //private float mida, pes;
    //private boolean parasitos;

    private static int counter = 0;

    public Especies(String nom, String habitat, String nubosidad, String fuerza_viento, String direccion_viento,
                     String sexo, String temperatura, String profunditat, String mida, String pes, String parasitos, String fecha){
        this.setNom(nom);
        this.setHabitat(habitat);
        this.setNubosidad(nubosidad);
        this.setFuerza_viento(fuerza_viento);
        this.setDireccion_viento(direccion_viento);
        this.setSexo(sexo);
        this.setTemperatura(temperatura);
        this.setProfunditat(profunditat);
        this.setMida(mida);
        this.setPes(pes);
        this.setParasitos(parasitos);
        this.setFecha(fecha);
        counter++;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getNubosidad() {
        return this.nubosidad;
    }

    public void setNubosidad(String nubosidad) {
        this.nubosidad = nubosidad;
    }

    public String getFuerza_viento() {
        return this.fuerza_viento;
    }

    public void setFuerza_viento(String fuerza_viento) {
        this.fuerza_viento = fuerza_viento;
    }

    public String getDireccion_viento() {
        return this.direccion_viento;
    }

    public void setDireccion_viento(String direccion_viento) {
        this.direccion_viento = direccion_viento;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }


    public String getParasitos() {
        return this.parasitos;
    }

    public void setParasitos(String parasitos) {
        this.parasitos = parasitos;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProfunditat() {
        return this.profunditat;
    }

    public void setProfunditat(String profunditat) {
        this.profunditat = profunditat;
    }

    public String getMida() {
        return this.mida;
    }

    public void setMida(String mida) {
        this.mida = mida;
    }

    public String getPes(){
        return this.pes;
    }

    public void setPes(String pes){
        this.pes = pes;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public int profunditatmitjana() {
        return 0;
    }

    @Override
    public float midaMin() {
        return 0;
    }

    @Override
    public float midaMax() {
        return 0;
    }


}
