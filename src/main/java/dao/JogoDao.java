package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import jogo.Jogo;
import util.JpaUtil;

public class JogoDao {
	public static void salvar(Jogo jogo) {
		EntityManager em = JpaUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(jogo);
		em.getTransaction().commit();
		em.close();

	}

	public static List<Jogo> listar() {
		EntityManager em = JpaUtil.criarEntityManager();
		Query q = em.createQuery("select j from jogo j");
		List<Jogo> lista = q.getResultList();
		em.close();
		return lista;
	}

}
