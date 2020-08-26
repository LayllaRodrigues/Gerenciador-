package dto;

import enums.Destinos;

import java.util.List;

public class Viagem {
    private Destinos destino;
    private List<Acompanhante> acompanhantes;

    public Viagem(Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;
    }

    public Destinos getDestino () {
        return this.destino;
    }
    public void setDestino(Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;
    }

    public List<Acompanhante> getAcompanhantes(){
        return this.acompanhantes;
    }

    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        this.acompanhantes = acompanhantes;
    }

}
