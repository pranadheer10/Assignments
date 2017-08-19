package com.collections;

public class Application {
public static void main(String[] args) {
	Iterating_Collections ic= new Iterating_Collections();
	ic.create();
	ic.display();
	Access ac= new Access();
	ac.accessing(ic);
	Maps m= new Maps();
	m.populate(ic);
}
}
