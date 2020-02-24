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
public class Motor {
    private float costo;
    private int potencia; //caballos de fuerza hp
    private int noCilindros;
    
    public Motor (){
   }
    
   public Motor (float costo, int pot, int cilindros){
       this.costo=costo;
       this.potencia=pot;
       this.noCilindros=cilindros;
   } 

    public float getCosto() {
        return costo;
    }

    public void setCosto(float cos) {
        this.costo = cos;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNoCilindros() {
        return noCilindros;
    }

    public void setNoCilindros(int cilindros) {
        this.noCilindros = cilindros;
    }
   
    public void encender (){
        System.out.println("Encendiendo motor...");
    }
    
    public void apagar (){
        System.out.println("Apagando motor...");
    }
    
}
