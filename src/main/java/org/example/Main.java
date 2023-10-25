package org.example;

import org.example.models.*;

public class Main {
    public static void main(String[] args) {

        Category category= new Category("Mobilya",1);
        Category category1= new Category("Elektronik Eşya",2 );
        Category category2= new Category("Kozmetik Ürünler",3 );


        Product product= new Product("KoltukTakımı", 10000);
        Product product1= new Product("Laptop", 6000);
        Product product2= new Product("Fondoten", 500);

        Order order = new Order(500, "Mobilya, Koltuk Takımı");
        Order order1= new Order(800,"Elektronik Eşya, Laptop");
        Order order2= new Order(300,"Kozmetik Ürünler, Fondoten");

        User user =new User("Ayşe","Demir","11111");
        User user1 =new User("Ahmet","Ertuğ","22222");
        User user2 =new User("Selma","Can","33333");


    }
}