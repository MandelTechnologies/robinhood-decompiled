package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import android.content.res.Resources;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.Quote;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.models.util.Money;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.format.CryptoOrderFormatter2;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.crypto.utils.UiCurrencyPairs2;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.fee.FeeCryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderViewState;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoLimitOrderDataState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002&'Bg\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0001\u0002()¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState;", "", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "amount", "Ljava/math/BigDecimal;", "hasSeenPdtWarning", "", "isSellAllOrder", "orderPrices", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices$Limit;", "powerInfoAlert", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "isAccessibilityEnabled", "cryptoOrderMonetizationModel", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "<init>", "(Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Lcom/robinhood/models/db/OrderSide;Ljava/math/BigDecimal;ZZLcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices$Limit;Lcom/robinhood/models/ui/ServerDrivenAlert;ZLcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;)V", "getInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getAmount", "()Ljava/math/BigDecimal;", "getHasSeenPdtWarning", "()Z", "getOrderPrices", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices$Limit;", "getPowerInfoAlert", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "getCryptoOrderMonetizationModel", "()Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "getRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "Loading", "Loaded", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState$Loading;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoLimitOrderDataState {
    public static final int $stable = 8;
    private final BigDecimal amount;
    private final CryptoOrderMonetizationModel cryptoOrderMonetizationModel;
    private final boolean hasSeenPdtWarning;
    private final CryptoInputMode inputMode;
    private final boolean isAccessibilityEnabled;
    private final boolean isSellAllOrder;
    private final CryptoOrderPrices.Limit orderPrices;
    private final OrderSide orderSide;
    private final ServerDrivenAlert powerInfoAlert;

    /* compiled from: CryptoLimitOrderDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoInputMode.values().length];
            try {
                iArr[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CryptoLimitOrderDataState(CryptoInputMode cryptoInputMode, OrderSide orderSide, BigDecimal bigDecimal, boolean z, boolean z2, CryptoOrderPrices.Limit limit, ServerDrivenAlert serverDrivenAlert, boolean z3, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoInputMode, orderSide, bigDecimal, z, z2, limit, serverDrivenAlert, z3, cryptoOrderMonetizationModel);
    }

    private CryptoLimitOrderDataState(CryptoInputMode cryptoInputMode, OrderSide orderSide, BigDecimal bigDecimal, boolean z, boolean z2, CryptoOrderPrices.Limit limit, ServerDrivenAlert serverDrivenAlert, boolean z3, CryptoOrderMonetizationModel cryptoOrderMonetizationModel) {
        this.inputMode = cryptoInputMode;
        this.orderSide = orderSide;
        this.amount = bigDecimal;
        this.hasSeenPdtWarning = z;
        this.isSellAllOrder = z2;
        this.orderPrices = limit;
        this.powerInfoAlert = serverDrivenAlert;
        this.isAccessibilityEnabled = z3;
        this.cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
    }

    public /* synthetic */ CryptoLimitOrderDataState(CryptoInputMode cryptoInputMode, OrderSide orderSide, BigDecimal bigDecimal, boolean z, boolean z2, CryptoOrderPrices.Limit limit, ServerDrivenAlert serverDrivenAlert, boolean z3, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoInputMode, orderSide, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : limit, (i & 64) != 0 ? null : serverDrivenAlert, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? null : cryptoOrderMonetizationModel, null);
    }

    public CryptoInputMode getInputMode() {
        return this.inputMode;
    }

    public OrderSide getOrderSide() {
        return this.orderSide;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public boolean getHasSeenPdtWarning() {
        return this.hasSeenPdtWarning;
    }

    /* renamed from: isSellAllOrder, reason: from getter */
    public boolean getIsSellAllOrder() {
        return this.isSellAllOrder;
    }

    public CryptoOrderPrices.Limit getOrderPrices() {
        return this.orderPrices;
    }

    public ServerDrivenAlert getPowerInfoAlert() {
        return this.powerInfoAlert;
    }

    /* renamed from: isAccessibilityEnabled, reason: from getter */
    public boolean getIsAccessibilityEnabled() {
        return this.isAccessibilityEnabled;
    }

    public CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
        return this.cryptoOrderMonetizationModel;
    }

    public final RequestInputs getRequestInputs() {
        int i = WhenMappings.$EnumSwitchMapping$0[getInputMode().ordinal()];
        if (i == 1) {
            BigDecimal amount = getAmount();
            if (amount == null) {
                amount = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal = amount;
            Intrinsics.checkNotNull(bigDecimal);
            CryptoOrderPrices.Limit orderPrices = getOrderPrices();
            if (orderPrices == null) {
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                orderPrices = new CryptoOrderPrices.Limit(ZERO);
            }
            OrderSide orderSide = getOrderSide();
            OrderTimeInForce orderTimeInForce = OrderTimeInForce.GTC;
            boolean hasSeenPdtWarning = getHasSeenPdtWarning();
            return new RequestInputs.AsQuote(bigDecimal, getCryptoOrderMonetizationModel(), orderPrices, orderSide, orderTimeInForce, hasSeenPdtWarning, null, null, 192, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal amount2 = getAmount();
        if (amount2 == null) {
            amount2 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = amount2;
        Intrinsics.checkNotNull(bigDecimal2);
        CryptoOrderPrices.Limit orderPrices2 = getOrderPrices();
        if (orderPrices2 == null) {
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            orderPrices2 = new CryptoOrderPrices.Limit(ZERO2);
        }
        OrderSide orderSide2 = getOrderSide();
        OrderTimeInForce orderTimeInForce2 = OrderTimeInForce.GTC;
        boolean hasSeenPdtWarning2 = getHasSeenPdtWarning();
        boolean isSellAllOrder = getIsSellAllOrder();
        return new RequestInputs.AsAsset(bigDecimal2, getCryptoOrderMonetizationModel(), orderPrices2, orderSide2, orderTimeInForce2, hasSeenPdtWarning2, null, null, isSellAllOrder, null, 704, null);
    }

    /* compiled from: CryptoLimitOrderDataState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState$Loading;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "isAccessibilityEnabled", "", "powerInfoAlert", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "cryptoOrderMonetizationModel", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "<init>", "(Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Lcom/robinhood/models/db/OrderSide;ZLcom/robinhood/models/ui/ServerDrivenAlert;Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;)V", "getInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "()Z", "getPowerInfoAlert", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "getCryptoOrderMonetizationModel", "()Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoLimitOrderDataState {
        public static final int $stable = 8;
        private final CryptoOrderMonetizationModel cryptoOrderMonetizationModel;
        private final CryptoInputMode inputMode;
        private final boolean isAccessibilityEnabled;
        private final OrderSide orderSide;
        private final ServerDrivenAlert powerInfoAlert;

        public static /* synthetic */ Loading copy$default(Loading loading, CryptoInputMode cryptoInputMode, OrderSide orderSide, boolean z, ServerDrivenAlert serverDrivenAlert, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoInputMode = loading.inputMode;
            }
            if ((i & 2) != 0) {
                orderSide = loading.orderSide;
            }
            if ((i & 4) != 0) {
                z = loading.isAccessibilityEnabled;
            }
            if ((i & 8) != 0) {
                serverDrivenAlert = loading.powerInfoAlert;
            }
            if ((i & 16) != 0) {
                cryptoOrderMonetizationModel = loading.cryptoOrderMonetizationModel;
            }
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel2 = cryptoOrderMonetizationModel;
            boolean z2 = z;
            return loading.copy(cryptoInputMode, orderSide, z2, serverDrivenAlert, cryptoOrderMonetizationModel2);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoInputMode getInputMode() {
            return this.inputMode;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsAccessibilityEnabled() {
            return this.isAccessibilityEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final ServerDrivenAlert getPowerInfoAlert() {
            return this.powerInfoAlert;
        }

        /* renamed from: component5, reason: from getter */
        public final CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
            return this.cryptoOrderMonetizationModel;
        }

        public final Loading copy(CryptoInputMode inputMode, OrderSide orderSide, boolean isAccessibilityEnabled, ServerDrivenAlert powerInfoAlert, CryptoOrderMonetizationModel cryptoOrderMonetizationModel) {
            Intrinsics.checkNotNullParameter(inputMode, "inputMode");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            return new Loading(inputMode, orderSide, isAccessibilityEnabled, powerInfoAlert, cryptoOrderMonetizationModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return this.inputMode == loading.inputMode && this.orderSide == loading.orderSide && this.isAccessibilityEnabled == loading.isAccessibilityEnabled && Intrinsics.areEqual(this.powerInfoAlert, loading.powerInfoAlert) && Intrinsics.areEqual(this.cryptoOrderMonetizationModel, loading.cryptoOrderMonetizationModel);
        }

        public int hashCode() {
            int iHashCode = ((((this.inputMode.hashCode() * 31) + this.orderSide.hashCode()) * 31) + Boolean.hashCode(this.isAccessibilityEnabled)) * 31;
            ServerDrivenAlert serverDrivenAlert = this.powerInfoAlert;
            int iHashCode2 = (iHashCode + (serverDrivenAlert == null ? 0 : serverDrivenAlert.hashCode())) * 31;
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.cryptoOrderMonetizationModel;
            return iHashCode2 + (cryptoOrderMonetizationModel != null ? cryptoOrderMonetizationModel.hashCode() : 0);
        }

        public String toString() {
            return "Loading(inputMode=" + this.inputMode + ", orderSide=" + this.orderSide + ", isAccessibilityEnabled=" + this.isAccessibilityEnabled + ", powerInfoAlert=" + this.powerInfoAlert + ", cryptoOrderMonetizationModel=" + this.cryptoOrderMonetizationModel + ")";
        }

        public /* synthetic */ Loading(CryptoInputMode cryptoInputMode, OrderSide orderSide, boolean z, ServerDrivenAlert serverDrivenAlert, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cryptoInputMode, orderSide, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : serverDrivenAlert, (i & 16) != 0 ? null : cryptoOrderMonetizationModel);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        public CryptoInputMode getInputMode() {
            return this.inputMode;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        public OrderSide getOrderSide() {
            return this.orderSide;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        /* renamed from: isAccessibilityEnabled */
        public boolean getIsAccessibilityEnabled() {
            return this.isAccessibilityEnabled;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        public ServerDrivenAlert getPowerInfoAlert() {
            return this.powerInfoAlert;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        public CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
            return this.cryptoOrderMonetizationModel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(CryptoInputMode inputMode, OrderSide orderSide, boolean z, ServerDrivenAlert serverDrivenAlert, CryptoOrderMonetizationModel cryptoOrderMonetizationModel) {
            super(inputMode, orderSide, null, false, false, null, serverDrivenAlert, false, null, 444, null);
            Intrinsics.checkNotNullParameter(inputMode, "inputMode");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            this.inputMode = inputMode;
            this.orderSide = orderSide;
            this.isAccessibilityEnabled = z;
            this.powerInfoAlert = serverDrivenAlert;
            this.cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
        }
    }

    /* compiled from: CryptoLimitOrderDataState.kt */
    @Metadata(m3635d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J\u000e\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020eJ\t\u0010}\u001a\u00020\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0007HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0013HÂ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0015HÂ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u001bHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020 HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003HÆ\u0003JÈ\u0001\u0010\u008f\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u0003HÆ\u0001J\u0016\u0010\u0090\u0001\u001a\u00020\u00032\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001HÖ\u0003J\u000b\u0010\u0093\u0001\u001a\u00030\u0094\u0001HÖ\u0001J\n\u0010\u0095\u0001\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010$R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010$R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u001e\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010$R\u0011\u0010=\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0016\u0010A\u001a\u0004\u0018\u00010B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010N8@X\u0081\u0004¢\u0006\f\u0012\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010RR\u001b\u0010U\u001a\u00020V8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR\u001b\u0010[\u001a\u00020V8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010Z\u001a\u0004\b\\\u0010XR\u0011\u0010^\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0011\u0010f\u001a\u00020g8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0013\u0010j\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u0010n\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bo\u0010mR\u0011\u0010p\u001a\u00020q8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0011\u0010t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bt\u0010$R\u0011\u0010u\u001a\u00020v8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0011\u0010y\u001a\u00020z8F¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006\u0096\u0001"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState;", "isAccessibilityEnabled", "", "amount", "Ljava/math/BigDecimal;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "orderPrices", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices$Limit;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "hasSeenPdtWarning", "isSellAllOrder", "powerInfoAlert", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "cryptoOrderMonetizationModel", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "decimalSeparator", "", "bottomSheetService", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "reviewMessageAndDisclosuresState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "inputAmountFormatted", "", "limitPriceFormatted", "focusedEdtType", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEdtType;", "isReviewOrderButtonLoading", "<init>", "(ZLjava/math/BigDecimal;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices$Limit;Lcom/robinhood/models/db/OrderSide;ZZLcom/robinhood/models/ui/ServerDrivenAlert;Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;CLcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;Lcom/robinhood/android/lib/trade/DefaultOrderState;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEdtType;Z)V", "()Z", "getAmount", "()Ljava/math/BigDecimal;", "getInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getOrderPrices", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices$Limit;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getHasSeenPdtWarning", "getPowerInfoAlert", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "getCryptoOrderMonetizationModel", "()Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "getReviewMessageAndDisclosuresState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "getFormState", "()Lcom/robinhood/android/lib/trade/DefaultOrderState;", "getCryptoOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getInputAmountFormatted", "()Ljava/lang/String;", "getLimitPriceFormatted", "getFocusedEdtType", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEdtType;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoBuyingPower", "Lcom/robinhood/models/crypto/db/CryptoBuyingPower;", "getCryptoBuyingPower", "()Lcom/robinhood/models/crypto/db/CryptoBuyingPower;", "uiCryptoHolding", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "getUiCryptoHolding", "()Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "cryptoQuote", "Lcom/robinhood/models/crypto/db/Quote;", "getCryptoQuote", "()Lcom/robinhood/models/crypto/db/Quote;", "inputCurrencySymbolPosition", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "getInputCurrencySymbolPosition$feature_trade_crypto_externalDebug$annotations", "()V", "getInputCurrencySymbolPosition$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "quoteCurrencyCurrencySymbolPosition", "getQuoteCurrencyCurrencySymbolPosition", "amountCryptoInstrumentInputHelper", "Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "getAmountCryptoInstrumentInputHelper", "()Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "amountCryptoInstrumentInputHelper$delegate", "Lkotlin/Lazy;", "limitPriceCryptoInstrumentInputHelper", "getLimitPriceCryptoInstrumentInputHelper", "limitPriceCryptoInstrumentInputHelper$delegate", "toolbarContent", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$ToolbarContent;", "getToolbarContent", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$ToolbarContent;", "headerContent", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$HeaderContent;", "resources", "Landroid/content/res/Resources;", "inputAmountRow", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$InputAmountRow;", "getInputAmountRow", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$InputAmountRow;", "feeRow1", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "getFeeRow1", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "feeRow2", "getFeeRow2", "limitRow", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$LimitRow;", "getLimitRow", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$LimitRow;", "isNumpadDecimalSeparatorEnabled", "estimatedAmountRow", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$EstimatedAmountRow;", "getEstimatedAmountRow", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$EstimatedAmountRow;", "ctaButtonState", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState;", "getCtaButtonState", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends CryptoLimitOrderDataState {
        public static final int $stable = 8;
        private final BigDecimal amount;

        /* renamed from: amountCryptoInstrumentInputHelper$delegate, reason: from kotlin metadata */
        private final Lazy amountCryptoInstrumentInputHelper;
        private final CryptoTradingBottomSheetService bottomSheetService;
        private final CryptoOrderContext cryptoOrderContext;
        private final CryptoOrderMonetizationModel cryptoOrderMonetizationModel;
        private final char decimalSeparator;
        private final CryptoLimitOrderEdtType focusedEdtType;
        private final DefaultOrderState formState;
        private final boolean hasSeenPdtWarning;
        private final String inputAmountFormatted;
        private final CryptoInputMode inputMode;
        private final boolean isAccessibilityEnabled;
        private final boolean isReviewOrderButtonLoading;
        private final boolean isSellAllOrder;

        /* renamed from: limitPriceCryptoInstrumentInputHelper$delegate, reason: from kotlin metadata */
        private final Lazy limitPriceCryptoInstrumentInputHelper;
        private final String limitPriceFormatted;
        private final CryptoOrderPrices.Limit orderPrices;
        private final OrderSide orderSide;
        private final ServerDrivenAlert powerInfoAlert;
        private final CryptoOrderReviewMessageAndDisclosuresState reviewMessageAndDisclosuresState;

        /* compiled from: CryptoLimitOrderDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;
            public static final /* synthetic */ int[] $EnumSwitchMapping$3;
            public static final /* synthetic */ int[] $EnumSwitchMapping$4;

            static {
                int[] iArr = new int[CryptoInputMode.values().length];
                try {
                    iArr[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[DefaultOrderState.values().length];
                try {
                    iArr2[DefaultOrderState.EDITING.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[DefaultOrderState.REVIEWING.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[OrderSide.values().length];
                try {
                    iArr3[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr3[OrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$2 = iArr3;
                int[] iArr4 = new int[MonetizationModel.values().length];
                try {
                    iArr4[MonetizationModel.REBATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr4[MonetizationModel.FEE.ordinal()] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$3 = iArr4;
                int[] iArr5 = new int[CryptoLimitOrderEdtType.values().length];
                try {
                    iArr5[CryptoLimitOrderEdtType.AMOUNT.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr5[CryptoLimitOrderEdtType.LIMIT_PRICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr5[CryptoLimitOrderEdtType.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$4 = iArr5;
            }
        }

        /* renamed from: component10, reason: from getter */
        private final char getDecimalSeparator() {
            return this.decimalSeparator;
        }

        /* renamed from: component11, reason: from getter */
        private final CryptoTradingBottomSheetService getBottomSheetService() {
            return this.bottomSheetService;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, boolean z, BigDecimal bigDecimal, CryptoInputMode cryptoInputMode, CryptoOrderPrices.Limit limit, OrderSide orderSide, boolean z2, boolean z3, ServerDrivenAlert serverDrivenAlert, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, char c, CryptoTradingBottomSheetService cryptoTradingBottomSheetService, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, DefaultOrderState defaultOrderState, CryptoOrderContext cryptoOrderContext, String str, String str2, CryptoLimitOrderEdtType cryptoLimitOrderEdtType, boolean z4, int i, Object obj) {
            boolean z5;
            CryptoLimitOrderEdtType cryptoLimitOrderEdtType2;
            boolean z6 = (i & 1) != 0 ? loaded.isAccessibilityEnabled : z;
            BigDecimal bigDecimal2 = (i & 2) != 0 ? loaded.amount : bigDecimal;
            CryptoInputMode cryptoInputMode2 = (i & 4) != 0 ? loaded.inputMode : cryptoInputMode;
            CryptoOrderPrices.Limit limit2 = (i & 8) != 0 ? loaded.orderPrices : limit;
            OrderSide orderSide2 = (i & 16) != 0 ? loaded.orderSide : orderSide;
            boolean z7 = (i & 32) != 0 ? loaded.hasSeenPdtWarning : z2;
            boolean z8 = (i & 64) != 0 ? loaded.isSellAllOrder : z3;
            ServerDrivenAlert serverDrivenAlert2 = (i & 128) != 0 ? loaded.powerInfoAlert : serverDrivenAlert;
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel2 = (i & 256) != 0 ? loaded.cryptoOrderMonetizationModel : cryptoOrderMonetizationModel;
            char c2 = (i & 512) != 0 ? loaded.decimalSeparator : c;
            CryptoTradingBottomSheetService cryptoTradingBottomSheetService2 = (i & 1024) != 0 ? loaded.bottomSheetService : cryptoTradingBottomSheetService;
            CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState2 = (i & 2048) != 0 ? loaded.reviewMessageAndDisclosuresState : cryptoOrderReviewMessageAndDisclosuresState;
            DefaultOrderState defaultOrderState2 = (i & 4096) != 0 ? loaded.formState : defaultOrderState;
            CryptoOrderContext cryptoOrderContext2 = (i & 8192) != 0 ? loaded.cryptoOrderContext : cryptoOrderContext;
            boolean z9 = z6;
            String str3 = (i & 16384) != 0 ? loaded.inputAmountFormatted : str;
            String str4 = (i & 32768) != 0 ? loaded.limitPriceFormatted : str2;
            CryptoLimitOrderEdtType cryptoLimitOrderEdtType3 = (i & 65536) != 0 ? loaded.focusedEdtType : cryptoLimitOrderEdtType;
            if ((i & 131072) != 0) {
                cryptoLimitOrderEdtType2 = cryptoLimitOrderEdtType3;
                z5 = loaded.isReviewOrderButtonLoading;
            } else {
                z5 = z4;
                cryptoLimitOrderEdtType2 = cryptoLimitOrderEdtType3;
            }
            return loaded.copy(z9, bigDecimal2, cryptoInputMode2, limit2, orderSide2, z7, z8, serverDrivenAlert2, cryptoOrderMonetizationModel2, c2, cryptoTradingBottomSheetService2, cryptoOrderReviewMessageAndDisclosuresState2, defaultOrderState2, cryptoOrderContext2, str3, str4, cryptoLimitOrderEdtType2, z5);
        }

        /* renamed from: getInputCurrencySymbolPosition$feature_trade_crypto_externalDebug$annotations */
        public static /* synthetic */ void m2859x6632448c() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsAccessibilityEnabled() {
            return this.isAccessibilityEnabled;
        }

        /* renamed from: component12, reason: from getter */
        public final CryptoOrderReviewMessageAndDisclosuresState getReviewMessageAndDisclosuresState() {
            return this.reviewMessageAndDisclosuresState;
        }

        /* renamed from: component13, reason: from getter */
        public final DefaultOrderState getFormState() {
            return this.formState;
        }

        /* renamed from: component14, reason: from getter */
        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        /* renamed from: component15, reason: from getter */
        public final String getInputAmountFormatted() {
            return this.inputAmountFormatted;
        }

        /* renamed from: component16, reason: from getter */
        public final String getLimitPriceFormatted() {
            return this.limitPriceFormatted;
        }

        /* renamed from: component17, reason: from getter */
        public final CryptoLimitOrderEdtType getFocusedEdtType() {
            return this.focusedEdtType;
        }

        /* renamed from: component18, reason: from getter */
        public final boolean getIsReviewOrderButtonLoading() {
            return this.isReviewOrderButtonLoading;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoInputMode getInputMode() {
            return this.inputMode;
        }

        /* renamed from: component4, reason: from getter */
        public final CryptoOrderPrices.Limit getOrderPrices() {
            return this.orderPrices;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHasSeenPdtWarning() {
            return this.hasSeenPdtWarning;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsSellAllOrder() {
            return this.isSellAllOrder;
        }

        /* renamed from: component8, reason: from getter */
        public final ServerDrivenAlert getPowerInfoAlert() {
            return this.powerInfoAlert;
        }

        /* renamed from: component9, reason: from getter */
        public final CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
            return this.cryptoOrderMonetizationModel;
        }

        public final Loaded copy(boolean isAccessibilityEnabled, BigDecimal amount, CryptoInputMode inputMode, CryptoOrderPrices.Limit orderPrices, OrderSide orderSide, boolean hasSeenPdtWarning, boolean isSellAllOrder, ServerDrivenAlert powerInfoAlert, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, char decimalSeparator, CryptoTradingBottomSheetService bottomSheetService, CryptoOrderReviewMessageAndDisclosuresState reviewMessageAndDisclosuresState, DefaultOrderState formState, CryptoOrderContext cryptoOrderContext, String inputAmountFormatted, String limitPriceFormatted, CryptoLimitOrderEdtType focusedEdtType, boolean isReviewOrderButtonLoading) {
            Intrinsics.checkNotNullParameter(inputMode, "inputMode");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            Intrinsics.checkNotNullParameter(inputAmountFormatted, "inputAmountFormatted");
            Intrinsics.checkNotNullParameter(limitPriceFormatted, "limitPriceFormatted");
            Intrinsics.checkNotNullParameter(focusedEdtType, "focusedEdtType");
            return new Loaded(isAccessibilityEnabled, amount, inputMode, orderPrices, orderSide, hasSeenPdtWarning, isSellAllOrder, powerInfoAlert, cryptoOrderMonetizationModel, decimalSeparator, bottomSheetService, reviewMessageAndDisclosuresState, formState, cryptoOrderContext, inputAmountFormatted, limitPriceFormatted, focusedEdtType, isReviewOrderButtonLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.isAccessibilityEnabled == loaded.isAccessibilityEnabled && Intrinsics.areEqual(this.amount, loaded.amount) && this.inputMode == loaded.inputMode && Intrinsics.areEqual(this.orderPrices, loaded.orderPrices) && this.orderSide == loaded.orderSide && this.hasSeenPdtWarning == loaded.hasSeenPdtWarning && this.isSellAllOrder == loaded.isSellAllOrder && Intrinsics.areEqual(this.powerInfoAlert, loaded.powerInfoAlert) && Intrinsics.areEqual(this.cryptoOrderMonetizationModel, loaded.cryptoOrderMonetizationModel) && this.decimalSeparator == loaded.decimalSeparator && Intrinsics.areEqual(this.bottomSheetService, loaded.bottomSheetService) && Intrinsics.areEqual(this.reviewMessageAndDisclosuresState, loaded.reviewMessageAndDisclosuresState) && this.formState == loaded.formState && Intrinsics.areEqual(this.cryptoOrderContext, loaded.cryptoOrderContext) && Intrinsics.areEqual(this.inputAmountFormatted, loaded.inputAmountFormatted) && Intrinsics.areEqual(this.limitPriceFormatted, loaded.limitPriceFormatted) && this.focusedEdtType == loaded.focusedEdtType && this.isReviewOrderButtonLoading == loaded.isReviewOrderButtonLoading;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isAccessibilityEnabled) * 31;
            BigDecimal bigDecimal = this.amount;
            int iHashCode2 = (((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.inputMode.hashCode()) * 31;
            CryptoOrderPrices.Limit limit = this.orderPrices;
            int iHashCode3 = (((((((iHashCode2 + (limit == null ? 0 : limit.hashCode())) * 31) + this.orderSide.hashCode()) * 31) + Boolean.hashCode(this.hasSeenPdtWarning)) * 31) + Boolean.hashCode(this.isSellAllOrder)) * 31;
            ServerDrivenAlert serverDrivenAlert = this.powerInfoAlert;
            int iHashCode4 = (iHashCode3 + (serverDrivenAlert == null ? 0 : serverDrivenAlert.hashCode())) * 31;
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.cryptoOrderMonetizationModel;
            int iHashCode5 = (((((iHashCode4 + (cryptoOrderMonetizationModel == null ? 0 : cryptoOrderMonetizationModel.hashCode())) * 31) + Character.hashCode(this.decimalSeparator)) * 31) + this.bottomSheetService.hashCode()) * 31;
            CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = this.reviewMessageAndDisclosuresState;
            return ((((((((((((iHashCode5 + (cryptoOrderReviewMessageAndDisclosuresState != null ? cryptoOrderReviewMessageAndDisclosuresState.hashCode() : 0)) * 31) + this.formState.hashCode()) * 31) + this.cryptoOrderContext.hashCode()) * 31) + this.inputAmountFormatted.hashCode()) * 31) + this.limitPriceFormatted.hashCode()) * 31) + this.focusedEdtType.hashCode()) * 31) + Boolean.hashCode(this.isReviewOrderButtonLoading);
        }

        public String toString() {
            return "Loaded(isAccessibilityEnabled=" + this.isAccessibilityEnabled + ", amount=" + this.amount + ", inputMode=" + this.inputMode + ", orderPrices=" + this.orderPrices + ", orderSide=" + this.orderSide + ", hasSeenPdtWarning=" + this.hasSeenPdtWarning + ", isSellAllOrder=" + this.isSellAllOrder + ", powerInfoAlert=" + this.powerInfoAlert + ", cryptoOrderMonetizationModel=" + this.cryptoOrderMonetizationModel + ", decimalSeparator=" + this.decimalSeparator + ", bottomSheetService=" + this.bottomSheetService + ", reviewMessageAndDisclosuresState=" + this.reviewMessageAndDisclosuresState + ", formState=" + this.formState + ", cryptoOrderContext=" + this.cryptoOrderContext + ", inputAmountFormatted=" + this.inputAmountFormatted + ", limitPriceFormatted=" + this.limitPriceFormatted + ", focusedEdtType=" + this.focusedEdtType + ", isReviewOrderButtonLoading=" + this.isReviewOrderButtonLoading + ")";
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        /* renamed from: isAccessibilityEnabled */
        public boolean getIsAccessibilityEnabled() {
            return this.isAccessibilityEnabled;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        public BigDecimal getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        public CryptoInputMode getInputMode() {
            return this.inputMode;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        public CryptoOrderPrices.Limit getOrderPrices() {
            return this.orderPrices;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        public OrderSide getOrderSide() {
            return this.orderSide;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        public boolean getHasSeenPdtWarning() {
            return this.hasSeenPdtWarning;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        /* renamed from: isSellAllOrder */
        public boolean getIsSellAllOrder() {
            return this.isSellAllOrder;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        public ServerDrivenAlert getPowerInfoAlert() {
            return this.powerInfoAlert;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState
        public CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
            return this.cryptoOrderMonetizationModel;
        }

        public final CryptoOrderReviewMessageAndDisclosuresState getReviewMessageAndDisclosuresState() {
            return this.reviewMessageAndDisclosuresState;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Loaded(boolean r23, java.math.BigDecimal r24, com.robinhood.shared.formats.crypto.CryptoInputMode r25, com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices.Limit r26, com.robinhood.models.p320db.OrderSide r27, boolean r28, boolean r29, com.robinhood.models.p355ui.ServerDrivenAlert r30, com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel r31, char r32, com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService r33, com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState r34, com.robinhood.android.lib.trade.DefaultOrderState r35, com.robinhood.shared.trade.crypto.context.CryptoOrderContext r36, java.lang.String r37, java.lang.String r38, com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderEdtType r39, boolean r40, int r41, kotlin.jvm.internal.DefaultConstructorMarker r42) {
            /*
                r22 = this;
                r0 = r41
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L9
                r5 = r2
                goto Lb
            L9:
                r5 = r24
            Lb:
                r1 = r0 & 8
                if (r1 == 0) goto L11
                r7 = r2
                goto L13
            L11:
                r7 = r26
            L13:
                r1 = r0 & 32
                r3 = 0
                if (r1 == 0) goto L1a
                r9 = r3
                goto L1c
            L1a:
                r9 = r28
            L1c:
                r1 = r0 & 64
                if (r1 == 0) goto L22
                r10 = r3
                goto L24
            L22:
                r10 = r29
            L24:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L2a
                r11 = r2
                goto L2c
            L2a:
                r11 = r30
            L2c:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L32
                r12 = r2
                goto L34
            L32:
                r12 = r31
            L34:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L3a
                r15 = r2
                goto L3c
            L3a:
                r15 = r34
            L3c:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L45
                com.robinhood.android.lib.trade.DefaultOrderState r1 = com.robinhood.android.lib.trade.DefaultOrderState.EDITING
                r16 = r1
                goto L47
            L45:
                r16 = r35
            L47:
                r1 = r0 & 16384(0x4000, float:2.2959E-41)
                java.lang.String r2 = ""
                if (r1 == 0) goto L50
                r18 = r2
                goto L52
            L50:
                r18 = r37
            L52:
                r1 = 32768(0x8000, float:4.5918E-41)
                r1 = r1 & r0
                if (r1 == 0) goto L5b
                r19 = r2
                goto L5d
            L5b:
                r19 = r38
            L5d:
                r1 = 65536(0x10000, float:9.18355E-41)
                r1 = r1 & r0
                if (r1 == 0) goto L67
                com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderEdtType r1 = com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderEdtType.AMOUNT
                r20 = r1
                goto L69
            L67:
                r20 = r39
            L69:
                r1 = 131072(0x20000, float:1.83671E-40)
                r0 = r0 & r1
                if (r0 == 0) goto L7f
                r21 = r3
                r4 = r23
                r6 = r25
                r8 = r27
                r13 = r32
                r14 = r33
                r17 = r36
                r3 = r22
                goto L8f
            L7f:
                r21 = r40
                r3 = r22
                r4 = r23
                r6 = r25
                r8 = r27
                r13 = r32
                r14 = r33
                r17 = r36
            L8f:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState.Loaded.<init>(boolean, java.math.BigDecimal, com.robinhood.shared.formats.crypto.CryptoInputMode, com.robinhood.shared.trade.crypto.ui.order.CryptoOrderPrices$Limit, com.robinhood.models.db.OrderSide, boolean, boolean, com.robinhood.models.ui.ServerDrivenAlert, com.robinhood.models.crypto.ui.fee.CryptoOrderMonetizationModel, char, com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService, com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState, com.robinhood.android.lib.trade.DefaultOrderState, com.robinhood.shared.trade.crypto.context.CryptoOrderContext, java.lang.String, java.lang.String, com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderEdtType, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final DefaultOrderState getFormState() {
            return this.formState;
        }

        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        public final String getInputAmountFormatted() {
            return this.inputAmountFormatted;
        }

        public final String getLimitPriceFormatted() {
            return this.limitPriceFormatted;
        }

        public final CryptoLimitOrderEdtType getFocusedEdtType() {
            return this.focusedEdtType;
        }

        public final boolean isReviewOrderButtonLoading() {
            return this.isReviewOrderButtonLoading;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(boolean z, BigDecimal bigDecimal, CryptoInputMode inputMode, CryptoOrderPrices.Limit limit, OrderSide orderSide, boolean z2, boolean z3, ServerDrivenAlert serverDrivenAlert, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, char c, CryptoTradingBottomSheetService bottomSheetService, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, DefaultOrderState formState, CryptoOrderContext cryptoOrderContext, String inputAmountFormatted, String limitPriceFormatted, CryptoLimitOrderEdtType focusedEdtType, boolean z4) {
            super(inputMode, orderSide, null, false, false, null, serverDrivenAlert, false, null, 444, null);
            Intrinsics.checkNotNullParameter(inputMode, "inputMode");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            Intrinsics.checkNotNullParameter(inputAmountFormatted, "inputAmountFormatted");
            Intrinsics.checkNotNullParameter(limitPriceFormatted, "limitPriceFormatted");
            Intrinsics.checkNotNullParameter(focusedEdtType, "focusedEdtType");
            this.isAccessibilityEnabled = z;
            this.amount = bigDecimal;
            this.inputMode = inputMode;
            this.orderPrices = limit;
            this.orderSide = orderSide;
            this.hasSeenPdtWarning = z2;
            this.isSellAllOrder = z3;
            this.powerInfoAlert = serverDrivenAlert;
            this.cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
            this.decimalSeparator = c;
            this.bottomSheetService = bottomSheetService;
            this.reviewMessageAndDisclosuresState = cryptoOrderReviewMessageAndDisclosuresState;
            this.formState = formState;
            this.cryptoOrderContext = cryptoOrderContext;
            this.inputAmountFormatted = inputAmountFormatted;
            this.limitPriceFormatted = limitPriceFormatted;
            this.focusedEdtType = focusedEdtType;
            this.isReviewOrderButtonLoading = z4;
            try {
                bottomSheetService.emitBottomSheetData(extensions2.persistentListOf(CryptoOrderContexts.getLimitOrderDefinitionBottomSheetTypeDto(cryptoOrderContext)));
            } catch (Exception unused) {
            }
            this.amountCryptoInstrumentInputHelper = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDataState$Loaded$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoLimitOrderDataState.Loaded.amountCryptoInstrumentInputHelper_delegate$lambda$0(this.f$0);
                }
            });
            this.limitPriceCryptoInstrumentInputHelper = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDataState$Loaded$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoLimitOrderDataState.Loaded.limitPriceCryptoInstrumentInputHelper_delegate$lambda$1(this.f$0);
                }
            });
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.cryptoOrderContext.getRequestContext().getCurrencyPair();
        }

        private final CryptoBuyingPower getCryptoBuyingPower() {
            return this.cryptoOrderContext.getAccountContext().getCryptoBuyingPower();
        }

        private final UiCryptoHolding getUiCryptoHolding() {
            return this.cryptoOrderContext.getRequestContext().getHolding();
        }

        private final Quote getCryptoQuote() {
            return this.cryptoOrderContext.getRequestContext().getQuote();
        }

        /* renamed from: getInputCurrencySymbolPosition$feature_trade_crypto_externalDebug */
        public final CurrencyFormatModel.CurrencySymbolPosition m2860xaeec3a0c() {
            int i = WhenMappings.$EnumSwitchMapping$0[getInputMode().ordinal()];
            if (i == 1) {
                return getQuoteCurrencyCurrencySymbolPosition();
            }
            if (i == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        private final CurrencyFormatModel.CurrencySymbolPosition getQuoteCurrencyCurrencySymbolPosition() {
            return CurrencyDefinitions.getCurrencySymbolPosition(getUiCurrencyPair().getQuoteCurrency());
        }

        public final CryptoInstrumentInputHelper getAmountCryptoInstrumentInputHelper() {
            return (CryptoInstrumentInputHelper) this.amountCryptoInstrumentInputHelper.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CryptoInstrumentInputHelper amountCryptoInstrumentInputHelper_delegate$lambda$0(Loaded loaded) {
            return new CryptoInstrumentInputHelper(loaded.getUiCurrencyPair());
        }

        public final CryptoInstrumentInputHelper getLimitPriceCryptoInstrumentInputHelper() {
            return (CryptoInstrumentInputHelper) this.limitPriceCryptoInstrumentInputHelper.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CryptoInstrumentInputHelper limitPriceCryptoInstrumentInputHelper_delegate$lambda$1(Loaded loaded) {
            return new CryptoInstrumentInputHelper(UiCurrencyPair.copy$default(loaded.getUiCurrencyPair(), null, null, false, null, false, null, null, null, null, null, null, null, loaded.getUiCurrencyPair().getQuoteCurrencyForPriceInput(), null, null, null, null, null, null, null, null, 2093055, null));
        }

        public final CryptoLimitOrderViewState.Loaded.ToolbarContent getToolbarContent() {
            StringResource stringResourceInvoke;
            DefaultOrderState defaultOrderState = this.formState;
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            int i = iArr[defaultOrderState.ordinal()];
            StringResource stringResourceInvoke2 = null;
            if (i == 1) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.order_type_limit, new Object[0]);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = null;
            }
            int i2 = iArr[this.formState.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40095R.string.crypto_limit_order_reviewing_state_toolbar_title, new Object[0]);
            }
            return new CryptoLimitOrderViewState.Loaded.ToolbarContent(stringResourceInvoke, stringResourceInvoke2);
        }

        public final CryptoLimitOrderViewState.Loaded.HeaderContent headerContent(Resources resources) throws Resources.NotFoundException {
            StringResource stringResourceInvoke;
            Money buyingPower;
            Intrinsics.checkNotNullParameter(resources, "resources");
            CharSequence text = CryptoOrderFormatter2.getSideLabel(getOrderSide()).getText(resources);
            String str = ((Object) text) + PlaceholderUtils.XXShortPlaceholderText + getUiCurrencyPair().getAssetCurrency().getCode();
            int i = WhenMappings.$EnumSwitchMapping$2[getOrderSide().ordinal()];
            if (i == 1) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i2 = C38572R.string.crypto_order_header_quote_buying_power;
                Currency quoteCurrency = getUiCurrencyPair().getQuoteCurrency();
                CryptoBuyingPower cryptoBuyingPower = getCryptoBuyingPower();
                if (cryptoBuyingPower != null && (buyingPower = cryptoBuyingPower.getBuyingPower()) != null) {
                    decimalValue = buyingPower.getDecimalValue();
                }
                stringResourceInvoke = companion.invoke(i2, CurrencyDefinitions.formatCurrency$default(quoteCurrency, BigDecimals7.orZero(decimalValue), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = WhenMappings.$EnumSwitchMapping$0[getInputMode().ordinal()];
                if (i3 == 1) {
                    StringResource.Companion companion2 = StringResource.INSTANCE;
                    int i4 = C40095R.string.crypto_limit_order_header_subtitle_sell_quote;
                    Currency quoteCurrency2 = getUiCurrencyPair().getQuoteCurrency();
                    UiCryptoHolding uiCryptoHolding = getUiCryptoHolding();
                    stringResourceInvoke = companion2.invoke(i4, CurrencyDefinitions.formatCurrency$default(quoteCurrency2, BigDecimals7.safeMultiply(BigDecimals7.orZero(uiCryptoHolding != null ? uiCryptoHolding.getQuantityAvailable() : null), getCryptoQuote().getBidPrice().getDecimalValue()), false, false, null, 0, null, null, false, false, false, false, 2046, null), getUiCurrencyPair().getAssetCurrency().getCode());
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StringResource.Companion companion3 = StringResource.INSTANCE;
                    int i5 = C40095R.string.crypto_limit_order_header_subtitle_sell_asset;
                    Currency assetCurrencyForCost = getUiCurrencyPair().getAssetCurrencyForCost();
                    UiCryptoHolding uiCryptoHolding2 = getUiCryptoHolding();
                    stringResourceInvoke = companion3.invoke(i5, CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, BigDecimals7.orZero(uiCryptoHolding2 != null ? uiCryptoHolding2.getQuantityAvailable() : null), false, false, null, 0, null, null, false, false, false, false, 2046, null));
                }
            }
            return new CryptoLimitOrderViewState.Loaded.HeaderContent(str, stringResourceInvoke, getPowerInfoAlert() != null);
        }

        public final CryptoLimitOrderViewState.Loaded.InputAmountRow getInputAmountRow() {
            String code;
            String code2;
            Currency quoteCurrency;
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C40095R.string.crypto_order_create_amount_label;
            CryptoInputMode inputMode = getInputMode();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i2 = iArr[inputMode.ordinal()];
            if (i2 == 1) {
                code = getUiCurrencyPair().getQuoteCurrency().getCode();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                code = getUiCurrencyPair().getAssetCurrency().getCode();
            }
            StringResource stringResourceInvoke = companion.invoke(i, code);
            int i3 = iArr[getInputMode().ordinal()];
            if (i3 == 1) {
                code2 = getUiCurrencyPair().getQuoteCurrency().getCode();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                code2 = getUiCurrencyPair().getAssetCurrency().getCode();
            }
            String str = code2;
            int i4 = iArr[getInputMode().ordinal()];
            if (i4 == 1) {
                quoteCurrency = getUiCurrencyPair().getQuoteCurrency();
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                quoteCurrency = getUiCurrencyPair().getAssetCurrencyForCost();
            }
            return new CryptoLimitOrderViewState.Loaded.InputAmountRow(stringResourceInvoke, str, this.inputAmountFormatted, quoteCurrency, getInputMode(), m2860xaeec3a0c());
        }

        public final CryptoOrderReviewRowState getFeeRow1() {
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel = getCryptoOrderMonetizationModel();
            MonetizationModel monetizationModel = cryptoOrderMonetizationModel != null ? cryptoOrderMonetizationModel.getMonetizationModel() : null;
            int i = monetizationModel == null ? -1 : WhenMappings.$EnumSwitchMapping$3[monetizationModel.ordinal()];
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (this.cryptoOrderContext.getRequestContext().getRequestInputs() instanceof RequestInputs.AsQuote) {
                    return FeeCryptoOrderReviewRowState.generateCryptoOrderReviewRowStateForFee(true, this.formState == DefaultOrderState.REVIEWING, true, this.cryptoOrderContext, getCryptoOrderMonetizationModel().getMonetizationModel());
                }
            }
            return null;
        }

        public final CryptoOrderReviewRowState getFeeRow2() {
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel = getCryptoOrderMonetizationModel();
            MonetizationModel monetizationModel = cryptoOrderMonetizationModel != null ? cryptoOrderMonetizationModel.getMonetizationModel() : null;
            int i = monetizationModel == null ? -1 : WhenMappings.$EnumSwitchMapping$3[monetizationModel.ordinal()];
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return FeeCryptoOrderReviewRowState.generateCryptoOrderReviewRowStateForFee(true, this.formState == DefaultOrderState.REVIEWING, true, this.cryptoOrderContext, getCryptoOrderMonetizationModel().getMonetizationModel());
                }
                if (this.cryptoOrderContext.getRequestContext().getRequestInputs() instanceof RequestInputs.AsAsset) {
                    return FeeCryptoOrderReviewRowState.generateCryptoOrderReviewRowStateForFee(true, this.formState == DefaultOrderState.REVIEWING, true, this.cryptoOrderContext, getCryptoOrderMonetizationModel().getMonetizationModel());
                }
            }
            return null;
        }

        public final CryptoLimitOrderViewState.Loaded.LimitRow getLimitRow() {
            BigDecimal decimalValue;
            StringResource stringResourceInvoke;
            BigDecimal decimalValue2;
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke2 = companion.invoke(C40095R.string.crypto_order_create_limit_price_label, new Object[0]);
            int i = WhenMappings.$EnumSwitchMapping$1[this.formState.ordinal()];
            if (i == 1) {
                Currency quoteCurrencyForPriceInput = getUiCurrencyPair().getQuoteCurrencyForPriceInput();
                OrderSide orderSide = getOrderSide();
                int[] iArr = WhenMappings.$EnumSwitchMapping$2;
                int i2 = iArr[orderSide.ordinal()];
                if (i2 == 1) {
                    decimalValue = this.cryptoOrderContext.getAskPrice().getDecimalValue();
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    decimalValue = this.cryptoOrderContext.getBidPrice().getDecimalValue();
                }
                String currency$default = CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, decimalValue, false, false, null, 0, null, null, false, false, false, false, 2046, null);
                int i3 = iArr[getOrderSide().ordinal()];
                if (i3 == 1) {
                    stringResourceInvoke = companion.invoke(C40095R.string.crypto_order_create_advanced_limit_price_buy, currency$default);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringResourceInvoke = companion.invoke(C40095R.string.crypto_order_create_advanced_limit_price_sell, currency$default);
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = null;
            }
            UiCurrencyPair currencyPair = this.cryptoOrderContext.getRequestContext().getCurrencyPair();
            int i4 = WhenMappings.$EnumSwitchMapping$2[getOrderSide().ordinal()];
            if (i4 == 1) {
                decimalValue2 = this.cryptoOrderContext.getRequestContext().getQuote().getAskPrice().getDecimalValue();
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                decimalValue2 = this.cryptoOrderContext.getRequestContext().getQuote().getBidPrice().getDecimalValue();
            }
            return new CryptoLimitOrderViewState.Loaded.LimitRow(stringResourceInvoke2, stringResourceInvoke, currencyPair.roundToTickSize(decimalValue2, getOrderSide()), getUiCurrencyPair().getQuoteCurrencyForPriceInput(), this.limitPriceFormatted, getQuoteCurrencyCurrencySymbolPosition());
        }

        public final boolean isNumpadDecimalSeparatorEnabled() {
            int i = WhenMappings.$EnumSwitchMapping$4[this.focusedEdtType.ordinal()];
            if (i == 1) {
                return !StringsKt.contains$default((CharSequence) this.inputAmountFormatted, this.decimalSeparator, false, 2, (Object) null) && UiCurrencyPairs2.allowDecimalInput(getUiCurrencyPair(), getInputMode());
            }
            if (i == 2) {
                return !StringsKt.contains$default((CharSequence) this.limitPriceFormatted, this.decimalSeparator, false, 2, (Object) null) && UiCurrencyPairs2.allowDecimalInput(getUiCurrencyPair(), CryptoInputMode.QUOTE_CURRENCY);
            }
            if (i == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final CryptoLimitOrderViewState.Loaded.EstimatedAmountRow getEstimatedAmountRow() {
            StringResource stringResourceInvoke;
            String currency$default;
            CryptoInputMode inputMode = getInputMode();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[inputMode.ordinal()];
            if (i == 1) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_limit_order_estimated_asset, getUiCurrencyPair().getAssetCurrency().getCode());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = WhenMappings.$EnumSwitchMapping$2[getOrderSide().ordinal()];
                if (i2 == 1) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_result_label_estimated_cost, new Object[0]);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_result_label_estimated_credit, new Object[0]);
                }
            }
            int i3 = iArr[getInputMode().ordinal()];
            if (i3 == 1) {
                currency$default = CurrencyDefinitions.formatCurrency$default(getUiCurrencyPair().getAssetCurrency(), this.cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                currency$default = CurrencyDefinitions.formatCurrency$default(getUiCurrencyPair().getQuoteCurrency(), this.cryptoOrderContext.getOrderInfo().getUncollaredTotalCost(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
            }
            return new CryptoLimitOrderViewState.Loaded.EstimatedAmountRow(stringResourceInvoke, currency$default);
        }

        public final CryptoLimitOrderViewState.Loaded.CtaButtonState getCtaButtonState() {
            if (!this.cryptoOrderContext.isMonetizationModelDataLoaded()) {
                return new CryptoLimitOrderViewState.Loaded.CtaButtonState.Continue(false, false);
            }
            int i = WhenMappings.$EnumSwitchMapping$2[getOrderSide().ordinal()];
            if (i == 1) {
                return new CryptoLimitOrderViewState.Loaded.CtaButtonState.Continue(BigDecimals7.isPositive(getAmount()), this.isReviewOrderButtonLoading);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (getAmount() == null) {
                UiCryptoHolding holding = this.cryptoOrderContext.getRequestContext().getHolding();
                if (BigDecimals7.isPositive(BigDecimals7.orZero(holding != null ? holding.getQuantityAvailable() : null))) {
                    return new CryptoLimitOrderViewState.Loaded.CtaButtonState.SellAllButton(StringResource.INSTANCE.invoke(C40095R.string.order_sell_all, getUiCurrencyPair().getDisplaySymbol()));
                }
            }
            return new CryptoLimitOrderViewState.Loaded.CtaButtonState.Continue(BigDecimals7.isPositive(getAmount()), this.isReviewOrderButtonLoading);
        }
    }
}
