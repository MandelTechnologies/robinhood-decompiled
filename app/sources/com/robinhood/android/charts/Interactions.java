package com.robinhood.android.charts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Interactions.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/charts/InteractionState;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "ACTIVE", "INACTIVE", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.InteractionState, reason: use source file name */
/* loaded from: classes7.dex */
public final class Interactions {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Interactions[] $VALUES;
    public static final Interactions DEFAULT = new Interactions("DEFAULT", 0);
    public static final Interactions ACTIVE = new Interactions("ACTIVE", 1);
    public static final Interactions INACTIVE = new Interactions("INACTIVE", 2);

    private static final /* synthetic */ Interactions[] $values() {
        return new Interactions[]{DEFAULT, ACTIVE, INACTIVE};
    }

    public static EnumEntries<Interactions> getEntries() {
        return $ENTRIES;
    }

    private Interactions(String str, int i) {
    }

    static {
        Interactions[] interactionsArr$values = $values();
        $VALUES = interactionsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(interactionsArr$values);
    }

    public static Interactions valueOf(String str) {
        return (Interactions) Enum.valueOf(Interactions.class, str);
    }

    public static Interactions[] values() {
        return (Interactions[]) $VALUES.clone();
    }
}
