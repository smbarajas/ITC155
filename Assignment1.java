/* 
Wrote a program that will use the drawing in 4th Ed of textbook Ch Supplement 3G, Ex. 1
*/

import java.awt.Color;
import java.awt.Graphics;


public class Assignment1 {

	public static void main(String[] args) {

		
		DrawingPanel dp = new DrawingPanel(220,150);
		
		Graphics g = dp.getGraphics();
		
		//sets background
		dp.setBackground(Color.YELLOW);
		
		//draws ovals
		g.drawOval(50, 25, 40, 40);
		g.drawOval(130, 25, 40, 40);
		//fills ovals
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		
		
		//draws rectangle
		g.drawRect(70, 45, 80, 80);
		//fills rectangle
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		//draws lines
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
		g.drawLine(70, 86, 150, 86);
		
	}

}
