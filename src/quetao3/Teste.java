
package quetao3;

public class Teste {
    public static void main(String args []){
    
        Pessoa p1 = new Pessoa("dan", "rua", "000");
        System.out.println(p1.getNome());
        System.out.println(p1.getEndereco());
        System.out.println(p1.getTelefone());
        
        Fornecedor f1 = new Fornecedor("dan", "av", "111", 500, 200);
        System.out.println(f1.ObterSaldo());
        
        Empregado e1 = new Empregado("dan", "av", "111", "013", 954, 10);
        System.out.println(e1.CalcularSalario());
        
        Administrador a1 = new Administrador("dan", "av", "111",  "013", 954, 10, 200);
        System.out.println(a1.CalcularSalario());
        
        Operario o1 = new Operario("dan", "av", "111",  "013", 954, 10, 100, 5);
        System.out.println(o1.CalcularSalario());
        
    }
    
}
