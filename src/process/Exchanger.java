package process;

import model.Exchange;
import model.ExchangeRate;
import model.Money;

public class Exchanger {
    public Money exchange(Money money, ExchangeRate exchangeRate) {
        return new Money(money.getAmount() * exchangeRate.getValue(), 
                         exchangeRate.getTo());
    }
}
