package tg.univlome.epl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tg.univlome.epl.entite.Article;
import tg.univlome.epl.entite.Client;
import tg.univlome.epl.entite.Commande;
import tg.univlome.epl.entite.Facture;

public class RestoFactureGesConsole {

	private static final Scanner scan = new Scanner(System.in);
	private static List<Article> entrees = new ArrayList<Article>();
	private static List<Article> plats = new ArrayList<>();
	private static List<Article> boissons = new ArrayList<>();
	private static List<Client> clients = new ArrayList<>();
	private static List<Facture> factures = new ArrayList<>();

	/*-------------------------- Les méthodes d'initialisation ---------------------------*/

	public static int bienvenu() {

//		System.out.println("Soyez les bienvenus dans votre restaurant préféré RES_TORRENT");
		System.out.println("\n\n\t\t+-------------------------------------------------+");
		System.out.println("\t\t|  RES_TORRENT - Service de gestion des factures  |");
		System.out.println("\t\t+-------------------------------------------------+\n");
		while (true) {
			try {
				System.out.println("Veuillez choisir une opération");
				System.out.print("\t[1] ~ Enregistrer un nouveau client"
						+ "\n\t[2] ~ Ajouter une entrée"
						+ "\n\t[3] ~ Ajouter un plat"
						+ "\n\t[4] ~ Ajouter une boisson"
						+ "\n\t[5] ~ Faire une facture"
						+ "\n\t[6] ~ Consulter les factures précédentes"
						+ "\n\t[7] ~ Quitter le programme\nVotre choix : ");

				String choix = scan.nextLine();
				int choice = Integer.parseInt(choix);
				return choice;
			} catch (Exception e) {
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
				System.out.println("Valeur saisie incorrecte, veuillez reprendre");
			}
		}
	}

	public static void initialiserArticles() {

//		System.out.println("Initialisation des articles");
		entrees.add(new Article("Saumon Fumé Maison"));
		entrees.add(new Article("Tartare d'Avocat et Crevettes"));
		entrees.add(new Article("Carpacion de Boeuf au Herbes"));
		entrees.add(new Article("Velouté de Champignons Sauvages"));
		entrees.add(new Article("Salade César Classique"));
		entrees.add(new Article("Salade simple", 8.5, 0.32));
		entrees.add(new Article("Salade de fruit", 9.0, 0.3));
		entrees.add(new Article("Salade de chèvre chaud aux noix", 10.50));
		entrees.add(new Article("Saumon Gravlax à l'aneth", 12.5));
		entrees.add(new Article("Soupe de potiron et crème fraîche", 8.00));
		entrees.add(new Article("Spaghetti Carbonara", 14.0));
		entrees.add(new Article("Tagliatelles aux fruits de mer", 17.5));
		entrees.add(new Article("Risotto aux asperges", 15.5));
		entrees.add(new Article("Risotto aux Truffes"));
		entrees.add(new Article("Risotto aux Champignons Porcini", 9.4));
		entrees.add(new Article("Risotto aux Champignons sauvages"));
		entrees.add(new Article("Tiramisu à la framboise", 9.0));
		entrees.add(new Article("Fondant au chocolat avec vanille", 10.5));
		entrees.add(new Article("Fondant au Chocolat Grand Cru", 10.5));
		entrees.add(new Article("Crème brûlée à la vanille", 8.5));
		entrees.add(new Article("Profiteroles au Chocolat Chaud", 12));
		entrees.add(new Article("Sorbet Citron Basilic", 9.5));
		entrees.add(new Article("Crème Brûlée à la Vanille Bourbon", 5));
		entrees.add(new Article("Tiramisu aux Framboises", 8.1));
		
		
		plats.add(new Article("Spaghetti rouge", 7.9, 0.2));
		plats.add(new Article("Spaghetti blanc", 8.2, 0.2));
		plats.add(new Article("Couscous", 9.3, 0.12));
		plats.add(new Article("Riz au gras", 9.7, 0.5));
		plats.add(new Article("Riz blanc", 8.0, 0.26));
		plats.add(new Article("Riz cantonné", 8.5, 0.7));
		plats.add(new Article("Riz jaune", 8.2, 0.32));
		plats.add(new Article("Filet Mignon Sauce au Poivre Vert", 11.4, 0.36));
		plats.add(new Article("Poulet Rôti à la Provençale", 16.8, 0.02));
		plats.add(new Article("Poulet Rôti à l'estragon", 16.5));
		plats.add(new Article("Saumon Grillé au Citron", 11.6));
		plats.add(new Article("Magret de Canard aux Fruits Rouges", 13.9));
		plats.add(new Article("Lasagnes Maison", 10.9, 0.012));
		plats.add(new Article("Penne à la Puttanesca", 4.9, 0.012));
		plats.add(new Article("Pavé de saumon à la sauce au citron", 20.0));
		

		boissons.add(new Article("Eau Minérale Gazeuse (50 cl)", 4.99));
		boissons.add(new Article("Thé Glacé Maison", 4.2));
		boissons.add(new Article("Expresso", 8, 0.23));
		boissons.add(new Article("Expresso Italien", 8.2));
		boissons.add(new Article("Cappucino", 8, 0.23));
		boissons.add(new Article("Café", 7, 0.23));
		boissons.add(new Article("Lait", 6.5, 0.1));
		boissons.add(new Article("Jus naturel de mangue", 9.4, 0.13));
		boissons.add(new Article("Sprite", 7.0, 0.23));
		boissons.add(new Article("Cola world", 7.2, 0.08));
		boissons.add(new Article("Cocktail simple", 7.2, 0.08));
		boissons.add(new Article("Cocktail Mojito", 12));
		boissons.add(new Article("Chap", 8.5, 0.08));
		boissons.add(new Article("Champagne", 9.6, 0.02));
		boissons.add(new Article("Beaufort", 12.4, 0.1));
		boissons.add(new Article("Vin Rouge du Domaine de la Vallée", 15.8, 0.1));
		boissons.add(new Article("Tiramisu à la framboise", 13.1));
	}

