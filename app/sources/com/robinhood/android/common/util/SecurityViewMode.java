package com.robinhood.android.common.util;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesMarginRequirement;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices;
import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.directipo.models.p292db.IpoQuotes;
import com.robinhood.models.crypto.p314db.CryptoHoldingCostBasis;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SecurityViewMode.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0003>?@B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016J4\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J0\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&J\u001c\u0010)\u001a\u0004\u0018\u00010$2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J:\u0010*\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u0016J&\u00100\u001a\u0004\u0018\u00010$2\u0006\u0010\u0011\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J:\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020$2\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001062\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u0016J&\u00107\u001a\u0004\u0018\u00010$2\u0006\u00102\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001062\b\u00103\u001a\u0004\u0018\u000104H\u0002J&\u00108\u001a\u0004\u0018\u00010$2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0011\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J \u0010;\u001a\u00020\u000e2\u0006\u00102\u001a\u00020$2\b\u0010<\u001a\u0004\u0018\u00010$2\u0006\u0010\u0015\u001a\u00020\u0016J\u001c\u0010=\u001a\u0004\u0018\u00010$2\u0006\u00102\u001a\u00020$2\b\u0010<\u001a\u0004\u0018\u00010$H\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/common/util/SecurityViewMode;", "", "<init>", "(Ljava/lang/String;I)V", "LAST_PRICE", "EQUITY", "PERCENT_CHANGE", "TODAYS_DELTA", "TOTAL_DELTA", "TOTAL_PERCENT_CHANGE", "FUTURES_MARGIN_REQUIREMENT", "shouldColorizeDefault", "", "getFormatInfoForInstrument", "Lcom/robinhood/android/common/util/SecurityViewMode$FormatInfo;", "resources", "Landroid/content/res/Resources;", "quote", "Lcom/robinhood/models/db/Quote;", "position", "Lcom/robinhood/models/db/Position;", "formatAmountFallback", "", "getFormatInfoForIpoInstrument", "ipoQuote", "Lcom/robinhood/directipo/models/db/IpoQuote;", "getFormatInfoForOptionStrategy", "Lcom/robinhood/models/db/AggregateOptionStrategyQuote;", "optionChain", "Lcom/robinhood/models/db/OptionChain;", "optionOpenPrice", "Lcom/robinhood/models/util/Money;", "optionOpenPriceDirection", "Lcom/robinhood/models/db/OrderDirection;", "formatDisplayAmount", "amount", "Ljava/math/BigDecimal;", "priceFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "priceDeltaFormatter", "percentageDeltaFormatter", "getDisplayAmount", "getFormatInfoForCrypto", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "cryptoHistorical", "Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "holding", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "getDisplayAmountForCrypto", "getFormatInfoForFutures", "lastTradePrice", "previousClose", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "marginRequirement", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;", "getDisplayAmountForFutures", "getDisplayAmountForOptionStrategy", "simulatedOptionInstrumentPosition", "Lcom/robinhood/models/db/OptionInstrumentPosition;", "getFormatInfoForIndexOption", "previousClosePrice", "getDisplayAmountForIndexOption", "PreIpoInstrumentRowPriceOverlay", "FormatInfo", "Companion", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SecurityViewMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SecurityViewMode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final List<SecurityViewMode> DefaultViewModes;
    public static final SecurityViewMode FUTURES_MARGIN_REQUIREMENT;
    private static final List<SecurityViewMode> FuturesRhListOnlyViewModes;
    public static final SecurityViewMode LAST_PRICE = new SecurityViewMode("LAST_PRICE", 0);
    public static final SecurityViewMode EQUITY = new SecurityViewMode("EQUITY", 1);
    public static final SecurityViewMode PERCENT_CHANGE = new SecurityViewMode("PERCENT_CHANGE", 2);
    public static final SecurityViewMode TODAYS_DELTA = new SecurityViewMode("TODAYS_DELTA", 3);
    public static final SecurityViewMode TOTAL_DELTA = new SecurityViewMode("TOTAL_DELTA", 4);
    public static final SecurityViewMode TOTAL_PERCENT_CHANGE = new SecurityViewMode("TOTAL_PERCENT_CHANGE", 5);

    /* compiled from: SecurityViewMode.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SecurityViewMode.values().length];
            try {
                iArr[SecurityViewMode.LAST_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecurityViewMode.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecurityViewMode.PERCENT_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SecurityViewMode.TODAYS_DELTA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SecurityViewMode.FUTURES_MARGIN_REQUIREMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SecurityViewMode.TOTAL_DELTA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SecurityViewMode.TOTAL_PERCENT_CHANGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderDirection.values().length];
            try {
                iArr2[OrderDirection.DEBIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OrderDirection.CREDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final /* synthetic */ SecurityViewMode[] $values() {
        return new SecurityViewMode[]{LAST_PRICE, EQUITY, PERCENT_CHANGE, TODAYS_DELTA, TOTAL_DELTA, TOTAL_PERCENT_CHANGE, FUTURES_MARGIN_REQUIREMENT};
    }

    public static EnumEntries<SecurityViewMode> getEntries() {
        return $ENTRIES;
    }

    private SecurityViewMode(String str, int i) {
    }

    static {
        SecurityViewMode securityViewMode = new SecurityViewMode("FUTURES_MARGIN_REQUIREMENT", 6);
        FUTURES_MARGIN_REQUIREMENT = securityViewMode;
        SecurityViewMode[] securityViewModeArr$values = $values();
        $VALUES = securityViewModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(securityViewModeArr$values);
        INSTANCE = new Companion(null);
        List<SecurityViewMode> listListOf = CollectionsKt.listOf(securityViewMode);
        FuturesRhListOnlyViewModes = listListOf;
        DefaultViewModes = CollectionsKt.minus((Iterable) getEntries(), (Iterable) listListOf);
    }

    public final boolean shouldColorizeDefault() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
            case 7:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final FormatInfo getFormatInfoForInstrument(Resources resources, Quote quote, Position position, String formatAmountFallback) {
        DirectionOverlay directionOverlay;
        DirectionOverlay directionOverlayFromSignOf;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(formatAmountFallback, "formatAmountFallback");
        if ((this == TOTAL_DELTA || this == TOTAL_PERCENT_CHANGE) && position != null && position.isAvgCostAffected()) {
            String string2 = resources.getString(C41827R.string.general_label_n_a);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            if (quote.isUpForTheDay()) {
                directionOverlay = DirectionOverlay.POSITIVE;
            } else {
                directionOverlay = DirectionOverlay.NEGATIVE;
            }
            return new FormatInfo(string2, directionOverlay);
        }
        BigDecimal displayAmount = getDisplayAmount(quote, position);
        if (shouldColorizeDefault()) {
            if (quote.isUpForTheDay()) {
                directionOverlayFromSignOf = DirectionOverlay.POSITIVE;
            } else {
                directionOverlayFromSignOf = DirectionOverlay.NEGATIVE;
            }
        } else if (displayAmount != null) {
            directionOverlayFromSignOf = DirectionOverlay.INSTANCE.fromSignOf(displayAmount);
        } else {
            directionOverlayFromSignOf = DirectionOverlay.POSITIVE;
        }
        return new FormatInfo(formatDisplayAmount(displayAmount, formatAmountFallback, Formats.getPriceFormat(), Formats.getPriceDeltaWithHundredthDecimalFormat(), Formats.getPercentDeltaWithHundredthDecimalFormat()), directionOverlayFromSignOf);
    }

    public final FormatInfo getFormatInfoForIpoInstrument(Resources resources, IpoQuote ipoQuote, String formatAmountFallback) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(ipoQuote, "ipoQuote");
        Intrinsics.checkNotNullParameter(formatAmountFallback, "formatAmountFallback");
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                String formattedAmount = IpoQuotes.getFormattedAmount(ipoQuote, resources);
                if (formattedAmount != null) {
                    formatAmountFallback = formattedAmount;
                    break;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
                break;
            case 5:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
                throw new ExceptionsH();
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new FormatInfo(formatAmountFallback, PreIpoInstrumentRowPriceOverlay.INSTANCE);
    }

    public final FormatInfo getFormatInfoForOptionStrategy(String formatAmountFallback, AggregateOptionStrategyQuote quote, OptionChain optionChain, Money optionOpenPrice, OrderDirection optionOpenPriceDirection) {
        OptionInstrumentPosition optionInstrumentPosition;
        DirectionOverlay directionOverlayFromSignOf;
        OptionPositionType optionPositionType;
        Intrinsics.checkNotNullParameter(formatAmountFallback, "formatAmountFallback");
        Intrinsics.checkNotNullParameter(quote, "quote");
        if (optionOpenPrice == null || optionOpenPriceDirection == null || optionChain == null) {
            optionInstrumentPosition = null;
        } else {
            BigDecimal bigDecimalMultiply = optionOpenPrice.getDecimalValue().multiply(optionOpenPriceDirection.getMultiplier());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            Instant MAX = Instant.MAX;
            Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-00000000000");
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            UUID id = optionChain.getId();
            UUID uuidFromString2 = UUID.fromString("00000000-0000-0000-0000-00000000000");
            Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(...)");
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            int i = WhenMappings.$EnumSwitchMapping$1[optionOpenPriceDirection.ordinal()];
            if (i == 1) {
                optionPositionType = OptionPositionType.LONG;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                optionPositionType = OptionPositionType.SHORT;
            }
            optionInstrumentPosition = new OptionInstrumentPosition("", bigDecimalMultiply, MAX, null, null, null, null, null, null, ONE, uuidFromString, ZERO, ZERO, id, uuidFromString2, ZERO, ZERO, ZERO, ONE, optionPositionType);
        }
        BigDecimal displayAmountForOptionStrategy = getDisplayAmountForOptionStrategy(optionChain, quote, optionInstrumentPosition);
        if (shouldColorizeDefault()) {
            if (BigDecimals7.isNegative(quote.getTodaysPercentChange())) {
                directionOverlayFromSignOf = DirectionOverlay.NEGATIVE;
            } else {
                directionOverlayFromSignOf = DirectionOverlay.POSITIVE;
            }
        } else if (displayAmountForOptionStrategy != null) {
            directionOverlayFromSignOf = DirectionOverlay.INSTANCE.fromSignOf(displayAmountForOptionStrategy);
        } else {
            directionOverlayFromSignOf = DirectionOverlay.POSITIVE;
        }
        return new FormatInfo(formatDisplayAmount(displayAmountForOptionStrategy, formatAmountFallback, Formats.getPriceFormat(), Formats.getPriceDeltaFormat(), Formats.getPercentDeltaFormat()), directionOverlayFromSignOf);
    }

    public final String formatDisplayAmount(BigDecimal amount, String formatAmountFallback, NumberFormatter priceFormatter, NumberFormatter priceDeltaFormatter, NumberFormatter percentageDeltaFormatter) {
        Intrinsics.checkNotNullParameter(formatAmountFallback, "formatAmountFallback");
        Intrinsics.checkNotNullParameter(priceFormatter, "priceFormatter");
        Intrinsics.checkNotNullParameter(priceDeltaFormatter, "priceDeltaFormatter");
        Intrinsics.checkNotNullParameter(percentageDeltaFormatter, "percentageDeltaFormatter");
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return priceFormatter.formatNullable(amount, formatAmountFallback);
            case 3:
            case 7:
                return percentageDeltaFormatter.formatNullable(amount, formatAmountFallback);
            case 4:
            case 6:
                return priceDeltaFormatter.formatNullable(amount, formatAmountFallback);
            case 5:
                return BigDecimals2.formatCurrencyWithOptionalDecimal$default(amount, null, 1, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final BigDecimal getDisplayAmount(Quote quote, Position position) {
        Money totalEquity;
        Money todaysReturnAmountForPnl;
        Money totalReturnAmountForPnl;
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return Money3.getBigDecimalCompat(quote.getLastTradePrice());
            case 2:
                if (position == null || (totalEquity = position.getTotalEquity(quote)) == null) {
                    return null;
                }
                return Money3.getBigDecimalCompat(totalEquity);
            case 3:
                return quote.getTodaysPercentChange();
            case 4:
                if (position == null || (todaysReturnAmountForPnl = position.getTodaysReturnAmountForPnl(quote)) == null) {
                    return null;
                }
                return Money3.getBigDecimalCompat(todaysReturnAmountForPnl);
            case 5:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
                throw new ExceptionsH();
            case 6:
                if (position == null || (totalReturnAmountForPnl = position.getTotalReturnAmountForPnl(quote)) == null) {
                    return null;
                }
                return Money3.getBigDecimalCompat(totalReturnAmountForPnl);
            case 7:
                if (position != null) {
                    return position.getTotalReturnPercentageForPnl(quote);
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final FormatInfo getFormatInfoForCrypto(CryptoQuote quote, UiCryptoHistorical cryptoHistorical, UiCryptoHolding holding, NumberFormatter priceFormatter, NumberFormatter priceDeltaFormatter, String formatAmountFallback) {
        DirectionOverlay directionOverlay;
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(priceFormatter, "priceFormatter");
        Intrinsics.checkNotNullParameter(priceDeltaFormatter, "priceDeltaFormatter");
        Intrinsics.checkNotNullParameter(formatAmountFallback, "formatAmountFallback");
        BigDecimal displayAmountForCrypto = getDisplayAmountForCrypto(quote, cryptoHistorical, holding);
        BigDecimal percentChange = null;
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                percentChange = quote.getPercentChange();
                break;
            case 5:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
                throw new ExceptionsH();
            case 6:
                if (holding != null) {
                    percentChange = holding.getTotalReturn(quote);
                    break;
                }
                break;
            case 7:
                if (holding != null) {
                    percentChange = holding.getTotalReturnPercentage(quote);
                    break;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (BigDecimals7.isNegative(percentChange)) {
            directionOverlay = DirectionOverlay.NEGATIVE;
        } else {
            directionOverlay = DirectionOverlay.POSITIVE;
        }
        return new FormatInfo(formatDisplayAmount(displayAmountForCrypto, formatAmountFallback, priceFormatter, priceDeltaFormatter, Formats.getPercentDeltaFormat()), directionOverlay);
    }

    private final BigDecimal getDisplayAmountForCrypto(CryptoQuote quote, UiCryptoHistorical cryptoHistorical, UiCryptoHolding holding) {
        List<DataPoint.Asset> dataPoints;
        Object next;
        Money openPrice;
        BigDecimal bigDecimalCompat = null;
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return Money3.getBigDecimalCompat(quote.getMarkPrice());
            case 2:
                if (holding != null) {
                    return BigDecimals7.safeMultiply(Money3.getBigDecimalCompat(quote.getMarkPrice()), holding.getQuantity());
                }
                return null;
            case 3:
                Instant instant = LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant();
                BigDecimal bigDecimalCompat2 = Money3.getBigDecimalCompat(quote.getMarkPrice());
                if (cryptoHistorical != null && (dataPoints = cryptoHistorical.getDataPoints()) != null) {
                    Iterator<T> it = dataPoints.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((DataPoint.Asset) next).getTime(GraphSelection.TWENTY_FOUR_HOURS.getInterval()).compareTo(instant) >= 0) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    DataPoint.Asset asset = (DataPoint.Asset) next;
                    if (asset != null && (openPrice = asset.getOpenPrice()) != null) {
                        bigDecimalCompat = Money3.getBigDecimalCompat(openPrice);
                    }
                }
                if (bigDecimalCompat != null && !BigDecimals7.isZero(bigDecimalCompat)) {
                    return NumberUtils.calculateDeltaPercentFrom(bigDecimalCompat2, bigDecimalCompat);
                }
                return BigDecimal.ZERO;
            case 4:
                CryptoHoldingCostBasis costBasis = holding != null ? holding.getCostBasis() : null;
                if (costBasis != null) {
                    return Money3.getBigDecimalCompat(UiCryptoHolding.INSTANCE.getTodaysReturn(costBasis, quote));
                }
                return null;
            case 5:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
                throw new ExceptionsH();
            case 6:
                if (holding != null) {
                    return holding.getTotalReturn(quote);
                }
                return null;
            case 7:
                if (holding != null) {
                    return holding.getTotalReturnPercentage(quote);
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FormatInfo getFormatInfoForFutures(BigDecimal lastTradePrice, FuturesClosePrices previousClose, FuturesMarginRequirement marginRequirement, NumberFormatter priceFormatter, NumberFormatter priceDeltaFormatter, String formatAmountFallback) {
        BigDecimal bigDecimalSubtract;
        BigDecimal previousClosePrice;
        DirectionOverlay directionOverlay;
        Intrinsics.checkNotNullParameter(lastTradePrice, "lastTradePrice");
        Intrinsics.checkNotNullParameter(priceFormatter, "priceFormatter");
        Intrinsics.checkNotNullParameter(priceDeltaFormatter, "priceDeltaFormatter");
        Intrinsics.checkNotNullParameter(formatAmountFallback, "formatAmountFallback");
        BigDecimal displayAmountForFutures = getDisplayAmountForFutures(lastTradePrice, marginRequirement, previousClose);
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                if (previousClose != null && (previousClosePrice = previousClose.getPreviousClosePrice()) != null) {
                    bigDecimalSubtract = lastTradePrice.subtract(previousClosePrice);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                    if (bigDecimalSubtract == null) {
                    }
                } else {
                    bigDecimalSubtract = BigDecimal.ZERO;
                    break;
                }
                break;
            case 4:
            case 6:
            case 7:
                bigDecimalSubtract = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (BigDecimals7.isNegative(bigDecimalSubtract)) {
            directionOverlay = DirectionOverlay.NEGATIVE;
        } else {
            directionOverlay = DirectionOverlay.POSITIVE;
        }
        return new FormatInfo(formatDisplayAmount(displayAmountForFutures, formatAmountFallback, priceFormatter, priceDeltaFormatter, Formats.getPercentDeltaFormat()), directionOverlay);
    }

    private final BigDecimal getDisplayAmountForFutures(BigDecimal lastTradePrice, FuturesMarginRequirement marginRequirement, FuturesClosePrices previousClose) {
        BigDecimal previousClosePrice;
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return lastTradePrice;
            case 3:
                if (previousClose != null && (previousClosePrice = previousClose.getPreviousClosePrice()) != null) {
                    BigDecimal bigDecimalSubtract = lastTradePrice.subtract(previousClosePrice);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                    return BigDecimals7.safeDivide(bigDecimalSubtract, previousClose.getPreviousClosePrice());
                }
                break;
            case 2:
            case 4:
            case 6:
            case 7:
                return null;
            case 5:
                if (marginRequirement != null) {
                    return marginRequirement.getMarginRequirement();
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final BigDecimal getDisplayAmountForOptionStrategy(OptionChain optionChain, AggregateOptionStrategyQuote quote, OptionInstrumentPosition simulatedOptionInstrumentPosition) {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return quote.getAdjustedMarkPrice().getUnsignedValue();
            case 2:
            case 4:
            case 5:
                return null;
            case 3:
                return quote.getTodaysPercentChange();
            case 6:
                if (optionChain == null || simulatedOptionInstrumentPosition == null) {
                    return null;
                }
                return simulatedOptionInstrumentPosition.getTotalReturnAmount(quote, optionChain);
            case 7:
                if (optionChain == null || simulatedOptionInstrumentPosition == null) {
                    return null;
                }
                return simulatedOptionInstrumentPosition.getTotalReturnPercentage(quote, optionChain);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final FormatInfo getFormatInfoForIndexOption(BigDecimal lastTradePrice, BigDecimal previousClosePrice, String formatAmountFallback) {
        BigDecimal bigDecimalSubtract;
        DirectionOverlay directionOverlay;
        Intrinsics.checkNotNullParameter(lastTradePrice, "lastTradePrice");
        Intrinsics.checkNotNullParameter(formatAmountFallback, "formatAmountFallback");
        BigDecimal displayAmountForIndexOption = getDisplayAmountForIndexOption(lastTradePrice, previousClosePrice);
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            bigDecimalSubtract = null;
        } else if (previousClosePrice == null) {
            bigDecimalSubtract = BigDecimal.ZERO;
        } else {
            bigDecimalSubtract = lastTradePrice.subtract(previousClosePrice);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        }
        if (BigDecimals7.isNegative(bigDecimalSubtract)) {
            directionOverlay = DirectionOverlay.NEGATIVE;
        } else {
            directionOverlay = DirectionOverlay.POSITIVE;
        }
        return new FormatInfo(formatDisplayAmount(displayAmountForIndexOption, formatAmountFallback, Formats.getValueFormat(), Formats.getValueFormat(), Formats.getPercentDeltaFormat()), directionOverlay);
    }

    private final BigDecimal getDisplayAmountForIndexOption(BigDecimal lastTradePrice, BigDecimal previousClosePrice) {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return lastTradePrice;
        }
        if (i != 3 || previousClosePrice == null) {
            return null;
        }
        BigDecimal bigDecimalSubtract = lastTradePrice.subtract(previousClosePrice);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return BigDecimals7.safeDivide(bigDecimalSubtract, previousClosePrice);
    }

    /* compiled from: SecurityViewMode.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/util/SecurityViewMode$PreIpoInstrumentRowPriceOverlay;", "Lcom/robinhood/scarlet/ScarletOverlay;", "<init>", "()V", "styleReference", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "priority", "", "getPriority", "()I", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class PreIpoInstrumentRowPriceOverlay implements ScarletOverlay {
        public static final PreIpoInstrumentRowPriceOverlay INSTANCE = new PreIpoInstrumentRowPriceOverlay();
        private static final DirectResourceReference<StyleResource> styleReference = new DirectResourceReference<>(ResourceType.STYLE.INSTANCE, C11048R.style.ThemeOverlay_Robinhood_DesignSystem_PreIpoInstrumentRowPrice);

        @Override // com.robinhood.scarlet.ScarletOverlay
        public int getPriority() {
            return 1000;
        }

        private PreIpoInstrumentRowPriceOverlay() {
        }

        @Override // com.robinhood.scarlet.ScarletOverlay
        public DirectResourceReference<StyleResource> getStyleReference() {
            return styleReference;
        }
    }

    /* compiled from: SecurityViewMode.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/util/SecurityViewMode$FormatInfo;", "", "formattedDisplayAmount", "", "directionOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "<init>", "(Ljava/lang/String;Lcom/robinhood/scarlet/ScarletOverlay;)V", "getFormattedDisplayAmount", "()Ljava/lang/String;", "getDirectionOverlay", "()Lcom/robinhood/scarlet/ScarletOverlay;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FormatInfo {
        private final ScarletOverlay directionOverlay;
        private final String formattedDisplayAmount;

        public static /* synthetic */ FormatInfo copy$default(FormatInfo formatInfo, String str, ScarletOverlay scarletOverlay, int i, Object obj) {
            if ((i & 1) != 0) {
                str = formatInfo.formattedDisplayAmount;
            }
            if ((i & 2) != 0) {
                scarletOverlay = formatInfo.directionOverlay;
            }
            return formatInfo.copy(str, scarletOverlay);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFormattedDisplayAmount() {
            return this.formattedDisplayAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final ScarletOverlay getDirectionOverlay() {
            return this.directionOverlay;
        }

        public final FormatInfo copy(String formattedDisplayAmount, ScarletOverlay directionOverlay) {
            Intrinsics.checkNotNullParameter(formattedDisplayAmount, "formattedDisplayAmount");
            Intrinsics.checkNotNullParameter(directionOverlay, "directionOverlay");
            return new FormatInfo(formattedDisplayAmount, directionOverlay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormatInfo)) {
                return false;
            }
            FormatInfo formatInfo = (FormatInfo) other;
            return Intrinsics.areEqual(this.formattedDisplayAmount, formatInfo.formattedDisplayAmount) && Intrinsics.areEqual(this.directionOverlay, formatInfo.directionOverlay);
        }

        public int hashCode() {
            return (this.formattedDisplayAmount.hashCode() * 31) + this.directionOverlay.hashCode();
        }

        public String toString() {
            return "FormatInfo(formattedDisplayAmount=" + this.formattedDisplayAmount + ", directionOverlay=" + this.directionOverlay + ")";
        }

        public FormatInfo(String formattedDisplayAmount, ScarletOverlay directionOverlay) {
            Intrinsics.checkNotNullParameter(formattedDisplayAmount, "formattedDisplayAmount");
            Intrinsics.checkNotNullParameter(directionOverlay, "directionOverlay");
            this.formattedDisplayAmount = formattedDisplayAmount;
            this.directionOverlay = directionOverlay;
        }

        public final String getFormattedDisplayAmount() {
            return this.formattedDisplayAmount;
        }

        public final ScarletOverlay getDirectionOverlay() {
            return this.directionOverlay;
        }
    }

    /* compiled from: SecurityViewMode.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/util/SecurityViewMode$Companion;", "", "<init>", "()V", "FuturesRhListOnlyViewModes", "", "Lcom/robinhood/android/common/util/SecurityViewMode;", "DefaultViewModes", "getDefaultViewModes", "()Ljava/util/List;", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<SecurityViewMode> getDefaultViewModes() {
            return SecurityViewMode.DefaultViewModes;
        }
    }

    public static SecurityViewMode valueOf(String str) {
        return (SecurityViewMode) Enum.valueOf(SecurityViewMode.class, str);
    }

    public static SecurityViewMode[] values() {
        return (SecurityViewMode[]) $VALUES.clone();
    }
}
