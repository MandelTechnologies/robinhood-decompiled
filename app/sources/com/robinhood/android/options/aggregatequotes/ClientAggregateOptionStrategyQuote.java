package com.robinhood.android.options.aggregatequotes;

import com.robinhood.android.options.aggregatequotes.OptionQuoteAggregator;
import com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformer;
import com.robinhood.models.Decimals;
import com.robinhood.models.Decimals2;
import com.robinhood.models.Decimals3;
import com.robinhood.models.api.OptionQuoteSessionType;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.OptionSessionQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: ClientAggregateOptionStrategyQuote.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0015R\u001c\u0010<\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b=\u0010\u0015R\u001c\u0010>\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010\u0015R\u001c\u0010@\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\bA\u0010\u0015R\u001c\u0010B\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bC\u0010\u0015R\u001a\u0010D\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010/\u001a\u0004\bE\u00101R\u001a\u0010F\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010/\u001a\u0004\bG\u00101R\u001a\u0010H\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010:\u001a\u0004\bI\u0010\u0015R\u0017\u0010J\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bK\u0010\u0015R\u001a\u0010L\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bL\u0010\u0017R\u001c\u0010N\u001a\u0004\u0018\u00010-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010/\u001a\u0004\bO\u00101R\u001c\u0010P\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010:\u001a\u0004\bQ\u0010\u0015R\u001c\u0010R\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010:\u001a\u0004\bS\u0010\u0015R\u001c\u0010T\u001a\u0004\u0018\u00010-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010/\u001a\u0004\bU\u00101R\u001c\u0010V\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010:\u001a\u0004\bW\u0010\u0015R\u001c\u0010X\u001a\u0004\u0018\u00010-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010/\u001a\u0004\bY\u00101R\u001c\u0010Z\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010*\u001a\u0004\b[\u0010,R\u001c\u0010\\\u001a\u0004\u0018\u00010-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010/\u001a\u0004\b]\u00101R\u001c\u0010^\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010*\u001a\u0004\b_\u0010,R\u001a\u0010a\u001a\u00020`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001c\u0010e\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010*\u001a\u0004\bf\u0010,R\u001c\u0010h\u001a\u0004\u0018\u00010g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001c\u0010m\u001a\u0004\u0018\u00010l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001c\u0010q\u001a\u0004\u0018\u00010l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010n\u001a\u0004\br\u0010pR\u0017\u0010s\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bs\u0010M\u001a\u0004\bt\u0010\u0017¨\u0006u"}, m3636d2 = {"Lcom/robinhood/android/options/aggregatequotes/ClientAggregateOptionStrategyQuote;", "Lcom/robinhood/models/db/OptionQuote;", "", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$LegContext;", "legs", "Lcom/robinhood/models/db/OrderDirection;", "intendedDirection", "<init>", "(Ljava/util/List;Lcom/robinhood/models/db/OrderDirection;)V", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "defaultPricingType", "", "shouldRoundDownForSells", "Ljava/math/BigDecimal;", "getQuote", "(Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Z)Ljava/math/BigDecimal;", "Lcom/robinhood/models/ui/UnderlyingQuote;", "underlyingQuote", "getBreakevenPercentage", "(Lcom/robinhood/models/ui/UnderlyingQuote;)Ljava/math/BigDecimal;", "getChanceOfProfit", "()Ljava/math/BigDecimal;", "isStaleForUi", "()Z", "Ljava/util/List;", "getLegs", "()Ljava/util/List;", "Lcom/robinhood/models/db/OrderDirection;", "getIntendedDirection", "()Lcom/robinhood/models/db/OrderDirection;", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$BidAsk;", "bidAsk", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$BidAsk;", "getBidAsk", "()Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$BidAsk;", "Lcom/robinhood/models/SignedDecimal;", "askPrice", "Lcom/robinhood/models/SignedDecimal;", "getAskPrice", "()Lcom/robinhood/models/SignedDecimal;", "", "askSize", "Ljava/lang/Integer;", "getAskSize", "()Ljava/lang/Integer;", "Lcom/robinhood/models/Decimal;", "bidPrice", "Lcom/robinhood/models/Decimal;", "getBidPrice", "()Lcom/robinhood/models/Decimal;", "bidSize", "getBidSize", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$Greeks;", "greeks", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$Greeks;", "getGreeks", "()Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$Greeks;", "delta", "Ljava/math/BigDecimal;", "getDelta", "gamma", "getGamma", "theta", "getTheta", "rho", "getRho", "vega", "getVega", "adjustedMarkPrice", "getAdjustedMarkPrice", "previousClosePrice", "getPreviousClosePrice", "todaysPercentChange", "getTodaysPercentChange", "todaysNetChange", "getTodaysNetChange", "isUpForTheDay", "Z", "breakEvenPrice", "getBreakEvenPrice", "chanceOfProfitLong", "getChanceOfProfitLong", "chanceOfProfitShort", "getChanceOfProfitShort", "highPrice", "getHighPrice", "impliedVolatility", "getImpliedVolatility", "lastTradePrice", "getLastTradePrice", "lastTradeSize", "getLastTradeSize", "lowPrice", "getLowPrice", "openInterest", "getOpenInterest", "j$/time/Instant", "receivedAt", "Lj$/time/Instant;", "getReceivedAt", "()Lj$/time/Instant;", SduiChartZoomTransformer.VOLUME_IDENTIFIER, "getVolume", "Lcom/robinhood/models/api/OptionQuoteSessionType;", "latestQuoteSession", "Lcom/robinhood/models/api/OptionQuoteSessionType;", "getLatestQuoteSession", "()Lcom/robinhood/models/api/OptionQuoteSessionType;", "Lcom/robinhood/models/db/OptionSessionQuote;", "regSession", "Lcom/robinhood/models/db/OptionSessionQuote;", "getRegSession", "()Lcom/robinhood/models/db/OptionSessionQuote;", "nonRegSession", "getNonRegSession", "hasStaleQuote", "getHasStaleQuote", "lib-options-aggregate-quotes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ClientAggregateOptionStrategyQuote implements OptionQuote {
    private final Decimals adjustedMarkPrice;
    private final Decimals3 askPrice;
    private final Integer askSize;
    private final OptionQuoteAggregator.BidAsk bidAsk;
    private final Decimals bidPrice;
    private final Integer bidSize;
    private final Decimals breakEvenPrice;
    private final BigDecimal chanceOfProfitLong;
    private final BigDecimal chanceOfProfitShort;
    private final BigDecimal delta;
    private final BigDecimal gamma;
    private final OptionQuoteAggregator.Greeks greeks;
    private final boolean hasStaleQuote;
    private final Decimals highPrice;
    private final BigDecimal impliedVolatility;
    private final OrderDirection intendedDirection;
    private final boolean isUpForTheDay;
    private final Decimals lastTradePrice;
    private final Integer lastTradeSize;
    private final OptionQuoteSessionType latestQuoteSession;
    private final List<OptionQuoteAggregator.LegContext> legs;
    private final Decimals lowPrice;
    private final OptionSessionQuote nonRegSession;
    private final Integer openInterest;
    private final Decimals previousClosePrice;
    private final Instant receivedAt;
    private final OptionSessionQuote regSession;
    private final BigDecimal rho;
    private final BigDecimal theta;
    private final BigDecimal todaysNetChange;
    private final BigDecimal todaysPercentChange;
    private final BigDecimal vega;
    private final Integer volume;

    /* compiled from: ClientAggregateOptionStrategyQuote.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public ClientAggregateOptionStrategyQuote(List<OptionQuoteAggregator.LegContext> legs, OrderDirection intendedDirection) {
        Instant instantNow;
        OptionInstrumentQuote optionQuote;
        OptionInstrumentQuote optionQuote2;
        OptionInstrumentQuote optionQuote3;
        OptionInstrumentQuote optionQuote4;
        OptionInstrumentQuote optionQuote5;
        OptionInstrumentQuote optionQuote6;
        OptionInstrumentQuote optionQuote7;
        OptionInstrumentQuote optionQuote8;
        OptionInstrumentQuote optionQuote9;
        OptionInstrumentQuote optionQuote10;
        OptionInstrumentQuote optionQuote11;
        OptionInstrumentQuote optionQuote12;
        OptionInstrumentQuote optionQuote13;
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(intendedDirection, "intendedDirection");
        this.legs = legs;
        this.intendedDirection = intendedDirection;
        OptionQuoteAggregator optionQuoteAggregator = OptionQuoteAggregator.INSTANCE;
        OptionQuoteAggregator.BidAsk bidAskForDisplay = optionQuoteAggregator.getBidAskForDisplay(legs, intendedDirection);
        this.bidAsk = bidAskForDisplay;
        this.askPrice = Decimals2.asSignedDecimal(bidAskForDisplay.getAsk());
        OptionQuoteAggregator.LegContext legContext = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        Integer volume = null;
        this.askSize = (legContext == null || (optionQuote13 = legContext.getOptionQuote()) == null) ? null : optionQuote13.getAskSize();
        this.bidPrice = Decimals2.asSignedDecimal(bidAskForDisplay.getBid());
        OptionQuoteAggregator.LegContext legContext2 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        this.bidSize = (legContext2 == null || (optionQuote12 = legContext2.getOptionQuote()) == null) ? null : optionQuote12.getBidSize();
        OptionQuoteAggregator.Greeks greeksForDisplay = optionQuoteAggregator.getGreeksForDisplay(legs);
        this.greeks = greeksForDisplay;
        this.delta = greeksForDisplay.getDelta();
        this.gamma = greeksForDisplay.getGamma();
        this.theta = greeksForDisplay.getTheta();
        this.rho = greeksForDisplay.getRho();
        this.vega = greeksForDisplay.getVega();
        this.adjustedMarkPrice = Decimals2.asSignedDecimal(optionQuoteAggregator.getMarkPriceForDisplay(legs, OptionSettings.DefaultPricingSetting.MARK_PRICE, false, intendedDirection, true));
        this.previousClosePrice = Decimals2.asSignedDecimal(optionQuoteAggregator.getPreviousClosePriceForDisplay(legs, intendedDirection));
        boolean z = true;
        this.todaysPercentChange = optionQuoteAggregator.getTodaysChangePercentageForDisplay(legs, intendedDirection, true);
        this.todaysNetChange = optionQuoteAggregator.getTodaysChangeValueForDisplay(legs, intendedDirection, true);
        this.isUpForTheDay = BigDecimals7.isPositive(getTodaysPercentChange());
        OptionQuoteAggregator.LegContext legContext3 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        this.breakEvenPrice = (legContext3 == null || (optionQuote11 = legContext3.getOptionQuote()) == null) ? null : optionQuote11.getBreakEvenPrice();
        OptionQuoteAggregator.LegContext legContext4 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        this.chanceOfProfitLong = (legContext4 == null || (optionQuote10 = legContext4.getOptionQuote()) == null) ? null : optionQuote10.getChanceOfProfitLong();
        OptionQuoteAggregator.LegContext legContext5 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        this.chanceOfProfitShort = (legContext5 == null || (optionQuote9 = legContext5.getOptionQuote()) == null) ? null : optionQuote9.getChanceOfProfitShort();
        OptionQuoteAggregator.LegContext legContext6 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        this.highPrice = (legContext6 == null || (optionQuote8 = legContext6.getOptionQuote()) == null) ? null : optionQuote8.getHighPrice();
        OptionQuoteAggregator.LegContext legContext7 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        this.impliedVolatility = (legContext7 == null || (optionQuote7 = legContext7.getOptionQuote()) == null) ? null : optionQuote7.getImpliedVolatility();
        OptionQuoteAggregator.LegContext legContext8 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        this.lastTradePrice = (legContext8 == null || (optionQuote6 = legContext8.getOptionQuote()) == null) ? null : optionQuote6.getLastTradePrice();
        OptionQuoteAggregator.LegContext legContext9 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        this.lastTradeSize = (legContext9 == null || (optionQuote5 = legContext9.getOptionQuote()) == null) ? null : optionQuote5.getLastTradeSize();
        OptionQuoteAggregator.LegContext legContext10 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        this.lowPrice = (legContext10 == null || (optionQuote4 = legContext10.getOptionQuote()) == null) ? null : optionQuote4.getLowPrice();
        OptionQuoteAggregator.LegContext legContext11 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        this.openInterest = (legContext11 == null || (optionQuote3 = legContext11.getOptionQuote()) == null) ? null : optionQuote3.getOpenInterest();
        OptionQuoteAggregator.LegContext legContext12 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        if (legContext12 == null || (optionQuote2 = legContext12.getOptionQuote()) == null || (instantNow = optionQuote2.getReceivedAt()) == null) {
            instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        }
        this.receivedAt = instantNow;
        OptionQuoteAggregator.LegContext legContext13 = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        if (legContext13 != null && (optionQuote = legContext13.getOptionQuote()) != null) {
            volume = optionQuote.getVolume();
        }
        this.volume = volume;
        List<OptionQuoteAggregator.LegContext> list = legs;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((OptionQuoteAggregator.LegContext) it.next()).getOptionQuote().isStaleForUi()) {
                    break;
                }
            }
            z = false;
        }
        this.hasStaleQuote = z;
    }

    public final List<OptionQuoteAggregator.LegContext> getLegs() {
        return this.legs;
    }

    public final OrderDirection getIntendedDirection() {
        return this.intendedDirection;
    }

    public final OptionQuoteAggregator.BidAsk getBidAsk() {
        return this.bidAsk;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Decimals3 getAskPrice() {
        return this.askPrice;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Integer getAskSize() {
        return this.askSize;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Decimals getBidPrice() {
        return this.bidPrice;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Integer getBidSize() {
        return this.bidSize;
    }

    public final OptionQuoteAggregator.Greeks getGreeks() {
        return this.greeks;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public BigDecimal getDelta() {
        return this.delta;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public BigDecimal getGamma() {
        return this.gamma;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public BigDecimal getTheta() {
        return this.theta;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public BigDecimal getRho() {
        return this.rho;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public BigDecimal getVega() {
        return this.vega;
    }

    public final BigDecimal getQuote(OptionSettings.DefaultPricingSetting defaultPricingType, boolean shouldRoundDownForSells) {
        if (defaultPricingType == null) {
            return null;
        }
        return OptionQuoteAggregator.getMarkPriceForDisplay$default(OptionQuoteAggregator.INSTANCE, this.legs, defaultPricingType, shouldRoundDownForSells, this.intendedDirection, false, 16, null);
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Decimals getAdjustedMarkPrice() {
        return this.adjustedMarkPrice;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Decimals getPreviousClosePrice() {
        return this.previousClosePrice;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public BigDecimal getTodaysPercentChange() {
        return this.todaysPercentChange;
    }

    public final BigDecimal getTodaysNetChange() {
        return this.todaysNetChange;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    /* renamed from: isUpForTheDay, reason: from getter */
    public boolean getIsUpForTheDay() {
        return this.isUpForTheDay;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Decimals getBreakEvenPrice() {
        return this.breakEvenPrice;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public BigDecimal getChanceOfProfitLong() {
        return this.chanceOfProfitLong;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public BigDecimal getChanceOfProfitShort() {
        return this.chanceOfProfitShort;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Decimals getHighPrice() {
        return this.highPrice;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public BigDecimal getImpliedVolatility() {
        return this.impliedVolatility;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Decimals getLastTradePrice() {
        return this.lastTradePrice;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Integer getLastTradeSize() {
        return this.lastTradeSize;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Decimals getLowPrice() {
        return this.lowPrice;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Integer getOpenInterest() {
        return this.openInterest;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Instant getReceivedAt() {
        return this.receivedAt;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public Integer getVolume() {
        return this.volume;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public OptionQuoteSessionType getLatestQuoteSession() {
        return this.latestQuoteSession;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public OptionSessionQuote getRegSession() {
        return this.regSession;
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public OptionSessionQuote getNonRegSession() {
        return this.nonRegSession;
    }

    public final boolean getHasStaleQuote() {
        return this.hasStaleQuote;
    }

    public final BigDecimal getBreakevenPercentage(UnderlyingQuote underlyingQuote) {
        if (getBreakEvenPrice() == null) {
            return null;
        }
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero(underlyingQuote != null ? underlyingQuote.getCurrentValue() : null);
        BigDecimal bigDecimalSubtract = getBreakEvenPrice().getUnsignedValue().subtract(bigDecimalOrZero);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return BigDecimals7.safeDivide(bigDecimalSubtract, bigDecimalOrZero);
    }

    public final BigDecimal getChanceOfProfit() {
        OptionQuoteAggregator.LegContext legContext = (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) this.legs);
        OrderSide side = legContext != null ? legContext.getSide() : null;
        int i = side == null ? -1 : WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return getChanceOfProfitLong();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return getChanceOfProfitShort();
    }

    @Override // com.robinhood.models.p320db.OptionQuote
    public boolean isStaleForUi() {
        return this.hasStaleQuote;
    }
}
