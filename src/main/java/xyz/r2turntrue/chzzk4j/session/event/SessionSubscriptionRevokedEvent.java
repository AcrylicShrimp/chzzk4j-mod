package xyz.r2turntrue.chzzk4j.session.event;

import xyz.r2turntrue.chzzk4j.session.ChzzkSessionSubscriptionType;

public class SessionSubscriptionRevokedEvent extends SessionEvent {
    private ChzzkSessionSubscriptionType eventType;
    private String channelId;

    public SessionSubscriptionRevokedEvent(ChzzkSessionSubscriptionType eventType, String channelId) {
        this.eventType = eventType;
        this.channelId = channelId;
    }

    public ChzzkSessionSubscriptionType getEventType() {
        return eventType;
    }

    public String getChannelId() {
        return channelId;
    }
}
