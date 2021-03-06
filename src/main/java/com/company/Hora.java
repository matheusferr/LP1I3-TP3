package com.company;

public class Hora {
    public Hora() {
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }

    public Hora(int hora, int min, int seg) {
        this.setHor(hora);
        this.setMin(min);
        this.setSeg(seg);
    }

    private int hora;
    private int min;
    private int seg;

    public int getHor() {
        return hora;
    }

    public void setHor(int hora) {
        if (hora < 0 || hora > 24)
            throw new IllegalArgumentException();

        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min < 0 || min > 60)
            throw new IllegalArgumentException();

        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        if (seg < 0 || seg > 60)
            throw new IllegalArgumentException();

        this.seg = seg;
    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", this.hora, this.min, this.seg);
    }

    public String getHora2() {
        int formattedHour = this.hora > 12 ? this.hora - 12 : this.hora;

        return String.format("%02d:%02d:%02d %s", formattedHour, this.min, this.seg, this.hora > 12 ? "PM" : "AM");
    }

    public int getSegundos(){
        int hoursToMin = this.hora * 60;

        int minsToSecs = (hoursToMin + this.min) * 60;

        return minsToSecs + this.seg;
    }
}
