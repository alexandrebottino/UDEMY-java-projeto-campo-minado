package br.com.projUdemy.cm.modelo;
import br.com.projUdemy.cm.excecao.ExplosaoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampoTest {
    private Campo campo = new Campo(3, 3);

    @Test
    void testeVizinhoRealEsquerda(){
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinhos(vizinho);
        assertTrue(resultado);
    }
    @Test
    void testeVizinhoRealDireita(){
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinhos(vizinho);
        assertTrue(resultado);
    }
    @Test
    void testeValorPadraoAtributoMarcado(){
        assertFalse(campo.isMarcado());
    }
    @Test
    void testeAlternarMarcacao(){
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }
    @Test
    void testeAlternarMarcacaoDuasChamadas(){
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertFalse(campo.isMarcado());
    }
    @Test
    void testeAbrirNaoMinadoNaoMarcado(){
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }
    @Test
    void testeAbrirMinadoMarcado(){
        campo.minar();
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }
    @Test
    void testeAbrirMinadoNaoMarcado(){
        campo.minar();
        assertThrows(ExplosaoException.class, () -> {
            campo.abrir();
        });
    }
    @Test
    void testeAbrircomVizinhos1() {
        Campo campo22 = new Campo(2,2);
        Campo campo11 = new Campo(1,1);;
        campo22.adicionarVizinhos(campo11);
        campo.adicionarVizinhos(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isAberto());
    }

    @Test
    void testeAbrircomVizinhos2() {
        Campo campo11 = new Campo(1,1);
        Campo campo12 = new Campo(1,1);
        campo12.minar();;
        Campo campo22 = new Campo(2,2);

        campo22.adicionarVizinhos(campo12);
        campo22.adicionarVizinhos(campo11);
        campo.adicionarVizinhos(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && !campo11.isAberto());
    }
}
