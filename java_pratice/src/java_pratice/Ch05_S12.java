package java_pratice;

import java.util.Scanner;

abstract class Shape {
	private Shape next;
	public Shape() {
		next = null;
	}
	public void setNext(Shape obj){
		next = obj;
	}
	public Shape getNext(){
		return next;
	}
	public abstract void draw();

}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}



class GraphicEditer {
	private Shape start;
	private Shape cur;
	private Shape tail;
	
	Scanner sc = new Scanner(System.in);
	
	private int menu(){
		System.out.println("1.삽입 2.삭제 3.모두보기 4.종료 >>");
		return sc.nextInt();
		
	}

	private void insert() {
		System.out.print("Line:1 Rect:2 Circle:3 >>");
		Shape newNode = null;
		switch(sc.nextInt()){
		case 1: newNode = new Line(); break;
		case 2: newNode = new Rect(); break;
		case 3: newNode = new Circle(); break;
		default : System.out.println("해당 사항 없습니다"); return;
		}
		
		// statr = null 일시 start애 newNode 대입 
		// null이 아니면 tail의 next에 대입
		if(start == null){
			start = newNode;
			tail = start;
			return;
		}
		tail.setNext(newNode);
	}
	private void delete() {
		System.out.println("삭제할 도형 선택");
		System.out.print("Line:1 Rect:2 Circle:3 >>");
		switch(sc.nextInt()){
		case 1:
		case 2:
		case 3:
		default : System.out.println("해당 사항 없습니다");
		}
	}
	private void print() {
		if(start == null){
			return;
		}
		cur = start;
		while(cur.getNext()!=null){
			cur.draw();
			cur = cur.getNext();
		}
	}
	private void finish() {
		System.out.println("종료합니다");
		System.exit(0);
	}
	public GraphicEditer(){
		while(true){
			switch(menu()){
			case 1: insert(); break;
			case 2: delete(); break;
			case 3: print(); break;	
			case 4: finish(); break;	
			default : System.out.println("해당 사항이 없습니다.");
			}
		}
	}

		public static void main(String[] args) {
			
		}
			
}