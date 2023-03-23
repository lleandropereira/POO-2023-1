/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entity.Cor;
import entity.Marca;
import entity.Modelo;
import entity.Veiculo;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Veiculo v = new Veiculo();
        v.setId(1);
        v.setPlaca("lelu1234");
        v.setObservacoes("Veiculo de Leandro");
        
        Cor c = new Cor();
        c.setId(2);
        c.setNome("Azul");
        
        Modelo m = new Modelo();
        m.setId(3);
        m.setDescricao("Jeep Compass");
        
        Marca mar = new Marca();
        mar.setId(4);
        mar.setNome("Jeep");
        
        m.setMarca(mar);
        v.setCor(c);
        v.setModelo(m);
        
        System.out.println(v);
    }
}
