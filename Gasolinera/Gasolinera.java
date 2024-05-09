class Gasolinera {
    private double galones, litros, precio;

    Gasolinera() {

    }

    public double getGalones() {
        return galones;
    }

    public void setGalones(double galones) {
        this.galones = galones;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Gasolinera [galones=" + galones + ", litros=" + litros + ", precio=" + precio + "]";
    }

    public double mostrarPrecio() {
        return this.galones * this.litros * this.precio;
    }

}