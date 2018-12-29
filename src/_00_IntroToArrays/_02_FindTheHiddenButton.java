package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;
	static JButton[] buttons;
	int hiddenbutton;

	// 1. create an array of JButtons. Don't initialize it yet. √

	// 2 create an integer variable called hiddenButton. √

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();

	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String number = JOptionPane.showInputDialog("ENTER A POSITIVE NUMBER");
		int positive = Integer.parseInt(number);
		buttons = new JButton[positive];

		// 3. Ask the user to enter a positive number and convert it to an int. √

		// 4. Initialize the array of JButtons to be the size of the int created in step √

		// 5. Make a for loop to iterate through the JButton array √
		// 6. initialize each JButton in the array √
		// 7. add the ActionListener to each JButton √
		// 8. add each JButton to the panel √
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);

		}

		// 9 add the panel to the window √
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object. √
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible. √
		window.setVisible(true);
		// 12. Give the user the instructions for the game. √
		JOptionPane.showMessageDialog(null, "Find the hidden button");
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3( use the variable positive) √
		Random r = new Random();
		hiddenbutton = r.nextInt(positive);
		// 14. Set the text of the JButton located at hiddenButton to read "ME" √
        for (int i = 0; i < buttons.length; i++) {
			if(i==hiddenbutton){
				buttons[i].setText("ME");
			}
		}
		// 15. Use Thread.sleep(100); to pause the program. √
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 16. Set the text of the JButton located at hiddenButton to be blank. √
		for (int i = 0; i < buttons.length; i++) {
			if(i==hiddenbutton){
				buttons[i].setText("");
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win. √
         if(buttons[hiddenbutton] == buttonClicked){
        	 JOptionPane.showMessageDialog(null, "YOU WIN!!!!!!!!!!!!!!!!!!!!");
         }else{
        	 JOptionPane.showMessageDialog(null, "TRY AGAIN BUDDY"); 
         }
		// 18. else tell them to try again √
	}
}
