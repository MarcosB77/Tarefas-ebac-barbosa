/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar este modelo
 */
package JavaAplication.dao;


import javaapplication2.domain.Cliente;

public interface IClienteDAO {

    Boolean cadastrar(Cliente cliente);

    void excluir(Long cpf);

    void alterar(Cliente cliente);

    Cliente consultar(Long cpf);
}