package testemvc;


import beans.EspacoBean;
import java.util.ArrayList;


public class Mocc {
	
        ArrayList<EspacoBean> espacos;
        EspacoBean esp1;
        EspacoBean esp2;
        EspacoBean esp3;
        EspacoBean esp4;
        EspacoBean esp5;
	
	public Mocc(){
            espacos = new ArrayList<EspacoBean>();
            esp1 = new EspacoBean("Lab-40", "tem 40 pc's", true);
            esp2 = new EspacoBean("Lab-30", "tem 30 pc's", true);
            esp3 = new EspacoBean("Auditorio", "para eventos grandes", true);
            esp4 = new EspacoBean("Lab matematica", "so para os matematicos", true);
            esp5 = new EspacoBean("Piscina", "para praticas esportivas", true);

            espacos.add(esp1);
            espacos.add(esp2);
            espacos.add(esp3);
            espacos.add(esp4);
            espacos.add(esp5);
            

		
	}
	
	public ArrayList<EspacoBean> getBd(){		
		return espacos;		
	}
	
	

}
