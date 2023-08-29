package Sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Imovel {
    private String endereco;
    private List<String> sitesAssociados = new ArrayList<>();
    private Map<String, Reserva> reservas = new HashMap<>();

    // Getters e setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<String> getSitesAssociados() {
        return sitesAssociados;
    }

    public Map<String, Reserva> getReservas() {
        return reservas;
    }
}