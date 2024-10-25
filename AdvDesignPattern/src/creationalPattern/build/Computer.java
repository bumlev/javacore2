package creationalPattern.build;

public class Computer {

    private String processor;
    private int memory;
    private int storage;
    private String graphicsCard;

    public void setProcessor(String processor){

        this.processor = processor;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getProcessor() {
        return processor;
    }

    public int getMemory() {
        return memory;
    }

    public int getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }
}
