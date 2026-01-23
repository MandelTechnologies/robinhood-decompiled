package com.robinhood.disposer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Disposer.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0000J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0000R\u0011\u0010\u0012\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/disposer/LifecycleEvent;", "", "<init>", "(Ljava/lang/String;I)V", "ON_ATTACH", "ON_CREATE", "ON_CREATE_VIEW", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY_VIEW", "ON_DESTROY", "ON_DETACH", "isAtLeast", "", "other", "isAtMost", "terminalEvent", "getTerminalEvent", "()Lcom/robinhood/disposer/LifecycleEvent;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class LifecycleEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LifecycleEvent[] $VALUES;
    public static final LifecycleEvent ON_ATTACH = new LifecycleEvent("ON_ATTACH", 0);
    public static final LifecycleEvent ON_CREATE = new LifecycleEvent("ON_CREATE", 1);
    public static final LifecycleEvent ON_CREATE_VIEW = new LifecycleEvent("ON_CREATE_VIEW", 2);
    public static final LifecycleEvent ON_START = new LifecycleEvent("ON_START", 3);
    public static final LifecycleEvent ON_RESUME = new LifecycleEvent("ON_RESUME", 4);
    public static final LifecycleEvent ON_PAUSE = new LifecycleEvent("ON_PAUSE", 5);
    public static final LifecycleEvent ON_STOP = new LifecycleEvent("ON_STOP", 6);
    public static final LifecycleEvent ON_DESTROY_VIEW = new LifecycleEvent("ON_DESTROY_VIEW", 7);
    public static final LifecycleEvent ON_DESTROY = new LifecycleEvent("ON_DESTROY", 8);
    public static final LifecycleEvent ON_DETACH = new LifecycleEvent("ON_DETACH", 9);

    private static final /* synthetic */ LifecycleEvent[] $values() {
        return new LifecycleEvent[]{ON_ATTACH, ON_CREATE, ON_CREATE_VIEW, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY_VIEW, ON_DESTROY, ON_DETACH};
    }

    public static EnumEntries<LifecycleEvent> getEntries() {
        return $ENTRIES;
    }

    private LifecycleEvent(String str, int i) {
    }

    static {
        LifecycleEvent[] lifecycleEventArr$values = $values();
        $VALUES = lifecycleEventArr$values;
        $ENTRIES = EnumEntries2.enumEntries(lifecycleEventArr$values);
    }

    public final boolean isAtLeast(LifecycleEvent other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return compareTo(other) >= 0;
    }

    public final boolean isAtMost(LifecycleEvent other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return compareTo(other) <= 0;
    }

    public final LifecycleEvent getTerminalEvent() {
        Object obj = DisposerKt.currentToTerminalMap.get(this);
        Intrinsics.checkNotNull(obj);
        return (LifecycleEvent) obj;
    }

    public static LifecycleEvent valueOf(String str) {
        return (LifecycleEvent) Enum.valueOf(LifecycleEvent.class, str);
    }

    public static LifecycleEvent[] values() {
        return (LifecycleEvent[]) $VALUES.clone();
    }
}
