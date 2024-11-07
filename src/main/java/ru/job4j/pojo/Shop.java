package ru.job4j.pojo;

public class Shop {

    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Fish", 3);
        products[4] = new Product("Fruit", 8);
        products = ShopDrop.delete(products, 1);
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            }
        }

    }

}

