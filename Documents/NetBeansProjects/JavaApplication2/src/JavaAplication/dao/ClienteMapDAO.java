package JavaAplication.dao;

import java.util.Map;
import java.util.TreeMap;
import javaapplication2.domain.Cliente;

public abstract class ClienteMapDAO implements IClienteDAO {

    private final Map<Long, Cliente> map;

    public ClienteMapDAO() {
        map = new TreeMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        Long cpf = cliente.getCpf();

        if (map.containsKey(cpf)) {
            return false; // Cliente já cadastrado
        }

        map.put(cpf, cliente);
        return true; // Cliente cadastrado com sucesso
    }

    @Override
    public void excluir(Long cpf) {
        map.remove(cpf);
    }

    @Override
    public void alterar(Cliente cliente) {
        Long cpf = cliente.getCpf();

        if (map.containsKey(cpf)) {
            Cliente clienteCadastrado = map.get(cpf);
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        } else {
            System.out.println("Cliente não encontrado para alteração: " + cpf);
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return map.get(cpf);
    }
}