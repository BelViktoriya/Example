
public class Rectangle {
	
	int width;
	int hight;
	
	public Rectangle(int width,int hight){
		this.width=width;
		this.hight=hight;
	}

	public int P(){
		return 2*(this.hight+this.width);
	}
}
