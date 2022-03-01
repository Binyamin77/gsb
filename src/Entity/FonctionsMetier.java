/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListModel;
import static javax.swing.UIManager.getString;


public class FonctionsMetier implements IMetier
{
    //ces 3 objets sont obligatoires pour faire les requetes 
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection maCnx;
    
    
    /**
     * Affichage en liste des régions disponible
     * @author polo
     * @param test
     * 
     */
    @Override
    public ArrayList<region> getAllRegion() {
      ArrayList<region>mesRegions = new ArrayList <region>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("SELECT id_region,nom_secteur,nom_region FROM region, secteur WHERE region.id_secteur = secteur.id_secteur ORDER BY nom_secteur ASC");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                region r = new region((rs.getInt(1)),rs.getString(2),rs.getString(3));
                mesRegions.add(r);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesRegions; 
    }
    
       @Override
       /**
        * Ajout d'une région
        */
  public void AddRegion(String cbSecteur, String nomRegion) 
  {
        try {
            maCnx=ConnexionBdd.getCnx();
            
             //recupere id seceteur
            ps = maCnx.prepareStatement("select id_secteur from secteur where nom_secteur = '"+cbSecteur+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numSecteur = rs.getInt(1);
            rs.close();
            
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("INSERT INTO `region` (`id_region`, `id_secteur`, `nom_region`) VALUES (NULL, '"+numSecteur+"', '"+nomRegion+"');");
            
            //on met pr le add et le modifier
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
        @Override
        /**
         * Modifier une region
         * @autor
         */
  public void ModifRegion(int idRegion,String cbSecteur, String nomRegion) 
  {
        try {
            maCnx=ConnexionBdd.getCnx();
            
             //recupere id seceteur
            ps = maCnx.prepareStatement("select id_secteur from secteur where nom_secteur = '"+cbSecteur+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numSecteur = rs.getInt(1);
            rs.close();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("UPDATE `region` SET `id_secteur` = '"+numSecteur+"',`nom_region` = '"+nomRegion+"' WHERE `region`.`id_region` = '"+idRegion+"';");
            
            //on met pr le add et le modifier
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
  }



    @Override
    /**
     * Récuperer l'ensemble des laboratoires 
     */
    public ArrayList<labo> getAllLabo() {
        ArrayList<labo>mesLabos = new ArrayList <labo>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select chefvente_labo,id_labo,nom_labo from labo ORDER BY `chefvente_labo` ASC");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                labo l = new labo(rs.getString(1),rs.getInt(2),rs.getString(3));
                mesLabos.add(l);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesLabos; 
    }
    
      @Override
      /**
       * MODIFIER LABORATOIRE
       */
  public void ModifLabo(int idLabo,String nomChef, String nomLabo) 
  {
        try {
            maCnx=ConnexionBdd.getCnx();
            
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("UPDATE `labo` SET `chefvente_labo` = '"+nomChef+"',`nom_labo` = '"+nomLabo+"' WHERE `labo`.`id_labo` = '"+idLabo+"';");
            
            //on met pr le add et le modifier
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
        @Override
        /**
         * AJOUTER LABORATOIRE
         */
  public void AddLabo(String nomChef, String nomLabo) 
  {
        try {
            maCnx=ConnexionBdd.getCnx();
            
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("INSERT INTO labo (chefvente_labo, id_labo, nom_labo) VALUES ('"+nomChef+"', NULL, '"+nomLabo+"')");
            
            //on met pr le add et le modifier
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
  }

  

    

    @Override
    /**
     * LISTER LES SECTEURS 
     */
    public ArrayList<secteur> getAllSecteur() {
        ArrayList<secteur>mesSecteurs = new ArrayList <secteur>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select * from secteur");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                secteur s = new secteur((rs.getInt(1)),rs.getString(2));
                mesSecteurs.add(s);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesSecteurs; 
    }
    
           @Override
           /**
            * AJOUTER SECTEUR
            */
  public void AddSecteur(String nomSecteur) 
  {
        try {
            maCnx=ConnexionBdd.getCnx();
            
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("INSERT INTO `secteur` (`id_secteur`, `nom_secteur`) VALUES (NULL,'"+nomSecteur+"');");
            
            //on met pr le add et le modifier
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
            @Override
            /**
             * MODIFIER SECTEUR
             */
  public void ModifSecteur(int idSecteur,String nomSecteur) 
  {
      
            try {
            maCnx=ConnexionBdd.getCnx();
            
           
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("UPDATE `secteur` SET `nom_secteur` = '"+nomSecteur+"' WHERE `secteur`.`id_secteur` = '"+idSecteur+"';");
            
            //on met pr le add et le modifier
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
  }

    @Override
    /**
     * LISTER TRAVAILLEUR
     */
    public ArrayList<travailler> getAllTravailler() {
           ArrayList<travailler>mesTravailler = new ArrayList <travailler>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("SELECT nom_visiteur,nom_region,jjmmaa_travailler,role_travailler FROM travailler,region, visiteur WHERE travailler.`id_region` = region.`id_region` and travailler.id_visiteur=visiteur.id_visiteur ORDER BY `nom_visiteur` ASC");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                travailler t;
                t = new travailler((rs.getString(1)),rs.getString(2),rs.getDate(3),rs.getString(4));
                mesTravailler.add(t);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesTravailler;
    }
    
    
                  @Override
                  /**
                   * AJOUTER UN TRAVILLEUR POUR UNE JOURNEE, DANS UNE REGION, AVEC LABOO
                   */
  public void AddTravailler(String cbVisiteur, String cbRegion, String dateTravailler ,String roleTravailler) 
  {
        try {
            maCnx=ConnexionBdd.getCnx();
            
            //recupere id Visiteur
            ps = maCnx.prepareStatement("select id_visiteur from visiteur where nom_visiteur = '"+cbVisiteur+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numVisiteur = rs.getInt(1);
            rs.close();
            
            //rcupere id du labo dans le selected
            ps = maCnx.prepareStatement("select id_region from region where nom_region = '"+cbRegion+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numRegion = rs.getInt(1);
            rs.close();
            
            
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("INSERT INTO `travailler` (`id_visiteur`, `id_region`, `jjmmaa_travailler`, `role_travailler`) VALUES ('"+numVisiteur+"', '"+numRegion+"', '"+dateTravailler+"', '"+roleTravailler+"');");
            
            //on met pr le add et le modifier
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
                    @Override
                    /**
                     * MODIFIER UN TRAVAILLEUR
                     */
  public void ModifTravailler(String cbVisiteur, String cbRegion, String dateTravailler ,String roleTravailler,String cbVisiteur2, String cbRegion2, String dateTravailler2 ,String roleTravailler2) 
  {
        try {
            maCnx=ConnexionBdd.getCnx();
            
            //recupere id Visiteur New
            ps = maCnx.prepareStatement("select id_visiteur from visiteur where nom_visiteur = '"+cbVisiteur+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numVisiteur = rs.getInt(1);
            rs.close();
            
            //recupere id Visiteur Old
            ps = maCnx.prepareStatement("select id_visiteur from visiteur where nom_visiteur = '"+cbVisiteur2+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numVisiteur2 = rs.getInt(1);
            rs.close();
            
            //rcupere id du region dans le selected
            ps = maCnx.prepareStatement("select id_region from region where nom_region = '"+cbRegion+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numRegion = rs.getInt(1);
            rs.close();
            
            //rcupere id du region dans le selected
            ps = maCnx.prepareStatement("select id_region from region where nom_region = '"+cbRegion2+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numRegion2 = rs.getInt(1);
            rs.close();
            
            
            
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("UPDATE `travailler` SET `id_visiteur` = '"+numVisiteur+"', `id_region` = '"+numRegion+"', `jjmmaa_travailler` = '"+dateTravailler+"', `role_travailler` = '"+roleTravailler+"' WHERE `travailler`.`id_visiteur` = '"+numVisiteur2+"' AND `travailler`.`id_region` = '"+numRegion2+"' AND `travailler`.`jjmmaa_travailler` = '"+dateTravailler2+"';");
            
            //on met pr le add et le modifier
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
  }

    @Override
    /**
     * LISTER VISITEUR
     */
    public ArrayList<visiteur> getAllVisiteur() {
                ArrayList<visiteur>mesVisiteurs = new ArrayList <visiteur>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("SELECT adresse_visiteur,cp_visiteur,dateembauche_visiteur,nom_labo,nom_secteur,id_visiteur,nom_visiteur,prenom_visiteur,ville_visiteur FROM `visiteur`,`secteur`,`labo` WHERE visiteur.`id_secteur` = secteur.`id_secteur` AND visiteur.id_labo = labo.id_labo ORDER BY `id_visiteur` ASC");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                visiteur v;
                v = new visiteur((rs.getString(1)),rs.getString(2),rs.getDate(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getString(9));
                mesVisiteurs.add(v);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesVisiteurs;
    }
    
               @Override
               /**
                * AJOUTER UN VISITEUR
                */
  public void AddVisiteur(String adresseVisiteur,String cpVisiteur,String dateEmbauche, String cbLabo, String cbSecteur, String nomVisiteur, String prenomVisiteur, String villeVisiteur) 
  {
        try {
            maCnx=ConnexionBdd.getCnx();
            
            //rcupere id du labo dans le selected
            ps = maCnx.prepareStatement("select id_labo from labo where nom_labo = '"+cbLabo+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numLabo = rs.getInt(1);
            rs.close();
            
            //recupere id seceteur
            ps = maCnx.prepareStatement("select id_secteur from secteur where nom_secteur = '"+cbSecteur+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numSecteur = rs.getInt(1);
            rs.close();
            
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("INSERT INTO `visiteur` (`adresse_visiteur`, `cp_visiteur`, `dateembauche_visiteur`, `id_labo`, `id_secteur`, `id_visiteur`, `nom_visiteur`, `prenom_visiteur`, `ville_visiteur`) VALUES ('"+adresseVisiteur+"', '"+cpVisiteur+"','"+dateEmbauche+"', '"+numLabo+"', '"+numSecteur+"', NULL, '"+nomVisiteur+"', '"+prenomVisiteur+"', '"+villeVisiteur+"');");
            
            //on met pr le add et le modifier
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
                @Override
                /**
                 * MODIFIER UN VISITEUR
                 */
  public void ModifVisiteur(String adresseVisiteur,String cpVisiteur,String dateEmbauche, String cbLabo, String cbSecteur,int IdVisiteur, String nomVisiteur, String prenomVisiteur, String villeVisiteur) 
  {
        try {
            maCnx=ConnexionBdd.getCnx();
            
            //rcupere id du labo dans le selected
            ps = maCnx.prepareStatement("select id_labo from labo where nom_labo = '"+cbLabo+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numLabo = rs.getInt(1);
            rs.close();
            
            //recupere id seceteur
            ps = maCnx.prepareStatement("select id_secteur from secteur where nom_secteur = '"+cbSecteur+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numSecteur = rs.getInt(1);
            rs.close();
            
            //on ecrit dans le ps la requete POUR UNE MISE A JOUR
            ps= maCnx.prepareStatement("UPDATE `visiteur` SET `adresse_visiteur` = '"+adresseVisiteur+"', `cp_visiteur` =  '"+cpVisiteur+"', `dateembauche_visiteur` = '"+dateEmbauche+"' , `id_labo` = '"+numLabo+"' ,  `id_secteur` = '"+numSecteur+"' ,`nom_visiteur` = '"+nomVisiteur+"' ,`prenom_visiteur` = '"+prenomVisiteur+"' , `ville_visiteur` =  '"+villeVisiteur+"' WHERE `visiteur`.`id_visiteur` = '"+IdVisiteur+"';");
            
            //on met pr le add et le modifier
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
  /**
   * 
   * @return STATISTIQUE
   */
      public HashMap<String,Double> GetDatasGraph1()
    {
        HashMap<String,Double> lesDatas = new HashMap<>();
        try {
            
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT nom_secteur,COUNT(region.id_region) AS 'Nombre region' FROM `secteur`,region WHERE secteur.id_secteur=region.id_secteur GROUP BY nom_secteur");
            rs = ps.executeQuery();
            while(rs.next())
            {
                lesDatas.put(rs.getString(1),rs.getDouble(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesDatas;
    } 
      
          public HashMap<String,Double> GetDatasGraph2()
    {
        HashMap<String,Double> lesDatas = new HashMap<>();
        try {
            
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT nom_secteur,COUNT(region.id_region) AS 'Nombre region' FROM `secteur`,region WHERE secteur.id_secteur=region.id_secteur GROUP BY nom_secteur");
            rs = ps.executeQuery();
            while(rs.next())
            {
                lesDatas.put(rs.getString(1),rs.getDouble(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesDatas;
    } 
    
  
}
