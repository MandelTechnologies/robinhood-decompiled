package com.robinhood.android.investFlow.frequency;

import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestFlowFrequencyDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDuxo$onStart$1$1", m3645f = "InvestFlowFrequencyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestFlowFrequencyDuxo2 extends ContinuationImpl7 implements Function2<InvestFlowFrequencyDataState, Continuation<? super InvestFlowFrequencyDataState>, Object> {
    final /* synthetic */ Account $account;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestFlowFrequencyDuxo2(Account account, Continuation<? super InvestFlowFrequencyDuxo2> continuation) {
        super(2, continuation);
        this.$account = account;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestFlowFrequencyDuxo2 investFlowFrequencyDuxo2 = new InvestFlowFrequencyDuxo2(this.$account, continuation);
        investFlowFrequencyDuxo2.L$0 = obj;
        return investFlowFrequencyDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InvestFlowFrequencyDataState investFlowFrequencyDataState, Continuation<? super InvestFlowFrequencyDataState> continuation) {
        return ((InvestFlowFrequencyDuxo2) create(investFlowFrequencyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InvestFlowFrequencyDataState.copy$default((InvestFlowFrequencyDataState) this.L$0, false, null, null, null, false, this.$account, 31, null);
    }
}
