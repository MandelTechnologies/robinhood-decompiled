package com.robinhood.librobinhood.data.store.bonfire.beneficiaries;

import com.robinhood.android.beneficiaries.api.BeneficiariesApi;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryList;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BeneficiaryListStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryListStore$beneficiaryListEndpoint$1", m3645f = "BeneficiaryListStore.kt", m3646l = {25}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryListStore$beneficiaryListEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class BeneficiaryListStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super BeneficiaryList>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BeneficiaryListStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryListStore2(BeneficiaryListStore beneficiaryListStore, Continuation<? super BeneficiaryListStore2> continuation) {
        super(2, continuation);
        this.this$0 = beneficiaryListStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BeneficiaryListStore2 beneficiaryListStore2 = new BeneficiaryListStore2(this.this$0, continuation);
        beneficiaryListStore2.L$0 = obj;
        return beneficiaryListStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super BeneficiaryList> continuation) {
        return ((BeneficiaryListStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            BeneficiariesApi beneficiariesApi = this.this$0.beneficiariesApi;
            this.label = 1;
            obj = beneficiariesApi.getBeneficiaryList(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiBeneficiaryList) obj).toDbModel();
    }
}
