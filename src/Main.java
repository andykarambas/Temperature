public class Main {

    public static final int numberOfPatients = 30;

    public static final float minimumPatientTemperature = 32f;
    public static final float maximumPatientTemperature = 40f;

    public static final float minimumTemperatureOfHealthyPatients = 36.2f;
    public static final float maximumTemperatureOfHealthyPatients = 36.9f;

    private static float averageTemperatureInTheHospital(float[] allTemperatures) {
        float temperatures = 0;
        for (float allTemperature : allTemperatures) {
            temperatures = temperatures + allTemperature;
        }
        return temperatures / allTemperatures.length;
    }//Метод вычисляющий среднюю температуру по больнице

    private static int numberOfHealthyPatients(float[] allTemperatures) {
        int healthyPatients = 0;
        for (float allTemperature : allTemperatures) {
            if (allTemperature >= minimumTemperatureOfHealthyPatients && allTemperature <= maximumTemperatureOfHealthyPatients) {
                healthyPatients = healthyPatients + 1;
            }
        }
        return healthyPatients;
    }//Метод вычисляющий количество здоровых пациентов

    private static void printTemperatures(float[] allTemperatures) {
        for (int i = 0; i < allTemperatures.length; i++) {
            System.out.println("Температура пациента № " + (i + 1) + " - " + allTemperatures[i]);
        }
    }//Метод распечатывающий температуры пациентов

    public static void main(String[] args) {

        float[] patientTemperature = new float[numberOfPatients];//Создаем массив

        for (int i = 0; i < numberOfPatients; i++) {
            patientTemperature[i] = minimumPatientTemperature + ((float) Math.random() * (maximumPatientTemperature - minimumPatientTemperature));
        }//Наполняем массив

        printTemperatures(patientTemperature);//Распечатываем массив

        System.out.println("\nКоличество здоровых пациентов - " + numberOfHealthyPatients(patientTemperature));

        System.out.println("\nСредняя температура по больнице - " + averageTemperatureInTheHospital(patientTemperature));
    }
}