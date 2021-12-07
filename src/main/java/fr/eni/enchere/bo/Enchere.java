
public class Enchere {

	
		private Article article;
		
		private Utilisateur utilisateur;
		
		private Date dateEnchere;
		
		private int montantEnchere;
		
		public Article getArticle() {
			return article;
		}

		
		public void setArticle(Article article) {
			this.article = article;
		}

		
		public Date getDateEnchere() {
			return dateEnchere;
		}

		
		public void setDateEnchere(Date dateEnchere) {
			this.dateEnchere = dateEnchere;
		}

		
		public int getMontantEnchere() {
			return montantEnchere;
		}

		public void setMontantEnchere(int montantEnchere) {
			this.montantEnchere = montantEnchere;
		}

		
		
		

		public Utilisateur getUtilisateur() {
			return utilisateur;
		}

		public void setUtilisateur(Utilisateur utilisateur) {
			this.utilisateur = utilisateur;
		}

	
		@Override
		public String toString() {
			return "Enchere [article=" + article + ", dateEnchere=" + dateEnchere + ", montantEnchere=" + montantEnchere
					+ utilisateur="
					+ utilisateur + "]";
		}

		
	}
	
