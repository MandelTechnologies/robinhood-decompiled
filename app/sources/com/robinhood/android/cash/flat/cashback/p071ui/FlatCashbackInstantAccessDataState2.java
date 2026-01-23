package com.robinhood.android.cash.flat.cashback.p071ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FlatCashbackInstantAccessDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/TrialStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "INELIGIBLE", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.flat.cashback.ui.TrialStatus, reason: use source file name */
/* loaded from: classes7.dex */
public final class FlatCashbackInstantAccessDataState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FlatCashbackInstantAccessDataState2[] $VALUES;
    public static final FlatCashbackInstantAccessDataState2 ACTIVE = new FlatCashbackInstantAccessDataState2("ACTIVE", 0);
    public static final FlatCashbackInstantAccessDataState2 INELIGIBLE = new FlatCashbackInstantAccessDataState2("INELIGIBLE", 1);

    private static final /* synthetic */ FlatCashbackInstantAccessDataState2[] $values() {
        return new FlatCashbackInstantAccessDataState2[]{ACTIVE, INELIGIBLE};
    }

    public static EnumEntries<FlatCashbackInstantAccessDataState2> getEntries() {
        return $ENTRIES;
    }

    private FlatCashbackInstantAccessDataState2(String str, int i) {
    }

    static {
        FlatCashbackInstantAccessDataState2[] flatCashbackInstantAccessDataState2Arr$values = $values();
        $VALUES = flatCashbackInstantAccessDataState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(flatCashbackInstantAccessDataState2Arr$values);
    }

    public static FlatCashbackInstantAccessDataState2 valueOf(String str) {
        return (FlatCashbackInstantAccessDataState2) Enum.valueOf(FlatCashbackInstantAccessDataState2.class, str);
    }

    public static FlatCashbackInstantAccessDataState2[] values() {
        return (FlatCashbackInstantAccessDataState2[]) $VALUES.clone();
    }
}
