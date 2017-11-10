/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author alex
 */
public class CalculatorModel {
   
    private int calculationValue;
    
    public void addNumbers(int firstNumber, int secondNumber)
    {
        this.calculationValue = firstNumber + secondNumber;
    }
    
    public int getCalculationValue()
    {
        return this.calculationValue;
    }
}
