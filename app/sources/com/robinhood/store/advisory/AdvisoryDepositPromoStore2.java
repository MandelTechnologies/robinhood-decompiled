package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetDashboardCardRequestDto;
import advisory.proto.p008v1.GetDashboardCardResponseDto;
import com.robinhood.models.advisory.p304db.card.StrategiesDashboardCard;
import com.robinhood.models.advisory.p304db.card.StrategiesDashboardCard2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryDepositPromoStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard$Response;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryDepositPromoStore$dashboardCardEndpoint$1", m3645f = "AdvisoryDepositPromoStore.kt", m3646l = {74}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.AdvisoryDepositPromoStore$dashboardCardEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisoryDepositPromoStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super StrategiesDashboardCard.Response>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryDepositPromoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryDepositPromoStore2(AdvisoryDepositPromoStore advisoryDepositPromoStore, Continuation<? super AdvisoryDepositPromoStore2> continuation) {
        super(2, continuation);
        this.this$0 = advisoryDepositPromoStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryDepositPromoStore2 advisoryDepositPromoStore2 = new AdvisoryDepositPromoStore2(this.this$0, continuation);
        advisoryDepositPromoStore2.L$0 = obj;
        return advisoryDepositPromoStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super StrategiesDashboardCard.Response> continuation) {
        return ((AdvisoryDepositPromoStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            AdvisoryService advisoryService = this.this$0.advisoryService;
            GetDashboardCardRequestDto getDashboardCardRequestDto = new GetDashboardCardRequestDto(str);
            this.label = 1;
            obj = advisoryService.GetDashboardCard(getDashboardCardRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return StrategiesDashboardCard2.toUiModel((GetDashboardCardResponseDto) obj);
    }
}
