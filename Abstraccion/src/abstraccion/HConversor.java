/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author juanpablo
 */
public class HConversor extends AConversor {
    @Override
    double grado2radian(){
        return Math.toRadians(dato);
    
}
    @Override
 double farenheit2kelvin(){
    
     return  ((5*(dato-32))/9)+273.15;
 }
    
}
