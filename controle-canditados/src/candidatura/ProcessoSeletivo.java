package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Jaqueline","Joana", "Carlos", "Miguel", "Ana", "Pedro", "Mariana", "Rafael", "Sofia", "Lucas", "Isabela"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        
        while(candidatosSelecionados < 5 && candidatoAtual <= candidatos.length){
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+candidatos[candidatoAtual]+" pretende o salário "+salarioPretendido);
            if (salarioPretendido <= 2000){
                System.out.println("O candidato(a) "+candidatos[candidatoAtual]+" foi selecionado(a).");
                candidatosSelecionados ++;
            }
            candidatoAtual ++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidatos(double salarioPretendido){
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
