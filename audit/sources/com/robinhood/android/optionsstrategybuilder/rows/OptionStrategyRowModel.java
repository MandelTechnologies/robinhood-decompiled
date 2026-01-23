package com.robinhood.android.optionsstrategybuilder.rows;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.optionchain.BaseOptionInstrumentRowModel;
import com.robinhood.android.options.aggregatequotes.ClientAggregateOptionStrategyQuote;
import com.robinhood.android.options.aggregatequotes.OptionQuoteAggregator;
import com.robinhood.android.options.tradability.UiOptionInstrumentTradability;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.models.Decimals;
import com.robinhood.models.Decimals3;
import com.robinhood.models.Decimals4;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.api.strategybuilder.StrategyBuilderRowContentDataType;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: OptionStrategyRowModel.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 y2\u00020\u0001:\u0002xyB¡\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020PH\u0016J\u001e\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0R2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010]\u001a\u00020\tJ\u0010\u0010^\u001a\u00020I2\u0006\u0010_\u001a\u00020`H\u0002J\u0010\u0010a\u001a\u00020I2\u0006\u0010_\u001a\u00020`H\u0002J2\u0010b\u001a\u0004\u0018\u00010G2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010c\u001a\u00020I2\b\u0010d\u001a\u0004\u0018\u00010\u0001H\u0016J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010h\u001a\u00020\tHÆ\u0003J\t\u0010i\u001a\u00020\u000bHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0015\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fHÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u000f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u001dHÆ\u0003J·\u0001\u0010r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001J\u0013\u0010s\u001a\u00020I2\b\u0010d\u001a\u0004\u0018\u00010tHÖ\u0003J\t\u0010u\u001a\u00020vHÖ\u0001J\t\u0010w\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u000209X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010'R\u0016\u0010>\u001a\u0004\u0018\u00010?X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010B\u001a\u0004\u0018\u00010CX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\u00020IX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010JR\u0014\u0010K\u001a\u00020IX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010JR!\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR!\u0010U\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0011\u0010X\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bY\u0010JR\u0010\u0010Z\u001a\u0004\u0018\u00010CX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010[\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010'¨\u0006z"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowModel;", "Lcom/robinhood/android/optionchain/BaseOptionInstrumentRowModel;", "defaultPricingSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "tradeOnExpirationSettings", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "title", "", "strategy", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy;", "clientAggregateOptionStrategyQuote", "Lcom/robinhood/android/options/aggregatequotes/ClientAggregateOptionStrategyQuote;", "optionPositionCounts", "", "Ljava/util/UUID;", "Lcom/robinhood/models/ui/UiOptionPositionCounts;", "matchingAggregateOptionPositions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "oppositeAggregateOptionPositions", "dataRowContent", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$DataRowContent;", "selectedMetrics", "Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "strategyType", "Lcom/robinhood/models/api/OptionStrategyType;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "<init>", "(Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Ljava/lang/String;Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy;Lcom/robinhood/android/options/aggregatequotes/ClientAggregateOptionStrategyQuote;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/models/api/OptionStrategyType;Lcom/robinhood/models/ui/UnderlyingQuote;)V", "getDefaultPricingSetting", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getTradeOnExpirationSettings", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "getCurrentOrNextMarketDates", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "getTitle", "()Ljava/lang/String;", "getStrategy", "()Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy;", "getClientAggregateOptionStrategyQuote", "()Lcom/robinhood/android/options/aggregatequotes/ClientAggregateOptionStrategyQuote;", "getOptionPositionCounts", "()Ljava/util/Map;", "getMatchingAggregateOptionPositions", "()Ljava/util/List;", "getOppositeAggregateOptionPositions", "getDataRowContent", "getSelectedMetrics", "()Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "getStrategyType", "()Lcom/robinhood/models/api/OptionStrategyType;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "priceFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getPriceFormatter", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "identifier", "getIdentifier", "optionQuote", "Lcom/robinhood/models/db/OptionQuote;", "getOptionQuote", "()Lcom/robinhood/models/db/OptionQuote;", "displayPrice", "Ljava/math/BigDecimal;", "getDisplayPrice", "()Ljava/math/BigDecimal;", "disabledState", "Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowModel$DisabledState;", "isDisabled", "", "()Z", "tradableFromBottomSheet", "getTradableFromBottomSheet", "getErrorMessageTxt", "", "resources", "Landroid/content/res/Resources;", "dataRowDisplay1", "Lkotlin/Pair;", "getDataRowDisplay1", "()Lkotlin/Pair;", "dataRowDisplay2", "getDataRowDisplay2", "getDataRowDisplayFromDataRowContent", "contractSelected", "getContractSelected", "positionQuantity", "positionQuantityString", "getPositionQuantityString", "getStrikePriceString", "isPositionClosingOnly", "leg", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy$Leg;", "isExpiringSoon", "getDisabledState", "contentsSame", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "hashCode", "", "toString", "DisabledState", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionStrategyRowModel implements BaseOptionInstrumentRowModel {
    private final ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote;
    private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
    private final List<OptionStrategyChainTemplate.DataRowContent> dataRowContent;
    private final OptionSettings.DefaultPricingSetting defaultPricingSetting;
    private final DisabledState disabledState;
    private final BigDecimal displayPrice;
    private final String identifier;
    private final boolean isDisabled;
    private final List<UiAggregateOptionPosition> matchingAggregateOptionPositions;
    private final List<UiAggregateOptionPosition> oppositeAggregateOptionPositions;
    private final Map<UUID, UiOptionPositionCounts> optionPositionCounts;
    private final OptionQuote optionQuote;
    private final BigDecimal positionQuantity;
    private final String positionQuantityString;
    private final NumberFormatter priceFormatter;
    private final OptionChainSelectedMetrics selectedMetrics;
    private final OptionStrategyBuilderViewState.Strategy strategy;
    private final OptionStrategyType strategyType;
    private final String title;
    private final boolean tradableFromBottomSheet;
    private final OptionSettings.TradingOnExpirationState tradeOnExpirationSettings;
    private final UnderlyingQuote underlyingQuote;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionStrategyRowModel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StrategyBuilderRowContentDataType.values().length];
            try {
                iArr[StrategyBuilderRowContentDataType.BID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StrategyBuilderRowContentDataType.ASK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StrategyBuilderRowContentDataType.BREAK_EVEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StrategyBuilderRowContentDataType.TO_BREAK_EVEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StrategyBuilderRowContentDataType.CHANCE_OF_PROFIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StrategyBuilderRowContentDataType.MARK_PERCENT_CHANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StrategyBuilderRowContentDataType.MARK_CHANGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StrategyBuilderRowContentDataType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ OptionStrategyRowModel copy$default(OptionStrategyRowModel optionStrategyRowModel, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.TradingOnExpirationState tradingOnExpirationState, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, String str, OptionStrategyBuilderViewState.Strategy strategy, ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote, Map map, List list, List list2, List list3, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionStrategyType optionStrategyType, UnderlyingQuote underlyingQuote, int i, Object obj) {
        if ((i & 1) != 0) {
            defaultPricingSetting = optionStrategyRowModel.defaultPricingSetting;
        }
        return optionStrategyRowModel.copy(defaultPricingSetting, (i & 2) != 0 ? optionStrategyRowModel.tradeOnExpirationSettings : tradingOnExpirationState, (i & 4) != 0 ? optionStrategyRowModel.currentOrNextMarketDates : optionCurrentOrNextMarketDates, (i & 8) != 0 ? optionStrategyRowModel.title : str, (i & 16) != 0 ? optionStrategyRowModel.strategy : strategy, (i & 32) != 0 ? optionStrategyRowModel.clientAggregateOptionStrategyQuote : clientAggregateOptionStrategyQuote, (i & 64) != 0 ? optionStrategyRowModel.optionPositionCounts : map, (i & 128) != 0 ? optionStrategyRowModel.matchingAggregateOptionPositions : list, (i & 256) != 0 ? optionStrategyRowModel.oppositeAggregateOptionPositions : list2, (i & 512) != 0 ? optionStrategyRowModel.dataRowContent : list3, (i & 1024) != 0 ? optionStrategyRowModel.selectedMetrics : optionChainSelectedMetrics, (i & 2048) != 0 ? optionStrategyRowModel.strategyType : optionStrategyType, (i & 4096) != 0 ? optionStrategyRowModel.underlyingQuote : underlyingQuote);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
        return this.defaultPricingSetting;
    }

    public final List<OptionStrategyChainTemplate.DataRowContent> component10() {
        return this.dataRowContent;
    }

    /* renamed from: component11, reason: from getter */
    public final OptionChainSelectedMetrics getSelectedMetrics() {
        return this.selectedMetrics;
    }

    /* renamed from: component12, reason: from getter */
    public final OptionStrategyType getStrategyType() {
        return this.strategyType;
    }

    /* renamed from: component13, reason: from getter */
    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationSettings() {
        return this.tradeOnExpirationSettings;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionStrategyBuilderViewState.Strategy getStrategy() {
        return this.strategy;
    }

    /* renamed from: component6, reason: from getter */
    public final ClientAggregateOptionStrategyQuote getClientAggregateOptionStrategyQuote() {
        return this.clientAggregateOptionStrategyQuote;
    }

    public final Map<UUID, UiOptionPositionCounts> component7() {
        return this.optionPositionCounts;
    }

    public final List<UiAggregateOptionPosition> component8() {
        return this.matchingAggregateOptionPositions;
    }

    public final List<UiAggregateOptionPosition> component9() {
        return this.oppositeAggregateOptionPositions;
    }

    public final OptionStrategyRowModel copy(OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.TradingOnExpirationState tradeOnExpirationSettings, OptionCurrentOrNextMarketDates currentOrNextMarketDates, String title, OptionStrategyBuilderViewState.Strategy strategy, ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote, Map<UUID, UiOptionPositionCounts> optionPositionCounts, List<? extends UiAggregateOptionPosition> matchingAggregateOptionPositions, List<? extends UiAggregateOptionPosition> oppositeAggregateOptionPositions, List<OptionStrategyChainTemplate.DataRowContent> dataRowContent, OptionChainSelectedMetrics selectedMetrics, OptionStrategyType strategyType, UnderlyingQuote underlyingQuote) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(optionPositionCounts, "optionPositionCounts");
        Intrinsics.checkNotNullParameter(matchingAggregateOptionPositions, "matchingAggregateOptionPositions");
        Intrinsics.checkNotNullParameter(oppositeAggregateOptionPositions, "oppositeAggregateOptionPositions");
        Intrinsics.checkNotNullParameter(dataRowContent, "dataRowContent");
        return new OptionStrategyRowModel(defaultPricingSetting, tradeOnExpirationSettings, currentOrNextMarketDates, title, strategy, clientAggregateOptionStrategyQuote, optionPositionCounts, matchingAggregateOptionPositions, oppositeAggregateOptionPositions, dataRowContent, selectedMetrics, strategyType, underlyingQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionStrategyRowModel)) {
            return false;
        }
        OptionStrategyRowModel optionStrategyRowModel = (OptionStrategyRowModel) other;
        return this.defaultPricingSetting == optionStrategyRowModel.defaultPricingSetting && this.tradeOnExpirationSettings == optionStrategyRowModel.tradeOnExpirationSettings && Intrinsics.areEqual(this.currentOrNextMarketDates, optionStrategyRowModel.currentOrNextMarketDates) && Intrinsics.areEqual(this.title, optionStrategyRowModel.title) && Intrinsics.areEqual(this.strategy, optionStrategyRowModel.strategy) && Intrinsics.areEqual(this.clientAggregateOptionStrategyQuote, optionStrategyRowModel.clientAggregateOptionStrategyQuote) && Intrinsics.areEqual(this.optionPositionCounts, optionStrategyRowModel.optionPositionCounts) && Intrinsics.areEqual(this.matchingAggregateOptionPositions, optionStrategyRowModel.matchingAggregateOptionPositions) && Intrinsics.areEqual(this.oppositeAggregateOptionPositions, optionStrategyRowModel.oppositeAggregateOptionPositions) && Intrinsics.areEqual(this.dataRowContent, optionStrategyRowModel.dataRowContent) && Intrinsics.areEqual(this.selectedMetrics, optionStrategyRowModel.selectedMetrics) && this.strategyType == optionStrategyRowModel.strategyType && Intrinsics.areEqual(this.underlyingQuote, optionStrategyRowModel.underlyingQuote);
    }

    public final boolean getContractSelected() {
        return false;
    }

    public int hashCode() {
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSetting;
        int iHashCode = (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode()) * 31;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState = this.tradeOnExpirationSettings;
        int iHashCode2 = (iHashCode + (tradingOnExpirationState == null ? 0 : tradingOnExpirationState.hashCode())) * 31;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        int iHashCode3 = (((((iHashCode2 + (optionCurrentOrNextMarketDates == null ? 0 : optionCurrentOrNextMarketDates.hashCode())) * 31) + this.title.hashCode()) * 31) + this.strategy.hashCode()) * 31;
        ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote = this.clientAggregateOptionStrategyQuote;
        int iHashCode4 = (((((((((iHashCode3 + (clientAggregateOptionStrategyQuote == null ? 0 : clientAggregateOptionStrategyQuote.hashCode())) * 31) + this.optionPositionCounts.hashCode()) * 31) + this.matchingAggregateOptionPositions.hashCode()) * 31) + this.oppositeAggregateOptionPositions.hashCode()) * 31) + this.dataRowContent.hashCode()) * 31;
        OptionChainSelectedMetrics optionChainSelectedMetrics = this.selectedMetrics;
        int iHashCode5 = (iHashCode4 + (optionChainSelectedMetrics == null ? 0 : optionChainSelectedMetrics.hashCode())) * 31;
        OptionStrategyType optionStrategyType = this.strategyType;
        int iHashCode6 = (iHashCode5 + (optionStrategyType == null ? 0 : optionStrategyType.hashCode())) * 31;
        UnderlyingQuote underlyingQuote = this.underlyingQuote;
        return iHashCode6 + (underlyingQuote != null ? underlyingQuote.hashCode() : 0);
    }

    public String toString() {
        return "OptionStrategyRowModel(defaultPricingSetting=" + this.defaultPricingSetting + ", tradeOnExpirationSettings=" + this.tradeOnExpirationSettings + ", currentOrNextMarketDates=" + this.currentOrNextMarketDates + ", title=" + this.title + ", strategy=" + this.strategy + ", clientAggregateOptionStrategyQuote=" + this.clientAggregateOptionStrategyQuote + ", optionPositionCounts=" + this.optionPositionCounts + ", matchingAggregateOptionPositions=" + this.matchingAggregateOptionPositions + ", oppositeAggregateOptionPositions=" + this.oppositeAggregateOptionPositions + ", dataRowContent=" + this.dataRowContent + ", selectedMetrics=" + this.selectedMetrics + ", strategyType=" + this.strategyType + ", underlyingQuote=" + this.underlyingQuote + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionStrategyRowModel(OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.TradingOnExpirationState tradingOnExpirationState, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, String title, OptionStrategyBuilderViewState.Strategy strategy, ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote, Map<UUID, UiOptionPositionCounts> optionPositionCounts, List<? extends UiAggregateOptionPosition> matchingAggregateOptionPositions, List<? extends UiAggregateOptionPosition> oppositeAggregateOptionPositions, List<OptionStrategyChainTemplate.DataRowContent> dataRowContent, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionStrategyType optionStrategyType, UnderlyingQuote underlyingQuote) {
        Object next;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(optionPositionCounts, "optionPositionCounts");
        Intrinsics.checkNotNullParameter(matchingAggregateOptionPositions, "matchingAggregateOptionPositions");
        Intrinsics.checkNotNullParameter(oppositeAggregateOptionPositions, "oppositeAggregateOptionPositions");
        Intrinsics.checkNotNullParameter(dataRowContent, "dataRowContent");
        this.defaultPricingSetting = defaultPricingSetting;
        this.tradeOnExpirationSettings = tradingOnExpirationState;
        this.currentOrNextMarketDates = optionCurrentOrNextMarketDates;
        this.title = title;
        this.strategy = strategy;
        this.clientAggregateOptionStrategyQuote = clientAggregateOptionStrategyQuote;
        this.optionPositionCounts = optionPositionCounts;
        this.matchingAggregateOptionPositions = matchingAggregateOptionPositions;
        this.oppositeAggregateOptionPositions = oppositeAggregateOptionPositions;
        this.dataRowContent = dataRowContent;
        this.selectedMetrics = optionChainSelectedMetrics;
        this.strategyType = optionStrategyType;
        this.underlyingQuote = underlyingQuote;
        this.priceFormatter = Formats.getAmountFormat();
        this.identifier = strategy.getIdentifier();
        this.optionQuote = clientAggregateOptionStrategyQuote;
        this.displayPrice = clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getQuote(defaultPricingSetting, false) : null;
        DisabledState disabledState = getDisabledState(oppositeAggregateOptionPositions, optionPositionCounts, strategy);
        this.disabledState = disabledState;
        this.isDisabled = disabledState != null;
        this.tradableFromBottomSheet = !getIsDisabled();
        Iterator it = matchingAggregateOptionPositions.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (strategy.matchesPosition((UiAggregateOptionPosition) next)) {
                    break;
                }
            }
        }
        UiAggregateOptionPosition uiAggregateOptionPosition = (UiAggregateOptionPosition) next;
        BigDecimal quantity = uiAggregateOptionPosition != null ? uiAggregateOptionPosition.getQuantity() : null;
        this.positionQuantity = quantity;
        this.positionQuantityString = quantity != null ? Formats.getShareQuantityFormat().format(quantity) : null;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionInstrumentRowModel
    public String getContractPriceDeltaPercentageString() {
        return BaseOptionInstrumentRowModel.DefaultImpls.getContractPriceDeltaPercentageString(this);
    }

    @Override // com.robinhood.android.optionchain.BaseOptionInstrumentRowModel
    public String getContractPriceDisplayString() {
        return BaseOptionInstrumentRowModel.DefaultImpls.getContractPriceDisplayString(this);
    }

    @Override // com.robinhood.android.optionchain.BaseOptionInstrumentRowModel
    public Boolean isStale() {
        return BaseOptionInstrumentRowModel.DefaultImpls.isStale(this);
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
        return this.defaultPricingSetting;
    }

    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationSettings() {
        return this.tradeOnExpirationSettings;
    }

    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final String getTitle() {
        return this.title;
    }

    public final OptionStrategyBuilderViewState.Strategy getStrategy() {
        return this.strategy;
    }

    public final ClientAggregateOptionStrategyQuote getClientAggregateOptionStrategyQuote() {
        return this.clientAggregateOptionStrategyQuote;
    }

    public /* synthetic */ OptionStrategyRowModel(OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.TradingOnExpirationState tradingOnExpirationState, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, String str, OptionStrategyBuilderViewState.Strategy strategy, ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote, Map map, List list, List list2, List list3, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionStrategyType optionStrategyType, UnderlyingQuote underlyingQuote, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(defaultPricingSetting, tradingOnExpirationState, optionCurrentOrNextMarketDates, str, strategy, clientAggregateOptionStrategyQuote, (i & 64) != 0 ? MapsKt.emptyMap() : map, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, list3, optionChainSelectedMetrics, optionStrategyType, underlyingQuote);
    }

    public final Map<UUID, UiOptionPositionCounts> getOptionPositionCounts() {
        return this.optionPositionCounts;
    }

    public final List<UiAggregateOptionPosition> getMatchingAggregateOptionPositions() {
        return this.matchingAggregateOptionPositions;
    }

    public final List<UiAggregateOptionPosition> getOppositeAggregateOptionPositions() {
        return this.oppositeAggregateOptionPositions;
    }

    public final List<OptionStrategyChainTemplate.DataRowContent> getDataRowContent() {
        return this.dataRowContent;
    }

    public final OptionChainSelectedMetrics getSelectedMetrics() {
        return this.selectedMetrics;
    }

    public final OptionStrategyType getStrategyType() {
        return this.strategyType;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionInstrumentRowModel
    public NumberFormatter getPriceFormatter() {
        return this.priceFormatter;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionInstrumentRowModel
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionInstrumentRowModel
    public OptionQuote getOptionQuote() {
        return this.optionQuote;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionInstrumentRowModel
    public BigDecimal getDisplayPrice() {
        return this.displayPrice;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionInstrumentRowModel
    /* renamed from: isDisabled, reason: from getter */
    public boolean getIsDisabled() {
        return this.isDisabled;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionInstrumentRowModel
    public boolean getTradableFromBottomSheet() {
        return this.tradableFromBottomSheet;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionInstrumentRowModel
    public CharSequence getErrorMessageTxt(Resources resources) {
        StringResource errorMsg;
        Intrinsics.checkNotNullParameter(resources, "resources");
        DisabledState disabledState = this.disabledState;
        if (disabledState == null || (errorMsg = disabledState.getErrorMsg()) == null) {
            return null;
        }
        return errorMsg.getText(resources);
    }

    public final Tuples2<String, String> getDataRowDisplay1() {
        OptionStrategyChainTemplate.DataRowContent dataRowContent = (OptionStrategyChainTemplate.DataRowContent) CollectionsKt.firstOrNull((List) this.dataRowContent);
        if (dataRowContent != null) {
            return getDataRowDisplayFromDataRowContent(dataRowContent);
        }
        return null;
    }

    public final Tuples2<String, String> getDataRowDisplay2() {
        OptionStrategyChainTemplate.DataRowContent dataRowContent = (OptionStrategyChainTemplate.DataRowContent) CollectionsKt.getOrNull(this.dataRowContent, 1);
        if (dataRowContent != null) {
            return getDataRowDisplayFromDataRowContent(dataRowContent);
        }
        return null;
    }

    private final Tuples2<String, String> getDataRowDisplayFromDataRowContent(OptionStrategyChainTemplate.DataRowContent dataRowContent) {
        Decimals bidPrice;
        BigDecimal rawValue;
        Decimals3 askPrice;
        BigDecimal rawValue2;
        Decimals4 breakEvenPrice;
        BigDecimal unsignedValue;
        BigDecimal breakevenPercentage;
        BigDecimal chanceOfProfit;
        List<OptionQuoteAggregator.LegContext> legs;
        ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote = this.clientAggregateOptionStrategyQuote;
        String nullable$default = null;
        OptionQuoteAggregator.LegContext legContext = (clientAggregateOptionStrategyQuote == null || (legs = clientAggregateOptionStrategyQuote.getLegs()) == null) ? null : (OptionQuoteAggregator.LegContext) CollectionsKt.singleOrNull((List) legs);
        OptionInstrumentQuote optionQuote = legContext != null ? legContext.getOptionQuote() : null;
        String title = dataRowContent.getTitle();
        switch (WhenMappings.$EnumSwitchMapping$0[dataRowContent.getDataType().ordinal()]) {
            case 1:
                ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote2 = this.clientAggregateOptionStrategyQuote;
                if (clientAggregateOptionStrategyQuote2 != null && (bidPrice = clientAggregateOptionStrategyQuote2.getBidPrice()) != null && (rawValue = bidPrice.getRawValue()) != null) {
                    nullable$default = Formats.getPriceFormat().format(rawValue);
                    break;
                }
                break;
            case 2:
                ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote3 = this.clientAggregateOptionStrategyQuote;
                if (clientAggregateOptionStrategyQuote3 != null && (askPrice = clientAggregateOptionStrategyQuote3.getAskPrice()) != null && (rawValue2 = askPrice.getRawValue()) != null) {
                    nullable$default = Formats.getPriceFormat().format(rawValue2);
                    break;
                }
                break;
            case 3:
                if (optionQuote != null && (breakEvenPrice = optionQuote.getBreakEvenPrice()) != null && (unsignedValue = breakEvenPrice.getUnsignedValue()) != null) {
                    nullable$default = Formats.getPriceFormat().format(unsignedValue);
                    break;
                }
                break;
            case 4:
                if (optionQuote != null && (breakevenPercentage = optionQuote.getBreakevenPercentage(this.underlyingQuote)) != null) {
                    nullable$default = Formats.getPercentDeltaFormat().format(breakevenPercentage);
                    break;
                }
                break;
            case 5:
                if (optionQuote != null && (chanceOfProfit = optionQuote.getChanceOfProfit(legContext.getSide())) != null) {
                    nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentFormat(), chanceOfProfit, null, 2, null);
                    break;
                }
                break;
            case 6:
            case 7:
            case 8:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Tuples4.m3642to(title, nullable$default);
    }

    public final String getPositionQuantityString() {
        return this.positionQuantityString;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionStrategyRowModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowModel$DisabledState;", "", "errorMsg", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/resource/StringResource;)V", "getErrorMsg", "()Lcom/robinhood/utils/resource/StringResource;", "OPPOSITE_STRATEGY", "OPPOSITE_LEG", "EXPIRING", "PCO", "EXPIRING_LEG", "PCO_LEG", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisabledState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DisabledState[] $VALUES;
        public static final DisabledState EXPIRING;
        public static final DisabledState EXPIRING_LEG;
        public static final DisabledState OPPOSITE_LEG;
        public static final DisabledState OPPOSITE_STRATEGY;
        public static final DisabledState PCO;
        public static final DisabledState PCO_LEG;
        private final StringResource errorMsg;

        private static final /* synthetic */ DisabledState[] $values() {
            return new DisabledState[]{OPPOSITE_STRATEGY, OPPOSITE_LEG, EXPIRING, PCO, EXPIRING_LEG, PCO_LEG};
        }

        public static EnumEntries<DisabledState> getEntries() {
            return $ENTRIES;
        }

        private DisabledState(String str, int i, StringResource stringResource) {
            this.errorMsg = stringResource;
        }

        public final StringResource getErrorMsg() {
            return this.errorMsg;
        }

        static {
            StringResource.Companion companion = StringResource.INSTANCE;
            OPPOSITE_STRATEGY = new DisabledState("OPPOSITE_STRATEGY", 0, companion.invoke(C24876R.string.own_opposite_strategy_error, new Object[0]));
            OPPOSITE_LEG = new DisabledState("OPPOSITE_LEG", 1, companion.invoke(C24876R.string.own_opposite_leg_error, new Object[0]));
            EXPIRING = new DisabledState("EXPIRING", 2, companion.invoke(C24876R.string.all_legs_expiring_soon_error, new Object[0]));
            PCO = new DisabledState("PCO", 3, companion.invoke(C24876R.string.all_legs_pco_error, new Object[0]));
            EXPIRING_LEG = new DisabledState("EXPIRING_LEG", 4, companion.invoke(C24876R.string.any_leg_expiring_soon_error, new Object[0]));
            PCO_LEG = new DisabledState("PCO_LEG", 5, companion.invoke(C24876R.string.any_leg_pco_error, new Object[0]));
            DisabledState[] disabledStateArr$values = $values();
            $VALUES = disabledStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(disabledStateArr$values);
        }

        public static DisabledState valueOf(String str) {
            return (DisabledState) Enum.valueOf(DisabledState.class, str);
        }

        public static DisabledState[] values() {
            return (DisabledState[]) $VALUES.clone();
        }
    }

    public final String getStrikePriceString() {
        return this.title;
    }

    private final boolean isPositionClosingOnly(OptionStrategyBuilderViewState.Strategy.Leg leg) {
        OptionSettings.TradingOnExpirationState tradingOnExpirationState;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        return (optionCurrentOrNextMarketDates == null || (tradingOnExpirationState = this.tradeOnExpirationSettings) == null || new UiOptionInstrumentTradability(optionCurrentOrNextMarketDates, tradingOnExpirationState, leg.getOptionInstrument(), leg.getUiOptionChain()).getAdjustedTradability() != Tradability.POSITION_CLOSING_ONLY) ? false : true;
    }

    private final boolean isExpiringSoon(OptionStrategyBuilderViewState.Strategy.Leg leg) {
        return isPositionClosingOnly(leg) && Intrinsics.areEqual(leg.getOptionInstrument().getExpirationDate(), LocalDate.now(ZoneIds.INSTANCE.getNEW_YORK()));
    }

    public final DisabledState getDisabledState(List<? extends UiAggregateOptionPosition> oppositeAggregateOptionPositions, Map<UUID, UiOptionPositionCounts> optionPositionCounts, OptionStrategyBuilderViewState.Strategy strategy) {
        Object next;
        Intrinsics.checkNotNullParameter(oppositeAggregateOptionPositions, "oppositeAggregateOptionPositions");
        Intrinsics.checkNotNullParameter(optionPositionCounts, "optionPositionCounts");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Iterator<T> it = oppositeAggregateOptionPositions.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (strategy.matchesOppositePosition((UiAggregateOptionPosition) next)) {
                break;
            }
        }
        UiAggregateOptionPosition uiAggregateOptionPosition = (UiAggregateOptionPosition) next;
        if (BigDecimals7.isPositive(uiAggregateOptionPosition != null ? uiAggregateOptionPosition.getQuantity() : null)) {
            return DisabledState.OPPOSITE_STRATEGY;
        }
        List<OptionStrategyBuilderViewState.Strategy.Leg> legs = strategy.getLegs();
        if (!(legs instanceof Collection) || !legs.isEmpty()) {
            Iterator<T> it2 = legs.iterator();
            while (it2.hasNext()) {
                if (INSTANCE.hasPositionClosingEffect((OptionStrategyBuilderViewState.Strategy.Leg) it2.next(), optionPositionCounts)) {
                    return DisabledState.OPPOSITE_LEG;
                }
            }
        }
        List<OptionStrategyBuilderViewState.Strategy.Leg> legs2 = strategy.getLegs();
        if (!(legs2 instanceof Collection) || !legs2.isEmpty()) {
            Iterator<T> it3 = legs2.iterator();
            while (it3.hasNext()) {
                if (!isExpiringSoon((OptionStrategyBuilderViewState.Strategy.Leg) it3.next())) {
                    List<OptionStrategyBuilderViewState.Strategy.Leg> legs3 = strategy.getLegs();
                    if (!(legs3 instanceof Collection) || !legs3.isEmpty()) {
                        Iterator<T> it4 = legs3.iterator();
                        while (it4.hasNext()) {
                            if (isExpiringSoon((OptionStrategyBuilderViewState.Strategy.Leg) it4.next())) {
                                return DisabledState.EXPIRING_LEG;
                            }
                        }
                    }
                    List<OptionStrategyBuilderViewState.Strategy.Leg> legs4 = strategy.getLegs();
                    if (!(legs4 instanceof Collection) || !legs4.isEmpty()) {
                        Iterator<T> it5 = legs4.iterator();
                        while (it5.hasNext()) {
                            if (!isPositionClosingOnly((OptionStrategyBuilderViewState.Strategy.Leg) it5.next())) {
                                List<OptionStrategyBuilderViewState.Strategy.Leg> legs5 = strategy.getLegs();
                                if (!(legs5 instanceof Collection) || !legs5.isEmpty()) {
                                    Iterator<T> it6 = legs5.iterator();
                                    while (it6.hasNext()) {
                                        if (isPositionClosingOnly((OptionStrategyBuilderViewState.Strategy.Leg) it6.next())) {
                                            return DisabledState.PCO_LEG;
                                        }
                                    }
                                }
                                return null;
                            }
                        }
                    }
                    return DisabledState.PCO;
                }
            }
        }
        return DisabledState.EXPIRING;
    }

    /* compiled from: OptionStrategyRowModel.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowModel$Companion;", "", "<init>", "()V", "hasPositionClosingEffect", "", "leg", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy$Leg;", "optionPositionCounts", "", "Ljava/util/UUID;", "Lcom/robinhood/models/ui/UiOptionPositionCounts;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: OptionStrategyRowModel.kt */
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

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasPositionClosingEffect(OptionStrategyBuilderViewState.Strategy.Leg leg, Map<UUID, UiOptionPositionCounts> optionPositionCounts) {
            UiOptionPositionCounts uiOptionPositionCounts = optionPositionCounts.get(leg.getOptionInstrument().getId());
            if (uiOptionPositionCounts == null) {
                return false;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[leg.getOptionLegTemplate().getSide().ordinal()];
            if (i == 1) {
                return uiOptionPositionCounts.getShortQuantity() != 0;
            }
            if (i == 2) {
                return uiOptionPositionCounts.getLongQuantity() != 0;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.optionchain.BaseOptionInstrumentRowModel
    public boolean contentsSame(BaseOptionInstrumentRowModel other) {
        OptionStrategyRowModel optionStrategyRowModel = other instanceof OptionStrategyRowModel ? (OptionStrategyRowModel) other : null;
        if (!BaseOptionInstrumentRowModel.DefaultImpls.contentsSame(this, other)) {
            return false;
        }
        if (Intrinsics.areEqual(this.positionQuantity, optionStrategyRowModel != null ? optionStrategyRowModel.positionQuantity : null)) {
            return Intrinsics.areEqual(this.selectedMetrics, optionStrategyRowModel != null ? optionStrategyRowModel.selectedMetrics : null);
        }
        return false;
    }
}
