package com.twilio.conversations;

/* loaded from: classes12.dex */
public interface User {
    Attributes getAttributes();

    String getFriendlyName();

    String getIdentity();

    boolean isNotifiable();

    boolean isOnline();

    boolean isSubscribed();

    void setAttributes(Attributes attributes, StatusListener statusListener);

    void setFriendlyName(String str, StatusListener statusListener);

    void unsubscribe();

    public enum UpdateReason {
        FRIENDLY_NAME(0),
        ATTRIBUTES(1),
        REACHABILITY_ONLINE(2),
        REACHABILITY_NOTIFIABLE(3);

        private final int value;

        UpdateReason(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static UpdateReason fromInt(int i) {
            for (UpdateReason updateReason : values()) {
                if (updateReason.getValue() == i) {
                    return updateReason;
                }
            }
            throw new IllegalStateException("Invalid value " + i + " for UpdateReason");
        }
    }
}
