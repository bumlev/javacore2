package behaviorPattern;

public interface StockMarket {

    void registerObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers(String stockSymbol, double stockPrice);
    void setStockPrice(String stockSymbol, double stockPrice);
}
