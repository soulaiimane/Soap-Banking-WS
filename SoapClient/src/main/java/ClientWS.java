import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub=new BanqueWS().getBanqueServicePort();
        System.out.println("-Test de la methode convert avec un montant = 150 la resultat = "+stub.convert(150.0)+" Dh");
        System.out.println("-Test de la méthod getCompte() avec un id=5 ");
        Compte compte=stub.getCompte(5);
        System.out.println("la Résultat est sous dessous");
        System.out.println("Numero de client = "+compte.getCode());
        System.out.println("solde du client Numero  "+compte.getCode()+" est "+compte.getSolde());
        List<Compte> compteList= stub.compteList();
        System.out.println("-Test de la Méthode compteList() Resultat : ");
        for (Compte a:compteList) {
            System.out.println("client Numéro :"+a.getCode());
            System.out.println("a un solde = "+a.getSolde());

        }

    }
}
