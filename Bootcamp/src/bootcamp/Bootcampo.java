/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Yago_
 */
public class Bootcampo {
    private String nome;
    private String descricação;
    private final LocalDate dataIni = LocalDate.now();
    private final LocalDate dataFin = dataIni.plusDays(45);
    private Set<Dev> devsIncritos= new HashSet();
    private Set<Conteudo> conteudos = new LinkedHashSet();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricação() {
        return descricação;
    }

    public void setDescricação(String descricação) {
        this.descricação = descricação;
    }

    public Set<Dev> getDevsIncritos() {
        return devsIncritos;
    }

    public void setDevsIncritos(Set<Dev> devsIncritos) {
        this.devsIncritos = devsIncritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nome);
        hash = 73 * hash + Objects.hashCode(this.descricação);
        hash = 73 * hash + Objects.hashCode(this.dataIni);
        hash = 73 * hash + Objects.hashCode(this.dataFin);
        hash = 73 * hash + Objects.hashCode(this.devsIncritos);
        hash = 73 * hash + Objects.hashCode(this.conteudos);
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bootcampo other = (Bootcampo) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricação, other.descricação)) {
            return false;
        }
        if (!Objects.equals(this.dataIni, other.dataIni)) {
            return false;
        }
        if (!Objects.equals(this.dataFin, other.dataFin)) {
            return false;
        }
        if (!Objects.equals(this.devsIncritos, other.devsIncritos)) {
            return false;
        }
        return Objects.equals(this.conteudos, other.conteudos);
    }
    
    
}
