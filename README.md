E-commerce Project Backend

Description:

Ce projet implémente le backend d'une plateforme e-commerce en utilisant Spring Boot et Spring Security. Il offre des fonctionnalités essentielles telles que l'inscription et la connexion des utilisateurs via JWT (JSON Web Tokens), ainsi que la gestion de la sécurité avec l'authentification stateless. Le système permet également de récupérer des informations sur les utilisateurs et de sécuriser les requêtes avec des tokens CSRF.

Fonctionnalités:

Inscription et connexion des utilisateurs avec génération de tokens JWT.
Récupération des utilisateurs via un endpoint sécurisé.
Protection CSRF pour les requêtes sensibles.
Authentification stateless via Spring Security.
Technologies utilisées
Spring Boot & Spring Security
JWT (JSON Web Tokens)
BCryptPasswordEncoder pour la gestion sécurisée des mots de passe
H2 Database pour le stockage des utilisateurs (base de données en mémoire)
Java 17

Installation :

Clonez ce repository : git clone https://github.com/votre-utilisateur/ecommerce-project-backend.git
Allez dans le répertoire du projet : cd ecommerce-project-backend
Installez les dépendances avec Maven : mvn clean install
Démarrez l'application : mvn spring-boot:run
L'application sera disponible sur http://localhost:8080.

API Endpoints:

POST /register : Inscription d'un nouvel utilisateur.
POST /login : Connexion d'un utilisateur et obtention d'un token JWT.
GET /users : Liste des utilisateurs (authentification requise).
GET /csrf-token : Récupération du token CSRF.
GET / : Test de session avec l'ID de session
