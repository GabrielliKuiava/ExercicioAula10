
package br.edu.fadergs.meiostransportedominio;

import javax.swing.JOptionPane;

public class Automóvel extends Veiculo{
    public double potenciaDoMotor;
    
    
   public Automóvel (){
       
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
    public int getQtdRodas() {
        return super.getQtdRodas();
    }

    @Override
    public int getVelocidade() {
        return super.getVelocidade();
    }

    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca); 
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo); 
    }

    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
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
        
        String texto="Dados do Veículo: \n Marca: " + this.marca + "\nQuantidade de rodas: " + qtdRodas + "\nModelo: " + modelo + "\nVelocidade: " + velocidade + "Potência do motor: " + potenciaDoMotor;
        JOptionPane.showMessageDialog(null, texto);
    }
  
   
}
