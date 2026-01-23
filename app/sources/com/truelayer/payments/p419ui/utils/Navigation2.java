package com.truelayer.payments.p419ui.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Navigation.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/Direction;", "", "(Ljava/lang/String;I)V", "None", "Forward", "Back", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.utils.Direction, reason: use source file name */
/* loaded from: classes12.dex */
public final class Navigation2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Navigation2[] $VALUES;
    public static final Navigation2 None = new Navigation2("None", 0);
    public static final Navigation2 Forward = new Navigation2("Forward", 1);
    public static final Navigation2 Back = new Navigation2("Back", 2);

    private static final /* synthetic */ Navigation2[] $values() {
        return new Navigation2[]{None, Forward, Back};
    }

    public static EnumEntries<Navigation2> getEntries() {
        return $ENTRIES;
    }

    public static Navigation2 valueOf(String str) {
        return (Navigation2) Enum.valueOf(Navigation2.class, str);
    }

    public static Navigation2[] values() {
        return (Navigation2[]) $VALUES.clone();
    }

    private Navigation2(String str, int i) {
    }

    static {
        Navigation2[] navigation2Arr$values = $values();
        $VALUES = navigation2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(navigation2Arr$values);
    }
}
