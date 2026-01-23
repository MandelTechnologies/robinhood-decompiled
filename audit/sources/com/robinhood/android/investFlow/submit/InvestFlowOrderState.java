package com.robinhood.android.investFlow.submit;

import com.robinhood.android.lib.trade.OrderState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InvestFlowOrderState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bj\u0002\b\b¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderState;", "Lcom/robinhood/android/lib/trade/OrderState;", "", "isReviewingState", "", "<init>", "(Ljava/lang/String;IZ)V", "()Z", "SWIPE_UP", "nextState", "getNextState", "()Lcom/robinhood/android/investFlow/submit/InvestFlowOrderState;", "previousState", "getPreviousState", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestFlowOrderState implements OrderState<InvestFlowOrderState> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestFlowOrderState[] $VALUES;
    public static final InvestFlowOrderState SWIPE_UP = new InvestFlowOrderState("SWIPE_UP", 0, true);
    private final boolean isReviewingState;

    private static final /* synthetic */ InvestFlowOrderState[] $values() {
        return new InvestFlowOrderState[]{SWIPE_UP};
    }

    public static EnumEntries<InvestFlowOrderState> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    public InvestFlowOrderState getNextState() {
        return null;
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    public InvestFlowOrderState getPreviousState() {
        return null;
    }

    private InvestFlowOrderState(String str, int i, boolean z) {
        this.isReviewingState = z;
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    /* renamed from: isReviewingState, reason: from getter */
    public boolean getIsReviewingState() {
        return this.isReviewingState;
    }

    static {
        InvestFlowOrderState[] investFlowOrderStateArr$values = $values();
        $VALUES = investFlowOrderStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(investFlowOrderStateArr$values);
    }

    public static InvestFlowOrderState valueOf(String str) {
        return (InvestFlowOrderState) Enum.valueOf(InvestFlowOrderState.class, str);
    }

    public static InvestFlowOrderState[] values() {
        return (InvestFlowOrderState[]) $VALUES.clone();
    }
}
