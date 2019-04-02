import java.util.Scanner; 

public class Up_Down { 
     public static void main(String[] args) { 
     int random = (int)(Math.random()*100) +1; 
     System.out.println("1~100 사이의 숫자를 컴퓨터가 골랐으니 숫자를 맞춰봐."); 
     Scanner scanner = new Scanner(System.in); 

          while(true){ 
               System.out.print("숫자 입력 >> ");
               int input = scanner.nextInt(); 
               if(random != input && random > input){ 
                    System.out.println("Up!");
               }
               else if(random != input && random < input){ 
                    System.out.println("Down!"); 
               }
               else if(random == input){ 
                    System.out.println("정답입니다!"); 
                    System.exit(0); 
               } 
          } 
     }
} 