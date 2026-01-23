package com.salesforce.android.smi.core.events;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypingIndicatorStatus.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/core/events/TypingIndicatorStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Stopped", "Started", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TypingIndicatorStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TypingIndicatorStatus[] $VALUES;
    public static final TypingIndicatorStatus Stopped = new TypingIndicatorStatus("Stopped", 0);
    public static final TypingIndicatorStatus Started = new TypingIndicatorStatus("Started", 1);

    private static final /* synthetic */ TypingIndicatorStatus[] $values() {
        return new TypingIndicatorStatus[]{Stopped, Started};
    }

    public static EnumEntries<TypingIndicatorStatus> getEntries() {
        return $ENTRIES;
    }

    private TypingIndicatorStatus(String str, int i) {
    }

    static {
        TypingIndicatorStatus[] typingIndicatorStatusArr$values = $values();
        $VALUES = typingIndicatorStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(typingIndicatorStatusArr$values);
    }

    public static TypingIndicatorStatus valueOf(String str) {
        return (TypingIndicatorStatus) Enum.valueOf(TypingIndicatorStatus.class, str);
    }

    public static TypingIndicatorStatus[] values() {
        return (TypingIndicatorStatus[]) $VALUES.clone();
    }
}
