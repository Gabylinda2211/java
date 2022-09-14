/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

public class Contabancaria {
int numero;
double senha;
String cliente;
double saldo, limite;
   

    void depositar (double quantidade){
        this.saldo+=quantidade;
        System.out.println("deposito"+ quantidade);
        System.out.println("Saldo atual:"+ this.saldo);
        this.limite+=this.saldo;
      System.out.println("saldo + limite:"+ this.limite);
      
      
    }

      boolean sacar( double quantidade){
            if (quantidade  <this.saldo){
               this.saldo=this.saldo-quantidade;
               System.out.println("Quantidade sacada:"+ quantidade);
               System.out.println("Saldo Atual:"+this.saldo);
               return true;}
else{
    System.out.println("Não tem saldo suficiente");
    return false;
    

}
    


}

}
