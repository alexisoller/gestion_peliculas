/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gespelisxml_alexis;

import org.jdom2.Element;

/**
 *
 * @author vesprada
 */
public class pelicula {

    int identificador,duracion;
    String titulo,genero, sinopsis;

    public pelicula(int identificador, int duracion, String titulo, String genero, String sinopsis) {
        this.identificador = identificador;
        this.duracion = duracion;
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    public pelicula() {
    }
    

    public int getIdentificador() {
        return identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }


    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public String toString() {
        return "pelicula{" + "identificador=" + identificador + ", titulo=" + titulo + ", duracion=" + duracion + ", genero=" + genero + ", sinopsis=" + sinopsis + '}';
    }

    public void leer(Element nodo) {

        this.identificador=Integer.parseInt(nodo.getAttributeValue("id"));
        this.titulo=nodo.getChildText("titulo");
        this.duracion=Integer.parseInt(nodo.getChildText("duracion"));
        this.genero=nodo.getChildText("genero");
        this.sinopsis=nodo.getChildText("sinopsis");
     

    }
}
