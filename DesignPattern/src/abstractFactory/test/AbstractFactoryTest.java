package abstractFactory.test;

import abstractFactory.classes.Mobile;
import abstractFactory.exception.InvalidMobile;
import abstractFactory.factories.IPhoneFactory;
import abstractFactory.factories.OnePlusFactory;
import abstractFactory.interfaces.IMobileComponentFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) throws InvalidMobile {
        String os = "android";

//        Building a Mobile using Camera & Display Components
        IMobileComponentFactory mobileComponentFactory = switch (os.toLowerCase()){
            case "ios" -> new IPhoneFactory();
            case "android" -> new OnePlusFactory();
            default -> throw new InvalidMobile();
        };

//        Using manufactured Mobile and testing its functionalities like recording videos, capturing photos, setting display fps, etc
        Mobile mobile = new Mobile(mobileComponentFactory);
        mobile.photo();
        mobile.video("8k");
        mobile.setDisplay(120);
    }
}
