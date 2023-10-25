public class Cliente {
    private String nome;
    private String endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    /**
     * cadastra o endereço do cliente na class"Entrega"
     * @param endereco
     */
    public void cadastrarEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
