import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Modelo.Cliente cliente1 = new Modelo.Cliente("Laura", "Alvarez", "Muñoz", "Ruben Cervera", 1,new LocalDate[]{LocalDate.parse("2021-01-12"), LocalDate.parse("2021-01-14")});
		Modelo.ClienteDAO.insertarCliente(cliente1);
	}

}
