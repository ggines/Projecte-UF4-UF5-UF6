package org.catshark.graphics.ui;

import org.catshark.aplicacio.entities.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * Clase MyFrame
 * @author Guillermo
 */
public class MyFrame extends JFrame {
    /**
     * Variable para guardar los valores del JTextField
     */
    public String nom, habitat, nubosidad, fuerza_viento, direccion_viento, sexo, temperatura,
    profunditat, mida, pes, parasitos, fecha, velocitat, embarcaciones, num_anzuelos, navegacion,
    cebo, tipus;
    /**
     * Variable para guardar el host de la BDD (alwaysdata)
     */
    private final String server = "jdbc:mysql://mysql-wikiggines.alwaysdata.net/";
    /**
     * Variable para el usuario de la BDD
     */
    private final String user = "268265";
    /**
     * Variable para la contraseña de la BDD
     */
    private final String password = "ggines153T";

    /**
     * Método que establece el tamaño, el título y la posición de la ventana, entre otras cosas
     */
    public MyFrame(){
        this.setSize(900,600); //Establece el tamaño de la ventana
        this.setTitle("Formulario"); //Establece el título de la ventana
        this.setLocation(250,200); //Establece la posición inicial de la ventana
        panelComponents(); //Añade el método panelComponents
        this.setVisible(true); //Hace que la ventana sea visible
        this.setResizable(false); //Hace que la ventana no se pueda redimensionar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Permite finalizar el programa al cerrar la ventana
    }

