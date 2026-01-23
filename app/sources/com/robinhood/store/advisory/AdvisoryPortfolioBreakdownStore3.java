package com.robinhood.store.advisory;

import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: AdvisoryPortfolioBreakdownStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "managedPortfolio", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore$managedPortfolioEndpoint$2", m3645f = "AdvisoryPortfolioBreakdownStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore$managedPortfolioEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisoryPortfolioBreakdownStore3 extends ContinuationImpl7 implements Function2<ManagedPortfolioSummary, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryPortfolioBreakdownStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryPortfolioBreakdownStore3(AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore, Continuation<? super AdvisoryPortfolioBreakdownStore3> continuation) {
        super(2, continuation);
        this.this$0 = advisoryPortfolioBreakdownStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryPortfolioBreakdownStore3 advisoryPortfolioBreakdownStore3 = new AdvisoryPortfolioBreakdownStore3(this.this$0, continuation);
        advisoryPortfolioBreakdownStore3.L$0 = obj;
        return advisoryPortfolioBreakdownStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ManagedPortfolioSummary managedPortfolioSummary, Continuation<? super Unit> continuation) {
        return ((AdvisoryPortfolioBreakdownStore3) create(managedPortfolioSummary, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ManagedPortfolioSummary managedPortfolioSummary = (ManagedPortfolioSummary) this.L$0;
            StateFlow2 stateFlow2 = (StateFlow2) this.this$0.managedPortfolioFlow.get(managedPortfolioSummary.getAccountNumber());
            if (stateFlow2 != null) {
                stateFlow2.setValue(managedPortfolioSummary);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
