package org.example.solid.open_closed;

import java.time.LocalDateTime;

public class InternetSession {

    private Long subscriberId;
    private LocalDateTime begin;
    private long dataUsed;

    public InternetSession(Long subscriberId, LocalDateTime begin, long dataUsed) {
        this.subscriberId = subscriberId;
        this.begin = begin;
        this.dataUsed = dataUsed;
    }

    public InternetSession() {
    }

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public LocalDateTime getBegin() {
        return begin;
    }

    public void setBegin(LocalDateTime begin) {
        this.begin = begin;
    }

    public long getDataUsed() {
        return dataUsed;
    }

    public void setDataUsed(long dataUsed) {
        this.dataUsed = dataUsed;
    }

    @Override
    public String toString() {
        return "InternetSession{" +
                "subscriberId=" + subscriberId +
                ", begin=" + begin +
                ", dataUsed=" + dataUsed +
                '}';
    }
}


