package ru.petrov.service;

import ru.petrov.controller.rep.ProductRepr;
import ru.petrov.service.model.LineItem;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public interface CartService extends Serializable {

    void addProductQty(ProductRepr productRepr, String color, String material, int qty);

    void removeProductQty(ProductRepr productRepr, String color, String material, int qty);

    void removeProduct(LineItem lineItem);

    List<LineItem> getLineItems();

    BigDecimal getSubTotal();

    void updateCart(LineItem lineItem);
}
