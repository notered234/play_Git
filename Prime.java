import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Prime extends JFrame // Ä~©Óµ¡¤f
{
	public static void main(String[] args){
		Prime f = new Prime();
			
	}
	
	public Prime(){
		init();
		setSize(400,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void init(){
		
		setLayout(null);
		setSize(400,350);
		btnCalculate.setLabel("Calculate");
		getContentPane().add(btnCalculate);
		btnCalculate.setBackground(java.awt.Color.lightGray);
		btnCalculate.setBounds(36, 96, 98, 26);
		label1.setText("Enter a number ");
		getContentPane().add(label1);
		label1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label1.setBounds(36, 24, 180, 12);
		label2.setText("to calculate prime number");
		getContentPane().add(label2);
		label2.setFont(new Font("Dialog", Font.PLAIN, 12));
		label2.setBounds(36, 36, 180, 12);
		label3.setText("(Default=100)");
		getContentPane().add(label3);
		label3.setFont(new Font("Dialog", Font.PLAIN, 12));
		label3.setBounds(36, 48, 180, 12);
		getContentPane().add(txtAnswer);
		txtAnswer.setFont(new Font("Dialog", Font.PLAIN, 24));
		txtAnswer.setBounds(216, 24, 85, 42);
		txtAnswer.setText("100");
		listDisp.setFont(new Font("Dialog", Font.PLAIN, 16));
		getContentPane().add(listDisp);
		listDisp.setBounds(36, 144, 272, 106);


		SymAction lSymAction = new SymAction();
		btnCalculate.addActionListener(lSymAction);

		
	}
		
		
	
	
	java.awt.Button btnCalculate = new java.awt.Button();
	java.awt.Label label1 = new java.awt.Label();
	java.awt.Label label2 = new java.awt.Label();
	java.awt.Label label3 = new java.awt.Label();
	java.awt.TextField txtAnswer = new java.awt.TextField();
	java.awt.List listDisp = new java.awt.List(0);

	class SymAction implements java.awt.event.ActionListener{
		public void actionPerformed(java.awt.event.ActionEvent event){
			Object object = event.getSource();
			btnCalculate_PrimeCalculate(event);
		}
	}
	
	void btnCalculate_PrimeCalculate(java.awt.event.ActionEvent event){
		String str = txtAnswer.getText();
		double d = Double.valueOf(str).doubleValue();
		int dTemp = (int)d;
		String primeNum = "Prime Number less than "+dTemp +" have : ";
		Boolean []numIndex = new Boolean[dTemp-1];
		Arrays.fill(numIndex,Boolean.FALSE);
		for(int idx = 2; idx*idx <= d; idx++){
			for (int idxTemp = idx+1; idxTemp <= d; idxTemp++){
				if(idxTemp%idx==0){
					numIndex[idxTemp-2]=true;
				}
			}
		}
		for(int idxFinal = 2; idxFinal <= d ; idxFinal++ ){
			if (numIndex[idxFinal-2]==false){
				primeNum = primeNum + idxFinal+" ";
			}
		}
		listDisp.add(primeNum);
	}
}