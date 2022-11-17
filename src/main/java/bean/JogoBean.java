package bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import dao.JogoDao;
import jogo.Jogo;

@ManagedBean
public class JogoBean {
	private Jogo jogo = new Jogo();
	private List<Jogo> lista;

	public String salvar() {
		JogoDao.salvar(jogo);
		jogo = new Jogo();
		return null;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public List<Jogo> getList() {
		if (lista == null) {
			lista = JogoDao.listar();
		}
		return lista;
	}

	public void setLista(List<Jogo> lista) {
		this.lista = lista;
	}
}
