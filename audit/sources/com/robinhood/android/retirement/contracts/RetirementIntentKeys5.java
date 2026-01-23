package com.robinhood.android.retirement.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RetirementIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementOnboardingManagementTypeSelection;", "", "<init>", "(Ljava/lang/String;I)V", "SELECTION_REQUIRED", "SELF_DIRECTED", "MANAGED", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.contracts.RetirementOnboardingManagementTypeSelection, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementIntentKeys5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RetirementIntentKeys5[] $VALUES;
    public static final RetirementIntentKeys5 SELECTION_REQUIRED = new RetirementIntentKeys5("SELECTION_REQUIRED", 0);
    public static final RetirementIntentKeys5 SELF_DIRECTED = new RetirementIntentKeys5("SELF_DIRECTED", 1);
    public static final RetirementIntentKeys5 MANAGED = new RetirementIntentKeys5("MANAGED", 2);

    private static final /* synthetic */ RetirementIntentKeys5[] $values() {
        return new RetirementIntentKeys5[]{SELECTION_REQUIRED, SELF_DIRECTED, MANAGED};
    }

    public static EnumEntries<RetirementIntentKeys5> getEntries() {
        return $ENTRIES;
    }

    private RetirementIntentKeys5(String str, int i) {
    }

    static {
        RetirementIntentKeys5[] retirementIntentKeys5Arr$values = $values();
        $VALUES = retirementIntentKeys5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(retirementIntentKeys5Arr$values);
    }

    public static RetirementIntentKeys5 valueOf(String str) {
        return (RetirementIntentKeys5) Enum.valueOf(RetirementIntentKeys5.class, str);
    }

    public static RetirementIntentKeys5[] values() {
        return (RetirementIntentKeys5[]) $VALUES.clone();
    }
}
