package operacions;

public class Operacions {
	
	public static void main (String[] args){
		
		System.out.println(factorial_iteratiu(5));
		
	}

	private static int factorial_iteratiu(int numero) {
		int resultat =1;
			for (int i= 1; i<= numero;i++){
				
				resultat *=i;
				
			}
		return resultat;
	}
	
	

}
