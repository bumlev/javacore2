package abstractFactory.classes;

import abstractFactory.interfaces.ICamera;
import abstractFactory.interfaces.IDisplay;
import abstractFactory.interfaces.IMobileComponentFactory;

// Mobile
public class Mobile {
    private IDisplay display;
    private ICamera camera;

    private Mobile() {
    }

    public Mobile(IMobileComponentFactory mobileComponentFactory) {
        //super();
        System.out.println();
        display = mobileComponentFactory.createDisplay();
        camera = mobileComponentFactory.createCamera();
    }

    public void photo() {
        camera.captureImage();
    }

    public void video() {
        camera.recordVideo("1080");
    }

    public void video(String resolution) {
        camera.recordVideo(resolution);
    }

    public void setDisplay(){
        display.displaySettings(30);
    }

    public void setDisplay(int fps) {
        display.displaySettings(fps);
    }
}