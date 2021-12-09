public class FabricaContratoPFCasa implements FabricaAbstrata{
    @Override
    public Residencia createResidencia() {
        return new ResidenciaCasa();
    }

    @Override
    public Cliente createCliente() {
        return new ClientePessoaFisica();
    }
}
