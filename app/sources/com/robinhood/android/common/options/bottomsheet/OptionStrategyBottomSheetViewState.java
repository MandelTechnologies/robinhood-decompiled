package com.robinhood.android.common.options.bottomsheet;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetAdapter2;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.aggregatequotes.ClientAggregateOptionStrategyQuote;
import com.robinhood.android.options.aggregatequotes.OptionQuoteAggregator;
import com.robinhood.android.options.contracts.OptionStrategyBottomSheetFragmentKey;
import com.robinhood.android.options.contracts.OptionsProfitLossChartAnalysisFragmentKey;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionStrategyBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 02\u00020\u0001:\u00010B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003JA\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0001J\u0013\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetViewState;", "", "args", "Lcom/robinhood/android/options/contracts/OptionStrategyBottomSheetFragmentKey;", "equityQuote", "Lcom/robinhood/models/db/Quote;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "optionQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionStrategyBottomSheetFragmentKey;Lcom/robinhood/models/db/Quote;Lcom/robinhood/android/indexes/models/db/IndexValue;Ljava/util/Map;)V", "getArgs", "()Lcom/robinhood/android/options/contracts/OptionStrategyBottomSheetFragmentKey;", "getEquityQuote", "()Lcom/robinhood/models/db/Quote;", "getIndexValue", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "getOptionQuotes", "()Ljava/util/Map;", "analysisBtnFragmentKey", "Lcom/robinhood/android/options/contracts/OptionsProfitLossChartAnalysisFragmentKey;", "analysisBtnEnabled", "", "orderPrice", "Ljava/math/BigDecimal;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "profitLossChartParams", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "rows", "", "Lcom/robinhood/android/common/options/bottomsheet/SpreadData;", "getRows", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class OptionStrategyBottomSheetViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean analysisBtnEnabled;
    private final OptionsProfitLossChartAnalysisFragmentKey analysisBtnFragmentKey;
    private final OptionStrategyBottomSheetFragmentKey args;
    private final Quote equityQuote;
    private final IndexValue indexValue;
    private final Map<UUID, OptionInstrumentQuote> optionQuotes;
    private final BigDecimal orderPrice;
    private final ApiOptionsProfitLossChartRequestParams profitLossChartParams;
    private final List<OptionStrategyBottomSheetAdapter2> rows;
    private final UnderlyingQuote underlyingQuote;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionStrategyBottomSheetViewState copy$default(OptionStrategyBottomSheetViewState optionStrategyBottomSheetViewState, OptionStrategyBottomSheetFragmentKey optionStrategyBottomSheetFragmentKey, Quote quote, IndexValue indexValue, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            optionStrategyBottomSheetFragmentKey = optionStrategyBottomSheetViewState.args;
        }
        if ((i & 2) != 0) {
            quote = optionStrategyBottomSheetViewState.equityQuote;
        }
        if ((i & 4) != 0) {
            indexValue = optionStrategyBottomSheetViewState.indexValue;
        }
        if ((i & 8) != 0) {
            map = optionStrategyBottomSheetViewState.optionQuotes;
        }
        return optionStrategyBottomSheetViewState.copy(optionStrategyBottomSheetFragmentKey, quote, indexValue, map);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionStrategyBottomSheetFragmentKey getArgs() {
        return this.args;
    }

    /* renamed from: component2, reason: from getter */
    public final Quote getEquityQuote() {
        return this.equityQuote;
    }

    /* renamed from: component3, reason: from getter */
    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    public final Map<UUID, OptionInstrumentQuote> component4() {
        return this.optionQuotes;
    }

    public final OptionStrategyBottomSheetViewState copy(OptionStrategyBottomSheetFragmentKey args, Quote equityQuote, IndexValue indexValue, Map<UUID, OptionInstrumentQuote> optionQuotes) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        return new OptionStrategyBottomSheetViewState(args, equityQuote, indexValue, optionQuotes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionStrategyBottomSheetViewState)) {
            return false;
        }
        OptionStrategyBottomSheetViewState optionStrategyBottomSheetViewState = (OptionStrategyBottomSheetViewState) other;
        return Intrinsics.areEqual(this.args, optionStrategyBottomSheetViewState.args) && Intrinsics.areEqual(this.equityQuote, optionStrategyBottomSheetViewState.equityQuote) && Intrinsics.areEqual(this.indexValue, optionStrategyBottomSheetViewState.indexValue) && Intrinsics.areEqual(this.optionQuotes, optionStrategyBottomSheetViewState.optionQuotes);
    }

    public int hashCode() {
        int iHashCode = this.args.hashCode() * 31;
        Quote quote = this.equityQuote;
        int iHashCode2 = (iHashCode + (quote == null ? 0 : quote.hashCode())) * 31;
        IndexValue indexValue = this.indexValue;
        return ((iHashCode2 + (indexValue != null ? indexValue.hashCode() : 0)) * 31) + this.optionQuotes.hashCode();
    }

    public String toString() {
        return "OptionStrategyBottomSheetViewState(args=" + this.args + ", equityQuote=" + this.equityQuote + ", indexValue=" + this.indexValue + ", optionQuotes=" + this.optionQuotes + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionStrategyBottomSheetViewState(OptionStrategyBottomSheetFragmentKey args, Quote quote, IndexValue indexValue, Map<UUID, OptionInstrumentQuote> optionQuotes) {
        ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams;
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        BigDecimal quote2;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        this.args = args;
        this.equityQuote = quote;
        this.indexValue = indexValue;
        this.optionQuotes = optionQuotes;
        this.analysisBtnFragmentKey = new OptionsProfitLossChartAnalysisFragmentKey(1, args.getOptionOrderBundle(), null, false, null, args.getDefaultPricingSetting(), 16, null);
        this.analysisBtnEnabled = true;
        List legContexts = INSTANCE.getLegContexts(args.getOptionOrderBundle(), optionQuotes);
        BigDecimal scale = (legContexts == null || (quote2 = new ClientAggregateOptionStrategyQuote(legContexts, OrderDirection.DEBIT).getQuote(args.getDefaultPricingSetting(), false)) == null) ? null : quote2.setScale(2, RoundingMode.HALF_UP);
        this.orderPrice = scale;
        UnderlyingQuote underlyingQuote = UnderlyingQuote.INSTANCE.getUnderlyingQuote(quote, indexValue);
        this.underlyingQuote = underlyingQuote;
        if (underlyingQuote == null) {
            apiOptionsProfitLossChartRequestParams = null;
        } else {
            OptionOrderBundle optionOrderBundle = args.getOptionOrderBundle();
            if (scale != null) {
                apiOptionsProfitLossChartRequestParams = new ApiOptionsProfitLossChartRequestParams(optionOrderBundle, 1, (Money) null, new Money(Currencies.USD, scale), underlyingQuote, 4, (DefaultConstructorMarker) null);
            }
        }
        this.profitLossChartParams = apiOptionsProfitLossChartRequestParams;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        StringResource.Companion companion = StringResource.INSTANCE;
        listCreateListBuilder.add(new OptionStrategyBottomSheetAdapter2.TitleData(companion.invoke(args.getTitle())));
        listCreateListBuilder.add(new OptionStrategyBottomSheetAdapter2.TwoItemRowData(companion.invoke(C11312R.string.option_bottom_sheet_contracts, new Object[0]), null));
        for (OptionLegBundle optionLegBundle : args.getOptionOrderBundle().getLegBundles()) {
            listCreateListBuilder.add(new OptionStrategyBottomSheetAdapter2.RowData(optionLegBundle, this.args.getPositionCounts().get(optionLegBundle.getOptionInstrument().getId()), this.optionQuotes.get(optionLegBundle.getOptionInstrument().getId())));
        }
        BigDecimal bigDecimal = this.orderPrice;
        Integer numValueOf = bigDecimal != null ? Integer.valueOf(bigDecimal.signum()) : null;
        if (numValueOf == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C11312R.string.option_bottom_sheet_total, new Object[0]);
        } else {
            stringResourceInvoke = numValueOf.intValue() == -1 ? StringResource.INSTANCE.invoke(C11312R.string.option_bottom_sheet_total_credit, new Object[0]) : StringResource.INSTANCE.invoke(C11312R.string.option_bottom_sheet_total_debit, new Object[0]);
        }
        if (this.orderPrice != null) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            NumberFormatter amountFormat = Formats.getAmountFormat();
            BigDecimal bigDecimalAbs = this.orderPrice.abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            stringResourceInvoke2 = companion2.invoke(amountFormat.format(bigDecimalAbs));
        } else {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }
        listCreateListBuilder.add(new OptionStrategyBottomSheetAdapter2.TwoItemRowData(stringResourceInvoke, stringResourceInvoke2));
        List legContexts2 = INSTANCE.getLegContexts(this.args.getOptionOrderBundle(), this.optionQuotes);
        listCreateListBuilder.add(new OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData(this.analysisBtnEnabled, this.analysisBtnFragmentKey, this.args.getUiOptionChain().getOptionChain().getSymbol(), this.profitLossChartParams, legContexts2 != null ? new ClientAggregateOptionStrategyQuote(legContexts2, OrderDirection.DEBIT) : null));
        this.rows = CollectionsKt.build(listCreateListBuilder);
    }

    public final OptionStrategyBottomSheetFragmentKey getArgs() {
        return this.args;
    }

    public final Quote getEquityQuote() {
        return this.equityQuote;
    }

    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    public /* synthetic */ OptionStrategyBottomSheetViewState(OptionStrategyBottomSheetFragmentKey optionStrategyBottomSheetFragmentKey, Quote quote, IndexValue indexValue, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(optionStrategyBottomSheetFragmentKey, (i & 2) != 0 ? null : quote, (i & 4) != 0 ? null : indexValue, (i & 8) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<UUID, OptionInstrumentQuote> getOptionQuotes() {
        return this.optionQuotes;
    }

    public final List<OptionStrategyBottomSheetAdapter2> getRows() {
        return this.rows;
    }

    /* compiled from: OptionStrategyBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetViewState$Companion;", "", "<init>", "()V", "getLegContexts", "", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$LegContext;", "Lcom/robinhood/models/ui/OptionOrderBundle;", "optionQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<OptionQuoteAggregator.LegContext> getLegContexts(OptionOrderBundle optionOrderBundle, Map<UUID, OptionInstrumentQuote> map) {
            ImmutableList<OptionLegBundle> legBundles = optionOrderBundle.getLegBundles();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
            for (OptionLegBundle optionLegBundle : legBundles) {
                OptionInstrumentQuote optionInstrumentQuote = map.get(optionLegBundle.getOptionInstrument().getId());
                if (optionInstrumentQuote == null) {
                    return null;
                }
                OrderSide optionSide = optionLegBundle.getOptionConfigurationBundle().getOptionSide();
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(optionLegBundle.getRatio());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                arrayList.add(new OptionQuoteAggregator.LegContext(optionInstrumentQuote, optionSide, bigDecimalValueOf));
            }
            return arrayList;
        }
    }
}