	public static void initialiserClients() {

//		System.out.println("Initialisation des clients");
		clients.add(new Client("TCHIGBE", "Ezéchiel"));
		clients.add(new Client("ZEGBLA", "Kossi Kaleb"));
		clients.add(new Client("MILEGNE", "Dieu donné"));
		clients.add(new Client("SOKEL", "Roland"));
		clients.add(new Client("AWOMAKOU", "Vivien"));
		clients.add(new Client("ALOWANOU", "Léonce Yvann"));
		clients.add(new Client("AGBAN", "Ezéchiel"));
		clients.add(new Client("TELOU", "Oded"));
		clients.add(new Client("PALI", "Majoie"));
		clients.add(new Client("ADONSOU", "Diane"));
		clients.add(new Client("AYITEH", "Josué"));
		clients.add(new Client("NOYOULIWA", "Victoire"));
		clients.add(new Client("AMOUSSOU", "Holla Josué"));
		clients.add(new Client("DWEGGAH", "Ariel"));
		clients.add(new Client("SOSSOU", "Olivier"));
		clients.add(new Client("AHAMA", "Jonathan"));
		clients.add(new Client("EKLOU", "Kossi Dodji"));
		clients.add(new Client("LAWSON-BODY", "Latevi Josué"));
		clients.add(new Client("BASSOWOU", "Kokou Edouard"));
		clients.add(new Client("ATUAKUMA", "Kossi Nami"));
		clients.add(new Client("DJIBOM", "Mardia"));
		clients.add(new Client("WILSON-BAHUN", "Adjé Sitou Jean-Cyrille"));
		clients.add(new Client("AMAVIGAN", "Ayi Mawuli Hénoc"));
		clients.add(new Client("KAMDE", "Aklesso Steeve"));
		clients.add(new Client("EDOH", "Yao Gildas"));
		clients.add(new Client("AGBAVO", "Koffi K. Félix"));
		clients.add(new Client("GOSSOU", "Yao Sylvain"));
		clients.add(new Client("ZODJIHOUE", "Abla Thibaute"));
		clients.add(new Client("TOFA", "Emmanuel Evamé"));
		clients.add(new Client("MADJANTA", "Yoyo Ariel Diréma"));
		clients.add(new Client("AZIAMADJI", "Koami Mawuli Crépin"));
		clients.add(new Client("YIGBE", "Israel"));
		clients.add(new Client("AMEDOME", "Sunday"));
		clients.add(new Client("AGBEGNINOU", "Léna"));
		clients.add(new Client("ETSE", "Kossivi Paul"));
		clients.add(new Client("ALI", "Rahim"));
		clients.add(new Client("KLIKO", "Geoffrey"));
		clients.add(new Client("AMAÏZO", "Teddy"));
		clients.add(new Client("HOETOWOU", "Yaovi"));
	}

	/*---------------------------- Les méthodes d'affichage ------------------------------*/

