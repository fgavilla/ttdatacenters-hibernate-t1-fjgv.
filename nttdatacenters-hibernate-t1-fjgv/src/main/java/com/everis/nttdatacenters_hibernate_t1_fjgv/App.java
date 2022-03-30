package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.util.List;
import java.util.Date;
import org.hibernate.Session;

public class App {

	public static void main(String[] args) {

		final Session session = Util.getSessionFactory().openSession();

		final CustomerServiceI customerServiceI = new CustomerServiceImpl(session);
		final ContractServiceI contractServiceI = new ContractServiceImpl(session);

		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();

		c1.setNombreCliente("Francisco Jose");
		c1.setPrimerapellidoCliente("Garcia");
		c1.setSegundoapellidoCliente("Villalon");
		c1.setDocIdentidad("01223333E");
		c1.setUpdatedUser("APOZGAM");
		c1.setUpdatedDate(new Date());

		c2.setNombreCliente("Francisco Jose");
		c2.setPrimerapellidoCliente("Garcia");
		c2.setSegundoapellidoCliente("Villalon");
		c2.setDocIdentidad("01223333E");
		c2.setUpdatedUser("APOZGAM");
		c2.setUpdatedDate(new Date());

		c3.setNombreCliente("Francisco Jose");
		c3.setPrimerapellidoCliente("Garcia");
		c3.setSegundoapellidoCliente("Villalon");
		c3.setDocIdentidad("01223333E");
		c3.setUpdatedUser("APOZGAM");
		c3.setUpdatedDate(new Date());

		customerServiceI.insertCustomer(c1);
		customerServiceI.insertCustomer(c2);
		customerServiceI.insertCustomer(c3);

		Contrato t1 = new Contrato();
		Contrato t2 = new Contrato();
		Contrato t3 = new Contrato();

		t1.setFechaVigencia(new Date());
		t1.setPrecioMensual(9.99);
		t1.setCliente(c1);
		t1.setUpdatedUser("APOZGAM");
		t1.setUpdatedDate(new Date());

		t2.setFechaVigencia(new Date());
		t2.setPrecioMensual(19.99);
		t2.setCliente(c2);
		t2.setUpdatedUser("APOZGAM");
		t2.setUpdatedDate(new Date());

		t3.setFechaVigencia(new Date());
		t3.setPrecioMensual(29.99);
		t3.setCliente(c3);
		t3.setUpdatedUser("APOZGAM");
		t3.setUpdatedDate(new Date());

		contractServiceI.insertContract(t1);
		contractServiceI.insertContract(t2);
		contractServiceI.insertContract(t3);

		List<Contrato> list1 = contractServiceI.searchAll();
		if (list1 != null && list1.size() > 0) {
			System.out.println("Total de contratos registrados: " + list1.size());
			for (Contrato contract : list1) {
				System.out.println(contract.toString());
			}
		}

		List<Contrato> list2 = contractServiceI.searchByCustomer(c3);
		if (list2 != null && list2.size() > 0) {
			System.out.println(
					"Total de contratos asociados al cliente con ID " + c3.getIdCliente() + ": " + list2.size());
			for (Contrato contract : list2) {
				System.out.println(contract.toString());
			}
		}

		session.close();

	}

}