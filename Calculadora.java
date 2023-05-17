import java.util.Scanner;

public class Calculadora {
    
    double euros;
    double dolares;
   
    public static void main(String[] args){

        boolean salir = false;
        
        System.out.println("Pon un numero");
        Scanner sc = new Scanner(System.in);
        Scanner dol = new Scanner(System.in);
        Scanner eur = new Scanner(System.in);

        do {
            System.out.println("Elige una opcion: ");
        
            System.out.println("1. Cambio dollar/euro");
            System.out.println("2. Cambio euro/dolar");
            System.out.println("3. Salir");
        
            int numero = sc.nextInt();
        
            switch(numero){
                case 1: 
                    System.out.println("Introduce la cantidad en dolares");
                    double dolar = dol.nextDouble();
                    System.out.println(dolar * 0.91);
                    break;

                case 2:  
                    System.out.println("Introduce la cantidad en euros");
                    double euro = eur.nextDouble();
                    System.out.println(euro * 1.11);
                    break;
            
                case 3:
                    salir = true;
                    break;
            
                default:
                    System.out.println("Solo los numeros 1 y 2");
            }
        }
        while(!salir);
  }
}
