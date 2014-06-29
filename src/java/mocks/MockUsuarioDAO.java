package mocks;


import java.util.ArrayList;
import model.beans.EspacoBean;
import model.beans.UsuarioBean;


public class MockUsuarioDAO {
	
    ArrayList<UsuarioBean> usuarios;
    UsuarioBean user1;
    UsuarioBean user2;
    UsuarioBean user3;
    UsuarioBean user4;
    UsuarioBean user5;
    UsuarioBean user6;
    private final UsuarioBean user7;
    private final UsuarioBean user8;
    private final UsuarioBean user9;
    private final UsuarioBean user10;
    private final UsuarioBean user11;
    private final UsuarioBean user12;
    private final UsuarioBean user13;
    private final UsuarioBean user14;

    public MockUsuarioDAO(){
        usuarios = new ArrayList<>();
        user1 = new UsuarioBean("andre", "andreramos", "123", "andre@gmail","adm");
        user2 = new UsuarioBean("Andre ramos", "andrewsramos", "1234", "andrews@gmail","aluno");
        user3 = new UsuarioBean("John Gonçalves", "John", "1234", "john@gmail","aluno");
        user4 = new UsuarioBean("João Victor", "joao", "1234", "joao@gmail","aluno");
        user5 = new UsuarioBean("Edivandro", "edivandro", "1234", "edivandro@gmail","aluno");
        user6 = new UsuarioBean("Kenzo", "kenzo", "1234", "kenzoufpa@gmail","aluno");
        user7 = new UsuarioBean("Rodrigo", "rodrigo", "1234", "rodrigo@gmail","aluno");
        user8 = new UsuarioBean("Arnaldo", "arnaldo", "1234", "arnaldo@gmail","aluno");
        user9 = new UsuarioBean("Paula Rocha", "paula", "1234", "paula@gmail","aluno");
        user10 = new UsuarioBean("Saulo", "saulo", "1234", "saulo@gmail","aluno");
        user11 = new UsuarioBean("Anderson", "anderson", "1234", "anderson@gmail","aluno");
        user12 = new UsuarioBean("Sebastiao", "sebastiao", "1234", "sebastiao@gmail","aluno");
        
        user13 = new UsuarioBean("Eduardo Guerra", "eduardo", "prof", "adm@gmail","prof");
        
        
        user14 = new UsuarioBean("administrador", "admin", "admin", "adm@gmail","adm");
        

        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);
        usuarios.add(user5);		
        usuarios.add(user6);		
        usuarios.add(user7);		
        usuarios.add(user8);		
        usuarios.add(user9);		
        usuarios.add(user10);		
        usuarios.add(user11);		
        usuarios.add(user12);		
        usuarios.add(user13);		
        usuarios.add(user14);		
    }

    public ArrayList<UsuarioBean> getBd(){		
            return usuarios;		
    }
    
    public boolean existeUsuario(String login, String senha) {
        for (UsuarioBean usuarioBean : usuarios) {
            if(usuarioBean.getLogin().equals(login) && usuarioBean.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }

    public UsuarioBean getUsuario(String login, String senha) {
        for (UsuarioBean usuarioBean : usuarios) {
            if(usuarioBean.getLogin().equals(login) && usuarioBean.getSenha().equals(senha)){
                return usuarioBean;
            }
        }
        return null;
    }
}
