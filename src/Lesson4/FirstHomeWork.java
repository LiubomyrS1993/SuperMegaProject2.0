package Lesson4;

public class FirstHomeWork {

    public static void main(String[] args) {

        String typeAirplaneJet = "Jet";
        String typeAirplaneLiner = "Airliner";
        String modelAirplaneF = "F-22";
        String modelAirplaneAirbus = "Airbus A-737";
        String modelAirplaneBoeing = "Boeing B-777";

        int sumEcoClass1 = 100;
        int sumEcoClass2 = 150;
        int businessClass = 30;

        String buildAirplane1 = buildAirplane(typeAirplaneJet, modelAirplaneF);
        String buildAirplane2 = buildAirplane(typeAirplaneLiner, modelAirplaneAirbus, sumEcoClass1);
        String buildAirplane3 = buildAirplane(typeAirplaneLiner, modelAirplaneBoeing, sumEcoClass2, businessClass);

        System.out.println("Airplane type: " + buildAirplane1);
        System.out.println("Airplane type: " + buildAirplane2 + ", economy class passengers : " + sumEcoClass1);
        System.out.println("Airplane type: " + buildAirplane3 + ", economy class passengers : " + sumEcoClass2 + ", business class passengers : " + businessClass);


    }

    public static String buildAirplane(String airPlaneType, String airPlaneModel) {

        return airPlaneType + ", model : " + airPlaneModel;

    }

    public static String buildAirplane(String airPlaneType, String airPlaneModel, int ecoClass) {

        return airPlaneType + ", model: " + airPlaneModel + ecoClass;

    }

    public static String buildAirplane(String airPlaneType, String airPlaneModel, int ecoClass, int businessClass) {

        return airPlaneType + ", model: " + airPlaneModel + ecoClass + businessClass;

    }
}
