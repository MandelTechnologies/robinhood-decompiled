package com.robinhood.store.isa;

import bonfire.proto.idl.accounts.p028v1.GetIsaBonusPromotionResponseDto;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaPromotion2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IsaPromotionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.isa.IsaPromotionStore$endpoint$2", m3645f = "IsaPromotionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.isa.IsaPromotionStore$endpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class IsaPromotionStore3 extends ContinuationImpl7 implements Function2<GetIsaBonusPromotionResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IsaPromotionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IsaPromotionStore3(IsaPromotionStore isaPromotionStore, Continuation<? super IsaPromotionStore3> continuation) {
        super(2, continuation);
        this.this$0 = isaPromotionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IsaPromotionStore3 isaPromotionStore3 = new IsaPromotionStore3(this.this$0, continuation);
        isaPromotionStore3.L$0 = obj;
        return isaPromotionStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetIsaBonusPromotionResponseDto getIsaBonusPromotionResponseDto, Continuation<? super Unit> continuation) {
        return ((IsaPromotionStore3) create(getIsaBonusPromotionResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.promotionDao.insert(IsaPromotion2.toDbModel((GetIsaBonusPromotionResponseDto) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
