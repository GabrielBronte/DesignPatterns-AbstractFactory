public class FabricaContratoPJCondominio implements FabricaAbstrata{
    @Override
    public Residencia createAluguel() {
        return new ResidenciaCondominio();
    }

    @Override
    public Cliente createCliente() {
        return new ClientePessoaJuridica();
    }
}
