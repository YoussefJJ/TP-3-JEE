import java.util.List;

public class TestCatalogue {
	public static void main(String[] args) {
		CatalogueImp metier = new CatalogueImp();
		List<Produit> prods = metier.getProduitsParMotCle("HP");
		for (Produit p : prods)
			System.out.println(p.getNomProduit());
	}
}