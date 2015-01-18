package application;

import swing.MoneyDisplay;
import swing.ApplicationFrame;;
import control.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Currency;
import model.CurrencySet;
import mock.CurrencySetLoader;
import mock.ExchangeRateLoader;

public class Application {
    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        final ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        frame.register(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                Currency from = frame.getExchangeDialog().getExchange().getMoney().getCurrency();
                Currency to = frame.getExchangeDialog().getExchange().getCurrency();
                ExchangeOperation operation = new ExchangeOperation(frame.getExchangeDialog(), new MoneyDisplay(frame), new ExchangeRateLoader().load(from, to));
                operation.execute();
            }
        });
    }
}
