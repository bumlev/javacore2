package abstractFactory.factories;

import abstractFactory.classes.IPhoneCamera;
import abstractFactory.classes.IPhoneDisplay;
import abstractFactory.interfaces.ICamera;
import abstractFactory.interfaces.IDisplay;
import abstractFactory.interfaces.IMobileComponentFactory;

public class IPhoneFactory implements IMobileComponentFactory {

    public IPhoneFactory(){
        System.out.println("🎉 Manufacturing IPhone 🎉");
    }

    @Override
    public ICamera createCamera() {
        return new IPhoneCamera();
    }

    @Override
    public IDisplay createDisplay() {
        return new IPhoneDisplay();
    }
}
