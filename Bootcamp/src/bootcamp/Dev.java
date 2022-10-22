/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bootcamp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author Yago_
 */
public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
 
    public void increverBootCamp(Bootcampo bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    }
    
    public void pogredir(){
     Optional <Conteudo> conteudo =  this.conteudoInscritos.stream().findFirst();
    if(conteudo.isPresent()){
        this.conteudosConcluidos.add(conteudo.get());
        this.conteudoInscritos.remove(conteudo.get());
        
    }else{
        System.out.println("Você não está matriculado em nenhum conteudo");
    }
    }
    
    public double calcTotalXP(){
    return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcXP()).sub();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    

}

