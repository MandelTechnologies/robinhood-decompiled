package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.api.ApiMarginUpsell;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import com.robinhood.android.lib.margin.api.models.ApiSeenMarginUpsellResponse;
import com.robinhood.android.lib.margin.api.models.EnableMarginUpsellOrderType;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0004\u0012\u00020\u00110\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginUpsellStore;", "Lcom/robinhood/store/Store;", "marginInvestingApi", "Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;Lcom/robinhood/store/StoreBundle;)V", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/lib/margin/MarginUpsellStore$GetMarginUpsellParams;", "Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell;", "postEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "", "Lcom/robinhood/android/lib/margin/api/models/EnableMarginUpsellOrderType;", "Lcom/robinhood/android/lib/margin/api/models/ApiSeenMarginUpsellResponse;", "getMarginUpsell", "Lio/reactivex/Single;", "accountNumber", "orderType", "orderId", "Ljava/util/UUID;", "seenMarginUpsell", "", "GetMarginUpsellParams", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginUpsellStore extends Store {
    private final Endpoint<GetMarginUpsellParams, ApiMarginUpsell> getEndpoint;
    private final MarginInvestingApi marginInvestingApi;
    private final PostEndpoint<Tuples2<String, EnableMarginUpsellOrderType>, ApiSeenMarginUpsellResponse> postEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginUpsellStore(MarginInvestingApi marginInvestingApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(marginInvestingApi, "marginInvestingApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.marginInvestingApi = marginInvestingApi;
        this.getEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new MarginUpsellStore2(this, null), getLogoutKillswitch(), new MarginUpsellStore3(null), storeBundle.getClock(), null, 16, null);
        this.postEndpoint = PostEndpoint.INSTANCE.create(new MarginUpsellStore4(this, null), new MarginUpsellStore5(null));
    }

    /* compiled from: MarginUpsellStore.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginUpsellStore$GetMarginUpsellParams;", "", "accountNumber", "", "orderType", "Lcom/robinhood/android/lib/margin/api/models/EnableMarginUpsellOrderType;", "orderId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/lib/margin/api/models/EnableMarginUpsellOrderType;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getOrderType", "()Lcom/robinhood/android/lib/margin/api/models/EnableMarginUpsellOrderType;", "getOrderId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GetMarginUpsellParams {
        private final String accountNumber;
        private final UUID orderId;
        private final EnableMarginUpsellOrderType orderType;

        public static /* synthetic */ GetMarginUpsellParams copy$default(GetMarginUpsellParams getMarginUpsellParams, String str, EnableMarginUpsellOrderType enableMarginUpsellOrderType, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getMarginUpsellParams.accountNumber;
            }
            if ((i & 2) != 0) {
                enableMarginUpsellOrderType = getMarginUpsellParams.orderType;
            }
            if ((i & 4) != 0) {
                uuid = getMarginUpsellParams.orderId;
            }
            return getMarginUpsellParams.copy(str, enableMarginUpsellOrderType, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final EnableMarginUpsellOrderType getOrderType() {
            return this.orderType;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getOrderId() {
            return this.orderId;
        }

        public final GetMarginUpsellParams copy(String accountNumber, EnableMarginUpsellOrderType orderType, UUID orderId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            return new GetMarginUpsellParams(accountNumber, orderType, orderId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetMarginUpsellParams)) {
                return false;
            }
            GetMarginUpsellParams getMarginUpsellParams = (GetMarginUpsellParams) other;
            return Intrinsics.areEqual(this.accountNumber, getMarginUpsellParams.accountNumber) && this.orderType == getMarginUpsellParams.orderType && Intrinsics.areEqual(this.orderId, getMarginUpsellParams.orderId);
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.orderType.hashCode()) * 31) + this.orderId.hashCode();
        }

        public String toString() {
            return "GetMarginUpsellParams(accountNumber=" + this.accountNumber + ", orderType=" + this.orderType + ", orderId=" + this.orderId + ")";
        }

        public GetMarginUpsellParams(String accountNumber, EnableMarginUpsellOrderType orderType, UUID orderId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            this.accountNumber = accountNumber;
            this.orderType = orderType;
            this.orderId = orderId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final EnableMarginUpsellOrderType getOrderType() {
            return this.orderType;
        }

        public final UUID getOrderId() {
            return this.orderId;
        }
    }

    /* compiled from: MarginUpsellStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.margin.MarginUpsellStore$getMarginUpsell$1", m3645f = "MarginUpsellStore.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.margin.MarginUpsellStore$getMarginUpsell$1 */
    static final class C203171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMarginUpsell>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $orderId;
        final /* synthetic */ EnableMarginUpsellOrderType $orderType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203171(String str, EnableMarginUpsellOrderType enableMarginUpsellOrderType, UUID uuid, Continuation<? super C203171> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$orderType = enableMarginUpsellOrderType;
            this.$orderId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpsellStore.this.new C203171(this.$accountNumber, this.$orderType, this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMarginUpsell> continuation) {
            return ((C203171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = MarginUpsellStore.this.getEndpoint;
            GetMarginUpsellParams getMarginUpsellParams = new GetMarginUpsellParams(this.$accountNumber, this.$orderType, this.$orderId);
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, getMarginUpsellParams, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiMarginUpsell> getMarginUpsell(String accountNumber, EnableMarginUpsellOrderType orderType, UUID orderId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C203171(accountNumber, orderType, orderId, null), 1, null);
    }

    /* compiled from: MarginUpsellStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.margin.MarginUpsellStore$seenMarginUpsell$1", m3645f = "MarginUpsellStore.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.margin.MarginUpsellStore$seenMarginUpsell$1 */
    static final class C203181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ EnableMarginUpsellOrderType $orderType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203181(String str, EnableMarginUpsellOrderType enableMarginUpsellOrderType, Continuation<? super C203181> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$orderType = enableMarginUpsellOrderType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpsellStore.this.new C203181(this.$accountNumber, this.$orderType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = MarginUpsellStore.this.postEndpoint;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$accountNumber, this.$orderType);
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void seenMarginUpsell(String accountNumber, EnableMarginUpsellOrderType orderType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C203181(accountNumber, orderType, null), 3, null);
    }
}
