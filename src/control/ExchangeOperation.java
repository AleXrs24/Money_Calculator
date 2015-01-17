package control;

import mock.ExchangeDialog;
import mock.ExchangeRateLoader;
import mock.MoneyDisplay;
import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import process.Exchanger;


public class ExchangeOperation {
    private final Exchange exchange;
    private final ExchangeRate exchangeRate;
    private final MoneyDisplay moneyDisplay;
    private final Exchanger exchanger;
    
    public ExchangeOperation(CurrencySet currencySet) {
        exchange = new ExchangeDialog().getExchange(currencySet);
        exchangeRate = new ExchangeRateLoader().load(exchange.getMoney().getCurrency(), exchange.getCurrency());
        exchanger = new Exchanger();
        moneyDisplay = new MoneyDisplay();
    }
    
    public void execute() {
        moneyDisplay.display(exchanger.exchange(exchangeRate, exchange));
    }

  
}
