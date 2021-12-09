public class Contrato {
    private Residencia residencia;
    private Cliente cliente;

    public Contrato(FabricaAbstrata fabrica) {
        this.residencia = fabrica.createAluguel();
        this.cliente = fabrica.createCliente();
    }

    public String emitirAluguel(){
        return this.residencia.emitirAluguel();
    }

    public String emitirCliente(){
        return this.cliente.emitirCliente();
    }
}
