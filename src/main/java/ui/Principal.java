package UI;
import Dao.JogoDao;
public class Principal {
	public static void main (String []args) {
		//Jogo j1 = new Jogo();
		//j1.setid
		//j1.setDataCadastro
		
		//JogoDao.salvar(j1);
		
		System.out.println(JogoDao.listar());
	}
}
