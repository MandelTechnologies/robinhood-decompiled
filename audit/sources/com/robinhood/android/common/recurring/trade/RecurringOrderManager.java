package com.robinhood.android.common.recurring.trade;

import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.recurring.models.api.ApiInvestmentScheduleRequest;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecurringOrderManager.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;)V", "getUuid", "Ljava/util/UUID;", "request", "getId", WebsocketGatewayConstants.DATA_KEY, "getSubmissionObservable", "Lio/reactivex/Single;", "isFinal", "", Card.Icon.ORDER, "fetchOrder", "orderId", "getShouldTriggerConfirmationInstantly", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringOrderManager extends OrderSubmissionManager<InvestmentSchedule, ApiInvestmentScheduleRequest> {
    public static final int $stable = 8;
    private final TraderInvestmentScheduleStore investmentScheduleStore;

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean getShouldTriggerConfirmationInstantly(ApiInvestmentScheduleRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return false;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean isFinal(InvestmentSchedule order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringOrderManager(@RootCoroutineScope CoroutineScope coroutineScope, TraderInvestmentScheduleStore investmentScheduleStore) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        this.investmentScheduleStore = investmentScheduleStore;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getUuid(ApiInvestmentScheduleRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getRef_id();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getId(InvestmentSchedule data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.getId();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<InvestmentSchedule> getSubmissionObservable(ApiInvestmentScheduleRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.investmentScheduleStore.postInvestmentSchedule(request);
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<InvestmentSchedule> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return this.investmentScheduleStore.fetchInvestmentSchedule(orderId);
    }
}
