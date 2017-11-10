/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author alex
 */
public class CalculatorController {
    
    private CalculatorView theView;
    private CalculatorModel theModel;
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel)
    {
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addCalculationListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{
        
        public void actionPerformed(ActionEvent arg0)
        {
            int firstNumber, secondNumber = 0;
            
            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                
                theModel.addNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            }
            catch(NumberFormatException ex){
                
                theView.displayErrorMessage("You need to enter 2 integers");
            }
        }
    }
    
}
