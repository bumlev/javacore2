package structural.facade.classes;

public class Main {

    public static void main(String[] args) {

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(
                                            new Lighting() ,
                                            new MusicSystem() ,
                                            new ClimateControl());

        smartHomeFacade.startEveningRoutine();
        smartHomeFacade.endEveningRoutine();

    }
}
