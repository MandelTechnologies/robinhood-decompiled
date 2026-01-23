package com.robinhood.shared.trade.crypto.p397ui.taxLots.orderForm;

import androidx.compose.p011ui.text.font.FontWeight;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.Quote;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.format.CryptoTimeInForceFormatter;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.fee.FeeCryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.extensions.TermTypeDtos2;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.views.orderForm.CryptoOrderReviewComposableState;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.SelectedTaxLotDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamSelectedTaxLotsResponseDto;
import p479j$.time.Instant;

/* compiled from: CryptoTaxLotOrderFormDataState.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010'\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÀ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u00100\u001a\u00020\u0010HÀ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00103\u001a\u0004\u0018\u00010\u0012HÀ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00105\u001a\u00020\u0010HÀ\u0003¢\u0006\u0004\b4\u0010/J\u0012\u00108\u001a\u0004\u0018\u00010\u0015HÀ\u0003¢\u0006\u0004\b6\u00107J\u008a\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020\u00102\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bK\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bO\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\bQ\u0010,R\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010T\u001a\u0004\bU\u00102R\u001a\u0010\u0014\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010R\u001a\u0004\bV\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010W\u001a\u0004\bX\u00107R\u0014\u0010\\\u001a\u00020Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[R\u001c\u0010b\u001a\u0004\u0018\u00010Y8@X\u0081\u0004¢\u0006\f\u0012\u0004\b`\u0010a\u001a\u0004\b_\u0010[R\u0016\u0010d\u001a\u0004\u0018\u00010Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010[R\u001a\u0010g\u001a\u00020Y8@X\u0081\u0004¢\u0006\f\u0012\u0004\bf\u0010a\u001a\u0004\be\u0010[R\u001c\u0010j\u001a\u0004\u0018\u00010Y8@X\u0081\u0004¢\u0006\f\u0012\u0004\bi\u0010a\u001a\u0004\bh\u0010[R\u0011\u0010n\u001a\u00020k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDataState;", "", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "bottomSheetService", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "requestInputs", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "cryptoOrderContext", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "powerInfoAlert", "j$/time/Instant", "currentTime", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;", "selectedTaxLotsResponseDto", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "uiCryptoOrder", "", "isSubmitting", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "reviewMessageAndDisclosuresState", "isMibExperimentEnabled", "Lcom/robinhood/models/db/Account;", "account", "<init>", "(Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/models/ui/ServerDrivenAlert;Lj$/time/Instant;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;Lcom/robinhood/models/crypto/ui/UiCryptoOrder;ZLcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;ZLcom/robinhood/models/db/Account;)V", "component1$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "component1", "component2$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "component2", "component3$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "component3", "component4$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "component4", "component5$feature_trade_crypto_externalDebug", "()Lj$/time/Instant;", "component5", "component6$feature_trade_crypto_externalDebug", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;", "component6", "component7$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "component7", "component8$feature_trade_crypto_externalDebug", "()Z", "component8", "component9$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "component9", "component10$feature_trade_crypto_externalDebug", "component10", "component11$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/db/Account;", "component11", "copy", "(Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/models/ui/ServerDrivenAlert;Lj$/time/Instant;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;Lcom/robinhood/models/crypto/ui/UiCryptoOrder;ZLcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;ZLcom/robinhood/models/db/Account;)Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "getBottomSheetService$feature_trade_crypto_externalDebug", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "getRequestInputs$feature_trade_crypto_externalDebug", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getCryptoOrderContext$feature_trade_crypto_externalDebug", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "getPowerInfoAlert$feature_trade_crypto_externalDebug", "Lj$/time/Instant;", "getCurrentTime$feature_trade_crypto_externalDebug", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;", "getSelectedTaxLotsResponseDto$feature_trade_crypto_externalDebug", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "getUiCryptoOrder$feature_trade_crypto_externalDebug", "Z", "isSubmitting$feature_trade_crypto_externalDebug", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "getReviewMessageAndDisclosuresState$feature_trade_crypto_externalDebug", "isMibExperimentEnabled$feature_trade_crypto_externalDebug", "Lcom/robinhood/models/db/Account;", "getAccount$feature_trade_crypto_externalDebug", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "getAssetAmountCryptoOrderReviewRowState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "assetAmountCryptoOrderReviewRowState", "getOrderPriceCryptoOrderReviewRowState", "orderPriceCryptoOrderReviewRowState", "getSpreadCryptoOrderReviewRowState$feature_trade_crypto_externalDebug", "getSpreadCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations", "()V", "spreadCryptoOrderReviewRowState", "getFeeCryptoOrderReviewRowState", "feeCryptoOrderReviewRowState", "getEstimatedCreditCryptoOrderReviewRowState$feature_trade_crypto_externalDebug", "getEstimatedCreditCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations", "estimatedCreditCryptoOrderReviewRowState", "getAccountNameOrderReviewState$feature_trade_crypto_externalDebug", "getAccountNameOrderReviewState$feature_trade_crypto_externalDebug$annotations", "accountNameOrderReviewState", "Lcom/robinhood/shared/trade/crypto/views/orderForm/CryptoOrderReviewComposableState;", "getReviewComposableState", "()Lcom/robinhood/shared/trade/crypto/views/orderForm/CryptoOrderReviewComposableState;", "reviewComposableState", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class CryptoTaxLotOrderFormDataState {
    public static final int $stable = 8;
    private final Account account;
    private final CryptoTradingBottomSheetService bottomSheetService;
    private final CryptoOrderContext cryptoOrderContext;
    private final Instant currentTime;
    private final boolean isMibExperimentEnabled;
    private final boolean isSubmitting;
    private final ServerDrivenAlert powerInfoAlert;
    private final RequestInputs.AsAsset requestInputs;
    private final CryptoOrderReviewMessageAndDisclosuresState reviewMessageAndDisclosuresState;
    private final StreamSelectedTaxLotsResponseDto selectedTaxLotsResponseDto;
    private final UiCryptoOrder uiCryptoOrder;

    /* compiled from: CryptoTaxLotOrderFormDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MonetizationModel.values().length];
            try {
                iArr[MonetizationModel.FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonetizationModel.REBATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ CryptoTaxLotOrderFormDataState copy$default(CryptoTaxLotOrderFormDataState cryptoTaxLotOrderFormDataState, CryptoTradingBottomSheetService cryptoTradingBottomSheetService, RequestInputs.AsAsset asAsset, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert serverDrivenAlert, Instant instant, StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto, UiCryptoOrder uiCryptoOrder, boolean z, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, boolean z2, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoTradingBottomSheetService = cryptoTaxLotOrderFormDataState.bottomSheetService;
        }
        if ((i & 2) != 0) {
            asAsset = cryptoTaxLotOrderFormDataState.requestInputs;
        }
        if ((i & 4) != 0) {
            cryptoOrderContext = cryptoTaxLotOrderFormDataState.cryptoOrderContext;
        }
        if ((i & 8) != 0) {
            serverDrivenAlert = cryptoTaxLotOrderFormDataState.powerInfoAlert;
        }
        if ((i & 16) != 0) {
            instant = cryptoTaxLotOrderFormDataState.currentTime;
        }
        if ((i & 32) != 0) {
            streamSelectedTaxLotsResponseDto = cryptoTaxLotOrderFormDataState.selectedTaxLotsResponseDto;
        }
        if ((i & 64) != 0) {
            uiCryptoOrder = cryptoTaxLotOrderFormDataState.uiCryptoOrder;
        }
        if ((i & 128) != 0) {
            z = cryptoTaxLotOrderFormDataState.isSubmitting;
        }
        if ((i & 256) != 0) {
            cryptoOrderReviewMessageAndDisclosuresState = cryptoTaxLotOrderFormDataState.reviewMessageAndDisclosuresState;
        }
        if ((i & 512) != 0) {
            z2 = cryptoTaxLotOrderFormDataState.isMibExperimentEnabled;
        }
        if ((i & 1024) != 0) {
            account = cryptoTaxLotOrderFormDataState.account;
        }
        boolean z3 = z2;
        Account account2 = account;
        boolean z4 = z;
        CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState2 = cryptoOrderReviewMessageAndDisclosuresState;
        StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto2 = streamSelectedTaxLotsResponseDto;
        UiCryptoOrder uiCryptoOrder2 = uiCryptoOrder;
        Instant instant2 = instant;
        CryptoOrderContext cryptoOrderContext2 = cryptoOrderContext;
        return cryptoTaxLotOrderFormDataState.copy(cryptoTradingBottomSheetService, asAsset, cryptoOrderContext2, serverDrivenAlert, instant2, streamSelectedTaxLotsResponseDto2, uiCryptoOrder2, z4, cryptoOrderReviewMessageAndDisclosuresState2, z3, account2);
    }

    /* renamed from: getAccountNameOrderReviewState$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2912xe015ad05() {
    }

    /* renamed from: getEstimatedCreditCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2913xb2f37cd5() {
    }

    /* renamed from: getSpreadCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2914xa3798b1f() {
    }

    /* renamed from: component1$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoTradingBottomSheetService getBottomSheetService() {
        return this.bottomSheetService;
    }

    /* renamed from: component10$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getIsMibExperimentEnabled() {
        return this.isMibExperimentEnabled;
    }

    /* renamed from: component11$feature_trade_crypto_externalDebug, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2$feature_trade_crypto_externalDebug, reason: from getter */
    public final RequestInputs.AsAsset getRequestInputs() {
        return this.requestInputs;
    }

    /* renamed from: component3$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    /* renamed from: component4$feature_trade_crypto_externalDebug, reason: from getter */
    public final ServerDrivenAlert getPowerInfoAlert() {
        return this.powerInfoAlert;
    }

    /* renamed from: component5$feature_trade_crypto_externalDebug, reason: from getter */
    public final Instant getCurrentTime() {
        return this.currentTime;
    }

    /* renamed from: component6$feature_trade_crypto_externalDebug, reason: from getter */
    public final StreamSelectedTaxLotsResponseDto getSelectedTaxLotsResponseDto() {
        return this.selectedTaxLotsResponseDto;
    }

    /* renamed from: component7$feature_trade_crypto_externalDebug, reason: from getter */
    public final UiCryptoOrder getUiCryptoOrder() {
        return this.uiCryptoOrder;
    }

    /* renamed from: component8$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getIsSubmitting() {
        return this.isSubmitting;
    }

    /* renamed from: component9$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoOrderReviewMessageAndDisclosuresState getReviewMessageAndDisclosuresState() {
        return this.reviewMessageAndDisclosuresState;
    }

    public final CryptoTaxLotOrderFormDataState copy(CryptoTradingBottomSheetService bottomSheetService, RequestInputs.AsAsset requestInputs, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert powerInfoAlert, Instant currentTime, StreamSelectedTaxLotsResponseDto selectedTaxLotsResponseDto, UiCryptoOrder uiCryptoOrder, boolean isSubmitting, CryptoOrderReviewMessageAndDisclosuresState reviewMessageAndDisclosuresState, boolean isMibExperimentEnabled, Account account) {
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return new CryptoTaxLotOrderFormDataState(bottomSheetService, requestInputs, cryptoOrderContext, powerInfoAlert, currentTime, selectedTaxLotsResponseDto, uiCryptoOrder, isSubmitting, reviewMessageAndDisclosuresState, isMibExperimentEnabled, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTaxLotOrderFormDataState)) {
            return false;
        }
        CryptoTaxLotOrderFormDataState cryptoTaxLotOrderFormDataState = (CryptoTaxLotOrderFormDataState) other;
        return Intrinsics.areEqual(this.bottomSheetService, cryptoTaxLotOrderFormDataState.bottomSheetService) && Intrinsics.areEqual(this.requestInputs, cryptoTaxLotOrderFormDataState.requestInputs) && Intrinsics.areEqual(this.cryptoOrderContext, cryptoTaxLotOrderFormDataState.cryptoOrderContext) && Intrinsics.areEqual(this.powerInfoAlert, cryptoTaxLotOrderFormDataState.powerInfoAlert) && Intrinsics.areEqual(this.currentTime, cryptoTaxLotOrderFormDataState.currentTime) && Intrinsics.areEqual(this.selectedTaxLotsResponseDto, cryptoTaxLotOrderFormDataState.selectedTaxLotsResponseDto) && Intrinsics.areEqual(this.uiCryptoOrder, cryptoTaxLotOrderFormDataState.uiCryptoOrder) && this.isSubmitting == cryptoTaxLotOrderFormDataState.isSubmitting && Intrinsics.areEqual(this.reviewMessageAndDisclosuresState, cryptoTaxLotOrderFormDataState.reviewMessageAndDisclosuresState) && this.isMibExperimentEnabled == cryptoTaxLotOrderFormDataState.isMibExperimentEnabled && Intrinsics.areEqual(this.account, cryptoTaxLotOrderFormDataState.account);
    }

    public int hashCode() {
        int iHashCode = ((this.bottomSheetService.hashCode() * 31) + this.requestInputs.hashCode()) * 31;
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        int iHashCode2 = (iHashCode + (cryptoOrderContext == null ? 0 : cryptoOrderContext.hashCode())) * 31;
        ServerDrivenAlert serverDrivenAlert = this.powerInfoAlert;
        int iHashCode3 = (((iHashCode2 + (serverDrivenAlert == null ? 0 : serverDrivenAlert.hashCode())) * 31) + this.currentTime.hashCode()) * 31;
        StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto = this.selectedTaxLotsResponseDto;
        int iHashCode4 = (iHashCode3 + (streamSelectedTaxLotsResponseDto == null ? 0 : streamSelectedTaxLotsResponseDto.hashCode())) * 31;
        UiCryptoOrder uiCryptoOrder = this.uiCryptoOrder;
        int iHashCode5 = (((iHashCode4 + (uiCryptoOrder == null ? 0 : uiCryptoOrder.hashCode())) * 31) + Boolean.hashCode(this.isSubmitting)) * 31;
        CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = this.reviewMessageAndDisclosuresState;
        int iHashCode6 = (((iHashCode5 + (cryptoOrderReviewMessageAndDisclosuresState == null ? 0 : cryptoOrderReviewMessageAndDisclosuresState.hashCode())) * 31) + Boolean.hashCode(this.isMibExperimentEnabled)) * 31;
        Account account = this.account;
        return iHashCode6 + (account != null ? account.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTaxLotOrderFormDataState(bottomSheetService=" + this.bottomSheetService + ", requestInputs=" + this.requestInputs + ", cryptoOrderContext=" + this.cryptoOrderContext + ", powerInfoAlert=" + this.powerInfoAlert + ", currentTime=" + this.currentTime + ", selectedTaxLotsResponseDto=" + this.selectedTaxLotsResponseDto + ", uiCryptoOrder=" + this.uiCryptoOrder + ", isSubmitting=" + this.isSubmitting + ", reviewMessageAndDisclosuresState=" + this.reviewMessageAndDisclosuresState + ", isMibExperimentEnabled=" + this.isMibExperimentEnabled + ", account=" + this.account + ")";
    }

    public CryptoTaxLotOrderFormDataState(CryptoTradingBottomSheetService bottomSheetService, RequestInputs.AsAsset requestInputs, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert serverDrivenAlert, Instant currentTime, StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto, UiCryptoOrder uiCryptoOrder, boolean z, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, boolean z2, Account account) {
        BottomSheetTypeDto spreadBottomSheetTypeDto;
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        this.bottomSheetService = bottomSheetService;
        this.requestInputs = requestInputs;
        this.cryptoOrderContext = cryptoOrderContext;
        this.powerInfoAlert = serverDrivenAlert;
        this.currentTime = currentTime;
        this.selectedTaxLotsResponseDto = streamSelectedTaxLotsResponseDto;
        this.uiCryptoOrder = uiCryptoOrder;
        this.isSubmitting = z;
        this.reviewMessageAndDisclosuresState = cryptoOrderReviewMessageAndDisclosuresState;
        this.isMibExperimentEnabled = z2;
        this.account = account;
        if (cryptoOrderContext != null) {
            try {
                spreadBottomSheetTypeDto = CryptoOrderContexts.getSpreadBottomSheetTypeDto(cryptoOrderContext);
            } catch (Exception unused) {
                return;
            }
        } else {
            spreadBottomSheetTypeDto = null;
        }
        bottomSheetService.emitBottomSheetData(extensions2.toPersistentList(CollectionsKt.listOfNotNull(spreadBottomSheetTypeDto)));
    }

    public /* synthetic */ CryptoTaxLotOrderFormDataState(CryptoTradingBottomSheetService cryptoTradingBottomSheetService, RequestInputs.AsAsset asAsset, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert serverDrivenAlert, Instant instant, StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto, UiCryptoOrder uiCryptoOrder, boolean z, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, boolean z2, Account account, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoTradingBottomSheetService, asAsset, (i & 4) != 0 ? null : cryptoOrderContext, (i & 8) != 0 ? null : serverDrivenAlert, instant, (i & 32) != 0 ? null : streamSelectedTaxLotsResponseDto, (i & 64) != 0 ? null : uiCryptoOrder, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : cryptoOrderReviewMessageAndDisclosuresState, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : account);
    }

    public final CryptoTradingBottomSheetService getBottomSheetService$feature_trade_crypto_externalDebug() {
        return this.bottomSheetService;
    }

    public final RequestInputs.AsAsset getRequestInputs$feature_trade_crypto_externalDebug() {
        return this.requestInputs;
    }

    public final CryptoOrderContext getCryptoOrderContext$feature_trade_crypto_externalDebug() {
        return this.cryptoOrderContext;
    }

    public final ServerDrivenAlert getPowerInfoAlert$feature_trade_crypto_externalDebug() {
        return this.powerInfoAlert;
    }

    public final Instant getCurrentTime$feature_trade_crypto_externalDebug() {
        return this.currentTime;
    }

    public final StreamSelectedTaxLotsResponseDto getSelectedTaxLotsResponseDto$feature_trade_crypto_externalDebug() {
        return this.selectedTaxLotsResponseDto;
    }

    public final UiCryptoOrder getUiCryptoOrder$feature_trade_crypto_externalDebug() {
        return this.uiCryptoOrder;
    }

    public final boolean isSubmitting$feature_trade_crypto_externalDebug() {
        return this.isSubmitting;
    }

    /* renamed from: getReviewMessageAndDisclosuresState$feature_trade_crypto_externalDebug */
    public final CryptoOrderReviewMessageAndDisclosuresState m2917x20a43249() {
        return this.reviewMessageAndDisclosuresState;
    }

    public final boolean isMibExperimentEnabled$feature_trade_crypto_externalDebug() {
        return this.isMibExperimentEnabled;
    }

    public final Account getAccount$feature_trade_crypto_externalDebug() {
        return this.account;
    }

    public final CryptoOrderReviewComposableState getReviewComposableState() {
        CryptoOrderContext.RequestContext requestContext;
        UiCurrencyPair currencyPair;
        Currency assetCurrency;
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new CryptoOrderReviewRowState[]{getAssetAmountCryptoOrderReviewRowState(), getOrderPriceCryptoOrderReviewRowState(), m2918x1e92851f(), getFeeCryptoOrderReviewRowState(), m2916x91d0d7d5(), m2915x5e15d005()});
        OrderSide side = this.requestInputs.getSide();
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        String code = (cryptoOrderContext == null || (requestContext = cryptoOrderContext.getRequestContext()) == null || (currencyPair = requestContext.getCurrencyPair()) == null || (assetCurrency = currencyPair.getAssetCurrency()) == null) ? null : assetCurrency.getCode();
        CryptoOrderContext cryptoOrderContext2 = this.cryptoOrderContext;
        CryptoOrderHeaderState cryptoOrderHeaderComposable7 = new CryptoOrderHeaderState(side, code, cryptoOrderContext2 != null ? CryptoOrderContexts.getCryptoPowerText(cryptoOrderContext2) : null, this.powerInfoAlert, false, 16, null);
        ImmutableList3 persistentList = extensions2.toPersistentList(listListOfNotNull);
        CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = this.reviewMessageAndDisclosuresState;
        if (cryptoOrderReviewMessageAndDisclosuresState == null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            cryptoOrderReviewMessageAndDisclosuresState = new CryptoOrderReviewMessageAndDisclosuresState(null, companion.invoke(""), new CryptoOrderReviewMessageAndDisclosuresState.DisclosuresContent(companion.invoke(C38572R.string.crypto_general_label_disclosures, new Object[0]), companion.invoke(C40095R.string.crypto_order_create_summary_disclosures_url, new Object[0])), true, 1, null);
        }
        return new CryptoOrderReviewComposableState(cryptoOrderHeaderComposable7, persistentList, cryptoOrderReviewMessageAndDisclosuresState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CryptoOrderReviewRowState getAssetAmountCryptoOrderReviewRowState() {
        StringResource stringResourceInvoke;
        ImmutableList3 immutableList3;
        StringResource stringResourceInvoke2;
        CryptoOrderContext.RequestContext requestContext;
        UiCurrencyPair currencyPair;
        Currency assetCurrency;
        String currency$default;
        ImmutableList3 immutableList3PersistentListOf;
        CryptoOrderContext.RequestContext requestContext2;
        UiCurrencyPair currencyPair2;
        Currency quoteCurrency;
        StringResource stringResourceInvoke3;
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        boolean z = cryptoOrderContext == null;
        if (cryptoOrderContext == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_reviewing_asset_amount_primary_text, cryptoOrderContext.getRequestContext().getCurrencyPair().getAssetCurrency().getCode())) == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke("------------");
        }
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, null, null, null, null, z, 62, null);
        StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto = this.selectedTaxLotsResponseDto;
        if (streamSelectedTaxLotsResponseDto != null) {
            CryptoOrderContext cryptoOrderContext2 = this.cryptoOrderContext;
            if (cryptoOrderContext2 == null || (requestContext2 = cryptoOrderContext2.getRequestContext()) == null || (currencyPair2 = requestContext2.getCurrencyPair()) == null || (quoteCurrency = currencyPair2.getQuoteCurrency()) == null) {
                immutableList3PersistentListOf = null;
            } else {
                StreamSelectedTaxLotsResponseDto.GainLossContentDto estimated_gain_loss_content = streamSelectedTaxLotsResponseDto.getEstimated_gain_loss_content();
                StreamSelectedTaxLotsResponseDto.GainLossContentDto.TypeDto type2 = estimated_gain_loss_content != null ? estimated_gain_loss_content.getType() : null;
                if (type2 == null) {
                    List<SelectedTaxLotDto> selected_tax_lots = streamSelectedTaxLotsResponseDto.getSelected_tax_lots();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_tax_lots, 10));
                    Iterator<T> it = selected_tax_lots.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((SelectedTaxLotDto) it.next()).getTerm_type());
                    }
                    stringResourceInvoke3 = TermTypeDtos2.getLotTermsLabel(arrayList);
                } else if (type2 instanceof StreamSelectedTaxLotsResponseDto.GainLossContentDto.TypeDto.EstimatedGainContent) {
                    StringResource.Companion companion = StringResource.INSTANCE;
                    int i = C40095R.string.crypto_tax_lot_reviewing_lot_terms_label_gain_loss_amount;
                    List<SelectedTaxLotDto> selected_tax_lots2 = streamSelectedTaxLotsResponseDto.getSelected_tax_lots();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_tax_lots2, 10));
                    Iterator<T> it2 = selected_tax_lots2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((SelectedTaxLotDto) it2.next()).getTerm_type());
                    }
                    stringResourceInvoke3 = companion.invoke(i, TermTypeDtos2.getLotTermsLabel(arrayList2), StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_reviewing_est_gain_prefix, CurrencyDefinitions.formatCurrency$default(quoteCurrency, ((StreamSelectedTaxLotsResponseDto.GainLossContentDto.TypeDto.EstimatedGainContent) type2).getValue().getEstimated_gain_quote_amount().toBigDecimalOrThrow(), false, false, null, 0, null, Boolean.TRUE, true, false, false, false, 1854, null)));
                } else {
                    if (!(type2 instanceof StreamSelectedTaxLotsResponseDto.GainLossContentDto.TypeDto.EstimatedLossContent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StringResource.Companion companion2 = StringResource.INSTANCE;
                    int i2 = C40095R.string.crypto_tax_lot_reviewing_lot_terms_label_gain_loss_amount;
                    List<SelectedTaxLotDto> selected_tax_lots3 = streamSelectedTaxLotsResponseDto.getSelected_tax_lots();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_tax_lots3, 10));
                    Iterator<T> it3 = selected_tax_lots3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((SelectedTaxLotDto) it3.next()).getTerm_type());
                    }
                    StringResource lotTermsLabel = TermTypeDtos2.getLotTermsLabel(arrayList3);
                    StringResource.Companion companion3 = StringResource.INSTANCE;
                    int i3 = C40095R.string.crypto_tax_lot_reviewing_est_loss_prefix;
                    BigDecimal bigDecimalNegate = ((StreamSelectedTaxLotsResponseDto.GainLossContentDto.TypeDto.EstimatedLossContent) type2).getValue().getEstimated_loss_quote_amount().toBigDecimalOrThrow().negate();
                    Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
                    stringResourceInvoke3 = companion2.invoke(i2, lotTermsLabel, companion3.invoke(i3, CurrencyDefinitions.formatCurrency$default(quoteCurrency, bigDecimalNegate, false, false, null, 0, null, Boolean.TRUE, false, true, false, false, 1726, null)));
                }
                immutableList3PersistentListOf = extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(stringResourceInvoke3, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, 2, 0 == true ? 1 : 0));
            }
            immutableList3 = immutableList3PersistentListOf;
        } else {
            immutableList3 = null;
        }
        CryptoOrderContext cryptoOrderContext3 = this.cryptoOrderContext;
        boolean z2 = cryptoOrderContext3 == null;
        if (cryptoOrderContext3 == null || (requestContext = cryptoOrderContext3.getRequestContext()) == null || (currencyPair = requestContext.getCurrencyPair()) == null || (assetCurrency = currencyPair.getAssetCurrency()) == null || (currency$default = CurrencyDefinitions.formatCurrency$default(assetCurrency, this.requestInputs.getPurchaseSize(), false, false, null, 0, null, null, false, false, false, false, 2044, null)) == null || (stringResourceInvoke2 = StringResource.INSTANCE.invoke(currency$default)) == null) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke("-------");
        }
        return new CryptoOrderReviewRowState(textContent, new CryptoOrderReviewRowState.TextContent(stringResourceInvoke2, null, null, null, null, FontWeight.INSTANCE.getBold(), z2, 30, null), null, immutableList3, null, false, null, false, null, null, 1012, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final CryptoOrderReviewRowState getOrderPriceCryptoOrderReviewRowState() {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        StringResource stringResourceInvoke3;
        CryptoOrderReviewRowState.SecondaryTextRow secondaryTextRow;
        CryptoOrderContext.RequestContext requestContext;
        CryptoOrderReviewRowState.SecondaryTextRow secondaryTextRow2;
        StringResource stringResourceInvoke4;
        CryptoOrderContext.RequestContext requestContext2;
        StringResource stringResourceInvoke5;
        CryptoOrderContext.RequestContext requestContext3;
        CryptoOrderContext.RequestContext requestContext4;
        BigDecimal stopPrice;
        boolean z = (this.requestInputs.getOrderPrices() instanceof CryptoOrderPrices.Market) && this.cryptoOrderContext == null;
        CryptoOrderPrices orderPrices = this.requestInputs.getOrderPrices();
        if (orderPrices instanceof CryptoOrderPrices.Market) {
            CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
            if (cryptoOrderContext == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_reviewing_asset_price_primary_text, cryptoOrderContext.getRequestContext().getCurrencyPair().getAssetCurrency().getCode())) == null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke("------------");
            }
        } else if (orderPrices instanceof CryptoOrderPrices.Limit) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_reviewing_limit_price_primary_text, new Object[0]);
        } else if (orderPrices instanceof CryptoOrderPrices.StopLimit) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_reviewing_limit_price_primary_text, new Object[0]);
        } else {
            if (!(orderPrices instanceof CryptoOrderPrices.StopLoss)) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_reviewing_stop_price_primary_text, new Object[0]);
        }
        CryptoOrderReviewRowState.SecondaryTextRow secondaryTextRow3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, this.requestInputs.getOrderPrices() instanceof CryptoOrderPrices.Market ? new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderReviewRowState.ColorOverride.FG_2) : null, this.requestInputs.getOrderPrices() instanceof CryptoOrderPrices.Market ? CryptoOrderReviewRowState.TapAction.ShowMarketPriceBottomSheet.INSTANCE : null, null, null, z, 50, null);
        CryptoOrderContext cryptoOrderContext2 = this.cryptoOrderContext;
        boolean z2 = cryptoOrderContext2 == null;
        if (cryptoOrderContext2 == null || (requestContext4 = cryptoOrderContext2.getRequestContext()) == null) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke("-------");
        } else {
            StringResource.Companion companion = StringResource.INSTANCE;
            Currency quoteCurrencyForPriceInput = requestContext4.getCurrencyPair().getQuoteCurrencyForPriceInput();
            CryptoOrderPrices orderPrices2 = this.requestInputs.getOrderPrices();
            if (orderPrices2 instanceof CryptoOrderPrices.Market) {
                stopPrice = requestContext4.getQuote().getBidPrice().getDecimalValue();
            } else if (orderPrices2 instanceof CryptoOrderPrices.Limit) {
                stopPrice = ((CryptoOrderPrices.Limit) orderPrices2).getLimitPrice();
            } else if (orderPrices2 instanceof CryptoOrderPrices.StopLimit) {
                stopPrice = ((CryptoOrderPrices.StopLimit) orderPrices2).getLimitPrice();
            } else {
                if (!(orderPrices2 instanceof CryptoOrderPrices.StopLoss)) {
                    throw new NoWhenBranchMatchedException();
                }
                stopPrice = ((CryptoOrderPrices.StopLoss) orderPrices2).getStopPrice();
            }
            stringResourceInvoke2 = companion.invoke(CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, stopPrice, false, false, null, 0, null, null, false, false, false, false, 2046, null));
            if (stringResourceInvoke2 == null) {
            }
        }
        CryptoOrderReviewRowState.TextContent textContent2 = new CryptoOrderReviewRowState.TextContent(stringResourceInvoke2, null, null, null, null, FontWeight.INSTANCE.getBold(), z2, 30, null);
        int i = 2;
        if (this.requestInputs.getOrderPrices() instanceof CryptoOrderPrices.Market) {
            secondaryTextRow = null;
        } else {
            CryptoOrderContext cryptoOrderContext3 = this.cryptoOrderContext;
            boolean z3 = cryptoOrderContext3 == null;
            if (cryptoOrderContext3 == null || (requestContext = cryptoOrderContext3.getRequestContext()) == null || (stringResourceInvoke3 = StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_reviewing_bid_label, CurrencyDefinitions.formatCurrency$default(requestContext.getCurrencyPair().getQuoteCurrencyForPriceInput(), requestContext.getQuote().getBidPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null))) == null) {
                stringResourceInvoke3 = StringResource.INSTANCE.invoke("-------");
            }
            secondaryTextRow = new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(stringResourceInvoke3, null, null, null, null, null, z3, 62, null), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        }
        if (this.requestInputs.getOrderPrices() instanceof CryptoOrderPrices.StopLimit) {
            CryptoOrderContext cryptoOrderContext4 = this.cryptoOrderContext;
            boolean z4 = cryptoOrderContext4 == null;
            if (cryptoOrderContext4 == null || (requestContext3 = cryptoOrderContext4.getRequestContext()) == null || (stringResourceInvoke5 = StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_reviewing_stop_label, CurrencyDefinitions.formatCurrency$default(requestContext3.getCurrencyPair().getQuoteCurrencyForPriceInput(), requestContext3.getQuote().getBidPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null))) == null) {
                stringResourceInvoke5 = StringResource.INSTANCE.invoke("-------");
            }
            secondaryTextRow2 = new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(stringResourceInvoke5, null, null, null, null, null, z4, 62, null), objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0);
        } else {
            secondaryTextRow2 = null;
        }
        if (!(this.requestInputs.getOrderPrices() instanceof CryptoOrderPrices.Market)) {
            CryptoOrderContext cryptoOrderContext5 = this.cryptoOrderContext;
            boolean z5 = cryptoOrderContext5 == null;
            if (cryptoOrderContext5 == null || (requestContext2 = cryptoOrderContext5.getRequestContext()) == null || (stringResourceInvoke4 = CryptoTimeInForceFormatter.getExpiryFormattedDateStringResource(requestContext2.getRequestInputs().getTimeInForce(), this.currentTime)) == null) {
                stringResourceInvoke4 = StringResource.INSTANCE.invoke("-------");
            }
            secondaryTextRow3 = new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(stringResourceInvoke4, null, null, null, null, null, z5, 62, null), objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
        }
        return new CryptoOrderReviewRowState(textContent, textContent2, null, extensions2.toPersistentList(CollectionsKt.listOfNotNull((Object[]) new CryptoOrderReviewRowState.SecondaryTextRow[]{secondaryTextRow, secondaryTextRow2, secondaryTextRow3})), null, false, null, false, null, null, 1012, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* renamed from: getSpreadCryptoOrderReviewRowState$feature_trade_crypto_externalDebug */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CryptoOrderReviewRowState m2918x1e92851f() {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        StringResource stringResourceInvoke3;
        CryptoOrderContext.RequestContext requestContext;
        CryptoOrderContext.RequestContext requestContext2;
        Quote quote;
        CryptoOrderReviewRowState.TextContent textContent = null;
        Object[] objArr = 0;
        if (this.requestInputs.getOrderPrices() instanceof CryptoOrderPrices.Market) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.requestInputs.getMonetizationModel().ordinal()];
            if (i != 1) {
                int i2 = 2;
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
                boolean z = cryptoOrderContext == null;
                if (cryptoOrderContext == null || (requestContext2 = cryptoOrderContext.getRequestContext()) == null || (quote = requestContext2.getQuote()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_reviewing_sell_spread_label, FormatsLocalized.getPercentFormat().format(quote.getSellSpreadFraction()))) == null) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke("------------");
                }
                CryptoOrderReviewRowState.TextContent textContent2 = new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderReviewRowState.ColorOverride.FG_2), CryptoOrderReviewRowState.TapAction.ShowSpreadBottomSheet.INSTANCE, null, null, z, 50, null);
                CryptoOrderContext cryptoOrderContext2 = this.cryptoOrderContext;
                boolean z2 = cryptoOrderContext2 == null;
                if (cryptoOrderContext2 != null) {
                    Quote quote2 = cryptoOrderContext2.getRequestContext().getQuote();
                    stringResourceInvoke2 = StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(cryptoOrderContext2.getRequestContext().getCurrencyPair().getQuoteCurrencyForPriceInput(), quote2.getBidPrice().times(quote2.getSellSpreadFraction()).times(cryptoOrderContext2.getRequest().getOrderQuantity()).getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
                    if (stringResourceInvoke2 == null) {
                        stringResourceInvoke2 = StringResource.INSTANCE.invoke("------------");
                    }
                }
                CryptoOrderReviewRowState.TextContent textContent3 = new CryptoOrderReviewRowState.TextContent(stringResourceInvoke2, null, null, null, null, FontWeight.INSTANCE.getBold(), z2, 30, null);
                CryptoOrderContext cryptoOrderContext3 = this.cryptoOrderContext;
                boolean z3 = cryptoOrderContext3 == null;
                if (cryptoOrderContext3 == null || (requestContext = cryptoOrderContext3.getRequestContext()) == null || (stringResourceInvoke3 = StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_reviewing_sell_spread_secondary_label, requestContext.getCurrencyPair().getAssetCurrency().getCode())) == null) {
                    stringResourceInvoke3 = StringResource.INSTANCE.invoke("------------");
                }
                return new CryptoOrderReviewRowState(textContent2, textContent3, null, extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(stringResourceInvoke3, null, null, null, null, null, z3, 62, null), textContent, i2, objArr == true ? 1 : 0)), null, false, null, false, null, null, 1012, null);
            }
        }
        return null;
    }

    private final CryptoOrderReviewRowState getFeeCryptoOrderReviewRowState() {
        CryptoOrderReviewRowState cryptoOrderReviewRowStateGenerateCryptoOrderReviewRowStateForFee = FeeCryptoOrderReviewRowState.generateCryptoOrderReviewRowStateForFee(false, true, true, this.cryptoOrderContext, this.requestInputs.getMonetizationModel());
        if (cryptoOrderReviewRowStateGenerateCryptoOrderReviewRowStateForFee != null) {
            return CryptoOrderReviewRowState.copy$default(cryptoOrderReviewRowStateGenerateCryptoOrderReviewRowStateForFee, null, CryptoOrderReviewRowState.TextContent.copy$default(cryptoOrderReviewRowStateGenerateCryptoOrderReviewRowStateForFee.getEndPrimaryTextContent(), null, null, null, null, null, FontWeight.INSTANCE.getBold(), false, 95, null), null, null, null, false, null, false, null, null, 1021, null);
        }
        return null;
    }

    /* renamed from: getEstimatedCreditCryptoOrderReviewRowState$feature_trade_crypto_externalDebug */
    public final CryptoOrderReviewRowState m2916x91d0d7d5() {
        StringResource stringResourceInvoke;
        StringResource.Companion companion = StringResource.INSTANCE;
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(companion.invoke(this.requestInputs.getOrderPrices() instanceof CryptoOrderPrices.Market ? C40095R.string.crypto_tax_lot_reviewing_total_credit_label : C40095R.string.crypto_tax_lot_reviewing_estimated_credit_label, new Object[0]), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        boolean z = cryptoOrderContext == null;
        if (cryptoOrderContext == null || (stringResourceInvoke = companion.invoke(CurrencyDefinitions.formatCurrency$default(cryptoOrderContext.getRequestContext().getCurrencyPair().getQuoteCurrencyForPriceInput(), this.cryptoOrderContext.getOrderInfo().getUncollaredTotalCost(), false, false, null, 0, null, null, false, false, false, false, 2046, null))) == null) {
            stringResourceInvoke = companion.invoke("-------");
        }
        return new CryptoOrderReviewRowState(textContent, new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, null, null, null, FontWeight.INSTANCE.getBold(), z, 30, null), null, null, null, m2915x5e15d005() != null, null, false, null, null, 988, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAccountNameOrderReviewState$feature_trade_crypto_externalDebug */
    public final CryptoOrderReviewRowState m2915x5e15d005() {
        Account account;
        if (!this.isMibExperimentEnabled || (account = this.account) == null) {
            return null;
        }
        StringResource title = AccountDisplayNames.getDisplayNameWithoutNickname(account).getShort().getTitle();
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(StringResource.INSTANCE.invoke(C40095R.string.crypto_order_detail_account_name_label, new Object[0]), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        CryptoOrderReviewRowState.ColorOverride colorOverride = null;
        CryptoOrderReviewRowState.IconContent iconContent = null;
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        CryptoOrderReviewRowState.IconContent iconContent2 = null;
        return new CryptoOrderReviewRowState(textContent, new CryptoOrderReviewRowState.TextContent(title, colorOverride, iconContent, objArr, objArr2, FontWeight.INSTANCE.getBold(), z, 94, null), 0 == true ? 1 : 0, null, null, false, CryptoOrderReviewRowState.VerticalPadding.DEFAULT, false, 0 == true ? 1 : 0, iconContent2, 924, null);
    }
}
