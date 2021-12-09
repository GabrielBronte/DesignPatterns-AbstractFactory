public class FabricaContratoPJCasa implements FabricaAbstrata{
    @Override
    public Residencia createAluguel() {
        return new ResidenciaCasa();
    }

    @Override
    public Cliente createCliente() {
        return new ClientePessoaJuridica();
    }
}
