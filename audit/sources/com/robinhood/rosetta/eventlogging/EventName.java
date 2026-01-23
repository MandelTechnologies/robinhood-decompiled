package com.robinhood.rosetta.eventlogging;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EventName.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEVICE_EXPERIMENTS_UPDATED", "EXPERIMENT_TRIGGERING", "EXPERIMENTS_UPDATED", "DEEPLINK_BLOCKED", "DEEPLINK_OPENED", "DEEPLINK_ERROR", "lib-rosetta_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class EventName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventName[] $VALUES;
    private final String value;
    public static final EventName DEVICE_EXPERIMENTS_UPDATED = new EventName("DEVICE_EXPERIMENTS_UPDATED", 0, "device_experiments_updated");
    public static final EventName EXPERIMENT_TRIGGERING = new EventName("EXPERIMENT_TRIGGERING", 1, "triggering");
    public static final EventName EXPERIMENTS_UPDATED = new EventName("EXPERIMENTS_UPDATED", 2, "experiments_updated");
    public static final EventName DEEPLINK_BLOCKED = new EventName("DEEPLINK_BLOCKED", 3, "deeplink_blocked");
    public static final EventName DEEPLINK_OPENED = new EventName("DEEPLINK_OPENED", 4, "deeplink_opened");
    public static final EventName DEEPLINK_ERROR = new EventName("DEEPLINK_ERROR", 5, "deeplink_error");

    private static final /* synthetic */ EventName[] $values() {
        return new EventName[]{DEVICE_EXPERIMENTS_UPDATED, EXPERIMENT_TRIGGERING, EXPERIMENTS_UPDATED, DEEPLINK_BLOCKED, DEEPLINK_OPENED, DEEPLINK_ERROR};
    }

    public static EnumEntries<EventName> getEntries() {
        return $ENTRIES;
    }

    private EventName(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        EventName[] eventNameArr$values = $values();
        $VALUES = eventNameArr$values;
        $ENTRIES = EnumEntries2.enumEntries(eventNameArr$values);
    }

    public static EventName valueOf(String str) {
        return (EventName) Enum.valueOf(EventName.class, str);
    }

    public static EventName[] values() {
        return (EventName[]) $VALUES.clone();
    }
}
