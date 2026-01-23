package com.robinhood.utils.transition;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransitionEvent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/transition/TransitionEvent;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "CANCEL", "PAUSE", "RESUME", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TransitionEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransitionEvent[] $VALUES;
    public static final TransitionEvent START = new TransitionEvent("START", 0);
    public static final TransitionEvent END = new TransitionEvent("END", 1);
    public static final TransitionEvent CANCEL = new TransitionEvent("CANCEL", 2);
    public static final TransitionEvent PAUSE = new TransitionEvent("PAUSE", 3);
    public static final TransitionEvent RESUME = new TransitionEvent("RESUME", 4);

    private static final /* synthetic */ TransitionEvent[] $values() {
        return new TransitionEvent[]{START, END, CANCEL, PAUSE, RESUME};
    }

    public static EnumEntries<TransitionEvent> getEntries() {
        return $ENTRIES;
    }

    private TransitionEvent(String str, int i) {
    }

    static {
        TransitionEvent[] transitionEventArr$values = $values();
        $VALUES = transitionEventArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transitionEventArr$values);
    }

    public static TransitionEvent valueOf(String str) {
        return (TransitionEvent) Enum.valueOf(TransitionEvent.class, str);
    }

    public static TransitionEvent[] values() {
        return (TransitionEvent[]) $VALUES.clone();
    }
}
