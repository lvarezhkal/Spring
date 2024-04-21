package Service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

@Component
@SessionScope
public class ShoppingCart {
    private final List<Integer> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public List<Integer> addItems(List<Integer> idItems) {
        items.addAll(idItems);
        return getItems();
    }

    public List<Integer> getItems(){
        return Collections.unmodifiableList(items);
    }
}
