package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.additional.verification;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdditionalVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onBackPress$1$1", m3645f = "AdditionalVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onBackPress$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AdditionalVerificationDuxo2 extends ContinuationImpl7 implements Function2<AdditionalVerificationViewState, Continuation<? super AdditionalVerificationViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    AdditionalVerificationDuxo2(Continuation<? super AdditionalVerificationDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdditionalVerificationDuxo2 additionalVerificationDuxo2 = new AdditionalVerificationDuxo2(continuation);
        additionalVerificationDuxo2.L$0 = obj;
        return additionalVerificationDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdditionalVerificationViewState additionalVerificationViewState, Continuation<? super AdditionalVerificationViewState> continuation) {
        return ((AdditionalVerificationDuxo2) create(additionalVerificationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AdditionalVerificationViewState.copy$default((AdditionalVerificationViewState) this.L$0, false, true, 1, null);
    }
}
