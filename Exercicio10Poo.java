
package br.edu.fadergs.meiostransportedominio;

public class Exercicio10Poo {

    public static void main(String[] args) {
       
        Veiculo vei = new Veiculo(); 
        vei.acelerar();
        vei.frear();
        vei.imprimir();
        
        Carro car= new Carro(); 
        car.acelerar();
        car.frear();
        car.imprimir();
        
        Moto mot= new Moto(); 
        mot.acelerar();
        mot.frear();
        mot.imprimir();
        
        Bicicleta bic= new Bicicleta(); 
        bic.acelerar();
        bic.frear();
        bic.imprimir();
        
        Automóvel aut = new Automóvel();
        aut.acelerar();
        aut.frear();
        aut.imprimir();
    }
    
}
