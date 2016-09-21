package Lecture4;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyMain {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame frame = new JFrame();
		
		CarStage theComponent = new CarStage();
		
		frame.add(theComponent);
		
		frame.setSize(800, 400);
		frame.setTitle("Java Guru");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		while(!theComponent.getReachedBotton()){
			frame.repaint();
			Thread.sleep(100);
		}
		
		JOptionPane.showMessageDialog(null, "END OF RACE");
	}

}
