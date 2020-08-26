package app;

import dto.Acompanhante;
import dto.Viagem;
import dto.ViagemInternacional;
import dto.ViagemNacional;
import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) throws Exception {
        Viagem viagem = new Viagem(Destinos.RECIFE) {
            public void setAcompanhante(List<Acompanhante> acompanhantes) throws Exception {

            }
        };

        viagem.setDestino(Destinos.MANAUS);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Priscila");
        acompanhante1.setconfirmouCadastro(false);

        Acompanhante acompanhante2 = new Acompanhante();
        acompanhante2.setNome("Isabelle");
        acompanhante2.setconfirmouCadastro(false);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);

        try {
            viagem.setAcompanhantes(acompanhantes);
        } catch (Exception excecao) {
            System.out.println("ocorreu um erro: ");
            System.out.println(excecao.getMessage());
        }

        System.out.println(viagem.getDestino().getCidade());
        //System.out.println(viagem.getAcompanhantes().size());
        //System.out.println(viagem.getAcompanhantes().get(0).getNome());
        //System.out.println(viagem.getAcompanhantes().get(1).getNome());

        // for (int iterador = 0; iterador <viagem.getAcompanhantes().size(); iterador++ ) {
        //     System.out.println(viagem.getAcompanhantes().get(iterador).getNome());
        //     System.out.println(viagem.getAcompanhantes().get(iterador).isConfirmouCadastro());
        //}
        for (Acompanhante acompanhante : viagem.getAcompanhantes()) {
            System.out.println(acompanhante.getNome() + " " + acompanhante.isConfirmouCadastro());

        }

        ViagemNacional viagemNacional1 = new ViagemNacional(Destinos.MANAUS);
        try {
            viagemNacional1.setAcompanhantes(acompanhantes);
        } catch (Exception excecao){
            System.out.println("Ocorreu um erro: ");
            System.out.println(excecao.getMessage());
        }
        viagemNacional1.setCpf("38787632160");

        ViagemInternacional viagemInternacional1 = new ViagemInternacional(Destinos.MIAMI);
        try {
            viagemInternacional1.setAcompanhantes(acompanhantes);
        } catch (Exception excecao){
            System.out.println("Ocorreu um erro: ");
            System.out.println(excecao.getMessage());
        }

        viagemInternacional1.setPassaporte ("1111-1");

        System.out.println(viagemNacional1.getDestino().getCidade());
        System.out.println(viagemInternacional1.getDestino().getCidade());

        System.out.println(viagemInternacional1.calcularPrevisaoDeDiasParaRetorno());
        System.out.println(viagemNacional1.calcularPrevisaoDeDiasParaRetorno());
    }

}