	public static void afficherClients() {

		int position = 0;
		System.out.println("\nListe des clients");
		for (Client client : clients) {
			++position;
			System.out.println("\t" + position + " - " + client.getNom() + " " + client.getPrenom());
		}
	}

	public static void afficherEntrees() {

		int position = 0;
		System.out.println("\nListe des entrées au menu");
		System.out.printf("\tid - %-35s | %5s  | %s\n", "Entrées", "P.U.", "Remise");
		for (Article entree : entrees) {
			++position;
			System.out.printf("\t%-2d - %-35s | $%-5.2f | $%-4.2f\n", position, entree.getLibelle(),
					entree.getPrixUnitaire(), entree.getRemise());
		}
	}
	
	public static void afficherPlats() {

		int position = 0;
		System.out.println("\nListe des plats au menu");
		System.out.printf("\tid - %-35s | %5s  | %s\n", "Plats", "P.U.", "Remise");
		for (Article plat : plats) {
			++position;
			System.out.printf("\t%-2d - %-35s | $%-5.2f | $%-4.2f\n", position, plat.getLibelle(),
					plat.getPrixUnitaire(), plat.getRemise());
		}
	}

	public static void afficherBoissons() {

		int position = 0;
		System.out.println("\nListe des boissons au menu");
		System.out.printf("\tid - %-35s | %6s | %s\n", "Boissons", "P.U.", "Remise");
		for (Article boisson : boissons) {
			++position;
			System.out.printf("\t%-2d - %-35s | $%-5.2f | $%-4.3f\n", position, boisson.getLibelle(),
					boisson.getPrixUnitaire(), boisson.getRemise());
		}
	}

	/*------------------------------ Les méthodes d'ajout --------------------------------*/

	public static boolean ajouterClient() {

		int position = clients.size();
		String nom = "", prenom = "";
		System.out.println("Voici la liste des clients disponibles");
		afficherClients();
		
		while(true) {
			try {
				System.out.println("\nEnregistrement d'un nouveau client");
				System.out.println("Veuillez fournir les informations nécessaires");
				System.out.print("\tNom du nouveau client : ");
				nom = scan.nextLine();
				System.out.print("\tPrenom du nouveau client : ");
				prenom = scan.nextLine();
				
				/* Vérification de l'existence du nouveau client */
				for (Client client : clients) {
					if (client.getNom().equals(nom.toUpperCase())
							&& client.getPrenom().toUpperCase().equals(prenom.toUpperCase())) {
						System.out.println("\nCe client existe déjà, veuillez ajouter un autre !");
						System.out.println("\t" + client.toString());
						return false;
					}
				}
				
				String prenomU = prenom.toUpperCase();
				String prenomL = prenom.toLowerCase();
				prenom = prenomU.charAt(0) + prenomL.substring(1);
				clients.add(new Client(nom.toUpperCase(), prenom));
				System.out.println("\n\tClient enregistré avec succès !\n" + clients.get(position).toString());
				return true;

			} catch(Exception e) {
				System.out.println("Informations fournies incorrectes, veuillez réessayer");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}	
		}
	}

