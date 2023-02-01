package br.com.projUdemy.junit.testClass.modelo;

import br.com.projUdemy.cm.modelo.Campo;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class CampoTeste {

    private Campo  campo = new Campo(3, 3);

    @Test
   public void testeVizinhoRealEsquerda(){
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinhos(vizinho);
        assertTrue(resultado);
    }
    @Test
    public void testeVizinhoRealDireita(){
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinhos(vizinho);
        assertTrue(resultado);

    }
}
