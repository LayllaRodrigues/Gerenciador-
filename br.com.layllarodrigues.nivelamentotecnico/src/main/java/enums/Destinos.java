package enums;

public enum Destinos {
    OSASCO("Osasco"),
    MARINGA("Maringá"),
    GOIAS("Goiás"),
    RECIFE("Recife"),
    MANAUS("Manaus"),
    MIAMI("Miami");

    private String cidade;

        Destinos(String cidade) {
            this.cidade = cidade;
        }

        public String getCidade() {
            return this.cidade;
        }
    }


