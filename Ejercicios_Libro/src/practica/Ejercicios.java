package practica;

public class Ejercicios {
	
	public static void Ejercicio8() {
		
		int NumeroRandom = (int)(Math.random()*52); //52 letras de la A-Z,a-z.	
		char Letra;
		
		if (NumeroRandom < 26) { //si es menor que 26 va a ser MAYUS 
			Letra = (char)(NumeroRandom + 65); //65 es la A en ASCII 
		} else {//si es mayor que 26 va a ser minus
			Letra = (char)(NumeroRandom -26 +97); //(+71), 97 es la a en ASCII 
		}
		
		if(Letra=='A' || Letra =='E'|| Letra == 'I' || Letra == 'O' || Letra == 'U'|| 
				Letra=='a' || Letra =='e'|| Letra == 'i' || Letra == 'o' || Letra == 'u'){
			System.out.println("La letra '" + Letra + "' es vocal");
		}else {
			System.out.println("La letra '" + Letra + "' es consonante");
		}
		
	}
	
	public static void main(String []args) {
		Ejercicio8();
	}

}
