package org.example.solid.open_closed;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CallHistory {



    private static final Map<Long, List<Call>> CALLS = new HashMap<>();

    public static synchronized List<Call> getCurrentCalls(final Long subscriberId) {

        if(!CALLS.containsKey(subscriberId)) {
            return Collections.emptyList();
        }
        return CALLS.get(subscriberId);
    }

    public static synchronized void addSession(final Long subscriberId, final LocalDateTime begin, final long duration) {
        final List<Call> calls;
        if(!CALLS.containsKey(subscriberId)) {
            calls = new LinkedList<>();
            CALLS.put(subscriberId, calls);
        } else {
            calls = CALLS.get(subscriberId);
        }
        calls.add(new Call(begin, duration, subscriberId));
    }
}