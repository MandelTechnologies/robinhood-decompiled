package com.robinhood.store.isa;

import bonfire.proto.idl.accounts.p028v1.GetIsaBonusPromotionRequestDto;
import bonfire.proto.idl.accounts.p028v1.GetIsaBonusPromotionResponseDto;
import bonfire.proto.idl.accounts.p028v1.RhukIsaService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IsaPromotionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionResponseDto;", "request", "Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.isa.IsaPromotionStore$endpoint$1", m3645f = "IsaPromotionStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.isa.IsaPromotionStore$endpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class IsaPromotionStore2 extends ContinuationImpl7 implements Function2<GetIsaBonusPromotionRequestDto, Continuation<? super GetIsaBonusPromotionResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IsaPromotionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IsaPromotionStore2(IsaPromotionStore isaPromotionStore, Continuation<? super IsaPromotionStore2> continuation) {
        super(2, continuation);
        this.this$0 = isaPromotionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IsaPromotionStore2 isaPromotionStore2 = new IsaPromotionStore2(this.this$0, continuation);
        isaPromotionStore2.L$0 = obj;
        return isaPromotionStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetIsaBonusPromotionRequestDto getIsaBonusPromotionRequestDto, Continuation<? super GetIsaBonusPromotionResponseDto> continuation) {
        return ((IsaPromotionStore2) create(getIsaBonusPromotionRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetIsaBonusPromotionRequestDto getIsaBonusPromotionRequestDto = (GetIsaBonusPromotionRequestDto) this.L$0;
        RhukIsaService rhukIsaService = this.this$0.isaService;
        this.label = 1;
        Object objGetIsaBonusPromotion = rhukIsaService.GetIsaBonusPromotion(getIsaBonusPromotionRequestDto, this);
        return objGetIsaBonusPromotion == coroutine_suspended ? coroutine_suspended : objGetIsaBonusPromotion;
    }
}
