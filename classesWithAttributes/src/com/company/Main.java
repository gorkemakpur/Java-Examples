package com.company;

public class Main {

    public static void main(String[] args) {
	Product product=new Product(1,"laptop","ss",555,5,"red");


//	product.setId(1);
//	product.setName("laptop");
//	product.setColor("black");
//	product.setDescription("Acer");
//	product.setPrice(9999);
//	product.setStockAmount(2);


    ProductManager productManager = new ProductManager();
    productManager.Add(product);
    }
}
