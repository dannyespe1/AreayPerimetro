
package com.espedanny.areayperimetro;

public class Cuadrilatero {
    private float lado1;
    private float lado2; 
    
    //Metodos COnstructor 1 para Cuadrialatero
    public Cuadrilatero(float lado1, float lado2){
        this.lado1=lado1; 
        this.lado2=lado2; 
    }
    //Metodo Constructor 2 para Cuadrado
    public Cuadrilatero(float lado1){
    this.lado1 = this.lado2 =lado1; 
    }
    //GETTTERS  
    public float getPerimetro(){
    float perimetro= 2*(lado1+lado2); 
    return perimetro; 
    }
    public float getArea(){
    float area=(lado1*lado2);
    return area; 
    }
}
