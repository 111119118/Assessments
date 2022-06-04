package Abstract;
public class Abstraction {

	public static void main(String[] args) {
		GraphicClass rect = new Rectangle();
		rect.draw();
		rect.resize();
		GraphicClass circle = new Circle();
		circle.draw();
		circle.resize();
	}

}