
package contabancaria;

/**
 *
 * @author Aluno
 */
public class Cliente1 {
    public static void main (String[] args){
            Contabancaria Robson;
            Robson= new Contabancaria();
            Robson.cliente="Robson Alves";
            Robson.saldo=(2000);
            Robson.limite=(4000);
            Robson.senha=(4147);
            Robson.numero=(555657);
            Robson.depositar (100);
            Robson.sacar (500);
}
}
    
