package model;

import java.util.Date;

public class ExchangeRate {
    private final Date date;
    private final Currency from;
    private final Currency to;
    private final double value;

    public ExchangeRate(Currency from, Currency to, double value) {
        this.from = from;
        this.to = to;
        this.value = value;
        this.date = new Date();
    }

    public Currency getFrom() {
        return this.from;
    }

    public Currency getTo() {
        return this.to;
    }

    public double getValue() {
        return this.value;
    }
    
    public Date getDate() {
        return this.date;
    } 
}
