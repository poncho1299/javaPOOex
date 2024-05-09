class Estudiante {

    private String name;
    private int age;
    double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;

        } else {
            System.out.println("edad invalidad");
        }

    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score > 0) {
            this.score = score;

        } else {
            System.out.println("calificacion invalidad");
        }

    }

    @Override
    public String toString() {
        return "Estudiante [name=" + name + ", age=" + age + ", score=" + score + "]";
    }

}