package br.com.projUdemy.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    
    private int linhas;
    private int colunas;
    private int minas;
    
    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;
        
        gerarCampos();
        associarOsVizinhos();
        sortearMinas();
    }

    private void gerarCampos() {
        for (int linha = 0; linha < linhas; linha++) {
            for (int campo = 0; campo < colunas; campo++) {
                campos.add(new Campo(linha, campo));

            }

        }
    }

    private void associarOsVizinhos() {
        for (Campo c1: campos){
            for (Campo c2: campos){
                c1.adicionarVizinhos(c2);
            }
        }
    }

    private void sortearMinas() {
        int minasArmadas = 0;
    }
}
