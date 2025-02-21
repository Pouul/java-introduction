import java.util.Scanner;
public class App {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o numero: ");
 int numero = scanner.nextInt();
 System.out.println("a tabuada fica: ");
 for(int i=1 ; i<=10 ; i++){
   System.out.println(numero + " x " + i + " = " + numero*i);
   
 }
 scanner.close();
 }
} 