	public static boolean ajouterEntree() {

		int position = entrees.size();
		String libelle, prixUnitaire, remise;
		System.out.println("\nVoici la liste des entrées disponibles");
		afficherEntrees();
		
		while(true) {
			try {
				System.out.println("\nAjout d'une nouvelle entrée au menu");
				System.out.println("Veuillez fournir les informations nécessaires");
				System.out.print("\tNom de la nouvelle entrée : ");
				libelle = scan.nextLine();
		
				/* Vérification de l'existence de la nouvelle entrée*/
				for (Article entree : entrees) {
					if (entree.getLibelle().toUpperCase().equals(libelle.toUpperCase())) {
						System.out.println("\nCette entrée existe déjà dans la base, veuillez ajouter un autre !");
						System.out.println(entree.toString());
						return false;
					}
				}
		
				System.out.print("\tPrix unitaire de la nouvelle entrée : ");
				prixUnitaire = scan.nextLine();
				
				System.out.print("\tRemise de la nouvelle entrée: ");
				remise = scan.nextLine();
				
				entrees.add(new Article(libelle, Float.parseFloat(prixUnitaire), Float.parseFloat(remise)));
				System.out.println("\n\tNouvelle entrée créée avec succès !\n\t" + entrees.get(position).toString());
				return true;
			} catch (Exception e) {
				System.out.println("Informations fournies incorrectes, veuillez reprendre");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static boolean ajouterPlat() {

		int position = plats.size();
		String libelle, prixUnitaire, remise;
		System.out.println("\nVoici la liste des plats disponibles");
		afficherPlats();
		
		while (true) {
			try {
				System.out.println("\nAjout d'un nouveau plat au menu");
				System.out.println("Veuillez fournir les informations nécessaires");
				System.out.print("\tNom du nouveau plat : ");
				libelle = scan.nextLine();
		
				/* Vérification de l'existence du nouveau plat */
				for (Article plat : plats) {
					if (plat.getLibelle().toUpperCase().equals(libelle.toUpperCase())) {
						System.out.println("\nCe plat existe déjà dans la base, veuillez ajouter un autre !");
						System.out.println(plat.toString());
						return false;
					}
				}
		
				System.out.print("\tPrix unitaire du nouveau plat : ");
				prixUnitaire = scan.nextLine();
				
				System.out.print("\tRemise du nouveau plat : ");
				remise = scan.nextLine();
				
				plats.add(new Article(libelle, Float.parseFloat(prixUnitaire), Float.parseFloat(remise)));
				System.out.println("\n\tNouveau plat créé avec succès !\n\t" + plats.get(position).toString());
				return true;
			} catch(Exception e) {
				System.out.println("Informations fournies incorrectes, veuillez reprendre");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}
		}
	}

	public static boolean ajouterBoisson() {

		int position = boissons.size();
		String libelle, prixUnitaire, remise;
		System.out.println("\nVoici la liste des boissons disponibles");
		afficherBoissons();
		
		while (true) {
			try {
				System.out.println("\nAjout d'une nouvelle boisson au menu");
				System.out.println("Veuillez fournir les informations nécessaires");
				System.out.print("\tNom de la nouvelle boisson : ");
				libelle = scan.nextLine();
		
				/* Vérification de l'existence de la nouvelle boisson */
				for (Article boisson : boissons) {
					if (boisson.getLibelle().toUpperCase().equals(libelle.toUpperCase())) {
						System.out.println("\nCette boisson existe déjà dans la base, veuillez ajouter une autre !");
						System.out.println(boisson.toString());
						return false;
					}
				}
		
				System.out.print("\tPrix unitaire de la nouvelle boisson : ");
				prixUnitaire = scan.nextLine();
				
				System.out.print("\tRemise de la nouvelle boisson : ");
				remise = scan.nextLine();
				
				boissons.add(new Article(libelle, Float.parseFloat(prixUnitaire), Float.parseFloat(remise)));
				System.out.println("\n\tNouvelle boisson enregistrée avec succès !\n\t" + boissons.get(position).toString());
				return true;
			} catch (Exception e) {
				System.out.println("Informations fournies incorrectes, veuillez reprendre");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}
		}
	}

	{
		/*--------------------------- Les méthodes de modification ---------------------------*/

//	public static void modifierPlat() {
//		
//		int position = plats.size();
//		System.out.println("\nVeuillez d'abord sélectionner un plat parmi la liste suivante");
//		afficherPlats();
//		System.out.print("\nL'identifiant du plat à modifier : ");
//		String choix = scan.nextLine();
//		
//		if (1 <= Integer.parseInt(choix) && Integer.parseInt(choix) >= position) {
//			System.out.println(plats.get(Integer.parseInt(choix) - 1).toString());
//			System.out.println("Veuillez renseigner les informations nécessaires à la modification");
//			System.out.print("\tNouveau libellé : ");
//			String libelle = scan.nextLine();
//			System.out.print("\tNouveau prix unitaire : ");
//			String prix = scan.nextLine();
//			System.out.print("\tNouvelle remise : ");
//			String remise = scan.nextLine();
//			
//			libelle = libelle.toUpperCase().charAt(0) + libelle.toLowerCase().substring(1);
//			try {
//				Article article = new Article(libelle, Integer.parseInt(prix), Integer.parseInt(remise));
//				plats.set((Integer.parseInt(choix) - 1), article);
//				System.out.println(plats.get(Integer.parseInt(choix)).toString());
//			} catch(Exception e){
//				System.out.println("Les informations sasies sont invalides");
//			}
//			
//		} else {
//			System.out.println("Identifiant incorrect, veuillez réessayer !");
//		}
//	}
//	
//	public static void modifierBoisson() {
//		
//	}
//	
//	public static void modifierClient() {
//		
//	}
//	
//	public static void modifier() {
//		
//	}
	}
	/*------------------------------- Les méthodes de choix ------------------------------*/

	public static Client choisirClient() {

		System.out.println("\nChoix du client");
		afficherClients();
		while (true) {
			try {
				System.out.printf("\n\tVotre choix (1 - %d) : ", clients.size());
				String choix = scan.nextLine();
				int choice = Integer.parseInt(choix);
				if (choice > 0 && choice <= clients.size()) {
					System.out.println(clients.get(choice - 1).toString());
					return clients.get(choice - 1);
				} else {
					System.out.println("\n\tChoix hors de l'intervale de sélection");
				}
			} catch(Exception e) {
				System.out.println("Saisie incorrecte, veuillez reprendre");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}
		}
	}

	public static Article choisirEntree() {

		System.out.println("\nChoisir une entrée");
		afficherEntrees();
		
		while(true) {
			try {
				System.out.printf("\n\tVotre choix d'entrée (1 - %d ou 0 pour ne rien choisir) : ", entrees.size());
				String choix = scan.nextLine();
				int choice = Integer.parseInt(choix);
		
				if (choice == 0) {
					System.out.println("\n\tVous avez choisi aucune entrée !");
					return null;
				} else if(choice > 0 && choice <= entrees.size()) {
					System.out.println(entrees.get(choice - 1).toString());
					return entrees.get(choice - 1);
				} else {
					System.out.println("Choix hors de l'intervalle de sélection");
				}
			} catch(Exception e) {
				System.out.println("Saisie incorrecte, veuillez reprendre");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static Article choisirPlat() {

		System.out.println("\nChoisir un plat");
		afficherPlats();
		
		while (true) {
			try {
				System.out.printf("Votre choix de plat (1 - %d ou 0 pour ne rien choisir) : ", plats.size());
				String choix = scan.nextLine();
				int choice = Integer.parseInt(choix);
		
				if (choice == 0) {
					System.out.println("\n\tVous avez choisi aucun plat !");
					return null;
				} else if (choice > 0 && choice <= plats.size()) {
					System.out.println(plats.get(choice - 1).toString());
					return plats.get(choice - 1);
				} else {
					System.out.println("Choix hors de l'intervalle de sélection");
				}
			} catch (Exception e) {
				System.out.println("Saisie incorrecte, veuillez reprendre");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}
		}
	}

	public static Article choisirBoisson() {

		System.out.println("\nChoisir une boisson");
		afficherBoissons();
		
		while(true) {
			try {
				System.out.printf("Votre choix de boisson (1 - %d ou 0 pour ne rien choisir) : ", boissons.size());
				String choix = scan.nextLine();
				int choice = Integer.parseInt(choix);
		
				if (choice == 0) {
					System.out.println("\n\tVous avez choisi aucune boisson");
					return null;
				} else if (choice > 0 && choice <= boissons.size()) {
					System.out.println(boissons.get(choice - 1).toString());
					return boissons.get(choice - 1);
				} else {
					System.out.println("Choix hors de l'intervalle de sélection");
				}
			} catch (Exception e) {
				System.out.println("Saisie incorrecte, veuillez reprendre");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}
		}
	}
	
	
	/*----------------------------- Les méthodes d'exécution -----------------------------*/

	public static Commande faireCommande() {

		Commande commande = new Commande();
		Article entree = null;
		Article plat = null;
		Article boisson = null;
		
		while (true) {

			System.out.println("\nFaire une commande");
			try {
				entree = choisirEntree();
				if (entree != null) {
					System.out.print("\tQuantité : ");
					String qt = scan.nextLine();
					commande.ajouterEntree(entree, Integer.parseInt(qt));
				}
			} catch (Exception e) {
				System.out.println("Erreur lors de l'enregistrement de l'entrée");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}
			
			try {
				plat = choisirPlat();
				if (plat != null) {
					System.out.print("\tQuantité : ");
					String qt = scan.nextLine();
					commande.ajouterPlat(plat, Integer.parseInt(qt));
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de l'enregistrement du plat principal");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}

			try {
				boisson = choisirBoisson();
				if (boisson != null) {
					System.out.print("\tQunatité : ");
					String qt = scan.nextLine();
					commande.ajouterBoisson(boisson, Integer.parseInt(qt));
				} else if (boisson == null && plat == null && entree == null) {
					return commande;
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de l'enregistrement de votre boisson");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}

			System.out.print("\nVous voulez faire encore un choix ? (o/n) : ");
			String choice = scan.nextLine();
			if (choice.charAt(0) == 'o' || choice.charAt(0) == 'O') {
				continue;
			} else {
				return commande;
			}
		}
	}

	public static void faireUneFacture() {

		System.out.println("\nFaire une facture pour un client existant");
		System.out.println("Veuillez d'abord sélectionner un client");
		Client client = choisirClient();
		System.out.println("\n\tClient sélectionné avec succès !");
		try {
			Commande commande = faireCommande();
			System.out.println("\n\tCommande faite avec succès !");
			System.out.println();
			Facture facture = new Facture(commande, client);
			client.setNbFacture(client.getNbFacture() + 1);
			factures.add(facture);
			facture.afficher();
		} catch(Exception e) {
			System.out.println("Erreur lors de l'enregistrement de la facture");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
	}

	public static void consulterFactures() {

		System.out.println("\nConsultation des anciennes factures");

		System.out.println("\t(1) - Afficher les informations concernant les anciennes factures");
		System.out.println("\t(2) - Afficher une facture spécifique");
		System.out.println("\t(3) - Afficher toutes les factures précédentes");
		
		try {
			System.out.print("\nVotre choix : ");
			String choix = scan.nextLine();
			
			if (Integer.parseInt(choix) == 1) {
				if (factures.size() == 0) {
					System.out.println("Aucune facture enregistée précedemment");
				} else {
					System.out.println("\n\nAffichage des informations concernant les anciennes fatures\n");
					for (Facture facture : factures) {
						System.out.println(facture.toString());
					}
				}
			} else if (Integer.parseInt(choix) == 2) {
				if (factures.size() == 0) {
					System.out.println("Aucune facture enregistée précedemment");
				} else {
					int i = 0;
					System.out.println("\n\nAffichage d'une facture spacifique");
					System.out.println("Il faut d'abord sélectionner une fature en fonction de son identifiant");
					for (Facture facture : factures) {
						++i;
						System.out.println("N° " + i + " " + facture.toString());
					}
					
					try {
						System.out.printf("Votre choix (1 - %d) : ", factures.size());
						String choice = scan.nextLine();
						if (1 <= Integer.parseInt(choice) && Integer.parseInt(choice) <= factures.size()) {
							System.out.println("\n");
							factures.get(Integer.parseInt(choice) - 1).afficher();
							;
						} else {
							System.out.println("Choix introuvable, veuillez réessayer !");
						}
					} catch(Exception e) {
						System.out.println("Saisie invalide");
						System.out.println(e.getClass());
						System.out.println(e.getMessage());
					}
				}
			} else if (Integer.parseInt(choix) == 3) {
				if (factures.size() == 0) {
					System.out.println("Aucune fature enregistée précedemment");
				} else {
					System.out.println("\n\nAffichage de toutes les anciennes factures\n");
					for (Facture facture : factures) {
						facture.afficher();
						System.out.println("\n\n");
					}
				}
			} else {
				System.out.println("Choix incorrect !");
			}
		} catch(Exception e) {
			System.out.println("Choix invalide");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
	}

	/*-----------------------------Les méthodes de recherches ----------------------------*/

	/*----------------------------- Les méthodes d'exécution -----------------------------*/

	public static void appelDeMethode(int choice) {

		switch (choice) {
		case 1:
			ajouterClient();
			break;
		case 2:
			ajouterEntree();
			break;
		case 3:
			ajouterPlat();
			break;
		case 4:
			ajouterBoisson();
			break;
		case 5:
			faireUneFacture();
			break;
		case 6:
			consulterFactures();
			break;
		case 7:
			System.out.println("Merci d'avoir utilisé ce programme, à la prochaine !");
			System.exit(-1);
		default:
			System.out.println("Vous avez effectué un mauvais choix, veuillez reprendre !");
			break;
		}
	}

	public static void executer() {

		initialiserArticles();
		initialiserClients();
		while (true) {
			int choix = bienvenu();
			appelDeMethode(choix);
			try {
				System.out.print("\nVous voulez reprendre ? (o/n) : ");
				String choice = scan.nextLine();
				choice = choice.toUpperCase();
				if (choice.charAt(0) == 'O') {
					continue;
				} else {
					System.out.println("Merci d'avoir utilisé ce programme !");
					System.out.println();
					scan.close();
					break;
				}
			} catch(Exception e) {
				System.out.println("Saisie invalide");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}
		}
	}

	/*---------------------------------- La méthode main ---------------------------------*/

	public static void main(String[] args) {

		executer();
	}
}
