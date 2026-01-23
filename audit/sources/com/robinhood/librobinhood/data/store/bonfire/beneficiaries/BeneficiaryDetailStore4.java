package com.robinhood.librobinhood.data.store.bonfire.beneficiaries;

import com.robinhood.android.beneficiaries.api.BeneficiariesApi;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryFlowResponse;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BeneficiaryDetailStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryFlowResponse;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore$createBeneficiaryEndpoint$1", m3645f = "BeneficiaryDetailStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore$createBeneficiaryEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class BeneficiaryDetailStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends ApiCreateBeneficiaryRequest>, Continuation<? super ApiBeneficiaryFlowResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BeneficiaryDetailStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryDetailStore4(BeneficiaryDetailStore beneficiaryDetailStore, Continuation<? super BeneficiaryDetailStore4> continuation) {
        super(2, continuation);
        this.this$0 = beneficiaryDetailStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BeneficiaryDetailStore4 beneficiaryDetailStore4 = new BeneficiaryDetailStore4(this.this$0, continuation);
        beneficiaryDetailStore4.L$0 = obj;
        return beneficiaryDetailStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends ApiCreateBeneficiaryRequest> tuples2, Continuation<? super ApiBeneficiaryFlowResponse> continuation) {
        return invoke2((Tuples2<String, ApiCreateBeneficiaryRequest>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, ApiCreateBeneficiaryRequest> tuples2, Continuation<? super ApiBeneficiaryFlowResponse> continuation) {
        return ((BeneficiaryDetailStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        String str = (String) tuples2.component1();
        ApiCreateBeneficiaryRequest apiCreateBeneficiaryRequest = (ApiCreateBeneficiaryRequest) tuples2.component2();
        BeneficiariesApi beneficiariesApi = this.this$0.beneficiariesApi;
        this.label = 1;
        Object objCreateBeneficiary = beneficiariesApi.createBeneficiary(str, apiCreateBeneficiaryRequest, this);
        return objCreateBeneficiary == coroutine_suspended ? coroutine_suspended : objCreateBeneficiary;
    }
}
