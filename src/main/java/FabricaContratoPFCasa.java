public class FabricaContratoPFCasa implements FabricaAbstrata{
    @Override
    public Aluguel createAluguel() {
        return new Casa();
    }

    @Override
    public Cliente createCliente() {
        return new PessoaFisica();
    }
}
