package calculadoraDeDias;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	
    	int dia;
    	int mes;
    	int ano;
    	
    	dia = sc.nextInt();
    	mes = sc.nextInt();
    	ano = sc.nextInt();
    	
        // Definir as duas datas
        
        Data dataIni = new Data(dia,mes,ano);
        
        dia = sc.nextInt();
    	mes = sc.nextInt();
    	ano = sc.nextInt();
    	
    	sc.close();
        Data dataFim = new Data(dia,mes,ano);

        // Calcular a diferença em dias entre as datas
        long diferencaEmDias = ChronoUnit.DAYS.between(dataIni.getData(), dataFim.getData());

        System.out.println("A diferença em dias entre " + dataIni + " e " + dataFim + " é de " + diferencaEmDias + " dias.");
    }
}

