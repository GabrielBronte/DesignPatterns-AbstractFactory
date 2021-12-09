public class FabricaContratoPFCondominio implements FabricaAbstrata{
    @Override
    public Aluguel createAluguel() {
        return new Condominio();
    }

    @Override
    public Cliente createCliente() {
        return new PessoaFisica();
    }
}
