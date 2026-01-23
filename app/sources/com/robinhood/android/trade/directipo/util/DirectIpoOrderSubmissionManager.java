package com.robinhood.android.trade.directipo.util;

import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager2;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderResponse;
import com.robinhood.directipo.models.p293ui.UiDirectIpoOrderResponse;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p355ui.bonfire.UiDirectIpoPostCobFollowup;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DirectIpoOrderSubmissionManager.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0001B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\"\u0010\u0014\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005H\u0016J(\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u00050\u00172\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\"\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005H\u0016J(\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u00050\u00172\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J-\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u00050\u00172\u0006\u0010\u001c\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0006H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lkotlin/Pair;", "Lcom/robinhood/directipo/models/ui/UiDirectIpoOrderResponse;", "Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowup;", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderResponse;", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderRequest;", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/coroutines/rx/RxFactory;Lkotlinx/coroutines/CoroutineScope;)V", "getUuid", "Ljava/util/UUID;", "request", "getId", WebsocketGatewayConstants.DATA_KEY, "getSubmissionObservable", "Lio/reactivex/Single;", "isFinal", "", Card.Icon.ORDER, "fetchOrder", "orderId", "getOrderResponse", "getOrderResponse$feature_lib_trade_direct_ipo_externalDebug", "getShouldTriggerConfirmationInstantly", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DirectIpoOrderSubmissionManager extends OrderSubmissionManager<Tuples2<? extends UiDirectIpoOrderResponse, ? extends UiDirectIpoPostCobFollowup>, DirectIpoOrderSubmissionManager2> {
    public static final int $stable = 8;
    private final DirectIpoApi api;
    private final OrderStore orderStore;
    private final RxFactory rxFactory;

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean getShouldTriggerConfirmationInstantly(DirectIpoOrderSubmissionManager2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return true;
    }

    /* renamed from: isFinal, reason: avoid collision after fix types in other method */
    public boolean isFinal2(Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup> order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return true;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public /* bridge */ /* synthetic */ UUID getId(Tuples2<? extends UiDirectIpoOrderResponse, ? extends UiDirectIpoPostCobFollowup> tuples2) {
        return getId2((Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup>) tuples2);
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public /* bridge */ /* synthetic */ boolean isFinal(Tuples2<? extends UiDirectIpoOrderResponse, ? extends UiDirectIpoPostCobFollowup> tuples2) {
        return isFinal2((Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup>) tuples2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoOrderSubmissionManager(DirectIpoApi api, OrderStore orderStore, RxFactory rxFactory, @RootCoroutineScope CoroutineScope coroutineScope) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.api = api;
        this.orderStore = orderStore;
        this.rxFactory = rxFactory;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getUuid(DirectIpoOrderSubmissionManager2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getRefId();
    }

    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public UUID getId2(Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.getFirst().getId();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup>> getSubmissionObservable(DirectIpoOrderSubmissionManager2 request) {
        Single<Order> singleUpdateIpoOrder;
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof DirectIpoOrderSubmissionManager2.Create) {
            singleUpdateIpoOrder = this.orderStore.submitOrder(((DirectIpoOrderSubmissionManager2.Create) request).getOrderRequest());
        } else {
            if (!(request instanceof DirectIpoOrderSubmissionManager2.Update)) {
                throw new NoWhenBranchMatchedException();
            }
            DirectIpoOrderSubmissionManager2.Update update = (DirectIpoOrderSubmissionManager2.Update) request;
            singleUpdateIpoOrder = this.orderStore.updateIpoOrder(update.getOrderId(), update.getIpoOrderUpdateRequest());
        }
        Single singleFlatMap = singleUpdateIpoOrder.flatMap(new Function() { // from class: com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager.getSubmissionObservable.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup>> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return DirectIpoOrderSubmissionManager.this.getOrderResponse$feature_lib_trade_direct_ipo_externalDebug(order.getId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* compiled from: DirectIpoOrderSubmissionManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/directipo/models/ui/UiDirectIpoOrderResponse;", "Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowup;", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager$fetchOrder$1", m3645f = "DirectIpoOrderSubmissionManager.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager$fetchOrder$1 */
    static final class C293561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends UiDirectIpoOrderResponse, ? extends UiDirectIpoPostCobFollowup>>, Object> {
        final /* synthetic */ UUID $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C293561(UUID uuid, Continuation<? super C293561> continuation) {
            super(2, continuation);
            this.$orderId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DirectIpoOrderSubmissionManager.this.new C293561(this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends UiDirectIpoOrderResponse, ? extends UiDirectIpoPostCobFollowup>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup>> continuation) {
            return ((C293561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DirectIpoApi directIpoApi = DirectIpoOrderSubmissionManager.this.api;
                UUID uuid = this.$orderId;
                this.label = 1;
                obj = directIpoApi.getDirectIpoOrderTradeReceipt(uuid, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Tuples4.m3642to(((ApiDirectIpoOrderResponse) obj).toUiModel(), null);
        }
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<Tuples2<? extends UiDirectIpoOrderResponse, ? extends UiDirectIpoPostCobFollowup>> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new C293561(orderId, null), 1, null);
    }

    public final Single<Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup>> getOrderResponse$feature_lib_trade_direct_ipo_externalDebug(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new DirectIpoOrderSubmissionManager3(this, orderId, null), 1, null);
    }
}
