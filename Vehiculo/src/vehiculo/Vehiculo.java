/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import otros.Chasis;
import otros.Motor;
import otros.Llanta;

/**
 *
 * @author Escuela
 */
public class Vehiculo {
    private float precio;
    private String marca;
    private String modelo;
    private Chasis chasis1;
    private Motor motor1;
    private Llanta llanta1;

    public Vehiculo() {
    }

    public Vehiculo(float pre, String mc, String mod, Chasis ch1, Motor m1, Llanta ll1) /*parámetro*/ {
        this.precio = pre;
        this.marca = mc;
        this.modelo = mod;
        this.chasis1 = ch1;
        this.motor1 = m1;
        this.llanta1 = ll1;
        
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo; 
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Chasis getChasis1() {
        return this.chasis1;
    }

    public void setChasis1(Chasis ch) {
        this.chasis1 = ch;
    }

    public Motor getMotor1() {
        return motor1;
    }

    public void setMotor1(Motor m) {
        this.motor1 = m;
    }

    
    public Llanta getLlanta1() {
        return llanta1;
    }

    public void setLlanta1(Llanta ll) {
        this.llanta1 = ll;
    }
    
    public void encender (){
        System.out.println("Encendiendo vehículo...");
            
    }
    public void apagar (){
        System.out.println("Apagando vehículo...");
    }
    
    public static void main(String[] args) {
        Vehiculo vehi1 = new Vehiculo ();
        vehi1.setMarca("Ford");
        vehi1.setModelo("Fiesta");
        vehi1.setPrecio(49000);
        
        vehi1.setChasis1(new Chasis("Monocasco",2999,"Metal"));
        vehi1.setMotor1(new Motor (3397,320,4));
        vehi1.setLlanta1(new Llanta (1000,"Firestone",223));   
        System.out.println("Este vehículo tiene las siguientes características:\n- Marca: "+vehi1.getMarca()+"\n- Modelo: "+vehi1.getModelo()+"\n- Precio: $"+vehi1.getPrecio());
        System.out.println("\nCaracterísticas del chasis:\n- Tipo: "+vehi1.getChasis1().getTipoDeChasis()+"\n- Costo: $"+vehi1.getChasis1().getCosto()+"\n- Material: "+vehi1.getChasis1().getMaterial());
        System.out.println("\nCaracterísticas del motor:\n- Costo: $"+vehi1.getMotor1().getCosto()+"\n- Potencia: "+vehi1.getMotor1().getPotencia()+" Hp"+"\n- Número de cilindros: "+vehi1.getMotor1().getNoCilindros());
        System.out.println("\nCaracterísticas de las llantas:\n- Costo: $"+vehi1.getLlanta1().getCosto()+"\n- Marca: "+vehi1.getLlanta1().getMarca()+"\n- Ancho de la llanta: "+vehi1.getLlanta1().getAnchoDeLlanta()+" milímetros\n");
        
        vehi1.encender();
        vehi1.getMotor1().encender();
        vehi1.getChasis1().conectarRuedas();
        vehi1.getChasis1().soportarPeso();
        vehi1.getLlanta1().rodar();
        vehi1.getLlanta1().amortiguar();
        vehi1.getMotor1().apagar();
        vehi1.apagar();
    }
  
}
