package process;

import model.ExchangeRate;
import model.Money;

/*import model.Exchange;
import model.ExchangeRate;
import model.Money;

public class Exchanger {

    public Money exchange(ExchangeRate exchangeRate, Exchange exchange) {
        return new Money(exchange.getMoney().getAmount() * exchangeRate.getValue(), 
                         exchange.getCurrency());
    }
}*/

public interface Exchanger {
    public Money exchange(Money money, ExchangeRate value);
}