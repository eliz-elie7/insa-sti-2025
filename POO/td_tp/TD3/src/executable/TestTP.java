package executable;

import geometrie.*;
import geometrie.conical.Ellipse;
import geometrie.polygone.Quadrilateral;
import geometrie.polygone.Rectangle;
import org.w3c.dom.css.Rect;


public class TestTP {

	public static void main(String[] args) {
		
		//Using some point constructors 
		Point p1 = new Point(5.1, 2.0, "A");
		Point p2 = new Point();
		Point p3 = new Point (1.1,6.0);
		
		System.out.println("AFFICHAGE");
		//Printing for fun
		System.out.println(p1.toString() );
		System.out.println(p1);
		Integer i;
		
		Rectangle r = new Rectangle(p1,p3);
		r.getPerimeter();
        r.draw(4);
        r.draw();

		Quadrilateral q = new Quadrilateral();
		q.draw();

		
		Quadrilateral quad = new Rectangle();
		quad.getPerimeter();

        FigureGeometrique [] listFig = new FigureGeometrique[3];
        listFig[0] = new Rectangle();
        listFig[1] = new Quadrilateral();
        listFig[2] = new Ellipse();


        for (i=0;i<=2;i++){ listFig[i].draw(); }
        ((Rectangle) listFig[0]).getPerimeter();

        //Rectangle rec = new Quadrilateral();

		//FigureGeometrique gs = new FigureGeometrique();

		/*
		for (int i = 0; i <= 2; i++) {
    	System.out.println(listFig[i].code);

		System.out.println(((Rectangle) listFig[0]).code);       // 2
		System.out.println(((Quadrilateral) listFig[1]).code);   // 1
		System.out.println(((Ellipse) listFig[2]).code);         // 3

		Rectangle r = new Rectangle();
		System.out.println(r.code);  // 2
		Quadrilateral q = new Quadrilateral();
		System.out.println(q.code);  // 1
		Ellipse e = new Ellipse();
		System.out.println(e.code);  // 3
		*/

}


	}

}
