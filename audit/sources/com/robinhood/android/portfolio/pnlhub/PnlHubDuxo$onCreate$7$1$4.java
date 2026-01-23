package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChart;
import com.robinhood.android.portfolio.pnlhub.p216ui.PnlHubComposable5;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PnlHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartData", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$7$1$4", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PnlHubDuxo$onCreate$7$1$4 extends ContinuationImpl7 implements Function2<ProfitAndLossChart, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PnlHubDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PnlHubDuxo$onCreate$7$1$4(PnlHubDuxo pnlHubDuxo, Continuation<? super PnlHubDuxo$onCreate$7$1$4> continuation) {
        super(2, continuation);
        this.this$0 = pnlHubDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PnlHubDuxo$onCreate$7$1$4 pnlHubDuxo$onCreate$7$1$4 = new PnlHubDuxo$onCreate$7$1$4(this.this$0, continuation);
        pnlHubDuxo$onCreate$7$1$4.L$0 = obj;
        return pnlHubDuxo$onCreate$7$1$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProfitAndLossChart profitAndLossChart, Continuation<? super Unit> continuation) {
        return ((PnlHubDuxo$onCreate$7$1$4) create(profitAndLossChart, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$7$1$4$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$7$1$4$1 */
    static final class C257601 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        final /* synthetic */ ProfitAndLossChart $chartData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C257601(ProfitAndLossChart profitAndLossChart, Continuation<? super C257601> continuation) {
            super(2, continuation);
            this.$chartData = profitAndLossChart;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257601 c257601 = new C257601(this.$chartData, continuation);
            c257601.L$0 = obj;
            return c257601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257601) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ProfitAndLossChartSpan profitAndLossChartSpan;
            DisplaySpan displaySpan;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PnlHubDataState pnlHubDataState = (PnlHubDataState) this.L$0;
            ProfitAndLossChartSpan chartSpan = pnlHubDataState.getChartSpan();
            List<SpanOption> availableSpans = this.$chartData.getSpans().getAvailableSpans();
            ProfitAndLossChartSpan profitAndLossChartSpan2 = null;
            if ((availableSpans instanceof Collection) && availableSpans.isEmpty()) {
                chartSpan = null;
            } else {
                Iterator<T> it = availableSpans.iterator();
                while (it.hasNext()) {
                    if (PnlHubViewState2.toProfitAndLossChartSpan(PnlHubComposable5.toDisplaySpan((SpanOption) it.next())) == chartSpan) {
                        break;
                    }
                }
                chartSpan = null;
            }
            if (chartSpan == null) {
                SpanOption defaultSpan = this.$chartData.getSpans().getDefaultSpan();
                if (defaultSpan != null && (displaySpan = PnlHubComposable5.toDisplaySpan(defaultSpan)) != null) {
                    profitAndLossChartSpan2 = PnlHubViewState2.toProfitAndLossChartSpan(displaySpan);
                }
                profitAndLossChartSpan = profitAndLossChartSpan2;
            } else {
                profitAndLossChartSpan = chartSpan;
            }
            return PnlHubDataState.copy$default(pnlHubDataState, null, null, null, null, null, null, null, false, profitAndLossChartSpan, this.$chartData, null, false, false, null, false, false, false, null, false, false, false, 2096383, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C257601((ProfitAndLossChart) this.L$0, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
