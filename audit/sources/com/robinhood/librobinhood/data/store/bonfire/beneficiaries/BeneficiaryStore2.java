package com.robinhood.librobinhood.data.store.bonfire.beneficiaries;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiariesService;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowRequest;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowRequestDto;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowResponse;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BeneficiaryStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowResponse;", "request", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryStore$beneficiaryCreateFlowEndpoint$1", m3645f = "BeneficiaryStore.kt", m3646l = {54}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryStore$beneficiaryCreateFlowEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class BeneficiaryStore2 extends ContinuationImpl7 implements Function2<GetBeneficiaryFlowRequest, Continuation<? super GetBeneficiaryFlowResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BeneficiaryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryStore2(BeneficiaryStore beneficiaryStore, Continuation<? super BeneficiaryStore2> continuation) {
        super(2, continuation);
        this.this$0 = beneficiaryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BeneficiaryStore2 beneficiaryStore2 = new BeneficiaryStore2(this.this$0, continuation);
        beneficiaryStore2.L$0 = obj;
        return beneficiaryStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetBeneficiaryFlowRequest getBeneficiaryFlowRequest, Continuation<? super GetBeneficiaryFlowResponse> continuation) {
        return ((BeneficiaryStore2) create(getBeneficiaryFlowRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetBeneficiaryFlowRequest getBeneficiaryFlowRequest = (GetBeneficiaryFlowRequest) this.L$0;
            BeneficiariesService beneficiariesService = this.this$0.beneficiariesService;
            GetBeneficiaryFlowRequestDto getBeneficiaryFlowRequestDtoInvoke = this.this$0.beneficiaryCreateFlowRequestMapper.invoke(getBeneficiaryFlowRequest);
            this.label = 1;
            obj = beneficiariesService.GetBeneficiaryFlow(getBeneficiaryFlowRequestDtoInvoke, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((GetBeneficiaryFlowResponseDto) obj).toProto();
    }
}
