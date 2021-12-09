public class FabricaContratoPJCasa implements FabricaAbstrata{
    @Override
    public Residencia createResidencia() {
        return new ResidenciaCasa();
    }

    @Override
    public Cliente createCliente() {
        return new ClientePessoaJuridica();
    }
}
