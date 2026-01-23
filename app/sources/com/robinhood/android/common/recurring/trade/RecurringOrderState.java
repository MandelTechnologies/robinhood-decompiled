package com.robinhood.android.common.recurring.trade;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.lib.trade.OrderState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecurringOrderState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderState;", "Lcom/robinhood/android/lib/trade/OrderState;", "", "isReviewingState", "", "<init>", "(Ljava/lang/String;IZ)V", "()Z", "EDITING", "REVIEWING_ORDER", "REVIEWING_TRANSFER", "nextState", "getNextState", "()Lcom/robinhood/android/common/recurring/trade/RecurringOrderState;", "previousState", "getPreviousState", "reviewBtnText", "Lcom/robinhood/utils/resource/StringResource;", "getReviewBtnText", "()Lcom/robinhood/utils/resource/StringResource;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringOrderState implements OrderState<RecurringOrderState> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecurringOrderState[] $VALUES;
    public static final RecurringOrderState EDITING = new RecurringOrderState("EDITING", 0, false);
    public static final RecurringOrderState REVIEWING_ORDER = new RecurringOrderState("REVIEWING_ORDER", 1, true);
    public static final RecurringOrderState REVIEWING_TRANSFER = new RecurringOrderState("REVIEWING_TRANSFER", 2, true);
    private final boolean isReviewingState;

    /* compiled from: RecurringOrderState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringOrderState.values().length];
            try {
                iArr[RecurringOrderState.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringOrderState.REVIEWING_ORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringOrderState.REVIEWING_TRANSFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ RecurringOrderState[] $values() {
        return new RecurringOrderState[]{EDITING, REVIEWING_ORDER, REVIEWING_TRANSFER};
    }

    public static EnumEntries<RecurringOrderState> getEntries() {
        return $ENTRIES;
    }

    private RecurringOrderState(String str, int i, boolean z) {
        this.isReviewingState = z;
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    /* renamed from: isReviewingState, reason: from getter */
    public boolean getIsReviewingState() {
        return this.isReviewingState;
    }

    static {
        RecurringOrderState[] recurringOrderStateArr$values = $values();
        $VALUES = recurringOrderStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(recurringOrderStateArr$values);
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    public RecurringOrderState getNextState() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return REVIEWING_ORDER;
        }
        if (i == 2 || i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    public RecurringOrderState getPreviousState() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2 || i == 3) {
            return EDITING;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getReviewBtnText() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return StringResource.INSTANCE.invoke(C11048R.string.general_action_review, new Object[0]);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C11595R.string.recurring_brokerage_cash_transfer_cta_confirm, new Object[0]);
    }

    public static RecurringOrderState valueOf(String str) {
        return (RecurringOrderState) Enum.valueOf(RecurringOrderState.class, str);
    }

    public static RecurringOrderState[] values() {
        return (RecurringOrderState[]) $VALUES.clone();
    }
}
