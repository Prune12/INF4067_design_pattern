# INF4067_design_pattern
ce repository contient les differents codes sources des differents types de patrons de conception implémentés en JAVA. Il est organisé tel que nous avons un grand dossier "pattern_de_construction"
qui contient plusieurs sous dossier et chaque sous dossier contient le code sur de l'implementation d'un patron spécifique. Ces dossiers sont:
      -abstract_factory
      -factory
      -Singleton
      -builder
      
**************************************************************************le dossier abstract_factory**************************************************************************
le dossier abstract_factory contient l'implementation du patron appelé "ABSTRACT FACTORY" qui est un type de patron de construction et qui fonctionne comme suit:
             =>Le but est de créer des objets regroupés en familles sans avoir à
                connaître leurs classes concrètes.
             => Permet de fournir une interface unique pour instancier des objets
               d’une même famille sans avoir à connaitre les classes à instancier.
             => Son utilisation est pertinente lorsque :
                o Le système est indépendant de la création des objets qu’il utilise
                o Le système est capable de créer des objets d’une même famille
ce dossier est constitué de deux dossiers nommés:
            -> abstract_factory_family1: qui contient deux autres dossiers nommés:
                + code: qui contient le code source de l'implementation de l'exemple sur les produits avec deux familles de produit(1) et (2) tel que dans le cours (patron ABSTRACT FACTORY) avec une classe contenant une methode main() pour l'executer 
                dont l'enoncé est
                exemple:On gère deux types de produits. Dans chaque type, les produits
                     sont regroupés par catégorie. Mais le programme qui se charge de manipuler
                     ces produits ne connait que les types de produits, et c’est à l’exécution que la
                     catégorie du produit est déterminée. On souhaite utiliser le pattern Abstract
                      Factory pour gérer cette situation.
                +modele: qui contient un fichier pdf comprenant le modèle générique du patron en question
           -> abstract_factory_family2: qui contient deux autres dossiers nommés:
                + code: qui contient le code source de l'implementation de l'exemple sur les produits avec trois familles de produit(1),(2) et (3) avec une classe contenant une methode main() pour l'executer  
                +modele: qui contient un fichier pdf comprenant le modèle générique du patron en question

                ++++++++++++++++++++++comment l'executer?,comment tester ce code?+++++++++++++++++++++++++++++++++++
                pour executer, lancer ce code, il y a deux methodes:
                premiere methode: d'abord cloner le projet et executant les commandes git init, ensuite git clone https://github.com/Prune12/INF4067_design_pattern.git,dans votre
                terminal. Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires
                pour execution d'un code java. Si vous utiliser eclipse ou intellij, vous pourrez facilement executer le code car ces éditeurs ont les configurations du langages java déja inclut,
                mais si vous utilisez visual studio code, il est nécessaire d'installer l'extension java.
                étant donné que chaque dossier notamment (abstract_factory_family1,abstract_factory_family2) est codé de façon independante,dans le dossier "code" de chacun de ces dossiers
                il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

                deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer(abstract_factory_family1 ou abstract_factory_family2) dans le dossier src du projet java
                vous venez de creer, supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient
                dejà une classe avec une methode main() pour l'executer. Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé
 
   **************************************************************************le dossier factory**************************************************************************
le dossier factory contient l'implementation du patron appelé "FACTORY" qui est un type de patron de construction et qui fonctionne comme suit:
             =>L’utilisation d’une fabrique permet de rendre l’instanciation d’objets
plus flexible qu’avec l’opérateur new
             => La fabrique peut s’implémenter de 2 manières : :
                o Déclarer une fabrique avec une méthode de création de l’objet qui
             attend les données nécessaires pour déterminer le type de l’objet à
             créer.
                o Déclarer la fabrique abstraite et laisser ses sous classe créer les objets
ce dossier est constitué de quatre dossiers nommés:
            -> factory_method: qui contient deux autres dossiers nommés:
                + code: qui contient le code source de l'implementation de l'exemple sur les produits avec deux types produit A et B tel que dans le cours (patron FACTORY) avec une classe contenant une methode main() pour l'executer 
                dont l'enoncé est
                exemple:On gère deux types de produits dans un système. Mais le
               programme qui se charge de manipuler ces produits ne connait le type de
               produit à exécuter que lors de l’exécution. On souhaite utiliser le pattern
               Factory Methode pour gérer cette situation.
                +modele: qui contient un fichier pdf comprenant le modèle générique du patron en question
            -> factory_method2: qui contient deux autres dossiers nommés:
                + code: qui contient le code source de l'implementation de l'exemple sur les produits avec deux types produit A,B et C tel que dans le cours (patron FACTORY) avec une classe contenant une methode main() pour l'executer 
                +modele: qui contient un fichier pdf comprenant le modèle générique du patron en question
           -> fabrique_abstraite: qui contient deux autres dossiers nommés:
                + code: qui contient le code source de l'implementation de l'exemple sur les produits avec 2 types de produit A et B mais avec une classe ProduitFactory1 qui implemente une interface IProduitfactory et une classe contenant une methode main() pour l'executer  
                +modele: qui contient un fichier pdf comprenant le modèle générique du patron en question
           -> fabrique_abstraite2: qui contient deux autres dossiers nommés:
                + code: qui contient le code source de l'implementation de l'exemple sur les produits avec 2 types de produit A,B et C mais avec une classe ProduitFactory1 qui implemente une interface IProduitfactory et une classe contenant une methode main() pour l'executer  
                +modele: qui contient un fichier pdf comprenant le modèle générique du patron en question

                ++++++++++++++++++++++comment l'executer?,comment tester ce code?+++++++++++++++++++++++++++++++++++
                pour executer, lancer ce code, il y a deux methodes:
                premiere methode: d'abord cloner le projet et executant les commandes git init, ensuite git clone https://github.com/Prune12/INF4067_design_pattern.git,dans votre
                terminal. Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires
                pour execution d'un code java. Si vous utiliser eclipse ou intellij, vous pourrez facilement executer le code car ces éditeurs ont les configurations du langages java déja inclut,
                mais si vous utilisez visual studio code, il est nécessaire d'installer l'extension java.
                étant donné que chaque dossier notamment (factory_method,factory_method2,fabrique_abstraite,fabrique_abstraite2) est codé de façon independante,dans le dossier "code" de chacun de ces dossiers
                il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

                deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer(factory_method ou factory_method2 ou fabrique_abstraite oufabrique_abstraite2) dans le dossier src du projet java
                vous venez de creer, supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient
                dejà une classe avec une methode main() pour l'executer. Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé
 
   
