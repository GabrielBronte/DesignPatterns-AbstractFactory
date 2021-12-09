public class FabricaContratoPJCondominio implements FabricaAbstrata{
    @Override
    public Residencia createResidencia() {
        return new ResidenciaCondominio();
    }

    @Override
    public Cliente createCliente() {
        return new ClientePessoaJuridica();
    }
}
