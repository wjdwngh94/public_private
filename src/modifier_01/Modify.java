package modifier_01;

class Phone{
	private String name, co;
	private int price;
	
	
	//setter & getter 자동 완성
	public Phone(String name, String co, int price){
		this.name=name;
		this.co=co;
		this.price=price;
	}
	
	public void setCo(String co){
		this.co = co;
	}
	
	public void setPrice(int price){
		if(price>100000){
			System.out.println("가격 설정이 완료되었습니다.");
			this.price = price;
		}
		else{
			System.out.println("가격 설정 오류 입니다.");
			return;
		}
	}
	public void getInfo(){
		System.out.println("이름 : " + this.name);
		System.out.println("통신사 : " + this.co);
		System.out.println("가격 : " + this.price);
		System.out.println("\n");
	}
}
public class Modify {
	public static void main(String[] args) {
		
		Phone phone1 = new Phone("갤럭시5","skt",30000);
		Phone phone2 = new Phone("G3","lgt",100000);
		Phone phone3 = new Phone("아이폰6","kt",250000);
		
		phone1.setCo("SKT");
		phone2.setCo("LGT");
		phone3.setCo("KT");
		
		phone1.getInfo();
		phone2.getInfo();
		phone3.getInfo();
		
		
		
		
		
		
		
	}
}
