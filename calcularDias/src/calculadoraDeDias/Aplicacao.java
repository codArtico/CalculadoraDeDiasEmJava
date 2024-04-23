package calculadoraDeDias;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	// Primeiro passo: Instanciar tres variaveis para receber dia, mes e ano
    	int dia;
    	int mes;
    	int ano;
    	
    	//Criando a data inicial
    	
    	System.out.println("Digite o dia da Data Inicial: ");
    	dia = sc.nextInt();
    	
    	System.out.println("Digite o mes da Data Inicial: ");
    	mes = sc.nextInt();
    	
    	System.out.println("Digite o ano da Data Inicial: ");
    	ano = sc.nextInt();
    	 
        
        Data dataIni = new Data(dia,mes,ano);
        
        //Criando a data final
        System.out.println("Digite o dia da Data Final: ");
        dia = sc.nextInt();
        
        System.out.println("Digite o mes da Data Final: ");
    	mes = sc.nextInt();
    	
    	System.out.println("Digite o ano da Data Final: ");
    	ano = sc.nextInt();
    	
    	sc.close();
    	
    	// Criando a data
        Data dataFim = new Data(dia,mes,ano);

        // Calculando a diferença entre datas
        long diferencaEmDias = ChronoUnit.DAYS.between(dataIni.getData(), dataFim.getData());
        
        // Exibindo para o usuário
        System.out.println("A diferença em dias entre " + dataIni + " e " + dataFim + " é de " + diferencaEmDias + " dias.");
    }
}

