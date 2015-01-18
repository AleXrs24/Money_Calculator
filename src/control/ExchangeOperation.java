package control;

import ui.MoneyDisplay;
import ui.ExchangeDialog;
import model.ExchangeRate;
import process.Exchanger;


public class ExchangeOperation {
    private final ExchangeDialog exchangeDialog;
    private final ExchangeRate exchangeRate;
    private final MoneyDisplay moneyDisplay;
    private final Exchanger exchanger;
    
    public ExchangeOperation(ExchangeDialog exchangeDialog, MoneyDisplay moneyDisplay, ExchangeRate exchangeRate) {
        this.exchangeDialog = exchangeDialog;
        this.exchangeRate = exchangeRate;
        this.moneyDisplay = moneyDisplay;
        exchanger = new Exchanger();
    }
    
    public void execute() {
        moneyDisplay.display(exchanger.exchange(exchangeDialog.getExchange().getMoney(), exchangeRate));
    }
}
