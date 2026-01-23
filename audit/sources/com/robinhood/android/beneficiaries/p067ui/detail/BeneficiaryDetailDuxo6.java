package com.robinhood.android.beneficiaries.p067ui.detail;

import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryDetail;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BeneficiaryDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$onStart$1$1", m3645f = "BeneficiaryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class BeneficiaryDetailDuxo6 extends ContinuationImpl7 implements Function2<BeneficiaryDetailViewState, Continuation<? super BeneficiaryDetailViewState>, Object> {
    final /* synthetic */ BeneficiaryDetail $beneficiaryDetail;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryDetailDuxo6(BeneficiaryDetail beneficiaryDetail, Continuation<? super BeneficiaryDetailDuxo6> continuation) {
        super(2, continuation);
        this.$beneficiaryDetail = beneficiaryDetail;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BeneficiaryDetailDuxo6 beneficiaryDetailDuxo6 = new BeneficiaryDetailDuxo6(this.$beneficiaryDetail, continuation);
        beneficiaryDetailDuxo6.L$0 = obj;
        return beneficiaryDetailDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BeneficiaryDetailViewState beneficiaryDetailViewState, Continuation<? super BeneficiaryDetailViewState> continuation) {
        return ((BeneficiaryDetailDuxo6) create(beneficiaryDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BeneficiaryDetailViewState.copy$default((BeneficiaryDetailViewState) this.L$0, this.$beneficiaryDetail, false, false, false, false, 30, null);
    }
}
