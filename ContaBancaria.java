
package contabancaria;

public class ContaBancaria {
int numero;
double senha;
String cliente;
double saldo, limite;
int Quant_parcelas;
   

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
      void emprestar(double quantidade){
       double total=0;
       total= quantidade+(quantidade*5)/100;
       total= total/this.Quant_parcelas;
       this.saldo+=quantidade;
          System.out.println("Valor emprestado:"+ quantidade);
          System.out.println("Valor da parcela:"+ total);
          System.out.println("Saldo com o empréstimo:"+ this.saldo);
      }
}


    
           
    
    



