package com.robinhood.android.eventcontracts.trade;

import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.models.futures.p189db.FuturesOrderKt;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.event.EventOrderStore;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.p408rx.Poll;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Predicate;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EventOrderManager.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/trade/EventOrderManager;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;", "eventOrderStore", "Lcom/robinhood/store/event/EventOrderStore;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/robinhood/store/event/EventOrderStore;Lkotlinx/coroutines/CoroutineScope;)V", "getShouldTriggerConfirmationInstantly", "", "request", "getUuid", "Ljava/util/UUID;", "getId", WebsocketGatewayConstants.DATA_KEY, "getSubmissionObservable", "Lio/reactivex/Single;", "getPollingObservable", "Lio/reactivex/Observable;", "isFinal", Card.Icon.ORDER, "fetchOrder", "orderId", "lib-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventOrderManager extends OrderSubmissionManager<FuturesOrderDto, UiEventOrderContext> {
    private final EventOrderStore eventOrderStore;

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean getShouldTriggerConfirmationInstantly(UiEventOrderContext request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventOrderManager(EventOrderStore eventOrderStore, @RootCoroutineScope CoroutineScope coroutineScope) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.eventOrderStore = eventOrderStore;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getUuid(UiEventOrderContext request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getOrderRequest().getRefId();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getId(FuturesOrderDto data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return StringsKt.toUuid(data.getOrder_id());
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<FuturesOrderDto> getSubmissionObservable(UiEventOrderContext request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.eventOrderStore.submitOrder(request.getIdlRequestDto());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Observable<FuturesOrderDto> getPollingObservable(FuturesOrderDto data) {
        Intrinsics.checkNotNullParameter(data, "data");
        long j = BuildFlavors.INSTANCE.isDebugOrInternal() ? 30L : 5L;
        Single<FuturesOrderDto> singleFetchOrder = fetchOrder(getId(data));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable<FuturesOrderDto> observable = singleFetchOrder.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<R> observableCompose = observable.compose(new Poll(1L, timeUnit, false));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        Observable<FuturesOrderDto> observableOnErrorResumeNext = observableCompose.take(j, timeUnit).takeUntil(new Predicate() { // from class: com.robinhood.android.eventcontracts.trade.EventOrderManager.getPollingObservable.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(FuturesOrderDto it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EventOrderManager.this.isFinal(it);
            }
        }).onErrorResumeNext(Observable.empty());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean isFinal(FuturesOrderDto order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return FuturesOrderKt.toCommonState(order.getOrder_state()).isFinal();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<FuturesOrderDto> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return this.eventOrderStore.fetchOrder(orderId);
    }
}
