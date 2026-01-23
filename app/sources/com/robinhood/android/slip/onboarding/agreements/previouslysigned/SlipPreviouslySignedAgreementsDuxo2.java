package com.robinhood.android.slip.onboarding.agreements.previouslysigned;

import com.robinhood.models.api.ApiPreviouslySignedAgreements;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipPreviouslySignedAgreementsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/agreements/previouslysigned/SlipPreviouslySignedAgreementsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsDuxo$onStart$1$2$1", m3645f = "SlipPreviouslySignedAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsDuxo$onStart$1$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SlipPreviouslySignedAgreementsDuxo2 extends ContinuationImpl7 implements Function2<SlipPreviouslySignedAgreementsViewState, Continuation<? super SlipPreviouslySignedAgreementsViewState>, Object> {
    final /* synthetic */ ApiPreviouslySignedAgreements $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipPreviouslySignedAgreementsDuxo2(ApiPreviouslySignedAgreements apiPreviouslySignedAgreements, Continuation<? super SlipPreviouslySignedAgreementsDuxo2> continuation) {
        super(2, continuation);
        this.$it = apiPreviouslySignedAgreements;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipPreviouslySignedAgreementsDuxo2 slipPreviouslySignedAgreementsDuxo2 = new SlipPreviouslySignedAgreementsDuxo2(this.$it, continuation);
        slipPreviouslySignedAgreementsDuxo2.L$0 = obj;
        return slipPreviouslySignedAgreementsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SlipPreviouslySignedAgreementsViewState slipPreviouslySignedAgreementsViewState, Continuation<? super SlipPreviouslySignedAgreementsViewState> continuation) {
        return ((SlipPreviouslySignedAgreementsDuxo2) create(slipPreviouslySignedAgreementsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((SlipPreviouslySignedAgreementsViewState) this.L$0).copy(this.$it);
    }
}
