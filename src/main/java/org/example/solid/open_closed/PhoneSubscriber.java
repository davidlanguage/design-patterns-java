package org.example.solid.open_closed;

import java.util.List;

public final class PhoneSubscriber extends Subscriber {

    //open for extension
    @Override
    public double calculateBill() {
        final List<Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

}