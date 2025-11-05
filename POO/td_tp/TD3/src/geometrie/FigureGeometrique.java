package geometrie;

public abstract class FigureGeometrique {
	
	protected String couleur;
	private String texture;
	
	public FigureGeometrique(String col, String tex) {
		this.couleur=col;
		this.texture=tex;
	}

	public abstract double getPerimeter();
	
	public void draw(int zone) {
		System.out.println("Drawing the " + zone + " zone of a shape");
	}

    public void draw() {
        System.out.println("Drawing a geometrical shape");
    }

	public int code = 0;

}
