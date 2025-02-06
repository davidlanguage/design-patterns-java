package org.example.solid.open_closed;

import java.time.LocalDateTime;

public class Call {

    // Private fields
    private final Long subscriberId;
    private final long duration;
    private final LocalDateTime begin;

    // Constructor
    public Call(LocalDateTime begin, long duration, Long subscriberId) {
        this.begin = begin;
        this.duration = duration;
        this.subscriberId = subscriberId;
    }

    // Getters
    public LocalDateTime getBegin() {
        return begin;
    }

    public long getDuration() {
        return duration;
    }

    public Long getSubscriberId() {
        return subscriberId;
    }

    // Override toString for better representation
    @Override
    public String toString() {
        return "Call{" +
                "begin=" + begin +
                ", duration=" + duration +
                ", subscriberId=" + subscriberId +
                '}';
    }

    // Override equals and hashCode for proper comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Call call = (Call) o;

        if (duration != call.duration) return false;
        if (!begin.equals(call.begin)) return false;
        return subscriberId.equals(call.subscriberId);
    }

    @Override
    public int hashCode() {
        int result = begin.hashCode();
        result = 31 * result + (int) (duration ^ (duration >>> 32));
        result = 31 * result + subscriberId.hashCode();
        return result;
    }
}