    /**
     * Método que crea los componentes y el panel. También configura la posición, tamaño y otras cosas de los componentes
     */
    public void panelComponents(){
        JPanel panel = new JPanel(); //Crea un panel
        panel.setLayout(null); //Desactiva el layout por defecto para colocar los componentes en cualquier sitio
        //Creación etiquetas
        JLabel title = new JLabel("Formulario para especies",SwingConstants.CENTER);
        JLabel especie = new JLabel("*Especie");
        JLabel Jhabitat = new JLabel("*Hábitat");
        JLabel Jprofundidad = new JLabel("Profundidad (m)");
        JLabel Jnubosidad = new JLabel("*Nubosidad");
        JLabel fuerzaviento = new JLabel("*Fuerza del viento");
        JLabel direccionviento = new JLabel("*Dirección del viento");
        JLabel Jhora = new JLabel("*Hora de llegada");
        JLabel temp = new JLabel("Temperatura");
        JLabel Jsexo = new JLabel("*Sexo");
        JLabel Jparasitos = new JLabel("*Parásitos");
        JLabel size = new JLabel("*Tamaño");
        JLabel peso = new JLabel("*Peso");
        JLabel velocidad = new JLabel("Velocidad (km/h)");
        JLabel Jnavegacion = new JLabel("Tiempo navegación");
        JLabel Jembarcaciones = new JLabel("Nº embarcaciones");
        JLabel anzuelos = new JLabel("Nº anzuelos");
        JLabel Jcebo = new JLabel("Tipo de cebo");
        JLabel tipo = new JLabel("Tipo de mamífero");
        //title.setOpaque(true);
        //Coloca la posición de las etiquetas
        title.setBounds(230, 10, 450, 30);
        especie.setBounds(50,100,100,30);
        Jhabitat.setBounds(270,100,100,30);
        Jprofundidad.setBounds(50,180,200,30);
        Jnubosidad.setBounds(50,260,200,30);
        fuerzaviento.setBounds(270,260,200,30);
        direccionviento.setBounds(490,260,200,30);
        Jhora.setBounds(50,340,200,30);
        temp.setBounds(270,340,200,30);
        Jsexo.setBounds(490,340,100,30);
        Jparasitos.setBounds(650,340,200,30);
        size.setBounds(270,180,100,30);
        peso.setBounds(490,180,100,30);
        velocidad.setBounds(50,420,200,30);
        Jnavegacion.setBounds(50,420,200,30);
        Jembarcaciones.setBounds(270,420,200,30);
        anzuelos.setBounds(490,420,200,30);
        Jcebo.setBounds(650,420,200,30);
        tipo.setBounds(50,420,200,30);

        //Establece el tipo de letra y tamaño
        title.setFont(new Font("Inconsalata-g",Font.BOLD,30));
        especie.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        Jhabitat.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        Jprofundidad.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        Jnubosidad.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        fuerzaviento.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        direccionviento.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        Jhora.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        temp.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        Jsexo.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        Jparasitos.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        size.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        peso.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        velocidad.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        Jnavegacion.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        Jembarcaciones.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        anzuelos.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        Jcebo.setFont(new Font("Inconsalata-g",Font.BOLD,17));
        tipo.setFont(new Font("Inconsalata-g",Font.BOLD,17));

        //Establece el color de las etiquetas
        title.setForeground(new Color(0, 103, 180));
        especie.setForeground(new Color(0, 103, 180));
        Jhabitat.setForeground(new Color(0, 103, 180));
        Jprofundidad.setForeground(new Color(0,103,180));
        Jnubosidad.setForeground(new Color(0,103,180));
        fuerzaviento.setForeground(new Color(0,103,180));
        direccionviento.setForeground(new Color(0,103,180));
        Jhora.setForeground(new Color(0,103,180));
        temp.setForeground(new Color(0,103,180));
        Jsexo.setForeground(new Color(0,103,180));
        Jparasitos.setForeground(new Color(0,103,180));
        size.setForeground(new Color(0,103,180));
        peso.setForeground(new Color(0,103,180));
        velocidad.setForeground(new Color(0,103,180));
        Jnavegacion.setForeground(new Color(0,103,180));
        Jembarcaciones.setForeground(new Color(0,103,180));
        anzuelos.setForeground(new Color(0,103,180));
        Jcebo.setForeground(new Color(0,103,180));
        tipo.setForeground(new Color(0,103,180));
        //title.setBackground(Color.BLACK);
        //Elementos de la lista desplegable
        String [] especies = {"**Selecciona un tipo de especie**","Aves","Peces","Mamíferos"};
        String [] prsitos = {"Sí","No"};
        String [] tipos = {"Placentario","Marsupial","Monotrema"};

        //Creación de listas desplegables
        JComboBox list = new JComboBox(especies);
        JComboBox list2 = new JComboBox(prsitos);
        JComboBox list3 = new JComboBox(tipos);

        //Creación de los campos de texto
        JTextField campo_especie = new JTextField();
        JTextField campo_habitat = new JTextField();
        JTextField campo_profundidad = new JTextField();
        JTextField campo_nubosidad = new JTextField();
        JTextField campo_fuerzaviento = new JTextField();
        JTextField campo_direccionviento = new JTextField();
        JTextField campo_hora = new JTextField();
        JTextField campo_temperatura = new JTextField();
        JTextField campo_sexo = new JTextField();
        JTextField campo_size = new JTextField();
        JTextField campo_peso = new JTextField();
        JTextField campo_velocidad = new JTextField();
        JTextField campo_nav = new JTextField();
        JTextField campo_embarcaciones = new JTextField();
        JTextField campo_anzuelos = new JTextField();
        JTextField campo_cebo = new JTextField();

        //Crea el botón guardar
        JButton guardar = new JButton("Guardar");

        //Establece la posición del botón
        guardar.setBounds(50,55,100,30);

        //Establece la posición de la lista deplegable y los campos de texto
        list.setBounds(580, 60, 270,30);
        list2.setBounds(650,370,80,25);
        campo_especie.setBounds(50, 130, 170, 25);
        campo_habitat.setBounds(270,130,170,25);
        campo_profundidad.setBounds(50,210,100,25);
        campo_nubosidad.setBounds(50,290,170,25);
        campo_fuerzaviento.setBounds(270,290,170,25);
        campo_direccionviento.setBounds(490,290,170,25);
        campo_hora.setBounds(50,370,100,25);
        campo_temperatura.setBounds(270,370,100,25);
        campo_sexo.setBounds(490,370,100,25);
        campo_size.setBounds(270,210,100,25);
        campo_peso.setBounds(490,210,100,25);
        campo_velocidad.setBounds(50,450,100,25);
        campo_nav.setBounds(50,450,100,25);
        campo_embarcaciones.setBounds(270,450,100,25);
        campo_anzuelos.setBounds(490,450,100,25);
        campo_cebo.setBounds(650,450,100,25);
        list3.setBounds(50,450,200,25);

        //Establece los campos de las especies para que no sean visibles por defecto
        velocidad.setVisible(false);
        campo_velocidad.setVisible(false);
        Jnavegacion.setVisible(false);
        campo_nav.setVisible(false);
        Jembarcaciones.setVisible(false);
        campo_embarcaciones.setVisible(false);
        anzuelos.setVisible(false);
        campo_anzuelos.setVisible(false);
        Jcebo.setVisible(false);
        campo_cebo.setVisible(false);
        tipo.setVisible(false);
        list3.setVisible(false);

        //Creación de un nuevo objeto ave
        Aves ave = new Aves(nom,habitat,nubosidad,fuerza_viento,direccion_viento,sexo,temperatura,
                profunditat,mida,pes,parasitos,fecha,velocitat);
        //Creación de un nuevo objeto pez
        Peces pez = new Peces(nom,habitat,nubosidad,fuerza_viento,direccion_viento,sexo,temperatura,
                profunditat,mida,pes,parasitos,fecha,embarcaciones,num_anzuelos,navegacion,cebo);
        //Creación de un nuevo objeto mamífero
        Mamiferos mamifero = new Mamiferos(nom,habitat,nubosidad,fuerza_viento,direccion_viento,sexo,temperatura,
                profunditat,mida,pes,parasitos,fecha,tipus);

        //KeyListeners que permiten cuantos caracteres se pueden ingresar en los campos de texto
        //De esta manera se evitan errores cuando se envian los datos a mySQL
        campo_velocidad.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        //El campo velocidad solo admite 6 caracteres como máximo
                        if(campo_velocidad.getText().length() == 6){
                            e.consume();
                        }
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }

                }
        );

        campo_peso.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        //El campo peso solo admite 6 caracteres como máximo
                        if(campo_peso.getText().length() == 6){
                            e.consume();
                        }
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }

                }
        );

        campo_size.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        //El campo size solo admite 6 caracteres como máximo
                        if(campo_size.getText().length() == 6){
                            e.consume();
                        }
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }

                }
        );

        campo_profundidad.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        //El campo profundidad solo admite 4 caracteres como máximo
                        if(campo_profundidad.getText().length() == 4){
                            e.consume();
                        }
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }

                }
        );

        campo_temperatura.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        //El campo temperatura solo admite 2 caracteres como máximo
                        if(campo_temperatura.getText().length() == 2){
                            e.consume();
                        }
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }

                }
        );

        campo_anzuelos.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        //El campo anzuelos solo admite 3 caracteres como máximo
                        if(campo_anzuelos.getText().length() == 3){
                            e.consume();
                        }
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }

                }
        );

        campo_embarcaciones.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        //El campo embarcaciones solo admite 3 caracteres como máximo
                        if(campo_embarcaciones.getText().length() == 3){
                            e.consume();
                        }
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }

                }
        );

        //ActionListener para guardar los valores de los campos en variables
        //Se guardan los valores según la especie
       guardar.addActionListener(
               new ActionListener() {
                   public void actionPerformed(ActionEvent ev) {
                       //Si se selecciona 'Aves' en la lista desplegable, los valores se guardan para el objeto ave
                       if(list.getSelectedItem() == "Aves"){
                           ave.setNom(campo_especie.getText());
                           ave.setHabitat(campo_habitat.getText());
                           ave.setNubosidad(campo_nubosidad.getText());
                           ave.setFuerza_viento(campo_fuerzaviento.getText());
                           ave.setDireccion_viento(campo_direccionviento.getText());
                           ave.setSexo(campo_sexo.getText());
                           ave.setTemperatura(campo_temperatura.getText());
                           ave.setProfunditat(campo_profundidad.getText());
                           ave.setMida(campo_size.getText());
                           ave.setPes(campo_peso.getText());
                           ave.setParasitos((String)list2.getSelectedItem());
                           ave.setFecha(campo_hora.getText());
                           ave.setVelocitat(campo_velocidad.getText());
                           System.out.println("Conectando a la base de datos...");
                           //Establece la conexión con mySQL y envia los datos en la tabla aves
                           try (Connection connection = DriverManager.getConnection(server, user, password)) {
                               System.out.println("Conectado correctamente!");
                               PreparedStatement ps = connection.prepareStatement("INSERT INTO wikiggines_projecte.aves (nom,habitat,nubosidad," +
                                       "fuerza_viento,direccion_viento,sexo,temperatura,profundidad,tamaño,peso,parasitos,fecha,velocidad) " +
                                       "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                               ps.setString(1, ave.getNom());
                               ps.setString(2, ave.getHabitat());
                               ps.setString(3, ave.getNubosidad());
                               ps.setString(4, ave.getFuerza_viento());
                               ps.setString(5, ave.getDireccion_viento());
                               ps.setString(6, ave.getSexo());
                               ps.setString(7, ave.getTemperatura());
                               ps.setString(8, ave.getProfunditat());
                               ps.setString(9, ave.getMida());
                               ps.setString(10, ave.getPes());
                               ps.setString(11, ave.getParasitos());
                               ps.setString(12, ave.getFecha());
                               ps.setString(13, ave.getVelocitat());
                               ps.executeUpdate();
                               System.out.println("Se han registrado los valores");
                           } catch (SQLException e) {
                               throw new IllegalStateException("Cannot connect the database!", e);
                           }
                       }
                       //Si se selecciona 'Peces' en la lista desplegable, los valores se guardan para el objeto pez
                       else if(list.getSelectedItem() == "Peces"){
                           pez.setNom(campo_especie.getText());
                           pez.setHabitat(campo_habitat.getText());
                           pez.setNubosidad(campo_nubosidad.getText());
                           pez.setFuerza_viento(campo_fuerzaviento.getText());
                           pez.setDireccion_viento(campo_direccionviento.getText());
                           pez.setSexo(campo_sexo.getText());
                           pez.setTemperatura(campo_temperatura.getText());
                           pez.setProfunditat(campo_profundidad.getText());
                           pez.setMida(campo_size.getText());
                           pez.setPes(campo_peso.getText());
                           pez.setParasitos((String)list2.getSelectedItem());
                           pez.setFecha(campo_hora.getText());
                           pez.setEmbarcaciones(campo_embarcaciones.getText());
                           pez.setNum_anzuelos(campo_anzuelos.getText());
                           pez.setNavegacion(campo_nav.getText());
                           pez.setCebo(campo_cebo.getText());
                           System.out.println("Conectando a la base de datos...");
                           //Establece la conexión con mySQL y envia los datos en la tabla peces
                           try (Connection connection = DriverManager.getConnection(server, user, password)) {
                               System.out.println("Conectado correctamente!");
                               PreparedStatement ps = connection.prepareStatement("INSERT INTO wikiggines_projecte.peces (nom,habitat,nubosidad," +
                                       "fuerza_viento,direccion_viento,sexo,temperatura,profundidad,tamaño,peso,parasitos,fecha,embarcaciones," +
                                       "num_anzuelos,navegacion,cebo) " + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                               ps.setString(1, pez.getNom());
                               ps.setString(2, pez.getHabitat());
                               ps.setString(3, pez.getNubosidad());
                               ps.setString(4, pez.getFuerza_viento());
                               ps.setString(5, pez.getDireccion_viento());
                               ps.setString(6, pez.getSexo());
                               ps.setString(7, pez.getTemperatura());
                               ps.setString(8, pez.getProfunditat());
                               ps.setString(9, pez.getMida());
                               ps.setString(10, pez.getPes());
                               ps.setString(11, pez.getParasitos());
                               ps.setString(12, pez.getFecha());
                               ps.setString(13, pez.getEmbarcaciones());
                               ps.setString(14, pez.getNum_anzuelos());
                               ps.setString(15, pez.getNavegacion());
                               ps.setString(16, pez.getCebo());
                               ps.executeUpdate();
                               System.out.println("Se han registrado los valores");
                           } catch (SQLException e) {
                               throw new IllegalStateException("Cannot connect the database!", e);
                           }
                       }
                       //Si se selecciona 'Mamíferos' en la lista desplegable, los valores se guardan para el objeto mamífero
                       else if(list.getSelectedItem() == "Mamíferos"){
                           mamifero.setNom(campo_especie.getText());
                           mamifero.setHabitat(campo_habitat.getText());
                           mamifero.setNubosidad(campo_nubosidad.getText());
                           mamifero.setFuerza_viento(campo_fuerzaviento.getText());
                           mamifero.setDireccion_viento(campo_direccionviento.getText());
                           mamifero.setSexo(campo_sexo.getText());
                           mamifero.setTemperatura(campo_temperatura.getText());
                           mamifero.setProfunditat(campo_profundidad.getText());
                           mamifero.setMida(campo_size.getText());
                           mamifero.setPes(campo_peso.getText());
                           mamifero.setParasitos((String)list2.getSelectedItem());
                           mamifero.setFecha(campo_hora.getText());
                           mamifero.setTipus((String)list3.getSelectedItem());
                           System.out.println("Conectando a la base de datos...");
                           //Establece la conexión con mySQL y envia los datos en la tabla mamíferos
                           try (Connection connection = DriverManager.getConnection(server, user, password)) {
                               System.out.println("Conectado correctamente!");
                               PreparedStatement ps = connection.prepareStatement("INSERT INTO wikiggines_projecte.mamíferos (nom,habitat,nubosidad," +
                                       "fuerza_viento,direccion_viento,sexo,temperatura,profundidad,tamaño,peso,parasitos,fecha,tipo) "
                                       + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                               ps.setString(1, mamifero.getNom());
                               ps.setString(2, mamifero.getHabitat());
                               ps.setString(3, mamifero.getNubosidad());
                               ps.setString(4, mamifero.getFuerza_viento());
                               ps.setString(5, mamifero.getDireccion_viento());
                               ps.setString(6, mamifero.getSexo());
                               ps.setString(7, mamifero.getTemperatura());
                               ps.setString(8, mamifero.getProfunditat());
                               ps.setString(9, mamifero.getMida());
                               ps.setString(10, mamifero.getPes());
                               ps.setString(11, mamifero.getParasitos());
                               ps.setString(12, mamifero.getFecha());
                               ps.setString(13, mamifero.getTipus());
                               ps.executeUpdate();
                               System.out.println("Se han registrado los valores");
                           } catch (SQLException e){
                               throw new IllegalStateException("Cannot connect the database!", e);
                           }
                       }
                    }
                }
        );

        //ActionListener para mostrar los campos según la especie
        list.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Si se selecciona 'Aves' en la lista desplegable, solo se muestran los campos por defecto y el de aves
                        if(list.getSelectedItem() == "Aves"){
                            Jnavegacion.setVisible(false);
                            Jembarcaciones.setVisible(false);
                            anzuelos.setVisible(false);
                            Jcebo.setVisible(false);
                            tipo.setVisible(false);
                            campo_nav.setVisible(false);
                            campo_embarcaciones.setVisible(false);
                            campo_anzuelos.setVisible(false);
                            campo_cebo.setVisible(false);
                            list3.setVisible(false);
                            velocidad.setVisible(true);
                            campo_velocidad.setVisible(true);
                        }
                        //Si se selecciona 'Peces' en la lista desplegable, solo se muestran los campos por defecto y los de peces
                        else if(list.getSelectedItem() == "Peces"){
                            velocidad.setVisible(false);
                            tipo.setVisible(false);
                            campo_velocidad.setVisible(false);
                            list3.setVisible(false);
                            Jnavegacion.setVisible(true);
                            Jembarcaciones.setVisible(true);
                            anzuelos.setVisible(true);
                            Jcebo.setVisible(true);
                            campo_nav.setVisible(true);
                            campo_embarcaciones.setVisible(true);
                            campo_anzuelos.setVisible(true);
                            campo_cebo.setVisible(true);
                        }
                        //Si se selecciona 'Mamíferos' en la lista desplegable, solo se muestran los campos por defecto y el de mamíferos
                        else if(list.getSelectedItem() == "Mamíferos"){
                            velocidad.setVisible(false);
                            Jnavegacion.setVisible(false);
                            Jembarcaciones.setVisible(false);
                            anzuelos.setVisible(false);
                            Jcebo.setVisible(false);
                            campo_velocidad.setVisible(false);
                            campo_nav.setVisible(false);
                            campo_embarcaciones.setVisible(false);
                            campo_anzuelos.setVisible(false);
                            campo_cebo.setVisible(false);
                            tipo.setVisible(true);
                            list3.setVisible(true);
                        }
                        //Si la lista desplegable se deja sin seleccionar especie, solo se muestran los campos por defecto
                        else if(list.getSelectedItem() == "**Selecciona un tipo de especie**"){
                            velocidad.setVisible(false);
                            campo_velocidad.setVisible(false);
                            Jnavegacion.setVisible(false);
                            campo_nav.setVisible(false);
                            Jembarcaciones.setVisible(false);
                            campo_embarcaciones.setVisible(false);
                            anzuelos.setVisible(false);
                            campo_anzuelos.setVisible(false);
                            Jcebo.setVisible(false);
                            campo_cebo.setVisible(false);
                            tipo.setVisible(false);
                            list3.setVisible(false);
                        }
                    }
                }
        );

        this.getContentPane().add(panel); //Añade el panel
        //Añade los componentes
        panel.add(title);
        panel.add(especie);
        panel.add(Jhabitat);
        panel.add(Jprofundidad);
        panel.add(Jnubosidad);
        panel.add(fuerzaviento);
        panel.add(direccionviento);
        panel.add(Jhora);
        panel.add(temp);
        panel.add(Jsexo);
        panel.add(Jparasitos);
        panel.add(size);
        panel.add(peso);
        panel.add(velocidad);
        panel.add(Jnavegacion);
        panel.add(Jembarcaciones);
        panel.add(anzuelos);
        panel.add(Jcebo);
        panel.add(tipo);
        panel.add(list);
        panel.add(list2);
        panel.add(list3);
        panel.add(campo_especie);
        panel.add(campo_habitat);
        panel.add(campo_profundidad);
        panel.add(campo_nubosidad);
        panel.add(campo_fuerzaviento);
        panel.add(campo_direccionviento);
        panel.add(campo_hora);
        panel.add(campo_temperatura);
        panel.add(campo_sexo);
        panel.add(campo_size);
        panel.add(campo_peso);
        panel.add(campo_velocidad);
        panel.add(campo_nav);
        panel.add(campo_embarcaciones);
        panel.add(campo_anzuelos);
        panel.add(campo_cebo);
        panel.add(guardar);

    }

}

