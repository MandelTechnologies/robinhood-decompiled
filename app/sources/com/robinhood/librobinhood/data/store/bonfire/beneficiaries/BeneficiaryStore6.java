package com.robinhood.librobinhood.data.store.bonfire.beneficiaries;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiariesService;
import bonfire.proto.idl.beneficiaries.p031v1.CreateBeneficiaryRequest;
import bonfire.proto.idl.beneficiaries.p031v1.CreateBeneficiaryRequestDto;
import bonfire.proto.idl.beneficiaries.p031v1.CreateBeneficiaryResponse;
import bonfire.proto.idl.beneficiaries.p031v1.CreateBeneficiaryResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BeneficiaryStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryResponse;", "request", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryStore$createBeneficiaryEndpoint$1", m3645f = "BeneficiaryStore.kt", m3646l = {65}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryStore$createBeneficiaryEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class BeneficiaryStore6 extends ContinuationImpl7 implements Function2<CreateBeneficiaryRequest, Continuation<? super CreateBeneficiaryResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BeneficiaryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryStore6(BeneficiaryStore beneficiaryStore, Continuation<? super BeneficiaryStore6> continuation) {
        super(2, continuation);
        this.this$0 = beneficiaryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BeneficiaryStore6 beneficiaryStore6 = new BeneficiaryStore6(this.this$0, continuation);
        beneficiaryStore6.L$0 = obj;
        return beneficiaryStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateBeneficiaryRequest createBeneficiaryRequest, Continuation<? super CreateBeneficiaryResponse> continuation) {
        return ((BeneficiaryStore6) create(createBeneficiaryRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CreateBeneficiaryRequest createBeneficiaryRequest = (CreateBeneficiaryRequest) this.L$0;
            BeneficiariesService beneficiariesService = this.this$0.beneficiariesService;
            CreateBeneficiaryRequestDto createBeneficiaryRequestDtoInvoke = this.this$0.beneficiaryCreateBeneficiaryRequestMapper.invoke(createBeneficiaryRequest);
            this.label = 1;
            obj = beneficiariesService.CreateBeneficiary(createBeneficiaryRequestDtoInvoke, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((CreateBeneficiaryResponseDto) obj).toProto();
    }
}
