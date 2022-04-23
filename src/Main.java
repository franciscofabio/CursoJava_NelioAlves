import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int number = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int horas = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    float valor = Float.parseFloat(st.nextToken());

   //escreva o seu código  
    float total = horas * valor;
    
    System.out.println("NUMBER = "+number);
    System.out.printf("SALARY = U$ %.2f",total);
  }
}