
import javax.swing.*;

/**
 * Klasa CONTROLLER integron se bashku klaset e tjera 
 * 
 * @author Erblin.Halabaku
 *
 */
public class CONTROLLER {
	public static void main(String[] args) {
		INPUT input = new INPUT();

		MODEL model = new MODEL();
		
        boolean vazhdo = true;
        
		VIEW view = new VIEW(425, 425);
		
while(vazhdo) {
		   while (model.fitore()) {

			   input.rreshti();
			   input.kolone();
			model.levizja(input.getRresht(), input.getKolone());

			view.repaint();

			model.rendi++;
			
		   }
		   
		   int vazhdimi = JOptionPane.showConfirmDialog(null,"Deshiron me vazhdu","Loja",JOptionPane.YES_NO_OPTION);
		   
		   if(vazhdimi==0) {
			   
			   model.reset();
			   view.repaint();
			   
		   }else {vazhdo = false;}
		   
		
        }
		 model.report();
	 }
}
