package org.catshark.aplicacio.entities;

/**
 * Clase Especies
 * @author Guillermo
 */
//Clase general que tiene las subclases aves, peces y mamíferos
public class Especies{
    /**
     * Atributo de la clase Especies
     */
    private String nom, habitat, nubosidad, fuerza_viento, direccion_viento, sexo, fecha, temperatura, profunditat, mida, pes, parasitos;
    //private int temperatura, profunditat;
    //private float mida, pes;
    //private boolean parasitos;
    /**
     * Contador para contar cuantas especies hay
     */
    private static int counter = 0;

    /**
     * Constructor con todos los atributos de la clase especies
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
     */
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

    /**
     * Método getter para devolver el valor de la variable 'Nom'
     * @return nom
     */
    public String getNom() {
        return this.nom;
    }
    /**
     * Método setter para establecer el valor de la variable 'Nom'
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Método getter para devolver el valor de la variable 'Habitat'
     * @return habitat
     */
    public String getHabitat() {
        return this.habitat;
    }
    /**
     * Método setter para establecer el valor de la variable 'Habitat'
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * Método getter para devolver el valor de la variable 'Nubosidad'
     * @return nubosidad
     */
    public String getNubosidad() {
        return this.nubosidad;
    }
    /**
     * Método setter para establecer el valor de la variable 'Nubosidad'
     */
    public void setNubosidad(String nubosidad) {
        this.nubosidad = nubosidad;
    }

    /**
     * Método getter para devolver el valor de la variable 'Fuerza_viento'
     * @return fuerza_viento
     */
    public String getFuerza_viento() {
        return this.fuerza_viento;
    }
    /**
     * Método setter para establecer el valor de la variable 'Fuerza_viento'
     */
    public void setFuerza_viento(String fuerza_viento) {
        this.fuerza_viento = fuerza_viento;
    }

    /**
     * Método getter para devolver el valor de la variable 'Direccion_viento'
     * @return direccion_viento
     */
    public String getDireccion_viento() {
        return this.direccion_viento;
    }
    /**
     * Método setter para establecer el valor de la variable 'Direccion_viento'
     */
    public void setDireccion_viento(String direccion_viento) {
        this.direccion_viento = direccion_viento;
    }

    /**
     * Método getter para devolver el valor de la variable 'Sexo'
     * @return sexo
     */
    public String getSexo() {
        return this.sexo;
    }
    /**
     * Método setter para establecer el valor de la variable 'Sexo'
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Método getter para devolver el valor de la variable 'Temperatura'
     * @return temperatura
     */
    public String getTemperatura() {
        return this.temperatura;
    }
    /**
     * Método setter para establecer el valor de la variable 'Temperatura'
     */
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * Método getter para devolver el valor de la variable 'Parasitos'
     * @return parasitos
     */
    public String getParasitos() {
        return this.parasitos;
    }
    /**
     * Método setter para establecer el valor de la variable 'Parasitos'
     */
    public void setParasitos(String parasitos) {
        this.parasitos = parasitos;
    }

    /**
     * Método getter para devolver el valor de la variable 'Fecha'
     * @return fecha
     */
    public String getFecha() {
        return this.fecha;
    }
    /**
     * Método setter para establecer el valor de la variable 'Fecha'
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Método getter para devolver el valor de la variable 'Profunditat'
     * @return profunditat
     */
    public String getProfunditat() {
        return this.profunditat;
    }
    /**
     * Método setter para establecer el valor de la variable 'Profunditat'
     */
    public void setProfunditat(String profunditat) {
        this.profunditat = profunditat;
    }

    /**
     * Método getter para devolver el valor de la variable 'Mida'
     * @return mida
     */
    public String getMida() {
        return this.mida;
    }
    /**
     * Método setter para establecer el valor de la variable 'Mida'
     */
    public void setMida(String mida) {
        this.mida = mida;
    }

    /**
     * Método getter para devolver el valor de la variable 'Pes'
     * @return pes
     */
    public String getPes(){
        return this.pes;
    }
    /**
     * Método setter para establecer el valor de la variable 'Pes'
     */
    public void setPes(String pes){
        this.pes = pes;
    }

    /**
     * Método que devuelve el valor del contador
     * @return counter
     */
    public static int getCounter() {
        return counter;
    }

}
