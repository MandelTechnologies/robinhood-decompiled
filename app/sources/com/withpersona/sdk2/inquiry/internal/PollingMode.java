package com.withpersona.sdk2.inquiry.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollingMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/PollingMode;", "", "<init>", "(Ljava/lang/String;I)V", "Background", "Blocking", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PollingMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PollingMode[] $VALUES;
    public static final PollingMode Background = new PollingMode("Background", 0);
    public static final PollingMode Blocking = new PollingMode("Blocking", 1);

    private static final /* synthetic */ PollingMode[] $values() {
        return new PollingMode[]{Background, Blocking};
    }

    public static EnumEntries<PollingMode> getEntries() {
        return $ENTRIES;
    }

    private PollingMode(String str, int i) {
    }

    static {
        PollingMode[] pollingModeArr$values = $values();
        $VALUES = pollingModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(pollingModeArr$values);
    }

    public static PollingMode valueOf(String str) {
        return (PollingMode) Enum.valueOf(PollingMode.class, str);
    }

    public static PollingMode[] values() {
        return (PollingMode[]) $VALUES.clone();
    }
}
