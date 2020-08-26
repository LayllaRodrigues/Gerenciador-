package dto;

import enums.Destinos;
import interfaces.CalculadoraDePrevisao;
import utils.ArquivosUtils;

import java.util.List;

public class ViagemNacional extends Viagem implements CalculadoraDePrevisao {
    private String cpf;

    public ViagemNacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {

        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.nacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("viagens nacionais não podem ter mais que" + limiteDeAcompanhantes + "acompanhante");
        }
    }

    public int calcularPrevisaoDeDiasParaRetorno() {
        int quantidadeDeDias = 0;

        switch (this.getDestino()) {
            case MANAUS:
                quantidadeDeDias = 4;
                break;
            case RECIFE:
                quantidadeDeDias = 3;
                break;
            case GOIAS:
                quantidadeDeDias = 1;
                break;
            case OSASCO:
                quantidadeDeDias = 0;
                break;
            case MARINGA:
                quantidadeDeDias = 2;
                break;
        }
        return quantidadeDeDias;
        }
    }


