package com.robinhood.librobinhood.data.store;

import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.api.ApiEquityOrderChecksRequest;
import com.robinhood.models.api.ApiEquityOrderChecksResponse;
import com.robinhood.models.p320db.EquityOrderChecksAlert;
import com.robinhood.models.p320db.EquityOrderChecksAlert2;
import com.robinhood.models.p320db.SilentEquityOrderChecksAlert;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.serverdriven.api.ApiGenericOrderCheckAction;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityOrderChecksStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/EquityOrderChecksAlert;", "request", "Lcom/robinhood/models/api/ApiEquityOrderChecksRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EquityOrderChecksStore$endpoint$1", m3645f = "EquityOrderChecksStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.EquityOrderChecksStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class EquityOrderChecksStore2 extends ContinuationImpl7 implements Function2<ApiEquityOrderChecksRequest, Continuation<? super Optional<? extends EquityOrderChecksAlert>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityOrderChecksStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityOrderChecksStore2(EquityOrderChecksStore equityOrderChecksStore, Continuation<? super EquityOrderChecksStore2> continuation) {
        super(2, continuation);
        this.this$0 = equityOrderChecksStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityOrderChecksStore2 equityOrderChecksStore2 = new EquityOrderChecksStore2(this.this$0, continuation);
        equityOrderChecksStore2.L$0 = obj;
        return equityOrderChecksStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiEquityOrderChecksRequest apiEquityOrderChecksRequest, Continuation<? super Optional<? extends EquityOrderChecksAlert>> continuation) {
        return ((EquityOrderChecksStore2) create(apiEquityOrderChecksRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiEquityOrderChecksRequest apiEquityOrderChecksRequest = (ApiEquityOrderChecksRequest) this.L$0;
            TradeEquityBonfireApi tradeEquityBonfireApi = this.this$0.tradeEquityBonfireApi;
            this.label = 1;
            obj = tradeEquityBonfireApi.equityOrderChecks(apiEquityOrderChecksRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiEquityOrderChecksResponse apiEquityOrderChecksResponse = (ApiEquityOrderChecksResponse) obj;
        ApiEquityOrderChecksResponse.ApiEquityOrderChecksAlert alert = apiEquityOrderChecksResponse.getAlert();
        VisibleEquityOrderChecksAlert dbModel = alert != null ? EquityOrderChecksAlert2.toDbModel(alert) : null;
        ApiGenericOrderCheckAction action_data = apiEquityOrderChecksResponse.getAction_data();
        SilentEquityOrderChecksAlert silentAlert = action_data != null ? EquityOrderChecksAlert2.toSilentAlert(action_data) : null;
        if (silentAlert != null) {
            return Optional.INSTANCE.m2972of(silentAlert);
        }
        return Optional.INSTANCE.m2972of(dbModel);
    }
}
