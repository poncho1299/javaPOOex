import java.util.Scanner;

class MainEstudiante {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        String name;
        int age;
        double score;

        System.out.println("INGRESE SU NOMBRE: ");
        name = op.next();

        System.out.println("INGRESE SU EDAD: ");
        age = op.nextInt();
        System.out.println("INGRESE SU CALIFICACION: ");
        score = op.nextDouble();
        Estudiante x = new Estudiante();
        x.setName(name);
        x.setAge(age);
        x.setScore(score);
        System.out.println(x);
    }
}