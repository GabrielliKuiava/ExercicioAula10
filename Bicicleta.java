
package br.edu.fadergs.meiostransportedominio;

import javax.swing.JOptionPane;

public class Bicicleta extends Veiculo{
    public int numMarchas;
    public boolean bagageiro;
    
    
    public void Bicicleta (){}
   

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
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
    public void setQtdRodas(int qtdRodas) {
        super.setQtdRodas(qtdRodas); 
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    @Override
    public void setVelocidade(int velocidade) {
        super.setVelocidade(velocidade); 
    }

    @Override
    public String getMarca() {
        return super.getMarca(); 
    }

    @Override
    public String getModelo() {
        return super.getModelo(); 
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    @Override
    public int getQtdRodas() {
        return super.getQtdRodas(); 
    }

    @Override
    public int getVelocidade() {
        return super.getVelocidade(); 
    }
    
     public boolean getBagageiro() {
        return bagageiro;
    }
   
   
    @Override
     public void imprimir(){
        
        String texto="Dados do Veículo: \n Marca:" + this.marca + "\nQuantidade de rodas: " + qtdRodas + "\nModelo: " + modelo + "\nVelocidade: " + velocidade + "\nNumero de marchas: " + numMarchas + "Bagageiro: ";
        JOptionPane.showMessageDialog(null, texto);
    }
    
}