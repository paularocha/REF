package mocks;


import model.beans.EspacoBean;
import java.util.ArrayList;


public class MockEspacoDAO {
	
    ArrayList<EspacoBean> espacos;
    EspacoBean espacoPorNome;
    EspacoBean esp1;
    EspacoBean esp2;
    EspacoBean esp3;
    EspacoBean esp4;
    EspacoBean esp5;

    public MockEspacoDAO(){
        espacos = new ArrayList<>();
        esp1 = new EspacoBean("qdakco3f5om12i5e0qnpr3g6eg@group.calendar.google.com", "Lab-40", "tem 40 pc's", true);
        esp2 = new EspacoBean("r4i345anbgb13k0j0hjn2f0a28@group.calendar.google.com","Lab-30", "tem 30 pc's", true);

        espacos.add(esp1);
        espacos.add(esp2);
        
        
    }

    public EspacoBean getEspacoPorNome(String nome){
        for (EspacoBean espacoBean : espacos) {
            if (espacoBean.getNome().equals(nome)) {
                return espacoBean;		
            }
        }
        return null;		
    }
    
    public ArrayList<EspacoBean> getEspacos(){		
            return espacos;		
    }
}
