package fr.eni.enchere.bo;

import java.time.LocalDate;

//Classe représentant l'offre faite par un utilisateur pour un article donné
public class Enchere {
	
	private Integer noEnchere;
	private Utilisateur utilisateurAcheteur;
	private ArticleVendu articleVendu;
	private LocalDate dateEnchere;
	private int montantEnchere;
	
	public Enchere( Integer noEnchere, Utilisateur utilisateurAcheteur, LocalDate dateEnchere, int montantEnchere,
			ArticleVendu articleVendu ) {
		this.setNoEnchere(noEnchere);
		this.setUtilisateurAcheteur(utilisateurAcheteur);
		this.setDateEnchere(dateEnchere);
		this.setMontantEnchere(montantEnchere);
		this.setArticleVendu(articleVendu);
	}
	
	public Enchere( Utilisateur utilisateurAcheteur, LocalDate dateEnchere, int montantEnchere,
				ArticleVendu articleVendu ) {
		this( null, utilisateurAcheteur, dateEnchere, montantEnchere, articleVendu );
	}
	
	public Integer getNoEnchere() {
		return noEnchere;
	}

	public void setNoEnchere(Integer noEnchere) {
		this.noEnchere = noEnchere;
	}

	public Utilisateur getUtilisateurAcheteur() {
		return utilisateurAcheteur;
	}
	public void setUtilisateurAcheteur(Utilisateur utilisateurAcheteur) {
		this.utilisateurAcheteur = utilisateurAcheteur;
	}
	public LocalDate getDateEnchere() {
		return dateEnchere;
	}
	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	public int getMontantEnchere() {
		return montantEnchere;
	}
	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}
	public ArticleVendu getArticleVendu() {
		return articleVendu;
	}
	public void setArticleVendu(ArticleVendu articleVendu) {
		this.articleVendu = articleVendu;
	}

	@Override
	public String toString() {
		return "Enchere [noEnchere=" + noEnchere + ", utilisateurAcheteur=" + utilisateurAcheteur + ", articleVendu="
				+ articleVendu + ", dateEnchere=" + dateEnchere + ", montantEnchere=" + montantEnchere + "]";
	}	
	
	
}
