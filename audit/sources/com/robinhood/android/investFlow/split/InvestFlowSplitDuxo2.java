package com.robinhood.android.investFlow.split;

import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.investFlow.split.InvestFlowSplitViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowSplitDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toLoggingString", "", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState$PriceAlertType;", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.split.InvestFlowSplitDuxoKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestFlowSplitDuxo2 {

    /* compiled from: InvestFlowSplitDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.split.InvestFlowSplitDuxoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InvestFlowSplitViewState.PriceAlertType.values().length];
            try {
                iArr[InvestFlowSplitViewState.PriceAlertType.MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestFlowSplitViewState.PriceAlertType.MIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestFlowSplitViewState.PriceAlertType.BUYING_POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toLoggingString(InvestFlowSplitViewState.PriceAlertType priceAlertType) {
        Intrinsics.checkNotNullParameter(priceAlertType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[priceAlertType.ordinal()];
        if (i == 1) {
            return InvestFlowConstants.Logging.OVER_MAX_AMOUNT;
        }
        if (i == 2 || i == 3) {
            return InvestFlowConstants.Logging.ONE_DOLLAR_MIN;
        }
        throw new NoWhenBranchMatchedException();
    }
}
