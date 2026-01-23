package com.robinhood.shared.trade.crypto.p397ui.extensions;

import android.content.res.Resources;
import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.Quote;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.shared.crypto.p375ui.extensions.OrderSides2;
import com.robinhood.shared.crypto.utils.CryptoInputModes;
import com.robinhood.shared.crypto.utils.MonetizationModels;
import com.robinhood.shared.crypto.utils.OrderSides3;
import com.robinhood.shared.crypto.utils.OrderTimeInForces2;
import com.robinhood.shared.crypto.utils.UiCurrencyPairs2;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import contracts.crypto.trade.proto.p431v1.CalculateCryptoMarketOrderPillsRequestDto;
import contracts.crypto.trade.proto.p431v1.OrderPricesDto;
import contracts.crypto.trade.proto.p431v1.UserInputsDto;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderRequestDto;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rosetta.nummus.CurrencyPairDto;
import rosetta.nummus.MonetizationModelDto;
import rosetta.nummus.order.InputModeDto;
import rosetta.nummus.order.SideDto;
import rosetta.nummus.order.TimeInForceDto;
import rosetta.nummus.order.TypeDto;

/* compiled from: CryptoOrderContexts.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0001\u001a(\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0015\u0010\f\u001a\u00020\r*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u001b\u001a\u00020\u001c*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0015\u0010\u001f\u001a\u00020 *\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0015\u0010#\u001a\u00020 *\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\"\"\u0015\u0010%\u001a\u00020 *\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\"¨\u0006'"}, m3636d2 = {"getReviewMessage", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "isRhcApp", "", "rhcReviewMessage", "CURRENCY_PAIR_IDS_WITH_INTEGRATION_FEES_DISCLOSURES", "", "Ljava/util/UUID;", "traderReviewMessage", "timeInForceGoodForStringResource", "Lcom/robinhood/models/db/OrderTimeInForce;", "userInputsDto", "Lcontracts/crypto/trade/proto/v1/UserInputsDto;", "getUserInputsDto", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)Lcontracts/crypto/trade/proto/v1/UserInputsDto;", "cryptoPowerText", "getCryptoPowerText", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)Lcom/robinhood/utils/resource/StringResource;", "validateCryptoOrderRequestDto", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto;", "validationSourceDto", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;", "acknowledgeId", "", "resources", "Landroid/content/res/Resources;", "calculateCryptoMarketOrderPillsRequestDto", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto;", "getCalculateCryptoMarketOrderPillsRequestDto", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto;", "spreadBottomSheetTypeDto", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "getSpreadBottomSheetTypeDto", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "marketPriceBottomSheetTypeDto", "getMarketPriceBottomSheetTypeDto", "limitOrderDefinitionBottomSheetTypeDto", "getLimitOrderDefinitionBottomSheetTypeDto", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.extensions.CryptoOrderContextsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderContexts {
    private static final Set<UUID> CURRENCY_PAIR_IDS_WITH_INTEGRATION_FEES_DISCLOSURES = SetsKt.setOf((Object[]) new UUID[]{StringsKt.toUuid("d1b046e6-1fd6-4890-b0d8-77032d15e6b3"), StringsKt.toUuid("bf36b6fb-b07f-4eaf-8784-f22ee9084e44"), StringsKt.toUuid("381d6918-c7d7-4be3-b104-d59be08f53f1"), StringsKt.toUuid("2370cdae-086b-4a1c-a42a-71f25139018e"), StringsKt.toUuid("8f8e9726-2a4e-4d7b-b620-fd3c459e7d57"), StringsKt.toUuid("c3a2d7e6-5d87-4ad5-a23a-dbb24378c074"), StringsKt.toUuid("9482b627-6504-45f9-86b7-f80d1adf04ed"), StringsKt.toUuid("293abf0f-24b7-4bf3-84a1-2930e1ed0a9c"), StringsKt.toUuid("b6717016-b60c-4111-9da9-87970c6b7237")});

    /* compiled from: CryptoOrderContexts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.extensions.CryptoOrderContextsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

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
            int[] iArr2 = new int[MonetizationModel.values().length];
            try {
                iArr2[MonetizationModel.FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MonetizationModel.REBATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrderTimeInForce.values().length];
            try {
                iArr3[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[OrderTimeInForce.GFW.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[OrderTimeInForce.GFM.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[OrderTimeInForce.GTC.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OrderTimeInForce.OPG.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OrderTimeInForce.FOK.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OrderTimeInForce.IOC.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CryptoInputMode.values().length];
            try {
                iArr4[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[CryptoOrderType.values().length];
            try {
                iArr5[CryptoOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[CryptoOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final StringResource getReviewMessage(CryptoOrderContext cryptoOrderContext, boolean z) {
        Intrinsics.checkNotNullParameter(cryptoOrderContext, "<this>");
        if (z) {
            return rhcReviewMessage(cryptoOrderContext);
        }
        return traderReviewMessage(cryptoOrderContext);
    }

    private static final StringResource rhcReviewMessage(CryptoOrderContext cryptoOrderContext) {
        int i;
        int i2;
        int i3;
        int i4;
        BigDecimal feeRatio;
        UiCurrencyPair currencyPair = cryptoOrderContext.getRequestContext().getCurrencyPair();
        Currency assetCurrency = currencyPair.getAssetCurrency();
        Currency assetCurrencyForCost = currencyPair.getAssetCurrencyForCost();
        Currency quoteCurrencyForPriceInput = currencyPair.getQuoteCurrencyForPriceInput();
        UiFeeEstimation uiFeeEstimation = cryptoOrderContext.getRequestContext().getUiFeeEstimation();
        boolean z = false;
        if (uiFeeEstimation != null && (feeRatio = uiFeeEstimation.getFeeRatio()) != null && BigDecimals7.isPositive(feeRatio)) {
            z = true;
        }
        CryptoOrderPrices orderPrices = cryptoOrderContext.getRequestContext().getRequestInputs().getOrderPrices();
        if (orderPrices instanceof CryptoOrderPrices.Market) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i5 = WhenMappings.$EnumSwitchMapping$0[cryptoOrderContext.getRequest().getSide().ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z) {
                    i4 = C40095R.string.rhc_crypto_order_create_summary_market_sell_fee;
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = C40095R.string.rhc_crypto_order_create_summary_market_sell;
                }
            } else if (z) {
                i4 = C40095R.string.rhc_crypto_order_create_summary_market_buy_fee;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = C40095R.string.rhc_crypto_order_create_summary_market_buy;
            }
            return companion.invoke(i4, CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }
        if (orderPrices instanceof CryptoOrderPrices.Limit) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            int i6 = WhenMappings.$EnumSwitchMapping$0[cryptoOrderContext.getRequest().getSide().ordinal()];
            if (i6 == 1) {
                i3 = C40095R.string.crypto_limit_order_create_summary_buy_rhc;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = C40095R.string.crypto_limit_order_create_summary_sell_rhc;
            }
            return companion2.invoke(i3, CurrencyDefinitions.formatCurrency$default(assetCurrency, cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null), assetCurrency.getCode(), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, cryptoOrderContext.getOrderInfo().getUncollaredPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }
        if (orderPrices instanceof CryptoOrderPrices.StopLoss) {
            StringResource.Companion companion3 = StringResource.INSTANCE;
            int i7 = WhenMappings.$EnumSwitchMapping$0[cryptoOrderContext.getRequest().getSide().ordinal()];
            if (i7 == 1) {
                i2 = C40095R.string.rhc_crypto_order_create_summary_stop_loss_buy;
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C40095R.string.rhc_crypto_order_create_summary_stop_loss_sell;
            }
            return companion3.invoke(i2, CurrencyDefinitions.formatCurrency$default(assetCurrency, cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null), assetCurrency.getCode(), timeInForceGoodForStringResource(cryptoOrderContext.getRequest().getTimeInForce()), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, cryptoOrderContext.getOrderInfo().getUncollaredPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }
        if (!(orderPrices instanceof CryptoOrderPrices.StopLimit)) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource.Companion companion4 = StringResource.INSTANCE;
        int i8 = WhenMappings.$EnumSwitchMapping$0[cryptoOrderContext.getRequest().getSide().ordinal()];
        if (i8 == 1) {
            i = C40095R.string.rhc_crypto_order_create_summary_stop_limit_buy;
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C40095R.string.rhc_crypto_order_create_summary_stop_limit_sell;
        }
        return companion4.invoke(i, CurrencyDefinitions.formatCurrency$default(assetCurrency, cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null), assetCurrency.getCode(), timeInForceGoodForStringResource(cryptoOrderContext.getRequest().getTimeInForce()), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, ((CryptoOrderPrices.StopLimit) orderPrices).getStopPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, cryptoOrderContext.getOrderInfo().getUncollaredPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    private static final StringResource traderReviewMessage(CryptoOrderContext cryptoOrderContext) {
        UiCurrencyPair uiCurrencyPair;
        int i;
        StringResource stringResourceInvoke;
        int i2;
        int i3;
        int i4;
        int i5;
        UiCurrencyPair currencyPair = cryptoOrderContext.getRequestContext().getCurrencyPair();
        Currency assetCurrency = currencyPair.getAssetCurrency();
        Currency assetCurrencyForCost = currencyPair.getAssetCurrencyForCost();
        Currency quoteCurrencyForPriceInput = currencyPair.getQuoteCurrencyForPriceInput();
        MonetizationModel monetizationModel = cryptoOrderContext.getRequestContext().getRequestInputs().getMonetizationModel();
        CryptoOrderPrices orderPrices = cryptoOrderContext.getRequestContext().getRequestInputs().getOrderPrices();
        if (orderPrices instanceof CryptoOrderPrices.Limit) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i6 = WhenMappings.$EnumSwitchMapping$0[cryptoOrderContext.getRequest().getSide().ordinal()];
            if (i6 == 1) {
                int i7 = WhenMappings.$EnumSwitchMapping$1[monetizationModel.ordinal()];
                if (i7 == 1) {
                    i5 = C40095R.string.crypto_order_create_summary_limit_buy_rebrand_fees;
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C40095R.string.crypto_order_create_summary_limit_buy_rebrand;
                }
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i8 = WhenMappings.$EnumSwitchMapping$1[monetizationModel.ordinal()];
                if (i8 == 1) {
                    i5 = C40095R.string.crypto_order_create_summary_limit_sell_rebrand_fees;
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C40095R.string.crypto_order_create_summary_limit_sell_rebrand;
                }
            }
            stringResourceInvoke = companion.invoke(i5, CurrencyDefinitions.formatCurrency$default(assetCurrency, cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null), assetCurrency.getCode(), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, cryptoOrderContext.getOrderInfo().getUncollaredPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            uiCurrencyPair = currencyPair;
        } else if (orderPrices instanceof CryptoOrderPrices.StopLoss) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            int i9 = WhenMappings.$EnumSwitchMapping$0[cryptoOrderContext.getRequest().getSide().ordinal()];
            if (i9 == 1) {
                int i10 = WhenMappings.$EnumSwitchMapping$1[monetizationModel.ordinal()];
                if (i10 == 1) {
                    i4 = C40095R.string.crypto_order_create_summary_stop_loss_buy_rebrand_fees;
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = C40095R.string.crypto_order_create_summary_stop_loss_buy_rebrand;
                }
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i11 = WhenMappings.$EnumSwitchMapping$1[monetizationModel.ordinal()];
                if (i11 == 1) {
                    i4 = C40095R.string.crypto_order_create_summary_stop_loss_sell_rebrand_fees;
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = C40095R.string.crypto_order_create_summary_stop_loss_sell_rebrand;
                }
            }
            uiCurrencyPair = currencyPair;
            stringResourceInvoke = companion2.invoke(i4, CurrencyDefinitions.formatCurrency$default(assetCurrency, cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null), assetCurrency.getCode(), timeInForceGoodForStringResource(cryptoOrderContext.getRequest().getTimeInForce()), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, cryptoOrderContext.getOrderInfo().getUncollaredPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        } else {
            uiCurrencyPair = currencyPair;
            if (orderPrices instanceof CryptoOrderPrices.StopLimit) {
                StringResource.Companion companion3 = StringResource.INSTANCE;
                int i12 = WhenMappings.$EnumSwitchMapping$0[cryptoOrderContext.getRequest().getSide().ordinal()];
                if (i12 == 1) {
                    int i13 = WhenMappings.$EnumSwitchMapping$1[monetizationModel.ordinal()];
                    if (i13 == 1) {
                        i3 = C40095R.string.crypto_order_create_summary_stop_limit_buy_rebrand_fees;
                    } else {
                        if (i13 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = C40095R.string.crypto_order_create_summary_stop_limit_buy_rebrand;
                    }
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i14 = WhenMappings.$EnumSwitchMapping$1[monetizationModel.ordinal()];
                    if (i14 == 1) {
                        i3 = C40095R.string.crypto_order_create_summary_stop_limit_sell_rebrand_fees;
                    } else {
                        if (i14 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = C40095R.string.crypto_order_create_summary_stop_limit_sell_rebrand;
                    }
                }
                stringResourceInvoke = companion3.invoke(i3, CurrencyDefinitions.formatCurrency$default(assetCurrency, cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null), assetCurrency.getCode(), timeInForceGoodForStringResource(cryptoOrderContext.getRequest().getTimeInForce()), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, ((CryptoOrderPrices.StopLimit) orderPrices).getStopPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, cryptoOrderContext.getOrderInfo().getUncollaredPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            } else {
                if (!(orderPrices instanceof CryptoOrderPrices.Market)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i15 = WhenMappings.$EnumSwitchMapping$0[cryptoOrderContext.getRequest().getSide().ordinal()];
                if (i15 == 1) {
                    StringResource.Companion companion4 = StringResource.INSTANCE;
                    int i16 = WhenMappings.$EnumSwitchMapping$1[monetizationModel.ordinal()];
                    if (i16 == 1) {
                        i = C40095R.string.crypto_order_create_summary_market_buy_fees_rebrand;
                    } else {
                        if (i16 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = C40095R.string.crypto_order_create_summary_market_buy_rebrand;
                    }
                    stringResourceInvoke = companion4.invoke(i, CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StringResource.Companion companion5 = StringResource.INSTANCE;
                    int i17 = WhenMappings.$EnumSwitchMapping$1[monetizationModel.ordinal()];
                    if (i17 == 1) {
                        i2 = C40095R.string.crypto_order_create_summary_market_sell_fees_rebrand;
                    } else {
                        if (i17 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = C40095R.string.crypto_order_create_summary_market_sell_rebrand;
                    }
                    stringResourceInvoke = companion5.invoke(i2, CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
                }
            }
        }
        if (CURRENCY_PAIR_IDS_WITH_INTEGRATION_FEES_DISCLOSURES.contains(uiCurrencyPair.getId())) {
            return new StringResource.Join(CollectionsKt.listOf((Object[]) new StringResource[]{stringResourceInvoke, StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_summary_integration_fees_disclosure_suffix, new Object[0])}), PlaceholderUtils.XXShortPlaceholderText);
        }
        return new StringResource.Join(CollectionsKt.listOf((Object[]) new StringResource[]{stringResourceInvoke, StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_summary_default_suffix, new Object[0])}), PlaceholderUtils.XXShortPlaceholderText);
    }

    public static final StringResource timeInForceGoodForStringResource(OrderTimeInForce orderTimeInForce) {
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[orderTimeInForce.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C40095R.string.time_in_force_24_hours, new Object[0]);
            case 2:
                return StringResource.INSTANCE.invoke(C40095R.string.time_in_force_7_days, new Object[0]);
            case 3:
                return StringResource.INSTANCE.invoke(C40095R.string.time_in_force_30_days, new Object[0]);
            case 4:
                return StringResource.INSTANCE.invoke(C40095R.string.time_in_force_90_days, new Object[0]);
            case 5:
                throw new IllegalStateException("OPG time in force not supported");
            case 6:
                throw new IllegalStateException("FOK time in force not supported");
            case 7:
                throw new IllegalStateException("IOC time in force not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final UserInputsDto getUserInputsDto(CryptoOrderContext cryptoOrderContext) {
        IdlDecimal idlDecimal;
        UserInputsDto.CryptoOrderPricesDto.PricesDto stopLoss;
        BigDecimal feeRatio;
        Intrinsics.checkNotNullParameter(cryptoOrderContext, "<this>");
        SideDto sideDto = OrderSides3.getSideDto(cryptoOrderContext.getRequestContext().getRequestInputs().getSide());
        InputModeDto dto = CryptoInputModes.getDto(cryptoOrderContext.getRequestContext().getRequestInputs().getInputMode());
        MonetizationModelDto dto2 = MonetizationModels.getDto(cryptoOrderContext.getRequestContext().getRequestInputs().getMonetizationModel());
        RequestInputs requestInputs = cryptoOrderContext.getRequestContext().getRequestInputs();
        if (requestInputs instanceof RequestInputs.AsAsset) {
            idlDecimal = IdlDecimal2.toIdlDecimal(((RequestInputs.AsAsset) requestInputs).getPurchaseSize());
        } else {
            if (!(requestInputs instanceof RequestInputs.AsQuote)) {
                throw new NoWhenBranchMatchedException();
            }
            idlDecimal = IdlDecimal2.toIdlDecimal(((RequestInputs.AsQuote) requestInputs).getPurchaseCost());
        }
        IdlDecimal idlDecimal2 = idlDecimal;
        CryptoOrderPrices orderPrices = cryptoOrderContext.getRequestContext().getRequestInputs().getOrderPrices();
        if (orderPrices instanceof CryptoOrderPrices.Limit) {
            BigDecimal limitPrice = ((CryptoOrderPrices.Limit) orderPrices).getLimitPrice();
            if (BigDecimals7.m2977eq(limitPrice, BigDecimal.ZERO)) {
                limitPrice = null;
            }
            stopLoss = new UserInputsDto.CryptoOrderPricesDto.PricesDto.Limit(new UserInputsDto.CryptoOrderPricesDto.LimitDto(limitPrice != null ? IdlDecimal2.toIdlDecimal(limitPrice) : null));
        } else if (orderPrices instanceof CryptoOrderPrices.Market) {
            stopLoss = new UserInputsDto.CryptoOrderPricesDto.PricesDto.Market(new UserInputsDto.CryptoOrderPricesDto.MarketDto());
        } else if (orderPrices instanceof CryptoOrderPrices.StopLimit) {
            CryptoOrderPrices.StopLimit stopLimit = (CryptoOrderPrices.StopLimit) orderPrices;
            BigDecimal limitPrice2 = stopLimit.getLimitPrice();
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (BigDecimals7.m2977eq(limitPrice2, bigDecimal)) {
                limitPrice2 = null;
            }
            IdlDecimal idlDecimal3 = limitPrice2 != null ? IdlDecimal2.toIdlDecimal(limitPrice2) : null;
            BigDecimal stopPrice = stopLimit.getStopPrice();
            if (BigDecimals7.m2977eq(stopPrice, bigDecimal)) {
                stopPrice = null;
            }
            stopLoss = new UserInputsDto.CryptoOrderPricesDto.PricesDto.StopLimit(new UserInputsDto.CryptoOrderPricesDto.StopLimitDto(idlDecimal3, stopPrice != null ? IdlDecimal2.toIdlDecimal(stopPrice) : null));
        } else {
            if (!(orderPrices instanceof CryptoOrderPrices.StopLoss)) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal stopPrice2 = ((CryptoOrderPrices.StopLoss) orderPrices).getStopPrice();
            if (BigDecimals7.m2977eq(stopPrice2, BigDecimal.ZERO)) {
                stopPrice2 = null;
            }
            stopLoss = new UserInputsDto.CryptoOrderPricesDto.PricesDto.StopLoss(new UserInputsDto.CryptoOrderPricesDto.StopLossDto(stopPrice2 != null ? IdlDecimal2.toIdlDecimal(stopPrice2) : null));
        }
        UserInputsDto.CryptoOrderPricesDto cryptoOrderPricesDto = new UserInputsDto.CryptoOrderPricesDto(stopLoss);
        TimeInForceDto dto3 = OrderTimeInForces2.getDto(cryptoOrderContext.getRequestContext().getRequestInputs().getTimeInForce());
        IdlDecimal idlDecimal4 = IdlDecimal2.toIdlDecimal(cryptoOrderContext.getOrderInfo().getDisplayQuantity());
        UiFeeEstimation uiFeeEstimation = cryptoOrderContext.getRequestContext().getUiFeeEstimation();
        return new UserInputsDto(dto, sideDto, dto2, idlDecimal2, cryptoOrderPricesDto, dto3, idlDecimal4, (uiFeeEstimation == null || (feeRatio = uiFeeEstimation.getFeeRatio()) == null) ? null : IdlDecimal2.toIdlDecimal(feeRatio));
    }

    public static final StringResource getCryptoPowerText(CryptoOrderContext cryptoOrderContext) {
        Money buyingPower;
        BigDecimal decimalValue;
        Intrinsics.checkNotNullParameter(cryptoOrderContext, "<this>");
        OrderSide side = cryptoOrderContext.getRequest().getSide();
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoOrderContext.getRequest().getSide().ordinal()];
        if (i == 1) {
            CryptoBuyingPower cryptoBuyingPower = cryptoOrderContext.getAccountContext().getCryptoBuyingPower();
            if (cryptoBuyingPower == null || (buyingPower = cryptoBuyingPower.getBuyingPower()) == null || (decimalValue = buyingPower.getDecimalValue()) == null) {
                return null;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = WhenMappings.$EnumSwitchMapping$3[cryptoOrderContext.getRequestContext().getRequestInputs().getInputMode().ordinal()];
            if (i2 == 1) {
                BigDecimal decimalValue2 = cryptoOrderContext.getRequestContext().getQuote().getBidPrice().getDecimalValue();
                UiCryptoHolding holding = cryptoOrderContext.getRequestContext().getHolding();
                decimalValue = decimalValue2.multiply(BigDecimals7.orZero(holding != null ? holding.getQuantityAvailable() : null));
                Intrinsics.checkNotNullExpressionValue(decimalValue, "multiply(...)");
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                UiCryptoHolding holding2 = cryptoOrderContext.getRequestContext().getHolding();
                decimalValue = BigDecimals7.orZero(holding2 != null ? holding2.getQuantityAvailable() : null);
            }
        }
        return OrderSides2.cryptoPowerText$default(side, decimalValue, null, cryptoOrderContext.getRequestContext().getRequestInputs().getInputMode(), cryptoOrderContext.getRequestContext().getCurrencyPair(), 2, null);
    }

    public static /* synthetic */ ValidateCryptoOrderRequestDto validateCryptoOrderRequestDto$default(CryptoOrderContext cryptoOrderContext, ValidateCryptoOrderRequestDto.ValidationSourceDto validationSourceDto, String str, Resources resources, int i, Object obj) {
        if ((i & 1) != 0) {
            validationSourceDto = new ValidateCryptoOrderRequestDto.ValidationSourceDto(new ValidateCryptoOrderRequestDto.ValidationSourceDto.TypeDto.Default(new ValidateCryptoOrderRequestDto.ValidationSourceDto.DefaultDto()));
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return validateCryptoOrderRequestDto(cryptoOrderContext, validationSourceDto, str, resources);
    }

    public static final ValidateCryptoOrderRequestDto validateCryptoOrderRequestDto(CryptoOrderContext cryptoOrderContext, ValidateCryptoOrderRequestDto.ValidationSourceDto validationSourceDto, String str, Resources resources) throws Resources.NotFoundException {
        ValidateCryptoOrderRequestDto.OrderContextDto.OrderSideDto.TypeDto buy;
        Money buyingPower;
        BigDecimal decimalValue;
        OrderPricesDto.PricesDto stopLoss;
        ValidateCryptoOrderRequestDto.OrderContextDto.UserInputsDto.TypeDto quote;
        BrokerageAccountType brokerageAccountType;
        Intrinsics.checkNotNullParameter(cryptoOrderContext, "<this>");
        Intrinsics.checkNotNullParameter(validationSourceDto, "validationSourceDto");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoOrderContext.getRequest().getSide().ordinal()];
        IdlDecimal idlDecimal = null;
        idlDecimal = null;
        idlDecimal = null;
        if (i == 1) {
            CryptoBuyingPower cryptoBuyingPower = cryptoOrderContext.getAccountContext().getCryptoBuyingPower();
            if (cryptoBuyingPower != null && (buyingPower = cryptoBuyingPower.getBuyingPower()) != null && (decimalValue = buyingPower.getDecimalValue()) != null) {
                idlDecimal = IdlDecimal2.toIdlDecimal(decimalValue);
            }
            buy = new ValidateCryptoOrderRequestDto.OrderContextDto.OrderSideDto.TypeDto.Buy(new ValidateCryptoOrderRequestDto.OrderContextDto.OrderSideDto.BuyDto(idlDecimal, null, null, 6, null));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            UiCryptoHolding holding = cryptoOrderContext.getRequestContext().getHolding();
            buy = new ValidateCryptoOrderRequestDto.OrderContextDto.OrderSideDto.TypeDto.Sell(new ValidateCryptoOrderRequestDto.OrderContextDto.OrderSideDto.SellDto(IdlDecimal2.toIdlDecimal(BigDecimals7.orZero(holding != null ? holding.getQuantityAvailable() : null)), IdlDecimal2.toIdlDecimal(BigDecimals7.orZero(holding != null ? holding.getQuantityHeldForBuy() : null)), IdlDecimal2.toIdlDecimal(BigDecimals7.orZero(holding != null ? holding.getQuantityHeldForSell() : null))));
        }
        ValidateCryptoOrderRequestDto.OrderContextDto.OrderSideDto orderSideDto = new ValidateCryptoOrderRequestDto.OrderContextDto.OrderSideDto(buy);
        boolean z = cryptoOrderContext.getAccountContext().getCryptoAccount() != null;
        ValidateCryptoOrderRequestDto.OrderContextDto.QuoteDto quoteDto = new ValidateCryptoOrderRequestDto.OrderContextDto.QuoteDto(IdlDecimal2.toIdlDecimal(cryptoOrderContext.getRequestContext().getQuote().getAskPrice().getDecimalValue()), IdlDecimal2.toIdlDecimal(cryptoOrderContext.getRequestContext().getQuote().getBidPrice().getDecimalValue()), IdlDecimal2.toIdlDecimal(cryptoOrderContext.getRequestContext().getQuote().getMidPrice().getDecimalValue()));
        CryptoOrderPrices orderPrices = cryptoOrderContext.getRequestContext().getRequestInputs().getOrderPrices();
        if (orderPrices instanceof CryptoOrderPrices.Limit) {
            stopLoss = new OrderPricesDto.PricesDto.Limit(new OrderPricesDto.LimitDto(IdlDecimal2.toIdlDecimal(((CryptoOrderPrices.Limit) orderPrices).getLimitPrice())));
        } else if (orderPrices instanceof CryptoOrderPrices.Market) {
            stopLoss = new OrderPricesDto.PricesDto.Market(new OrderPricesDto.MarketDto());
        } else if (orderPrices instanceof CryptoOrderPrices.StopLimit) {
            CryptoOrderPrices.StopLimit stopLimit = (CryptoOrderPrices.StopLimit) orderPrices;
            stopLoss = new OrderPricesDto.PricesDto.StopLimit(new OrderPricesDto.StopLimitDto(IdlDecimal2.toIdlDecimal(stopLimit.getLimitPrice()), IdlDecimal2.toIdlDecimal(stopLimit.getStopPrice())));
        } else {
            if (!(orderPrices instanceof CryptoOrderPrices.StopLoss)) {
                throw new NoWhenBranchMatchedException();
            }
            stopLoss = new OrderPricesDto.PricesDto.StopLoss(new OrderPricesDto.StopLossDto(IdlDecimal2.toIdlDecimal(((CryptoOrderPrices.StopLoss) orderPrices).getStopPrice())));
        }
        OrderPricesDto orderPricesDto = new OrderPricesDto(stopLoss);
        CurrencyPairDto dto = UiCurrencyPairs2.toDto(cryptoOrderContext.getRequestContext().getCurrencyPair());
        RequestInputs requestInputs = cryptoOrderContext.getRequestContext().getRequestInputs();
        if (requestInputs instanceof RequestInputs.AsAsset) {
            quote = new ValidateCryptoOrderRequestDto.OrderContextDto.UserInputsDto.TypeDto.Asset(new ValidateCryptoOrderRequestDto.OrderContextDto.UserInputsDto.AssetDto(IdlDecimal2.toIdlDecimal(((RequestInputs.AsAsset) requestInputs).getPurchaseSize())));
        } else {
            if (!(requestInputs instanceof RequestInputs.AsQuote)) {
                throw new NoWhenBranchMatchedException();
            }
            quote = new ValidateCryptoOrderRequestDto.OrderContextDto.UserInputsDto.TypeDto.Quote(new ValidateCryptoOrderRequestDto.OrderContextDto.UserInputsDto.QuoteDto(IdlDecimal2.toIdlDecimal(((RequestInputs.AsQuote) requestInputs).getPurchaseCost())));
        }
        ValidateCryptoOrderRequestDto.OrderContextDto.UserInputsDto userInputsDto = new ValidateCryptoOrderRequestDto.OrderContextDto.UserInputsDto(quote);
        ValidateCryptoOrderRequestDto.OrderContextDto.OrderInfoDto orderInfoDto = new ValidateCryptoOrderRequestDto.OrderContextDto.OrderInfoDto(IdlDecimal2.toIdlDecimal(cryptoOrderContext.getRequest().getOrderQuantity()), IdlDecimal2.toIdlDecimal(cryptoOrderContext.getOrderInfo().getUncollaredTotalCost()), IdlDecimal2.toIdlDecimal(cryptoOrderContext.getOrderInfo().getCollaredPrice()));
        MonetizationModelDto dto2 = MonetizationModels.getDto(cryptoOrderContext.getRequestContext().getRequestInputs().getMonetizationModel());
        CryptoOrderContext.AccountContext accountContext = cryptoOrderContext.getAccountContext();
        IdlDecimal idlDecimal2 = IdlDecimal2.toIdlDecimal(accountContext.getUnifiedBalances().getBrokerageBalances().getPortfolio().getEquity());
        boolean zIsPatternDayTrader = accountContext.getUnifiedBalances().getBrokerageBalances().isPatternDayTrader();
        boolean zIsMargin = accountContext.getUnifiedBalances().getBrokerageBalances().isMargin();
        UnifiedAccountV2 unifiedAccount = accountContext.getUnifiedAccount();
        String string2 = resources.getString((unifiedAccount == null || (brokerageAccountType = unifiedAccount.getBrokerageAccountType()) == null) ? C8179R.string.account_type_individual : BrokerageAccountTypes2.getDisplayNameShortRes(brokerageAccountType));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Boolean boolIsMarginInvestingEnabled = accountContext.isMarginInvestingEnabled();
        return new ValidateCryptoOrderRequestDto(new ValidateCryptoOrderRequestDto.OrderContextDto(orderSideDto, z, quoteDto, orderPricesDto, dto, userInputsDto, orderInfoDto, dto2, new ValidateCryptoOrderRequestDto.OrderContextDto.AccountInfoDto(idlDecimal2, zIsPatternDayTrader, zIsMargin, string2, boolIsMarginInvestingEnabled != null ? boolIsMarginInvestingEnabled.booleanValue() : false, accountContext.getUnifiedBalances().isLevered()), cryptoOrderContext.getRequestContext().getRequestInputs().getHasSeenPdtWarning(), null, 1024, null), validationSourceDto, str);
    }

    public static final CalculateCryptoMarketOrderPillsRequestDto getCalculateCryptoMarketOrderPillsRequestDto(CryptoOrderContext cryptoOrderContext) {
        CalculateCryptoMarketOrderPillsRequestDto.OrderSideDto.TypeDto buy;
        Money buyingPower;
        Intrinsics.checkNotNullParameter(cryptoOrderContext, "<this>");
        String string2 = cryptoOrderContext.getRequestContext().getCurrencyPair().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoOrderContext.getRequest().getSide().ordinal()];
        if (i == 1) {
            CryptoBuyingPower cryptoBuyingPower = cryptoOrderContext.getAccountContext().getCryptoBuyingPower();
            if (cryptoBuyingPower != null && (buyingPower = cryptoBuyingPower.getBuyingPower()) != null) {
                decimalValue = buyingPower.getDecimalValue();
            }
            buy = new CalculateCryptoMarketOrderPillsRequestDto.OrderSideDto.TypeDto.Buy(new CalculateCryptoMarketOrderPillsRequestDto.OrderSideDto.BuyDto(IdlDecimal2.toIdlDecimal(BigDecimals7.orZero(decimalValue)), IdlDecimal2.toIdlDecimal(cryptoOrderContext.getRequestContext().getCurrencyPair().getMaxOrderSize())));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            UiCryptoHolding holding = cryptoOrderContext.getRequestContext().getHolding();
            buy = new CalculateCryptoMarketOrderPillsRequestDto.OrderSideDto.TypeDto.Sell(new CalculateCryptoMarketOrderPillsRequestDto.OrderSideDto.SellDto(IdlDecimal2.toIdlDecimal(BigDecimals7.orZero(holding != null ? holding.getQuantityAvailable() : null)), IdlDecimal2.toIdlDecimal(cryptoOrderContext.getRequestContext().getQuote().getAskPrice().getDecimalValue()), IdlDecimal2.toIdlDecimal(cryptoOrderContext.getRequestContext().getQuote().getBidPrice().getDecimalValue())));
        }
        return new CalculateCryptoMarketOrderPillsRequestDto(new CalculateCryptoMarketOrderPillsRequestDto.OrderSideDto(buy), string2);
    }

    public static final BottomSheetTypeDto getSpreadBottomSheetTypeDto(CryptoOrderContext cryptoOrderContext) {
        TypeDto typeDto;
        Intrinsics.checkNotNullParameter(cryptoOrderContext, "<this>");
        UiCurrencyPair currencyPair = cryptoOrderContext.getRequestContext().getCurrencyPair();
        Currency quoteCurrencyForPriceInput = currencyPair.getQuoteCurrencyForPriceInput();
        Quote quote = cryptoOrderContext.getRequestContext().getQuote();
        String code = currencyPair.getAssetCurrency().getCode();
        SideDto sideDto = OrderSides3.getSideDto(cryptoOrderContext.getRequest().getSide());
        int i = WhenMappings.$EnumSwitchMapping$4[cryptoOrderContext.getRequest().getType().ordinal()];
        if (i == 1) {
            typeDto = TypeDto.TYPE_MARKET;
        } else if (i == 2) {
            typeDto = TypeDto.TYPE_LIMIT;
        } else if (i == 3) {
            typeDto = TypeDto.TYPE_STOP_LOSS;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            typeDto = TypeDto.TYPE_STOP_LIMIT;
        }
        return new BottomSheetTypeDto(new BottomSheetTypeDto.TypeDto.Spread(new BottomSheetTypeDto.SpreadDto(code, sideDto, typeDto, IdlDecimal2.toIdlDecimal(BigDecimals7.orZero(currencyPair.getRebate())), IdlDecimal2.toIdlDecimal(quote.getBuySpreadFraction()), IdlDecimal2.toIdlDecimal(quote.getSellSpreadFraction()), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, quote.getBidPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, quote.getMidPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, quote.getAskPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null))));
    }

    public static final BottomSheetTypeDto getMarketPriceBottomSheetTypeDto(CryptoOrderContext cryptoOrderContext) {
        Intrinsics.checkNotNullParameter(cryptoOrderContext, "<this>");
        return new BottomSheetTypeDto(new BottomSheetTypeDto.TypeDto.MarketPrice(new BottomSheetTypeDto.MarketPriceDto(OrderSides3.getSideDto(cryptoOrderContext.getRequest().getSide()), cryptoOrderContext.getRequestContext().getCurrencyPair().getAssetCurrency().getCode())));
    }

    public static final BottomSheetTypeDto getLimitOrderDefinitionBottomSheetTypeDto(CryptoOrderContext cryptoOrderContext) {
        Intrinsics.checkNotNullParameter(cryptoOrderContext, "<this>");
        UiCurrencyPair currencyPair = cryptoOrderContext.getRequestContext().getCurrencyPair();
        Currency quoteCurrencyForPriceInput = currencyPair.getQuoteCurrencyForPriceInput();
        Quote quote = cryptoOrderContext.getRequestContext().getQuote();
        return new BottomSheetTypeDto(new BottomSheetTypeDto.TypeDto.LimitOrderDefinition(new BottomSheetTypeDto.LimitOrderDefinitionDto(currencyPair.getAssetCurrency().getCode(), OrderSides3.getSideDto(cryptoOrderContext.getRequest().getSide()), MonetizationModels.getDto(cryptoOrderContext.getRequestContext().getRequestInputs().getMonetizationModel()), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, quote.getBidPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, quote.getAskPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null), IdlDecimal2.toIdlDecimal(quote.getBuySpreadFraction()), IdlDecimal2.toIdlDecimal(quote.getSellSpreadFraction()), getSpreadBottomSheetTypeDto(cryptoOrderContext).getSpread())));
    }
}
