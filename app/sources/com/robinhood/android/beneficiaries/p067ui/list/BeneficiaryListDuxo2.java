package com.robinhood.android.beneficiaries.p067ui.list;

import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BeneficiaryListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$onStart$1$1", m3645f = "BeneficiaryListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class BeneficiaryListDuxo2 extends ContinuationImpl7 implements Function2<BeneficiaryListDataState, Continuation<? super BeneficiaryListDataState>, Object> {
    final /* synthetic */ BeneficiaryList $beneficiaryList;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryListDuxo2(BeneficiaryList beneficiaryList, Continuation<? super BeneficiaryListDuxo2> continuation) {
        super(2, continuation);
        this.$beneficiaryList = beneficiaryList;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BeneficiaryListDuxo2 beneficiaryListDuxo2 = new BeneficiaryListDuxo2(this.$beneficiaryList, continuation);
        beneficiaryListDuxo2.L$0 = obj;
        return beneficiaryListDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BeneficiaryListDataState beneficiaryListDataState, Continuation<? super BeneficiaryListDataState> continuation) {
        return ((BeneficiaryListDuxo2) create(beneficiaryListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BeneficiaryListDataState.copy$default((BeneficiaryListDataState) this.L$0, this.$beneficiaryList, null, false, 6, null);
    }
}
