    import java.util.Random;

    public class MarkovFalha {
        public static void main(String[] args) {
            double falha = 0.0;
            double custo = 0.0;
            Random random = new Random();
            int cont = 0; // Contador de dias com falhas
    
            for (int i = 1; i <= 30; i++) {
                // Sorteia um número aleatório entre 0 e 1
                double rand = random.nextDouble();
    
                // Verifica se houve falha
                if (rand > falha) {
                    System.out.println("Dia " + i + ": N Falhou.");
                } if (rand < falha && falha >= 1.0/3.0){
                    custo += 100;
                    falha = 0; // Reinicia falha após a falha
                    cont++;
                    System.out.println("Dia " + i + ": Falha ocorreu! Custo de manut: " + custo);
                } else if (falha < 1.0/3.0 && falha >= 2.0/3.0){
                    custo += 200;
                    falha = 0; // Reinicia falha após a falha
                    cont++;
                    System.out.println("Dia " + i + ": Falha ocorreu! Custo de manut: " + custo);
                }else if ( falha < 2.0/3.0 && falha >= 3.0/3.0){
                    custo += 300;
                    falha = 0; // Reinicia falha após a falha
                    cont++;
                    System.out.println("Dia " + i + ": Falha ocorreu! Custo de manut: " + custo);
                }
                // Aumenta a falha em 1/3
                falha += 1.0 / 3.0;
            }
    
            
            System.out.println("Custo total de falhas: " + custo);
            System.out.println("Quantidade total de falhas: " + cont);
        }
    }



