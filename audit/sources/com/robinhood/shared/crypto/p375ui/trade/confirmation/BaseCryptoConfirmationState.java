package com.robinhood.shared.crypto.p375ui.trade.confirmation;

import android.content.res.Resources;
import androidx.compose.p011ui.text.font.FontWeight;
import cbc.service.p048v1.TermTypeDto;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.crypto.lib.UiCryptoOrders;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.api.ApiCurrency;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p314db.CryptoOrderGainLoss;
import com.robinhood.models.crypto.p314db.CryptoOrderTaxLotOverview;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.fee.CryptoFee;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.extensions.TermTypeDtos;
import com.robinhood.shared.crypto.p375ui.feeTiers.FormatFeeRate;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderConfirmationRowState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.TokenizationFxFeeDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: BaseCryptoConfirmationState.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001+J\u001a\u0010\u001e\u001a\u00020\u001b2\b\b\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010!\u001a\u00020\u001b2\b\b\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J*\u0010(\u001a\u0004\u0018\u00010%2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/confirmation/BaseCryptoConfirmationState;", "", "resources", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "isTradeBonusEnabled", "", "()Z", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoOrderAccount", "Lcom/robinhood/models/db/Account;", "getCryptoOrderAccount", "()Lcom/robinhood/models/db/Account;", "isRhcApp", "titleString", "Lcom/robinhood/utils/resource/StringResource;", "getTitleString", "()Lcom/robinhood/utils/resource/StringResource;", "getDescriptionString", "stringRes", "", "getStopLimitDescriptionString", "descriptionString", "cryptoOrderConfirmationRowStates", "", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState;", "getCryptoOrderConfirmationRowStates", "()Ljava/util/List;", "createOrderConfirmationRowState", "typeCrypto", "Lcom/robinhood/shared/crypto/ui/trade/confirmation/BaseCryptoConfirmationState$CryptoOrderConfirmationRowType;", "CryptoOrderConfirmationRowType", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface BaseCryptoConfirmationState {

    /* compiled from: BaseCryptoConfirmationState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[OrderState.values().length];
            try {
                iArr[OrderState.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderState.UNCONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderState.CONFIRMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderState.PARTIALLY_FILLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderState.PENDING_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OrderState.FILLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OrderState.REJECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OrderState.CANCELED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OrderState.FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OrderState.VOIDED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OrderState.TRIGGERED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OrderState.NOT_ACCEPTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiCurrency.Type.values().length];
            try {
                iArr2[ApiCurrency.Type.TOKENIZED_STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ApiCurrency.Type.CRYPTOCURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ApiCurrency.Type.FIAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ApiCurrency.Type.PERPETUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ApiCurrency.Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CryptoOrderType.values().length];
            try {
                iArr3[CryptoOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[CryptoOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderSide.values().length];
            try {
                iArr4[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[CryptoOrderConfirmationRowType.values().length];
            try {
                iArr5[CryptoOrderConfirmationRowType.ACCOUNT_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.AMOUNT_BREAKDOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.AMOUNT_TOTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.ESTIMATED_COST_CREDIT_BREAKDOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.ESTIMATED_COST_CREDIT_TOTAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.CRYPTO_PURCHASED_OR_SOLD_BREAKDOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.CRYPTO_PURCHASED_OR_SOLD_TOTAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.CRYPTO_PURCHASED_OR_SOLD_AS_SUBTOTAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.ESTIMATED_CRYPTO_BREAKDOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.ESTIMATED_CRYPTO_TOTAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.PENDING_CRYPTO.ordinal()] = 11;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.PRICE_AT_EXECUTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.ESTIMATED_PRICE.ordinal()] = 13;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.LIMIT_PRICE.ordinal()] = 14;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.STOP_PRICE.ordinal()] = 15;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.ROBINHOOD_FEE.ordinal()] = 16;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.FEE.ordinal()] = 17;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.LOTS_SELECTED.ordinal()] = 18;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.QUANTITY_FSM.ordinal()] = 19;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.ESTIMATED_PRICE_FSM.ordinal()] = 20;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.FX_FEE_FSM.ordinal()] = 21;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.TOTAL_COST_FSM.ordinal()] = 22;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr5[CryptoOrderConfirmationRowType.LIMIT_PRICE_FSM.ordinal()] = 23;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    CryptoOrderConfirmationRowState createOrderConfirmationRowState(CryptoOrderConfirmationRowType typeCrypto, UiCryptoOrder uiCryptoOrder, UiCurrencyPair uiCurrencyPair, Resources resources);

    AppType getAppType();

    Account getCryptoOrderAccount();

    List<CryptoOrderConfirmationRowState> getCryptoOrderConfirmationRowStates();

    StringResource getDescriptionString();

    Resources getResources();

    StringResource getTitleString();

    UiCryptoOrder getUiCryptoOrder();

    UiCurrencyPair getUiCurrencyPair();

    boolean isRhcApp();

    boolean isTradeBonusEnabled();

    /* compiled from: BaseCryptoConfirmationState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static Account getCryptoOrderAccount(BaseCryptoConfirmationState baseCryptoConfirmationState) {
            return null;
        }

        public static boolean isRhcApp(BaseCryptoConfirmationState baseCryptoConfirmationState) {
            return baseCryptoConfirmationState.getAppType() == AppType.RHC;
        }

        public static StringResource getTitleString(BaseCryptoConfirmationState baseCryptoConfirmationState) {
            UiCryptoOrder uiCryptoOrder = baseCryptoConfirmationState.getUiCryptoOrder();
            if (uiCryptoOrder == null) {
                return StringResource.INSTANCE.invoke("");
            }
            int i = WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCurrencyType().ordinal()];
            if (i == 1) {
                switch (WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getState().ordinal()]) {
                    case 1:
                        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_queued_plain, new Object[0]);
                    case 2:
                    case 3:
                        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_unconfirmed_plain, new Object[0]);
                    case 4:
                        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_confirmed_plain, new Object[0]);
                    case 5:
                    case 6:
                        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_partially_filled_plain, new Object[0]);
                    case 7:
                        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_pending_cancel_plain, new Object[0]);
                    case 8:
                        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_filled_plain, new Object[0]);
                    case 9:
                        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_rejected_plain, new Object[0]);
                    case 10:
                        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_canceled_plain, new Object[0]);
                    case 11:
                        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_failed_plain, new Object[0]);
                    case 12:
                        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_voided_plain, new Object[0]);
                    default:
                        Preconditions.INSTANCE.failUnknownEnumKotlin(baseCryptoConfirmationState);
                        throw new ExceptionsH();
                }
            }
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5) {
                    return StringResource.INSTANCE.invoke("");
                }
                throw new NoWhenBranchMatchedException();
            }
            String code = uiCryptoOrder.getAssetCurrency().getCode();
            switch (WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getState().ordinal()]) {
                case 1:
                    return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_queued, code);
                case 2:
                case 3:
                    return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_unconfirmed, code);
                case 4:
                    return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_confirmed, code);
                case 5:
                case 6:
                    return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_partially_filled, code);
                case 7:
                    return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_pending_cancel, code);
                case 8:
                    return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_filled, code);
                case 9:
                    return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_rejected, code);
                case 10:
                    return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_canceled, code);
                case 11:
                    return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_failed, code);
                case 12:
                    return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_voided, code);
                default:
                    Preconditions.INSTANCE.failUnknownEnumKotlin(baseCryptoConfirmationState);
                    throw new ExceptionsH();
            }
        }

        private static StringResource getDescriptionString(BaseCryptoConfirmationState baseCryptoConfirmationState, int i, UiCryptoOrder uiCryptoOrder) {
            return StringResource.INSTANCE.invoke(i, BaseCryptoConfirmationState2.getOrderTypeString(uiCryptoOrder), BaseCryptoConfirmationState2.getQuantityString(uiCryptoOrder), UiCryptoOrders.getSymbolWithType(uiCryptoOrder), BaseCryptoConfirmationState2.getRemainingQuantityString(uiCryptoOrder));
        }

        private static StringResource getStopLimitDescriptionString(BaseCryptoConfirmationState baseCryptoConfirmationState, int i, UiCryptoOrder uiCryptoOrder) {
            return StringResource.INSTANCE.invoke(i, BaseCryptoConfirmationState2.getOrderTypeString(uiCryptoOrder), BaseCryptoConfirmationState2.getQuantityString(uiCryptoOrder), uiCryptoOrder.getSymbol(), BaseCryptoConfirmationState2.getStopPriceString(uiCryptoOrder));
        }

        public static StringResource getDescriptionString(BaseCryptoConfirmationState baseCryptoConfirmationState) {
            UiCryptoOrder uiCryptoOrder = baseCryptoConfirmationState.getUiCryptoOrder();
            if (uiCryptoOrder == null) {
                return StringResource.INSTANCE.invoke("");
            }
            int i = WhenMappings.$EnumSwitchMapping$3[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
            if (i == 1) {
                switch (WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getState().ordinal()]) {
                    case 1:
                        return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_buy_queued_description, uiCryptoOrder);
                    case 2:
                    case 3:
                        return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_buy_unconfirmed_description, uiCryptoOrder);
                    case 4:
                    case 13:
                        int i2 = WhenMappings.$EnumSwitchMapping$2[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                        if (i2 == 1) {
                            return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_buy_confirmed_description, uiCryptoOrder);
                        }
                        if (i2 == 2) {
                            return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_buy_confirmed_description_limit, uiCryptoOrder);
                        }
                        if (i2 == 3) {
                            return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_buy_confirmed_description_stop_loss, uiCryptoOrder);
                        }
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return getStopLimitDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_buy_confirmed_description_stop_limit, uiCryptoOrder);
                    case 5:
                    case 8:
                        return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_buy_filled_description, uiCryptoOrder);
                    case 6:
                        return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_buy_partially_filled_description, uiCryptoOrder);
                    case 7:
                    case 10:
                    case 14:
                        return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_buy_canceled_description, uiCryptoOrder);
                    case 9:
                        return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_buy_rejected_description, uiCryptoOrder);
                    case 11:
                    case 12:
                        return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_buy_failed_description, uiCryptoOrder);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            switch (WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getState().ordinal()]) {
                case 1:
                    return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_sell_queued_description, uiCryptoOrder);
                case 2:
                case 3:
                    return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_sell_unconfirmed_description, uiCryptoOrder);
                case 4:
                case 13:
                    int i3 = WhenMappings.$EnumSwitchMapping$2[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                    if (i3 == 1) {
                        return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_sell_confirmed_description, uiCryptoOrder);
                    }
                    if (i3 == 2) {
                        return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_sell_confirmed_description_limit, uiCryptoOrder);
                    }
                    if (i3 == 3) {
                        return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_sell_confirmed_description_stop_loss, uiCryptoOrder);
                    }
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return getStopLimitDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_sell_confirmed_description_stop_limit, uiCryptoOrder);
                case 5:
                case 8:
                    return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_sell_filled_description, uiCryptoOrder);
                case 6:
                    return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_sell_partially_filled_description, uiCryptoOrder);
                case 7:
                case 10:
                case 14:
                    return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_sell_canceled_description, uiCryptoOrder);
                case 9:
                    return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_sell_rejected_description, uiCryptoOrder);
                case 11:
                case 12:
                    return getDescriptionString(baseCryptoConfirmationState, C38572R.string.crypto_order_confirmation_sell_failed_description, uiCryptoOrder);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public static List<CryptoOrderConfirmationRowState> getCryptoOrderConfirmationRowStates(BaseCryptoConfirmationState baseCryptoConfirmationState) {
            UiCurrencyPair uiCurrencyPair;
            List<CryptoOrderConfirmationRowType> listCreateRowsForTokenizedStocks;
            UiCryptoOrder uiCryptoOrder = baseCryptoConfirmationState.getUiCryptoOrder();
            if (uiCryptoOrder != null && (uiCurrencyPair = baseCryptoConfirmationState.getUiCurrencyPair()) != null) {
                int i = WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCurrencyType().ordinal()];
                if (i == 1) {
                    listCreateRowsForTokenizedStocks = RowsForTokenizedStocks.createRowsForTokenizedStocks(uiCryptoOrder);
                } else if (i == 2) {
                    listCreateRowsForTokenizedStocks = RowsForCryptos.createRowsForCryptos(baseCryptoConfirmationState, uiCryptoOrder, uiCurrencyPair);
                } else {
                    if (i != 3 && i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listCreateRowsForTokenizedStocks = CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listCreateRowsForTokenizedStocks.iterator();
                while (it.hasNext()) {
                    CryptoOrderConfirmationRowState cryptoOrderConfirmationRowStateCreateOrderConfirmationRowState = baseCryptoConfirmationState.createOrderConfirmationRowState((CryptoOrderConfirmationRowType) it.next(), uiCryptoOrder, uiCurrencyPair, baseCryptoConfirmationState.getResources());
                    if (cryptoOrderConfirmationRowStateCreateOrderConfirmationRowState != null) {
                        arrayList.add(cryptoOrderConfirmationRowStateCreateOrderConfirmationRowState);
                    }
                }
                return arrayList;
            }
            return CollectionsKt.emptyList();
        }

        /* JADX WARN: Code restructure failed: missing block: B:124:0x03e5, code lost:
        
            r3.add(r6);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static CryptoOrderConfirmationRowState createOrderConfirmationRowState(BaseCryptoConfirmationState baseCryptoConfirmationState, CryptoOrderConfirmationRowType typeCrypto, UiCryptoOrder uiCryptoOrder, UiCurrencyPair uiCurrencyPair, Resources resources) {
            StringResource stringResourceInvoke;
            StringResource stringResourceInvoke2;
            CryptoOrderConfirmationRowState.IconContent iconContent;
            StringResource stringResourceInvoke3;
            int i;
            StringResource stringResourceInvoke4;
            int i2;
            StringResource stringResourceInvoke5;
            StringResource stringResourceInvoke6;
            String str;
            BigDecimal feeRatio;
            BigDecimal feeAmount;
            StringResource stringResourceInvoke7;
            int i3;
            CryptoOrderConfirmationRowState.TextContent textContent;
            BigDecimal gainLossAmount;
            int i4;
            int i5;
            StringResource quantityString;
            int i6;
            BigDecimal displayPrice;
            int i7;
            CryptoOrderConfirmationRowState.TextContent textContent2;
            int i8;
            CryptoOrderConfirmationRowState.TextContent textContent3;
            StringResource estimatedPriceString;
            Money money;
            String str2;
            Intrinsics.checkNotNullParameter(typeCrypto, "typeCrypto");
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(resources, "resources");
            CryptoOrderConfirmationRowState.TapAction.ShowCostDetailBottomSheet showCostDetailBottomSheet = null;
            showCostDetailBottomSheet = null;
            showCostDetailBottomSheet = null;
            showCostDetailBottomSheet = null;
            switch (WhenMappings.$EnumSwitchMapping$4[typeCrypto.ordinal()]) {
                case 1:
                    Account cryptoOrderAccount = baseCryptoConfirmationState.getCryptoOrderAccount();
                    if (cryptoOrderAccount == null) {
                        return null;
                    }
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_account_name_label, new Object[0]), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(AccountDisplayNames.getDisplayName(cryptoOrderAccount).getShort().getTitle(), null, null, null, null, null, 62, null), null, 10, null);
                case 2:
                    if (uiCryptoOrder.getCryptoOrder().getSide() == OrderSide.SELL && uiCryptoOrder.getCryptoOrder().getQuoteTradeBonus() == null) {
                        return null;
                    }
                    int i9 = WhenMappings.$EnumSwitchMapping$3[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
                    if (i9 == 1) {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_amount_label_cost, new Object[0]);
                    } else {
                        if (i9 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_amount_label_credit, new Object[0]);
                    }
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(stringResourceInvoke, null, null, null, null, null, 62, null), BaseCryptoConfirmationState2.sellSideQuoteTradeBonusStartSecondaryTextContent(baseCryptoConfirmationState, uiCryptoOrder.getCryptoOrder()), new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getDollarBasedAmountString(uiCryptoOrder), null, null, null, null, null, 62, null), BaseCryptoConfirmationState2.sellSideQuoteTradeBonusEndSecondaryTextContent(baseCryptoConfirmationState, uiCryptoOrder));
                case 3:
                    int i10 = WhenMappings.$EnumSwitchMapping$3[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
                    if (i10 == 1) {
                        stringResourceInvoke2 = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_amount_label_total_cost, new Object[0]);
                    } else {
                        if (i10 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        stringResourceInvoke2 = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_amount_label_total_credit, new Object[0]);
                    }
                    StringResource stringResource = stringResourceInvoke2;
                    if (baseCryptoConfirmationState.isRhcApp()) {
                        iconContent = null;
                    } else {
                        int i11 = WhenMappings.$EnumSwitchMapping$2[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2 && i11 != 3 && i11 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iconContent = null;
                        } else {
                            iconContent = new CryptoOrderConfirmationRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderConfirmationRowState.ColorOverride.FG_2);
                        }
                    }
                    if (!baseCryptoConfirmationState.isRhcApp()) {
                        int i12 = WhenMappings.$EnumSwitchMapping$2[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                        if (i12 == 1) {
                            showCostDetailBottomSheet = CryptoOrderConfirmationRowState.TapAction.ShowCostDetailBottomSheet.INSTANCE;
                        } else if (i12 != 2 && i12 != 3 && i12 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    CryptoOrderConfirmationRowState.TextContent textContent4 = new CryptoOrderConfirmationRowState.TextContent(stringResource, null, iconContent, showCostDetailBottomSheet, null, null, 50, null);
                    if (uiCryptoOrder.getCryptoOrder().getQuoteTradeBonus() != null) {
                        stringResourceInvoke3 = BaseCryptoConfirmationState2.getDollarBasedAmountStringWithSellSideQuoteTradeBonus(uiCryptoOrder);
                    } else if (uiCryptoOrder.getExecutions().isEmpty()) {
                        stringResourceInvoke3 = StringResource.INSTANCE.invoke(UiCryptoOrders.getEstimatedTotalNotionalWithFeeText(uiCryptoOrder));
                    } else {
                        stringResourceInvoke3 = StringResource.INSTANCE.invoke(UiCryptoOrders.getTotalNotionalWithFeeText(uiCryptoOrder));
                    }
                    return new CryptoOrderConfirmationRowState(textContent4, null, new CryptoOrderConfirmationRowState.TextContent(stringResourceInvoke3, null, null, null, null, null, 62, null), null, 10, null);
                case 4:
                    StringResource.Companion companion = StringResource.INSTANCE;
                    int i13 = WhenMappings.$EnumSwitchMapping$3[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
                    if (i13 == 1) {
                        i = C38572R.string.crypto_order_confirmation_estimated_cost_label;
                    } else {
                        if (i13 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = C38572R.string.crypto_order_confirmation_estimated_credit_label;
                    }
                    CryptoOrderConfirmationRowState.TextContent textContent5 = new CryptoOrderConfirmationRowState.TextContent(companion.invoke(i, new Object[0]), null, null, null, null, null, 62, null);
                    CryptoOrderConfirmationRowState.TextContent textContentSellSideQuoteTradeBonusStartSecondaryTextContent = BaseCryptoConfirmationState2.sellSideQuoteTradeBonusStartSecondaryTextContent(baseCryptoConfirmationState, uiCryptoOrder.getCryptoOrder());
                    if (uiCryptoOrder.getExecutions().isEmpty()) {
                        stringResourceInvoke4 = companion.invoke(UiCryptoOrders.getEstimatedTotalNotionalWithFeeText(uiCryptoOrder));
                    } else {
                        stringResourceInvoke4 = companion.invoke(UiCryptoOrders.getTotalNotionalWithFeeText(uiCryptoOrder));
                    }
                    return new CryptoOrderConfirmationRowState(textContent5, textContentSellSideQuoteTradeBonusStartSecondaryTextContent, new CryptoOrderConfirmationRowState.TextContent(stringResourceInvoke4, null, null, null, null, null, 62, null), BaseCryptoConfirmationState2.sellSideQuoteTradeBonusEndSecondaryTextContent(baseCryptoConfirmationState, uiCryptoOrder));
                case 5:
                    StringResource.Companion companion2 = StringResource.INSTANCE;
                    int i14 = WhenMappings.$EnumSwitchMapping$3[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
                    if (i14 == 1) {
                        i2 = C38572R.string.crypto_order_confirmation_est_total_cost_label;
                    } else {
                        if (i14 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = C38572R.string.crypto_order_confirmation_est_total_credit_label;
                    }
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion2.invoke(i2, new Object[0]), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getDollarBasedAmountStringWithSellSideQuoteTradeBonus(uiCryptoOrder), null, null, null, null, null, 62, null), null, 10, null);
                case 6:
                    int i15 = WhenMappings.$EnumSwitchMapping$3[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
                    if (i15 == 1) {
                        stringResourceInvoke5 = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_buy_quantity_label, uiCryptoOrder.getSymbol());
                    } else {
                        if (i15 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        stringResourceInvoke5 = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_sell_quantity_label, uiCryptoOrder.getSymbol());
                    }
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(stringResourceInvoke5, null, null, null, null, null, 62, null), BaseCryptoConfirmationState2.buySideAssetTradeBonusStartSecondaryTextContent(baseCryptoConfirmationState, uiCryptoOrder.getCryptoOrder()), new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getQuantityStringWithSymbol(uiCryptoOrder), null, null, null, null, null, 62, null), BaseCryptoConfirmationState2.buySideAssetTradeBonusEndSecondaryTextContent(baseCryptoConfirmationState, uiCryptoOrder));
                case 7:
                    if (uiCryptoOrder.getCryptoOrder().getSide() == OrderSide.BUY && uiCryptoOrder.getCryptoOrder().getAssetTradeBonus() == null) {
                        return null;
                    }
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_total_purchased_sold, uiCryptoOrder.getSymbol()), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getQuantityStringWithSymbolWithBuySideAssetTradeBonus(uiCryptoOrder), null, null, null, null, null, 62, null), null, 10, null);
                case 8:
                    int i16 = WhenMappings.$EnumSwitchMapping$3[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
                    if (i16 == 1) {
                        stringResourceInvoke6 = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_buy_quantity_label, uiCryptoOrder.getSymbol());
                    } else {
                        if (i16 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        stringResourceInvoke6 = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_sell_quantity_label, uiCryptoOrder.getSymbol());
                    }
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(stringResourceInvoke6, null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getPartialQuantityString(uiCryptoOrder), null, null, null, null, null, 62, null), null, 10, null);
                case 9:
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_estimated_crypto, uiCryptoOrder.getSymbol()), null, null, null, null, null, 62, null), BaseCryptoConfirmationState2.buySideAssetTradeBonusStartSecondaryTextContent(baseCryptoConfirmationState, uiCryptoOrder.getCryptoOrder()), new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getQuantityStringWithSymbol(uiCryptoOrder), null, null, null, null, null, 62, null), BaseCryptoConfirmationState2.buySideAssetTradeBonusEndSecondaryTextContent(baseCryptoConfirmationState, uiCryptoOrder));
                case 10:
                    if (uiCryptoOrder.getCryptoOrder().getSide() == OrderSide.BUY && uiCryptoOrder.getCryptoOrder().getAssetTradeBonus() == null) {
                        return null;
                    }
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_est_total_crypto, uiCryptoOrder.getSymbol()), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getQuantityStringWithSymbolWithBuySideAssetTradeBonus(uiCryptoOrder), null, null, null, null, null, 62, null), null, 10, null);
                case 11:
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_pending_crypto, uiCryptoOrder.getSymbol()), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getRemainingQuantityString(uiCryptoOrder), null, null, null, null, null, 62, null), null, 10, null);
                case 12:
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_average_price, uiCryptoOrder.getSymbol()), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getAveragePriceString(uiCryptoOrder), null, null, null, null, null, 62, null), null, 10, null);
                case 13:
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_estimated_price, uiCryptoOrder.getSymbol()), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getEstimatedPriceString(uiCryptoOrder), null, null, null, null, null, 62, null), null, 10, null);
                case 14:
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_limit_price, new Object[0]), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getEstimatedPriceString(uiCryptoOrder), null, null, null, null, null, 62, null), null, 10, null);
                case 15:
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_stop_price, new Object[0]), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getStopPriceString(uiCryptoOrder), null, null, null, null, null, 62, null), null, 10, null);
                case 16:
                    boolean zIsZero = BigDecimals7.isZero(uiCryptoOrder.getCurrencyPair().getQuoteFee());
                    CryptoInstrumentInputHelper cryptoInstrumentInputHelper = new CryptoInstrumentInputHelper(uiCurrencyPair);
                    BigDecimal quoteFee = uiCryptoOrder.getCurrencyPair().getQuoteFee();
                    if (quoteFee == null || (str = (String) CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, quoteFee, null, CryptoInputMode.QUOTE_CURRENCY, false, true, false, false, 106, null).getFirst()) == null) {
                        str = "";
                    }
                    StringResource.Companion companion3 = StringResource.INSTANCE;
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion3.invoke(C38572R.string.crypto_order_robinhood_fee_label, new Object[0]), null, null, null, zIsZero ? CryptoOrderConfirmationRowState.TextStyleOverride.TEXT_M_TRADE_BONUS_GRADIENT : null, zIsZero ? FontWeight.INSTANCE.getBold() : null, 14, null), null, new CryptoOrderConfirmationRowState.TextContent(companion3.invoke(str), null, null, null, zIsZero ? CryptoOrderConfirmationRowState.TextStyleOverride.TEXT_M_TRADE_BONUS_GRADIENT : null, zIsZero ? FontWeight.INSTANCE.getBold() : null, 14, null), null, 10, null);
                case 17:
                    CryptoFee cryptoFee = UiCryptoOrders.getCryptoFee(uiCryptoOrder);
                    if (cryptoFee == null) {
                        return null;
                    }
                    if (cryptoFee instanceof CryptoFee.FixedRateFee) {
                        CryptoFee.FixedRateFee fixedRateFee = (CryptoFee.FixedRateFee) cryptoFee;
                        feeRatio = fixedRateFee.getFeeData().getFeeRatio();
                        feeAmount = fixedRateFee.getFeeData().getFeeAmount();
                    } else if (cryptoFee instanceof CryptoFee.VolumeTieredFee) {
                        CryptoFee.VolumeTieredFee volumeTieredFee = (CryptoFee.VolumeTieredFee) cryptoFee;
                        feeRatio = volumeTieredFee.getFeeData().getFeeRatio();
                        feeAmount = volumeTieredFee.getFeeData().getFeeAmount();
                    } else {
                        if (cryptoFee instanceof CryptoFee.Unspecified) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean zIsZero2 = BigDecimals7.isZero(feeRatio);
                    if (zIsZero2) {
                        stringResourceInvoke7 = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_fee_label, new Object[0]);
                    } else {
                        String feeRate = FormatFeeRate.formatFeeRate(feeRatio);
                        int i17 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getState().ordinal()];
                        if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 13) {
                            stringResourceInvoke7 = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_estimated_fee_percentage_label, feeRate);
                        } else {
                            stringResourceInvoke7 = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_fee_percentage_label, feeRate);
                        }
                    }
                    return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(stringResourceInvoke7, null, zIsZero2 ? null : new CryptoOrderConfirmationRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderConfirmationRowState.ColorOverride.FG_2), zIsZero2 ? null : CryptoOrderConfirmationRowState.TapAction.ShowFeeDefinitionBottomSheet.INSTANCE, zIsZero2 ? CryptoOrderConfirmationRowState.TextStyleOverride.TEXT_M_TRADE_BONUS_GRADIENT : null, zIsZero2 ? FontWeight.INSTANCE.getBold() : null, 2, null), null, new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(UiCryptoOrders.feeAmountText(uiCryptoOrder, feeAmount)), null, null, null, zIsZero2 ? CryptoOrderConfirmationRowState.TextStyleOverride.TEXT_M_TRADE_BONUS_GRADIENT : null, zIsZero2 ? FontWeight.INSTANCE.getBold() : null, 14, null), null, 10, null);
                case 18:
                    CryptoOrderTaxLotOverview taxLotsOverview = uiCryptoOrder.getCryptoOrder().getTaxLotsOverview();
                    if (taxLotsOverview == null) {
                        return null;
                    }
                    CryptoOrderGainLoss gainLoss = uiCryptoOrder.getCryptoOrder().getGainLoss();
                    StringResource.Companion companion4 = StringResource.INSTANCE;
                    if (taxLotsOverview.isConfirmed()) {
                        i3 = C38572R.string.crypto_order_confirmation_lots_filled;
                    } else {
                        i3 = C38572R.string.crypto_order_confirmation_lots_selected;
                    }
                    CryptoOrderConfirmationRowState.TextContent textContent6 = new CryptoOrderConfirmationRowState.TextContent(companion4.invoke(i3, new Object[0]), null, null, null, null, null, 62, null);
                    ImmutableList<CryptoOrderTaxLotOverview.LotOverview> lotOverviews = taxLotsOverview.getLotOverviews();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lotOverviews, 10));
                    for (CryptoOrderTaxLotOverview.LotOverview lotOverview : lotOverviews) {
                        Iterator<TermTypeDto> it = TermTypeDto.getEntries().iterator();
                        while (it.hasNext()) {
                            TermTypeDto next = it.next();
                            if (Intrinsics.areEqual(next.getJson_value(), lotOverview.getTermType())) {
                                break;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        break;
                    }
                    CryptoOrderConfirmationRowState.TextContent textContent7 = new CryptoOrderConfirmationRowState.TextContent(TermTypeDtos.getTermsLabel(arrayList), null, null, null, null, null, 62, null);
                    if (gainLoss == null || (gainLossAmount = gainLoss.getGainLossAmount()) == null) {
                        textContent = null;
                    } else {
                        String currency$default = CurrencyDefinitions.formatCurrency$default(uiCurrencyPair.getQuoteCurrency(), gainLossAmount, false, false, null, 0, null, Boolean.TRUE, true, true, false, false, 1598, null);
                        StringResource.Companion companion5 = StringResource.INSTANCE;
                        if (gainLoss.isEstimated() && BigDecimals7.isNegative(gainLossAmount)) {
                            i4 = C38572R.string.crypto_order_confirmation_est_loss;
                        } else if (gainLoss.isEstimated()) {
                            i4 = C38572R.string.crypto_order_confirmation_est_gain;
                        } else if (BigDecimals7.isNegative(gainLossAmount)) {
                            i4 = C38572R.string.crypto_order_confirmation_realized_loss;
                        } else {
                            i4 = C38572R.string.crypto_order_confirmation_realized_gain;
                        }
                        textContent = new CryptoOrderConfirmationRowState.TextContent(companion5.invoke(i4, currency$default), null, null, null, null, null, 62, null);
                    }
                    return new CryptoOrderConfirmationRowState(textContent6, null, textContent7, textContent, 2, null);
                case 19:
                    StringResource.Companion companion6 = StringResource.INSTANCE;
                    if (!uiCryptoOrder.getCryptoOrder().getIsPending() || uiCryptoOrder.getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED) {
                        int i18 = WhenMappings.$EnumSwitchMapping$3[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
                        if (i18 == 1) {
                            i5 = C38572R.string.crypto_order_confirmation_purchased_label;
                        } else {
                            if (i18 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i5 = C38572R.string.crypto_order_confirmation_sold_label;
                        }
                    } else {
                        i5 = C38572R.string.crypto_order_confirmation_quantity_label;
                    }
                    CryptoOrderConfirmationRowState.TextContent textContent8 = new CryptoOrderConfirmationRowState.TextContent(companion6.invoke(i5, new Object[0]), null, null, null, null, null, 62, null);
                    if (uiCryptoOrder.getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED) {
                        quantityString = BaseCryptoConfirmationState2.getCumulativeQuantityString(uiCryptoOrder);
                    } else {
                        quantityString = BaseCryptoConfirmationState2.getQuantityString(uiCryptoOrder);
                    }
                    return new CryptoOrderConfirmationRowState(textContent8, null, new CryptoOrderConfirmationRowState.TextContent(quantityString, null, null, null, null, null, 62, null), null, 10, null);
                case 20:
                    StringResource.Companion companion7 = StringResource.INSTANCE;
                    if (uiCryptoOrder.getCryptoOrder().getIsPending() && uiCryptoOrder.getCryptoOrder().getState() != OrderState.PARTIALLY_FILLED) {
                        i6 = C38572R.string.crypto_order_confirmation_estimated_price_label;
                    } else {
                        i6 = C38572R.string.crypto_order_confirmation_price_label;
                    }
                    CryptoOrderConfirmationRowState.TextContent textContent9 = new CryptoOrderConfirmationRowState.TextContent(companion7.invoke(i6, new Object[0]), null, null, null, null, null, 62, null);
                    Currency quoteCurrencyForPrice = uiCryptoOrder.getQuoteCurrencyForPrice();
                    if (uiCryptoOrder.getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED) {
                        displayPrice = uiCryptoOrder.getCryptoOrder().getAveragePrice();
                        if (displayPrice == null) {
                            displayPrice = uiCryptoOrder.getCryptoOrder().getPrice();
                        }
                    } else {
                        displayPrice = uiCryptoOrder.getCryptoOrder().getDisplayPrice();
                    }
                    return new CryptoOrderConfirmationRowState(textContent9, null, new CryptoOrderConfirmationRowState.TextContent(companion7.invoke(CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPrice, displayPrice, false, false, null, 0, null, null, false, false, false, false, 2046, null)), null, null, null, null, null, 62, null), null, 10, null);
                case 21:
                    StringResource.Companion companion8 = StringResource.INSTANCE;
                    int i19 = C38572R.string.crypto_order_confirmation_fx_fee_label;
                    NumberFormatter hundredthPercentFormat = FormatsLocalized.getHundredthPercentFormat();
                    CryptoFee.FixedRateFee.FixedRateFeeData fxFee = uiCryptoOrder.getCryptoOrder().getFxFee();
                    if (fxFee != null) {
                        StringResource stringResourceInvoke8 = companion8.invoke(i19, hundredthPercentFormat.format(fxFee.getFeeRatio()));
                        CryptoOrderConfirmationRowState.IconContent iconContent2 = new CryptoOrderConfirmationRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderConfirmationRowState.ColorOverride.FG_2);
                        BigDecimal ZERO = BigDecimal.ZERO;
                        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        IdlDecimal idlDecimal = IdlDecimal2.toIdlDecimal(ZERO);
                        CryptoFee.FixedRateFee.FixedRateFeeData fxFee2 = uiCryptoOrder.getCryptoOrder().getFxFee();
                        if (fxFee2 != null) {
                            return new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(stringResourceInvoke8, null, iconContent2, new CryptoOrderConfirmationRowState.TapAction.Tokenization.ShowTokenizationFxFeeSheet(new TokenizationFxFeeDto(idlDecimal, IdlDecimal2.toIdlDecimal(fxFee2.getFeeRatio()), "", "", TokenizationFxFeeDto.TouchPointDto.CONFIRMATION, null, 32, null)), null, null, 50, null), null, new CryptoOrderConfirmationRowState.TextContent(companion8.invoke(UiCryptoOrders.getFxFeeAmount(uiCryptoOrder)), null, null, null, null, null, 62, null), null, 10, null);
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                case 22:
                    StringResource.Companion companion9 = StringResource.INSTANCE;
                    if ((!uiCryptoOrder.getIsPending() || uiCryptoOrder.getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED) && uiCryptoOrder.getCryptoOrder().getSide() == OrderSide.BUY) {
                        i7 = C38572R.string.crypto_order_confirmation_total_cost;
                    } else if (uiCryptoOrder.getIsPending() && uiCryptoOrder.getCryptoOrder().getSide() == OrderSide.BUY) {
                        i7 = C38572R.string.crypto_order_confirmation_estimated_total_cost;
                    } else if ((!uiCryptoOrder.getIsPending() || uiCryptoOrder.getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED) && uiCryptoOrder.getCryptoOrder().getSide() == OrderSide.SELL) {
                        i7 = C38572R.string.crypto_order_confirmation_total_credit;
                    } else {
                        if (!uiCryptoOrder.getIsPending() || uiCryptoOrder.getCryptoOrder().getSide() != OrderSide.SELL) {
                            throw new IllegalStateException("Invalid state");
                        }
                        i7 = C38572R.string.crypto_order_confirmation_estimated_total_credit;
                    }
                    CryptoOrderConfirmationRowState.TextContent textContent10 = new CryptoOrderConfirmationRowState.TextContent(companion9.invoke(i7, new Object[0]), null, uiCryptoOrder.getIsPending() ? new CryptoOrderConfirmationRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderConfirmationRowState.ColorOverride.FG_2) : null, uiCryptoOrder.getIsPending() ? new CryptoOrderConfirmationRowState.TapAction.Tokenization.ShowTokenizationEstimatedTotalCostSheet(BaseCryptoConfirmationState2.estimatedTotalCostDto(uiCryptoOrder, resources)) : null, null, null, 50, null);
                    if (uiCryptoOrder.getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED) {
                        textContent2 = new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getPartialTotalString(uiCryptoOrder), null, null, null, null, null, 62, null);
                    } else {
                        textContent2 = new CryptoOrderConfirmationRowState.TextContent(companion9.invoke(UiCryptoOrders.getTotalText(uiCryptoOrder)), null, null, null, null, null, 62, null);
                    }
                    return new CryptoOrderConfirmationRowState(textContent10, null, textContent2, null, 10, null);
                case 23:
                    StringResource.Companion companion10 = StringResource.INSTANCE;
                    if (uiCryptoOrder.getExecutions().isEmpty()) {
                        i8 = C38572R.string.crypto_order_confirmation_limit_price;
                    } else {
                        i8 = C38572R.string.crypto_order_confirmation_price_label;
                    }
                    CryptoOrderConfirmationRowState.TextContent textContent11 = new CryptoOrderConfirmationRowState.TextContent(companion10.invoke(i8, new Object[0]), null, null, null, null, null, 62, null);
                    if (uiCryptoOrder.getExecutions().isEmpty()) {
                        BigDecimal equityInstrumentQuotePrice = uiCryptoOrder.getCryptoOrder().getEquityInstrumentQuotePrice();
                        if (equityInstrumentQuotePrice == null || (money = Money3.toMoney(equityInstrumentQuotePrice, Currencies.USD)) == null || (str2 = Money.format$default(money, CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), false, null, true, 0, null, true, null, false, false, 950, null)) == null || (estimatedPriceString = companion10.invoke(str2)) == null) {
                            estimatedPriceString = BaseCryptoConfirmationState2.getEstimatedPriceString(uiCryptoOrder);
                        }
                        textContent3 = new CryptoOrderConfirmationRowState.TextContent(estimatedPriceString, null, null, null, null, null, 62, null);
                    } else {
                        textContent3 = new CryptoOrderConfirmationRowState.TextContent(BaseCryptoConfirmationState2.getEstimatedPriceString(uiCryptoOrder), null, null, null, null, null, 62, null);
                    }
                    return new CryptoOrderConfirmationRowState(textContent11, null, textContent3, null, 10, null);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseCryptoConfirmationState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/confirmation/BaseCryptoConfirmationState$CryptoOrderConfirmationRowType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_NAME", "AMOUNT_BREAKDOWN", "AMOUNT_TOTAL", "CRYPTO_PURCHASED_OR_SOLD_BREAKDOWN", "CRYPTO_PURCHASED_OR_SOLD_TOTAL", "CRYPTO_PURCHASED_OR_SOLD_AS_SUBTOTAL", "ESTIMATED_COST_CREDIT_BREAKDOWN", "ESTIMATED_COST_CREDIT_TOTAL", "ESTIMATED_CRYPTO_BREAKDOWN", "ESTIMATED_CRYPTO_TOTAL", "ESTIMATED_PRICE", "FEE", "LIMIT_PRICE", "STOP_PRICE", "PENDING_CRYPTO", "PRICE_AT_EXECUTION", "ROBINHOOD_FEE", "LOTS_SELECTED", "QUANTITY_FSM", "ESTIMATED_PRICE_FSM", "FX_FEE_FSM", "TOTAL_COST_FSM", "LIMIT_PRICE_FSM", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoOrderConfirmationRowType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CryptoOrderConfirmationRowType[] $VALUES;
        public static final CryptoOrderConfirmationRowType ACCOUNT_NAME = new CryptoOrderConfirmationRowType("ACCOUNT_NAME", 0);
        public static final CryptoOrderConfirmationRowType AMOUNT_BREAKDOWN = new CryptoOrderConfirmationRowType("AMOUNT_BREAKDOWN", 1);
        public static final CryptoOrderConfirmationRowType AMOUNT_TOTAL = new CryptoOrderConfirmationRowType("AMOUNT_TOTAL", 2);
        public static final CryptoOrderConfirmationRowType CRYPTO_PURCHASED_OR_SOLD_BREAKDOWN = new CryptoOrderConfirmationRowType("CRYPTO_PURCHASED_OR_SOLD_BREAKDOWN", 3);
        public static final CryptoOrderConfirmationRowType CRYPTO_PURCHASED_OR_SOLD_TOTAL = new CryptoOrderConfirmationRowType("CRYPTO_PURCHASED_OR_SOLD_TOTAL", 4);
        public static final CryptoOrderConfirmationRowType CRYPTO_PURCHASED_OR_SOLD_AS_SUBTOTAL = new CryptoOrderConfirmationRowType("CRYPTO_PURCHASED_OR_SOLD_AS_SUBTOTAL", 5);
        public static final CryptoOrderConfirmationRowType ESTIMATED_COST_CREDIT_BREAKDOWN = new CryptoOrderConfirmationRowType("ESTIMATED_COST_CREDIT_BREAKDOWN", 6);
        public static final CryptoOrderConfirmationRowType ESTIMATED_COST_CREDIT_TOTAL = new CryptoOrderConfirmationRowType("ESTIMATED_COST_CREDIT_TOTAL", 7);
        public static final CryptoOrderConfirmationRowType ESTIMATED_CRYPTO_BREAKDOWN = new CryptoOrderConfirmationRowType("ESTIMATED_CRYPTO_BREAKDOWN", 8);
        public static final CryptoOrderConfirmationRowType ESTIMATED_CRYPTO_TOTAL = new CryptoOrderConfirmationRowType("ESTIMATED_CRYPTO_TOTAL", 9);
        public static final CryptoOrderConfirmationRowType ESTIMATED_PRICE = new CryptoOrderConfirmationRowType("ESTIMATED_PRICE", 10);
        public static final CryptoOrderConfirmationRowType FEE = new CryptoOrderConfirmationRowType("FEE", 11);
        public static final CryptoOrderConfirmationRowType LIMIT_PRICE = new CryptoOrderConfirmationRowType("LIMIT_PRICE", 12);
        public static final CryptoOrderConfirmationRowType STOP_PRICE = new CryptoOrderConfirmationRowType("STOP_PRICE", 13);
        public static final CryptoOrderConfirmationRowType PENDING_CRYPTO = new CryptoOrderConfirmationRowType("PENDING_CRYPTO", 14);
        public static final CryptoOrderConfirmationRowType PRICE_AT_EXECUTION = new CryptoOrderConfirmationRowType("PRICE_AT_EXECUTION", 15);
        public static final CryptoOrderConfirmationRowType ROBINHOOD_FEE = new CryptoOrderConfirmationRowType("ROBINHOOD_FEE", 16);
        public static final CryptoOrderConfirmationRowType LOTS_SELECTED = new CryptoOrderConfirmationRowType("LOTS_SELECTED", 17);
        public static final CryptoOrderConfirmationRowType QUANTITY_FSM = new CryptoOrderConfirmationRowType("QUANTITY_FSM", 18);
        public static final CryptoOrderConfirmationRowType ESTIMATED_PRICE_FSM = new CryptoOrderConfirmationRowType("ESTIMATED_PRICE_FSM", 19);
        public static final CryptoOrderConfirmationRowType FX_FEE_FSM = new CryptoOrderConfirmationRowType("FX_FEE_FSM", 20);
        public static final CryptoOrderConfirmationRowType TOTAL_COST_FSM = new CryptoOrderConfirmationRowType("TOTAL_COST_FSM", 21);
        public static final CryptoOrderConfirmationRowType LIMIT_PRICE_FSM = new CryptoOrderConfirmationRowType("LIMIT_PRICE_FSM", 22);

        private static final /* synthetic */ CryptoOrderConfirmationRowType[] $values() {
            return new CryptoOrderConfirmationRowType[]{ACCOUNT_NAME, AMOUNT_BREAKDOWN, AMOUNT_TOTAL, CRYPTO_PURCHASED_OR_SOLD_BREAKDOWN, CRYPTO_PURCHASED_OR_SOLD_TOTAL, CRYPTO_PURCHASED_OR_SOLD_AS_SUBTOTAL, ESTIMATED_COST_CREDIT_BREAKDOWN, ESTIMATED_COST_CREDIT_TOTAL, ESTIMATED_CRYPTO_BREAKDOWN, ESTIMATED_CRYPTO_TOTAL, ESTIMATED_PRICE, FEE, LIMIT_PRICE, STOP_PRICE, PENDING_CRYPTO, PRICE_AT_EXECUTION, ROBINHOOD_FEE, LOTS_SELECTED, QUANTITY_FSM, ESTIMATED_PRICE_FSM, FX_FEE_FSM, TOTAL_COST_FSM, LIMIT_PRICE_FSM};
        }

        public static EnumEntries<CryptoOrderConfirmationRowType> getEntries() {
            return $ENTRIES;
        }

        private CryptoOrderConfirmationRowType(String str, int i) {
        }

        static {
            CryptoOrderConfirmationRowType[] cryptoOrderConfirmationRowTypeArr$values = $values();
            $VALUES = cryptoOrderConfirmationRowTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cryptoOrderConfirmationRowTypeArr$values);
        }

        public static CryptoOrderConfirmationRowType valueOf(String str) {
            return (CryptoOrderConfirmationRowType) Enum.valueOf(CryptoOrderConfirmationRowType.class, str);
        }

        public static CryptoOrderConfirmationRowType[] values() {
            return (CryptoOrderConfirmationRowType[]) $VALUES.clone();
        }
    }
}
