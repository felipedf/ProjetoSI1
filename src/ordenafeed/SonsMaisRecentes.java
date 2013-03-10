package ordenafeed;

import java.util.ArrayList;
import java.util.List;

import mainclasses.Som;
import mainclasses.Usuario;

public class SonsMaisRecentes implements OrdenaFeedPrincipal{

	public List<Som> ordena(Usuario usuario) {
		List<Usuario> fontesDeSom = usuario.getFontesDeSom();
		List<Som> feedPrincipal = new ArrayList<Som>();
		
		for(int fonte = fontesDeSom.size() - 1; fonte >= 0; fonte--){
			for (Som som : fontesDeSom.get(fonte).getPerfilMusical()){
				feedPrincipal.add(som);
			}
		}
		return feedPrincipal;
	}
}
