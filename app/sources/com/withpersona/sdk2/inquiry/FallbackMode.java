package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FallbackMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/FallbackMode;", "", "<init>", "(Ljava/lang/String;I)V", "NEVER", "ALWAYS", "DEFER", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class FallbackMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FallbackMode[] $VALUES;
    public static final FallbackMode NEVER = new FallbackMode("NEVER", 0);
    public static final FallbackMode ALWAYS = new FallbackMode("ALWAYS", 1);
    public static final FallbackMode DEFER = new FallbackMode("DEFER", 2);

    private static final /* synthetic */ FallbackMode[] $values() {
        return new FallbackMode[]{NEVER, ALWAYS, DEFER};
    }

    public static EnumEntries<FallbackMode> getEntries() {
        return $ENTRIES;
    }

    private FallbackMode(String str, int i) {
    }

    static {
        FallbackMode[] fallbackModeArr$values = $values();
        $VALUES = fallbackModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(fallbackModeArr$values);
    }

    public static FallbackMode valueOf(String str) {
        return (FallbackMode) Enum.valueOf(FallbackMode.class, str);
    }

    public static FallbackMode[] values() {
        return (FallbackMode[]) $VALUES.clone();
    }
}
