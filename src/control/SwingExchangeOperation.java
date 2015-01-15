package control;

import ui.ExchangeDialog;
import ui.ExchangeDisplay;

public class SwingExchangeOperation {
    
    private final ExchangeDialog exchangeDialog;
    private final ExchangeDisplay exchangeDisplay;

    public SwingExchangeOperation(ExchangeDialog exchangeDialog, ExchangeDisplay exchangeDiplay) {
        this.exchangeDialog = exchangeDialog;
        this.exchangeDisplay = exchangeDiplay;
    }

    public void execute() {
        //exchangeDisplay.display(exchangeDialog.getExchange().getMoney());
    }
}
