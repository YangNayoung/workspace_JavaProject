import java.util.Scanner; 

public class Up_Down { 
     public static void main(String[] args) { 
     int random = (int)(Math.random()*100) +1; 
     System.out.println("1~100 ������ ���ڸ� ��ǻ�Ͱ� ������� ���ڸ� �����."); 
     Scanner scanner = new Scanner(System.in); 

          while(true){ 
               System.out.print("���� �Է� >> ");
               int input = scanner.nextInt(); 
               if(random != input && random > input){ 
                    System.out.println("Up!");
               }
               else if(random != input && random < input){ 
                    System.out.println("Down!"); 
               }
               else if(random == input){ 
                    System.out.println("�����Դϴ�!"); 
                    System.exit(0); 
               } 
          } 
     }
} 