package com.robinhood.android.beneficiaries.p067ui;

import com.robinhood.android.beneficiaries.p067ui.BeneficiaryParentViewState3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BeneficiaryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$beneficiaryTrustEmailConfirmed$1$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class BeneficiaryDuxo$beneficiaryTrustEmailConfirmed$1$1 extends ContinuationImpl7 implements Function2<BeneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState>, Object> {
    final /* synthetic */ String $email;
    final /* synthetic */ BeneficiaryParentViewState3.TrustFlow $trustFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryDuxo$beneficiaryTrustEmailConfirmed$1$1(BeneficiaryParentViewState3.TrustFlow trustFlow, String str, Continuation<? super BeneficiaryDuxo$beneficiaryTrustEmailConfirmed$1$1> continuation) {
        super(2, continuation);
        this.$trustFlow = trustFlow;
        this.$email = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BeneficiaryDuxo$beneficiaryTrustEmailConfirmed$1$1 beneficiaryDuxo$beneficiaryTrustEmailConfirmed$1$1 = new BeneficiaryDuxo$beneficiaryTrustEmailConfirmed$1$1(this.$trustFlow, this.$email, continuation);
        beneficiaryDuxo$beneficiaryTrustEmailConfirmed$1$1.L$0 = obj;
        return beneficiaryDuxo$beneficiaryTrustEmailConfirmed$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BeneficiaryParentViewState beneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState> continuation) {
        return ((BeneficiaryDuxo$beneficiaryTrustEmailConfirmed$1$1) create(beneficiaryParentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BeneficiaryParentViewState.copy$default((BeneficiaryParentViewState) this.L$0, false, false, null, null, null, BeneficiaryParentViewState3.TrustFlow.copy$default(this.$trustFlow, null, null, null, null, null, null, null, this.$email, null, null, 895, null), 31, null);
    }
}
