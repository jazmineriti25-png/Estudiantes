public class Estudiante {

    String matricula;
    String nombre;
    double promedio;
    int cuatrimestre;

    public static void main(String[] args) {

        // Crear un arreglo para 5 estudiantes
        Estudiante[] estudiantes = new Estudiante[5];

        // Crear los objetos Estudiante
        estudiantes[0] = new Estudiante();
        estudiantes[1] = new Estudiante();
        estudiantes[2] = new Estudiante();
        estudiantes[3] = new Estudiante();
        estudiantes[4] = new Estudiante();

        // Datos del estudiante 1
        estudiantes[0].matricula = "A001";
        estudiantes[0].nombre = "Ana";
        estudiantes[0].promedio = 9.2;
        estudiantes[0].cuatrimestre = 4;

        // Datos del estudiante 2
        estudiantes[1].matricula = "A002";
        estudiantes[1].nombre = "Yair";
        estudiantes[1].promedio = 8.5;
        estudiantes[1].cuatrimestre = 4;

        // Datos del estudiante 3
        estudiantes[2].matricula = "A003";
        estudiantes[2].nombre = "Alan";
        estudiantes[2].promedio = 9.7;
        estudiantes[2].cuatrimestre = 4;

        // Datos del estudiante 4
        estudiantes[3].matricula = "A004";
        estudiantes[3].nombre = "Hemelinda";
        estudiantes[3].promedio = 7.8;
        estudiantes[3].cuatrimestre = 4;

        // Datos del estudiante 5
        estudiantes[4].matricula = "A005";
        estudiantes[4].nombre = "Chucho";
        estudiantes[4].promedio = 8.9;
        estudiantes[4].cuatrimestre = 4;

        // Mostrar los estudiantes
        System.out.println("LISTA DE ESTUDIANTES");
        System.out.println("---------------------");

        for (int i = 0; i < estudiantes.length; i++) {

            System.out.println("Estudiante " + (i + 1));
            System.out.println("Matricula: " + estudiantes[i].matricula);
            System.out.println("Nombre: " + estudiantes[i].nombre);
            System.out.println("Promedio: " + estudiantes[i].promedio);
            System.out.println("Cuatrimestre: " + estudiantes[i].cuatrimestre);
            System.out.println("---------------------");
        }
    }
}