public class Contrato {
    private Residencia residencia;
    private Cliente cliente;

    public Contrato(FabricaAbstrata fabrica) {
        this.residencia = fabrica.createResidencia();
        this.cliente = fabrica.createCliente();
    }

    public String emitirResidencia(){
        return this.residencia.emitirResidencia();
    }

    public String emitirCliente(){
        return this.cliente.emitirCliente();
    }
}
