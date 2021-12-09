import static org.junit.jupiter.api.Assertions.*;

class ContratoTest {

    @org.junit.jupiter.api.Test
    void retornaPessoaFisicaCasa() {
        FabricaAbstrata fabrica = new FabricaContratoPFCasa();
        Contrato contrato = new Contrato(fabrica);
        assertEquals("Casa",contrato.emitirAluguel());
        assertEquals("Pessoa Fisica",contrato.emitirCliente());
    }

    @org.junit.jupiter.api.Test
    void retornaPessoaJuridicaCasa() {
        FabricaAbstrata fabrica = new FabricaContratoPJCasa();
        Contrato contrato = new Contrato(fabrica);
        assertEquals("Casa",contrato.emitirAluguel());
        assertEquals("Pessoa Juridica",contrato.emitirCliente());
    }

    @org.junit.jupiter.api.Test
    void retornaPessoaJuridicaCondominio() {
        FabricaAbstrata fabrica = new FabricaContratoPJCondominio();
        Contrato contrato = new Contrato(fabrica);
        assertEquals("Condominio",contrato.emitirAluguel());
        assertEquals("Pessoa Juridica",contrato.emitirCliente());
    }

    @org.junit.jupiter.api.Test
    void retornaPessoaFisicaCondominio() {
        FabricaAbstrata fabrica = new FabricaContratoPFCondominio();
        Contrato contrato = new Contrato(fabrica);
        assertEquals("Condominio",contrato.emitirAluguel());
        assertEquals("Pessoa Fisica",contrato.emitirCliente());
    }
}