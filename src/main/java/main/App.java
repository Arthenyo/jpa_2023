package main;

import dao.PessoaDAO;
import domain.Pessoa;

import java.util.List;

public class App {

    public static void main(String[] args) {

        try{
            System.out.println("Iniciando a operaçao.....");
            var pessoaDAO = new PessoaDAO();
            //var pessoa = Pessoa.builder().nome("Arthenyo").cpf("123456789").build();
            //pessoaDAO.savePessoa(pessoa);
            //var maria = Pessoa.builder().nome("Maria").cpf("987654321").build();
            //pessoaDAO.savePessoa(maria);
            //var pessoas = pessoaDAO.getAll();
            //System.out.println(pessoas);
            var pessoaPeloCPF = pessoaDAO.getPessoaByCPF("987654321");
            System.out.println(pessoaPeloCPF);
            System.out.println("Operação realizada com sucesso!!!");
        }catch (Exception e){
            System.out.println("Operação nao realizada erro" + e.getMessage());
        }
    }
}
