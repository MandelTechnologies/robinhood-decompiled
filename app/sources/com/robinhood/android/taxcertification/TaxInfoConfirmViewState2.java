package com.robinhood.android.taxcertification;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaxInfoConfirmViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/SsnAttemptState;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "CAN_ATTEMPT", "LOCKED_OUT", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcertification.SsnAttemptState, reason: use source file name */
/* loaded from: classes9.dex */
public final class TaxInfoConfirmViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TaxInfoConfirmViewState2[] $VALUES;
    public static final TaxInfoConfirmViewState2 LOADING = new TaxInfoConfirmViewState2("LOADING", 0);
    public static final TaxInfoConfirmViewState2 CAN_ATTEMPT = new TaxInfoConfirmViewState2("CAN_ATTEMPT", 1);
    public static final TaxInfoConfirmViewState2 LOCKED_OUT = new TaxInfoConfirmViewState2("LOCKED_OUT", 2);

    private static final /* synthetic */ TaxInfoConfirmViewState2[] $values() {
        return new TaxInfoConfirmViewState2[]{LOADING, CAN_ATTEMPT, LOCKED_OUT};
    }

    public static EnumEntries<TaxInfoConfirmViewState2> getEntries() {
        return $ENTRIES;
    }

    private TaxInfoConfirmViewState2(String str, int i) {
    }

    static {
        TaxInfoConfirmViewState2[] taxInfoConfirmViewState2Arr$values = $values();
        $VALUES = taxInfoConfirmViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(taxInfoConfirmViewState2Arr$values);
    }

    public static TaxInfoConfirmViewState2 valueOf(String str) {
        return (TaxInfoConfirmViewState2) Enum.valueOf(TaxInfoConfirmViewState2.class, str);
    }

    public static TaxInfoConfirmViewState2[] values() {
        return (TaxInfoConfirmViewState2[]) $VALUES.clone();
    }
}
