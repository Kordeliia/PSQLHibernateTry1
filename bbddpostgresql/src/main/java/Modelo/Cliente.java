package Modelo;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table (name="clientes")
public class Cliente {
	@Id
	@Column (name="idcliente")
	private int idcliente;
	@Column (name="nombre")
	private String nombre;
	@Column (name="apellido1")
	private String apellido1;
	@Column (name="apellido2")
	private String apellido2;
	@Column (name="comercial")
	private String comercial;
	@Column (name="idempresa")
	private int idempresa;
	@Column (name="fechas")
	private LocalDate [] fechas;
	public Cliente(String nombre, String apellido1, String apellido2, String comercial, int idempresa, LocalDate[] fechas) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.comercial = comercial;
		this.idempresa = idempresa;
		this.fechas = fechas;
	}
	public Cliente() {
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getComercial() {
		return comercial;
	}
	public void setComercial(String comercial) {
		this.comercial = comercial;
	}
	public int getIdempresa() {
		return idempresa;
	}
	public void setIdempresa(int idempresa) {
		this.idempresa = idempresa;
	}
	public LocalDate[] getFechas() {
		return fechas;
	}
	public void setFechas(LocalDate[] fechas) {
		this.fechas = fechas;
	}
	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", comercial=" + comercial + ", idempresa=" + idempresa + ", fechas="
				+ Arrays.toString(fechas) + "]";
	}
}
