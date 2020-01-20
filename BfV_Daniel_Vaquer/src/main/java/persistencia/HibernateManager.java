package persistencia;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.query.Query;

import practica.Bfplayer;
import practica.Weapon;

public class HibernateManager {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		int opcion = menu();
		while (opcion != 0) {
			if (opcion == 1) {
				List bfplayer = session.createQuery("FROM Bfplayer").list();
				Iterator iterator = bfplayer.iterator();
				while (iterator.hasNext()) {
					Bfplayer element = (Bfplayer) iterator.next();
					System.out.println(element.getUserId() + ", " + element.getKills() + "/" + element.getDeads());
					System.out.println();
				}
			}
			if (opcion == 2) {
				session.beginTransaction();
				Weapon per = new Weapon();
				per.setWeaponId(10);
				per.setName("KE7");
				per.setType("Light Machine Gun");
				per.setDamage(23);
				per.setAccuracy(65);
				session.save(per);
				session.getTransaction().commit();
				System.out.println("fet!");

			}
			if (opcion == 3) {
				session.beginTransaction();
				Bfplayer per = new Bfplayer();
				per.setUserId("Daniel");
				per.setClassId(2);
				per.setPrimaryWeapon(10);
				per.setDevice1(4);
				per.setKills(0);
				per.setDeads(0);
				session.save(per);
				session.getTransaction().commit();
				System.out.println("fet!");
				System.out.println("UserID: "+per.getUserId());
				System.out.println("ClassID: "+per.getClassId());
				System.out.println("Device1: "+per.getDevice1());
				System.out.println("Kills: "+per.getKills());
				System.out.println("Deaths: "+per.getDeads());
			}
			if (opcion == 4) {
			}
			opcion = menu();
		}

//		session.beginTransaction();
//		Bliblioteca biblio = new Bliblioteca();
//		biblio.setNom("Josu");
//		session.save(biblio);
//		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
		System.out.println("Base de datos actualizada");
	}

	public static int menu() {
		Scanner keyboard = new Scanner(System.in);
		int opcion = 0;
		System.out.println("-----------");
		System.out.println("MENU");
		System.out.println("1. CONSULTA: Llista el “kill/dead” ratio de cada jugador");
		System.out.println("2. CONSULTA: Inserta el arma “KE7” tipus: “Light Machine Gun” id: 10, dany:23, presició: 65");
		System.out.println("3. CONSULTA: Inserta un nou jugador amb clase “suport” asigna-li com a arma la KE7 i com a dispositu l’ “Ammo Pouch” i mostra aquest jugador amb totes les seves característiques");
		System.out.println("0. Sortir");
		if (keyboard.hasNextInt()) {
			opcion = keyboard.nextInt();
		}
		return opcion;
	}
}
