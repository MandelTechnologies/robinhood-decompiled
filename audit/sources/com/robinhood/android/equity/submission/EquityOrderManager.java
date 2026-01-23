package com.robinhood.android.equity.submission;

import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.OrderRequest;
import com.robinhood.models.api.OrderUpdateRequest;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.EquityOrderChecksAlert;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.rosetta.eventlogging.EquityOrderExecutionData;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: EquityOrderManager.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J0\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0086@¢\u0006\u0004\b*\u0010+R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/equity/submission/EquityOrderManager;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lcom/robinhood/models/db/Order;", "Lcom/robinhood/models/db/DirectOrderRequestDraft;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "validator", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;)V", "abortedRefIds", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/util/UUID;", "getAbortedRefIds", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getUuid", "draft", "getId", WebsocketGatewayConstants.DATA_KEY, "getSubmissionObservable", "Lio/reactivex/Single;", "isFinal", "", Card.Icon.ORDER, "fetchOrder", "orderId", "onUpdate", "", "passthrough", "", "getShouldTriggerConfirmationInstantly", "validateAndSubmit", "Lkotlin/Result;", "Lcom/robinhood/models/db/EquityOrderChecksAlert;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "validateAndSubmit-BWLJW6A", "(Lcom/robinhood/models/db/DirectOrderRequestDraft;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-equity-submission_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityOrderManager extends OrderSubmissionManager<Order, DirectOrderRequestDraft> {
    private final StateFlow2<UUID> abortedRefIds;
    private final TraderEventLogger eventLogger;
    private final OrderStore orderStore;
    private final EquityOrderCheckValidator validator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderManager(@RootCoroutineScope CoroutineScope coroutineScope, TraderEventLogger eventLogger, OrderStore orderStore, EquityOrderCheckValidator validator) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.eventLogger = eventLogger;
        this.orderStore = orderStore;
        this.validator = validator;
        this.abortedRefIds = StateFlow4.MutableStateFlow(null);
    }

    public final StateFlow2<UUID> getAbortedRefIds() {
        return this.abortedRefIds;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getUuid(DirectOrderRequestDraft draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        return draft.getRefId();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getId(Order data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.getId();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<Order> getSubmissionObservable(DirectOrderRequestDraft draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        return (Single) draft.fold(new Function1() { // from class: com.robinhood.android.equity.submission.EquityOrderManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderManager.getSubmissionObservable$lambda$0(this.f$0, (OrderRequest) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.equity.submission.EquityOrderManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderManager.getSubmissionObservable$lambda$1(this.f$0, (OrderUpdateRequest) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single getSubmissionObservable$lambda$0(EquityOrderManager equityOrderManager, OrderRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return equityOrderManager.orderStore.submitOrder(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single getSubmissionObservable$lambda$1(final EquityOrderManager equityOrderManager, OrderUpdateRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Single<R> singleFlatMap = equityOrderManager.orderStore.updateOrder(it).flatMap(new Function() { // from class: com.robinhood.android.equity.submission.EquityOrderManager$getSubmissionObservable$2$1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Order> apply(Order it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return this.this$0.fetchOrder(it2.getId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean isFinal(Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return order.getState().isFinal();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<Order> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return this.orderStore.fetchOrder(orderId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public void onUpdate(Order data, Object passthrough) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.orderStore.onOrderPlaced(data);
        if (isFinal(data)) {
            TraderEventLogger traderEventLogger = this.eventLogger;
            UUID id = data.getId();
            List<UUID> executionIds = data.getExecutionIds();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executionIds, 10));
            Iterator<T> it = executionIds.iterator();
            while (it.hasNext()) {
                String string2 = ((UUID) it.next()).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                arrayList.add(new EquityOrderExecutionData(string2, null, 2, 0 == true ? 1 : 0));
            }
            traderEventLogger.logEquityOrderExecution(true, arrayList, id);
        }
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean getShouldTriggerConfirmationInstantly(DirectOrderRequestDraft draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        return (draft.getType() == OrderType.MARKET && draft.getTrigger() == OrderTrigger.IMMEDIATE) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: validateAndSubmit-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13723validateAndSubmitBWLJW6A(DirectOrderRequestDraft directOrderRequestDraft, BrokerageAccountType brokerageAccountType, EquityOrderFlowSource equityOrderFlowSource, Continuation<? super Result<? extends EquityOrderChecksAlert>> continuation) {
        EquityOrderManager3 equityOrderManager3;
        Object objM13720validateOrderBWLJW6A;
        if (continuation instanceof EquityOrderManager3) {
            equityOrderManager3 = (EquityOrderManager3) continuation;
            int i = equityOrderManager3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                equityOrderManager3.label = i - Integer.MIN_VALUE;
            } else {
                equityOrderManager3 = new EquityOrderManager3(this, continuation);
            }
        }
        Object obj = equityOrderManager3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = equityOrderManager3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            EquityOrderCheckValidator equityOrderCheckValidator = this.validator;
            equityOrderManager3.L$0 = directOrderRequestDraft;
            equityOrderManager3.label = 1;
            objM13720validateOrderBWLJW6A = equityOrderCheckValidator.m13720validateOrderBWLJW6A(directOrderRequestDraft, brokerageAccountType, equityOrderFlowSource, equityOrderManager3);
            if (objM13720validateOrderBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            directOrderRequestDraft = (DirectOrderRequestDraft) equityOrderManager3.L$0;
            ResultKt.throwOnFailure(obj);
            objM13720validateOrderBWLJW6A = ((Result) obj).getValue();
        }
        DirectOrderRequestDraft directOrderRequestDraft2 = directOrderRequestDraft;
        if (Result.m28556isSuccessimpl(objM13720validateOrderBWLJW6A)) {
            if ((Result.m28555isFailureimpl(objM13720validateOrderBWLJW6A) ? null : objM13720validateOrderBWLJW6A) == null) {
                OrderSubmissionManager.submit$default(this, directOrderRequestDraft2, null, false, 6, null);
            }
        }
        return objM13720validateOrderBWLJW6A;
    }
}
