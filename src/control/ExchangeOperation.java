package control;

import mock.ExchangeDialog;
import mock.ExchangeRateLoader;
import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import process.Exchanger;
import ui.MoneyDisplay;

public class ExchangeOperation {

    public ExchangeOperation(CurrencySet currencySet) {
        Exchange  exchange = new ExchangeDialog().getExchange(currencySet);
        ExchangeRate exchangeRate = new ExchangeRateLoader().load(exchange.getMoney().getCurrency(), exchange.getCurrency());
        Money money = new Exchanger().exchange(exchangeRate, exchange);
        new MoneyDisplay().display(money);
    }
    
}
