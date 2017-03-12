/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame
extends JFrame {
    public TitlesFrame() {
        this.initUI();
    }
  
    private enum Shape { 
    	STAR_TYPE1(1), STAR_TYPE2(3), SQUARE(5), TRIANGLE(7), CIRCLE(9); 
    	private int value;
    	private Shape(int value) {
    		this.value = value; 
    	}
    	public int getValue(){
        return value;
    		} 
    	};
    	
    private enum Line { 
    	LINE1(1), LINE2(4), GRADIENT(7), RED_COLOR(8);
        private int value;
        private Line(int value) {
        	this.value = value; 
        	}
        public int getValue(){
           return value;
        	} 
        };

    /**
     * Configures common properties of the UI
     */
    private void initUI() {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(Shape.CIRCLE.getValue(), Line.LINE1.getValue()));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    /**
     * Main method to run application
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

        	
            @Override
            public void run() {
                TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }

}

