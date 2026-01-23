package com.robinhood.android.retirement.onboarding.outro.invest;

import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementInvestDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.outro.invest.RetirementInvestDuxo$onStart$1$1", m3645f = "RetirementInvestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.onboarding.outro.invest.RetirementInvestDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementInvestDuxo2 extends ContinuationImpl7 implements Function2<RetirementInvestDataState, Continuation<? super RetirementInvestDataState>, Object> {
    final /* synthetic */ RetirementUninvestedViewModel $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementInvestDuxo2(RetirementUninvestedViewModel retirementUninvestedViewModel, Continuation<? super RetirementInvestDuxo2> continuation) {
        super(2, continuation);
        this.$viewModel = retirementUninvestedViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementInvestDuxo2 retirementInvestDuxo2 = new RetirementInvestDuxo2(this.$viewModel, continuation);
        retirementInvestDuxo2.L$0 = obj;
        return retirementInvestDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementInvestDataState retirementInvestDataState, Continuation<? super RetirementInvestDataState> continuation) {
        return ((RetirementInvestDuxo2) create(retirementInvestDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((RetirementInvestDataState) this.L$0).mutateViewModel(this.$viewModel);
    }
}
