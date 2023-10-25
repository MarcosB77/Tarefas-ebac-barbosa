public class Entrega {
    public static void main(String[] args) {
        System.out.println("Entrega Tech");

        Cliente cliente = new Cliente();


        cliente.setNome("Marcos G");


        cliente.cadastrarEndereco("Barra 445 , Rj");


        String nomeDoCliente = cliente.getNome();
        String enderecoDoCliente = cliente.getEndereco();

        System.out.println("Nome do cliente: " + nomeDoCliente);
        System.out.println("Endereço: " + enderecoDoCliente);
    }
}