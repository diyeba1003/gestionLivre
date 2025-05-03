# Backend - Gestion des Livres avec Spring Boot, Spring Security et JWT

## Description
Ce backend est construit avec **Spring Boot**, **Spring Security** et utilise des **JSON Web Tokens (JWT)** pour sécuriser les endpoints et gérer l'authentification des utilisateurs. Il permet de gérer une collection de livres avec des fonctionnalités CRUD (création, lecture, mise à jour et suppression).

## Prérequis
Avant de lancer le backend, assurez-vous d'avoir les outils suivants installés :
- **Java 17** ou version supérieure
- **Maven** ou **Gradle**
- **Base de données** :
- pour la base de données j'ai des utilisateurs avec roles: admin et user, c'est le admin qui peut avoir certaines actions si vous arrivez pas à inserer un utilisateur avec le role admin, vous pouvez  l'inserer avec un role USER ensuite modifier l'utilisateur en lui attribuant le role ADMIN
## Installation

1. Clonez ce repository :
   git clone https://github.com/diyeba1003/gestionLivre.git
   
2. Configurer application.properties pour la base de données
3.  lancer les commande:
   cd gestionLivre
   mvn clean
   mvn install
   mvn spring-boot:run

5. localhost:8080
  
   
   


   
   
