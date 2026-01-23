package com.robinhood.android.trade.recommendations.p262ui.order;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderResponse;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecommendationsOrderSubmissionManager.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderResponse;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderRequest;", "recsOrderStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsOrderStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsOrderStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/userleap/UserLeapManager;Lkotlinx/coroutines/CoroutineScope;)V", "getUuid", "Ljava/util/UUID;", "request", "getId", WebsocketGatewayConstants.DATA_KEY, "getSubmissionObservable", "Lio/reactivex/Single;", "isFinal", "", Card.Icon.ORDER, "fetchOrder", "orderId", "getShouldTriggerConfirmationInstantly", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecommendationsOrderSubmissionManager extends OrderSubmissionManager<ApiRecommendationsOrderResponse, RecommendationsOrderRequest> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final RecommendationsOrderStore recsOrderStore;
    private final SurveyManager3 userLeapManager;

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean getShouldTriggerConfirmationInstantly(RecommendationsOrderRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return false;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean isFinal(ApiRecommendationsOrderResponse order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsOrderSubmissionManager(RecommendationsOrderStore recsOrderStore, AccountProvider accountProvider, SurveyManager3 userLeapManager, @RootCoroutineScope CoroutineScope coroutineScope) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(recsOrderStore, "recsOrderStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.recsOrderStore = recsOrderStore;
        this.accountProvider = accountProvider;
        this.userLeapManager = userLeapManager;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getUuid(RecommendationsOrderRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getRefId();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getId(ApiRecommendationsOrderResponse data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.getInvestment_id();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<ApiRecommendationsOrderResponse> getSubmissionObservable(final RecommendationsOrderRequest request) {
        Single map;
        Intrinsics.checkNotNullParameter(request, "request");
        String accountNumber = request.getAccountNumber();
        if (accountNumber != null) {
            map = Single.just(accountNumber);
        } else {
            map = this.accountProvider.getIndividualAccountForced().firstOrError().map(new Function() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderSubmissionManager$getSubmissionObservable$accountNumberObservable$1
                @Override // io.reactivex.functions.Function
                public final String apply(Account it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getAccountNumberRhs();
                }
            });
        }
        Intrinsics.checkNotNull(map);
        Single<ApiRecommendationsOrderResponse> singleDoAfterSuccess = map.flatMap(new Function() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderSubmissionManager.getSubmissionObservable.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends ApiRecommendationsOrderResponse> apply(String rhsAccountNumber) {
                Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
                return RecommendationsOrderSubmissionManager.this.recsOrderStore.submitOrder(request.getRecommendationId(), request.getAmount(), rhsAccountNumber);
            }
        }).retry(1L).doAfterSuccess(new Consumer() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderSubmissionManager.getSubmissionObservable.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiRecommendationsOrderResponse apiRecommendationsOrderResponse) {
                BrokerageAccountType brokerageAccountType = request.getBrokerageAccountType();
                if (brokerageAccountType == null || !brokerageAccountType.isRetirement()) {
                    return;
                }
                this.userLeapManager.track(TrackingEvent.INVESTED_RECS_RET);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoAfterSuccess, "doAfterSuccess(...)");
        return singleDoAfterSuccess;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<ApiRecommendationsOrderResponse> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Single<ApiRecommendationsOrderResponse> singleNever = Single.never();
        Intrinsics.checkNotNullExpressionValue(singleNever, "never(...)");
        return singleNever;
    }
}
