package day09_;

import java.util.Scanner;

class Person{ // 멤버 변수 (필드 ) - name, age, ki, muge
					// 멤버 메소드 - hello, growup, setKi, setMuge, info
	
	//private로 변수를 잠근다.
	private int muge, age, ki;
	private String name;
	
	public Person(String name){ //기본 생성자
		
		this.name = name;
		this.age=1;
		this.ki= 50;
		this.muge= 10;
	}
	
	
	public void Hello(){
		System.out.println("안녕~ 난" + this.name + "이라고 해 ~");
	}
	
	public int Growup(){
		age++;
		System.out.println(age + "살이 되었습니다.");
		return age;
	}
	
	//키를 설정하는 메소드(setter 메소드)
	public void setKi(int ki){
		if(ki>0){
			this.ki=ki;
		}
	}
	
	//키를 알려주는 메소드(getter 메소드)
	public int getKi(){
		return ki; //같은 클래스 안임으로 ki에 접근 가능하다.
	}

	
	public void setMuge(int muge){
		if(muge<=0){
			return ; // 종료
		}
		this.muge=muge;
	}
	
	public void info(){ // 정보 출력
		System.out.println("이름 : " + name + "\n키 : "
									+ki + "\n몸무게 : " +muge 
									+"\n나이 : "+age+"\n");
	}
}

public class Class_04 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		Person person1 = new Person("유재석");
		Person person2 = new Person("강호동");
		Person person3 = new Person("신동엽");
		// 생성자를 통해 메인에서 따로 입력과정이 필요없다.
		
		
		person1.Hello();
		person2.Hello();
		person3.Hello();
		
		person1.Growup();
		//person1.age++; 과 동일하다.
		
		
		
		person2.setKi(100);
		//person2.ki = 100; 과 동일하다.
		//하지만 person1.ki= -100; 라고 한다면 
		//메소드의 if를 거치지않아서 원하는 결과를 얻을 수 없다.
		
		// 그래서 private 와 public 을 이용하여 
		// 사용자가 접근할 수 있는 것과 풀어주는것을 구분한다.
		// ex) 자판기 - 돈통/ 내부 부속       과      버튼, 투입구
		
		
		
		//person2.setKi=30; // setKi를 private로 설정하였기 때문에 접근 불가
		
		
		person2.setMuge(100);
		
		person1.info();
		person2.info();
		person3.info();
		
		//만약 신동엽의 키가 180이상이라면 키크네 ~ 라고 출력하고
		//아니라면 루저네 ~ 라고 출력한다.
		
		// ex. 돈 - setter(입력하는것 만 가능)    /    컵 - getter(출력하는것 만 가능)
		// 생성자 및 메소드는 public 으로 만든다.
		
		
		//if(person3.ki()>= 180) 위에서 private로 설정해두었기 때문에 읽어올 수 없다.
		if(person3.getKi()>= 180){ //그래서 getKi를 class안에두어 읽어 올 수 있도록 한다.
			System.out.println("키크네~");
		}
		else{
			System.out.println("루저네~");
		}
	}
	
}
