package desafio.dio.arrays;

public class App {
    public static void main(String[] args) {

// TODO: Crie um Array de números inteiros:
        int[] numero = {2,3,5,7,11,13,18,34};


// TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:
        for (int i = 0; i < 8; i++) {

            if(i== -1)
            {
                return;
            }
            if(numero[i] %2 ==0)
            {
                System.out.printf("%d\n",numero[i]);
            }

        }

    }

}

