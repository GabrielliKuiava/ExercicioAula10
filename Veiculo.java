package br.edu.fadergs.meiostransportedominio;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Veiculo {
    public String marca;
    public int qtdRodas;
    public String modelo;
    public int velocidade=0;
     Scanner teclado = new Scanner(System.in);
     public int aceleração; 
     public int frear; 
    
    public void Veiculo (){
    }
    public void Veiculo(String marca, int qtdRodas, String modelo, int velocidade){
     this.marca = marca;
     this.qtdRodas = qtdRodas; 
     this.modelo = modelo;
     this.velocidade= velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
    public void imprimir(){
        
        String texto=" Dados do Veículo: \n Marca: " + this.marca + "\nQuantidade de rodas: " + qtdRodas + "\nModelo: " + modelo + "\nVelocidade: " + velocidade; 
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
    
    public void acelerar()
    {
       System.out.println("Insira a aceleração");
        int aceleração = teclado.nextInt();
        velocidade = velocidade + aceleração; 
    }
    
     public void frear()
    {
       System.out.println("Insira o freio");
        int frear = teclado.nextInt();
        velocidade = velocidade - frear; 
    }

}
