# RestFul

![principe de base](doc/images/webserviceRESTFULServer/principeBaseRestful.jpg)

**JERSEY** est un framework open-source �crit en langage Java permettant de d�velopper des services web selon l'architecture REST suivant les sp�cifications de **JAX-RS**. **JERSEY** est une servlet ( server web )

**WADL (Web Application Description Language)** 
**WADL** est un document XML qui d�finit un vocable permettant de d�crire les applications web. WADL a pour but d'�tre pour REST le pendant des fichiers **WSDL** pour **SOAP**. **Jersey** g�n�re automatiquement un document **WADL** qui inclut les ressources de la racine ainsi que le maximum de m�tadonn�es, qui sont extraites des classes via les annotations de **JAX-RS2**. 

**JACKSON** est une **API** qui permet de faire le mapping **object** to **json** et inversement.
**JAXB** est une **API** qui permet de faire le mapping **object** to **xml** et inversement.

![principe de base](doc/images/webserviceRESTFULServer/mediaTypeJSONetXML.jpg)




**JAX-RS : la sp�cification**
-  **Diff�rentes impl�mentations de la sp�cification JAX-RS sont disponibles**
    - **JERSEY** : impl�mentation de r�f�rence fournie par Oracle Site projet : http://jersey.java.net
    - **CXF** : fournie par Apache, la fusion entre XFire etCeltix Site projet : cxf.apache.org
    - **RESTEasy** : fournie par JBoss Site projet :www.jboss.org/resteasy
    - **RESTlet** : un des premiers framework impl�mentant REST pour Java : Site projet : www.restlet.org


## Mise en oeuvre
[mise en oeuvre d'un webService REST ](doc/webServicesRESTFULSever.md)

