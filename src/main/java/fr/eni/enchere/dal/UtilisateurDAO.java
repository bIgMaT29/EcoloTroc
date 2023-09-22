/**
 * 
 */
package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

/**
 * @author user
 *
 */
public interface UtilisateurDAO {

	public void insertOneUser(Utilisateur utilisateur);

	public List<Utilisateur> getAllUsers();

	public Utilisateur connectionUser(String pseudo, String motDePasse);

	public void modifActivateUser(Utilisateur utilisateur);

	public void deleteOneUser(Utilisateur utilisateur);

	public void update(Utilisateur utilisateur, int noUtilisateur);

	public Utilisateur selectById(int noIdentifiant);

	public void updateMdp(Utilisateur utilisateur, int noUtilisateur);

	public Utilisateur selectByPseudo(String pseudo);

	public Utilisateur selectByEmail(String email);

}
