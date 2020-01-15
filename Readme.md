C'est une application simple qui gére des utilisateurs,des comptes et des commissions ou sont inscrit les utilisateur.
Pour l'application monolithique,elle est exécuté sur le port 8181, puis elle est exécuté dans une image docker.
Puis on a séparé la partie qui gére la compte de la partie qui gére l'utilisateur sous forme de micro-service basé sur spring boot et spring cloud.
et pour l'executer il faut créer un fichier git local de configuration pour application.properties,micro-service-compte et micro-service-utilisateur 
et on voir l'enregistrement des microservices et du proxy dans eureka ainsi l'invocation des microservices à travers le proxy.
