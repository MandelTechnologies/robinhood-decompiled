package microgram.contracts.service_incentives_wonka.proto.p504v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.service_incentives_wonka.proto.p504v1.IncentivesWonkaService_Adapter;

/* compiled from: IncentivesWonkaService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/PromotionUnlockedResponseDto;", "request", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/PromotionUnlockedRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.service_incentives_wonka.proto.v1.IncentivesWonkaService_Adapter$PromotionUnlockedEndpoint$call$1", m3645f = "IncentivesWonkaService_Adapter.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.service_incentives_wonka.proto.v1.IncentivesWonkaService_Adapter$PromotionUnlockedEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class IncentivesWonkaService_Adapter4 extends ContinuationImpl7 implements Function2<PromotionUnlockedRequestDto, Continuation<? super PromotionUnlockedResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IncentivesWonkaService_Adapter.PromotionUnlockedEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IncentivesWonkaService_Adapter4(IncentivesWonkaService_Adapter.PromotionUnlockedEndpoint promotionUnlockedEndpoint, Continuation<? super IncentivesWonkaService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = promotionUnlockedEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IncentivesWonkaService_Adapter4 incentivesWonkaService_Adapter4 = new IncentivesWonkaService_Adapter4(this.this$0, continuation);
        incentivesWonkaService_Adapter4.L$0 = obj;
        return incentivesWonkaService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PromotionUnlockedRequestDto promotionUnlockedRequestDto, Continuation<? super PromotionUnlockedResponseDto> continuation) {
        return ((IncentivesWonkaService_Adapter4) create(promotionUnlockedRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PromotionUnlockedRequestDto promotionUnlockedRequestDto = (PromotionUnlockedRequestDto) this.L$0;
        IncentivesWonkaService incentivesWonkaService = this.this$0.service;
        this.label = 1;
        Object objPromotionUnlocked = incentivesWonkaService.PromotionUnlocked(promotionUnlockedRequestDto, this);
        return objPromotionUnlocked == coroutine_suspended ? coroutine_suspended : objPromotionUnlocked;
    }
}
