package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.models.api.ApiCryptoL2Quote;
import com.robinhood.models.api.ApiCryptoOrderInputType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.api.retrofit.CryptoL2QuoteApi;
import com.robinhood.models.crypto.p314db.CryptoL2Quote;
import com.robinhood.models.crypto.p314db.CryptoL2Quote2;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import retrofit2.Response;

/* compiled from: CryptoL2QuoteStore.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore;", "Lcom/robinhood/store/Store;", "cryptoL2QuoteApi", "Lcom/robinhood/models/api/retrofit/CryptoL2QuoteApi;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/models/api/retrofit/CryptoL2QuoteApi;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/store/StoreBundle;)V", "cryptoL2QuoteEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore$Params;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoL2Quote;", "handlePoller", "Lkotlinx/coroutines/flow/Flow;", "args", "pollCryptoL2Quote", "Lio/reactivex/Observable;", "Lcom/robinhood/models/crypto/db/CryptoL2Quote;", "params", "Params", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoL2QuoteStore extends Store {
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoL2QuoteApi cryptoL2QuoteApi;
    private final Endpoint<Params, Response<ApiCryptoL2Quote>> cryptoL2QuoteEndpoint;

    /* compiled from: CryptoL2QuoteStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuoteTouchPoint.values().length];
            try {
                iArr[QuoteTouchPoint.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuoteTouchPoint.TRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoL2QuoteStore(CryptoL2QuoteApi cryptoL2QuoteApi, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoL2QuoteApi, "cryptoL2QuoteApi");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoL2QuoteApi = cryptoL2QuoteApi;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoL2QuoteEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoL2QuoteStore2(this, null), getLogoutKillswitch(), new CryptoL2QuoteStore3(null), storeBundle.getClock(), null, 16, null);
    }

    private final Flow<Response<ApiCryptoL2Quote>> handlePoller(Params args) {
        int i = WhenMappings.$EnumSwitchMapping$0[args.getQuoteTouchPoint().ordinal()];
        if (i == 1) {
            return Endpoint8.backendPoll$default(this.cryptoL2QuoteEndpoint, args, null, null, 6, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoTradeQuotePollingIntervalExperiment(), new CryptoL2QuoteStore$handlePoller$$inlined$flatMapLatest$1(null, this, args));
    }

    public final Observable<CryptoL2Quote> pollCryptoL2Quote(Params params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Observable map = asObservable(handlePoller(params)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.CryptoL2QuoteStore.pollCryptoL2Quote.1
            @Override // io.reactivex.functions.Function
            public final Optional<CryptoL2Quote> apply(Response<ApiCryptoL2Quote> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ApiCryptoL2Quote apiCryptoL2QuoteBody = it.body();
                return Optional3.asOptional(apiCryptoL2QuoteBody != null ? CryptoL2Quote2.toDbModel(apiCryptoL2QuoteBody) : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ObservablesKt.filterIsPresent(map);
    }

    /* compiled from: CryptoL2QuoteStore.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore$Params;", "", "currencyPairId", "Ljava/util/UUID;", "orderInputType", "Lcom/robinhood/models/api/ApiCryptoOrderInputType;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "quantity", "Ljava/math/BigDecimal;", "routingGroup", "Lcom/robinhood/models/api/fee/MonetizationModel;", "quoteTouchPoint", "Lcom/robinhood/librobinhood/data/store/QuoteTouchPoint;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiCryptoOrderInputType;Lcom/robinhood/models/db/OrderSide;Ljava/math/BigDecimal;Lcom/robinhood/models/api/fee/MonetizationModel;Lcom/robinhood/librobinhood/data/store/QuoteTouchPoint;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getOrderInputType", "()Lcom/robinhood/models/api/ApiCryptoOrderInputType;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getQuantity", "()Ljava/math/BigDecimal;", "getRoutingGroup", "()Lcom/robinhood/models/api/fee/MonetizationModel;", "getQuoteTouchPoint", "()Lcom/robinhood/librobinhood/data/store/QuoteTouchPoint;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Params {
        private final UUID currencyPairId;
        private final ApiCryptoOrderInputType orderInputType;
        private final OrderSide orderSide;
        private final BigDecimal quantity;
        private final QuoteTouchPoint quoteTouchPoint;
        private final MonetizationModel routingGroup;

        public static /* synthetic */ Params copy$default(Params params, UUID uuid, ApiCryptoOrderInputType apiCryptoOrderInputType, OrderSide orderSide, BigDecimal bigDecimal, MonetizationModel monetizationModel, QuoteTouchPoint quoteTouchPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = params.currencyPairId;
            }
            if ((i & 2) != 0) {
                apiCryptoOrderInputType = params.orderInputType;
            }
            if ((i & 4) != 0) {
                orderSide = params.orderSide;
            }
            if ((i & 8) != 0) {
                bigDecimal = params.quantity;
            }
            if ((i & 16) != 0) {
                monetizationModel = params.routingGroup;
            }
            if ((i & 32) != 0) {
                quoteTouchPoint = params.quoteTouchPoint;
            }
            MonetizationModel monetizationModel2 = monetizationModel;
            QuoteTouchPoint quoteTouchPoint2 = quoteTouchPoint;
            return params.copy(uuid, apiCryptoOrderInputType, orderSide, bigDecimal, monetizationModel2, quoteTouchPoint2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCryptoOrderInputType getOrderInputType() {
            return this.orderInputType;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component5, reason: from getter */
        public final MonetizationModel getRoutingGroup() {
            return this.routingGroup;
        }

        /* renamed from: component6, reason: from getter */
        public final QuoteTouchPoint getQuoteTouchPoint() {
            return this.quoteTouchPoint;
        }

        public final Params copy(UUID currencyPairId, ApiCryptoOrderInputType orderInputType, OrderSide orderSide, BigDecimal quantity, MonetizationModel routingGroup, QuoteTouchPoint quoteTouchPoint) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(orderInputType, "orderInputType");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(routingGroup, "routingGroup");
            Intrinsics.checkNotNullParameter(quoteTouchPoint, "quoteTouchPoint");
            return new Params(currencyPairId, orderInputType, orderSide, quantity, routingGroup, quoteTouchPoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Intrinsics.areEqual(this.currencyPairId, params.currencyPairId) && this.orderInputType == params.orderInputType && this.orderSide == params.orderSide && Intrinsics.areEqual(this.quantity, params.quantity) && this.routingGroup == params.routingGroup && this.quoteTouchPoint == params.quoteTouchPoint;
        }

        public int hashCode() {
            return (((((((((this.currencyPairId.hashCode() * 31) + this.orderInputType.hashCode()) * 31) + this.orderSide.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.routingGroup.hashCode()) * 31) + this.quoteTouchPoint.hashCode();
        }

        public String toString() {
            return "Params(currencyPairId=" + this.currencyPairId + ", orderInputType=" + this.orderInputType + ", orderSide=" + this.orderSide + ", quantity=" + this.quantity + ", routingGroup=" + this.routingGroup + ", quoteTouchPoint=" + this.quoteTouchPoint + ")";
        }

        public Params(UUID currencyPairId, ApiCryptoOrderInputType orderInputType, OrderSide orderSide, BigDecimal quantity, MonetizationModel routingGroup, QuoteTouchPoint quoteTouchPoint) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(orderInputType, "orderInputType");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(routingGroup, "routingGroup");
            Intrinsics.checkNotNullParameter(quoteTouchPoint, "quoteTouchPoint");
            this.currencyPairId = currencyPairId;
            this.orderInputType = orderInputType;
            this.orderSide = orderSide;
            this.quantity = quantity;
            this.routingGroup = routingGroup;
            this.quoteTouchPoint = quoteTouchPoint;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final ApiCryptoOrderInputType getOrderInputType() {
            return this.orderInputType;
        }

        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final MonetizationModel getRoutingGroup() {
            return this.routingGroup;
        }

        public /* synthetic */ Params(UUID uuid, ApiCryptoOrderInputType apiCryptoOrderInputType, OrderSide orderSide, BigDecimal bigDecimal, MonetizationModel monetizationModel, QuoteTouchPoint quoteTouchPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, apiCryptoOrderInputType, orderSide, bigDecimal, monetizationModel, (i & 32) != 0 ? QuoteTouchPoint.OTHER : quoteTouchPoint);
        }

        public final QuoteTouchPoint getQuoteTouchPoint() {
            return this.quoteTouchPoint;
        }
    }
}
