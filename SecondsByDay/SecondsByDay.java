class SecondsByDay {
    private int segundos;
    private double dias;

    SecondsByDay() {

    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "SecondsByDay [segundos=" + segundos + ", dias=" + dias + "]";
    }

    public double mostrarTiempo() {
        return this.dias * this.segundos;
    }

}