import java.util.Random;

public class funcoes {

	//tela1
	public static double tela1(String num1, String num2) {
		
		double result, valor1 = Double.parseDouble(num1), valor2 = Double.parseDouble(num2);
		
		result = valor1 - (valor1/100*valor2);
		
		return(result);
	}
	
	
	//tela2
	public static double tela2(String num1, String num2) {
		
		double result, valor1 = Double.parseDouble(num1), valor2 = Double.parseDouble(num2);
		
		result = valor1 + (valor1/100*valor2);
		
		return(result);
	}
	
	
	//tela3
	public static double tela3(String num1, String num2) {
		
		double result, valor1 = Double.parseDouble(num1), valor2 = Double.parseDouble(num2);
		
		result = (valor2*valor1) / 100;
		
		return(result);
	}
	
	
	//tela4
	public static double tela4(String num1, String num2) {
		
		double result, valor1 = Double.parseDouble(num1), valor2 = Double.parseDouble(num2);
		
		result = valor1/(valor2/100);
		
		return(result);
	}
	
	
	//tela5
	public static double tela5(String num1, String num2) {
		
		double result, valor1 = Double.parseDouble(num1), valor2 = Double.parseDouble(num2);
		
		result = ((valor1 - valor2)/ valor1) *100;
		
		return(result);
	}
	
	
	//tela6
	public static double tela6(String num1, String num2) {
		
		double result, valor1 = Double.parseDouble(num1), valor2 = Double.parseDouble(num2);
	
			result = (valor2-valor1)/(valor1/100);
				
		return(result);
	}
	
	
	//tela7
	public static double tela7(String num1, String num2) {
	
		double result, valor1 = Double.parseDouble(num1), valor2 = Double.parseDouble(num2);
		
		result = (valor1/(100-valor2)*valor2)+valor1;
			
		return(result);
	}
	
	
	//tela8
	public static double tela8(String num1, String num2, String num3) {

		double result, valor1 = Double.parseDouble(num1), valor2 = Double.parseDouble(num2), valor3 = Double.parseDouble(num3);
		
		result = (valor2 * valor3)/valor1;
			
		return(result);
	}
	
	
	//tela9
	public static String tela9(Boolean mai, Boolean min , Boolean num ,Boolean simb , int tam) {
		
		 	final String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
		    final String NUMEROS = "0123456789";
		    final String SIMBOLOS = "!@#$%&*()-_=+[]{}<>/?";
		    final String SELETORES = "1234";
		    
		    StringBuilder senha = new StringBuilder(tam);
		    
		    
		    if(!mai && !min && !num && !simb) {
		    	return "Nenhuma opção selecionada";
		    }
		    if(tam==0) {
		    	return "Tamanho não selecionado";
		    }
		    
		    Random random = new Random();
		    
		    
		    //looping para criar a senha(quebra quando o array ficar maior q o tamanho selecionado
		    for(int i=0 ; i<tam ; i++) {
		    	
		    	int temp = 1;
		    	
		    	
		    	//SELECIONADOR RANDOMICO DE CARACTERES
		    	while(temp != 0) {
		    		//selecionar o tipo do caracter
		    		int tam_selet = SELETORES.length();
		    		int selecao = random.nextInt(tam_selet);
		    		
		    		if(selecao == 0 && mai) {
		    			
		    			//define o tamanho do array de maiusculas
		    			int tam_MAIUSCULAS = MAIUSCULAS.length();
		    			
		    			//seleciona a letra random de dentro do array
		    			int letra = random.nextInt(tam_MAIUSCULAS);
		    			
		    			//concatena na variavel senha
				    	senha.append(MAIUSCULAS.charAt(letra));
				    	
				    	//quebra o while
				    	temp = 0;
				    	
		    		}else if(selecao == 1 && min) {

		    			//define o tamanho do array de minusculas
		    			int tam_MINUSCULAS = MINUSCULAS.length();
		    			
		    			//seleciona a letra random de dentro do array
		    			int letra = random.nextInt(tam_MINUSCULAS);
		    			
		    			//concatena na variavel senha
				    	senha.append(MINUSCULAS.charAt(letra));
				    	
				    	//quebra o while
				    	temp = 0;
				    	
		    		}else if(selecao == 2 && num) {

		    			//define o tamanho do array de numeros
		    			int tam_NUMEROS = NUMEROS.length();
		    			
		    			//seleciona o numero random de dentro do array
		    			int letra = random.nextInt(tam_NUMEROS);
		    			
		    			//concatena na variavel senha
				    	senha.append(NUMEROS.charAt(letra));
				    	
				    	//quebra o while
				    	temp = 0;
		    		}else if(selecao == 3 && simb) {

		    			//define o tamanho do array de SIMBOLOS
		    			int tam_SIMBOLOS = SIMBOLOS.length();
		    			
		    			//seleciona o simbolo random de dentro do array
		    			int letra = random.nextInt(tam_SIMBOLOS);
		    			
		    			//concatena na variavel senha
				    	senha.append(SIMBOLOS.charAt(letra));
				    	
				    	//quebra o while
				    	temp = 0;
				    }else {
				    	temp = 1;
				    }
		    		
		    	}
		    }
		    	
		    
		return senha.toString();
	}
	
	
	
}