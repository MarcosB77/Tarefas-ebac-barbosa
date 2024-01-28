package ClienteSetDAO;

import JavaAplication.dao.IClienteDAO;
import javaapplication2.domain.Cliente;

import java.util.HashSet;
import java.util.Set;

public class ClienteSetDAO implements IClienteDAO {

    private final Set<Cliente> set;

    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (cliente == null) {
            return false;
        }

        // Verifica se o cliente já está cadastrado
        if (set.contains(cliente)) {
            return false; // Cliente já cadastrado
        }

        set.add(cliente);
        return true; // Cliente cadastrado com sucesso
    }

    @Override
    public void excluir(Long cpf) {
        if (cpf == null) {
            return;
        }

        // Encontra o cliente pelo CPF e remove
        set.removeIf(cliente -> cpf.equals(cliente.getCpf()));
    }

    @Override
    public void alterar(Cliente cliente) {
        if (cliente == null) {
            return;
        }

        // Atualiza os dados do cliente existente, se presente
        set.removeIf(c -> c.getCpf().equals(cliente.getCpf()));
        set.add(cliente);
    }

    @Override
    public Cliente consultar(Long cpf) {
        if (cpf == null) {
            return null;
        }

        // Encontra o cliente pelo CPF
        return set.stream()
                .filter(cliente -> cpf.equals(cliente.getCpf()))
                .findFirst()
                .orElse(null); // Retorna null se o cliente não for encontrado
    }
}