package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.equities.contracts.PnlHubContract;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChart;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: PnlHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$1$1$3", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PnlHubDuxo$onCreate$1$1$3 extends ContinuationImpl7 implements Function2<ProfitAndLossChart, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $$this$launchWhenCreated;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PnlHubDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PnlHubDuxo$onCreate$1$1$3(PnlHubDuxo pnlHubDuxo, CoroutineScope coroutineScope, Continuation<? super PnlHubDuxo$onCreate$1$1$3> continuation) {
        super(2, continuation);
        this.this$0 = pnlHubDuxo;
        this.$$this$launchWhenCreated = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PnlHubDuxo$onCreate$1$1$3 pnlHubDuxo$onCreate$1$1$3 = new PnlHubDuxo$onCreate$1$1$3(this.this$0, this.$$this$launchWhenCreated, continuation);
        pnlHubDuxo$onCreate$1$1$3.L$0 = obj;
        return pnlHubDuxo$onCreate$1$1$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProfitAndLossChart profitAndLossChart, Continuation<? super Unit> continuation) {
        return ((PnlHubDuxo$onCreate$1$1$3) create(profitAndLossChart, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$1$1$3$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$1$1$3$1 */
    static final class C257491 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        final /* synthetic */ ProfitAndLossChart $it;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PnlHubDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C257491(PnlHubDuxo pnlHubDuxo, ProfitAndLossChart profitAndLossChart, Continuation<? super C257491> continuation) {
            super(2, continuation);
            this.this$0 = pnlHubDuxo;
            this.$it = profitAndLossChart;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257491 c257491 = new C257491(this.this$0, this.$it, continuation);
            c257491.L$0 = obj;
            return c257491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257491) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, ((PnlHubContract.Key) PnlHubDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getSelectedAssetTypes(), null, null, null, null, null, false, this.$it.getSpan(), this.$it, null, false, false, null, false, false, false, null, false, false, false, 2096381, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ProfitAndLossChart profitAndLossChart = (ProfitAndLossChart) this.L$0;
        PnlHubDuxo pnlHubDuxo = this.this$0;
        pnlHubDuxo.applyMutation(new C257491(pnlHubDuxo, profitAndLossChart, null));
        CoroutineScope2.cancel$default(this.$$this$launchWhenCreated, null, 1, null);
        return Unit.INSTANCE;
    }
}
