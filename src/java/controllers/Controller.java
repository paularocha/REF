package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	String executa(HttpServletRequest req, 
            HttpServletResponse res)
            throws Exception;

}
