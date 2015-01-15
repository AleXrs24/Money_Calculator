package mock;

import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader implements persistence.ExchangeRateLoader {

    @Override
    public ExchangeRate load(Currency from, Currency to) {
        return new ExchangeRate(from, to, 2);
    }
    
}
