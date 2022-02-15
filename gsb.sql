-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Mar 11 Janvier 2022 à 18:48
-- Version du serveur :  5.7.11
-- Version de PHP :  7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gsb`
--

-- --------------------------------------------------------

--
-- Structure de la table `labo`
--

CREATE TABLE `labo` (
  `chefvente_labo` varchar(50) NOT NULL,
  `id_labo` int(5) NOT NULL,
  `nom_labo` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `labo`
--

INSERT INTO `labo` (`chefvente_labo`, `id_labo`, `nom_labo`) VALUES
('Benjamin', 1, 'Sanofi'),
('Elie', 3, 'Bio Tech'),
('Franck', 4, 'Moderna'),
('Pierre', 5, 'Pasteur'),
('Vincent', 6, 'Bioderna'),
('Mathias', 7, 'LODA');

-- --------------------------------------------------------

--
-- Structure de la table `region`
--

CREATE TABLE `region` (
  `id_region` int(5) NOT NULL,
  `id_secteur` int(5) NOT NULL,
  `nom_region` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `region`
--

INSERT INTO `region` (`id_region`, `id_secteur`, `nom_region`) VALUES
(2, 3, 'Bourgogne-Franche-Comté'),
(1, 4, 'Auvergne-Rhône-Alpes'),
(3, 2, 'Bretagne'),
(4, 2, 'Centre-Val de Loire'),
(5, 1, 'Le Rhones'),
(6, 3, 'Hauts-de-France'),
(7, 1, 'Île-de-France'),
(8, 2, 'Normandie'),
(9, 5, 'Nouvelle-Aquitaine'),
(10, 5, 'Occitanie'),
(11, 2, 'Pays de la Loire'),
(12, 4, 'Provence-Alpes-Côte d\'Azur'),
(13, 5, 'Seine-et-Marne');

-- --------------------------------------------------------

--
-- Structure de la table `secteur`
--

CREATE TABLE `secteur` (
  `id_secteur` int(5) NOT NULL,
  `nom_secteur` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `secteur`
--

INSERT INTO `secteur` (`id_secteur`, `nom_secteur`) VALUES
(1, 'NORD'),
(2, 'EST'),
(3, 'SUD'),
(4, 'OUEST'),
(5, 'CENTRE');

-- --------------------------------------------------------

--
-- Structure de la table `travailler`
--

CREATE TABLE `travailler` (
  `id_visiteur` int(11) NOT NULL,
  `id_region` int(11) NOT NULL,
  `jjmmaa_travailler` date NOT NULL,
  `role_travailler` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `travailler`
--

INSERT INTO `travailler` (`id_visiteur`, `id_region`, `jjmmaa_travailler`, `role_travailler`) VALUES
(2, 3, '2021-06-22', 'Comptable'),
(6, 4, '2021-07-28', 'Commercial'),
(5, 4, '2021-12-02', 'Infirmier'),
(10, 1, '2020-10-14', 'Secrétaire'),
(11, 7, '2021-07-16', 'Ménage'),
(8, 3, '2021-12-22', 'Medecin'),
(6, 2, '2021-11-30', 'Apprentie'),
(12, 1, '2021-07-28', 'Préparer solution');

-- --------------------------------------------------------

--
-- Structure de la table `visiteur`
--

CREATE TABLE `visiteur` (
  `adresse_visiteur` varchar(50) NOT NULL,
  `cp_visiteur` varchar(10) NOT NULL,
  `dateembauche_visiteur` date NOT NULL,
  `id_labo` int(5) NOT NULL,
  `id_secteur` int(5) NOT NULL,
  `id_visiteur` int(5) NOT NULL,
  `nom_visiteur` varchar(50) NOT NULL,
  `prenom_visiteur` varchar(50) NOT NULL,
  `ville_visiteur` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `visiteur`
--

INSERT INTO `visiteur` (`adresse_visiteur`, `cp_visiteur`, `dateembauche_visiteur`, `id_labo`, `id_secteur`, `id_visiteur`, `nom_visiteur`, `prenom_visiteur`, `ville_visiteur`) VALUES
('75 Allée Robert Estienne', '75015', '2020-02-04', 7, 2, 1, 'Mahlouf', 'Benja', 'Paris'),
('110 boulevard des Maraicher', '60520', '2020-08-02', 3, 2, 2, 'Nager', 'Bastien', 'Aisne'),
('29 Rue de Bièvre', '75005', '2020-08-09', 5, 5, 3, 'Verney ', 'Babin', 'Paris'),
('1, cours Franklin Roosevelt', '13008', '2020-12-23', 3, 3, 4, 'Chapin ', 'Daigle', 'Marseille'),
('89 rue Reine Elisabeth', '57000', '2020-03-19', 3, 4, 5, 'Lamothe', 'Julien ', 'METZ'),
('69 Place Napoléon', '53000', '2020-12-02', 3, 3, 6, 'Narcisse', 'Dominic ', 'NAVAL'),
('61 place Stanislas', '92000', '2020-06-30', 4, 1, 7, 'Perrin ', 'Perrault', 'NANTERRE'),
('54 avenue du Marechal Juin', '97436', '2020-10-12', 6, 2, 8, 'Avent ', 'Legault', 'SAINT-LEU'),
('9 rue de Groussay', '17300', '2020-06-15', 1, 2, 9, 'Cartier', 'Nicolas ', 'ROCHEFORT'),
('13 rue du Président Roosevelt', '91600', '2019-09-29', 3, 4, 10, 'Paré', 'Lancelot', 'SAVIGNY-SUR-ORGE'),
('48 avenue de l\'Amandier', '33000', '2020-04-13', 4, 4, 11, 'Tollmache', 'Thierry ', 'BORDEAUX'),
('47 rue du Gue Jacquet', '86100', '2020-01-23', 5, 2, 12, 'Jobin', 'Gille', 'CHÂTELLERAULT');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `labo`
--
ALTER TABLE `labo`
  ADD PRIMARY KEY (`id_labo`);

--
-- Index pour la table `region`
--
ALTER TABLE `region`
  ADD PRIMARY KEY (`id_region`);

--
-- Index pour la table `secteur`
--
ALTER TABLE `secteur`
  ADD PRIMARY KEY (`id_secteur`);

--
-- Index pour la table `travailler`
--
ALTER TABLE `travailler`
  ADD PRIMARY KEY (`id_region`,`id_visiteur`,`jjmmaa_travailler`);

--
-- Index pour la table `visiteur`
--
ALTER TABLE `visiteur`
  ADD PRIMARY KEY (`id_visiteur`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `labo`
--
ALTER TABLE `labo`
  MODIFY `id_labo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT pour la table `region`
--
ALTER TABLE `region`
  MODIFY `id_region` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
--
-- AUTO_INCREMENT pour la table `secteur`
--
ALTER TABLE `secteur`
  MODIFY `id_secteur` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT pour la table `visiteur`
--
ALTER TABLE `visiteur`
  MODIFY `id_visiteur` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
