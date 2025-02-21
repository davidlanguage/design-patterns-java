package org.example.behavioral_design_patterns.observer;

//Concrete observer
public class PriceObserver implements OrderObserver{

    @Override
    public void updated(final Order order) {

        final double total = order.getItemCost();

        //provide a big discount
        if (total >= PriceObserverDiscount.PRICE_FOR_BIG_DISCOUNT){
            //we offer a 10 dollars discount
            order.setDiscount(PriceObserverDiscount.BIG_DISCOUNT);
        } else if (total >= PriceObserverDiscount.PRICE_FOR_SMALL_DISCOUNT){
            //we offer a 10 dollars discount
            order.setDiscount(PriceObserverDiscount.SMALL_DISCOUNT);
        }

    }

    private class PriceObserverDiscount{

        private static final int SMALL_DISCOUNT = 10;

        private static final int PRICE_FOR_SMALL_DISCOUNT = 200;

        private static final int BIG_DISCOUNT = 20;

        private static final int PRICE_FOR_BIG_DISCOUNT = 500;

    }
}
