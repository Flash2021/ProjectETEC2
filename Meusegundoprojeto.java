package com.mycompany.ms2;

import javax.swing.JOptionPane;


public class Ms2 {

   public static void main(String args[]) {
        
        //Variaveis.
     String valorcompra;
     double compra, desconto, total_compra;
     
     //entrada de dados.
     valorcompra = JOptionPane.showInputDialog("Digite o valor da compra");
     
     //conversão do Sting para Double.
     compra = Double.parseDouble(valorcompra);
    
     //Cálculo do desconto de 5%.
     if (compra <=199.99) {
        desconto = compra * 5/100;
        total_compra = compra - desconto;
    
        //Resultado dos 5% pela interface gráfica.
    JOptionPane.showMessageDialog(null,"Valor do desconto: " + desconto);
    JOptionPane.showMessageDialog(null,"Valor total a pagar: " +total_compra);
      
     }
    
     //Cálculo do desconto de 10%, nesse foi necessario isolar ele usando um valor minimo e um maximo. 
    if (compra >=200.0 && compra <300.0){
        desconto = compra * 10/100;
        total_compra = compra - desconto;
        
        //Resultado dos 10% pela interface gráfica.
        JOptionPane.showMessageDialog(null,"Valor do desconto: " + desconto);
        JOptionPane.showMessageDialog(null,"Valor total a pagar: " +total_compra);
        }
       
    //Cálculo do desconto de 15%.
    if (compra >=300.0) {
         desconto = compra * 15/100;
        total_compra = compra - desconto;
        
         //Resultado dos 15% pela interface gráfica.
        JOptionPane.showMessageDialog(null,"Valor do desconto: " + desconto);
        JOptionPane.showMessageDialog(null,"Valor total a pagar: " +total_compra);
        
    }
     
    }
}
