package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlanSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/SelectedPlan;", "", "<init>", "(Ljava/lang/String;I)V", "GOLD_3_PERCENT", "BASIC_1P5_PERCENT", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class SelectedPlan {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SelectedPlan[] $VALUES;
    public static final SelectedPlan GOLD_3_PERCENT = new SelectedPlan("GOLD_3_PERCENT", 0);
    public static final SelectedPlan BASIC_1P5_PERCENT = new SelectedPlan("BASIC_1P5_PERCENT", 1);

    private static final /* synthetic */ SelectedPlan[] $values() {
        return new SelectedPlan[]{GOLD_3_PERCENT, BASIC_1P5_PERCENT};
    }

    public static EnumEntries<SelectedPlan> getEntries() {
        return $ENTRIES;
    }

    private SelectedPlan(String str, int i) {
    }

    static {
        SelectedPlan[] selectedPlanArr$values = $values();
        $VALUES = selectedPlanArr$values;
        $ENTRIES = EnumEntries2.enumEntries(selectedPlanArr$values);
    }

    public static SelectedPlan valueOf(String str) {
        return (SelectedPlan) Enum.valueOf(SelectedPlan.class, str);
    }

    public static SelectedPlan[] values() {
        return (SelectedPlan[]) $VALUES.clone();
    }
}
