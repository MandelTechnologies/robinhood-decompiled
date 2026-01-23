package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderEvent;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.UnderlyingQuote;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: OptionsSimulatedReturnPriceSliderDataState.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020;J\u001d\u0010<\u001a\u0004\u0018\u00010\u000f2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>¢\u0006\u0002\u0010@J&\u0010A\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0B2\u0006\u0010C\u001a\u00020D2\u0006\u0010\u0002\u001a\u00020\u0003J%\u0010E\u001a\b\u0012\u0004\u0012\u00020G0F2\b\u0010H\u001a\u0004\u0018\u00010\u000f2\b\u0010I\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010JJ\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u000fHÂ\u0003¢\u0006\u0002\u0010&Jl\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u0002052\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020>HÖ\u0001J\t\u0010X\u001a\u00020YHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010$\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b%\u0010&R\u0012\u0010'\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0015\u0010(\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b)\u0010&R\u0012\u0010*\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0015\u0010+\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b,\u0010&R\u0015\u0010-\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b.\u0010&R\u0014\u0010/\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u00102\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b3\u0010&R\u0012\u00104\u001a\u0004\u0018\u000105X\u0082\u0004¢\u0006\u0004\n\u0002\u00106R\u0015\u00107\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b8\u0010&¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDataState;", "", "dragState", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;", "launchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Price;", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "equityQuote", "Lcom/robinhood/models/db/Quote;", "initialEquityQuote", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "initialIndexValue", "pointerPosition", "", "<init>", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Price;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Quote;Lcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/android/indexes/models/db/IndexValue;Ljava/lang/Double;)V", "getDragState", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;", "getLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Price;", "getLoggingState", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getEquityQuote", "()Lcom/robinhood/models/db/Quote;", "getInitialEquityQuote", "getIndexValue", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "getInitialIndexValue", "Ljava/lang/Double;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "initialUnderlyingQuote", "quotePosition", "getQuotePosition", "()Ljava/lang/Double;", "initialPrice", "fineIncrement", "getFineIncrement", "snapDistance", "coarseIncrement", "getCoarseIncrement", "rangeLength", "getRangeLength", "minPointerPosition", "getMinPointerPosition", "()D", "maxPointerPosition", "getMaxPointerPosition", "isInQuoteSnapRange", "", "Ljava/lang/Boolean;", "snappedPointerPosition", "getSnappedPointerPosition", "updatePointerPositionIfNecessary", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "getPointerPositionAfterQuotePillAnimationProgress", "frameIndex", "", "numOfFrames", "(II)Ljava/lang/Double;", "getPointerPositionsBeforeAndAfterDrag", "Lkotlin/Pair;", "draggedPercentage", "", "getHapticFeedbacks", "", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderEvent$SliderHapticFeedback;", "oldPos", "newPos", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Price;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Quote;Lcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/android/indexes/models/db/IndexValue;Ljava/lang/Double;)Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDataState;", "equals", "other", "hashCode", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnPriceSliderDataState {
    public static final int $stable = 8;
    private final Double coarseIncrement;
    private final OptionsSimulatedReturnSliderViewState2 dragState;
    private final Quote equityQuote;
    private final Double fineIncrement;
    private final IndexValue indexValue;
    private final Quote initialEquityQuote;
    private final IndexValue initialIndexValue;
    private final Double initialPrice;
    private final UnderlyingQuote initialUnderlyingQuote;
    private final Boolean isInQuoteSnapRange;
    private final OptionsSimulatedReturnSliderLaunchMode.Price launchMode;
    private final OptionsSimulatedReturnLoggingState loggingState;
    private final Double maxPointerPosition;
    private final double minPointerPosition;
    private final Double pointerPosition;
    private final Double quotePosition;
    private final Double rangeLength;
    private final Double snapDistance;
    private final Double snappedPointerPosition;
    private final UnderlyingQuote underlyingQuote;

    public OptionsSimulatedReturnPriceSliderDataState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* renamed from: component8, reason: from getter */
    private final Double getPointerPosition() {
        return this.pointerPosition;
    }

    public static /* synthetic */ OptionsSimulatedReturnPriceSliderDataState copy$default(OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState, OptionsSimulatedReturnSliderViewState2 optionsSimulatedReturnSliderViewState2, OptionsSimulatedReturnSliderLaunchMode.Price price, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Quote quote, Quote quote2, IndexValue indexValue, IndexValue indexValue2, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            optionsSimulatedReturnSliderViewState2 = optionsSimulatedReturnPriceSliderDataState.dragState;
        }
        if ((i & 2) != 0) {
            price = optionsSimulatedReturnPriceSliderDataState.launchMode;
        }
        if ((i & 4) != 0) {
            optionsSimulatedReturnLoggingState = optionsSimulatedReturnPriceSliderDataState.loggingState;
        }
        if ((i & 8) != 0) {
            quote = optionsSimulatedReturnPriceSliderDataState.equityQuote;
        }
        if ((i & 16) != 0) {
            quote2 = optionsSimulatedReturnPriceSliderDataState.initialEquityQuote;
        }
        if ((i & 32) != 0) {
            indexValue = optionsSimulatedReturnPriceSliderDataState.indexValue;
        }
        if ((i & 64) != 0) {
            indexValue2 = optionsSimulatedReturnPriceSliderDataState.initialIndexValue;
        }
        if ((i & 128) != 0) {
            d = optionsSimulatedReturnPriceSliderDataState.pointerPosition;
        }
        IndexValue indexValue3 = indexValue2;
        Double d2 = d;
        Quote quote3 = quote2;
        IndexValue indexValue4 = indexValue;
        return optionsSimulatedReturnPriceSliderDataState.copy(optionsSimulatedReturnSliderViewState2, price, optionsSimulatedReturnLoggingState, quote, quote3, indexValue4, indexValue3, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionsSimulatedReturnSliderViewState2 getDragState() {
        return this.dragState;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionsSimulatedReturnSliderLaunchMode.Price getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    /* renamed from: component4, reason: from getter */
    public final Quote getEquityQuote() {
        return this.equityQuote;
    }

    /* renamed from: component5, reason: from getter */
    public final Quote getInitialEquityQuote() {
        return this.initialEquityQuote;
    }

    /* renamed from: component6, reason: from getter */
    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    /* renamed from: component7, reason: from getter */
    public final IndexValue getInitialIndexValue() {
        return this.initialIndexValue;
    }

    public final OptionsSimulatedReturnPriceSliderDataState copy(OptionsSimulatedReturnSliderViewState2 dragState, OptionsSimulatedReturnSliderLaunchMode.Price launchMode, OptionsSimulatedReturnLoggingState loggingState, Quote equityQuote, Quote initialEquityQuote, IndexValue indexValue, IndexValue initialIndexValue, Double pointerPosition) {
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        return new OptionsSimulatedReturnPriceSliderDataState(dragState, launchMode, loggingState, equityQuote, initialEquityQuote, indexValue, initialIndexValue, pointerPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnPriceSliderDataState)) {
            return false;
        }
        OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState = (OptionsSimulatedReturnPriceSliderDataState) other;
        return this.dragState == optionsSimulatedReturnPriceSliderDataState.dragState && Intrinsics.areEqual(this.launchMode, optionsSimulatedReturnPriceSliderDataState.launchMode) && Intrinsics.areEqual(this.loggingState, optionsSimulatedReturnPriceSliderDataState.loggingState) && Intrinsics.areEqual(this.equityQuote, optionsSimulatedReturnPriceSliderDataState.equityQuote) && Intrinsics.areEqual(this.initialEquityQuote, optionsSimulatedReturnPriceSliderDataState.initialEquityQuote) && Intrinsics.areEqual(this.indexValue, optionsSimulatedReturnPriceSliderDataState.indexValue) && Intrinsics.areEqual(this.initialIndexValue, optionsSimulatedReturnPriceSliderDataState.initialIndexValue) && Intrinsics.areEqual((Object) this.pointerPosition, (Object) optionsSimulatedReturnPriceSliderDataState.pointerPosition);
    }

    public int hashCode() {
        int iHashCode = this.dragState.hashCode() * 31;
        OptionsSimulatedReturnSliderLaunchMode.Price price = this.launchMode;
        int iHashCode2 = (iHashCode + (price == null ? 0 : price.hashCode())) * 31;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
        int iHashCode3 = (iHashCode2 + (optionsSimulatedReturnLoggingState == null ? 0 : optionsSimulatedReturnLoggingState.hashCode())) * 31;
        Quote quote = this.equityQuote;
        int iHashCode4 = (iHashCode3 + (quote == null ? 0 : quote.hashCode())) * 31;
        Quote quote2 = this.initialEquityQuote;
        int iHashCode5 = (iHashCode4 + (quote2 == null ? 0 : quote2.hashCode())) * 31;
        IndexValue indexValue = this.indexValue;
        int iHashCode6 = (iHashCode5 + (indexValue == null ? 0 : indexValue.hashCode())) * 31;
        IndexValue indexValue2 = this.initialIndexValue;
        int iHashCode7 = (iHashCode6 + (indexValue2 == null ? 0 : indexValue2.hashCode())) * 31;
        Double d = this.pointerPosition;
        return iHashCode7 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "OptionsSimulatedReturnPriceSliderDataState(dragState=" + this.dragState + ", launchMode=" + this.launchMode + ", loggingState=" + this.loggingState + ", equityQuote=" + this.equityQuote + ", initialEquityQuote=" + this.initialEquityQuote + ", indexValue=" + this.indexValue + ", initialIndexValue=" + this.initialIndexValue + ", pointerPosition=" + this.pointerPosition + ")";
    }

    public OptionsSimulatedReturnPriceSliderDataState(OptionsSimulatedReturnSliderViewState2 dragState, OptionsSimulatedReturnSliderLaunchMode.Price price, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Quote quote, Quote quote2, IndexValue indexValue, IndexValue indexValue2, Double d) {
        Double dValueOf;
        Boolean boolValueOf;
        BigDecimal currentValue;
        BigDecimal currentValue2;
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        this.dragState = dragState;
        this.launchMode = price;
        this.loggingState = optionsSimulatedReturnLoggingState;
        this.equityQuote = quote;
        this.initialEquityQuote = quote2;
        this.indexValue = indexValue;
        this.initialIndexValue = indexValue2;
        this.pointerPosition = d;
        UnderlyingQuote.Companion companion = UnderlyingQuote.INSTANCE;
        UnderlyingQuote underlyingQuote = companion.getUnderlyingQuote(quote, indexValue);
        this.underlyingQuote = underlyingQuote;
        UnderlyingQuote underlyingQuote2 = companion.getUnderlyingQuote(quote2, indexValue2);
        this.initialUnderlyingQuote = underlyingQuote2;
        Double dValueOf2 = (underlyingQuote == null || (currentValue2 = underlyingQuote.getCurrentValue()) == null) ? null : Double.valueOf(currentValue2.doubleValue());
        this.quotePosition = dValueOf2;
        Double dValueOf3 = (underlyingQuote2 == null || (currentValue = underlyingQuote2.getCurrentValue()) == null) ? null : Double.valueOf(RangesKt.coerceAtLeast(currentValue.doubleValue(), 0.0d));
        this.initialPrice = dValueOf3;
        if (dValueOf3 != null) {
            dValueOf = Double.valueOf(dValueOf3.doubleValue() <= 10.0d ? 0.01d : Math.pow(10.0d, ((int) Math.log10(dValueOf3.doubleValue())) - 3));
        } else {
            dValueOf = null;
        }
        this.fineIncrement = dValueOf;
        this.snapDistance = dValueOf != null ? Double.valueOf(dValueOf.doubleValue() * 0.2d) : null;
        Double dValueOf4 = dValueOf != null ? Double.valueOf(dValueOf.doubleValue() * 10) : null;
        this.coarseIncrement = dValueOf4;
        this.rangeLength = dValueOf != null ? Double.valueOf(dValueOf.doubleValue() * 35) : null;
        this.maxPointerPosition = (dValueOf3 == null || dValueOf4 == null) ? null : Double.valueOf(Math.ceil((dValueOf3.doubleValue() * 101) / dValueOf4.doubleValue()) * dValueOf4.doubleValue());
        if (d == null || dValueOf2 == null || dValueOf == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(Math.abs(d.doubleValue() - dValueOf2.doubleValue()) < dValueOf.doubleValue() * 0.2d);
        }
        this.isInQuoteSnapRange = boolValueOf;
        if (boolValueOf == null) {
            d = null;
        } else if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            d = dValueOf2;
        }
        this.snappedPointerPosition = d;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OptionsSimulatedReturnPriceSliderDataState(com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderViewState2 r2, com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode.Price r3, com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState r4, com.robinhood.models.p320db.Quote r5, com.robinhood.models.p320db.Quote r6, com.robinhood.android.indexes.models.p159db.IndexValue r7, com.robinhood.android.indexes.models.p159db.IndexValue r8, java.lang.Double r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderDragState r2 = com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderViewState2.FLINGING
        L6:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto Lc
            r3 = r0
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L11
            r4 = r0
        L11:
            r11 = r10 & 8
            if (r11 == 0) goto L16
            r5 = r0
        L16:
            r11 = r10 & 16
            if (r11 == 0) goto L1b
            r6 = r0
        L1b:
            r11 = r10 & 32
            if (r11 == 0) goto L20
            r7 = r0
        L20:
            r11 = r10 & 64
            if (r11 == 0) goto L25
            r8 = r0
        L25:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L33
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3c
        L33:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3c:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDataState.<init>(com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderDragState, com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode$Price, com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState, com.robinhood.models.db.Quote, com.robinhood.models.db.Quote, com.robinhood.android.indexes.models.db.IndexValue, com.robinhood.android.indexes.models.db.IndexValue, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final OptionsSimulatedReturnSliderViewState2 getDragState() {
        return this.dragState;
    }

    public final OptionsSimulatedReturnSliderLaunchMode.Price getLaunchMode() {
        return this.launchMode;
    }

    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    public final Quote getEquityQuote() {
        return this.equityQuote;
    }

    public final Quote getInitialEquityQuote() {
        return this.initialEquityQuote;
    }

    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    public final IndexValue getInitialIndexValue() {
        return this.initialIndexValue;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    public final Double getQuotePosition() {
        return this.quotePosition;
    }

    public final Double getFineIncrement() {
        return this.fineIncrement;
    }

    public final Double getCoarseIncrement() {
        return this.coarseIncrement;
    }

    public final Double getRangeLength() {
        return this.rangeLength;
    }

    public final double getMinPointerPosition() {
        return this.minPointerPosition;
    }

    public final Double getMaxPointerPosition() {
        return this.maxPointerPosition;
    }

    public final Double getSnappedPointerPosition() {
        return this.snappedPointerPosition;
    }

    public final double updatePointerPositionIfNecessary(BigDecimal price) {
        Double d;
        Intrinsics.checkNotNullParameter(price, "price");
        if (Intrinsics.areEqual(this.isInQuoteSnapRange, Boolean.TRUE) || (d = this.pointerPosition) == null) {
            return RangesKt.coerceAtLeast(price.doubleValue(), 0.0d);
        }
        return d.doubleValue();
    }

    public final Double getPointerPositionAfterQuotePillAnimationProgress(int frameIndex, int numOfFrames) {
        return OptionsSimulatedReturnSliderHelper.getPointerPositionInQuotePillAnimationProgress(frameIndex, numOfFrames, this.pointerPosition, this.maxPointerPosition, Double.valueOf(this.minPointerPosition), this.quotePosition);
    }

    public final Tuples2<Double, Double> getPointerPositionsBeforeAndAfterDrag(float draggedPercentage, OptionsSimulatedReturnSliderViewState2 dragState) {
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        return OptionsSimulatedReturnSliderHelper.getPointerPositionPairBeforeAndAfterDrag(draggedPercentage, dragState, this.pointerPosition, this.rangeLength, this.maxPointerPosition, Double.valueOf(this.minPointerPosition), this.snapDistance, this.quotePosition);
    }

    public final List<OptionsSimulatedReturnSliderEvent.SliderHapticFeedback> getHapticFeedbacks(Double oldPos, Double newPos) {
        if (this.rangeLength == null || this.fineIncrement == null || this.maxPointerPosition == null || newPos == null || oldPos == null || this.quotePosition == null) {
            return CollectionsKt.emptyList();
        }
        double dMin = Math.min(oldPos.doubleValue(), newPos.doubleValue());
        double dMax = Math.max(oldPos.doubleValue(), newPos.doubleValue());
        Double d = this.fineIncrement;
        double d2 = this.minPointerPosition;
        Double d3 = this.maxPointerPosition;
        ArrayList arrayList = new ArrayList();
        double dDoubleValue = d.doubleValue();
        double d4 = dMin % dDoubleValue;
        if (d4 != 0.0d && Math.signum(d4) != Math.signum(dDoubleValue)) {
            d4 += dDoubleValue;
        }
        for (double dDoubleValue2 = dMin - d4; dDoubleValue2 <= dMax; dDoubleValue2 += d.doubleValue()) {
            if (dDoubleValue2 <= this.quotePosition.doubleValue() && this.quotePosition.doubleValue() < d.doubleValue() + dDoubleValue2 && dMin < this.quotePosition.doubleValue() && this.quotePosition.doubleValue() <= dMax && this.quotePosition.doubleValue() >= d2 && this.quotePosition.doubleValue() <= d3.doubleValue()) {
                arrayList.add(new OptionsSimulatedReturnSliderEvent.SliderHapticFeedback(true));
            }
            if (dDoubleValue2 >= d2 && dDoubleValue2 <= d3.doubleValue() && dDoubleValue2 > dMin && Math.abs(this.quotePosition.doubleValue() - dDoubleValue2) > 1.0E-5d) {
                arrayList.add(new OptionsSimulatedReturnSliderEvent.SliderHapticFeedback(false));
            }
        }
        if (newPos.doubleValue() < oldPos.doubleValue()) {
            CollectionsKt.reverse(arrayList);
        }
        return arrayList;
    }
}
