package com.example.demo.model;


public class User {
private int id,age;
private String nom,prenom;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public User(int id, int age, String nom, String prenom) {
	this.id = id;
	this.age = age;
	this.nom = nom;
	this.prenom = prenom;
}
public User() {
}

}
