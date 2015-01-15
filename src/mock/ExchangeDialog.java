package mock;

import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog implements ui.ExchangeDialog{
    @Override
    public Exchange getExchange(CurrencySet currencySet) {
        return new Exchange(new Money(300, currencySet.get(1)), 
                            currencySet.get(2));
    }   
}
