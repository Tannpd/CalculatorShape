
package repository;

import model.Circle;
import model.Rectangle;
import model.Triangle;
import dataacess.CalculatorDAO;

public class CalculatorRepository implements ICalculatorRepository{

    @Override
    public void inputandcalculatorShape() {
       CalculatorDAO.Instance().inputandcalculatorShape();
    }

 
}
