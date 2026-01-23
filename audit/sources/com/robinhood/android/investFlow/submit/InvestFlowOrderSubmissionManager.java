package com.robinhood.android.investFlow.submit;

import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.investflow.models.api.ApiInvestFlowPostResponse;
import com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InvestFlowOrderSubmissionManager.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostResponse;", "Lcom/robinhood/android/investFlow/submit/InvestFlowSubmitData;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "investFlowStore", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;Lcom/robinhood/userleap/UserLeapManager;)V", "getUuid", "Ljava/util/UUID;", "request", "getId", WebsocketGatewayConstants.DATA_KEY, "getSubmissionObservable", "Lio/reactivex/Single;", "isFinal", "", Card.Icon.ORDER, "fetchOrder", "orderId", "getShouldTriggerConfirmationInstantly", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestFlowOrderSubmissionManager extends OrderSubmissionManager<ApiInvestFlowPostResponse, InvestFlowSubmitData> {
    public static final int $stable = 8;
    private final InvestFlowStore investFlowStore;
    private final SurveyManager3 userLeapManager;

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean getShouldTriggerConfirmationInstantly(InvestFlowSubmitData request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return false;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean isFinal(ApiInvestFlowPostResponse order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestFlowOrderSubmissionManager(@RootCoroutineScope CoroutineScope coroutineScope, InvestFlowStore investFlowStore, SurveyManager3 userLeapManager) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(investFlowStore, "investFlowStore");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        this.investFlowStore = investFlowStore;
        this.userLeapManager = userLeapManager;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getUuid(InvestFlowSubmitData request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getRequest().getRef_id();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getId(ApiInvestFlowPostResponse data) {
        Intrinsics.checkNotNullParameter(data, "data");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<ApiInvestFlowPostResponse> getSubmissionObservable(final InvestFlowSubmitData request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Single<ApiInvestFlowPostResponse> singleDoAfterSuccess = this.investFlowStore.createInvestFlow(request.getRequest()).doAfterSuccess(new Consumer() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderSubmissionManager.getSubmissionObservable.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiInvestFlowPostResponse apiInvestFlowPostResponse) {
                BrokerageAccountType brokerageAccountType = request.getBrokerageAccountType();
                if (brokerageAccountType == null || !brokerageAccountType.isRetirement()) {
                    return;
                }
                this.userLeapManager.track(TrackingEvent.INVESTED_RET_INVEST_FLOW);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoAfterSuccess, "doAfterSuccess(...)");
        return singleDoAfterSuccess;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<ApiInvestFlowPostResponse> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Single<ApiInvestFlowPostResponse> singleNever = Single.never();
        Intrinsics.checkNotNullExpressionValue(singleNever, "never(...)");
        return singleNever;
    }
}
