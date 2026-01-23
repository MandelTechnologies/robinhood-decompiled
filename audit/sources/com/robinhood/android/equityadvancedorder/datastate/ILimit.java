package com.robinhood.android.equityadvancedorder.datastate;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.equities.tradesettings.utils.MarketHours2;
import com.robinhood.android.equities.tradesettings.utils.TimeInForceUtils;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderContextFactory;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.UserCanHideDefaultLimitPrice;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.datastate.ITaxLots;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration3;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.ApiFeeItem;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.TradingSession2;
import com.robinhood.models.util.Money;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: ILimit.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001JJ3\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0016\u0010-\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010$R\u0016\u00101\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0015R\u0014\u0010=\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0015R\u0016\u0010A\u001a\u0004\u0018\u00010>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0016\u0010E\u001a\u0004\u0018\u00010B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010DR\u000b\u0010H\u001a\u00020B8BX\u0082\u0004R\u000b\u0010I\u001a\u00020B8BX\u0082\u0004\u0082\u0001\u0002KL¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/ILimit;", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;", "", "instrumentIs24HourMarketTradable", "alwaysInclude24HourMarketRow", "useUnifiedTradingSessionSettingsSheet", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "getBottomSheetRowStates", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lkotlinx/collections/immutable/ImmutableList;", "hideOnSelect", "timeInForceBottomSheetDataRows", "(Z)Lkotlinx/collections/immutable/ImmutableList;", "twentyFourHourMarketTradable", "tradingSessionBottomSheetDataRows", "(ZZ)Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;", "getLimitState", "()Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;", "limitState", "getShowTextButton", "()Z", "showTextButton", "getShowOrderTypeSelectionRow", "showOrderTypeSelectionRow", "Lkotlin/Function0;", "Landroidx/compose/ui/text/AnnotatedString;", "getBidAskString", "()Lkotlin/jvm/functions/Function2;", "bidAskString", "", "getNasdaqPrefix", "()Ljava/lang/Integer;", "nasdaqPrefix", "Ljava/math/BigDecimal;", "getAskPrice", "()Ljava/math/BigDecimal;", "askPrice", "getBidPrice", "bidPrice", "getDefaultLimitPrice", "defaultLimitPrice", "", "getDefaultLimitPriceString", "()Ljava/lang/String;", "defaultLimitPriceString", "getLimitPrice", "limitPrice", "getLimitPriceString", "limitPriceString", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitNew;", "getWorkingConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitNew;", "workingConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitComplete;", "getCompletedConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitComplete;", "completedConfiguration", "getCanShowTooltip", "canShowTooltip", "getTooltipWillBeShown", "tooltipWillBeShown", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getEquityOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "equityOrderContext", "Lcom/robinhood/utils/resource/StringResource;", "getGfdTitle", "()Lcom/robinhood/utils/resource/StringResource;", "gfdTitle", "getGtcTitle", "gtcTitle", "gfdDetailText", "gtcDetailText", "LimitState", "Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;", "Lcom/robinhood/android/equityadvancedorder/datastate/LimitTaxLots;", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface ILimit extends EquityAdvancedOrderDataState {

    /* compiled from: ILimit.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EditingField.values().length];
            try {
                iArr2[EditingField.TRADING_SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EditingField.TIME_IN_FORCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EditingField.STRATEGY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    BigDecimal getAskPrice();

    Function2<Composer, Integer, AnnotatedString> getBidAskString();

    BigDecimal getBidPrice();

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    ImmutableList<EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow> getBottomSheetRowStates(Boolean instrumentIs24HourMarketTradable, Boolean alwaysInclude24HourMarketRow, boolean useUnifiedTradingSessionSettingsSheet);

    boolean getCanShowTooltip();

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    AdvancedOrder.LimitComplete getCompletedConfiguration();

    BigDecimal getDefaultLimitPrice();

    String getDefaultLimitPriceString();

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    EquityOrderContext getEquityOrderContext();

    StringResource getGfdTitle();

    StringResource getGtcTitle();

    BigDecimal getLimitPrice();

    String getLimitPriceString();

    LimitState getLimitState();

    Integer getNasdaqPrefix();

    boolean getShowOrderTypeSelectionRow();

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    boolean getShowTextButton();

    boolean getTooltipWillBeShown();

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    AdvancedOrder.LimitNew getWorkingConfiguration();

    /* compiled from: ILimit.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static boolean getShowTextButton(ILimit iLimit) {
            return false;
        }

        public static Account getActiveAccount(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getActiveAccount(iLimit);
        }

        public static Boolean getAdtTradable(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getAdtTradable(iLimit);
        }

        public static EquityAdvancedOrderBottomSheetState getBottomSheetState(ILimit iLimit, Boolean bool, Boolean bool2) {
            return EquityAdvancedOrderDataState.DefaultImpls.getBottomSheetState(iLimit, bool, bool2);
        }

        public static boolean getButtonEnabled(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getButtonEnabled(iLimit);
        }

        public static boolean getButtonLoading(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getButtonLoading(iLimit);
        }

        public static StringResource getEstimateRowTitle(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getEstimateRowTitle(iLimit);
        }

        public static EquityOrderFormRowState getEstimatedCostRow(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getEstimatedCostRow(iLimit);
        }

        public static StringResource getEstimatedCostString(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getEstimatedCostString(iLimit);
        }

        public static BigDecimal getNumberOfShares(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getNumberOfShares(iLimit);
        }

        public static StringResource getPrimaryButtonText(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getPrimaryButtonText(iLimit);
        }

        public static OrderRequest2 getQuantityOrAmount(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getQuantityOrAmount(iLimit);
        }

        public static boolean getShouldShowBackupWithholdingWarning(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getShouldShowBackupWithholdingWarning(iLimit);
        }

        public static EquityOrderRequestInputs.StaticInputs getStaticInputs(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getStaticInputs(iLimit);
        }

        public static StringResource getSubtitleStringResource(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getSubtitleStringResource(iLimit);
        }

        public static StringResource getTitleStringResource(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getTitleStringResource(iLimit);
        }

        public static boolean getUserHasMultipleAccounts(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.getUserHasMultipleAccounts(iLimit);
        }

        public static boolean isCancelNewOrder(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.isCancelNewOrder(iLimit);
        }

        public static boolean isShortPosition(ILimit iLimit) {
            return EquityAdvancedOrderDataState.DefaultImpls.isShortPosition(iLimit);
        }

        public static boolean getShowOrderTypeSelectionRow(ILimit iLimit) {
            return iLimit.getCommonState().getAdvancedMarketOrdersEnabled();
        }

        public static BigDecimal getAskPrice(ILimit iLimit) {
            Money askPrice;
            Quote quote = iLimit.getCommonState().getQuote();
            if (quote == null || (askPrice = quote.getAskPrice()) == null) {
                return null;
            }
            return askPrice.getDecimalValue();
        }

        public static BigDecimal getBidPrice(ILimit iLimit) {
            Money bidPrice;
            Quote quote = iLimit.getCommonState().getQuote();
            if (quote == null || (bidPrice = quote.getBidPrice()) == null) {
                return null;
            }
            return bidPrice.getDecimalValue();
        }

        public static BigDecimal getDefaultLimitPrice(ILimit iLimit) {
            BigDecimal askPrice;
            if (iLimit.getLimitState().getUserBackspacedOnFirstLimitPriceInteraction() && !iLimit.getLimitState().getUserCanHideDefaultLimitPriceExperimentVariant().isControl()) {
                return null;
            }
            if (!Intrinsics.areEqual(iLimit.getLimitState().isAdtHours(), Boolean.FALSE)) {
                return BigDecimal.ZERO;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[iLimit.getCommonState().getSide().ordinal()];
            if (i == 1) {
                askPrice = iLimit.getAskPrice();
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                askPrice = iLimit.getBidPrice();
            }
            return askPrice == null ? BigDecimal.ZERO : askPrice;
        }

        public static String getDefaultLimitPriceString(ILimit iLimit) {
            BigDecimal defaultLimitPrice = iLimit.getDefaultLimitPrice();
            if (defaultLimitPrice != null) {
                return Formats.getPriceFormat().format(defaultLimitPrice);
            }
            return null;
        }

        public static BigDecimal getLimitPrice(ILimit iLimit) {
            BigDecimal bigDecimalOrNull;
            String limitPriceString = iLimit.getLimitPriceString();
            if (limitPriceString != null && (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(limitPriceString)) != null) {
                return bigDecimalOrNull;
            }
            BigDecimal defaultLimitPrice = iLimit.getDefaultLimitPrice();
            if (defaultLimitPrice != null) {
                return defaultLimitPrice;
            }
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }

        public static String getLimitPriceString(ILimit iLimit) {
            String userLimitPriceString = iLimit.getLimitState().getUserLimitPriceString();
            if (userLimitPriceString == null || StringsKt.toBigDecimalOrNull(userLimitPriceString) == null) {
                return null;
            }
            return userLimitPriceString;
        }

        public static AdvancedOrder.LimitNew getWorkingConfiguration(ILimit iLimit) {
            String accountNumber;
            Account activeAccount = iLimit.getActiveAccount();
            if (activeAccount == null || (accountNumber = activeAccount.getAccountNumber()) == null) {
                accountNumber = iLimit.getCommonState().getAccountNumber();
            }
            return new AdvancedOrder.LimitNew(accountNumber, iLimit.getNumberOfShares(), iLimit.getLimitPrice(), iLimit.getLimitState().getTimeInForce(), iLimit.getLimitState().getTradingSession(), iLimit instanceof ITaxLots);
        }

        public static AdvancedOrder.LimitComplete getCompletedConfiguration(ILimit iLimit) {
            AdvancedOrder.LimitDraft limitDraftCompletedDraft = iLimit.getWorkingConfiguration().completedDraft();
            if (limitDraftCompletedDraft != null) {
                BigDecimal limitPrice = limitDraftCompletedDraft.getLimitPrice();
                BigDecimal bigDecimal = BigDecimal.ZERO;
                if (Intrinsics.areEqual(limitPrice, bigDecimal) || Intrinsics.areEqual(limitDraftCompletedDraft.getShareQuantity(), bigDecimal)) {
                    limitDraftCompletedDraft = null;
                }
                if (limitDraftCompletedDraft != null) {
                    return limitDraftCompletedDraft.validated(iLimit.getCommonState().getCheckOverrides(), iLimit.getCommonState().getMicrogramOrderSummary());
                }
            }
            return null;
        }

        public static boolean getCanShowTooltip(ILimit iLimit) {
            return BigDecimals7.isPositive(iLimit.getDefaultLimitPrice()) && iLimit.getCommonState().getOrderToReplaceId() == null;
        }

        public static boolean getTooltipWillBeShown(ILimit iLimit) {
            return iLimit.getCanShowTooltip() && Intrinsics.areEqual(iLimit.getLimitState().getTooltipSeen(), Boolean.FALSE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static EquityOrderContext getEquityOrderContext(ILimit iLimit) {
            BigDecimal totalFeesAndTaxes;
            List<ApiFeeItem> fees;
            EquityAdvancedOrderDataState.CommonState commonState = iLimit.getCommonState();
            Account activeAccount = iLimit.getActiveAccount();
            if (activeAccount == null || commonState.getInstrument() == null || commonState.getTradingSession() == null || commonState.getInstrumentBuyingPower() == null) {
                return null;
            }
            EquityOrderContextFactory equityOrderContextFactory = EquityOrderContextFactory.INSTANCE;
            Instrument instrument = commonState.getInstrument();
            TradingSession tradingSession = commonState.getTradingSession();
            Position position = commonState.getPosition();
            BigDecimal fee = null;
            Quote quote = commonState.getQuote();
            EquityOrderRequestInputs.StaticInputs staticInputs = iLimit.getStaticInputs();
            String accountNumber = activeAccount.getAccountNumber();
            Order orderPendingReplacement = commonState.getOrderPendingReplacement();
            UUID id = orderPendingReplacement != null ? orderPendingReplacement.getId() : null;
            BigDecimal limitPrice = iLimit.getLimitPrice();
            boolean overrideToExecuteInMarketHoursOnly = commonState.getOverrideToExecuteInMarketHoursOnly();
            OrderMarketHours overrideMarketHours = EquityOrderConfiguration3.getOverrideMarketHours(iLimit.getWorkingConfiguration());
            boolean overrideFlipIpoAccessShares = commonState.getOverrideFlipIpoAccessShares();
            List<String> checkOverrides = commonState.getCheckOverrides();
            OrderRequest2 quantityOrAmount = iLimit.getQuantityOrAmount();
            BigDecimal trailAmount = EquityOrderConfiguration3.getTrailAmount(iLimit.getWorkingConfiguration());
            Integer trailPercentage = EquityOrderConfiguration3.getTrailPercentage(iLimit.getWorkingConfiguration());
            BigDecimal presetPercentLimit = EquityOrderConfiguration3.getPresetPercentLimit(iLimit.getWorkingConfiguration());
            OrderTimeInForce timeInForce = iLimit.getLimitState().getTimeInForce();
            Order.Configuration orderConfiguration = iLimit.getWorkingConfiguration().getOrderConfiguration();
            Result<ApiEstimatedFees> resultM13792getEstimatedFeesxLWZpok = iLimit.getCommonState().m13792getEstimatedFeesxLWZpok();
            if (resultM13792getEstimatedFeesxLWZpok != null) {
                Object value = resultM13792getEstimatedFeesxLWZpok.getValue();
                if (Result.m28555isFailureimpl(value)) {
                    value = null;
                }
                ApiEstimatedFees apiEstimatedFees = (ApiEstimatedFees) value;
                totalFeesAndTaxes = apiEstimatedFees != null ? apiEstimatedFees.getTotalFeesAndTaxes() : null;
            }
            Result<ApiEstimatedFees> resultM13792getEstimatedFeesxLWZpok2 = iLimit.getCommonState().m13792getEstimatedFeesxLWZpok();
            if (resultM13792getEstimatedFeesxLWZpok2 != null) {
                Object value2 = resultM13792getEstimatedFeesxLWZpok2.getValue();
                if (Result.m28555isFailureimpl(value2)) {
                    value2 = null;
                }
                ApiEstimatedFees apiEstimatedFees2 = (ApiEstimatedFees) value2;
                fees = apiEstimatedFees2 != null ? apiEstimatedFees2.getFees() : null;
            }
            Result<ShortingInfo> resultM13793getShortingInfoxLWZpok = iLimit.getCommonState().m13793getShortingInfoxLWZpok();
            if (resultM13793getShortingInfoxLWZpok != null) {
                Object value3 = resultM13793getShortingInfoxLWZpok.getValue();
                if (Result.m28555isFailureimpl(value3)) {
                    value3 = null;
                }
                ShortingInfo shortingInfo = (ShortingInfo) value3;
                if (shortingInfo != null) {
                    fee = shortingInfo.getFee();
                }
            }
            return equityOrderContextFactory.create(activeAccount, instrument, tradingSession, position, quote, new EquityOrderRequestInputs(staticInputs, accountNumber, id, limitPrice, overrideFlipIpoAccessShares, overrideToExecuteInMarketHoursOnly, overrideMarketHours, checkOverrides, quantityOrAmount, null, trailAmount, trailPercentage, presetPercentLimit, timeInForce, orderConfiguration, totalFeesAndTaxes, fees, fee, iLimit.getLimitState().getMarketBuysEnabled(), null, CollectionsKt.emptyList(), iLimit.getCommonState().getPositionEffect(), iLimit.getCommonState().getSubzeroEnabled()), (64 & 64) != 0 ? Instant.now() : null, commonState.getInstrumentBuyingPower(), commonState.getOrderPendingReplacement());
        }

        public static StringResource getGfdTitle(ILimit iLimit) {
            TimeInForceUtils timeInForceUtils = TimeInForceUtils.INSTANCE;
            OrderMarketHours tradingSession = iLimit.getLimitState().getTradingSession();
            TradingSession tradingSession2 = iLimit.getCommonState().getTradingSession();
            return TimeInForceUtils.getGfdTitle$default(timeInForceUtils, null, tradingSession, tradingSession2 != null ? tradingSession2.getCurrentMarketHours() : null, iLimit.getCommonState().getNextMarketHours(), null, 16, null);
        }

        private static StringResource getGfdDetailText(ILimit iLimit) {
            return TimeInForceUtils.INSTANCE.getGfdDetailText(iLimit.getLimitState().getTradingSession());
        }

        public static StringResource getGtcTitle(ILimit iLimit) {
            return TimeInForceUtils.getGtcTitle$default(TimeInForceUtils.INSTANCE, iLimit.getLimitState().getBrokebackOrderExpireDateString(), null, null, 6, null);
        }

        private static StringResource getGtcDetailText(ILimit iLimit) {
            return TimeInForceUtils.INSTANCE.getGtcDetailText();
        }

        public static /* synthetic */ ImmutableList timeInForceBottomSheetDataRows$default(ILimit iLimit, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: timeInForceBottomSheetDataRows");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return timeInForceBottomSheetDataRows(iLimit, z);
        }

        private static ImmutableList<EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow> timeInForceBottomSheetDataRows(ILimit iLimit, boolean z) {
            StringResource gfdTitle = iLimit.getGfdTitle();
            if (gfdTitle == null) {
                gfdTitle = StringResource.INSTANCE.invoke("");
            }
            StringResource stringResource = gfdTitle;
            StringResource gfdDetailText = getGfdDetailText(iLimit);
            OrderTimeInForce timeInForce = iLimit.getLimitState().getTimeInForce();
            OrderTimeInForce orderTimeInForce = OrderTimeInForce.GFD;
            boolean z2 = timeInForce == orderTimeInForce;
            EditingField editingField = EditingField.TIME_IN_FORCE;
            EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TimeInForceRow timeInForceRow = new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TimeInForceRow(stringResource, gfdDetailText, z2, false, editingField, false, z, orderTimeInForce, 40, null);
            StringResource gtcTitle = iLimit.getGtcTitle();
            StringResource gtcDetailText = getGtcDetailText(iLimit);
            OrderTimeInForce timeInForce2 = iLimit.getLimitState().getTimeInForce();
            OrderTimeInForce orderTimeInForce2 = OrderTimeInForce.GTC;
            return extensions2.persistentListOf(timeInForceRow, new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TimeInForceRow(gtcTitle, gtcDetailText, timeInForce2 == orderTimeInForce2, false, editingField, false, z, orderTimeInForce2, 32, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static ImmutableList<EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow> tradingSessionBottomSheetDataRows(ILimit iLimit, Boolean bool, Boolean bool2) {
            Object[] objArr;
            boolean z;
            Boolean bool3 = Boolean.TRUE;
            boolean z2 = Intrinsics.areEqual(bool, bool3) || (!Intrinsics.areEqual(bool, bool3) && Intrinsics.areEqual(bool2, bool3));
            EquityAdvancedOrderDataState.CommonState commonState = iLimit.getCommonState();
            SetTradingHourVisualizerArgs tradingHourVisualizerArgs = iLimit.getTradingHourVisualizerArgs();
            EquityAdvancedOrderBottomSheetState.BottomSheetRowState.VisualizerRow visualizerRow = tradingHourVisualizerArgs != null ? new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.VisualizerRow(tradingHourVisualizerArgs) : null;
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(C15237R.string.order_create_bottom_sheet_market_hours_row_title, new Object[0]);
            TradingSession tradingSession = commonState.getTradingSession();
            StringResource regularHoursDetailText = MarketHours2.getRegularHoursDetailText(tradingSession != null ? tradingSession.getCurrentMarketHours() : null);
            OrderMarketHours tradingSession2 = iLimit.getLimitState().getTradingSession();
            OrderMarketHours orderMarketHours = OrderMarketHours.REGULAR_HOURS;
            EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TradingSessionRow tradingSessionRow = new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TradingSessionRow(stringResourceInvoke, regularHoursDetailText, tradingSession2 == orderMarketHours, false, commonState.getEditingField(), false, false, orderMarketHours, 104, null);
            int i = WhenMappings.$EnumSwitchMapping$0[iLimit.getCommonState().getSide().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                TradingSession tradingSession3 = iLimit.getCommonState().getTradingSession();
                if (tradingSession3 == null || !TradingSession2.allowsRegularHoursShorting(tradingSession3)) {
                    tradingSessionRow = null;
                }
            }
            StringResource stringResourceInvoke2 = companion.invoke(C15237R.string.order_create_bottom_sheet_extended_hours_row_title, new Object[0]);
            TradingSession tradingSession4 = commonState.getTradingSession();
            StringResource extendedHoursDetailText = MarketHours2.getExtendedHoursDetailText(tradingSession4 != null ? tradingSession4.getCurrentMarketHours() : null);
            OrderMarketHours tradingSession5 = iLimit.getLimitState().getTradingSession();
            OrderMarketHours orderMarketHours2 = OrderMarketHours.EXTENDED_HOURS;
            if (tradingSession5 == orderMarketHours2) {
                objArr = 2;
                z = true;
            } else {
                objArr = 2;
                z = false;
            }
            Object[] objArr2 = objArr;
            EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TradingSessionRow tradingSessionRow2 = new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TradingSessionRow(stringResourceInvoke2, extendedHoursDetailText, z, z2, commonState.getEditingField(), false, false, orderMarketHours2, 96, null);
            Quote quote = iLimit.getCommonState().getQuote();
            if (quote == null || !quote.getHasTraded()) {
                tradingSessionRow2 = null;
            }
            StringResource stringResourceInvoke3 = companion.invoke(C15237R.string.order_create_bottom_sheet_all_day_hours_row_title, new Object[0]);
            TradingSession tradingSession6 = commonState.getTradingSession();
            StringResource allDayHoursDetailText = MarketHours2.getAllDayHoursDetailText(tradingSession6 != null ? tradingSession6.getCurrentMarketHours() : null, iLimit.getCommonState().getExperimentVariant(), iLimit.getCommonState().getClock());
            OrderMarketHours tradingSession7 = iLimit.getLimitState().getTradingSession();
            OrderMarketHours orderMarketHours3 = OrderMarketHours.ALL_DAY_HOURS;
            EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TradingSessionRow tradingSessionRow3 = z2 ? new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TradingSessionRow(stringResourceInvoke3, allDayHoursDetailText, tradingSession7 == orderMarketHours3, false, commonState.getEditingField(), false, Intrinsics.areEqual(bool, bool3), orderMarketHours3, 32, null) : null;
            EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow[] baseRowArr = new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow[4];
            baseRowArr[0] = visualizerRow;
            baseRowArr[1] = tradingSessionRow;
            baseRowArr[objArr2 == true ? 1 : 0] = tradingSessionRow2;
            baseRowArr[3] = tradingSessionRow3;
            return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) baseRowArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ImmutableList<EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow> getBottomSheetRowStates(ILimit iLimit, Boolean bool, Boolean bool2, boolean z) {
            EquityAdvancedOrderDataState.CommonState commonState = iLimit.getCommonState();
            int i = 1;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (z) {
                StringResource.Companion companion = StringResource.INSTANCE;
                StringResource stringResourceInvoke = companion.invoke(C15237R.string.order_create_bottom_sheet_trading_session_header_title_unified, new Object[0]);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                return extensions2.toImmutableList(CollectionsKt.plus((Collection<? extends EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DoneButtonRow>) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.SubtitleRow("SelectTradingSessionSubtitleRow", stringResourceInvoke, companion2.getStart())), (Iterable) tradingSessionBottomSheetDataRows(iLimit, bool, bool2)), (Iterable) CollectionsKt.listOf(new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.SubtitleRow("SelectTimeInForceSubtitleRow", companion.invoke(C15237R.string.order_create_bottom_sheet_time_in_force_header_title, new Object[0]), companion2.getStart()))), (Iterable) timeInForceBottomSheetDataRows(iLimit, false)), new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DoneButtonRow(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0)));
            }
            EditingField editingField = commonState.getEditingField();
            int i2 = editingField == null ? -1 : WhenMappings.$EnumSwitchMapping$1[editingField.ordinal()];
            if (i2 == 1) {
                return tradingSessionBottomSheetDataRows(iLimit, bool, bool2);
            }
            if (i2 == 2) {
                return timeInForceBottomSheetDataRows(iLimit, true);
            }
            if (i2 != 3) {
                return null;
            }
            Intrinsics.checkNotNull(iLimit, "null cannot be cast to non-null type com.robinhood.android.equityadvancedorder.datastate.ITaxLots");
            ITaxLots.TaxLotsState taxLotsState = ((ITaxLots) iLimit).getTaxLotsState();
            BigDecimal numberOfShares = iLimit.getNumberOfShares();
            Position position = iLimit.getCommonState().getPosition();
            return taxLotsState.getStrategyRowStates(numberOfShares, position != null ? position.getSharesAvailableForSellsTaxLots() : null);
        }
    }

    /* compiled from: ILimit.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003Jz\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u000b\u0010\u001bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001e¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;", "", "userLimitPriceString", "", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "brokebackOrderExpireDateString", "tooltipSeen", "", "isAdtHours", "marketBuysEnabled", "userBackspacedOnFirstLimitPriceInteraction", "userCanHideDefaultLimitPriceExperimentVariant", "Lcom/robinhood/android/equityadvancedorder/UserCanHideDefaultLimitPrice$Variant;", "isFirstLimitPriceInteraction", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLcom/robinhood/android/equityadvancedorder/UserCanHideDefaultLimitPrice$Variant;Z)V", "getUserLimitPriceString", "()Ljava/lang/String;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getTradingSession", "()Lcom/robinhood/models/db/OrderMarketHours;", "getBrokebackOrderExpireDateString", "getTooltipSeen", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarketBuysEnabled", "()Z", "getUserBackspacedOnFirstLimitPriceInteraction", "getUserCanHideDefaultLimitPriceExperimentVariant", "()Lcom/robinhood/android/equityadvancedorder/UserCanHideDefaultLimitPrice$Variant;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLcom/robinhood/android/equityadvancedorder/UserCanHideDefaultLimitPrice$Variant;Z)Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;", "equals", "other", "hashCode", "", "toString", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LimitState {
        public static final int $stable = 0;
        private final String brokebackOrderExpireDateString;
        private final Boolean isAdtHours;
        private final boolean isFirstLimitPriceInteraction;
        private final boolean marketBuysEnabled;
        private final OrderTimeInForce timeInForce;
        private final Boolean tooltipSeen;
        private final OrderMarketHours tradingSession;
        private final boolean userBackspacedOnFirstLimitPriceInteraction;
        private final UserCanHideDefaultLimitPrice.Variant userCanHideDefaultLimitPriceExperimentVariant;
        private final String userLimitPriceString;

        public LimitState() {
            this(null, null, null, null, null, null, false, false, null, false, 1023, null);
        }

        public static /* synthetic */ LimitState copy$default(LimitState limitState, String str, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, String str2, Boolean bool, Boolean bool2, boolean z, boolean z2, UserCanHideDefaultLimitPrice.Variant variant, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = limitState.userLimitPriceString;
            }
            if ((i & 2) != 0) {
                orderTimeInForce = limitState.timeInForce;
            }
            if ((i & 4) != 0) {
                orderMarketHours = limitState.tradingSession;
            }
            if ((i & 8) != 0) {
                str2 = limitState.brokebackOrderExpireDateString;
            }
            if ((i & 16) != 0) {
                bool = limitState.tooltipSeen;
            }
            if ((i & 32) != 0) {
                bool2 = limitState.isAdtHours;
            }
            if ((i & 64) != 0) {
                z = limitState.marketBuysEnabled;
            }
            if ((i & 128) != 0) {
                z2 = limitState.userBackspacedOnFirstLimitPriceInteraction;
            }
            if ((i & 256) != 0) {
                variant = limitState.userCanHideDefaultLimitPriceExperimentVariant;
            }
            if ((i & 512) != 0) {
                z3 = limitState.isFirstLimitPriceInteraction;
            }
            UserCanHideDefaultLimitPrice.Variant variant2 = variant;
            boolean z4 = z3;
            boolean z5 = z;
            boolean z6 = z2;
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            return limitState.copy(str, orderTimeInForce, orderMarketHours, str2, bool3, bool4, z5, z6, variant2, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserLimitPriceString() {
            return this.userLimitPriceString;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsFirstLimitPriceInteraction() {
            return this.isFirstLimitPriceInteraction;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderMarketHours getTradingSession() {
            return this.tradingSession;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBrokebackOrderExpireDateString() {
            return this.brokebackOrderExpireDateString;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getTooltipSeen() {
            return this.tooltipSeen;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getIsAdtHours() {
            return this.isAdtHours;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getMarketBuysEnabled() {
            return this.marketBuysEnabled;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getUserBackspacedOnFirstLimitPriceInteraction() {
            return this.userBackspacedOnFirstLimitPriceInteraction;
        }

        /* renamed from: component9, reason: from getter */
        public final UserCanHideDefaultLimitPrice.Variant getUserCanHideDefaultLimitPriceExperimentVariant() {
            return this.userCanHideDefaultLimitPriceExperimentVariant;
        }

        public final LimitState copy(String userLimitPriceString, OrderTimeInForce timeInForce, OrderMarketHours tradingSession, String brokebackOrderExpireDateString, Boolean tooltipSeen, Boolean isAdtHours, boolean marketBuysEnabled, boolean userBackspacedOnFirstLimitPriceInteraction, UserCanHideDefaultLimitPrice.Variant userCanHideDefaultLimitPriceExperimentVariant, boolean isFirstLimitPriceInteraction) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
            Intrinsics.checkNotNullParameter(userCanHideDefaultLimitPriceExperimentVariant, "userCanHideDefaultLimitPriceExperimentVariant");
            return new LimitState(userLimitPriceString, timeInForce, tradingSession, brokebackOrderExpireDateString, tooltipSeen, isAdtHours, marketBuysEnabled, userBackspacedOnFirstLimitPriceInteraction, userCanHideDefaultLimitPriceExperimentVariant, isFirstLimitPriceInteraction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LimitState)) {
                return false;
            }
            LimitState limitState = (LimitState) other;
            return Intrinsics.areEqual(this.userLimitPriceString, limitState.userLimitPriceString) && this.timeInForce == limitState.timeInForce && this.tradingSession == limitState.tradingSession && Intrinsics.areEqual(this.brokebackOrderExpireDateString, limitState.brokebackOrderExpireDateString) && Intrinsics.areEqual(this.tooltipSeen, limitState.tooltipSeen) && Intrinsics.areEqual(this.isAdtHours, limitState.isAdtHours) && this.marketBuysEnabled == limitState.marketBuysEnabled && this.userBackspacedOnFirstLimitPriceInteraction == limitState.userBackspacedOnFirstLimitPriceInteraction && this.userCanHideDefaultLimitPriceExperimentVariant == limitState.userCanHideDefaultLimitPriceExperimentVariant && this.isFirstLimitPriceInteraction == limitState.isFirstLimitPriceInteraction;
        }

        public int hashCode() {
            String str = this.userLimitPriceString;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + this.tradingSession.hashCode()) * 31;
            String str2 = this.brokebackOrderExpireDateString;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.tooltipSeen;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isAdtHours;
            return ((((((((iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Boolean.hashCode(this.marketBuysEnabled)) * 31) + Boolean.hashCode(this.userBackspacedOnFirstLimitPriceInteraction)) * 31) + this.userCanHideDefaultLimitPriceExperimentVariant.hashCode()) * 31) + Boolean.hashCode(this.isFirstLimitPriceInteraction);
        }

        public String toString() {
            return "LimitState(userLimitPriceString=" + this.userLimitPriceString + ", timeInForce=" + this.timeInForce + ", tradingSession=" + this.tradingSession + ", brokebackOrderExpireDateString=" + this.brokebackOrderExpireDateString + ", tooltipSeen=" + this.tooltipSeen + ", isAdtHours=" + this.isAdtHours + ", marketBuysEnabled=" + this.marketBuysEnabled + ", userBackspacedOnFirstLimitPriceInteraction=" + this.userBackspacedOnFirstLimitPriceInteraction + ", userCanHideDefaultLimitPriceExperimentVariant=" + this.userCanHideDefaultLimitPriceExperimentVariant + ", isFirstLimitPriceInteraction=" + this.isFirstLimitPriceInteraction + ")";
        }

        public LimitState(String str, OrderTimeInForce timeInForce, OrderMarketHours tradingSession, String str2, Boolean bool, Boolean bool2, boolean z, boolean z2, UserCanHideDefaultLimitPrice.Variant userCanHideDefaultLimitPriceExperimentVariant, boolean z3) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
            Intrinsics.checkNotNullParameter(userCanHideDefaultLimitPriceExperimentVariant, "userCanHideDefaultLimitPriceExperimentVariant");
            this.userLimitPriceString = str;
            this.timeInForce = timeInForce;
            this.tradingSession = tradingSession;
            this.brokebackOrderExpireDateString = str2;
            this.tooltipSeen = bool;
            this.isAdtHours = bool2;
            this.marketBuysEnabled = z;
            this.userBackspacedOnFirstLimitPriceInteraction = z2;
            this.userCanHideDefaultLimitPriceExperimentVariant = userCanHideDefaultLimitPriceExperimentVariant;
            this.isFirstLimitPriceInteraction = z3;
        }

        public final String getUserLimitPriceString() {
            return this.userLimitPriceString;
        }

        public /* synthetic */ LimitState(String str, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, String str2, Boolean bool, Boolean bool2, boolean z, boolean z2, UserCanHideDefaultLimitPrice.Variant variant, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? OrderTimeInForce.GFD : orderTimeInForce, (i & 4) != 0 ? OrderMarketHours.REGULAR_HOURS : orderMarketHours, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? UserCanHideDefaultLimitPrice.Variant.CONTROL : variant, (i & 512) != 0 ? true : z3);
        }

        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final OrderMarketHours getTradingSession() {
            return this.tradingSession;
        }

        public final String getBrokebackOrderExpireDateString() {
            return this.brokebackOrderExpireDateString;
        }

        public final Boolean getTooltipSeen() {
            return this.tooltipSeen;
        }

        public final Boolean isAdtHours() {
            return this.isAdtHours;
        }

        public final boolean getMarketBuysEnabled() {
            return this.marketBuysEnabled;
        }

        public final boolean getUserBackspacedOnFirstLimitPriceInteraction() {
            return this.userBackspacedOnFirstLimitPriceInteraction;
        }

        public final UserCanHideDefaultLimitPrice.Variant getUserCanHideDefaultLimitPriceExperimentVariant() {
            return this.userCanHideDefaultLimitPriceExperimentVariant;
        }

        public final boolean isFirstLimitPriceInteraction() {
            return this.isFirstLimitPriceInteraction;
        }
    }
}
