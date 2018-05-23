package view;

import javax.swing.JFrame;

import controller.ClienteJpaDAO;
import model.Cliente;

public class App {
	
	public static void main(String[] args)
	{
		Cliente cliente = new Cliente();
		cliente.setCpf("484.272.998-85");
		cliente.setId(1);
		cliente.setNome("Vinicius Borges");
		cliente.setRg("52.106.898-8");
		ClienteJpaDAO.getInstance().merge(cliente);
		System.out.println("Objeto salvo com sucesso!!");
	}
}
