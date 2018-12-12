/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_14;

/**
 *
 * @author fsancheztemprano
 */
public class ConversorTemperaturas {
    private final int TMIN =80;

    public ConversorTemperaturas() {
    }
    
    public float temperaturaAFarenheit(float c) throws TemperaturaErradaExcepcion{
        if(c<TMIN) throw new TemperaturaErradaExcepcion();
        else return c*9/5+32;
    }
    public float temperaturaAReamur(float c) throws TemperaturaErradaExcepcion{
        if(c<TMIN) throw new TemperaturaErradaExcepcion();
        else return c/1.25f;
    }
    
}
