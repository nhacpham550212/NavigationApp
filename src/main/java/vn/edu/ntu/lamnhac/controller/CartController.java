package vn.edu.ntu.lamnhac.controller;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import vn.edu.ntu.lamnhac.model.Product;

public class CartController extends Application implements ICartController {

    List<Product> listProduct = new ArrayList<>();
    List<Product> cart = new ArrayList<>();

    public CartController() {
        listProduct.add(new Product("Chuối", "Chuối thơm ngon", 60000));
        listProduct.add(new Product("Táo", "Táo thơm ngon", 60000));
        listProduct.add(new Product("Chanh", "Chanh thơm ngon", 60000));
        listProduct.add(new Product("Cà chua", "Cà Chua thơm ngon", 60000));
        listProduct.add(new Product("Sầu Riêng", "Sầu Riêng thơm ngon", 60000));
        listProduct.add(new Product("Xoài", "Xoài thơm ngon", 60000));
    }

    @Override
    public List<Product> getListProduct() {
        return listProduct;
    }

    @Override
    public Boolean addToCart(Product product) {
        if(!cart.contains(product)) {
            cart.add(product);
            return true;
        }
        return false;
    }

    @Override
    public List<Product> getCart() {
        return cart;
    }

    @Override
    public void clearCart() {
        cart.clear();
    }
}
