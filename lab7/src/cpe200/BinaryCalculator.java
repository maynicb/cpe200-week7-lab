package cpe200;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.math.BigDecimal;


public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;


    public BinaryCalculator() {
        setFirstOperand(new BigDecimal(0));
        setSecondOperand(new BigDecimal(0));

    }

    public void setFirstOperand(IOperand operand) {
        setFirstOperand(new BigDecimal(operand.getOperand()));
    }

    public void setSecondOperand(IOperand operand) {
        setSecondOperand(new BigDecimal(operand.getOperand()));

    }

    public String add() throws RuntimeException {
       if(firstOperand.intValue()<0||secondOperand.intValue()<0){
           throw new RuntimeException("ERROR");
       }
        return getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException("ERROR");

        }
        return getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString();

    }

    public String multiply() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException("ERROR");

        }
        return getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();

    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException("ERROR");

        }else if(secondOperand.intValue()==0){
            throw new ArithmeticException("ERROR");
        }
        return getFirstOperand().divide(getSecondOperand(),5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException();
        }
        return getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros().toString();

    }
    public BigDecimal getFirstOperand(){
        return firstOperand;
    }
    public BigDecimal getSecondOperand(){
        return secondOperand;
    }
    public void setFirstOperand(BigDecimal firstOperand){
        this.firstOperand=firstOperand;
    }
    public void setSecondOperand(BigDecimal secondOperand){
        this.secondOperand=secondOperand;
    }

   /* private Integer Binary2Decimal(IOperand binary){
        return Integer.parseInt(binary.getOperand(),2);

    }
    private String Decimal2Binary(BigDecimal decimal){
        return Integer.toBinaryString(decimal.intValue());

    }*/



}
