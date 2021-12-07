
	public class Article {

	
		private int idArticle;

		private String nomArticle;

		
		private String description;

		
		private Date dateDebutEnchere;

	
		private Date dateFinEnchere;

		
		private int MiseAprix;

		
		private int prixVente;

		
		private boolean etatVente;


		private Categorie categorie;

		private Utilisateur utilisateur;

		private Enchere enchere;


		public int getIdArticle() {
			return idArticle;
		}

		
		public void setIdArticle(int idArticle) {
			this.idArticle = idArticle;
		}

		
		public String getNomArticle() {
			return nomArticle;
		}

		
		public void setNomArticle(String nomArticle) {
			this.nomArticle = nomArticle;
		}

		
		public String getDescription() {
			return description;
		}

		
		public void setDescription(String description) {
			this.description = description;
		}

		public Date getDateDebutEnchere() {
			return dateDebutEnchere;
		}

		
		public void setDateDebutEnchere(Date dateDebutEnchere) {
			this.dateDebutEnchere = dateDebutEnchere;
		}

	
		public Date getDateFinEnchere() {
			return dateFinEnchere;
		}

		
		public void setDateFinEnchere(Date dateFinEnchere) {
			this.dateFinEnchere = dateFinEnchere;
		}

		
		public int getMiseAprix() {
			return MiseAprix;
		}

		public void setPrixInitial(int MiseAprix) {
			this.MiseAprix = MiseAprix;
		}

		
		public int getPrixVente() {
			return prixVente;
		}

		
		public void setPrixVente(int prixVente) {
			this.prixVente = prixVente;
		}

		
		public boolean isEtatVente() {
			return etatVente;
		}

		
		public void setEtatVente(boolean etatVente) {
			this.etatVente = etatVente;
		}

		public Categorie getCategorie() {
			return categorie;
		}

		public void setCategorie(Categorie categorie) {
			this.categorie = categorie;
		}

		public Utilisateur getUtilisateur() {
			return utilisateur;
		}

		public void setUtilisateur(Utilisateur utilisateur) {
			this.utilisateur = utilisateur;
		}

		public Enchere getEnchere() {
			return enchere;
		}

		public void setEnchere(Enchere enchere) {
			this.enchere = enchere;
		}

		@Override
		public String toString() {
			return "Article{" +
					"idArticle=" + idArticle +
					", nomArticle='" + nomArticle + '\'' +
					", description='" + description + '\'' +
					", dateDebutEnchere=" + dateDebutEnchere +
					", dateFinEnchere=" + dateFinEnchere +
					", prixInitial=" + prixInitial +
					", prixVente=" + prixVente +
					", etatVente=" + etatVente +
					'}';
		}
	}
	


