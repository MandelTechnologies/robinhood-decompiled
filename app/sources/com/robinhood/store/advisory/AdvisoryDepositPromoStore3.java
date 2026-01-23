package com.robinhood.store.advisory;

import com.robinhood.models.advisory.p304db.card.StrategiesDashboardCard;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: AdvisoryDepositPromoStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard$Response;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryDepositPromoStore$dashboardCardEndpoint$2", m3645f = "AdvisoryDepositPromoStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.AdvisoryDepositPromoStore$dashboardCardEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisoryDepositPromoStore3 extends ContinuationImpl7 implements Function2<StrategiesDashboardCard.Response, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryDepositPromoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryDepositPromoStore3(AdvisoryDepositPromoStore advisoryDepositPromoStore, Continuation<? super AdvisoryDepositPromoStore3> continuation) {
        super(2, continuation);
        this.this$0 = advisoryDepositPromoStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryDepositPromoStore3 advisoryDepositPromoStore3 = new AdvisoryDepositPromoStore3(this.this$0, continuation);
        advisoryDepositPromoStore3.L$0 = obj;
        return advisoryDepositPromoStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StrategiesDashboardCard.Response response, Continuation<? super Unit> continuation) {
        return ((AdvisoryDepositPromoStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            StrategiesDashboardCard.Response response = (StrategiesDashboardCard.Response) this.L$0;
            StateFlow2 stateFlow2 = (StateFlow2) this.this$0.dashboardCardFlowMap.get(response.getAccountNumber());
            if (stateFlow2 != null) {
                stateFlow2.setValue(response);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
