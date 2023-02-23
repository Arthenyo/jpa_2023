package dao;

import domain.Pessoa;

import javax.persistence.Query;
import java.util.List;

public class PessoaDAO {

    private ConfigPersistence configPersistence;

    public PessoaDAO(){
        configPersistence = new ConfigPersistence();
    }

    public void savePessoa(Pessoa pessoa){
        configPersistence.getEntityManager().getTransaction().begin();
        configPersistence.getEntityManager().persist(pessoa);
        configPersistence.getEntityManager().getTransaction().commit();
    }

    public List<Pessoa> getAll(){
        configPersistence.getEntityManager().getTransaction().begin();
        Query query = configPersistence.getEntityManager().createNamedQuery("pessoa.getAll");
        return query.getResultList();
    }

    public Pessoa getPessoaByCPF(String cpfPorParametro){
        configPersistence.getEntityManager().getTransaction().begin();
        Query query = configPersistence.getEntityManager().createNamedQuery("pessoa.getByCPF");
        query.setParameter("cpf",cpfPorParametro);
        return (Pessoa) query.getSingleResult();
    }
}
