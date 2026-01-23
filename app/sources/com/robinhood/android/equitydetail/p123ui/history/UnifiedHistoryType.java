package com.robinhood.android.equitydetail.p123ui.history;

import com.robinhood.android.futures.charts.DisplaySpans;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnifiedHistoryType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryType;", "", "<init>", "(Ljava/lang/String;I)V", DisplaySpans.ALL, "PENDING", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class UnifiedHistoryType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UnifiedHistoryType[] $VALUES;
    public static final UnifiedHistoryType ALL = new UnifiedHistoryType(DisplaySpans.ALL, 0);
    public static final UnifiedHistoryType PENDING = new UnifiedHistoryType("PENDING", 1);

    private static final /* synthetic */ UnifiedHistoryType[] $values() {
        return new UnifiedHistoryType[]{ALL, PENDING};
    }

    public static EnumEntries<UnifiedHistoryType> getEntries() {
        return $ENTRIES;
    }

    private UnifiedHistoryType(String str, int i) {
    }

    static {
        UnifiedHistoryType[] unifiedHistoryTypeArr$values = $values();
        $VALUES = unifiedHistoryTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(unifiedHistoryTypeArr$values);
    }

    public static UnifiedHistoryType valueOf(String str) {
        return (UnifiedHistoryType) Enum.valueOf(UnifiedHistoryType.class, str);
    }

    public static UnifiedHistoryType[] values() {
        return (UnifiedHistoryType[]) $VALUES.clone();
    }
}
