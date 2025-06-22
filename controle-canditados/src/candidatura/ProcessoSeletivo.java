package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Jaqueline","Joana", "Carlos", "Miguel", "Ana", "Pedro", "Mariana", "Rafael", "Sofia", "Lucas", "Isabela"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        
        ArrayList<String> candidatosSelecionadosLista = new ArrayList<>();

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+candidatos[candidatoAtual]+" pretende o salário "+salarioPretendido);
            if (salarioPretendido <= 2000){
                System.out.println("O candidato(a) "+candidatos[candidatoAtual]+" foi selecionado(a).");
                candidatosSelecionados ++;
                candidatosSelecionadosLista.add(candidatos[candidatoAtual]);
            }
            candidatoAtual ++;
        }

        imprimindoSelecionados(candidatosSelecionadosLista);
        entrandoEmContato(candidatosSelecionadosLista);

    }

    static void imprimindoSelecionados( ArrayList<String> candidatosSelecionadosLista){
        for (int i = 0; i < candidatosSelecionadosLista.size(); i++ ){
            System.out.println("Índice: "+(i+1)+" Candidato: "+ candidatosSelecionadosLista.get(i));
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

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato( ArrayList<String> candidatosSelecionadosLista){
            for (int i = 0; i < candidatosSelecionadosLista.size(); i++){
                int tentativas = 0;
                boolean atendido = false;
                while(!atendido){
                    tentativas++;
                    atendido = atender();
                }

                if (tentativas <= 3){
                    System.out.println("O candidato "+candidatosSelecionadosLista.get(i)+" atendeu."+" Tentantiva: "+tentativas);

                }else{
                    System.out.println("O candidato "+candidatosSelecionadosLista.get(i)+" não atendeu");
                }
            }
    }
}
