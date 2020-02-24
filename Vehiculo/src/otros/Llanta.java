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
public class Llanta {
    private float costo;
    private String marca;
    private int anchoDeLlanta; 
    
    public Llanta (){
    }
  
    public Llanta (float costo, String marca, int llantaA){
    this.costo=costo;
    this.marca=marca;
    this.anchoDeLlanta=llantaA; //milímetros
    }
    
    public float getCosto () {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    public String getMarca () {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnchoDeLlanta() {
        return anchoDeLlanta;
    }

    public void setAnchoDeLlanta(int llantaA) {
        this.anchoDeLlanta = llantaA;
    }
    
    public void rodar (){
        System.out.println("Rodando llantas...");
    }
    
    public void amortiguar  (){
        System.out.println("Amortiguando las irregularidades del asfalto...");
    }
    
    
    
}
