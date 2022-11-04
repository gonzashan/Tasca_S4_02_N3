# Tasca_S4_02_N3
## Api Rest amb Spring boot

[![N|Solid](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQYbwZGaNWBwLHjEhVFhNEZEXA14nrUL_JMm6YJLDoMXcsd6r6glNjYOal0eco8T_eyg&usqp=CAU)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

## Exercici CRUD amb MongoDB
Tenim una entitat anomenada "Fruita", que disposa de les següents propietats:

    int id
    String nom
    Int quantitatQuilos

Aprofitant l’especificació JPA, hauràs de persistir aquesta entitat a una base de dades H2, seguint el patró MVC. Per a això, depenent del Package principal, crearàs una estructura de packages, on ubicaràs les classes que necessitis:

    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controllers
    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain
    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services
    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository

La classe ubicada al paquet controllers (FruitaController, per exemple), haurà de ser capaç de donar resposta a les següents peticions per actualitzar i consultar informació:

    http://localhost:8080/fruita/add
    http://localhost:8080/fruita/update
    http://localhost:8080/fruita/delete/{id}
    http://localhost:8080/fruita/getOne/{id}
    http://localhost:8080/fruita/getAll

