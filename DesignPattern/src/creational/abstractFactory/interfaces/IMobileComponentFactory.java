package creational.abstractFactory.interfaces;

public interface IMobileComponentFactory {

    ICamera createCamera();
    IDisplay createDisplay();
}
