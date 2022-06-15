/*
 @author Matheus Ferreira da Costa
 * Construir a classe Hora, conforme especificação abaixo, este exercício comporá a
 * avaliação final, portanto será obrigatória sua elaboração para a prova final.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex1 {
    public static void main(String[] args) {
        Hora hora = new Hora();

        InputValidator input = new InputValidator();

        int hour = input.validInt("Hora: ");

        while (hour > 24) {
            hour = input.validInt("Hora: ");
        }

        hora.setHor(hour);

        int min = input.validInt("Minuto: ");

        while (min > 60) {
            min = input.validInt("Minuto: ");
        }

        hora.setMin(min);

        int sec = input.validInt("Segundo: ");

        while (sec > 60) {
            sec = input.validInt("Segundo: ");
        }

        hora.setSeg(sec);

        System.out.printf(
                "Hora: %02d\nMinuto: %02d\nSegundo: %02d\n",
                hora.getHor(),
                hora.getMin(),
                hora.getSeg()
        );

        System.out.println(hora.getHora1());

        System.out.println(hora.getHora2());

        System.out.println(hora.getSegundos());
    }
}
