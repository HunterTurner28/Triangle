package triangle;

public class Triangle_1 {
	float base, height, hypo;
	public Triangle_1(){
		base = 3;
		height = 4;
		hypo = 5;
	}
		
	public Triangle_1(float b, float h, float hy){
		base = b;
		height = h;
		hypo = hy;
	}
	
	public boolean isRightTriangle(){
		if(Math.sqrt(base * base + height * height) == hypo){
			return true;
		}
		else{
			return false;
		}
	}
	
	public float calcArea(){
		return ((base * height) / 2); 
	}
	
	public float calcPerimeter(){
		return (base + height + hypo);
	}

}
