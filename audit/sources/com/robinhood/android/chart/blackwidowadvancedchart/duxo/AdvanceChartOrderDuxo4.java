package com.robinhood.android.chart.blackwidowadvancedchart.duxo;

import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;

/* compiled from: AdvanceChartOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0015J(\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;", "", "bind", "Lkotlinx/coroutines/Job;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "onTradeAmountUpdated", "", "amount", "Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "handleGenericAdvanceChartOrderAction", "action", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/GenericAdvanceChartOrderAction;", "onTrade", "tradeSide", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "orderState", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "refId", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onConfirmed", "onAutoSendToggled", "enabled", "", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.duxo.IAdvanceChartOrderDuxo, reason: use source file name */
/* loaded from: classes7.dex */
public interface AdvanceChartOrderDuxo4 {
    Job bind(String accountNumber, UUID instrumentId);

    void handleGenericAdvanceChartOrderAction(GenericAdvanceChartOrderAction action);

    void onAutoSendToggled(boolean enabled);

    Object onConfirmed(BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation<? super Unit> continuation);

    Object onTrade(BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation<? super Unit> continuation);

    void onTradeAmountUpdated(InstrumentOrderState4 amount);

    /* compiled from: AdvanceChartOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.duxo.IAdvanceChartOrderDuxo$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ Object onTrade$default(AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTrade");
            }
            if ((i & 4) != 0) {
                uuid = UUID.randomUUID();
            }
            return advanceChartOrderDuxo4.onTrade(bwTradeSide, instrumentOrderState, uuid, continuation);
        }

        public static /* synthetic */ Object onConfirmed$default(AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConfirmed");
            }
            if ((i & 4) != 0) {
                uuid = UUID.randomUUID();
            }
            return advanceChartOrderDuxo4.onConfirmed(bwTradeSide, instrumentOrderState, uuid, continuation);
        }
    }
}
