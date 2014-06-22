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

    public MockUsuarioDAO(){
        usuarios = new ArrayList<>();
        user1 = new UsuarioBean("andre", "andreramos", "123", "andre@gmail","adm");
        user2 = new UsuarioBean("Andre ramos", "andrewsramos", "1234", "andrews@gmail","aluno");
        user3 = new UsuarioBean("andrey", "andreyramos", "12345", "andrey@gmail","adm");
        user4 = new UsuarioBean("andressa", "andressaramos", "123456", "andressa@gmail","aluno");
        user5 = new UsuarioBean("anderson", "andresramos", "1234567", "anderson@gmail","adm");
        user6 = new UsuarioBean("administrador", "admin", "admin", "adm@gmail","adm");

        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);
        usuarios.add(user5);		
        usuarios.add(user6);		
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
