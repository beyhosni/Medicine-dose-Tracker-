# Medicine-dose-Tracker-
# Architecture globale :
Frontend : Angular pour l'interface utilisateur.
Backend : Spring Boot pour la logique métier et l'API REST.
Base de données : MongoDB pour le stockage des données.
Conteneurisation : Docker pour le déploiement et la gestion des conteneurs.
# Frontend (Angular) :
Structure des modules : Organisez l'application en modules (ex. dashboard, user-management, dose-tracker).
Services HTTP : Implémentez des services Angular pour communiquer avec l'API Spring Boot.
Composants : Créez des composants pour afficher et gérer les doses de médicaments, les profils utilisateurs, etc.
# Backend (Spring Boot) :
Structure du projet :
controller : Gère les requêtes HTTP et envoie les réponses.
service : Contient la logique métier.
repository : Accès aux données avec Spring Data MongoDB.
model : Définit les entités MongoDB.
Endpoints REST :
/users : Gestion des utilisateurs.
/medicines : Gestion des médicaments.
/doses : Suivi des doses (ajout, mise à jour, récupération).
Sécurité : Utilisez Spring Security avec JWT pour l'authentification et l'autorisation.
# Base de données (MongoDB) :
Collections :
users : Stocke les informations des utilisateurs.
medicines : Gère les détails des médicaments.
doses : Suit les doses planifiées et leur statut.
Schémas : Modélisez les documents avec des annotations comme @Document et @Field en Spring Boot.
# Docker :
Dockerfile pour le backend Spring Boot et un autre pour le frontend Angular.
docker-compose.yml :
Contient les services pour le backend, le frontend et MongoDB.
Réseaux et volumes : Assurez une communication fluide entre les conteneurs et persistez les données MongoDB avec des volumes.
# Flux de communication :
Appels API : Angular envoie des requêtes HTTP au backend Spring Boot, qui interagit avec MongoDB et retourne des réponses au frontend.
Sécurité : Utilisez des middlewares et des filtres de sécurité pour protéger les endpoints sensibles.