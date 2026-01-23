package ventures.trailer.proto.p551v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import ventures.trailer.proto.p551v1.PrivateCompanyDetailService_Adapter;

/* compiled from: PrivateCompanyDetailService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponseDto;", "request", "Lventures/trailer/proto/v1/GetPrivateCompanyDetailRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "ventures.trailer.proto.v1.PrivateCompanyDetailService_Adapter$GetPrivateCompanyDetailEndpoint$call$1", m3645f = "PrivateCompanyDetailService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: ventures.trailer.proto.v1.PrivateCompanyDetailService_Adapter$GetPrivateCompanyDetailEndpoint$call$1, reason: use source file name */
/* loaded from: classes28.dex */
final class PrivateCompanyDetailService_Adapter2 extends ContinuationImpl7 implements Function2<GetPrivateCompanyDetailRequestDto, Continuation<? super GetPrivateCompanyDetailResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PrivateCompanyDetailService_Adapter.GetPrivateCompanyDetailEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrivateCompanyDetailService_Adapter2(PrivateCompanyDetailService_Adapter.GetPrivateCompanyDetailEndpoint getPrivateCompanyDetailEndpoint, Continuation<? super PrivateCompanyDetailService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getPrivateCompanyDetailEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PrivateCompanyDetailService_Adapter2 privateCompanyDetailService_Adapter2 = new PrivateCompanyDetailService_Adapter2(this.this$0, continuation);
        privateCompanyDetailService_Adapter2.L$0 = obj;
        return privateCompanyDetailService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetPrivateCompanyDetailRequestDto getPrivateCompanyDetailRequestDto, Continuation<? super GetPrivateCompanyDetailResponseDto> continuation) {
        return ((PrivateCompanyDetailService_Adapter2) create(getPrivateCompanyDetailRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetPrivateCompanyDetailRequestDto getPrivateCompanyDetailRequestDto = (GetPrivateCompanyDetailRequestDto) this.L$0;
        PrivateCompanyDetailService privateCompanyDetailService = this.this$0.service;
        this.label = 1;
        Object objGetPrivateCompanyDetail = privateCompanyDetailService.GetPrivateCompanyDetail(getPrivateCompanyDetailRequestDto, this);
        return objGetPrivateCompanyDetail == coroutine_suspended ? coroutine_suspended : objGetPrivateCompanyDetail;
    }
}
