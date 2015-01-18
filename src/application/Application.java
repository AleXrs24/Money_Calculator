/*package application;

//import console.ExchangeDisplay;
import control.ExchangeOperation;
//import control.SwingExchangeOperation;
import mock.CurrencySetLoader;
import model.CurrencySet;
//import swing.ApplicationFrame;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class Application {

    public static void main(String[] args) {
        /*CurrencySet currencySet = new CurrencySetLoader().load();
        final ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        frame.register(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SwingExchangeOperation(frame.getExchangeDialog(), new ExchangeDisplay()).execute();
            }
        });
        CurrencySet currencySet = new CurrencySetLoader().load();
        ExchangeOperation operation = new ExchangeOperation(currencySet);
        operation.execute();
    }
}*/  
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
                Currency in = frame.getExchangeDialog().getExchange().getMoney().getCurrency();
                Currency out = frame.getExchangeDialog().getExchange().getCurrency();
                ExchangeOperation operation = new ExchangeOperation(frame.getExchangeDialog(), new MoneyDisplay(frame), new ExchangeRateLoader().load(in, out));
                operation.execute();
            }
        });
   
    }
}
