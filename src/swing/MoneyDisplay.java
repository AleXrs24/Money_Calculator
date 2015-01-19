package swing;

import java.text.DecimalFormat;
import model.Money;

public class MoneyDisplay implements ui.MoneyDisplay{

    private final ApplicationFrame frame;
    private final DecimalFormat df = new DecimalFormat("0.00");
    
    public MoneyDisplay(ApplicationFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void display(Money money) {
        frame.getTextArea().getArea().setText(df.format(money.getAmount()) + " " + money.getCurrency() + "\n");
    }
}
