package Modelo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class ClienteDAO {
	public static void insertarCliente(Modelo.Cliente nuevocliente) {
		 SessionFactory mf = Modelo.ManejoSession.getmf();
		 Session ms = mf.openSession();
		 try {
			 System.out.println("Un momento, estamos iniciando la conexión con la Base de Datos para introducir los datos a la tabla de instrumentos");
			 ms.beginTransaction();
			 System.out.println("Estamos enviando sus datos al servidor de la base de datos.");
			 ms.save(nuevocliente);
			 ms.getTransaction().commit();
			 System.out.println("Datos de pedido de instrumentos introducidos de forma correcta.");
			 } catch (Exception e) {
			 e.printStackTrace();
			 }


			 try {
			 System.out.println("Un momento, estamos iniciando la conexión con la Base de Datos para proceder a su lectura");
			 ms.beginTransaction();
			 System.out.println("Procedemos a mostrar los datos del pedido para la ID de pedido: " + nuevocliente.getIdcliente());
			 Modelo.Cliente nuevocliente2 = ms.get(Modelo.Cliente.class, nuevocliente.getIdcliente());
			 System.out.println("El pedido en Clave de Sol es el siguiente " +
			nuevocliente2.toString());
			 ms.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 } finally {
			 ms.close();
			 mf.close();
			 }
		}
	}
