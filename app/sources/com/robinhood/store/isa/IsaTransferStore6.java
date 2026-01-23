package com.robinhood.store.isa;

import bonfire.proto.idl.windsor.p041v1.GetTransferDetailRequestDto;
import bonfire.proto.idl.windsor.p041v1.GetTransferDetailResponseDto;
import bonfire.proto.idl.windsor.p041v1.WindsorService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/windsor/v1/GetTransferDetailResponseDto;", "transferId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.isa.IsaTransferStore$singleTransferEndpoint$1", m3645f = "IsaTransferStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.isa.IsaTransferStore$singleTransferEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class IsaTransferStore6 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super GetTransferDetailResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IsaTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IsaTransferStore6(IsaTransferStore isaTransferStore, Continuation<? super IsaTransferStore6> continuation) {
        super(2, continuation);
        this.this$0 = isaTransferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IsaTransferStore6 isaTransferStore6 = new IsaTransferStore6(this.this$0, continuation);
        isaTransferStore6.L$0 = obj;
        return isaTransferStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super GetTransferDetailResponseDto> continuation) {
        return ((IsaTransferStore6) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        WindsorService windsorService = this.this$0.windsor;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        GetTransferDetailRequestDto getTransferDetailRequestDto = new GetTransferDetailRequestDto(string2);
        this.label = 1;
        Object objGetTransferDetail = windsorService.GetTransferDetail(getTransferDetailRequestDto, this);
        return objGetTransferDetail == coroutine_suspended ? coroutine_suspended : objGetTransferDetail;
    }
}
