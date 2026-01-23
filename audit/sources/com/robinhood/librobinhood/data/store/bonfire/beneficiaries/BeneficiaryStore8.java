package com.robinhood.librobinhood.data.store.bonfire.beneficiaries;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiariesService;
import bonfire.proto.idl.beneficiaries.p031v1.UpdateBeneficiaryRequest;
import bonfire.proto.idl.beneficiaries.p031v1.UpdateBeneficiaryRequestDto;
import bonfire.proto.idl.beneficiaries.p031v1.UpdateBeneficiaryResponse;
import bonfire.proto.idl.beneficiaries.p031v1.UpdateBeneficiaryResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BeneficiaryStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryResponse;", "request", "Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryStore$updateBeneficiaryEndpoint$1", m3645f = "BeneficiaryStore.kt", m3646l = {74}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryStore$updateBeneficiaryEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class BeneficiaryStore8 extends ContinuationImpl7 implements Function2<UpdateBeneficiaryRequest, Continuation<? super UpdateBeneficiaryResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BeneficiaryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryStore8(BeneficiaryStore beneficiaryStore, Continuation<? super BeneficiaryStore8> continuation) {
        super(2, continuation);
        this.this$0 = beneficiaryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BeneficiaryStore8 beneficiaryStore8 = new BeneficiaryStore8(this.this$0, continuation);
        beneficiaryStore8.L$0 = obj;
        return beneficiaryStore8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UpdateBeneficiaryRequest updateBeneficiaryRequest, Continuation<? super UpdateBeneficiaryResponse> continuation) {
        return ((BeneficiaryStore8) create(updateBeneficiaryRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UpdateBeneficiaryRequest updateBeneficiaryRequest = (UpdateBeneficiaryRequest) this.L$0;
            BeneficiariesService beneficiariesService = this.this$0.beneficiariesService;
            UpdateBeneficiaryRequestDto updateBeneficiaryRequestDtoInvoke = this.this$0.beneficiaryUpdateRequestMapper.invoke(updateBeneficiaryRequest);
            this.label = 1;
            obj = beneficiariesService.UpdateBeneficiary(updateBeneficiaryRequestDtoInvoke, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((UpdateBeneficiaryResponseDto) obj).toProto();
    }
}
