package com.robinhood.android.trade.options.util;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.trade.options.OptionsOrderLatencyDecreaseExperiment;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionOrderManager.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BC\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0006\u0010$\u001a\u00020\u001bH\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0006\u0010*\u001a\u00020&J\u0006\u0010+\u001a\u00020&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/trade/options/util/OptionOrderManager;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lcom/robinhood/models/db/OptionOrder;", "Lcom/robinhood/models/api/ApiOptionOrderRequest;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionOrderStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/coroutines/rx/RxFactory;)V", "isSwipeAnimationRunningSubjectInternal", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "isSwipeAnimationRunningSubject", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "getUuid", "Ljava/util/UUID;", "request", "getId", WebsocketGatewayConstants.DATA_KEY, "isFinal", Card.Icon.ORDER, "getSubmissionObservable", "Lio/reactivex/Single;", "fetchOrder", "orderId", "onUpdate", "", "passthrough", "", "getShouldTriggerConfirmationInstantly", "setSwipeAnimationStarted", "setSwipeAnimationFinished", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OptionOrderManager extends OrderSubmissionManager<OptionOrder, ApiOptionOrderRequest> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final Observable<Boolean> isSwipeAnimationRunningSubject;
    private final BehaviorRelay<Boolean> isSwipeAnimationRunningSubjectInternal;
    private final OptionOrderStore optionOrderStore;
    private final OptionPositionStore optionPositionStore;
    private final RxFactory rxFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderManager(@RootCoroutineScope CoroutineScope coroutineScope, ExperimentsStore experimentsStore, OptionOrderStore optionOrderStore, OptionPositionStore optionPositionStore, AggregateOptionPositionStore aggregateOptionPositionStore, AccountProvider accountProvider, RxFactory rxFactory) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.optionOrderStore = optionOrderStore;
        this.optionPositionStore = optionPositionStore;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.accountProvider = accountProvider;
        this.rxFactory = rxFactory;
        BehaviorRelay<Boolean> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.isSwipeAnimationRunningSubjectInternal = behaviorRelayCreate;
        Observable<Boolean> observableSwitchMap = ExperimentsProvider.DefaultImpls.streamState$default(experimentsStore, new Experiment[]{OptionsOrderLatencyDecreaseExperiment.INSTANCE}, false, null, 6, null).switchMap(new Function() { // from class: com.robinhood.android.trade.options.util.OptionOrderManager.isSwipeAnimationRunningSubject.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Boolean inLatencyDecreaseExperiment) {
                Intrinsics.checkNotNullParameter(inLatencyDecreaseExperiment, "inLatencyDecreaseExperiment");
                if (inLatencyDecreaseExperiment.booleanValue()) {
                    return OptionOrderManager.this.isSwipeAnimationRunningSubjectInternal;
                }
                Observable observableJust = Observable.just(Boolean.FALSE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        this.isSwipeAnimationRunningSubject = observableSwitchMap;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Observable<Boolean> isSwipeAnimationRunningSubject() {
        return this.isSwipeAnimationRunningSubject;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getUuid(ApiOptionOrderRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getRef_id();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getId(OptionOrder data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.getId();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean isFinal(OptionOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return order.getState().isFinal();
    }

    /* compiled from: OptionOrderManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/OptionOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.util.OptionOrderManager$getSubmissionObservable$1", m3645f = "OptionOrderManager.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.options.util.OptionOrderManager$getSubmissionObservable$1 */
    static final class C298861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super OptionOrder>, Object> {
        final /* synthetic */ ApiOptionOrderRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C298861(ApiOptionOrderRequest apiOptionOrderRequest, Continuation<? super C298861> continuation) {
            super(2, continuation);
            this.$request = apiOptionOrderRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderManager.this.new C298861(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OptionOrder> continuation) {
            return ((C298861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            OptionOrderStore optionOrderStore = OptionOrderManager.this.optionOrderStore;
            ApiOptionOrderRequest apiOptionOrderRequest = this.$request;
            this.label = 1;
            Object objSubmitOrder = optionOrderStore.submitOrder(apiOptionOrderRequest, this);
            return objSubmitOrder == coroutine_suspended ? coroutine_suspended : objSubmitOrder;
        }
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<OptionOrder> getSubmissionObservable(ApiOptionOrderRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new C298861(request, null), 1, null);
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<OptionOrder> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return this.optionOrderStore.fetchOrder(orderId);
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public void onUpdate(OptionOrder data, Object passthrough) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.accountProvider.refresh(false);
        OptionPositionStore.refreshWithAllAccounts$default(this.optionPositionStore, false, null, 2, null);
        AggregateOptionPositionStore.refreshWithAllAccounts$default(this.aggregateOptionPositionStore, false, null, 2, null);
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean getShouldTriggerConfirmationInstantly(ApiOptionOrderRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (request.getType() == OrderType.MARKET && request.getTrigger() == OrderTrigger.IMMEDIATE) ? false : true;
    }

    public final void setSwipeAnimationStarted() {
        this.isSwipeAnimationRunningSubjectInternal.accept(Boolean.TRUE);
    }

    public final void setSwipeAnimationFinished() {
        this.isSwipeAnimationRunningSubjectInternal.accept(Boolean.FALSE);
    }
}
