package com.robinhood.librobinhood.data.store.bonfire.beneficiaries;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiariesService;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowIntroViewModelsRequest;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowIntroViewModelsRequestDto;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowIntroViewModelsResponse;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowIntroViewModelsResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BeneficiaryStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponse;", "request", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryStore$beneficiaryIntroFlowEndpoint$1", m3645f = "BeneficiaryStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryStore$beneficiaryIntroFlowEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class BeneficiaryStore4 extends ContinuationImpl7 implements Function2<GetBeneficiaryFlowIntroViewModelsRequest, Continuation<? super GetBeneficiaryFlowIntroViewModelsResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BeneficiaryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryStore4(BeneficiaryStore beneficiaryStore, Continuation<? super BeneficiaryStore4> continuation) {
        super(2, continuation);
        this.this$0 = beneficiaryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BeneficiaryStore4 beneficiaryStore4 = new BeneficiaryStore4(this.this$0, continuation);
        beneficiaryStore4.L$0 = obj;
        return beneficiaryStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetBeneficiaryFlowIntroViewModelsRequest getBeneficiaryFlowIntroViewModelsRequest, Continuation<? super GetBeneficiaryFlowIntroViewModelsResponse> continuation) {
        return ((BeneficiaryStore4) create(getBeneficiaryFlowIntroViewModelsRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetBeneficiaryFlowIntroViewModelsRequest getBeneficiaryFlowIntroViewModelsRequest = (GetBeneficiaryFlowIntroViewModelsRequest) this.L$0;
            BeneficiariesService beneficiariesService = this.this$0.beneficiariesService;
            GetBeneficiaryFlowIntroViewModelsRequestDto getBeneficiaryFlowIntroViewModelsRequestDtoInvoke = this.this$0.beneficiaryIntroFlowRequestMapper.invoke(getBeneficiaryFlowIntroViewModelsRequest);
            this.label = 1;
            obj = beneficiariesService.GetBeneficiaryFlowIntroViewModels(getBeneficiaryFlowIntroViewModelsRequestDtoInvoke, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((GetBeneficiaryFlowIntroViewModelsResponseDto) obj).toProto();
    }
}
