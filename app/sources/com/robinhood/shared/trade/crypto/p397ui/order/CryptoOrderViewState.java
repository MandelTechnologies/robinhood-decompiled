package com.robinhood.shared.trade.crypto.p397ui.order;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.p011ui.text.font.FontWeight;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.models.util.Money;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.utils.UiCurrencyPairs2;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.format.CryptoTimeInForceFormatter;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.fee.FeeCryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.tooltip.CryptoOrderTooltipData;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderUiEvent;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: CryptoOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\\]BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\bHÀ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\\\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b\t\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8AX\u0080\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\b8AX\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b6\u0010\u0018R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000208078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u000208078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010A\u001a\u00020>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010B\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bB\u0010\u0018R\u0013\u0010F\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010H\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0017\u0010J\u001a\b\u0012\u0004\u0012\u000208078F¢\u0006\u0006\u001a\u0004\bI\u0010:R\u0016\u0010M\u001a\u0004\u0018\u0001088AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0016\u0010O\u001a\u0004\u0018\u00010C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010ER\u0014\u0010Q\u001a\u0002088AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010LR\u0016\u0010S\u001a\u0004\u0018\u0001088AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010LR\u0011\u0010U\u001a\u0002088G¢\u0006\u0006\u001a\u0004\bT\u0010LR\u0016\u0010W\u001a\u0004\u0018\u0001088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010LR\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020X078F¢\u0006\u0006\u001a\u0004\bY\u0010:R\u0011\u0010[\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b[\u0010\u0018¨\u0006^"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;", "", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$InputState;", "inputState", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$OrderState;", "orderState", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "powerInfoAlert", "", "isRhcApp", "j$/time/Instant", "currentTime", "Lcom/robinhood/models/db/Account;", "account", "isMibExperimentEnabled", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$InputState;Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$OrderState;Lcom/robinhood/models/ui/ServerDrivenAlert;ZLj$/time/Instant;Lcom/robinhood/models/db/Account;Z)V", "component1", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$InputState;", "component2", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$OrderState;", "component3", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "component4", "()Z", "component5", "()Lj$/time/Instant;", "component6$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/db/Account;", "component6", "component7$feature_trade_crypto_externalDebug", "component7", "copy", "(Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$InputState;Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$OrderState;Lcom/robinhood/models/ui/ServerDrivenAlert;ZLj$/time/Instant;Lcom/robinhood/models/db/Account;Z)Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$InputState;", "getInputState", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$OrderState;", "getOrderState", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "getPowerInfoAlert", "Z", "Lj$/time/Instant;", "getCurrentTime", "Lcom/robinhood/models/db/Account;", "getAccount$feature_trade_crypto_externalDebug", "isMibExperimentEnabled$feature_trade_crypto_externalDebug", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "getTraderOrderReviewRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "traderOrderReviewRowStates", "getRhcOrderReviewRowStates", "rhcOrderReviewRowStates", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;", "getCryptoOrderHeaderState$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;", "cryptoOrderHeaderState", "isSellAllBtnVisible", "Lcom/robinhood/utils/resource/StringResource;", "getBestPriceAskBidLabel", "()Lcom/robinhood/utils/resource/StringResource;", "bestPriceAskBidLabel", "getPriceSecondaryLabel", "priceSecondaryLabel", "getOrderReviewRowStates", "orderReviewRowStates", "getFeeCryptoOrderReviewRowState$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "feeCryptoOrderReviewRowState", "getOrderStopPriceLabel$feature_trade_crypto_externalDebug", "orderStopPriceLabel", "getPriceRowState$feature_trade_crypto_externalDebug", "priceRowState", "getSpreadCryptoOrderReviewRowState$feature_trade_crypto_externalDebug", "spreadCryptoOrderReviewRowState", "getResultCryptoOrderReviewRowState", "resultCryptoOrderReviewRowState", "getAccountNameOrderReviewState$feature_trade_crypto_externalDebug", "accountNameOrderReviewState", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "getBottomSheetTypeDtos", "bottomSheetTypeDtos", "isSelectedAccountVisible", "InputState", "OrderState", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderViewState {
    public static final int $stable = 8;
    private final Account account;
    private final Instant currentTime;
    private final InputState inputState;
    private final boolean isMibExperimentEnabled;
    private final boolean isRhcApp;
    private final OrderState orderState;
    private final ServerDrivenAlert powerInfoAlert;

    /* compiled from: CryptoOrderViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoOrderType.values().length];
            try {
                iArr2[CryptoOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CryptoInputMode.values().length];
            try {
                iArr3[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static /* synthetic */ CryptoOrderViewState copy$default(CryptoOrderViewState cryptoOrderViewState, InputState inputState, OrderState orderState, ServerDrivenAlert serverDrivenAlert, boolean z, Instant instant, Account account, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            inputState = cryptoOrderViewState.inputState;
        }
        if ((i & 2) != 0) {
            orderState = cryptoOrderViewState.orderState;
        }
        if ((i & 4) != 0) {
            serverDrivenAlert = cryptoOrderViewState.powerInfoAlert;
        }
        if ((i & 8) != 0) {
            z = cryptoOrderViewState.isRhcApp;
        }
        if ((i & 16) != 0) {
            instant = cryptoOrderViewState.currentTime;
        }
        if ((i & 32) != 0) {
            account = cryptoOrderViewState.account;
        }
        if ((i & 64) != 0) {
            z2 = cryptoOrderViewState.isMibExperimentEnabled;
        }
        Account account2 = account;
        boolean z3 = z2;
        Instant instant2 = instant;
        ServerDrivenAlert serverDrivenAlert2 = serverDrivenAlert;
        return cryptoOrderViewState.copy(inputState, orderState, serverDrivenAlert2, z, instant2, account2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final InputState getInputState() {
        return this.inputState;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderState getOrderState() {
        return this.orderState;
    }

    /* renamed from: component3, reason: from getter */
    public final ServerDrivenAlert getPowerInfoAlert() {
        return this.powerInfoAlert;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRhcApp() {
        return this.isRhcApp;
    }

    /* renamed from: component5, reason: from getter */
    public final Instant getCurrentTime() {
        return this.currentTime;
    }

    /* renamed from: component6$feature_trade_crypto_externalDebug, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component7$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getIsMibExperimentEnabled() {
        return this.isMibExperimentEnabled;
    }

    public final CryptoOrderViewState copy(InputState inputState, OrderState orderState, ServerDrivenAlert powerInfoAlert, boolean isRhcApp, Instant currentTime, Account account, boolean isMibExperimentEnabled) {
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return new CryptoOrderViewState(inputState, orderState, powerInfoAlert, isRhcApp, currentTime, account, isMibExperimentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderViewState)) {
            return false;
        }
        CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) other;
        return Intrinsics.areEqual(this.inputState, cryptoOrderViewState.inputState) && Intrinsics.areEqual(this.orderState, cryptoOrderViewState.orderState) && Intrinsics.areEqual(this.powerInfoAlert, cryptoOrderViewState.powerInfoAlert) && this.isRhcApp == cryptoOrderViewState.isRhcApp && Intrinsics.areEqual(this.currentTime, cryptoOrderViewState.currentTime) && Intrinsics.areEqual(this.account, cryptoOrderViewState.account) && this.isMibExperimentEnabled == cryptoOrderViewState.isMibExperimentEnabled;
    }

    public int hashCode() {
        int iHashCode = this.inputState.hashCode() * 31;
        OrderState orderState = this.orderState;
        int iHashCode2 = (iHashCode + (orderState == null ? 0 : orderState.hashCode())) * 31;
        ServerDrivenAlert serverDrivenAlert = this.powerInfoAlert;
        int iHashCode3 = (((((iHashCode2 + (serverDrivenAlert == null ? 0 : serverDrivenAlert.hashCode())) * 31) + Boolean.hashCode(this.isRhcApp)) * 31) + this.currentTime.hashCode()) * 31;
        Account account = this.account;
        return ((iHashCode3 + (account != null ? account.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMibExperimentEnabled);
    }

    public String toString() {
        return "CryptoOrderViewState(inputState=" + this.inputState + ", orderState=" + this.orderState + ", powerInfoAlert=" + this.powerInfoAlert + ", isRhcApp=" + this.isRhcApp + ", currentTime=" + this.currentTime + ", account=" + this.account + ", isMibExperimentEnabled=" + this.isMibExperimentEnabled + ")";
    }

    public CryptoOrderViewState(InputState inputState, OrderState orderState, ServerDrivenAlert serverDrivenAlert, boolean z, Instant currentTime, Account account, boolean z2) {
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        this.inputState = inputState;
        this.orderState = orderState;
        this.powerInfoAlert = serverDrivenAlert;
        this.isRhcApp = z;
        this.currentTime = currentTime;
        this.account = account;
        this.isMibExperimentEnabled = z2;
    }

    public /* synthetic */ CryptoOrderViewState(InputState inputState, OrderState orderState, ServerDrivenAlert serverDrivenAlert, boolean z, Instant instant, Account account, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputState, (i & 2) != 0 ? null : orderState, (i & 4) != 0 ? null : serverDrivenAlert, (i & 8) != 0 ? false : z, instant, (i & 32) != 0 ? null : account, (i & 64) != 0 ? false : z2);
    }

    public final InputState getInputState() {
        return this.inputState;
    }

    public final OrderState getOrderState() {
        return this.orderState;
    }

    public final ServerDrivenAlert getPowerInfoAlert() {
        return this.powerInfoAlert;
    }

    public final boolean isRhcApp() {
        return this.isRhcApp;
    }

    public final Instant getCurrentTime() {
        return this.currentTime;
    }

    public final Account getAccount$feature_trade_crypto_externalDebug() {
        return this.account;
    }

    public final boolean isMibExperimentEnabled$feature_trade_crypto_externalDebug() {
        return this.isMibExperimentEnabled;
    }

    public final CryptoOrderHeaderState getCryptoOrderHeaderState$feature_trade_crypto_externalDebug() {
        CryptoOrderContext cryptoOrderContext;
        OrderSide orderSide$feature_trade_crypto_externalDebug = this.inputState.getOrderSide$feature_trade_crypto_externalDebug();
        UiCurrencyPair uiCurrencyPair = this.inputState.getUiCurrencyPair();
        StringResource cryptoPowerText = null;
        String displaySymbol = uiCurrencyPair != null ? uiCurrencyPair.getDisplaySymbol() : null;
        OrderState orderState = this.orderState;
        if (orderState != null && (cryptoOrderContext = orderState.getCryptoOrderContext()) != null) {
            cryptoPowerText = CryptoOrderContexts.getCryptoPowerText(cryptoOrderContext);
        }
        return new CryptoOrderHeaderState(orderSide$feature_trade_crypto_externalDebug, displaySymbol, cryptoPowerText, this.powerInfoAlert, false, 16, null);
    }

    public final boolean isSellAllBtnVisible() {
        OrderState orderState;
        BigDecimal amountHoldInAssetCurrency$feature_trade_crypto_externalDebug;
        return this.inputState.getOrderSide$feature_trade_crypto_externalDebug() == OrderSide.SELL && (orderState = this.orderState) != null && (amountHoldInAssetCurrency$feature_trade_crypto_externalDebug = orderState.getAmountHoldInAssetCurrency$feature_trade_crypto_externalDebug()) != null && BigDecimals7.m2978gt(amountHoldInAssetCurrency$feature_trade_crypto_externalDebug, BigDecimal.ZERO) && this.orderState.getCryptoOrderContext().isMonetizationModelDataLoaded();
    }

    public final StringResource getBestPriceAskBidLabel() {
        OrderState orderState;
        String currency$default;
        int i;
        if (this.inputState.getOrderPrices$feature_trade_crypto_externalDebug().getOrderType() == CryptoOrderType.MARKET || (orderState = this.orderState) == null) {
            return null;
        }
        OrderSide orderSide$feature_trade_crypto_externalDebug = this.inputState.getOrderSide$feature_trade_crypto_externalDebug();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[orderSide$feature_trade_crypto_externalDebug.ordinal()];
        if (i2 == 1) {
            currency$default = CurrencyDefinitions.formatCurrency$default(orderState.getQuotePriceCurrency(), orderState.getAskPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            currency$default = CurrencyDefinitions.formatCurrency$default(orderState.getQuotePriceCurrency(), orderState.getBidPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        }
        int i3 = iArr[this.inputState.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
        if (i3 == 1) {
            i = C40095R.string.crypto_order_price_best_ask_label;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C40095R.string.crypto_order_price_best_bid_label;
        }
        return StringResource.INSTANCE.invoke(i, currency$default);
    }

    public final StringResource getPriceSecondaryLabel() {
        if (this.orderState == null) {
            return null;
        }
        CryptoOrderPrices orderPrices$feature_trade_crypto_externalDebug = this.inputState.getOrderPrices$feature_trade_crypto_externalDebug();
        if (orderPrices$feature_trade_crypto_externalDebug instanceof CryptoOrderPrices.Market) {
            if (!this.isRhcApp || !(this.inputState.m2865x5cfb4369() instanceof CryptoOrderMonetizationModel.Rebate)) {
                return null;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[this.inputState.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_ask_price_secondary_label, FormatsLocalized.getPercentFormat().format(this.orderState.getBuySpreadFraction$feature_trade_crypto_externalDebug()));
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_bid_price_secondary_label, FormatsLocalized.getPercentFormat().format(this.orderState.getSellSpreadFraction$feature_trade_crypto_externalDebug()));
        }
        if (orderPrices$feature_trade_crypto_externalDebug instanceof CryptoOrderPrices.Limit) {
            if (!this.inputState.getIsReviewing()) {
                return null;
            }
            if (this.orderState.getRequest().getTimeInForce() != OrderTimeInForce.GTC) {
                throw new IllegalStateException("Limit Order time in force must be GTC");
            }
            return CryptoTimeInForceFormatter.getExpiryFormattedDateStringResource(this.orderState.getRequest().getTimeInForce(), this.currentTime);
        }
        if (!(orderPrices$feature_trade_crypto_externalDebug instanceof CryptoOrderPrices.StopLoss) && !(orderPrices$feature_trade_crypto_externalDebug instanceof CryptoOrderPrices.StopLimit)) {
            throw new NoWhenBranchMatchedException();
        }
        return CryptoTimeInForceFormatter.getExpiryFormattedDateStringResource(this.orderState.getRequest().getTimeInForce(), this.currentTime);
    }

    public final ImmutableList<CryptoOrderReviewRowState> getOrderReviewRowStates() {
        if (this.isRhcApp) {
            return getRhcOrderReviewRowStates();
        }
        return getTraderOrderReviewRowStates();
    }

    private final ImmutableList<CryptoOrderReviewRowState> getTraderOrderReviewRowStates() {
        CryptoOrderReviewRowState cryptoOrderReviewRowState;
        CryptoOrderReviewRowState priceRowState$feature_trade_crypto_externalDebug = getPriceRowState$feature_trade_crypto_externalDebug();
        CryptoOrderMonetizationModel cryptoOrderMonetizationModelM2865x5cfb4369 = this.inputState.m2865x5cfb4369();
        if (cryptoOrderMonetizationModelM2865x5cfb4369 instanceof CryptoOrderMonetizationModel.Fee) {
            cryptoOrderReviewRowState = m2863x39fe0086();
        } else if (cryptoOrderMonetizationModelM2865x5cfb4369 instanceof CryptoOrderMonetizationModel.Rebate) {
            cryptoOrderReviewRowState = m2864x1e92851f();
        } else {
            if (cryptoOrderMonetizationModelM2865x5cfb4369 != null) {
                throw new NoWhenBranchMatchedException();
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            cryptoOrderReviewRowState = new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke("----------"), null, null, null, null, null, true, 62, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("----"), null, null, null, null, null, true, 62, null), null, null, null, false, null, false, null, null, 1020, null);
        }
        return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new CryptoOrderReviewRowState[]{priceRowState$feature_trade_crypto_externalDebug, cryptoOrderReviewRowState, getResultCryptoOrderReviewRowState(), m2862x5e15d005()}));
    }

    private final ImmutableList<CryptoOrderReviewRowState> getRhcOrderReviewRowStates() {
        return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new CryptoOrderReviewRowState[]{getPriceRowState$feature_trade_crypto_externalDebug(), m2863x39fe0086(), getResultCryptoOrderReviewRowState()}));
    }

    /* renamed from: getFeeCryptoOrderReviewRowState$feature_trade_crypto_externalDebug */
    public final CryptoOrderReviewRowState m2863x39fe0086() {
        boolean z = this.isRhcApp;
        boolean isReviewing = this.inputState.getIsReviewing();
        OrderState orderState = this.orderState;
        CryptoOrderContext cryptoOrderContext = orderState != null ? orderState.getCryptoOrderContext() : null;
        CryptoOrderMonetizationModel cryptoOrderMonetizationModelM2865x5cfb4369 = this.inputState.m2865x5cfb4369();
        return FeeCryptoOrderReviewRowState.generateCryptoOrderReviewRowStateForFee(z, isReviewing, true, cryptoOrderContext, cryptoOrderMonetizationModelM2865x5cfb4369 != null ? cryptoOrderMonetizationModelM2865x5cfb4369.getMonetizationModel() : null);
    }

    public final StringResource getOrderStopPriceLabel$feature_trade_crypto_externalDebug() {
        CryptoOrderPrices orderPrices$feature_trade_crypto_externalDebug = this.inputState.getOrderPrices$feature_trade_crypto_externalDebug();
        if ((orderPrices$feature_trade_crypto_externalDebug instanceof CryptoOrderPrices.Market) || (orderPrices$feature_trade_crypto_externalDebug instanceof CryptoOrderPrices.Limit) || (orderPrices$feature_trade_crypto_externalDebug instanceof CryptoOrderPrices.StopLoss)) {
            return null;
        }
        if (!(orderPrices$feature_trade_crypto_externalDebug instanceof CryptoOrderPrices.StopLimit)) {
            throw new NoWhenBranchMatchedException();
        }
        OrderState orderState = this.orderState;
        if (orderState == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_stop_price_label, CurrencyDefinitions.formatCurrency$default(orderState.getQuotePriceCurrency(), ((CryptoOrderPrices.StopLimit) this.inputState.getOrderPrices$feature_trade_crypto_externalDebug()).getStopPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    public final CryptoOrderReviewRowState getPriceRowState$feature_trade_crypto_externalDebug() {
        CryptoOrderReviewRowState.TapAction tapAction;
        CryptoOrderReviewRowState.TapAction showOrderTypeEducation;
        if (this.orderState == null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke("------------"), null, null, null, null, null, true, 62, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("-------"), null, null, null, null, null, true, 62, null), null, null, null, false, null, false, null, null, 1020, null);
        }
        boolean isPriceLabelClickEnabled = this.inputState.getIsPriceLabelClickEnabled();
        StringResource cryptoPriceLabel$feature_trade_crypto_externalDebug = this.orderState.getCryptoPriceLabel$feature_trade_crypto_externalDebug();
        CryptoOrderReviewRowState.IconContent iconContent = isPriceLabelClickEnabled ? new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderReviewRowState.ColorOverride.FG_2) : null;
        if (isPriceLabelClickEnabled) {
            int i = WhenMappings.$EnumSwitchMapping$1[this.inputState.getOrderPrices$feature_trade_crypto_externalDebug().getOrderType().ordinal()];
            if (i == 1) {
                showOrderTypeEducation = CryptoOrderReviewRowState.TapAction.ShowMarketPriceBottomSheet.INSTANCE;
            } else {
                if (i == 2) {
                    throw new IllegalStateException("Price label should not be enabled for limit order");
                }
                if (i == 3) {
                    showOrderTypeEducation = new CryptoOrderReviewRowState.TapAction.ShowOrderTypeEducation(CryptoOrderType.STOP_LOSS);
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    showOrderTypeEducation = new CryptoOrderReviewRowState.TapAction.ShowOrderTypeEducation(CryptoOrderType.STOP_LIMIT);
                }
            }
            tapAction = showOrderTypeEducation;
        } else {
            tapAction = null;
        }
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(cryptoPriceLabel$feature_trade_crypto_externalDebug, null, iconContent, tapAction, null, null, false, 114, null);
        CryptoOrderReviewRowState.TextContent textContent2 = new CryptoOrderReviewRowState.TextContent(this.orderState.getCryptoPriceText$feature_trade_crypto_externalDebug(), null, null, null, null, FontWeight.INSTANCE.getBold(), false, 94, null);
        StringResource bestPriceAskBidLabel = getBestPriceAskBidLabel();
        CryptoOrderReviewRowState.SecondaryTextRow secondaryTextRow = bestPriceAskBidLabel != null ? new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(bestPriceAskBidLabel, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, 2, null) : null;
        StringResource orderStopPriceLabel$feature_trade_crypto_externalDebug = getOrderStopPriceLabel$feature_trade_crypto_externalDebug();
        CryptoOrderReviewRowState.SecondaryTextRow secondaryTextRow2 = orderStopPriceLabel$feature_trade_crypto_externalDebug != null ? new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(orderStopPriceLabel$feature_trade_crypto_externalDebug, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, 2, null) : null;
        StringResource priceSecondaryLabel = getPriceSecondaryLabel();
        return new CryptoOrderReviewRowState(textContent, textContent2, null, extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new CryptoOrderReviewRowState.SecondaryTextRow[]{secondaryTextRow, secondaryTextRow2, priceSecondaryLabel != null ? new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(priceSecondaryLabel, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, 2, null) : null})), this.inputState.getIsEditMainPriceBtnVisible() ? new CryptoOrderReviewRowState.TextContent(StringResource.INSTANCE.invoke(C40095R.string.crypto_order_edit_limit_price_button_label, new Object[0]), null, null, CryptoOrderReviewRowState.TapAction.EditPrice.INSTANCE, null, null, false, 118, null) : null, true, CryptoOrderReviewRowState.VerticalPadding.DEFAULT, false, null, null, 900, null);
    }

    /* renamed from: getSpreadCryptoOrderReviewRowState$feature_trade_crypto_externalDebug */
    public final CryptoOrderReviewRowState m2864x1e92851f() {
        StringResource stringResourceInvoke;
        BigDecimal decimalValue;
        if (this.inputState.getOrderPrices$feature_trade_crypto_externalDebug().getOrderType() != CryptoOrderType.MARKET) {
            return null;
        }
        OrderState orderState = this.orderState;
        UiCurrencyPair uiCurrencyPair = this.inputState.getUiCurrencyPair();
        if (orderState == null || uiCurrencyPair == null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke("----------"), null, null, null, null, null, true, 62, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("----"), null, null, null, null, null, true, 62, null), null, null, null, false, null, false, null, null, 1020, null);
        }
        if (uiCurrencyPair.getMarketOrdersOnly()) {
            return null;
        }
        OrderSide orderSide$feature_trade_crypto_externalDebug = this.inputState.getOrderSide$feature_trade_crypto_externalDebug();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[orderSide$feature_trade_crypto_externalDebug.ordinal()];
        if (i == 1) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_spread_label_buy, FormatsLocalized.getPercentFormat().format(orderState.getBuySpreadFraction$feature_trade_crypto_externalDebug()));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_spread_label_sell, FormatsLocalized.getPercentFormat().format(orderState.getSellSpreadFraction$feature_trade_crypto_externalDebug()));
        }
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderReviewRowState.ColorOverride.FG_2), CryptoOrderReviewRowState.TapAction.ShowSpreadBottomSheet.INSTANCE, null, null, false, 114, null);
        StringResource.Companion companion2 = StringResource.INSTANCE;
        Currency quotePriceCurrency = orderState.getQuotePriceCurrency();
        int i2 = iArr[this.inputState.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
        if (i2 == 1) {
            decimalValue = orderState.getBuySpread$feature_trade_crypto_externalDebug().getDecimalValue();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            decimalValue = orderState.getSellSpread$feature_trade_crypto_externalDebug().getDecimalValue();
        }
        return new CryptoOrderReviewRowState(textContent, new CryptoOrderReviewRowState.TextContent(companion2.invoke(CurrencyDefinitions.formatCurrency$default(quotePriceCurrency, decimalValue, false, false, null, 0, null, null, false, false, false, false, 2046, null)), null, null, null, null, FontWeight.INSTANCE.getBold(), false, 94, null), null, extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion2.invoke(C40095R.string.crypto_order_spread_secondary_included, uiCurrencyPair.getDisplaySymbol()), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, 2, null)), null, true, CryptoOrderReviewRowState.VerticalPadding.DEFAULT, false, null, null, 916, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CryptoOrderReviewRowState getResultCryptoOrderReviewRowState() {
        UiCryptoTradeBonusEligibility.TradeBonus quoteBonus;
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        BigDecimal uncollaredTotalCost;
        BigDecimal assetRequestedQuantity;
        BigDecimal uncollaredTotalCost2;
        if (this.orderState == null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke("------------"), null, null, null, null, null, true, 62, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("-------"), null, null, null, null, null, true, 62, null), null, null, null, false, null, false, null, null, 1020, null);
        }
        UiCryptoTradeBonusEligibility tradeBonusEligibility = this.inputState.getTradeBonusEligibility();
        OrderSide orderSide$feature_trade_crypto_externalDebug = this.inputState.getOrderSide$feature_trade_crypto_externalDebug();
        CryptoInputMode inputMode$feature_trade_crypto_externalDebug = this.inputState.getInputMode$feature_trade_crypto_externalDebug();
        CryptoOrderType orderType = this.inputState.getOrderPrices$feature_trade_crypto_externalDebug().getOrderType();
        CryptoOrderType cryptoOrderType = CryptoOrderType.MARKET;
        if (orderType == cryptoOrderType) {
            quoteBonus = (orderSide$feature_trade_crypto_externalDebug == OrderSide.SELL && inputMode$feature_trade_crypto_externalDebug == CryptoInputMode.ASSET_CURRENCY && tradeBonusEligibility != null) ? tradeBonusEligibility.getQuoteBonus() : null;
        } else if (orderSide$feature_trade_crypto_externalDebug == OrderSide.BUY && inputMode$feature_trade_crypto_externalDebug == CryptoInputMode.QUOTE_CURRENCY) {
            if (tradeBonusEligibility != null) {
                quoteBonus = tradeBonusEligibility.getAssetBonus();
            }
        } else if (orderSide$feature_trade_crypto_externalDebug == OrderSide.SELL && inputMode$feature_trade_crypto_externalDebug == CryptoInputMode.ASSET_CURRENCY && tradeBonusEligibility != null) {
            quoteBonus = tradeBonusEligibility.getQuoteBonus();
        }
        CryptoOrderReviewRowState.TextContent textContent = (this.inputState.getOrderPrices$feature_trade_crypto_externalDebug().getOrderType() == cryptoOrderType || orderSide$feature_trade_crypto_externalDebug != OrderSide.BUY || inputMode$feature_trade_crypto_externalDebug != CryptoInputMode.QUOTE_CURRENCY || quoteBonus == null) ? null : new CryptoOrderReviewRowState.TextContent(StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.orderState.getAssetCostCurrency(), (BigDecimal) RangesKt.coerceAtLeast(BigDecimals7.safeMultiply(this.orderState.getAssetRequestedQuantity(), quoteBonus.getBonusRatio()), quoteBonus.getMinBonusAmount()), false, false, null, 0, null, null, false, false, false, false, 2046, null)), CryptoOrderReviewRowState.ColorOverride.DAY_PRIME, null, null, null, FontWeight.INSTANCE.getBold(), false, 92, null);
        CryptoInputMode inputMode$feature_trade_crypto_externalDebug2 = this.inputState.getInputMode$feature_trade_crypto_externalDebug();
        int[] iArr = WhenMappings.$EnumSwitchMapping$2;
        int i = iArr[inputMode$feature_trade_crypto_externalDebug2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.inputState.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
            if (i2 == 1) {
                int i3 = WhenMappings.$EnumSwitchMapping$1[this.inputState.getOrderPrices$feature_trade_crypto_externalDebug().getOrderType().ordinal()];
                if (i3 == 1) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_result_label_total_cost, new Object[0]);
                } else if (i3 == 2) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_result_label_estimated_cost, new Object[0]);
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_result_label_estimated_cost, new Object[0]);
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i4 = WhenMappings.$EnumSwitchMapping$1[this.inputState.getOrderPrices$feature_trade_crypto_externalDebug().getOrderType().ordinal()];
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3 && i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (quoteBonus != null && this.inputState.getIsReviewing()) {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_result_label_estimated_total_credit, new Object[0]);
                    } else {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_result_label_estimated_credit, new Object[0]);
                    }
                } else if (this.isRhcApp) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_result_label_estimated_credit, new Object[0]);
                } else {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_result_label_total_credit, new Object[0]);
                }
            }
        } else if (quoteBonus == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_result_label_asset, this.orderState.getAssetCostCurrency().getCode());
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_result_label_total_asset, this.orderState.getAssetCostCurrency().getCode());
        }
        CryptoOrderReviewRowState.TextContent textContent2 = new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        int i5 = WhenMappings.$EnumSwitchMapping$1[this.inputState.getOrderPrices$feature_trade_crypto_externalDebug().getOrderType().ordinal()];
        if (i5 == 1) {
            int i6 = iArr[this.inputState.getInputMode$feature_trade_crypto_externalDebug().ordinal()];
            if (i6 == 1) {
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.orderState.getAssetCostCurrency(), this.orderState.getAssetRequestedQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.inputState.getOrderSide$feature_trade_crypto_externalDebug() == OrderSide.SELL && quoteBonus != null) {
                    uncollaredTotalCost = BigDecimals7.safeAdd(this.orderState.getDesiredCost$feature_trade_crypto_externalDebug(), (BigDecimal) RangesKt.coerceAtLeast(BigDecimals7.safeMultiply(this.orderState.getDesiredCost$feature_trade_crypto_externalDebug(), quoteBonus.getBonusRatio()), quoteBonus.getMinBonusAmount()));
                } else {
                    uncollaredTotalCost = this.orderState.getCryptoOrderContext().getOrderInfo().getUncollaredTotalCost();
                }
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.orderState.getQuotePriceCurrency(), uncollaredTotalCost, false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
        } else {
            if (i5 != 2 && i5 != 3 && i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = iArr[this.inputState.getInputMode$feature_trade_crypto_externalDebug().ordinal()];
            if (i7 == 1) {
                if (this.inputState.getOrderSide$feature_trade_crypto_externalDebug() == OrderSide.BUY && quoteBonus != null) {
                    assetRequestedQuantity = BigDecimals7.safeAdd(this.orderState.getAssetRequestedQuantity(), (BigDecimal) RangesKt.coerceAtLeast(BigDecimals7.safeMultiply(this.orderState.getAssetRequestedQuantity(), quoteBonus.getBonusRatio()), quoteBonus.getMinBonusAmount()));
                } else {
                    assetRequestedQuantity = this.orderState.getAssetRequestedQuantity();
                }
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.orderState.getAssetCostCurrency(), assetRequestedQuantity, false, false, null, 0, null, null, false, false, false, false, 2046, null));
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.inputState.getOrderSide$feature_trade_crypto_externalDebug() == OrderSide.SELL && quoteBonus != null) {
                    uncollaredTotalCost2 = BigDecimals7.safeAdd(this.orderState.getDesiredCost$feature_trade_crypto_externalDebug(), (BigDecimal) RangesKt.coerceAtLeast(BigDecimals7.safeMultiply(this.orderState.getDesiredCost$feature_trade_crypto_externalDebug(), quoteBonus.getBonusRatio()), quoteBonus.getMinBonusAmount()));
                } else {
                    uncollaredTotalCost2 = this.orderState.getCryptoOrderContext().getOrderInfo().getUncollaredTotalCost();
                }
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.orderState.getQuotePriceCurrency(), uncollaredTotalCost2, false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
        }
        StringResource stringResource = stringResourceInvoke2;
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        return new CryptoOrderReviewRowState(textContent2, new CryptoOrderReviewRowState.TextContent(stringResource, null, null, null, null, companion2.getBold(), false, 94, null), null, quoteBonus != null ? extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(StringResource.INSTANCE.invoke(C40095R.string.crypto_trade_bonus_order_review_bonus_percentage_included, FormatsLocalized.getPercentFormat().format(quoteBonus.getBonusRatio())), null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_FILLED_16), CryptoOrderReviewRowState.ColorOverride.DAY_PRIME), CryptoOrderReviewRowState.TapAction.ShowTradeBonusBottomSheet.INSTANCE, CryptoOrderReviewRowState.TextStyleOverride.TEXT_S_HIGHLIGHT_GRADIENT, companion2.getBold(), false, 66, null), textContent)) : null, null, m2862x5e15d005() != null, CryptoOrderReviewRowState.VerticalPadding.DEFAULT, false, null, null, 916, null);
    }

    /* renamed from: getAccountNameOrderReviewState$feature_trade_crypto_externalDebug */
    public final CryptoOrderReviewRowState m2862x5e15d005() {
        if (!this.isMibExperimentEnabled || this.account == null || !this.inputState.getIsReviewing()) {
            return null;
        }
        return new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(StringResource.INSTANCE.invoke(C40095R.string.crypto_order_detail_account_name_label, new Object[0]), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new CryptoOrderReviewRowState.TextContent(AccountDisplayNames.getDisplayNameWithoutNickname(this.account).getShort().getTitle(), null, null, null, null, FontWeight.INSTANCE.getBold(), false, 94, null), null, null, null, false, CryptoOrderReviewRowState.VerticalPadding.DEFAULT, false, null, null, 924, null);
    }

    public final ImmutableList<BottomSheetTypeDto> getBottomSheetTypeDtos() {
        CryptoOrderContext cryptoOrderContext;
        OrderState orderState = this.orderState;
        return extensions2.toImmutableList(CollectionsKt.listOfNotNull((orderState == null || (cryptoOrderContext = orderState.getCryptoOrderContext()) == null) ? null : CryptoOrderContexts.getSpreadBottomSheetTypeDto(cryptoOrderContext)));
    }

    public final boolean isSelectedAccountVisible() {
        return this.isMibExperimentEnabled && !this.inputState.getIsReviewing();
    }

    /* compiled from: CryptoOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010S\u001a\u00020TJ\u000e\u0010a\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bbJ\u000e\u0010c\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\bdJ\u000e\u0010e\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\bfJ\u000e\u0010g\u001a\u00020\tHÀ\u0003¢\u0006\u0002\bhJ\u000e\u0010i\u001a\u00020\u000bHÀ\u0003¢\u0006\u0002\bjJ\u0010\u0010k\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0002\blJ\u000e\u0010m\u001a\u00020\u000fHÀ\u0003¢\u0006\u0002\bnJ\u000b\u0010o\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010p\u001a\u00020\u0007HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010r\u001a\u00020\u0007HÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\u0017HÀ\u0003¢\u0006\u0002\btJ\t\u0010u\u001a\u00020\u0007HÂ\u0003J\t\u0010v\u001a\u00020\u0007HÂ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u001bHÀ\u0003¢\u0006\u0002\bxJ\u000e\u0010y\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\bzJ\u000e\u0010{\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b|J½\u0001\u0010}\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u0007HÆ\u0001J\u0013\u0010~\u001a\u00020\u00072\b\u0010\u007f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0080\u0001\u001a\u00030\u0081\u0001HÖ\u0001J\u000b\u0010\u0082\u0001\u001a\u00030\u0083\u0001HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010%R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u001c\u001a\u00020\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0016\u0010\u001d\u001a\u00020\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0011\u00108\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0011\u00109\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0011\u0010:\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0011\u0010;\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0011\u0010<\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0011\u0010=\u001a\u00020>¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010A\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0011\u0010B\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0013\u0010C\u001a\u0004\u0018\u00010>¢\u0006\b\n\u0000\u001a\u0004\bD\u0010@R\u0011\u0010E\u001a\u00020F¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010I\u001a\u0004\u0018\u00010J¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010M\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010U\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bV\u0010+R\u0013\u0010W\u001a\u0004\u0018\u00010X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0011\u0010[\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\\\u0010%R\u0013\u0010]\u001a\u0004\u0018\u00010^8F¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006\u0084\u0001"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$InputState;", "", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "hasSeenPdtWarning", "", "orderPrices", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "amount", "Ljava/math/BigDecimal;", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "isSellAllOrder", "tradeBonusEligibility", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "isReviewOrderButtonLoading", "reviewOrderEvent", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "hasSeenEuAdvancedOrdersTooltip", "isRhcApp", "cryptoOrderMonetizationModel", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "isTaxLotsEnabled", "hasSeenTaxLotOrderTooltipPref", "<init>", "(Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;ZLcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;Lcom/robinhood/models/db/OrderTimeInForce;Ljava/math/BigDecimal;Lcom/robinhood/android/lib/trade/DefaultOrderState;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;ZLcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;ZLcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;ZZLcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;ZZ)V", "getOrderSide$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/db/OrderSide;", "getInputMode$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getHasSeenPdtWarning$feature_trade_crypto_externalDebug", "()Z", "getOrderPrices$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "getTimeInForce$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getAmount$feature_trade_crypto_externalDebug", "()Ljava/math/BigDecimal;", "getFormState$feature_trade_crypto_externalDebug", "()Lcom/robinhood/android/lib/trade/DefaultOrderState;", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getTradeBonusEligibility", "()Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "getReviewOrderEvent$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "getCryptoOrderMonetizationModel$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "isTaxLotsEnabled$feature_trade_crypto_externalDebug", "getHasSeenTaxLotOrderTooltipPref$feature_trade_crypto_externalDebug", "isReviewing", "isToolbarVisible", "isCryptoAmountEdtEnabled", "isCryptoAmountLabelEnabled", "isCryptoReviewVisible", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "isEditMainPriceBtnVisible", "isPriceLabelClickEnabled", "cryptoSellAllButtonText", "getCryptoSellAllButtonText", "requestInput", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "getRequestInput", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "inputCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "getInputCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "tooltipData", "Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData;", "getTooltipData", "()Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData;", "cryptoAmountLabelText", "", "context", "Landroid/content/Context;", "cryptoAmountEdtHint", "getCryptoAmountEdtHint", "amountRowCryptoOrderReviewRowState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "getAmountRowCryptoOrderReviewRowState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "allowDecimalInput", "getAllowDecimalInput", "currencySymbolPosition", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "getCurrencySymbolPosition", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "component1", "component1$feature_trade_crypto_externalDebug", "component2", "component2$feature_trade_crypto_externalDebug", "component3", "component3$feature_trade_crypto_externalDebug", "component4", "component4$feature_trade_crypto_externalDebug", "component5", "component5$feature_trade_crypto_externalDebug", "component6", "component6$feature_trade_crypto_externalDebug", "component7", "component7$feature_trade_crypto_externalDebug", "component8", "component9", "component10", "component11", "component12", "component12$feature_trade_crypto_externalDebug", "component13", "component14", "component15", "component15$feature_trade_crypto_externalDebug", "component16", "component16$feature_trade_crypto_externalDebug", "component17", "component17$feature_trade_crypto_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InputState {
        public static final int $stable = 8;
        private final BigDecimal amount;
        private final BigDecimal cryptoAmountEdtHint;
        private final CryptoOrderMonetizationModel cryptoOrderMonetizationModel;
        private final StringResource cryptoSellAllButtonText;
        private final DefaultOrderState formState;
        private final boolean hasSeenEuAdvancedOrdersTooltip;
        private final boolean hasSeenPdtWarning;
        private final boolean hasSeenTaxLotOrderTooltipPref;
        private final Currency inputCurrency;
        private final CryptoInputMode inputMode;
        private final boolean isCryptoAmountEdtEnabled;
        private final boolean isCryptoAmountLabelEnabled;
        private final boolean isCryptoReviewVisible;
        private final boolean isEditMainPriceBtnVisible;
        private final boolean isPriceLabelClickEnabled;
        private final boolean isReviewOrderButtonLoading;
        private final boolean isReviewing;
        private final boolean isRhcApp;
        private final boolean isSellAllOrder;
        private final boolean isTaxLotsEnabled;
        private final boolean isToolbarVisible;
        private final CryptoOrderPrices orderPrices;
        private final OrderSide orderSide;
        private final RequestInputs requestInput;
        private final CryptoOrderUiEvent reviewOrderEvent;
        private final OrderTimeInForce timeInForce;
        private final StringResource toolbarTitle;
        private final UiCryptoTradeBonusEligibility tradeBonusEligibility;
        private final UiCurrencyPair uiCurrencyPair;

        /* compiled from: CryptoOrderViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[CryptoOrderType.values().length];
                try {
                    iArr[CryptoOrderType.LIMIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoOrderType.MARKET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[CryptoInputMode.values().length];
                try {
                    iArr2[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[OrderSide.values().length];
                try {
                    iArr3[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        /* renamed from: component13, reason: from getter */
        private final boolean getHasSeenEuAdvancedOrdersTooltip() {
            return this.hasSeenEuAdvancedOrdersTooltip;
        }

        /* renamed from: component14, reason: from getter */
        private final boolean getIsRhcApp() {
            return this.isRhcApp;
        }

        public static /* synthetic */ InputState copy$default(InputState inputState, OrderSide orderSide, CryptoInputMode cryptoInputMode, boolean z, CryptoOrderPrices cryptoOrderPrices, OrderTimeInForce orderTimeInForce, BigDecimal bigDecimal, DefaultOrderState defaultOrderState, UiCurrencyPair uiCurrencyPair, boolean z2, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, boolean z3, CryptoOrderUiEvent cryptoOrderUiEvent, boolean z4, boolean z5, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, boolean z6, boolean z7, int i, Object obj) {
            boolean z8;
            boolean z9;
            OrderSide orderSide2;
            InputState inputState2;
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel2;
            CryptoInputMode cryptoInputMode2;
            boolean z10;
            CryptoOrderPrices cryptoOrderPrices2;
            OrderTimeInForce orderTimeInForce2;
            BigDecimal bigDecimal2;
            DefaultOrderState defaultOrderState2;
            UiCurrencyPair uiCurrencyPair2;
            boolean z11;
            UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility2;
            boolean z12;
            CryptoOrderUiEvent cryptoOrderUiEvent2;
            boolean z13;
            boolean z14;
            OrderSide orderSide3 = (i & 1) != 0 ? inputState.orderSide : orderSide;
            CryptoInputMode cryptoInputMode3 = (i & 2) != 0 ? inputState.inputMode : cryptoInputMode;
            boolean z15 = (i & 4) != 0 ? inputState.hasSeenPdtWarning : z;
            CryptoOrderPrices cryptoOrderPrices3 = (i & 8) != 0 ? inputState.orderPrices : cryptoOrderPrices;
            OrderTimeInForce orderTimeInForce3 = (i & 16) != 0 ? inputState.timeInForce : orderTimeInForce;
            BigDecimal bigDecimal3 = (i & 32) != 0 ? inputState.amount : bigDecimal;
            DefaultOrderState defaultOrderState3 = (i & 64) != 0 ? inputState.formState : defaultOrderState;
            UiCurrencyPair uiCurrencyPair3 = (i & 128) != 0 ? inputState.uiCurrencyPair : uiCurrencyPair;
            boolean z16 = (i & 256) != 0 ? inputState.isSellAllOrder : z2;
            UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility3 = (i & 512) != 0 ? inputState.tradeBonusEligibility : uiCryptoTradeBonusEligibility;
            boolean z17 = (i & 1024) != 0 ? inputState.isReviewOrderButtonLoading : z3;
            CryptoOrderUiEvent cryptoOrderUiEvent3 = (i & 2048) != 0 ? inputState.reviewOrderEvent : cryptoOrderUiEvent;
            boolean z18 = (i & 4096) != 0 ? inputState.hasSeenEuAdvancedOrdersTooltip : z4;
            boolean z19 = (i & 8192) != 0 ? inputState.isRhcApp : z5;
            OrderSide orderSide4 = orderSide3;
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel3 = (i & 16384) != 0 ? inputState.cryptoOrderMonetizationModel : cryptoOrderMonetizationModel;
            boolean z20 = (i & 32768) != 0 ? inputState.isTaxLotsEnabled : z6;
            if ((i & 65536) != 0) {
                z9 = z20;
                z8 = inputState.hasSeenTaxLotOrderTooltipPref;
                cryptoOrderMonetizationModel2 = cryptoOrderMonetizationModel3;
                cryptoInputMode2 = cryptoInputMode3;
                z10 = z15;
                cryptoOrderPrices2 = cryptoOrderPrices3;
                orderTimeInForce2 = orderTimeInForce3;
                bigDecimal2 = bigDecimal3;
                defaultOrderState2 = defaultOrderState3;
                uiCurrencyPair2 = uiCurrencyPair3;
                z11 = z16;
                uiCryptoTradeBonusEligibility2 = uiCryptoTradeBonusEligibility3;
                z12 = z17;
                cryptoOrderUiEvent2 = cryptoOrderUiEvent3;
                z13 = z18;
                z14 = z19;
                orderSide2 = orderSide4;
                inputState2 = inputState;
            } else {
                z8 = z7;
                z9 = z20;
                orderSide2 = orderSide4;
                inputState2 = inputState;
                cryptoOrderMonetizationModel2 = cryptoOrderMonetizationModel3;
                cryptoInputMode2 = cryptoInputMode3;
                z10 = z15;
                cryptoOrderPrices2 = cryptoOrderPrices3;
                orderTimeInForce2 = orderTimeInForce3;
                bigDecimal2 = bigDecimal3;
                defaultOrderState2 = defaultOrderState3;
                uiCurrencyPair2 = uiCurrencyPair3;
                z11 = z16;
                uiCryptoTradeBonusEligibility2 = uiCryptoTradeBonusEligibility3;
                z12 = z17;
                cryptoOrderUiEvent2 = cryptoOrderUiEvent3;
                z13 = z18;
                z14 = z19;
            }
            return inputState2.copy(orderSide2, cryptoInputMode2, z10, cryptoOrderPrices2, orderTimeInForce2, bigDecimal2, defaultOrderState2, uiCurrencyPair2, z11, uiCryptoTradeBonusEligibility2, z12, cryptoOrderUiEvent2, z13, z14, cryptoOrderMonetizationModel2, z9, z8);
        }

        /* renamed from: component1$feature_trade_crypto_externalDebug, reason: from getter */
        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        /* renamed from: component10, reason: from getter */
        public final UiCryptoTradeBonusEligibility getTradeBonusEligibility() {
            return this.tradeBonusEligibility;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsReviewOrderButtonLoading() {
            return this.isReviewOrderButtonLoading;
        }

        /* renamed from: component12$feature_trade_crypto_externalDebug, reason: from getter */
        public final CryptoOrderUiEvent getReviewOrderEvent() {
            return this.reviewOrderEvent;
        }

        /* renamed from: component15$feature_trade_crypto_externalDebug, reason: from getter */
        public final CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
            return this.cryptoOrderMonetizationModel;
        }

        /* renamed from: component16$feature_trade_crypto_externalDebug, reason: from getter */
        public final boolean getIsTaxLotsEnabled() {
            return this.isTaxLotsEnabled;
        }

        /* renamed from: component17$feature_trade_crypto_externalDebug, reason: from getter */
        public final boolean getHasSeenTaxLotOrderTooltipPref() {
            return this.hasSeenTaxLotOrderTooltipPref;
        }

        /* renamed from: component2$feature_trade_crypto_externalDebug, reason: from getter */
        public final CryptoInputMode getInputMode() {
            return this.inputMode;
        }

        /* renamed from: component3$feature_trade_crypto_externalDebug, reason: from getter */
        public final boolean getHasSeenPdtWarning() {
            return this.hasSeenPdtWarning;
        }

        /* renamed from: component4$feature_trade_crypto_externalDebug, reason: from getter */
        public final CryptoOrderPrices getOrderPrices() {
            return this.orderPrices;
        }

        /* renamed from: component5$feature_trade_crypto_externalDebug, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component6$feature_trade_crypto_externalDebug, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component7$feature_trade_crypto_externalDebug, reason: from getter */
        public final DefaultOrderState getFormState() {
            return this.formState;
        }

        /* renamed from: component8, reason: from getter */
        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsSellAllOrder() {
            return this.isSellAllOrder;
        }

        public final InputState copy(OrderSide orderSide, CryptoInputMode inputMode, boolean hasSeenPdtWarning, CryptoOrderPrices orderPrices, OrderTimeInForce timeInForce, BigDecimal amount, DefaultOrderState formState, UiCurrencyPair uiCurrencyPair, boolean isSellAllOrder, UiCryptoTradeBonusEligibility tradeBonusEligibility, boolean isReviewOrderButtonLoading, CryptoOrderUiEvent reviewOrderEvent, boolean hasSeenEuAdvancedOrdersTooltip, boolean isRhcApp, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, boolean isTaxLotsEnabled, boolean hasSeenTaxLotOrderTooltipPref) {
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(inputMode, "inputMode");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(formState, "formState");
            return new InputState(orderSide, inputMode, hasSeenPdtWarning, orderPrices, timeInForce, amount, formState, uiCurrencyPair, isSellAllOrder, tradeBonusEligibility, isReviewOrderButtonLoading, reviewOrderEvent, hasSeenEuAdvancedOrdersTooltip, isRhcApp, cryptoOrderMonetizationModel, isTaxLotsEnabled, hasSeenTaxLotOrderTooltipPref);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputState)) {
                return false;
            }
            InputState inputState = (InputState) other;
            return this.orderSide == inputState.orderSide && this.inputMode == inputState.inputMode && this.hasSeenPdtWarning == inputState.hasSeenPdtWarning && Intrinsics.areEqual(this.orderPrices, inputState.orderPrices) && this.timeInForce == inputState.timeInForce && Intrinsics.areEqual(this.amount, inputState.amount) && this.formState == inputState.formState && Intrinsics.areEqual(this.uiCurrencyPair, inputState.uiCurrencyPair) && this.isSellAllOrder == inputState.isSellAllOrder && Intrinsics.areEqual(this.tradeBonusEligibility, inputState.tradeBonusEligibility) && this.isReviewOrderButtonLoading == inputState.isReviewOrderButtonLoading && Intrinsics.areEqual(this.reviewOrderEvent, inputState.reviewOrderEvent) && this.hasSeenEuAdvancedOrdersTooltip == inputState.hasSeenEuAdvancedOrdersTooltip && this.isRhcApp == inputState.isRhcApp && Intrinsics.areEqual(this.cryptoOrderMonetizationModel, inputState.cryptoOrderMonetizationModel) && this.isTaxLotsEnabled == inputState.isTaxLotsEnabled && this.hasSeenTaxLotOrderTooltipPref == inputState.hasSeenTaxLotOrderTooltipPref;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.orderSide.hashCode() * 31) + this.inputMode.hashCode()) * 31) + Boolean.hashCode(this.hasSeenPdtWarning)) * 31) + this.orderPrices.hashCode()) * 31) + this.timeInForce.hashCode()) * 31;
            BigDecimal bigDecimal = this.amount;
            int iHashCode2 = (((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.formState.hashCode()) * 31;
            UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
            int iHashCode3 = (((iHashCode2 + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31) + Boolean.hashCode(this.isSellAllOrder)) * 31;
            UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility = this.tradeBonusEligibility;
            int iHashCode4 = (((iHashCode3 + (uiCryptoTradeBonusEligibility == null ? 0 : uiCryptoTradeBonusEligibility.hashCode())) * 31) + Boolean.hashCode(this.isReviewOrderButtonLoading)) * 31;
            CryptoOrderUiEvent cryptoOrderUiEvent = this.reviewOrderEvent;
            int iHashCode5 = (((((iHashCode4 + (cryptoOrderUiEvent == null ? 0 : cryptoOrderUiEvent.hashCode())) * 31) + Boolean.hashCode(this.hasSeenEuAdvancedOrdersTooltip)) * 31) + Boolean.hashCode(this.isRhcApp)) * 31;
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.cryptoOrderMonetizationModel;
            return ((((iHashCode5 + (cryptoOrderMonetizationModel != null ? cryptoOrderMonetizationModel.hashCode() : 0)) * 31) + Boolean.hashCode(this.isTaxLotsEnabled)) * 31) + Boolean.hashCode(this.hasSeenTaxLotOrderTooltipPref);
        }

        public String toString() {
            return "InputState(orderSide=" + this.orderSide + ", inputMode=" + this.inputMode + ", hasSeenPdtWarning=" + this.hasSeenPdtWarning + ", orderPrices=" + this.orderPrices + ", timeInForce=" + this.timeInForce + ", amount=" + this.amount + ", formState=" + this.formState + ", uiCurrencyPair=" + this.uiCurrencyPair + ", isSellAllOrder=" + this.isSellAllOrder + ", tradeBonusEligibility=" + this.tradeBonusEligibility + ", isReviewOrderButtonLoading=" + this.isReviewOrderButtonLoading + ", reviewOrderEvent=" + this.reviewOrderEvent + ", hasSeenEuAdvancedOrdersTooltip=" + this.hasSeenEuAdvancedOrdersTooltip + ", isRhcApp=" + this.isRhcApp + ", cryptoOrderMonetizationModel=" + this.cryptoOrderMonetizationModel + ", isTaxLotsEnabled=" + this.isTaxLotsEnabled + ", hasSeenTaxLotOrderTooltipPref=" + this.hasSeenTaxLotOrderTooltipPref + ")";
        }

        public InputState(OrderSide orderSide, CryptoInputMode inputMode, boolean z, CryptoOrderPrices orderPrices, OrderTimeInForce timeInForce, BigDecimal bigDecimal, DefaultOrderState formState, UiCurrencyPair uiCurrencyPair, boolean z2, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, boolean z3, CryptoOrderUiEvent cryptoOrderUiEvent, boolean z4, boolean z5, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, boolean z6, boolean z7) {
            boolean z8;
            StringResource stringResourceInvoke;
            boolean z9;
            int i;
            RequestInputs asQuote;
            int i2;
            BigDecimal bigDecimal2;
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(inputMode, "inputMode");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(formState, "formState");
            this.orderSide = orderSide;
            this.inputMode = inputMode;
            this.hasSeenPdtWarning = z;
            this.orderPrices = orderPrices;
            this.timeInForce = timeInForce;
            this.amount = bigDecimal;
            this.formState = formState;
            this.uiCurrencyPair = uiCurrencyPair;
            this.isSellAllOrder = z2;
            this.tradeBonusEligibility = uiCryptoTradeBonusEligibility;
            this.isReviewOrderButtonLoading = z3;
            this.reviewOrderEvent = cryptoOrderUiEvent;
            this.hasSeenEuAdvancedOrdersTooltip = z4;
            this.isRhcApp = z5;
            this.cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
            this.isTaxLotsEnabled = z6;
            this.hasSeenTaxLotOrderTooltipPref = z7;
            boolean isReviewingState = formState.getIsReviewingState();
            this.isReviewing = isReviewingState;
            this.isToolbarVisible = !isReviewingState;
            this.isCryptoAmountEdtEnabled = !isReviewingState;
            this.isCryptoAmountLabelEnabled = !isReviewingState;
            this.isCryptoReviewVisible = isReviewingState;
            CryptoOrderType orderType = orderPrices.getOrderType();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i3 = iArr[orderType.ordinal()];
            if (i3 == 1) {
                z8 = false;
                stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.order_type_limit, new Object[0]);
            } else if (i3 == 2) {
                z8 = false;
                stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.order_type_market_order, new Object[0]);
            } else if (i3 == 3) {
                z8 = false;
                stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.order_type_stop_loss, new Object[0]);
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z8 = false;
                stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.order_type_stop_limit, new Object[0]);
            }
            this.toolbarTitle = stringResourceInvoke;
            if (isReviewingState) {
                z9 = z8;
            } else {
                int i4 = iArr[orderPrices.getOrderType().ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3 && i4 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    z9 = z8;
                }
                z9 = true;
            }
            this.isEditMainPriceBtnVisible = z9;
            int i5 = iArr[orderPrices.getOrderType().ordinal()];
            if (i5 != 1) {
                if (i5 != 2 && i5 != 3 && i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z8 = true;
            }
            this.isPriceLabelClickEnabled = z8;
            Currency quoteCurrencyForCost = null;
            this.cryptoSellAllButtonText = uiCurrencyPair != null ? StringResource.INSTANCE.invoke(C40095R.string.order_sell_all, uiCurrencyPair.getDisplaySymbol()) : null;
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$1;
            int i6 = iArr2[inputMode.ordinal()];
            if (i6 == 1) {
                i = 1;
                BigDecimal bigDecimal3 = bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
                Intrinsics.checkNotNull(bigDecimal3);
                asQuote = new RequestInputs.AsQuote(bigDecimal3, cryptoOrderMonetizationModel, orderPrices, orderSide, timeInForce, z, uiCryptoTradeBonusEligibility, cryptoOrderUiEvent);
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (bigDecimal == null) {
                    bigDecimal2 = BigDecimal.ZERO;
                    i2 = 1;
                } else {
                    i2 = 1;
                    bigDecimal2 = bigDecimal;
                }
                Intrinsics.checkNotNull(bigDecimal2);
                i = i2;
                asQuote = new RequestInputs.AsAsset(bigDecimal2, cryptoOrderMonetizationModel, orderPrices, orderSide, timeInForce, z, uiCryptoTradeBonusEligibility, cryptoOrderUiEvent, z2, null, 512, null);
            }
            this.requestInput = asQuote;
            int i7 = iArr2[inputMode.ordinal()];
            if (i7 != i) {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (uiCurrencyPair != null) {
                    quoteCurrencyForCost = uiCurrencyPair.getAssetCurrencyForCost();
                }
            } else if (uiCurrencyPair != null) {
                quoteCurrencyForCost = uiCurrencyPair.getQuoteCurrencyForCost();
            }
            this.inputCurrency = quoteCurrencyForCost;
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            this.cryptoAmountEdtHint = ZERO;
        }

        public final OrderSide getOrderSide$feature_trade_crypto_externalDebug() {
            return this.orderSide;
        }

        public final CryptoInputMode getInputMode$feature_trade_crypto_externalDebug() {
            return this.inputMode;
        }

        public final boolean getHasSeenPdtWarning$feature_trade_crypto_externalDebug() {
            return this.hasSeenPdtWarning;
        }

        public /* synthetic */ InputState(OrderSide orderSide, CryptoInputMode cryptoInputMode, boolean z, CryptoOrderPrices cryptoOrderPrices, OrderTimeInForce orderTimeInForce, BigDecimal bigDecimal, DefaultOrderState defaultOrderState, UiCurrencyPair uiCurrencyPair, boolean z2, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, boolean z3, CryptoOrderUiEvent cryptoOrderUiEvent, boolean z4, boolean z5, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(orderSide, cryptoInputMode, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CryptoOrderPrices.Market.INSTANCE : cryptoOrderPrices, orderTimeInForce, (i & 32) != 0 ? null : bigDecimal, (i & 64) != 0 ? DefaultOrderState.EDITING : defaultOrderState, (i & 128) != 0 ? null : uiCurrencyPair, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : uiCryptoTradeBonusEligibility, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? null : cryptoOrderUiEvent, z4, z5, (i & 16384) != 0 ? null : cryptoOrderMonetizationModel, (i & 32768) != 0 ? false : z6, z7);
        }

        public final CryptoOrderPrices getOrderPrices$feature_trade_crypto_externalDebug() {
            return this.orderPrices;
        }

        public final OrderTimeInForce getTimeInForce$feature_trade_crypto_externalDebug() {
            return this.timeInForce;
        }

        public final BigDecimal getAmount$feature_trade_crypto_externalDebug() {
            return this.amount;
        }

        public final DefaultOrderState getFormState$feature_trade_crypto_externalDebug() {
            return this.formState;
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        public final boolean isSellAllOrder() {
            return this.isSellAllOrder;
        }

        public final UiCryptoTradeBonusEligibility getTradeBonusEligibility() {
            return this.tradeBonusEligibility;
        }

        public final boolean isReviewOrderButtonLoading() {
            return this.isReviewOrderButtonLoading;
        }

        public final CryptoOrderUiEvent getReviewOrderEvent$feature_trade_crypto_externalDebug() {
            return this.reviewOrderEvent;
        }

        /* renamed from: getCryptoOrderMonetizationModel$feature_trade_crypto_externalDebug */
        public final CryptoOrderMonetizationModel m2865x5cfb4369() {
            return this.cryptoOrderMonetizationModel;
        }

        public final boolean isTaxLotsEnabled$feature_trade_crypto_externalDebug() {
            return this.isTaxLotsEnabled;
        }

        /* renamed from: getHasSeenTaxLotOrderTooltipPref$feature_trade_crypto_externalDebug */
        public final boolean m2866x8d8f77f5() {
            return this.hasSeenTaxLotOrderTooltipPref;
        }

        /* renamed from: isReviewing, reason: from getter */
        public final boolean getIsReviewing() {
            return this.isReviewing;
        }

        /* renamed from: isToolbarVisible, reason: from getter */
        public final boolean getIsToolbarVisible() {
            return this.isToolbarVisible;
        }

        /* renamed from: isCryptoAmountEdtEnabled, reason: from getter */
        public final boolean getIsCryptoAmountEdtEnabled() {
            return this.isCryptoAmountEdtEnabled;
        }

        /* renamed from: isCryptoAmountLabelEnabled, reason: from getter */
        public final boolean getIsCryptoAmountLabelEnabled() {
            return this.isCryptoAmountLabelEnabled;
        }

        /* renamed from: isCryptoReviewVisible, reason: from getter */
        public final boolean getIsCryptoReviewVisible() {
            return this.isCryptoReviewVisible;
        }

        public final StringResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        /* renamed from: isEditMainPriceBtnVisible, reason: from getter */
        public final boolean getIsEditMainPriceBtnVisible() {
            return this.isEditMainPriceBtnVisible;
        }

        /* renamed from: isPriceLabelClickEnabled, reason: from getter */
        public final boolean getIsPriceLabelClickEnabled() {
            return this.isPriceLabelClickEnabled;
        }

        public final StringResource getCryptoSellAllButtonText() {
            return this.cryptoSellAllButtonText;
        }

        public final RequestInputs getRequestInput() {
            return this.requestInput;
        }

        public final Currency getInputCurrency() {
            return this.inputCurrency;
        }

        public final CryptoOrderTooltipData getTooltipData() {
            if (this.isRhcApp && !this.hasSeenEuAdvancedOrdersTooltip && this.isToolbarVisible) {
                return new CryptoOrderTooltipData(StringResource.INSTANCE.invoke(C40095R.string.crypto_order_eu_advanced_orders_tooltip, new Object[0]), CryptoOrderTooltipData.Type.EU_ADVANCED_ORDERS);
            }
            if (this.orderSide == OrderSide.SELL && this.isTaxLotsEnabled && !this.hasSeenTaxLotOrderTooltipPref) {
                return new CryptoOrderTooltipData(StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_order_tooltip_text, new Object[0]), CryptoOrderTooltipData.Type.TAX_LOT_ORDERS);
            }
            return null;
        }

        public final CharSequence cryptoAmountLabelText(Context context) {
            String code;
            Intrinsics.checkNotNullParameter(context, "context");
            Currency currency = this.inputCurrency;
            if (currency == null || (code = currency.getCode()) == null) {
                return null;
            }
            String string2 = context.getString(C40095R.string.crypto_order_create_amount_label, code);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            if (this.isReviewing) {
                return string2;
            }
            int length = code.length();
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string2, code, 0, false, 6, (Object) null);
            int i = length + iIndexOf$default;
            SpannableString spannableString = new SpannableString(string2);
            spannableString.setSpan(new TextAppearanceSpan(context, ContextsUiExtensions.requireThemeAttribute(context, C20690R.attr.textAppearanceRegularMediumBold)), iIndexOf$default, i, 33);
            spannableString.setSpan(new UnderlineSpan(), iIndexOf$default, i, 33);
            return spannableString;
        }

        public final BigDecimal getCryptoAmountEdtHint() {
            return this.cryptoAmountEdtHint;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CryptoOrderReviewRowState getAmountRowCryptoOrderReviewRowState() {
            UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility;
            UiCryptoTradeBonusEligibility.TradeBonus quoteBonus;
            UiCryptoTradeBonusEligibility.TradeBonus tradeBonus;
            StringResource stringResourceInvoke;
            UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility2;
            CryptoOrderReviewRowState.TextContent textContent = null;
            if (this.orderPrices.getOrderType() == CryptoOrderType.MARKET) {
                quoteBonus = (this.orderSide == OrderSide.BUY && this.inputMode == CryptoInputMode.ASSET_CURRENCY && (uiCryptoTradeBonusEligibility2 = this.tradeBonusEligibility) != null) ? uiCryptoTradeBonusEligibility2.getAssetBonus() : null;
            } else {
                OrderSide orderSide = this.orderSide;
                if (orderSide == OrderSide.BUY && this.inputMode == CryptoInputMode.ASSET_CURRENCY) {
                    UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility3 = this.tradeBonusEligibility;
                    if (uiCryptoTradeBonusEligibility3 != null) {
                        quoteBonus = uiCryptoTradeBonusEligibility3.getAssetBonus();
                    }
                } else if (orderSide == OrderSide.SELL && this.inputMode == CryptoInputMode.QUOTE_CURRENCY && (uiCryptoTradeBonusEligibility = this.tradeBonusEligibility) != null) {
                    quoteBonus = uiCryptoTradeBonusEligibility.getQuoteBonus();
                }
            }
            Currency currency = this.inputCurrency;
            if (!this.isReviewing || quoteBonus == null || currency == null) {
                return null;
            }
            BigDecimal bigDecimal = (BigDecimal) RangesKt.coerceAtLeast(BigDecimals7.safeMultiply(BigDecimals7.orZero(this.amount), quoteBonus.getBonusRatio()), quoteBonus.getMinBonusAmount());
            BigDecimal bigDecimalSafeAdd = BigDecimals7.safeAdd(BigDecimals7.orZero(this.amount), bigDecimal);
            if (WhenMappings.$EnumSwitchMapping$2[this.orderSide.ordinal()] == 1) {
                tradeBonus = quoteBonus;
                textContent = new CryptoOrderReviewRowState.TextContent(StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(currency, bigDecimal, false, false, null, 0, null, null, false, false, false, false, 2044, null)), CryptoOrderReviewRowState.ColorOverride.DAY_PRIME, null, null, null, FontWeight.INSTANCE.getBold(), false, 92, null);
            } else {
                tradeBonus = quoteBonus;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[this.inputMode.ordinal()];
            if (i == 1) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_total_label, currency.getCode());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_total_amount_label, currency.getCode());
            }
            CryptoOrderReviewRowState.TextContent textContent2 = new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke2 = companion.invoke(CurrencyDefinitions.formatCurrency$default(currency, BigDecimals7.orZero(bigDecimalSafeAdd), this.inputMode == CryptoInputMode.QUOTE_CURRENCY, false, null, 0, null, null, false, false, false, false, 2044, null));
            FontWeight.Companion companion2 = FontWeight.INSTANCE;
            return new CryptoOrderReviewRowState(textContent2, new CryptoOrderReviewRowState.TextContent(stringResourceInvoke2, null, null, null, null, companion2.getBold(), false, 94, null), null, extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion.invoke(C40095R.string.crypto_trade_bonus_order_review_bonus_percentage_included, FormatsLocalized.getPercentFormat().format(tradeBonus.getBonusRatio())), null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_FILLED_16), CryptoOrderReviewRowState.ColorOverride.DAY_PRIME), CryptoOrderReviewRowState.TapAction.ShowTradeBonusBottomSheet.INSTANCE, CryptoOrderReviewRowState.TextStyleOverride.TEXT_S_HIGHLIGHT_GRADIENT, companion2.getBold(), false, 66, null), textContent)), null, false, CryptoOrderReviewRowState.VerticalPadding.DEFAULT, false, null, null, 916, null);
        }

        public final boolean getAllowDecimalInput() {
            UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
            if (uiCurrencyPair != null) {
                return UiCurrencyPairs2.allowDecimalInput(uiCurrencyPair, this.inputMode);
            }
            return true;
        }

        public final CurrencyFormatModel.CurrencySymbolPosition getCurrencySymbolPosition() {
            Currency quoteCurrencyForPriceInput;
            if (this.uiCurrencyPair == null) {
                return null;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[this.inputMode.ordinal()];
            if (i == 1) {
                quoteCurrencyForPriceInput = this.uiCurrencyPair.getQuoteCurrencyForPriceInput();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                quoteCurrencyForPriceInput = null;
            }
            if (quoteCurrencyForPriceInput != null) {
                return CurrencyDefinitions.getCurrencySymbolPosition(quoteCurrencyForPriceInput);
            }
            return null;
        }
    }

    /* compiled from: CryptoOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\tHÂ\u0003J3\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010D\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020IHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\"X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0014\u0010)\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001eR\u0014\u0010+\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010$R\u0016\u0010-\u001a\u0004\u0018\u00010\"X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0014\u0010/\u001a\u00020\"X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0014\u00101\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010$R\u0014\u00103\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010$R\u0011\u00105\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b5\u0010\u0010R\u0014\u00106\u001a\u0002078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010<\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006J"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$OrderState;", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "inputState", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$InputState;", "isRhcApp", "", "_cryptoOrderReviewMessageAndDisclosuresState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "<init>", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$InputState;ZLcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;)V", "getCryptoOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getInputState", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$InputState;", "()Z", "assetCostCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "getAssetCostCurrency$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/db/Currency;", "quotePriceCurrency", "getQuotePriceCurrency$feature_trade_crypto_externalDebug", "request", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;", "getRequest$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;", "bidPrice", "Lcom/robinhood/models/util/Money;", "getBidPrice$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/util/Money;", "askPrice", "getAskPrice$feature_trade_crypto_externalDebug", "uncollaredPrice", "Ljava/math/BigDecimal;", "getUncollaredPrice$feature_trade_crypto_externalDebug", "()Ljava/math/BigDecimal;", "buySpread", "getBuySpread$feature_trade_crypto_externalDebug", "buySpreadFraction", "getBuySpreadFraction$feature_trade_crypto_externalDebug", "sellSpread", "getSellSpread$feature_trade_crypto_externalDebug", "sellSpreadFraction", "getSellSpreadFraction$feature_trade_crypto_externalDebug", "rebate", "getRebate$feature_trade_crypto_externalDebug", "assetRequestedQuantity", "getAssetRequestedQuantity$feature_trade_crypto_externalDebug", "amountHoldInAssetCurrency", "getAmountHoldInAssetCurrency$feature_trade_crypto_externalDebug", "desiredCost", "getDesiredCost$feature_trade_crypto_externalDebug", "isReviewOrderButtonEnabled", "cryptoPriceLabel", "Lcom/robinhood/utils/resource/StringResource;", "getCryptoPriceLabel$feature_trade_crypto_externalDebug", "()Lcom/robinhood/utils/resource/StringResource;", "cryptoPriceText", "getCryptoPriceText$feature_trade_crypto_externalDebug", "cryptoOrderReviewMessageAndDisclosuresState", "getCryptoOrderReviewMessageAndDisclosuresState$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderState {
        public static final int $stable = 8;
        private final CryptoOrderReviewMessageAndDisclosuresState _cryptoOrderReviewMessageAndDisclosuresState;
        private final Money askPrice;
        private final Currency assetCostCurrency;
        private final BigDecimal assetRequestedQuantity;
        private final Money bidPrice;
        private final CryptoOrderContext cryptoOrderContext;
        private final InputState inputState;
        private final boolean isRhcApp;
        private final Currency quotePriceCurrency;
        private final BigDecimal rebate;
        private final CryptoOrderContext.RequestData request;
        private final BigDecimal uncollaredPrice;

        /* compiled from: CryptoOrderViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[OrderSide.values().length];
                try {
                    iArr[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[CryptoOrderType.values().length];
                try {
                    iArr2[CryptoOrderType.LIMIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[CryptoOrderType.MARKET.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* renamed from: component4, reason: from getter */
        private final CryptoOrderReviewMessageAndDisclosuresState get_cryptoOrderReviewMessageAndDisclosuresState() {
            return this._cryptoOrderReviewMessageAndDisclosuresState;
        }

        public static /* synthetic */ OrderState copy$default(OrderState orderState, CryptoOrderContext cryptoOrderContext, InputState inputState, boolean z, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderContext = orderState.cryptoOrderContext;
            }
            if ((i & 2) != 0) {
                inputState = orderState.inputState;
            }
            if ((i & 4) != 0) {
                z = orderState.isRhcApp;
            }
            if ((i & 8) != 0) {
                cryptoOrderReviewMessageAndDisclosuresState = orderState._cryptoOrderReviewMessageAndDisclosuresState;
            }
            return orderState.copy(cryptoOrderContext, inputState, z, cryptoOrderReviewMessageAndDisclosuresState);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        /* renamed from: component2, reason: from getter */
        public final InputState getInputState() {
            return this.inputState;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRhcApp() {
            return this.isRhcApp;
        }

        public final OrderState copy(CryptoOrderContext cryptoOrderContext, InputState inputState, boolean isRhcApp, CryptoOrderReviewMessageAndDisclosuresState _cryptoOrderReviewMessageAndDisclosuresState) {
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            Intrinsics.checkNotNullParameter(inputState, "inputState");
            return new OrderState(cryptoOrderContext, inputState, isRhcApp, _cryptoOrderReviewMessageAndDisclosuresState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderState)) {
                return false;
            }
            OrderState orderState = (OrderState) other;
            return Intrinsics.areEqual(this.cryptoOrderContext, orderState.cryptoOrderContext) && Intrinsics.areEqual(this.inputState, orderState.inputState) && this.isRhcApp == orderState.isRhcApp && Intrinsics.areEqual(this._cryptoOrderReviewMessageAndDisclosuresState, orderState._cryptoOrderReviewMessageAndDisclosuresState);
        }

        public int hashCode() {
            int iHashCode = ((((this.cryptoOrderContext.hashCode() * 31) + this.inputState.hashCode()) * 31) + Boolean.hashCode(this.isRhcApp)) * 31;
            CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = this._cryptoOrderReviewMessageAndDisclosuresState;
            return iHashCode + (cryptoOrderReviewMessageAndDisclosuresState == null ? 0 : cryptoOrderReviewMessageAndDisclosuresState.hashCode());
        }

        public String toString() {
            return "OrderState(cryptoOrderContext=" + this.cryptoOrderContext + ", inputState=" + this.inputState + ", isRhcApp=" + this.isRhcApp + ", _cryptoOrderReviewMessageAndDisclosuresState=" + this._cryptoOrderReviewMessageAndDisclosuresState + ")";
        }

        public OrderState(CryptoOrderContext cryptoOrderContext, InputState inputState, boolean z, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState) {
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            Intrinsics.checkNotNullParameter(inputState, "inputState");
            this.cryptoOrderContext = cryptoOrderContext;
            this.inputState = inputState;
            this.isRhcApp = z;
            this._cryptoOrderReviewMessageAndDisclosuresState = cryptoOrderReviewMessageAndDisclosuresState;
            this.assetCostCurrency = cryptoOrderContext.getRequestContext().getCurrencyPair().getAssetCurrencyForCost();
            this.quotePriceCurrency = cryptoOrderContext.getRequestContext().getCurrencyPair().getQuoteCurrencyForPriceInput();
            this.request = cryptoOrderContext.getRequest();
            this.bidPrice = cryptoOrderContext.getRequestContext().getQuote().getBidPrice();
            this.askPrice = cryptoOrderContext.getRequestContext().getQuote().getAskPrice();
            this.uncollaredPrice = cryptoOrderContext.getOrderInfo().getUncollaredPrice();
            this.rebate = cryptoOrderContext.getRequestContext().getCurrencyPair().getRebate();
            this.assetRequestedQuantity = cryptoOrderContext.getOrderInfo().getDisplayQuantity();
        }

        public /* synthetic */ OrderState(CryptoOrderContext cryptoOrderContext, InputState inputState, boolean z, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cryptoOrderContext, inputState, z, (i & 8) != 0 ? null : cryptoOrderReviewMessageAndDisclosuresState);
        }

        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        public final InputState getInputState() {
            return this.inputState;
        }

        public final boolean isRhcApp() {
            return this.isRhcApp;
        }

        /* renamed from: getAssetCostCurrency$feature_trade_crypto_externalDebug, reason: from getter */
        public final Currency getAssetCostCurrency() {
            return this.assetCostCurrency;
        }

        /* renamed from: getQuotePriceCurrency$feature_trade_crypto_externalDebug, reason: from getter */
        public final Currency getQuotePriceCurrency() {
            return this.quotePriceCurrency;
        }

        /* renamed from: getRequest$feature_trade_crypto_externalDebug, reason: from getter */
        public final CryptoOrderContext.RequestData getRequest() {
            return this.request;
        }

        /* renamed from: getBidPrice$feature_trade_crypto_externalDebug, reason: from getter */
        public final Money getBidPrice() {
            return this.bidPrice;
        }

        /* renamed from: getAskPrice$feature_trade_crypto_externalDebug, reason: from getter */
        public final Money getAskPrice() {
            return this.askPrice;
        }

        /* renamed from: getUncollaredPrice$feature_trade_crypto_externalDebug, reason: from getter */
        public final BigDecimal getUncollaredPrice() {
            return this.uncollaredPrice;
        }

        public final Money getBuySpread$feature_trade_crypto_externalDebug() {
            return this.askPrice.times(getBuySpreadFraction$feature_trade_crypto_externalDebug()).times(this.request.getOrderQuantity());
        }

        public final BigDecimal getBuySpreadFraction$feature_trade_crypto_externalDebug() {
            return this.cryptoOrderContext.getRequestContext().getQuote().getBuySpreadFraction();
        }

        public final Money getSellSpread$feature_trade_crypto_externalDebug() {
            return this.bidPrice.times(getSellSpreadFraction$feature_trade_crypto_externalDebug()).times(this.request.getOrderQuantity());
        }

        public final BigDecimal getSellSpreadFraction$feature_trade_crypto_externalDebug() {
            return this.cryptoOrderContext.getRequestContext().getQuote().getSellSpreadFraction();
        }

        /* renamed from: getRebate$feature_trade_crypto_externalDebug, reason: from getter */
        public final BigDecimal getRebate() {
            return this.rebate;
        }

        /* renamed from: getAssetRequestedQuantity$feature_trade_crypto_externalDebug, reason: from getter */
        public final BigDecimal getAssetRequestedQuantity() {
            return this.assetRequestedQuantity;
        }

        public final BigDecimal getAmountHoldInAssetCurrency$feature_trade_crypto_externalDebug() {
            UiCryptoHolding holding = this.cryptoOrderContext.getRequestContext().getHolding();
            return BigDecimals7.orZero(holding != null ? holding.getQuantityAvailable() : null);
        }

        public final BigDecimal getDesiredCost$feature_trade_crypto_externalDebug() {
            BigDecimal bigDecimalMultiply = this.uncollaredPrice.multiply(this.assetRequestedQuantity);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return bigDecimalMultiply;
        }

        public final boolean isReviewOrderButtonEnabled() {
            return this.cryptoOrderContext.isReviewable();
        }

        public final StringResource getCryptoPriceLabel$feature_trade_crypto_externalDebug() {
            int i = WhenMappings.$EnumSwitchMapping$1[this.inputState.getOrderPrices$feature_trade_crypto_externalDebug().getOrderType().ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_limit_price_label, new Object[0]);
            }
            if (i != 2) {
                if (i == 3) {
                    return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_stop_price_label, new Object[0]);
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_limit_price_label, new Object[0]);
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.inputState.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
            if (i2 == 1) {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_price_label_with_symbol_ask, this.assetCostCurrency.getCode());
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_price_label_with_symbol_bid, this.assetCostCurrency.getCode());
        }

        public final StringResource getCryptoPriceText$feature_trade_crypto_externalDebug() {
            int i = WhenMappings.$EnumSwitchMapping$1[this.inputState.getOrderPrices$feature_trade_crypto_externalDebug().getOrderType().ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.quotePriceCurrency, this.uncollaredPrice, false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
            if (i == 2) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.inputState.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
                if (i2 == 1) {
                    return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.quotePriceCurrency, this.askPrice.getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.quotePriceCurrency, this.bidPrice.getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.quotePriceCurrency, this.uncollaredPrice, false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.inputState.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
            if (i3 == 1) {
                return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.quotePriceCurrency, (BigDecimal) RangesKt.coerceAtLeast(this.uncollaredPrice, this.askPrice.getDecimalValue()), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.quotePriceCurrency, (BigDecimal) RangesKt.coerceAtMost(this.uncollaredPrice, this.bidPrice.getDecimalValue()), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }

        /* renamed from: getCryptoOrderReviewMessageAndDisclosuresState$feature_trade_crypto_externalDebug */
        public final CryptoOrderReviewMessageAndDisclosuresState m2867xc5d7f028() {
            CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = this._cryptoOrderReviewMessageAndDisclosuresState;
            return cryptoOrderReviewMessageAndDisclosuresState == null ? CryptoOrderReviewMessageAndDisclosuresState.INSTANCE.getLoading() : cryptoOrderReviewMessageAndDisclosuresState;
        }
    }
}
