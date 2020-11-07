
package br.edu.fadergs.meiostransportedominio;

import javax.swing.JOptionPane;

public class Carro extends Automóvel{
    public int qtdPortas;


    public void Carro(){
    }
   
    @Override
    public String getMarca() {
        return super.getMarca(); 
    }

    @Override
    public String getModelo() {
        return super.getModelo(); 
    }

    @Override
    public double getPotenciaDoMotor() {
        return super.getPotenciaDoMotor(); 
    }

    @Override
    public int getQtdRodas() {
        return super.getQtdRodas(); 
    }

    @Override
    public int getVelocidade() {
        return super.getVelocidade(); 
    }

    public int getQdtPortas() {
        return qtdPortas;
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca); 
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public void setPotenciaDoMotor(double potenciaDoMotor) {
        super.setPotenciaDoMotor(potenciaDoMotor); 
    }

    public void setQdtPortas(int qdtPortas) {
        this.qtdPortas = qdtPortas;
    }

    @Override
    public void setQtdRodas(int qtdRodas) {
        super.setQtdRodas(qtdRodas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setVelocidade(int velocidade) {
        super.setVelocidade(velocidade); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    @Override
     public void imprimir(){
        
        String texto="Dados do Veículo: \n Marca: " + this.marca + "\nQuantidade de rodas: " + qtdRodas + "\nModelo: " + modelo + "\nVelocidade: " + velocidade + 
                "Potência do motor: " + potenciaDoMotor + "Quantidade de portas: " + qtdPortas; 
        JOptionPane.showMessageDialog(null, texto);
    }
 
 
 
}

