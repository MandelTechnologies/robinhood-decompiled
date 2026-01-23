package com.robinhood.android.compose.autoeventlogging;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScreenLoggable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/compose/autoeventlogging/MetricState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_STARTED", "STARTED", "COMPLETED", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.compose.autoeventlogging.MetricState, reason: use source file name */
/* loaded from: classes2.dex */
final class ScreenLoggable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScreenLoggable[] $VALUES;
    public static final ScreenLoggable NOT_STARTED = new ScreenLoggable("NOT_STARTED", 0);
    public static final ScreenLoggable STARTED = new ScreenLoggable("STARTED", 1);
    public static final ScreenLoggable COMPLETED = new ScreenLoggable("COMPLETED", 2);

    private static final /* synthetic */ ScreenLoggable[] $values() {
        return new ScreenLoggable[]{NOT_STARTED, STARTED, COMPLETED};
    }

    public static EnumEntries<ScreenLoggable> getEntries() {
        return $ENTRIES;
    }

    private ScreenLoggable(String str, int i) {
    }

    static {
        ScreenLoggable[] screenLoggableArr$values = $values();
        $VALUES = screenLoggableArr$values;
        $ENTRIES = EnumEntries2.enumEntries(screenLoggableArr$values);
    }

    public static ScreenLoggable valueOf(String str) {
        return (ScreenLoggable) Enum.valueOf(ScreenLoggable.class, str);
    }

    public static ScreenLoggable[] values() {
        return (ScreenLoggable[]) $VALUES.clone();
    }
}
