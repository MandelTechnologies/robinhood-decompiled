package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SduiStateHandler.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ValidationType;", "", "<init>", "(Ljava/lang/String;I)V", "Immediate", "Delayed", "Unknown", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ValidationType, reason: use source file name */
/* loaded from: classes17.dex */
public final class SduiStateHandler4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiStateHandler4[] $VALUES;
    public static final SduiStateHandler4 Immediate = new SduiStateHandler4("Immediate", 0);
    public static final SduiStateHandler4 Delayed = new SduiStateHandler4("Delayed", 1);
    public static final SduiStateHandler4 Unknown = new SduiStateHandler4("Unknown", 2);

    private static final /* synthetic */ SduiStateHandler4[] $values() {
        return new SduiStateHandler4[]{Immediate, Delayed, Unknown};
    }

    public static EnumEntries<SduiStateHandler4> getEntries() {
        return $ENTRIES;
    }

    private SduiStateHandler4(String str, int i) {
    }

    static {
        SduiStateHandler4[] sduiStateHandler4Arr$values = $values();
        $VALUES = sduiStateHandler4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiStateHandler4Arr$values);
    }

    public static SduiStateHandler4 valueOf(String str) {
        return (SduiStateHandler4) Enum.valueOf(SduiStateHandler4.class, str);
    }

    public static SduiStateHandler4[] values() {
        return (SduiStateHandler4[]) $VALUES.clone();
    }
}
