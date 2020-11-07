
package br.edu.fadergs.meiostransportedominio;

import javax.swing.JOptionPane;

public class Moto extends Automóvel{
    public boolean partidaEletrica;
    
    public void Moto(){
        
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
    
    public boolean getpartidaEletrica() {
        return partidaEletrica;
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca); 
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo); 
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public void setPotenciaDoMotor(double potenciaDoMotor) {
        super.setPotenciaDoMotor(potenciaDoMotor); 
    }

    @Override
    public void setQtdRodas(int qtdRodas) {
        super.setQtdRodas(qtdRodas); 
    }

    @Override
    public void setVelocidade(int velocidade) {
        super.setVelocidade(velocidade); 
    }
    
     @Override
     public void imprimir(){
        
        String texto="Dados do Veículo: \n Marca: " + this.marca + "\nQuantidade de rodas: " + qtdRodas + "\nModelo: " + modelo + "\nVelocidade: " + velocidade + 
                "Potência do motor: " + potenciaDoMotor +"Partida Elétrica: " + partidaEletrica; 
    
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
