package com.robinhood.android.chart.cryptoadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.GenericAdvanceChartOrderAction;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: CryptoAdvanceChartOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u001dJ&\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!H\u0016¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/chart/cryptoadvancedchart/CryptoAdvanceChartOrderDuxo;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderDuxo;", "Lcom/robinhood/android/chart/cryptoadvancedchart/CryptoAdvanceChartOrderDataState;", "Lcom/robinhood/android/chart/cryptoadvancedchart/CryptoAdvanceChartOrderViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "cryptoAdvanceChartOrderStateProvider", "Lcom/robinhood/android/chart/cryptoadvancedchart/CryptoAdvanceChartOrderStateProvider;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/chart/cryptoadvancedchart/CryptoAdvanceChartOrderStateProvider;)V", "bind", "Lkotlinx/coroutines/Job;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "onTradeAmountUpdated", "", "amount", "Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "handleGenericAdvanceChartOrderAction", "action", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/GenericAdvanceChartOrderAction;", "onTrade", "tradeSide", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "orderState", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "refId", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onConfirmed", "onAutoSendToggled", "enabled", "", "lib-crypto-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CryptoAdvanceChartOrderDuxo extends AdvanceChartOrderDuxo<CryptoAdvanceChartOrderDataState, CryptoAdvanceChartOrderViewState> {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAdvanceChartOrderDuxo(DuxoBundle duxoBundle, CryptoAdvanceChartOrderStateProvider cryptoAdvanceChartOrderStateProvider) {
        super(new CryptoAdvanceChartOrderDataState(null, 1, null), cryptoAdvanceChartOrderStateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(cryptoAdvanceChartOrderStateProvider, "cryptoAdvanceChartOrderStateProvider");
    }

    /* compiled from: CryptoAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.cryptoadvancedchart.CryptoAdvanceChartOrderDuxo$bind$1", m3645f = "CryptoAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.cryptoadvancedchart.CryptoAdvanceChartOrderDuxo$bind$1 */
    static final class C109271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C109271(Continuation<? super C109271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C109271(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public Job bind(String accountNumber, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C109271(null), 3, null);
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public Object onTrade(BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public Object onConfirmed(BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
