package Sistema;

public class SistemaGestaoHospedagem {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();
        plataforma.getSitesReservas().add("Airbnb");
        plataforma.getSitesReservas().add("Booking");
        // ... adicione mais sites de reservas

        Proprietario proprietario1 = new Proprietario();
        proprietario1.setNomeCompleto("João da Silva");
        proprietario1.setCpf("123.456.789-00");
        proprietario1.setDataNascimento("01/01/1980");
        proprietario1.setTelefone("(11) 1234-5678");

        Imovel imovel1 = new Imovel();
        imovel1.setEndereco("Rua A, 123");
        imovel1.getSitesAssociados().add("Airbnb");
        imovel1.getSitesAssociados().add("Booking");

        proprietario1.getImoveis().add(imovel1);

        // ... adicione mais proprietários, imóveis e reservas

        // Simulação de consulta de disponibilidade
        boolean disponivel = isImovelDisponivel(imovel1, "2023-09-01", "2023-09-10");
        System.out.println("Imóvel disponível: " + disponivel);
    }

    // Simulação de verificação de disponibilidade
    private static boolean isImovelDisponivel(Imovel imovel, String dataInicio, String dataFim) {
        for (Reserva reserva : imovel.getReservas().values()) {
            if (reserva.getPeriodo().equals(dataInicio + " - " + dataFim)) {
                return false;
            }
        }
        return true;
    }
}