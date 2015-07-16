//this : 내꺼, 정확히는 내 객체 자신을 의미하는 키워드(포인터)


package day09;

class Zealot{
	String name;
	int hp;
	int speed;
	
	//생성자 오버로딩
	{
		//클래스 내부에 아무것도 없이 {,}만 적으면
		//모든 생성자에 공통적으로 적용될 내용
		
		//name = "질럿";
		
		//즉 여러개의 Zealot 생성자의 this.name을 대체한다.
	}
	Zealot(){ //기본 생성자
		
		this.name = "질럿";
		this.hp= 80;
		this.speed= 2;
		
	}
	Zealot(int hp){
		
		this(); // 내 기본 생성자 호출
		//()안이 비어있으므로 매개변수가 없는
		//바로 위에서 name, hp, speed를 따온다.
		this.hp=hp;
		this.speed=2;
	
	}
	Zealot(int hp, int speed){
	
		this(hp); // this(int) 호출
		//this(hp) 는 ()안에 int형이 하나 있으므로 
		//바로위의 zealot(int hp) 의 내용을 받아 온다.
		
		this.speed=speed;
		
	}
	
	void info(){
		System.out.println("이름 : " +name);
		System.out.println("체력 : " +hp);
		System.out.println("속도 : " +speed);
	}
}
public class Class_03 {
	public static void main(String[] args) {
		
	
	 Zealot zealot1 = new Zealot();
	 Zealot zealot2 = new Zealot(500);
	 Zealot zealot3 = new Zealot(250,10);
	 
	 zealot1.info();
	 zealot2.info();
	 zealot3.info();
	}
}
