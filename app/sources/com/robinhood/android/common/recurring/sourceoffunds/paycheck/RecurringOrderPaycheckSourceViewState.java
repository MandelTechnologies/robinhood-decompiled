package com.robinhood.android.common.recurring.sourceoffunds.paycheck;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecurringOrderPaycheckSourceViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/ButtonAction;", "", "<init>", "(Ljava/lang/String;I)V", "CONTINUE", "EDIT", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.sourceoffunds.paycheck.ButtonAction, reason: use source file name */
/* loaded from: classes2.dex */
public final class RecurringOrderPaycheckSourceViewState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecurringOrderPaycheckSourceViewState[] $VALUES;
    public static final RecurringOrderPaycheckSourceViewState CONTINUE = new RecurringOrderPaycheckSourceViewState("CONTINUE", 0);
    public static final RecurringOrderPaycheckSourceViewState EDIT = new RecurringOrderPaycheckSourceViewState("EDIT", 1);

    private static final /* synthetic */ RecurringOrderPaycheckSourceViewState[] $values() {
        return new RecurringOrderPaycheckSourceViewState[]{CONTINUE, EDIT};
    }

    public static EnumEntries<RecurringOrderPaycheckSourceViewState> getEntries() {
        return $ENTRIES;
    }

    private RecurringOrderPaycheckSourceViewState(String str, int i) {
    }

    static {
        RecurringOrderPaycheckSourceViewState[] recurringOrderPaycheckSourceViewStateArr$values = $values();
        $VALUES = recurringOrderPaycheckSourceViewStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(recurringOrderPaycheckSourceViewStateArr$values);
    }

    public static RecurringOrderPaycheckSourceViewState valueOf(String str) {
        return (RecurringOrderPaycheckSourceViewState) Enum.valueOf(RecurringOrderPaycheckSourceViewState.class, str);
    }

    public static RecurringOrderPaycheckSourceViewState[] values() {
        return (RecurringOrderPaycheckSourceViewState[]) $VALUES.clone();
    }
}
