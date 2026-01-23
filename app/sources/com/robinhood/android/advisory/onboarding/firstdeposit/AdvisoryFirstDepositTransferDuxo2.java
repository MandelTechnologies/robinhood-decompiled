package com.robinhood.android.advisory.onboarding.firstdeposit;

import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDataState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onContinueCtaClicked$1$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onContinueCtaClicked$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryFirstDepositTransferDuxo2 extends ContinuationImpl7 implements Function2<AdvisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    AdvisoryFirstDepositTransferDuxo2(Continuation<? super AdvisoryFirstDepositTransferDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryFirstDepositTransferDuxo2 advisoryFirstDepositTransferDuxo2 = new AdvisoryFirstDepositTransferDuxo2(continuation);
        advisoryFirstDepositTransferDuxo2.L$0 = obj;
        return advisoryFirstDepositTransferDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState> continuation) {
        return ((AdvisoryFirstDepositTransferDuxo2) create(advisoryFirstDepositTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AdvisoryFirstDepositTransferDataState.copy$default((AdvisoryFirstDepositTransferDataState) this.L$0, null, null, null, null, null, false, false, AdvisoryFirstDepositTransferDataState.Mode.REVIEW, null, null, null, false, null, 8063, null);
    }
}
