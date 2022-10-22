/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bootcamp;

import java.time.LocalDate;

/**
 *
 * @author Yago_
 */
public class Mentoria extends Conteudo{
    private LocalDate data;

    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    

    public Mentoria() {
    
        }
    
    
    

    @Override
    public double caclXP() {
        return XP_PADRAO + 20d;
    }
    
}
