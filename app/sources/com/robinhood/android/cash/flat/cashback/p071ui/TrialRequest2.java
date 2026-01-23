package com.robinhood.android.cash.flat.cashback.p071ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrialRequest.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/AccessSource;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL_DIRECT_DEPOSIT", "AUTOMATIC_DIRECT_DEPOSIT", "RECURRING_ACH_DEPOSIT", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.flat.cashback.ui.AccessSource, reason: use source file name */
/* loaded from: classes7.dex */
public final class TrialRequest2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrialRequest2[] $VALUES;
    public static final TrialRequest2 MANUAL_DIRECT_DEPOSIT = new TrialRequest2("MANUAL_DIRECT_DEPOSIT", 0);
    public static final TrialRequest2 AUTOMATIC_DIRECT_DEPOSIT = new TrialRequest2("AUTOMATIC_DIRECT_DEPOSIT", 1);
    public static final TrialRequest2 RECURRING_ACH_DEPOSIT = new TrialRequest2("RECURRING_ACH_DEPOSIT", 2);

    private static final /* synthetic */ TrialRequest2[] $values() {
        return new TrialRequest2[]{MANUAL_DIRECT_DEPOSIT, AUTOMATIC_DIRECT_DEPOSIT, RECURRING_ACH_DEPOSIT};
    }

    public static EnumEntries<TrialRequest2> getEntries() {
        return $ENTRIES;
    }

    private TrialRequest2(String str, int i) {
    }

    static {
        TrialRequest2[] trialRequest2Arr$values = $values();
        $VALUES = trialRequest2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(trialRequest2Arr$values);
    }

    public static TrialRequest2 valueOf(String str) {
        return (TrialRequest2) Enum.valueOf(TrialRequest2.class, str);
    }

    public static TrialRequest2[] values() {
        return (TrialRequest2[]) $VALUES.clone();
    }
}
