package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import android.content.res.Resources;
import androidx.compose.p011ui.text.font.FontWeight;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderTypeDropdownSelectorState;
import com.robinhood.shared.crypto.utils.UiCurrencyPairs2;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.account.CryptoTradeAccountSwitcherDropdownArgs;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.fee.FeeCryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.CryptoTaxLotOrderInputViewState;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.strategy.TaxLotStrategySelectionRowState;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.views.CryptoOrderInputDropdownRowState;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamAvailableTaxLotStrategyViewModelsResponseDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamGainLossAmountResponseDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamSelectedTaxLotStrategyResponseDto;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: CryptoTaxLotOrderInputDataState.kt */
@Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0092\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010T\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010U2\u0006\u0010W\u001a\u00020XJ\u000e\u0010r\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bsJ\u000e\u0010t\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\buJ\u0010\u0010v\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\bwJ\u0010\u0010x\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\byJ\u0010\u0010z\u001a\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\b{J\u0010\u0010|\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0002\b}J\u0010\u0010~\u001a\u0004\u0018\u00010\u000fHÀ\u0003¢\u0006\u0002\b\u007fJ\u0012\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0003\b\u0081\u0001J\u0010\u0010\u0082\u0001\u001a\u00020\u0013HÀ\u0003¢\u0006\u0003\b\u0083\u0001J\u0012\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0003\b\u0085\u0001J\u0012\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0016HÀ\u0003¢\u0006\u0003\b\u0087\u0001J\u0012\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0018HÀ\u0003¢\u0006\u0003\b\u0089\u0001J\u0010\u0010\u008a\u0001\u001a\u00020\u001aHÀ\u0003¢\u0006\u0003\b\u008b\u0001J\u009e\u0001\u0010\u008c\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001J\u0015\u0010\u008d\u0001\u001a\u00020\u001a2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u008f\u0001\u001a\u00030\u0090\u0001HÖ\u0001J\n\u0010\u0091\u0001\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u0010\u0019\u001a\u00020\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020;8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010F\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010J\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010N\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\bO\u0010AR\u0011\u0010P\u001a\u00020Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010Y\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bZ\u0010MR\u0013\u0010[\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\b\\\u0010IR\u0013\u0010]\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\b^\u0010IR\u0013\u0010_\u001a\u0004\u0018\u00010`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010c\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bc\u00105R\u0011\u0010d\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010h\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bi\u0010,R\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020k0U8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u0010n\u001a\u0004\u0018\u00010o8F¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006\u0093\u0001"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;", "", "currencyPairId", "Ljava/util/UUID;", "cryptoOrderPrices", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "powerInfoAlert", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "selectedStrategyDto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto;", "availableTaxLotStrategyViewModels", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto;", "focusedInputField", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState$InputField;", "formattedLimitPrice", "", "assetAmount", "Ljava/math/BigDecimal;", "formattedAssetAmount", "streamGainLossAmountResponseDto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponseDto;", "cryptoOrderMonetizationModel", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "isMibExperimentEnabled", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/models/ui/ServerDrivenAlert;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto;Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState$InputField;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponseDto;Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;Z)V", "getCurrencyPairId$feature_trade_crypto_externalDebug", "()Ljava/util/UUID;", "getCryptoOrderPrices$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "getCryptoOrderContext$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getPowerInfoAlert$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "getSelectedStrategyDto$feature_trade_crypto_externalDebug", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto;", "getAvailableTaxLotStrategyViewModels$feature_trade_crypto_externalDebug", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto;", "getFocusedInputField$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState$InputField;", "getFormattedLimitPrice$feature_trade_crypto_externalDebug", "()Ljava/lang/String;", "getAssetAmount$feature_trade_crypto_externalDebug", "()Ljava/math/BigDecimal;", "getFormattedAssetAmount$feature_trade_crypto_externalDebug", "getStreamGainLossAmountResponseDto$feature_trade_crypto_externalDebug", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponseDto;", "getCryptoOrderMonetizationModel$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "isMibExperimentEnabled$feature_trade_crypto_externalDebug", "()Z", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "getRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "cryptoOrderHeaderState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;", "getCryptoOrderHeaderState$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;", "orderTypeDropdownRowState", "Lcom/robinhood/shared/trade/crypto/views/CryptoOrderInputDropdownRowState;", "getOrderTypeDropdownRowState", "()Lcom/robinhood/shared/trade/crypto/views/CryptoOrderInputDropdownRowState;", "orderTypeDropdownSelectorState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeDropdownSelectorState;", "getOrderTypeDropdownSelectorState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeDropdownSelectorState;", "assetPriceRowState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "getAssetPriceRowState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "limitPriceOrderInputRowState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;", "getLimitPriceOrderInputRowState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;", "taxLotStrategyDropdownRowState", "getTaxLotStrategyDropdownRowState", "taxLotStrategyDropdownRowTapAction", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputViewState$TaxLotStrategyRowTapAction;", "getTaxLotStrategyDropdownRowTapAction", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputViewState$TaxLotStrategyRowTapAction;", "taxLotStrategySelectionRowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/strategy/TaxLotStrategySelectionRowState;", "resources", "Landroid/content/res/Resources;", "assetOrderInputRowState", "getAssetOrderInputRowState", "feeRowState", "getFeeRowState", "totalCreditRowState", "getTotalCreditRowState", "footerMessage", "Lcom/robinhood/utils/resource/StringResource;", "getFooterMessage", "()Lcom/robinhood/utils/resource/StringResource;", "isCtaEnabled", "numpadState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "getNumpadState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "selectedTaxLotStrategyIdentifier", "getSelectedTaxLotStrategyIdentifier", "bottomSheetTypeDtos", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "getBottomSheetTypeDtos", "()Lkotlinx/collections/immutable/ImmutableList;", "accountSwitcherArgs", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs;", "getAccountSwitcherArgs", "()Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs;", "component1", "component1$feature_trade_crypto_externalDebug", "component2", "component2$feature_trade_crypto_externalDebug", "component3", "component3$feature_trade_crypto_externalDebug", "component4", "component4$feature_trade_crypto_externalDebug", "component5", "component5$feature_trade_crypto_externalDebug", "component6", "component6$feature_trade_crypto_externalDebug", "component7", "component7$feature_trade_crypto_externalDebug", "component8", "component8$feature_trade_crypto_externalDebug", "component9", "component9$feature_trade_crypto_externalDebug", "component10", "component10$feature_trade_crypto_externalDebug", "component11", "component11$feature_trade_crypto_externalDebug", "component12", "component12$feature_trade_crypto_externalDebug", "component13", "component13$feature_trade_crypto_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "InputField", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class CryptoTaxLotOrderInputDataState {
    public static final int $stable = 8;
    private final BigDecimal assetAmount;
    private final StreamAvailableTaxLotStrategyViewModelsResponseDto availableTaxLotStrategyViewModels;
    private final CryptoOrderContext cryptoOrderContext;
    private final CryptoOrderMonetizationModel cryptoOrderMonetizationModel;
    private final CryptoOrderPrices cryptoOrderPrices;
    private final UUID currencyPairId;
    private final InputField focusedInputField;
    private final String formattedAssetAmount;
    private final String formattedLimitPrice;
    private final boolean isMibExperimentEnabled;
    private final ServerDrivenAlert powerInfoAlert;
    private final StreamSelectedTaxLotStrategyResponseDto selectedStrategyDto;
    private final StreamGainLossAmountResponseDto streamGainLossAmountResponseDto;

    /* compiled from: CryptoTaxLotOrderInputDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[TaxLotStrategyTypeDto.values().length];
            try {
                iArr[TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_FIRST_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_LAST_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_HIGHEST_COST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_LOWEST_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoOrderType.values().length];
            try {
                iArr2[CryptoOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CryptoOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MonetizationModel.values().length];
            try {
                iArr3[MonetizationModel.FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[MonetizationModel.REBATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[InputField.values().length];
            try {
                iArr4[InputField.LIMIT_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[InputField.ASSET_AMOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static /* synthetic */ CryptoTaxLotOrderInputDataState copy$default(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, UUID uuid, CryptoOrderPrices cryptoOrderPrices, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert serverDrivenAlert, StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto, StreamAvailableTaxLotStrategyViewModelsResponseDto streamAvailableTaxLotStrategyViewModelsResponseDto, InputField inputField, String str, BigDecimal bigDecimal, String str2, StreamGainLossAmountResponseDto streamGainLossAmountResponseDto, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoTaxLotOrderInputDataState.currencyPairId;
        }
        return cryptoTaxLotOrderInputDataState.copy(uuid, (i & 2) != 0 ? cryptoTaxLotOrderInputDataState.cryptoOrderPrices : cryptoOrderPrices, (i & 4) != 0 ? cryptoTaxLotOrderInputDataState.cryptoOrderContext : cryptoOrderContext, (i & 8) != 0 ? cryptoTaxLotOrderInputDataState.powerInfoAlert : serverDrivenAlert, (i & 16) != 0 ? cryptoTaxLotOrderInputDataState.selectedStrategyDto : streamSelectedTaxLotStrategyResponseDto, (i & 32) != 0 ? cryptoTaxLotOrderInputDataState.availableTaxLotStrategyViewModels : streamAvailableTaxLotStrategyViewModelsResponseDto, (i & 64) != 0 ? cryptoTaxLotOrderInputDataState.focusedInputField : inputField, (i & 128) != 0 ? cryptoTaxLotOrderInputDataState.formattedLimitPrice : str, (i & 256) != 0 ? cryptoTaxLotOrderInputDataState.assetAmount : bigDecimal, (i & 512) != 0 ? cryptoTaxLotOrderInputDataState.formattedAssetAmount : str2, (i & 1024) != 0 ? cryptoTaxLotOrderInputDataState.streamGainLossAmountResponseDto : streamGainLossAmountResponseDto, (i & 2048) != 0 ? cryptoTaxLotOrderInputDataState.cryptoOrderMonetizationModel : cryptoOrderMonetizationModel, (i & 4096) != 0 ? cryptoTaxLotOrderInputDataState.isMibExperimentEnabled : z);
    }

    /* renamed from: component1$feature_trade_crypto_externalDebug, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component10$feature_trade_crypto_externalDebug, reason: from getter */
    public final String getFormattedAssetAmount() {
        return this.formattedAssetAmount;
    }

    /* renamed from: component11$feature_trade_crypto_externalDebug, reason: from getter */
    public final StreamGainLossAmountResponseDto getStreamGainLossAmountResponseDto() {
        return this.streamGainLossAmountResponseDto;
    }

    /* renamed from: component12$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
        return this.cryptoOrderMonetizationModel;
    }

    /* renamed from: component13$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getIsMibExperimentEnabled() {
        return this.isMibExperimentEnabled;
    }

    /* renamed from: component2$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoOrderPrices getCryptoOrderPrices() {
        return this.cryptoOrderPrices;
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
    public final StreamSelectedTaxLotStrategyResponseDto getSelectedStrategyDto() {
        return this.selectedStrategyDto;
    }

    /* renamed from: component6$feature_trade_crypto_externalDebug, reason: from getter */
    public final StreamAvailableTaxLotStrategyViewModelsResponseDto getAvailableTaxLotStrategyViewModels() {
        return this.availableTaxLotStrategyViewModels;
    }

    /* renamed from: component7$feature_trade_crypto_externalDebug, reason: from getter */
    public final InputField getFocusedInputField() {
        return this.focusedInputField;
    }

    /* renamed from: component8$feature_trade_crypto_externalDebug, reason: from getter */
    public final String getFormattedLimitPrice() {
        return this.formattedLimitPrice;
    }

    /* renamed from: component9$feature_trade_crypto_externalDebug, reason: from getter */
    public final BigDecimal getAssetAmount() {
        return this.assetAmount;
    }

    public final CryptoTaxLotOrderInputDataState copy(UUID currencyPairId, CryptoOrderPrices cryptoOrderPrices, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert powerInfoAlert, StreamSelectedTaxLotStrategyResponseDto selectedStrategyDto, StreamAvailableTaxLotStrategyViewModelsResponseDto availableTaxLotStrategyViewModels, InputField focusedInputField, String formattedLimitPrice, BigDecimal assetAmount, String formattedAssetAmount, StreamGainLossAmountResponseDto streamGainLossAmountResponseDto, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, boolean isMibExperimentEnabled) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(cryptoOrderPrices, "cryptoOrderPrices");
        Intrinsics.checkNotNullParameter(assetAmount, "assetAmount");
        return new CryptoTaxLotOrderInputDataState(currencyPairId, cryptoOrderPrices, cryptoOrderContext, powerInfoAlert, selectedStrategyDto, availableTaxLotStrategyViewModels, focusedInputField, formattedLimitPrice, assetAmount, formattedAssetAmount, streamGainLossAmountResponseDto, cryptoOrderMonetizationModel, isMibExperimentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTaxLotOrderInputDataState)) {
            return false;
        }
        CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState = (CryptoTaxLotOrderInputDataState) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoTaxLotOrderInputDataState.currencyPairId) && Intrinsics.areEqual(this.cryptoOrderPrices, cryptoTaxLotOrderInputDataState.cryptoOrderPrices) && Intrinsics.areEqual(this.cryptoOrderContext, cryptoTaxLotOrderInputDataState.cryptoOrderContext) && Intrinsics.areEqual(this.powerInfoAlert, cryptoTaxLotOrderInputDataState.powerInfoAlert) && Intrinsics.areEqual(this.selectedStrategyDto, cryptoTaxLotOrderInputDataState.selectedStrategyDto) && Intrinsics.areEqual(this.availableTaxLotStrategyViewModels, cryptoTaxLotOrderInputDataState.availableTaxLotStrategyViewModels) && this.focusedInputField == cryptoTaxLotOrderInputDataState.focusedInputField && Intrinsics.areEqual(this.formattedLimitPrice, cryptoTaxLotOrderInputDataState.formattedLimitPrice) && Intrinsics.areEqual(this.assetAmount, cryptoTaxLotOrderInputDataState.assetAmount) && Intrinsics.areEqual(this.formattedAssetAmount, cryptoTaxLotOrderInputDataState.formattedAssetAmount) && Intrinsics.areEqual(this.streamGainLossAmountResponseDto, cryptoTaxLotOrderInputDataState.streamGainLossAmountResponseDto) && Intrinsics.areEqual(this.cryptoOrderMonetizationModel, cryptoTaxLotOrderInputDataState.cryptoOrderMonetizationModel) && this.isMibExperimentEnabled == cryptoTaxLotOrderInputDataState.isMibExperimentEnabled;
    }

    public int hashCode() {
        int iHashCode = ((this.currencyPairId.hashCode() * 31) + this.cryptoOrderPrices.hashCode()) * 31;
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        int iHashCode2 = (iHashCode + (cryptoOrderContext == null ? 0 : cryptoOrderContext.hashCode())) * 31;
        ServerDrivenAlert serverDrivenAlert = this.powerInfoAlert;
        int iHashCode3 = (iHashCode2 + (serverDrivenAlert == null ? 0 : serverDrivenAlert.hashCode())) * 31;
        StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto = this.selectedStrategyDto;
        int iHashCode4 = (iHashCode3 + (streamSelectedTaxLotStrategyResponseDto == null ? 0 : streamSelectedTaxLotStrategyResponseDto.hashCode())) * 31;
        StreamAvailableTaxLotStrategyViewModelsResponseDto streamAvailableTaxLotStrategyViewModelsResponseDto = this.availableTaxLotStrategyViewModels;
        int iHashCode5 = (iHashCode4 + (streamAvailableTaxLotStrategyViewModelsResponseDto == null ? 0 : streamAvailableTaxLotStrategyViewModelsResponseDto.hashCode())) * 31;
        InputField inputField = this.focusedInputField;
        int iHashCode6 = (iHashCode5 + (inputField == null ? 0 : inputField.hashCode())) * 31;
        String str = this.formattedLimitPrice;
        int iHashCode7 = (((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31) + this.assetAmount.hashCode()) * 31;
        String str2 = this.formattedAssetAmount;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StreamGainLossAmountResponseDto streamGainLossAmountResponseDto = this.streamGainLossAmountResponseDto;
        int iHashCode9 = (iHashCode8 + (streamGainLossAmountResponseDto == null ? 0 : streamGainLossAmountResponseDto.hashCode())) * 31;
        CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.cryptoOrderMonetizationModel;
        return ((iHashCode9 + (cryptoOrderMonetizationModel != null ? cryptoOrderMonetizationModel.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMibExperimentEnabled);
    }

    public String toString() {
        return "CryptoTaxLotOrderInputDataState(currencyPairId=" + this.currencyPairId + ", cryptoOrderPrices=" + this.cryptoOrderPrices + ", cryptoOrderContext=" + this.cryptoOrderContext + ", powerInfoAlert=" + this.powerInfoAlert + ", selectedStrategyDto=" + this.selectedStrategyDto + ", availableTaxLotStrategyViewModels=" + this.availableTaxLotStrategyViewModels + ", focusedInputField=" + this.focusedInputField + ", formattedLimitPrice=" + this.formattedLimitPrice + ", assetAmount=" + this.assetAmount + ", formattedAssetAmount=" + this.formattedAssetAmount + ", streamGainLossAmountResponseDto=" + this.streamGainLossAmountResponseDto + ", cryptoOrderMonetizationModel=" + this.cryptoOrderMonetizationModel + ", isMibExperimentEnabled=" + this.isMibExperimentEnabled + ")";
    }

    public CryptoTaxLotOrderInputDataState(UUID currencyPairId, CryptoOrderPrices cryptoOrderPrices, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert serverDrivenAlert, StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto, StreamAvailableTaxLotStrategyViewModelsResponseDto streamAvailableTaxLotStrategyViewModelsResponseDto, InputField inputField, String str, BigDecimal assetAmount, String str2, StreamGainLossAmountResponseDto streamGainLossAmountResponseDto, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, boolean z) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(cryptoOrderPrices, "cryptoOrderPrices");
        Intrinsics.checkNotNullParameter(assetAmount, "assetAmount");
        this.currencyPairId = currencyPairId;
        this.cryptoOrderPrices = cryptoOrderPrices;
        this.cryptoOrderContext = cryptoOrderContext;
        this.powerInfoAlert = serverDrivenAlert;
        this.selectedStrategyDto = streamSelectedTaxLotStrategyResponseDto;
        this.availableTaxLotStrategyViewModels = streamAvailableTaxLotStrategyViewModelsResponseDto;
        this.focusedInputField = inputField;
        this.formattedLimitPrice = str;
        this.assetAmount = assetAmount;
        this.formattedAssetAmount = str2;
        this.streamGainLossAmountResponseDto = streamGainLossAmountResponseDto;
        this.cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
        this.isMibExperimentEnabled = z;
    }

    public final UUID getCurrencyPairId$feature_trade_crypto_externalDebug() {
        return this.currencyPairId;
    }

    public /* synthetic */ CryptoTaxLotOrderInputDataState(UUID uuid, CryptoOrderPrices cryptoOrderPrices, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert serverDrivenAlert, StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto, StreamAvailableTaxLotStrategyViewModelsResponseDto streamAvailableTaxLotStrategyViewModelsResponseDto, InputField inputField, String str, BigDecimal bigDecimal, String str2, StreamGainLossAmountResponseDto streamGainLossAmountResponseDto, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? CryptoOrderPrices.Market.INSTANCE : cryptoOrderPrices, (i & 4) != 0 ? null : cryptoOrderContext, (i & 8) != 0 ? null : serverDrivenAlert, (i & 16) != 0 ? null : streamSelectedTaxLotStrategyResponseDto, (i & 32) != 0 ? null : streamAvailableTaxLotStrategyViewModelsResponseDto, (i & 64) != 0 ? null : inputField, (i & 128) != 0 ? null : str, (i & 256) != 0 ? BigDecimal.ZERO : bigDecimal, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : streamGainLossAmountResponseDto, (i & 2048) == 0 ? cryptoOrderMonetizationModel : null, (i & 4096) != 0 ? false : z);
    }

    public final CryptoOrderPrices getCryptoOrderPrices$feature_trade_crypto_externalDebug() {
        return this.cryptoOrderPrices;
    }

    public final CryptoOrderContext getCryptoOrderContext$feature_trade_crypto_externalDebug() {
        return this.cryptoOrderContext;
    }

    public final ServerDrivenAlert getPowerInfoAlert$feature_trade_crypto_externalDebug() {
        return this.powerInfoAlert;
    }

    public final StreamSelectedTaxLotStrategyResponseDto getSelectedStrategyDto$feature_trade_crypto_externalDebug() {
        return this.selectedStrategyDto;
    }

    /* renamed from: getAvailableTaxLotStrategyViewModels$feature_trade_crypto_externalDebug */
    public final StreamAvailableTaxLotStrategyViewModelsResponseDto m2908x1da5a3b7() {
        return this.availableTaxLotStrategyViewModels;
    }

    public final InputField getFocusedInputField$feature_trade_crypto_externalDebug() {
        return this.focusedInputField;
    }

    public final String getFormattedLimitPrice$feature_trade_crypto_externalDebug() {
        return this.formattedLimitPrice;
    }

    public final BigDecimal getAssetAmount$feature_trade_crypto_externalDebug() {
        return this.assetAmount;
    }

    public final String getFormattedAssetAmount$feature_trade_crypto_externalDebug() {
        return this.formattedAssetAmount;
    }

    /* renamed from: getStreamGainLossAmountResponseDto$feature_trade_crypto_externalDebug */
    public final StreamGainLossAmountResponseDto m2910xb5722824() {
        return this.streamGainLossAmountResponseDto;
    }

    /* renamed from: getCryptoOrderMonetizationModel$feature_trade_crypto_externalDebug */
    public final CryptoOrderMonetizationModel m2909x5cfb4369() {
        return this.cryptoOrderMonetizationModel;
    }

    public final boolean isMibExperimentEnabled$feature_trade_crypto_externalDebug() {
        return this.isMibExperimentEnabled;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTaxLotOrderInputDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState$InputField;", "", "<init>", "(Ljava/lang/String;I)V", "LIMIT_PRICE", "ASSET_AMOUNT", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InputField {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputField[] $VALUES;
        public static final InputField LIMIT_PRICE = new InputField("LIMIT_PRICE", 0);
        public static final InputField ASSET_AMOUNT = new InputField("ASSET_AMOUNT", 1);

        private static final /* synthetic */ InputField[] $values() {
            return new InputField[]{LIMIT_PRICE, ASSET_AMOUNT};
        }

        public static EnumEntries<InputField> getEntries() {
            return $ENTRIES;
        }

        private InputField(String str, int i) {
        }

        static {
            InputField[] inputFieldArr$values = $values();
            $VALUES = inputFieldArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inputFieldArr$values);
        }

        public static InputField valueOf(String str) {
            return (InputField) Enum.valueOf(InputField.class, str);
        }

        public static InputField[] values() {
            return (InputField[]) $VALUES.clone();
        }
    }

    public final RequestInputs.AsAsset getRequestInputs() {
        BigDecimal bigDecimal;
        StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto = this.selectedStrategyDto;
        TaxLotStrategyTypeDto strategy_type = streamSelectedTaxLotStrategyResponseDto != null ? streamSelectedTaxLotStrategyResponseDto.getStrategy_type() : null;
        switch (strategy_type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[strategy_type.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                bigDecimal = this.assetAmount;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                bigDecimal = BigDecimal.ZERO;
                break;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        Intrinsics.checkNotNull(bigDecimal2);
        return new RequestInputs.AsAsset(bigDecimal2, this.cryptoOrderMonetizationModel, this.cryptoOrderPrices, OrderSide.SELL, OrderTimeInForce.GTC, false, null, null, false, null, 704, null);
    }

    public final CryptoOrderHeaderState getCryptoOrderHeaderState$feature_trade_crypto_externalDebug() {
        CryptoOrderContext.RequestContext requestContext;
        UiCurrencyPair currencyPair;
        OrderSide orderSide = OrderSide.SELL;
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        String displaySymbol = (cryptoOrderContext == null || (requestContext = cryptoOrderContext.getRequestContext()) == null || (currencyPair = requestContext.getCurrencyPair()) == null) ? null : currencyPair.getDisplaySymbol();
        CryptoOrderContext cryptoOrderContext2 = this.cryptoOrderContext;
        return new CryptoOrderHeaderState(orderSide, displaySymbol, cryptoOrderContext2 != null ? CryptoOrderContexts.getCryptoPowerText(cryptoOrderContext2) : null, this.powerInfoAlert, false, 16, null);
    }

    public final CryptoOrderInputDropdownRowState getOrderTypeDropdownRowState() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C40095R.string.crypto_tax_lot_order_input_order_type_label, new Object[0]);
        int i2 = WhenMappings.$EnumSwitchMapping$1[getRequestInputs().getOrderPrices().getOrderType().ordinal()];
        if (i2 == 1) {
            i = C40095R.string.crypto_tax_lot_order_input_order_type_market_label;
        } else if (i2 == 2) {
            i = C40095R.string.crypto_tax_lot_order_input_order_type_limit_label;
        } else if (i2 == 3) {
            i = C40095R.string.crypto_tax_lot_order_input_order_type_stop_loss_label;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = C40095R.string.crypto_tax_lot_order_input_order_type_stop_limit_label;
        }
        return new CryptoOrderInputDropdownRowState(stringResourceInvoke, companion.invoke(i, new Object[0]), false, false, 12, null);
    }

    public final CryptoOrderTypeDropdownSelectorState getOrderTypeDropdownSelectorState() {
        return new CryptoOrderTypeDropdownSelectorState(extensions2.persistentListOf(CryptoOrderType.MARKET, CryptoOrderType.LIMIT), this.cryptoOrderPrices.getOrderType());
    }

    public final CryptoOrderReviewRowState getAssetPriceRowState() {
        StringResource stringResourceInvoke;
        CryptoOrderReviewRowState.TapAction tapAction;
        StringResource stringResourceInvoke2;
        CryptoOrderPrices cryptoOrderPrices = this.cryptoOrderPrices;
        if ((cryptoOrderPrices instanceof CryptoOrderPrices.Limit) || (cryptoOrderPrices instanceof CryptoOrderPrices.StopLimit) || (cryptoOrderPrices instanceof CryptoOrderPrices.StopLoss)) {
            return null;
        }
        if (!(cryptoOrderPrices instanceof CryptoOrderPrices.Market)) {
            throw new NoWhenBranchMatchedException();
        }
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        boolean z = cryptoOrderContext == null;
        if (cryptoOrderContext == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke("----------");
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_price_label_with_symbol_bid, cryptoOrderContext.getRequestContext().getCurrencyPair().getDisplaySymbol());
        }
        StringResource stringResource = stringResourceInvoke;
        CryptoOrderReviewRowState.IconContent iconContent = new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderReviewRowState.ColorOverride.FG_2);
        int i = WhenMappings.$EnumSwitchMapping$2[getRequestInputs().getMonetizationModel().ordinal()];
        if (i == 1) {
            tapAction = CryptoOrderReviewRowState.TapAction.ShowMarketPriceBottomSheet.INSTANCE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            tapAction = CryptoOrderReviewRowState.TapAction.ShowSpreadBottomSheet.INSTANCE;
        }
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(stringResource, null, iconContent, tapAction, null, null, z, 50, null);
        CryptoOrderContext cryptoOrderContext2 = this.cryptoOrderContext;
        boolean z2 = cryptoOrderContext2 == null;
        if (cryptoOrderContext2 == null) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke("----------");
        } else {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(cryptoOrderContext2.getRequestContext().getCurrencyPair().getQuoteCurrencyForPriceInput(), this.cryptoOrderContext.getRequestContext().getQuote().getBidPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }
        return new CryptoOrderReviewRowState(textContent, new CryptoOrderReviewRowState.TextContent(stringResourceInvoke2, null, null, null, null, FontWeight.INSTANCE.getBold(), z2, 30, null), null, null, null, false, null, false, null, null, 1020, null);
    }

    public final CryptoOrderInputRowState getLimitPriceOrderInputRowState() {
        StringResource stringResourceInvoke;
        Currency quoteCurrency;
        CryptoOrderContext.RequestContext requestContext;
        String currency$default;
        CryptoOrderContext.RequestContext requestContext2;
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        StringResource stringResourceInvoke2 = null;
        UiCurrencyPair currencyPair = (cryptoOrderContext == null || (requestContext2 = cryptoOrderContext.getRequestContext()) == null) ? null : requestContext2.getCurrencyPair();
        CryptoOrderPrices cryptoOrderPrices = this.cryptoOrderPrices;
        if ((cryptoOrderPrices instanceof CryptoOrderPrices.Market) || (cryptoOrderPrices instanceof CryptoOrderPrices.StopLoss)) {
            return null;
        }
        if (cryptoOrderPrices instanceof CryptoOrderPrices.StopLimit) {
            throw new IllegalStateException("Tax lots for stop limit orders not supported");
        }
        if (!(cryptoOrderPrices instanceof CryptoOrderPrices.Limit)) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        CryptoOrderInputRowState.TextContent textContent = new CryptoOrderInputRowState.TextContent(companion.invoke(C40095R.string.crypto_tax_lot_order_input_limit_price_primary_text, new Object[0]), new CryptoOrderInputRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderInputRowState.ColorOverride.FG_2), CryptoOrderInputRowState.TapAction.ShowLimitPriceBottomSheet.INSTANCE, false, 8, null);
        CryptoOrderContext cryptoOrderContext2 = this.cryptoOrderContext;
        boolean z = cryptoOrderContext2 == null;
        if (cryptoOrderContext2 == null || (requestContext = cryptoOrderContext2.getRequestContext()) == null || (currency$default = CurrencyDefinitions.formatCurrency$default(requestContext.getCurrencyPair().getQuoteCurrencyForPriceInput(), requestContext.getQuote().getBidPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null)) == null || (stringResourceInvoke = companion.invoke(C40095R.string.crypto_tax_lot_order_input_limit_price_secondary_text_prefix, currency$default)) == null) {
            stringResourceInvoke = companion.invoke("-----");
        }
        CryptoOrderInputRowState.TextContent textContent2 = new CryptoOrderInputRowState.TextContent(stringResourceInvoke, null, null, z, 6, null);
        String str = this.formattedLimitPrice;
        StringResource stringResourceInvoke3 = str != null ? companion.invoke(str) : null;
        if (currencyPair != null && (quoteCurrency = currencyPair.getQuoteCurrency()) != null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            String currency$default2 = CurrencyDefinitions.formatCurrency$default(quoteCurrency, ZERO, false, false, null, 0, null, null, false, false, false, false, 2046, null);
            if (currency$default2 != null) {
                stringResourceInvoke2 = companion.invoke(currency$default2);
            }
        }
        return new CryptoOrderInputRowState(textContent, textContent2, stringResourceInvoke2, stringResourceInvoke3, null, false, this.focusedInputField == InputField.LIMIT_PRICE, 48, null);
    }

    public final CryptoOrderInputDropdownRowState getTaxLotStrategyDropdownRowState() {
        boolean z = this.selectedStrategyDto == null;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C40095R.string.crypto_tax_lot_order_input_lot_selection_label, new Object[0]);
        StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto = this.selectedStrategyDto;
        String strategy_name = streamSelectedTaxLotStrategyResponseDto != null ? streamSelectedTaxLotStrategyResponseDto.getStrategy_name() : null;
        if (strategy_name == null) {
            strategy_name = "";
        }
        StringResource stringResourceInvoke2 = companion.invoke(strategy_name);
        StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto2 = this.selectedStrategyDto;
        return new CryptoOrderInputDropdownRowState(stringResourceInvoke, stringResourceInvoke2, (streamSelectedTaxLotStrategyResponseDto2 == null || streamSelectedTaxLotStrategyResponseDto2.getStrategy_type() == TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_CUSTOM) ? false : true, z);
    }

    public final CryptoTaxLotOrderInputViewState.TaxLotStrategyRowTapAction getTaxLotStrategyDropdownRowTapAction() {
        return CryptoTaxLotOrderInputViewState.TaxLotStrategyRowTapAction.PROCEED_TO_LOT_SELECTION;
    }

    public final ImmutableList<TaxLotStrategySelectionRowState> taxLotStrategySelectionRowStates(Resources resources) throws Resources.NotFoundException {
        BentoBaseRowState.Text.Plain plain;
        BentoBaseRowState.Text.Plain plain2;
        CryptoOrderContext.RequestContext requestContext;
        Intrinsics.checkNotNullParameter(resources, "resources");
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        UiCurrencyPair currencyPair = (cryptoOrderContext == null || (requestContext = cryptoOrderContext.getRequestContext()) == null) ? null : requestContext.getCurrencyPair();
        StreamAvailableTaxLotStrategyViewModelsResponseDto streamAvailableTaxLotStrategyViewModelsResponseDto = this.availableTaxLotStrategyViewModels;
        if (streamAvailableTaxLotStrategyViewModelsResponseDto == null || currencyPair == null) {
            return null;
        }
        List<StreamAvailableTaxLotStrategyViewModelsResponseDto.AvailableTaxLotStrategyViewModelDto> strategy_view_models = streamAvailableTaxLotStrategyViewModelsResponseDto.getStrategy_view_models();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(strategy_view_models, 10));
        for (StreamAvailableTaxLotStrategyViewModelsResponseDto.AvailableTaxLotStrategyViewModelDto availableTaxLotStrategyViewModelDto : strategy_view_models) {
            BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
            String start_primary_text = availableTaxLotStrategyViewModelDto.getStart_primary_text();
            StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto start_secondary_text_content = availableTaxLotStrategyViewModelDto.getStart_secondary_text_content();
            StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto.ContentTypeDto content_type = start_secondary_text_content != null ? start_secondary_text_content.getContent_type() : null;
            if (content_type instanceof StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto.ContentTypeDto.EstimatedGainContent) {
                String string2 = resources.getString(C40095R.string.crypto_tax_lot_strategy_selection_bottom_sheet_est_gain_prefix, CurrencyDefinitions.formatCurrency$default(currencyPair.getQuoteCurrency(), ((StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto.ContentTypeDto.EstimatedGainContent) content_type).getValue().getEstimated_gain_quote_amount().toBigDecimalOrThrow(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                plain2 = new BentoBaseRowState.Text.Plain(string2);
            } else if (content_type instanceof StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto.ContentTypeDto.EstimatedLossContent) {
                String string3 = resources.getString(C40095R.string.crypto_tax_lot_strategy_selection_bottom_sheet_est_loss_prefix, CurrencyDefinitions.formatCurrency$default(currencyPair.getQuoteCurrency(), ((StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto.ContentTypeDto.EstimatedLossContent) content_type).getValue().getEstimated_loss_quote_amount().toBigDecimalOrThrow(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                plain2 = new BentoBaseRowState.Text.Plain(string3);
            } else if (content_type instanceof StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto.ContentTypeDto.TextContent) {
                plain2 = new BentoBaseRowState.Text.Plain(((StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto.ContentTypeDto.TextContent) content_type).getValue().getText());
            } else {
                if (content_type != null) {
                    throw new NoWhenBranchMatchedException();
                }
                plain = null;
                arrayList.add(new TaxLotStrategySelectionRowState(new BentoSelectionRowState(type2, start_primary_text, availableTaxLotStrategyViewModelDto.is_selected(), (BentoBaseRowState.Text) plain, false, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1904, (DefaultConstructorMarker) null), availableTaxLotStrategyViewModelDto.getStrategy_type()));
            }
            plain = plain2;
            arrayList.add(new TaxLotStrategySelectionRowState(new BentoSelectionRowState(type2, start_primary_text, availableTaxLotStrategyViewModelDto.is_selected(), (BentoBaseRowState.Text) plain, false, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1904, (DefaultConstructorMarker) null), availableTaxLotStrategyViewModelDto.getStrategy_type()));
        }
        return extensions2.toImmutableList(arrayList);
    }

    public final CryptoOrderInputRowState getAssetOrderInputRowState() {
        StringResource stringResourceInvoke;
        Currency assetCurrencyForCost;
        CryptoOrderContext.RequestContext requestContext;
        StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto = this.selectedStrategyDto;
        StringResource stringResourceInvoke2 = null;
        if (streamSelectedTaxLotStrategyResponseDto == null || streamSelectedTaxLotStrategyResponseDto.getStrategy_type() == TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_CUSTOM) {
            return null;
        }
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        UiCurrencyPair currencyPair = (cryptoOrderContext == null || (requestContext = cryptoOrderContext.getRequestContext()) == null) ? null : requestContext.getCurrencyPair();
        boolean z = currencyPair == null;
        if (currencyPair == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke("----------");
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_order_input_asset_amount_primary_text, currencyPair.getAssetCurrency().getCode());
        }
        CryptoOrderInputRowState.TextContent textContent = new CryptoOrderInputRowState.TextContent(stringResourceInvoke, null, null, z, 6, null);
        String str = this.formattedAssetAmount;
        StringResource stringResourceInvoke3 = str != null ? StringResource.INSTANCE.invoke(str) : null;
        if (currencyPair != null && (assetCurrencyForCost = currencyPair.getAssetCurrencyForCost()) != null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            String currency$default = CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, ZERO, false, false, null, 0, null, null, false, false, false, false, 2044, null);
            if (currency$default != null) {
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(currency$default);
            }
        }
        return new CryptoOrderInputRowState(textContent, null, stringResourceInvoke2, stringResourceInvoke3, null, false, this.focusedInputField == InputField.ASSET_AMOUNT, 50, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final CryptoOrderReviewRowState getFeeRowState() {
        StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto = this.selectedStrategyDto;
        TaxLotStrategyTypeDto strategy_type = streamSelectedTaxLotStrategyResponseDto != null ? streamSelectedTaxLotStrategyResponseDto.getStrategy_type() : null;
        switch (strategy_type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[strategy_type.ordinal()]) {
            case -1:
            case 1:
            case 2:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 3:
            case 4:
            case 5:
            case 6:
                CryptoOrderReviewRowState cryptoOrderReviewRowStateGenerateCryptoOrderReviewRowStateForFee = FeeCryptoOrderReviewRowState.generateCryptoOrderReviewRowStateForFee(false, true, true, this.cryptoOrderContext, getRequestInputs().getMonetizationModel());
                if (cryptoOrderReviewRowStateGenerateCryptoOrderReviewRowStateForFee != null) {
                    return CryptoOrderReviewRowState.copy$default(cryptoOrderReviewRowStateGenerateCryptoOrderReviewRowStateForFee, null, CryptoOrderReviewRowState.TextContent.copy$default(cryptoOrderReviewRowStateGenerateCryptoOrderReviewRowStateForFee.getEndPrimaryTextContent(), null, null, null, null, null, FontWeight.INSTANCE.getBold(), false, 95, null), null, null, null, false, null, false, null, null, 1021, null);
                }
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CryptoOrderReviewRowState getTotalCreditRowState() {
        CryptoOrderReviewRowState.TextContent textContent;
        StringResource stringResourceInvoke;
        StreamGainLossAmountResponseDto.GainLossContentDto gain_loss_content;
        StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto = this.selectedStrategyDto;
        ImmutableList3 immutableList3PersistentListOf = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (streamSelectedTaxLotStrategyResponseDto == null || streamSelectedTaxLotStrategyResponseDto.getStrategy_type() == TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_CUSTOM) {
            return null;
        }
        StreamGainLossAmountResponseDto streamGainLossAmountResponseDto = this.streamGainLossAmountResponseDto;
        StreamGainLossAmountResponseDto.GainLossContentDto.TypeDto type2 = (streamGainLossAmountResponseDto == null || (gain_loss_content = streamGainLossAmountResponseDto.getGain_loss_content()) == null) ? null : gain_loss_content.getType();
        if (this.cryptoOrderContext == null || type2 == null) {
            textContent = null;
        } else if (type2 instanceof StreamGainLossAmountResponseDto.GainLossContentDto.TypeDto.EstimatedGainContent) {
            textContent = new CryptoOrderReviewRowState.TextContent(StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_order_input_est_gain_label, CurrencyDefinitions.formatCurrency$default(this.cryptoOrderContext.getRequestContext().getCurrencyPair().getQuoteCurrency(), ((StreamGainLossAmountResponseDto.GainLossContentDto.TypeDto.EstimatedGainContent) type2).getValue().getEstimated_gain_quote_amount().toBigDecimalOrThrow(), false, false, null, 0, null, Boolean.TRUE, true, false, false, false, 1854, null)), CryptoOrderReviewRowState.ColorOverride.POSITIVE, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        } else {
            if (!(type2 instanceof StreamGainLossAmountResponseDto.GainLossContentDto.TypeDto.EstimatedLossContent)) {
                throw new NoWhenBranchMatchedException();
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C40095R.string.crypto_tax_lot_order_input_est_loss_label;
            Currency quoteCurrency = this.cryptoOrderContext.getRequestContext().getCurrencyPair().getQuoteCurrency();
            BigDecimal bigDecimalNegate = ((StreamGainLossAmountResponseDto.GainLossContentDto.TypeDto.EstimatedLossContent) type2).getValue().getEstimated_loss_quote_amount().toBigDecimalOrThrow().negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
            textContent = new CryptoOrderReviewRowState.TextContent(companion.invoke(i, CurrencyDefinitions.formatCurrency$default(quoteCurrency, bigDecimalNegate, false, false, null, 0, null, Boolean.TRUE, false, true, false, false, 1726, null)), CryptoOrderReviewRowState.ColorOverride.NEGATIVE, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        CryptoOrderReviewRowState.TextContent textContent2 = new CryptoOrderReviewRowState.TextContent(companion2.invoke(this.cryptoOrderPrices instanceof CryptoOrderPrices.Market ? C40095R.string.crypto_tax_lot_order_input_total_credit_label : C40095R.string.crypto_tax_lot_order_input_estimated_credit_label, new Object[0]), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        int i2 = 1;
        boolean z = cryptoOrderContext == null;
        if (cryptoOrderContext == null || (stringResourceInvoke = companion2.invoke(CurrencyDefinitions.formatCurrency$default(cryptoOrderContext.getRequestContext().getCurrencyPair().getQuoteCurrency(), cryptoOrderContext.getOrderInfo().getUncollaredTotalCost(), false, false, null, 0, null, null, false, false, false, false, 2046, null))) == null) {
            stringResourceInvoke = companion2.invoke("----------");
        }
        CryptoOrderReviewRowState.TextContent textContent3 = new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, null, null, null, FontWeight.INSTANCE.getBold(), z, 30, null);
        if (textContent != null) {
            immutableList3PersistentListOf = extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(objArr2 == true ? 1 : 0, textContent, i2, objArr == true ? 1 : 0));
        }
        return new CryptoOrderReviewRowState(textContent2, textContent3, null, immutableList3PersistentListOf, null, false, null, false, null, null, 980, null);
    }

    public final StringResource getFooterMessage() {
        StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto = this.selectedStrategyDto;
        if (streamSelectedTaxLotStrategyResponseDto != null && streamSelectedTaxLotStrategyResponseDto.getStrategy_type() == TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_CUSTOM) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_order_input_footer_message, new Object[0]);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isCtaEnabled() {
        boolean zM2978gt;
        boolean zM2978gt2;
        CryptoOrderPrices cryptoOrderPrices = this.cryptoOrderPrices;
        if (cryptoOrderPrices instanceof CryptoOrderPrices.Market) {
            zM2978gt = true;
        } else {
            if (!(cryptoOrderPrices instanceof CryptoOrderPrices.Limit)) {
                if (cryptoOrderPrices instanceof CryptoOrderPrices.StopLoss) {
                    throw new IllegalStateException("Tax lots for stop loss orders not supported");
                }
                if (cryptoOrderPrices instanceof CryptoOrderPrices.StopLimit) {
                    throw new IllegalStateException("Tax lots for stop limit orders not supported");
                }
                throw new NoWhenBranchMatchedException();
            }
            zM2978gt = BigDecimals7.m2978gt(((CryptoOrderPrices.Limit) cryptoOrderPrices).getLimitPrice(), BigDecimal.ZERO);
        }
        StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto = this.selectedStrategyDto;
        TaxLotStrategyTypeDto strategy_type = streamSelectedTaxLotStrategyResponseDto != null ? streamSelectedTaxLotStrategyResponseDto.getStrategy_type() : null;
        int i = strategy_type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[strategy_type.ordinal()];
        if (i == -1) {
            zM2978gt2 = false;
        } else if (i == 1) {
            zM2978gt2 = true;
        } else if (i != 2) {
            zM2978gt2 = BigDecimals7.m2978gt(this.assetAmount, BigDecimal.ZERO);
        }
        return zM2978gt && zM2978gt2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CryptoOrderAnimatedBentoNumpadState getNumpadState() {
        StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto;
        boolean z = true;
        boolean z2 = (this.cryptoOrderPrices.getOrderType() == CryptoOrderType.MARKET && ((streamSelectedTaxLotStrategyResponseDto = this.selectedStrategyDto) == null || streamSelectedTaxLotStrategyResponseDto.getStrategy_type() == TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_CUSTOM)) ? false : true;
        if (this.cryptoOrderContext != null && this.focusedInputField != null) {
            char monetaryDecimalSeparator = Locales2.getMonetaryDecimalSeparator(CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale());
            UiCurrencyPair currencyPair = this.cryptoOrderContext.getRequestContext().getCurrencyPair();
            InputField inputField = this.focusedInputField;
            int i = inputField == null ? -1 : WhenMappings.$EnumSwitchMapping$3[inputField.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (UiCurrencyPairs2.allowDecimalInput(currencyPair, CryptoInputMode.ASSET_CURRENCY)) {
                    String str = this.formattedAssetAmount;
                    if (StringsKt.contains$default((CharSequence) (str != null ? str : ""), monetaryDecimalSeparator, false, 2, (Object) null)) {
                    }
                } else {
                    z = false;
                }
            } else if (UiCurrencyPairs2.allowDecimalInput(currencyPair, CryptoInputMode.QUOTE_CURRENCY)) {
                String str2 = this.formattedLimitPrice;
                if (StringsKt.contains$default((CharSequence) (str2 != null ? str2 : ""), monetaryDecimalSeparator, false, 2, (Object) null)) {
                }
            }
        }
        return new CryptoOrderAnimatedBentoNumpadState(z2, false, z, null, 10, null);
    }

    public final String getSelectedTaxLotStrategyIdentifier() {
        TaxLotStrategyTypeDto strategy_type;
        StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto = this.selectedStrategyDto;
        String json_value = (streamSelectedTaxLotStrategyResponseDto == null || (strategy_type = streamSelectedTaxLotStrategyResponseDto.getStrategy_type()) == null) ? null : strategy_type.getJson_value();
        return json_value == null ? "" : json_value;
    }

    public final ImmutableList<BottomSheetTypeDto> getBottomSheetTypeDtos() {
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        return extensions2.toPersistentList(CollectionsKt.listOfNotNull(cryptoOrderContext != null ? CryptoOrderContexts.getLimitOrderDefinitionBottomSheetTypeDto(cryptoOrderContext) : null));
    }

    public final CryptoTradeAccountSwitcherDropdownArgs getAccountSwitcherArgs() {
        if (this.isMibExperimentEnabled) {
            return new CryptoTradeAccountSwitcherDropdownArgs(this.currencyPairId, CryptoTradeAccountSwitcherDropdownArgs.Source.TAX_LOT_ORDER, OrderSide.SELL);
        }
        return null;
    }
}
