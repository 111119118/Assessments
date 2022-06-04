package Abstract;

public abstract class GraphicClass {
	int x,y;
	GraphicClass() {
		System.out.println("base abstract class");
	}
	void moveTo(int newx,int newy) {
		System.out.println("move to x: "+x+"and y: "+y);
	}
	abstract void draw();
	abstract void resize();
}