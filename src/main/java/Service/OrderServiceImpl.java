package Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final  ShoppingCart shoppingCart;

    public OrderServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public List<Integer> addItems(List<Integer> items) {
        return shoppingCart.addItems(items);
    }

    @Override
    public List<Integer> getItems() {
        return shoppingCart.getItems();
    }
}
