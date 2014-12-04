package console;

import moneycalculator.model.Money;

public class ExchangeDisplay implements ui.ExchangeDisplay {

    @Override
    public void display(Money money) {
        System.out.println(money.getAmount() + " " + money.getCurrency());
    }
    
}
