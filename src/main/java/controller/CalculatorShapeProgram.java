
package controller;
import repository.CalculatorRepository;


public class CalculatorShapeProgram {
    
    CalculatorRepository program;
    
    public CalculatorShapeProgram() {
        program = new CalculatorRepository();
    }
    
    public void run() {
        System.out.println("=====Calculator Shape Program=====");
        program.inputandcalculatorShape();
    }
    
}
