package com.robinhood.android.trade.options.bidaskbar;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.aggregatequotes.ClientAggregateOptionStrategyQuote;
import com.robinhood.android.options.aggregatequotes.OptionQuoteAggregator;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarViewState3;
import com.robinhood.models.Decimals;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: OptionOrderBidAskBarDataState.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010#\u001a\u00020\u000b¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000bJ\r\u0010(\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0018J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010/\u001a\u00020*H\u0002J\b\u00100\u001a\u00020*H\u0002J\u0018\u00101\u001a\u00020*2\u0006\u00102\u001a\u0002032\b\u0010+\u001a\u0004\u0018\u00010,J0\u00104\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f052\u0006\u00102\u001a\u0002032\b\u0010+\u001a\u0004\u0018\u00010,J \u00106\u001a\u00020\u00032\u0006\u00102\u001a\u0002032\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u00107\u001a\u000208J \u00109\u001a\u00020\u00032\u0006\u00102\u001a\u0002032\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u00107\u001a\u000208J\u0018\u0010:\u001a\u00020\u00032\u0006\u00102\u001a\u0002032\b\u0010+\u001a\u0004\u0018\u00010,J \u0010;\u001a\u00020\u00032\u0006\u00102\u001a\u0002032\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u00107\u001a\u000208J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jh\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020*2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/OptionOrderBidAskBarDataState;", "", "debugBidText", "", "debugMarkText", "debugAskText", "lastSnapType", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarSnapType;", "canvasWidth", "", "lastTouchEvent", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;", "hapticFeedbackUiEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarSnapType;Ljava/lang/Float;Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;Lcom/robinhood/udf/UiEvent;)V", "getDebugBidText", "()Ljava/lang/String;", "getDebugMarkText", "getDebugAskText", "getLastSnapType", "()Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarSnapType;", "getCanvasWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getLastTouchEvent", "()Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;", "getHapticFeedbackUiEvent", "()Lcom/robinhood/udf/UiEvent;", "debugBidNum", "Ljava/math/BigDecimal;", "debugMarkNum", "debugAskNum", "getTouchPercent", "event", "(Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;)Ljava/lang/Float;", "getBidAskBarInputType", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarInputType;", "newEvent", "getTouchingPercent", "isBidMarkAskInOrder", "", "quote", "Lcom/robinhood/android/options/aggregatequotes/ClientAggregateOptionStrategyQuote;", "isSingleLegAndNoBidOrAsk", "isBidOrAskNegative", "isDebugBidMarkAskInOrder", "isDebugBidOrAskNegative", "allowUserInput", "experimentVariant", "Lcom/robinhood/android/optionsexperiment/Experiments$OptionsValuationTradeFlowM1Experiment$Variant;", "getBidMarkAsk", "Lkotlin/Triple;", "getBidValue", "resources", "Landroid/content/res/Resources;", "getMarkLabel", "getMarkValue", "getAskValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarSnapType;Ljava/lang/Float;Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;Lcom/robinhood/udf/UiEvent;)Lcom/robinhood/android/trade/options/bidaskbar/OptionOrderBidAskBarDataState;", "equals", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderBidAskBarDataState {
    public static final int $stable = 8;
    private final Float canvasWidth;
    private final BigDecimal debugAskNum;
    private final String debugAskText;
    private final BigDecimal debugBidNum;
    private final String debugBidText;
    private final BigDecimal debugMarkNum;
    private final String debugMarkText;
    private final UiEvent<Unit> hapticFeedbackUiEvent;
    private final OptionOrderBidAskBarViewState4 lastSnapType;
    private final OptionOrderBidAskBarViewState3 lastTouchEvent;

    /* compiled from: OptionOrderBidAskBarDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Experiments.OptionsValuationTradeFlowM1Experiment.Variant.values().length];
            try {
                iArr[Experiments.OptionsValuationTradeFlowM1Experiment.Variant.CONTROL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Experiments.OptionsValuationTradeFlowM1Experiment.Variant.MEMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Experiments.OptionsValuationTradeFlowM1Experiment.Variant.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OptionOrderBidAskBarDataState() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ OptionOrderBidAskBarDataState copy$default(OptionOrderBidAskBarDataState optionOrderBidAskBarDataState, String str, String str2, String str3, OptionOrderBidAskBarViewState4 optionOrderBidAskBarViewState4, Float f, OptionOrderBidAskBarViewState3 optionOrderBidAskBarViewState3, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOrderBidAskBarDataState.debugBidText;
        }
        if ((i & 2) != 0) {
            str2 = optionOrderBidAskBarDataState.debugMarkText;
        }
        if ((i & 4) != 0) {
            str3 = optionOrderBidAskBarDataState.debugAskText;
        }
        if ((i & 8) != 0) {
            optionOrderBidAskBarViewState4 = optionOrderBidAskBarDataState.lastSnapType;
        }
        if ((i & 16) != 0) {
            f = optionOrderBidAskBarDataState.canvasWidth;
        }
        if ((i & 32) != 0) {
            optionOrderBidAskBarViewState3 = optionOrderBidAskBarDataState.lastTouchEvent;
        }
        if ((i & 64) != 0) {
            uiEvent = optionOrderBidAskBarDataState.hapticFeedbackUiEvent;
        }
        OptionOrderBidAskBarViewState3 optionOrderBidAskBarViewState32 = optionOrderBidAskBarViewState3;
        UiEvent uiEvent2 = uiEvent;
        Float f2 = f;
        String str4 = str3;
        return optionOrderBidAskBarDataState.copy(str, str2, str4, optionOrderBidAskBarViewState4, f2, optionOrderBidAskBarViewState32, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDebugBidText() {
        return this.debugBidText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDebugMarkText() {
        return this.debugMarkText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDebugAskText() {
        return this.debugAskText;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionOrderBidAskBarViewState4 getLastSnapType() {
        return this.lastSnapType;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getCanvasWidth() {
        return this.canvasWidth;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionOrderBidAskBarViewState3 getLastTouchEvent() {
        return this.lastTouchEvent;
    }

    public final UiEvent<Unit> component7() {
        return this.hapticFeedbackUiEvent;
    }

    public final OptionOrderBidAskBarDataState copy(String debugBidText, String debugMarkText, String debugAskText, OptionOrderBidAskBarViewState4 lastSnapType, Float canvasWidth, OptionOrderBidAskBarViewState3 lastTouchEvent, UiEvent<Unit> hapticFeedbackUiEvent) {
        return new OptionOrderBidAskBarDataState(debugBidText, debugMarkText, debugAskText, lastSnapType, canvasWidth, lastTouchEvent, hapticFeedbackUiEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderBidAskBarDataState)) {
            return false;
        }
        OptionOrderBidAskBarDataState optionOrderBidAskBarDataState = (OptionOrderBidAskBarDataState) other;
        return Intrinsics.areEqual(this.debugBidText, optionOrderBidAskBarDataState.debugBidText) && Intrinsics.areEqual(this.debugMarkText, optionOrderBidAskBarDataState.debugMarkText) && Intrinsics.areEqual(this.debugAskText, optionOrderBidAskBarDataState.debugAskText) && this.lastSnapType == optionOrderBidAskBarDataState.lastSnapType && Intrinsics.areEqual((Object) this.canvasWidth, (Object) optionOrderBidAskBarDataState.canvasWidth) && Intrinsics.areEqual(this.lastTouchEvent, optionOrderBidAskBarDataState.lastTouchEvent) && Intrinsics.areEqual(this.hapticFeedbackUiEvent, optionOrderBidAskBarDataState.hapticFeedbackUiEvent);
    }

    public int hashCode() {
        String str = this.debugBidText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.debugMarkText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.debugAskText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OptionOrderBidAskBarViewState4 optionOrderBidAskBarViewState4 = this.lastSnapType;
        int iHashCode4 = (iHashCode3 + (optionOrderBidAskBarViewState4 == null ? 0 : optionOrderBidAskBarViewState4.hashCode())) * 31;
        Float f = this.canvasWidth;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        OptionOrderBidAskBarViewState3 optionOrderBidAskBarViewState3 = this.lastTouchEvent;
        int iHashCode6 = (iHashCode5 + (optionOrderBidAskBarViewState3 == null ? 0 : optionOrderBidAskBarViewState3.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.hapticFeedbackUiEvent;
        return iHashCode6 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "OptionOrderBidAskBarDataState(debugBidText=" + this.debugBidText + ", debugMarkText=" + this.debugMarkText + ", debugAskText=" + this.debugAskText + ", lastSnapType=" + this.lastSnapType + ", canvasWidth=" + this.canvasWidth + ", lastTouchEvent=" + this.lastTouchEvent + ", hapticFeedbackUiEvent=" + this.hapticFeedbackUiEvent + ")";
    }

    public OptionOrderBidAskBarDataState(String str, String str2, String str3, OptionOrderBidAskBarViewState4 optionOrderBidAskBarViewState4, Float f, OptionOrderBidAskBarViewState3 optionOrderBidAskBarViewState3, UiEvent<Unit> uiEvent) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        this.debugBidText = str;
        this.debugMarkText = str2;
        this.debugAskText = str3;
        this.lastSnapType = optionOrderBidAskBarViewState4;
        this.canvasWidth = f;
        this.lastTouchEvent = optionOrderBidAskBarViewState3;
        this.hapticFeedbackUiEvent = uiEvent;
        BigDecimal bigDecimal3 = null;
        try {
            bigDecimal = new BigDecimal(str);
        } catch (Exception unused) {
            bigDecimal = null;
        }
        this.debugBidNum = bigDecimal;
        try {
            bigDecimal2 = new BigDecimal(this.debugMarkText);
        } catch (Exception unused2) {
            bigDecimal2 = null;
        }
        this.debugMarkNum = bigDecimal2;
        try {
            bigDecimal3 = new BigDecimal(this.debugAskText);
        } catch (Exception unused3) {
        }
        this.debugAskNum = bigDecimal3;
    }

    public /* synthetic */ OptionOrderBidAskBarDataState(String str, String str2, String str3, OptionOrderBidAskBarViewState4 optionOrderBidAskBarViewState4, Float f, OptionOrderBidAskBarViewState3 optionOrderBidAskBarViewState3, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : optionOrderBidAskBarViewState4, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : optionOrderBidAskBarViewState3, (i & 64) != 0 ? null : uiEvent);
    }

    public final String getDebugBidText() {
        return this.debugBidText;
    }

    public final String getDebugMarkText() {
        return this.debugMarkText;
    }

    public final String getDebugAskText() {
        return this.debugAskText;
    }

    public final OptionOrderBidAskBarViewState4 getLastSnapType() {
        return this.lastSnapType;
    }

    public final Float getCanvasWidth() {
        return this.canvasWidth;
    }

    public final OptionOrderBidAskBarViewState3 getLastTouchEvent() {
        return this.lastTouchEvent;
    }

    public final UiEvent<Unit> getHapticFeedbackUiEvent() {
        return this.hapticFeedbackUiEvent;
    }

    public final Float getTouchPercent(OptionOrderBidAskBarViewState3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.canvasWidth == null || r0.floatValue() < 0.001d) {
            return null;
        }
        if (event instanceof OptionOrderBidAskBarViewState3.Down) {
            return Float.valueOf(RangesKt.coerceAtMost(RangesKt.coerceAtLeast(((OptionOrderBidAskBarViewState3.Down) event).getX() / this.canvasWidth.floatValue(), 0.0f), 1.0f));
        }
        if (event instanceof OptionOrderBidAskBarViewState3.Move) {
            return Float.valueOf(RangesKt.coerceAtMost(RangesKt.coerceAtLeast(((OptionOrderBidAskBarViewState3.Move) event).getX() / this.canvasWidth.floatValue(), 0.0f), 1.0f));
        }
        if (event instanceof OptionOrderBidAskBarViewState3.Up) {
            return Float.valueOf(RangesKt.coerceAtMost(RangesKt.coerceAtLeast(((OptionOrderBidAskBarViewState3.Up) event).getX() / this.canvasWidth.floatValue(), 0.0f), 1.0f));
        }
        if (Intrinsics.areEqual(event, OptionOrderBidAskBarViewState3.Other.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final OptionOrderBidAskBarViewState2 getBidAskBarInputType(OptionOrderBidAskBarViewState3 newEvent) {
        Intrinsics.checkNotNullParameter(newEvent, "newEvent");
        if ((this.lastTouchEvent instanceof OptionOrderBidAskBarViewState3.Down) && (newEvent instanceof OptionOrderBidAskBarViewState3.Up)) {
            return OptionOrderBidAskBarViewState2.TAP;
        }
        return OptionOrderBidAskBarViewState2.DRAG;
    }

    public final Float getTouchingPercent() {
        OptionOrderBidAskBarViewState3 optionOrderBidAskBarViewState3 = this.lastTouchEvent;
        if (optionOrderBidAskBarViewState3 == null || !optionOrderBidAskBarViewState3.isTouching()) {
            return null;
        }
        return getTouchPercent(this.lastTouchEvent);
    }

    private final boolean isBidMarkAskInOrder(ClientAggregateOptionStrategyQuote quote) {
        return quote.getBidAsk().getBid().compareTo(quote.getBidAsk().getAsk()) <= 0 && quote.getBidAsk().getBid().compareTo(quote.getAdjustedMarkPrice().getRawValue()) <= 0 && quote.getAdjustedMarkPrice().getRawValue().compareTo(quote.getBidAsk().getAsk()) <= 0;
    }

    private final boolean isSingleLegAndNoBidOrAsk(ClientAggregateOptionStrategyQuote quote) {
        Integer bidSize = quote.getBidSize();
        if (bidSize != null && bidSize.intValue() == 0) {
            return true;
        }
        Integer askSize = quote.getAskSize();
        return askSize != null && askSize.intValue() == 0;
    }

    private final boolean isBidOrAskNegative(ClientAggregateOptionStrategyQuote quote) {
        BigDecimal bid = quote.getBidAsk().getBid();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        return bid.compareTo(bigDecimal) < 0 || quote.getBidAsk().getAsk().compareTo(bigDecimal) < 0;
    }

    private final boolean isDebugBidMarkAskInOrder() {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2 = this.debugBidNum;
        return bigDecimal2 != null && (bigDecimal = this.debugAskNum) != null && this.debugMarkNum != null && bigDecimal2.compareTo(bigDecimal) <= 0 && this.debugBidNum.compareTo(this.debugMarkNum) <= 0 && this.debugMarkNum.compareTo(this.debugAskNum) <= 0;
    }

    private final boolean isDebugBidOrAskNegative() {
        BigDecimal bigDecimal = this.debugBidNum;
        if (bigDecimal == null || this.debugAskNum == null) {
            return false;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        return bigDecimal.compareTo(bigDecimal2) < 0 || this.debugAskNum.compareTo(bigDecimal2) < 0;
    }

    public final boolean allowUserInput(Experiments.OptionsValuationTradeFlowM1Experiment.Variant experimentVariant, ClientAggregateOptionStrategyQuote quote) {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        int i = WhenMappings.$EnumSwitchMapping$0[experimentVariant.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return (quote == null || isSingleLegAndNoBidOrAsk(quote) || !isBidMarkAskInOrder(quote) || isBidOrAskNegative(quote)) ? false : true;
        }
        if (i == 3) {
            return (this.debugBidNum == null || this.debugAskNum == null || this.debugMarkNum == null || !isDebugBidMarkAskInOrder() || isDebugBidOrAskNegative()) ? false : true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Tuples3<BigDecimal, BigDecimal, BigDecimal> getBidMarkAsk(Experiments.OptionsValuationTradeFlowM1Experiment.Variant experimentVariant, ClientAggregateOptionStrategyQuote quote) {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        if (experimentVariant == Experiments.OptionsValuationTradeFlowM1Experiment.Variant.DEBUG) {
            return new Tuples3<>(this.debugBidNum, this.debugMarkNum, this.debugAskNum);
        }
        if (quote == null) {
            return new Tuples3<>(null, null, null);
        }
        return new Tuples3<>(quote.getBidAsk().getBid(), quote.getAdjustedMarkPrice().getRawValue(), quote.getBidAsk().getAsk());
    }

    public final String getBidValue(Experiments.OptionsValuationTradeFlowM1Experiment.Variant experimentVariant, ClientAggregateOptionStrategyQuote quote, Resources resources) throws Resources.NotFoundException {
        OptionQuoteAggregator.BidAsk bidAsk;
        Integer bidSize;
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant = Experiments.OptionsValuationTradeFlowM1Experiment.Variant.DEBUG;
        if (experimentVariant == variant && this.debugBidNum != null) {
            return Formats.getPriceFormat().format(this.debugBidNum);
        }
        if (experimentVariant == variant && this.debugAskNum != null) {
            String string2 = resources.getString(C29757R.string.option_order_bid_ask_bar_no_bid_error);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (experimentVariant == variant && this.debugAskNum == null) {
            String string3 = resources.getString(C29757R.string.option_order_bid_ask_bar_no_quote_error);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant2 = Experiments.OptionsValuationTradeFlowM1Experiment.Variant.MEMBER;
        if (experimentVariant == variant2 && quote == null) {
            String string4 = resources.getString(C29757R.string.option_order_bid_ask_bar_no_quote_error);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (experimentVariant != variant2 || quote == null || (bidSize = quote.getBidSize()) == null || bidSize.intValue() != 0) {
            return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (quote == null || (bidAsk = quote.getBidAsk()) == null) ? null : bidAsk.getBid(), null, 2, null);
        }
        String string5 = resources.getString(C29757R.string.option_order_bid_ask_bar_no_bid_error);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        return string5;
    }

    public final String getMarkLabel(Experiments.OptionsValuationTradeFlowM1Experiment.Variant experimentVariant, ClientAggregateOptionStrategyQuote quote, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant = Experiments.OptionsValuationTradeFlowM1Experiment.Variant.DEBUG;
        if (experimentVariant == variant && (this.debugBidNum == null || this.debugAskNum == null || this.debugMarkNum == null)) {
            return "";
        }
        if (experimentVariant == variant && !isDebugBidMarkAskInOrder()) {
            return "";
        }
        Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant2 = Experiments.OptionsValuationTradeFlowM1Experiment.Variant.MEMBER;
        if (experimentVariant == variant2 && quote == null) {
            return "";
        }
        if (experimentVariant == variant2 && quote != null && isSingleLegAndNoBidOrAsk(quote)) {
            return "";
        }
        if (experimentVariant == variant2 && quote != null && !isBidMarkAskInOrder(quote)) {
            return "";
        }
        String string2 = resources.getString(C29757R.string.option_order_mark_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final String getMarkValue(Experiments.OptionsValuationTradeFlowM1Experiment.Variant experimentVariant, ClientAggregateOptionStrategyQuote quote) {
        Decimals adjustedMarkPrice;
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant = Experiments.OptionsValuationTradeFlowM1Experiment.Variant.DEBUG;
        if (experimentVariant == variant && (this.debugBidNum == null || this.debugAskNum == null || this.debugMarkNum == null)) {
            return "";
        }
        if (experimentVariant == variant && !isDebugBidMarkAskInOrder()) {
            return "";
        }
        if (experimentVariant == variant && this.debugMarkNum != null) {
            return Formats.getPriceFormat().format(this.debugMarkNum);
        }
        Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant2 = Experiments.OptionsValuationTradeFlowM1Experiment.Variant.MEMBER;
        if (experimentVariant == variant2 && quote == null) {
            return "";
        }
        if (experimentVariant == variant2 && quote != null && isSingleLegAndNoBidOrAsk(quote)) {
            return "";
        }
        if (experimentVariant != variant2 || quote == null || isBidMarkAskInOrder(quote)) {
            return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (quote == null || (adjustedMarkPrice = quote.getAdjustedMarkPrice()) == null) ? null : adjustedMarkPrice.getRawValue(), null, 2, null);
        }
        return "";
    }

    public final String getAskValue(Experiments.OptionsValuationTradeFlowM1Experiment.Variant experimentVariant, ClientAggregateOptionStrategyQuote quote, Resources resources) throws Resources.NotFoundException {
        OptionQuoteAggregator.BidAsk bidAsk;
        Integer askSize;
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant = Experiments.OptionsValuationTradeFlowM1Experiment.Variant.DEBUG;
        if (experimentVariant == variant && this.debugAskNum != null) {
            return Formats.getPriceFormat().format(this.debugAskNum);
        }
        if (experimentVariant == variant && this.debugBidNum != null) {
            String string2 = resources.getString(C29757R.string.option_order_bid_ask_bar_no_ask_error);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (experimentVariant == variant && this.debugBidNum == null) {
            return "";
        }
        Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant2 = Experiments.OptionsValuationTradeFlowM1Experiment.Variant.MEMBER;
        if (experimentVariant == variant2 && quote == null) {
            return "";
        }
        if (experimentVariant != variant2 || quote == null || (askSize = quote.getAskSize()) == null || askSize.intValue() != 0) {
            return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (quote == null || (bidAsk = quote.getBidAsk()) == null) ? null : bidAsk.getAsk(), null, 2, null);
        }
        String string3 = resources.getString(C29757R.string.option_order_bid_ask_bar_no_ask_error);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }
}
