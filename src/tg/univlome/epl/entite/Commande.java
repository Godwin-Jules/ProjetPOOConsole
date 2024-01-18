package tg.univlome.epl.entite;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Commande {

	private static long id_increment = 0;

	private long id;
	private LocalDateTime dateTime;
	private List<Article> entrees = new ArrayList<Article>();
	private List<Article> plats = new ArrayList<Article>();
	private List<Article> boissons = new ArrayList<Article>();

	public Commande() {
		id_increment += 1;
		this.id = id_increment;
		this.dateTime = LocalDateTime.now();
	}

	public static long getId_increment() {
		return id_increment;
	}

	public static void setId_increment(long id_increment) {
		Commande.id_increment = id_increment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public List<Article> getEntrees() {
		return entrees;
	}

	public void setEntrees(List<Article> entrees) {
		this.entrees = entrees;
	}

	public List<Article> getPlats() {
		return plats;
	}

	public void setPlats(List<Article> articles) {
		this.plats = articles;
	}

	public List<Article> getBoissons() {
		return boissons;
	}

	public void setBoissons(List<Article> boissons) {
		this.boissons = boissons;
	}

	public String afficher() {
		String afficheCommande = String.format("Commande {\n\tid : %d,\n\tdate : %tF,\n\theure : %tT\n\tEntréess : {\n", id, dateTime, dateTime);
		
		for (Article entree : entrees) {
			afficheCommande += String.format("\t\t" + entree.toString() + "\n");
		}
		afficheCommande += "\t}\n\tPlats : {\n";
		for (Article plat : plats) {
			afficheCommande += String.format("\t\t" + plat.toString() + "\n");
		}
		afficheCommande += "\t}\n\tBoissons : {\n";
		for (Article boisson : boissons) {
			afficheCommande += String.format("\t\t" + boisson.toString() + "\n");
		}
		afficheCommande += "\t}\n}";
		
		return afficheCommande;
	}

	@Override
	public String toString() {
		return "| " + id + " | " + dateTime + " | " + entrees + " | " + plats + " | " + boissons;
	}

	public boolean ajouterEntree(Article entree, int qt) {
		int i = 0;
		for (Article a : entrees) {
			if (a.getLibelle().equals(entree.getLibelle())) {
				entree.setQt(a.getQt() + qt);
				plats.set(i, entree);
				return true;
			}
			i++;
		}
		entree.setQt(qt);
		entrees.add(entree);
		return true;
	}
	
	public boolean ajouterPlat(Article plat, int qt) {
		int i = 0;
		for (Article a : plats) {
			if (a.getLibelle().equals(plat.getLibelle())) {
				plat.setQt(a.getQt() + qt);
				plats.set(i, plat);
				return true;
			}
			i++;
		}
		plat.setQt(qt);
		plats.add(plat);
		return true;
	}
	
	public boolean ajouterBoisson(Article boisson, int qt) {
		int i = 0;
		for (Article a : boissons) {
			if (a.getLibelle().equals(boisson.getLibelle())) {
				boisson.setQt(a.getQt() + qt);
				boissons.set(i, boisson);
				return true;
			}
			i++;
		}
		boisson.setQt(qt);
		boissons.add(boisson);
		return true;
	}
	
	public void afficherArticles() {
		System.out.printf("|  | -- | %-35s                                           |  |\n", "Entrée(s) sélectionné(s)" );
		System.out.println("|  +----+-------------------------------------+--------+--------+--------+--------------+  |");
		for (Article article : entrees) {
			System.out.printf("|  | %2d | %-35s | %,6d | $%,-5.2f | $%,-4.2f  | $%,-11.2f |  |\n"
					, article.getId()
					, article.getLibelle()
					, article.getQt()
					, article.getPrixUnitaire()
					, article.getRemise()
					, (article.getPrixUnitaire() - article.getRemise()) * article.getQt());		
		}
		System.out.println("|  +----+-------------------------------------+--------+--------+--------+--------------+  |");
		System.out.printf("|  | -- | %-35s                                           |  |\n", "Plat(s) sélectionné(s)");
		System.out.println("|  +----+-------------------------------------+--------+--------+--------+--------------+  |");
		for (Article article : plats) {
			System.out.printf("|  | %2d | %-35s | %,6d | $%,-5.2f | $%,-4.2f  | $%,-11.2f |  |\n"
					, article.getId()
					, article.getLibelle()
					, article.getQt()
					, article.getPrixUnitaire()
					, article.getRemise()
					, (article.getPrixUnitaire() - article.getRemise()) * article.getQt());		
		}
		System.out.println("|  +----+-------------------------------------+--------+--------+--------+--------------+  |");
		System.out.printf("|  | -- | %-35s                                           |  |\n", "Boisson(s) sélectionné(s)");
		System.out.println("|  +----+-------------------------------------+--------+--------+--------+--------------+  |");
		for (Article article : boissons) {
			System.out.printf("|  | %2d | %-35s | %,6d | $%,-5.2f | $%,-4.2f  | $%,-11.2f |  |\n"
					, article.getId()
					, article.getLibelle()
					, article.getQt()
					, article.getPrixUnitaire()
					, article.getRemise()
					, (article.getPrixUnitaire() - article.getRemise()) * article.getQt());		
		}
	}

	public void afficherCommande() {
		System.out.println("|  +----+-------------------------------------+--------+--------+--------+--------------+  |");
		System.out.printf("|  | id | %-35s |   Qt   | P.U.   | Remise |     P.T.     |  |\n", "Articles");
		System.out.println("|  +----+-------------------------------------+--------+--------+--------+--------------+  |");
		afficherArticles();
		System.out.println("|  +----+-------------------------------------+--------+--------+--------+--------------+  |");
	}
	
	public float calculPrixTotal() {
		float prixTotal = 0;
		for (Article entree : entrees) {
			prixTotal += entree.getPrixUnitaire() * entree.getQt();
		}
		for (Article plat : plats) {
			 prixTotal += plat.getPrixUnitaire() * plat.getQt();
		}
		for (Article boisson : boissons) {
			prixTotal += boisson.getPrixUnitaire() * boisson.getQt();
		}
		return prixTotal;
	}
	
	public float calculRemiseTotale() {
		float remiseTotale = 0;
		for (Article entree : entrees) {
			remiseTotale += entree.getRemise() * entree.getQt();
		}
		for (Article plat : plats) {
			remiseTotale += plat.getRemise() * plat.getQt();
		}
		for (Article boisson : boissons) {
			remiseTotale += boisson.getRemise() * boisson.getQt();
		}
		return remiseTotale;
	}
	
	public float calculPrixAPayer() {
		float prixAPayer = 0;
		prixAPayer += calculPrixTotal() - calculRemiseTotale();
		return prixAPayer;
	}
}
