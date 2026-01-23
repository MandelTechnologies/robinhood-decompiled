package com.robinhood.android.chart.blackwidowadvancedchart.duxo;

import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;

/* compiled from: AdvanceChartOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"previewOrderCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;", "getPreviewOrderCallbacks", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxoKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvanceChartOrderDuxo2 {
    private static final AdvanceChartOrderDuxo4 previewOrderCallbacks = new AdvanceChartOrderDuxo4() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxoKt$previewOrderCallbacks$1
        @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
        public void handleGenericAdvanceChartOrderAction(GenericAdvanceChartOrderAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
        public void onAutoSendToggled(boolean enabled) {
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
        public void onTradeAmountUpdated(InstrumentOrderState4 amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
        public Job bind(String accountNumber, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return Job6.Job$default(null, 1, null);
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
        public Object onTrade(BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
        public Object onConfirmed(BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    };

    public static final AdvanceChartOrderDuxo4 getPreviewOrderCallbacks() {
        return previewOrderCallbacks;
    }
}
