package com.robinhood.android.marketdatadisclosure;

import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentPrice;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Quote;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p479j$.time.LocalTime;
import p479j$.time.ZonedDateTime;
import p479j$.time.temporal.TemporalAdjuster;

/* compiled from: MarketDataDisclosureDataState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001MBO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0013\u0010$\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0013\u00100\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0013\u00102\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b3\u0010-R\u0013\u00104\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b5\u0010-R\u0013\u00106\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b7\u0010-R\u0013\u00108\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b9\u0010)R\u0013\u0010:\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b;\u0010)R\u0013\u0010<\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b=\u0010)R\u0013\u0010>\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b?\u0010)¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDataState;", "", "instrumentPrice", "Lcom/robinhood/models/db/InstrumentPrice;", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "quote", "Lcom/robinhood/models/db/Quote;", "instrument", "Lcom/robinhood/models/db/Instrument;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "<init>", "(Lcom/robinhood/models/db/InstrumentPrice;Lcom/robinhood/nbbo/models/db/NbboSummary;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/models/db/Order$Configuration;)V", "getInstrumentPrice", "()Lcom/robinhood/models/db/InstrumentPrice;", "getNbboSummary", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "dialogTitle", "Lcom/robinhood/utils/resource/StringResource;", "getDialogTitle", "()Lcom/robinhood/utils/resource/StringResource;", "headerText", "getHeaderText", "marketDataFooterText", "getMarketDataFooterText", "marketDataFooterLinkText", "getMarketDataFooterLinkText", "marketDataFooterMarkdown", "", "getMarketDataFooterMarkdown", "()Ljava/lang/String;", "lastStalePrice", "Ljava/math/BigDecimal;", "getLastStalePrice", "()Ljava/math/BigDecimal;", "lastSaleSize", "getLastSaleSize", "askPrice", "getAskPrice", "askSize", "getAskSize", "bidPrice", "getBidPrice", "bidSize", "getBidSize", "symbol", "getSymbol", "mic", "getMic", "bidMic", "getBidMic", "askMic", "getAskMic", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib-market-data-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class MarketDataDisclosureDataState {
    private static final LocalTime TWENTY_FOUR_HOURS_END_TIME;
    private static final LocalTime TWENTY_FOUR_HOURS_START_TIME;
    private final Order.Configuration configuration;
    private final Instrument instrument;
    private final InstrumentPrice instrumentPrice;
    private final NbboSummary nbboSummary;
    private final Quote quote;
    private final EquityOrderSide side;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MarketDataDisclosureDataState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ MarketDataDisclosureDataState copy$default(MarketDataDisclosureDataState marketDataDisclosureDataState, InstrumentPrice instrumentPrice, NbboSummary nbboSummary, Quote quote, Instrument instrument, EquityOrderSide equityOrderSide, Order.Configuration configuration, int i, Object obj) {
        if ((i & 1) != 0) {
            instrumentPrice = marketDataDisclosureDataState.instrumentPrice;
        }
        if ((i & 2) != 0) {
            nbboSummary = marketDataDisclosureDataState.nbboSummary;
        }
        if ((i & 4) != 0) {
            quote = marketDataDisclosureDataState.quote;
        }
        if ((i & 8) != 0) {
            instrument = marketDataDisclosureDataState.instrument;
        }
        if ((i & 16) != 0) {
            equityOrderSide = marketDataDisclosureDataState.side;
        }
        if ((i & 32) != 0) {
            configuration = marketDataDisclosureDataState.configuration;
        }
        EquityOrderSide equityOrderSide2 = equityOrderSide;
        Order.Configuration configuration2 = configuration;
        return marketDataDisclosureDataState.copy(instrumentPrice, nbboSummary, quote, instrument, equityOrderSide2, configuration2);
    }

    /* renamed from: component1, reason: from getter */
    public final InstrumentPrice getInstrumentPrice() {
        return this.instrumentPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    /* renamed from: component3, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component4, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component5, reason: from getter */
    public final EquityOrderSide getSide() {
        return this.side;
    }

    /* renamed from: component6, reason: from getter */
    public final Order.Configuration getConfiguration() {
        return this.configuration;
    }

    public final MarketDataDisclosureDataState copy(InstrumentPrice instrumentPrice, NbboSummary nbboSummary, Quote quote, Instrument instrument, EquityOrderSide side, Order.Configuration configuration) {
        return new MarketDataDisclosureDataState(instrumentPrice, nbboSummary, quote, instrument, side, configuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketDataDisclosureDataState)) {
            return false;
        }
        MarketDataDisclosureDataState marketDataDisclosureDataState = (MarketDataDisclosureDataState) other;
        return Intrinsics.areEqual(this.instrumentPrice, marketDataDisclosureDataState.instrumentPrice) && Intrinsics.areEqual(this.nbboSummary, marketDataDisclosureDataState.nbboSummary) && Intrinsics.areEqual(this.quote, marketDataDisclosureDataState.quote) && Intrinsics.areEqual(this.instrument, marketDataDisclosureDataState.instrument) && this.side == marketDataDisclosureDataState.side && this.configuration == marketDataDisclosureDataState.configuration;
    }

    public int hashCode() {
        InstrumentPrice instrumentPrice = this.instrumentPrice;
        int iHashCode = (instrumentPrice == null ? 0 : instrumentPrice.hashCode()) * 31;
        NbboSummary nbboSummary = this.nbboSummary;
        int iHashCode2 = (iHashCode + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode3 = (iHashCode2 + (quote == null ? 0 : quote.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode4 = (iHashCode3 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        EquityOrderSide equityOrderSide = this.side;
        int iHashCode5 = (iHashCode4 + (equityOrderSide == null ? 0 : equityOrderSide.hashCode())) * 31;
        Order.Configuration configuration = this.configuration;
        return iHashCode5 + (configuration != null ? configuration.hashCode() : 0);
    }

    public String toString() {
        return "MarketDataDisclosureDataState(instrumentPrice=" + this.instrumentPrice + ", nbboSummary=" + this.nbboSummary + ", quote=" + this.quote + ", instrument=" + this.instrument + ", side=" + this.side + ", configuration=" + this.configuration + ")";
    }

    public MarketDataDisclosureDataState(InstrumentPrice instrumentPrice, NbboSummary nbboSummary, Quote quote, Instrument instrument, EquityOrderSide equityOrderSide, Order.Configuration configuration) {
        this.instrumentPrice = instrumentPrice;
        this.nbboSummary = nbboSummary;
        this.quote = quote;
        this.instrument = instrument;
        this.side = equityOrderSide;
        this.configuration = configuration;
    }

    public /* synthetic */ MarketDataDisclosureDataState(InstrumentPrice instrumentPrice, NbboSummary nbboSummary, Quote quote, Instrument instrument, EquityOrderSide equityOrderSide, Order.Configuration configuration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instrumentPrice, (i & 2) != 0 ? null : nbboSummary, (i & 4) != 0 ? null : quote, (i & 8) != 0 ? null : instrument, (i & 16) != 0 ? null : equityOrderSide, (i & 32) != 0 ? null : configuration);
    }

    public final InstrumentPrice getInstrumentPrice() {
        return this.instrumentPrice;
    }

    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final EquityOrderSide getSide() {
        return this.side;
    }

    public final Order.Configuration getConfiguration() {
        return this.configuration;
    }

    public final StringResource getDialogTitle() {
        NbboSummary.NbboSummaryMarketDialog marketDialog;
        String titleCopy;
        NbboSummary nbboSummary = this.nbboSummary;
        if (nbboSummary != null && (marketDialog = nbboSummary.getMarketDialog()) != null && (titleCopy = marketDialog.getTitleCopy()) != null) {
            return StringResource.INSTANCE.invoke(titleCopy);
        }
        String symbol = getSymbol();
        if (symbol == null || StringsKt.isBlank(symbol)) {
            return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_title, new Object[0]);
        }
        if (this.configuration == Order.Configuration.LIMIT) {
            return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_title_with_symbol_limit, symbol);
        }
        return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_title_with_symbol, symbol);
    }

    public final StringResource getHeaderText() {
        if (this.configuration != Order.Configuration.LIMIT) {
            String symbol = getSymbol();
            if (symbol != null) {
                return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_header, symbol);
            }
            return null;
        }
        if (this.side == EquityOrderSide.BUY) {
            return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_header_ask, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_header_bid, new Object[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
    
        if (r0.equals(com.robinhood.models.p320db.Quote.DATA_SOURCE_BRUCE) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
    
        if (r0.equals(com.robinhood.models.p320db.Quote.DATA_SOURCE_BOATS) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d7, code lost:
    
        if (r0.equals(com.robinhood.models.p320db.Quote.DATA_SOURCE_NLS) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00da, code lost:
    
        r0 = com.robinhood.utils.resource.StringResource.INSTANCE;
        r1 = com.robinhood.android.marketdatadisclosure.C21270R.string.market_data_dialog_footer_24_hour_market;
        r4 = com.robinhood.utils.datetime.format.LocalTimeFormatter.SHORT;
        r5 = com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDataState.TWENTY_FOUR_HOURS_START_TIME;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "TWENTY_FOUR_HOURS_START_TIME");
        r3 = r4.format(r5);
        r5 = com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDataState.TWENTY_FOUR_HOURS_END_TIME;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "TWENTY_FOUR_HOURS_END_TIME");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fa, code lost:
    
        return r0.invoke(r1, r3, r4.format(r5));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StringResource getMarketDataFooterText() {
        Quote quote;
        Quote quote2;
        Quote quote3;
        Quote quote4;
        Quote quote5;
        if (this.configuration == Order.Configuration.LIMIT) {
            Quote quote6 = this.quote;
            if (quote6 != null && MarketDataDisclosureDataState2.isBidNasdaq(quote6) && MarketDataDisclosureDataState2.isAskNasdaq(this.quote)) {
                return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_footer_qbbo_nasdaq, new Object[0]);
            }
            Quote quote7 = this.quote;
            if ((quote7 != null && MarketDataDisclosureDataState2.isBidNasdaq(quote7)) || (((quote = this.quote) != null && MarketDataDisclosureDataState2.isBidBoats(quote)) || (((quote2 = this.quote) != null && MarketDataDisclosureDataState2.isAskNasdaq(quote2)) || (((quote3 = this.quote) != null && MarketDataDisclosureDataState2.isAskBoats(quote3)) || (((quote4 = this.quote) != null && MarketDataDisclosureDataState2.isAskBruce(quote4)) || ((quote5 = this.quote) != null && MarketDataDisclosureDataState2.isBidBruce(quote5))))))) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i = C21270R.string.market_data_dialog_footer_qbbo_24_hour;
                LocalTimeFormatter localTimeFormatter = LocalTimeFormatter.SHORT;
                LocalTime TWENTY_FOUR_HOURS_START_TIME2 = TWENTY_FOUR_HOURS_START_TIME;
                Intrinsics.checkNotNullExpressionValue(TWENTY_FOUR_HOURS_START_TIME2, "TWENTY_FOUR_HOURS_START_TIME");
                String str = localTimeFormatter.format(TWENTY_FOUR_HOURS_START_TIME2);
                LocalTime TWENTY_FOUR_HOURS_END_TIME2 = TWENTY_FOUR_HOURS_END_TIME;
                Intrinsics.checkNotNullExpressionValue(TWENTY_FOUR_HOURS_END_TIME2, "TWENTY_FOUR_HOURS_END_TIME");
                return companion.invoke(i, str, localTimeFormatter.format(TWENTY_FOUR_HOURS_END_TIME2));
            }
            return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_footer_qbbo_consolidated, new Object[0]);
        }
        Quote quote8 = this.quote;
        String lastTradePriceSource = quote8 != null ? quote8.getLastTradePriceSource() : null;
        if (lastTradePriceSource != null) {
            switch (lastTradePriceSource.hashCode()) {
                case 109173:
                    break;
                case 93908787:
                    break;
                case 94016839:
                    break;
                case 801653243:
                    if (lastTradePriceSource.equals(Quote.DATA_SOURCE_CONSOLIDATED)) {
                        return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_footer_consolidated, new Object[0]);
                    }
                    break;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b7, code lost:
    
        if (r0.equals(com.robinhood.models.p320db.Quote.DATA_SOURCE_BOATS) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c0, code lost:
    
        if (r0.equals(com.robinhood.models.p320db.Quote.DATA_SOURCE_NLS) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cd, code lost:
    
        return com.robinhood.utils.resource.StringResource.INSTANCE.invoke(com.robinhood.android.marketdatadisclosure.C21270R.string.market_data_dialog_footer_link_24_hour_market, new java.lang.Object[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StringResource getMarketDataFooterLinkText() {
        Quote quote;
        Quote quote2;
        Quote quote3;
        Quote quote4;
        if (this.configuration == Order.Configuration.LIMIT) {
            Quote quote5 = this.quote;
            if (quote5 != null && MarketDataDisclosureDataState2.isBidNasdaq(quote5) && MarketDataDisclosureDataState2.isAskNasdaq(this.quote)) {
                return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_footer_link_bid_ask, new Object[0]);
            }
            Quote quote6 = this.quote;
            if ((quote6 != null && MarketDataDisclosureDataState2.isBidNasdaq(quote6)) || (((quote = this.quote) != null && MarketDataDisclosureDataState2.isBidBoats(quote)) || (((quote2 = this.quote) != null && MarketDataDisclosureDataState2.isAskNasdaq(quote2)) || ((quote3 = this.quote) != null && MarketDataDisclosureDataState2.isAskBoats(quote3))))) {
                return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_footer_link_24_hour_market, new Object[0]);
            }
            Quote quote7 = this.quote;
            if ((quote7 == null || !MarketDataDisclosureDataState2.isAskConsolidated(quote7)) && ((quote4 = this.quote) == null || !MarketDataDisclosureDataState2.isBidConsolidated(quote4))) {
                return null;
            }
            return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_footer_link_bid_ask, new Object[0]);
        }
        Quote quote8 = this.quote;
        String lastTradePriceSource = quote8 != null ? quote8.getLastTradePriceSource() : null;
        if (lastTradePriceSource != null) {
            int iHashCode = lastTradePriceSource.hashCode();
            if (iHashCode != 109173) {
                if (iHashCode != 93908787) {
                    if (iHashCode == 801653243 && lastTradePriceSource.equals(Quote.DATA_SOURCE_CONSOLIDATED)) {
                        return StringResource.INSTANCE.invoke(C21270R.string.market_data_dialog_footer_link_bid_ask, new Object[0]);
                    }
                }
            }
        }
        return null;
    }

    public final String getMarketDataFooterMarkdown() {
        NbboSummary.NbboSummaryMarketDialog marketDialog;
        NbboSummary nbboSummary = this.nbboSummary;
        if (nbboSummary == null || (marketDialog = nbboSummary.getMarketDialog()) == null) {
            return null;
        }
        return marketDialog.getSubtitleMarkdown();
    }

    public final BigDecimal getLastStalePrice() {
        InstrumentPrice instrumentPrice = this.instrumentPrice;
        if (instrumentPrice != null) {
            return instrumentPrice.getPrice();
        }
        return null;
    }

    public final BigDecimal getLastSaleSize() {
        InstrumentPrice instrumentPrice = this.instrumentPrice;
        if (instrumentPrice != null) {
            return instrumentPrice.getSize();
        }
        return null;
    }

    public final BigDecimal getAskPrice() {
        InstrumentPrice instrumentPrice = this.instrumentPrice;
        if (instrumentPrice != null) {
            return instrumentPrice.getAskPrice();
        }
        return null;
    }

    public final BigDecimal getAskSize() {
        InstrumentPrice instrumentPrice = this.instrumentPrice;
        if (instrumentPrice != null) {
            return instrumentPrice.getAskSize();
        }
        return null;
    }

    public final BigDecimal getBidPrice() {
        InstrumentPrice instrumentPrice = this.instrumentPrice;
        if (instrumentPrice != null) {
            return instrumentPrice.getBidPrice();
        }
        return null;
    }

    public final BigDecimal getBidSize() {
        InstrumentPrice instrumentPrice = this.instrumentPrice;
        if (instrumentPrice != null) {
            return instrumentPrice.getBidSize();
        }
        return null;
    }

    public final String getSymbol() {
        String symbol;
        Quote quote = this.quote;
        if (quote != null && (symbol = quote.getSymbol()) != null) {
            return symbol;
        }
        Instrument instrument = this.instrument;
        if (instrument != null) {
            return instrument.getDisplaySymbol();
        }
        return null;
    }

    public final String getMic() {
        InstrumentPrice instrumentPrice = this.instrumentPrice;
        if (instrumentPrice != null) {
            return instrumentPrice.getMic();
        }
        return null;
    }

    public final String getBidMic() {
        InstrumentPrice instrumentPrice = this.instrumentPrice;
        if (instrumentPrice != null) {
            return instrumentPrice.getBidMic();
        }
        return null;
    }

    public final String getAskMic() {
        InstrumentPrice instrumentPrice = this.instrumentPrice;
        if (instrumentPrice != null) {
            return instrumentPrice.getAskMic();
        }
        return null;
    }

    /* compiled from: MarketDataDisclosureDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDataState$Companion;", "", "<init>", "()V", "j$/time/LocalTime", "kotlin.jvm.PlatformType", "TWENTY_FOUR_HOURS_START_TIME", "Lj$/time/LocalTime;", "getTWENTY_FOUR_HOURS_START_TIME$lib_market_data_disclosure_externalDebug", "()Lj$/time/LocalTime;", "TWENTY_FOUR_HOURS_END_TIME", "getTWENTY_FOUR_HOURS_END_TIME$lib_market_data_disclosure_externalDebug", "lib-market-data-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getTWENTY_FOUR_HOURS_START_TIME$lib_market_data_disclosure_externalDebug */
        public final LocalTime m2166xae9a382b() {
            return MarketDataDisclosureDataState.TWENTY_FOUR_HOURS_START_TIME;
        }

        /* renamed from: getTWENTY_FOUR_HOURS_END_TIME$lib_market_data_disclosure_externalDebug */
        public final LocalTime m2165x4c4814a4() {
            return MarketDataDisclosureDataState.TWENTY_FOUR_HOURS_END_TIME;
        }
    }

    static {
        ZoneIds zoneIds = ZoneIds.INSTANCE;
        TWENTY_FOUR_HOURS_START_TIME = ZonedDateTime.now(zoneIds.getNEW_YORK()).with((TemporalAdjuster) LocalTime.m3408of(20, 0)).toLocalTime();
        TWENTY_FOUR_HOURS_END_TIME = ZonedDateTime.now(zoneIds.getNEW_YORK()).with((TemporalAdjuster) LocalTime.m3408of(4, 0)).toLocalTime();
    }
}
