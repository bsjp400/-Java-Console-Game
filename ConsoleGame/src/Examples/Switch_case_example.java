package Examples;

import java.util.Scanner;

public class Switch_case_example {

	public static void main(String[] args) {

		String select;
		
		Scanner todo = new Scanner(System.in);
		
			System.out.println("--------------------------------------");
			System.out.println("          치킨을 배달시켜 먹어보자.        ");
			System.out.println(" A. 교촌 | B. bhc | C. bbq | D. 안먹는다.");			
			System.out.println("--------------------------------------");
			System.out.print("선택>>>");

			select = todo.next();

			switch (select) {
			
			case "A" : 
				System.out.println("------------------------------------");
				System.out.println("            무엇을  시킬까?            ");
				System.out.println(" A. 오리지날 | B. 허니 콤보 | C. 레드 콤보 ");
				System.out.println("------------------------------------");
				System.out.print("선택>>>");
				
				select = todo.next();							
				
					switch (select) {
				
					case "A" :						
					System.out.println("--------------");
					System.out.println(" 그냥 저냥 먹었다.");
					System.out.println("--------------");	
			
					break;
			
					case "B" :
						System.out.println("---------------");
						System.out.println(" 그냥 배불리 먹었다.");
						System.out.println("---------------");	
			
					break;
				
					case "C" :
						System.out.println("-------------------------------");
						System.out.println(" 너무 맛있게 배불리 먹었다. 또먹고 싶다.");
						System.out.println("-------------------------------");
			
					break;
						
					}
			break;

			case "B":
				System.out.println("-------------------------------------");
				System.out.println("             무엇을  시킬까?          ");
				System.out.println(" A. 핫 뿌링클 | B. 맛초킹 | C.  블랙 올리브 ");
				System.out.println("-------------------------------------");
				System.out.print("선택>>>");
		
				select = todo.next();
	
					switch (select) {
					
					case "A" :
						System.out.println("-------------------------------");
						System.out.println(" 너무 맛있게 배불리 먹었다. 또먹고 싶다.");
						System.out.println("-------------------------------");	
				
						break;
	
					case "B" :
						System.out.println("-------------------");
						System.out.println(" 그냥 저냥 배불리 먹었다.");
						System.out.println("-------------------");	
		
						break;
		
					case "C" :
						System.out.println("---------------------");
						System.out.println(" 안먹어봤는데 맛없을것 같다.");
						System.out.println("---------------------");
				
						break;
					
					}
	
			break;
			
			case "C":
				System.out.println("------------------------------------------");
				System.out.println("               무엇을  시킬까?            ");
				System.out.println(" A. 황금 올리브 | B. 자메이카 통다리 | C. 뱀파이어 ");
				System.out.println("------------------------------------------");
				System.out.print("선택>>>");
				
				select = todo.next();
				
					switch (select) {
				
					case "A" :
						System.out.println("-------------------");
						System.out.println(" 그냥 저냥 배불리 먹었다.");
						System.out.println("-------------------");
						
						break;
				
					case "B" :
						System.out.println("-------------------------------");
						System.out.println(" 너무 맛있게 배불리 먹었다. 또먹고 싶다.");
						System.out.println("-------------------------------");
					
						break;
				
					case "C" :
						System.out.println("---------------------");
						System.out.println(" 안먹어봤는데 맛없을것 같다.");
						System.out.println("---------------------");
						
						break;
					}	
			break;
			
			case "D":
				System.out.println("----------------");
				System.out.println(" 다른걸 시켜먹어보자.");
				System.out.println("----------------");

                break;
                
			}
			
       	 todo.close();
       	 
	}	
}