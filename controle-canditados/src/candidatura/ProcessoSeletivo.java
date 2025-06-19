package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidatos(1900.0);
        analisarCandidatos(2100.0);
        analisarCandidatos(2000.0);
        
    }

    public static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato para outra proposta");
        }else{
            System.out.println("Aguardar demais candidatos");
        }
    }
}
