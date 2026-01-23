package com.robinhood.android.individualaccounts.onboarding.outro;

import com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDataState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IndividualAccountOutroDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$startPolling$1$1", m3645f = "IndividualAccountOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$startPolling$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class IndividualAccountOutroDuxo2 extends ContinuationImpl7 implements Function2<IndividualAccountOutroDataState, Continuation<? super IndividualAccountOutroDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    IndividualAccountOutroDuxo2(Continuation<? super IndividualAccountOutroDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndividualAccountOutroDuxo2 individualAccountOutroDuxo2 = new IndividualAccountOutroDuxo2(continuation);
        individualAccountOutroDuxo2.L$0 = obj;
        return individualAccountOutroDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IndividualAccountOutroDataState individualAccountOutroDataState, Continuation<? super IndividualAccountOutroDataState> continuation) {
        return ((IndividualAccountOutroDuxo2) create(individualAccountOutroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return IndividualAccountOutroDataState.copy$default((IndividualAccountOutroDataState) this.L$0, false, null, IndividualAccountOutroDataState.LoadingState.SHORT, 3, null);
    }
}
