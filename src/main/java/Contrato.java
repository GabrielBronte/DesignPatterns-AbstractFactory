public class Contrato {
    private Aluguel aluguel;
    private Cliente cliente;

    public Contrato(FabricaAbstrata fabrica) {
        this.aluguel = fabrica.createAluguel();
        this.cliente = fabrica.createCliente();
    }

    public String emitirAluguel(){
        return this.aluguel.emitirAluguel();
    }

    public String emitirCliente(){
        return this.cliente.emitirCliente();
    }
}
