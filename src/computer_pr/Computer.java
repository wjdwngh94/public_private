package computer_pr;

class Computer_{
	
	private String name, pd;
	private int price;
	
	public Computer_(String name, String pd, int price){
		this.name=name;
		this.pd=pd;
		this.price=price;
	}
	public void setPrice(int price){
		if(price>50000)
		{
			this.price=price;
		}
		else
		{
			return ;
		}
	}
	public void getInfo(){
		System.out.println("이름:"+ this.name);
		System.out.println("제조사:"+ this.pd);
		System.out.println("가격:" + this.price);
		System.out.println("\n");
	}
}

public class Computer {
	public static void main(String[] args) {
		
		Computer_ computer_1 = new Computer_("아티브탭", "삼성", 30000);
		Computer_ computer_2 = new Computer_("맥북air", "애플", 99900);
		Computer_ computer_3 = new Computer_("Gram", "엘지", 85000);
		
		computer_1.setPrice(333);
		
		computer_1.getInfo();
		computer_2.getInfo();
		computer_3.getInfo();
		
		
	}
}
