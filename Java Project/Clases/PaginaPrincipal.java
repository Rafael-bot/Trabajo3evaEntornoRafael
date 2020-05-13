package Clases;

import Clases.Chat.Chat;
import Clases.ForgotPasswd.ForgotPasswd;
import Clases.Register.Register;
import Clases.Server.CreateServer;
import Clases.Server.Configuración.ConfigServer;

public class PaginaPrincipal {
	
	private Register register;
	private Chat chat;
	private CreateServer server;
	private ForgotPasswd forgotpass;
	private ConfigServer config;
	private String user;
	private String passwd;
	
	private boolean login(String user, String passwd) {return false;}
	
	
	
}
