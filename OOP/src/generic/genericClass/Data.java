package generic.genericClass;

public class Data <Z , K>{

    private Z textValue;

    private K numberValue;

    public Z getTextValue()
    {
        return textValue;
    }

    public K getNumberValue()
    {
        return numberValue;
    }

    public void setTextValue(Z textValue)
    {
        this.textValue = textValue;
    }

    public void setNumberValue(K numberValue)
    {
        this.numberValue = numberValue;
    }

    public static void main(String args[])
    {
        Data<String , Integer> data = new Data<String , Integer>();
        data.setTextValue("Levy");
        data.setNumberValue(12);
        System.out.println(data.getTextValue());
        System.out.println(data.getNumberValue());
    }
}
