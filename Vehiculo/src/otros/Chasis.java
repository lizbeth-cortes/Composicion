/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;

/**
 *
 * @author Escuela
 */
public class Chasis {
    private String tipoDeChasis;// Bastidor en columna, monocasco, Bastidor de plataforma
    private float costo;
    private String material;
    
    public Chasis (){
    }
    
    public Chasis (String tipo, float costo, String mat){
    this.tipoDeChasis=tipo;
    this.costo=costo;    
    this.material=mat;
    }

    public String getTipoDeChasis() {
        return tipoDeChasis;
    }

    public void setTipoDeChasis(String tipo) {
        this.tipoDeChasis = tipo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float co) {
        this.costo = co;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String mat) {
        this.material = mat;
    }
    
    public void conectarRuedas (){
        System.out.println("Conectando las 4 ruedas...");
    }
    
    public void soportarPeso  (){
        System.out.println("Soportando peso del vehículo...");
    }
}

