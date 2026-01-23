package com.robinhood.android.trade.options.bidaskbar;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderBidAskBarViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0089\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001J\u0013\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/OptionOrderBidAskBarViewState;", "", "bidValue", "", "markLabel", "markValue", "askValue", "limitPriceTickState", "Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState;", "showMarkTick", "", "showDebug", "debugBidText", "debugMarkText", "debugAskText", "canvasWidth", "", "hapticFeedbackUiEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/robinhood/udf/UiEvent;)V", "getBidValue", "()Ljava/lang/String;", "getMarkLabel", "getMarkValue", "getAskValue", "getLimitPriceTickState", "()Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState;", "getShowMarkTick", "()Z", "getShowDebug", "getDebugBidText", "getDebugMarkText", "getDebugAskText", "getCanvasWidth", "()F", "getHapticFeedbackUiEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderBidAskBarViewState {
    public static final int $stable = 8;
    private final String askValue;
    private final String bidValue;
    private final float canvasWidth;
    private final String debugAskText;
    private final String debugBidText;
    private final String debugMarkText;
    private final UiEvent<Unit> hapticFeedbackUiEvent;
    private final OptionOrderBidAskBarViewState5 limitPriceTickState;
    private final String markLabel;
    private final String markValue;
    private final boolean showDebug;
    private final boolean showMarkTick;

    public static /* synthetic */ OptionOrderBidAskBarViewState copy$default(OptionOrderBidAskBarViewState optionOrderBidAskBarViewState, String str, String str2, String str3, String str4, OptionOrderBidAskBarViewState5 optionOrderBidAskBarViewState5, boolean z, boolean z2, String str5, String str6, String str7, float f, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOrderBidAskBarViewState.bidValue;
        }
        if ((i & 2) != 0) {
            str2 = optionOrderBidAskBarViewState.markLabel;
        }
        if ((i & 4) != 0) {
            str3 = optionOrderBidAskBarViewState.markValue;
        }
        if ((i & 8) != 0) {
            str4 = optionOrderBidAskBarViewState.askValue;
        }
        if ((i & 16) != 0) {
            optionOrderBidAskBarViewState5 = optionOrderBidAskBarViewState.limitPriceTickState;
        }
        if ((i & 32) != 0) {
            z = optionOrderBidAskBarViewState.showMarkTick;
        }
        if ((i & 64) != 0) {
            z2 = optionOrderBidAskBarViewState.showDebug;
        }
        if ((i & 128) != 0) {
            str5 = optionOrderBidAskBarViewState.debugBidText;
        }
        if ((i & 256) != 0) {
            str6 = optionOrderBidAskBarViewState.debugMarkText;
        }
        if ((i & 512) != 0) {
            str7 = optionOrderBidAskBarViewState.debugAskText;
        }
        if ((i & 1024) != 0) {
            f = optionOrderBidAskBarViewState.canvasWidth;
        }
        if ((i & 2048) != 0) {
            uiEvent = optionOrderBidAskBarViewState.hapticFeedbackUiEvent;
        }
        float f2 = f;
        UiEvent uiEvent2 = uiEvent;
        String str8 = str6;
        String str9 = str7;
        boolean z3 = z2;
        String str10 = str5;
        OptionOrderBidAskBarViewState5 optionOrderBidAskBarViewState52 = optionOrderBidAskBarViewState5;
        boolean z4 = z;
        return optionOrderBidAskBarViewState.copy(str, str2, str3, str4, optionOrderBidAskBarViewState52, z4, z3, str10, str8, str9, f2, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBidValue() {
        return this.bidValue;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDebugAskText() {
        return this.debugAskText;
    }

    /* renamed from: component11, reason: from getter */
    public final float getCanvasWidth() {
        return this.canvasWidth;
    }

    public final UiEvent<Unit> component12() {
        return this.hapticFeedbackUiEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMarkLabel() {
        return this.markLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMarkValue() {
        return this.markValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAskValue() {
        return this.askValue;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionOrderBidAskBarViewState5 getLimitPriceTickState() {
        return this.limitPriceTickState;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowMarkTick() {
        return this.showMarkTick;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowDebug() {
        return this.showDebug;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDebugBidText() {
        return this.debugBidText;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDebugMarkText() {
        return this.debugMarkText;
    }

    public final OptionOrderBidAskBarViewState copy(String bidValue, String markLabel, String markValue, String askValue, OptionOrderBidAskBarViewState5 limitPriceTickState, boolean showMarkTick, boolean showDebug, String debugBidText, String debugMarkText, String debugAskText, float canvasWidth, UiEvent<Unit> hapticFeedbackUiEvent) {
        Intrinsics.checkNotNullParameter(bidValue, "bidValue");
        Intrinsics.checkNotNullParameter(markLabel, "markLabel");
        Intrinsics.checkNotNullParameter(markValue, "markValue");
        Intrinsics.checkNotNullParameter(askValue, "askValue");
        Intrinsics.checkNotNullParameter(limitPriceTickState, "limitPriceTickState");
        Intrinsics.checkNotNullParameter(debugBidText, "debugBidText");
        Intrinsics.checkNotNullParameter(debugMarkText, "debugMarkText");
        Intrinsics.checkNotNullParameter(debugAskText, "debugAskText");
        return new OptionOrderBidAskBarViewState(bidValue, markLabel, markValue, askValue, limitPriceTickState, showMarkTick, showDebug, debugBidText, debugMarkText, debugAskText, canvasWidth, hapticFeedbackUiEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderBidAskBarViewState)) {
            return false;
        }
        OptionOrderBidAskBarViewState optionOrderBidAskBarViewState = (OptionOrderBidAskBarViewState) other;
        return Intrinsics.areEqual(this.bidValue, optionOrderBidAskBarViewState.bidValue) && Intrinsics.areEqual(this.markLabel, optionOrderBidAskBarViewState.markLabel) && Intrinsics.areEqual(this.markValue, optionOrderBidAskBarViewState.markValue) && Intrinsics.areEqual(this.askValue, optionOrderBidAskBarViewState.askValue) && Intrinsics.areEqual(this.limitPriceTickState, optionOrderBidAskBarViewState.limitPriceTickState) && this.showMarkTick == optionOrderBidAskBarViewState.showMarkTick && this.showDebug == optionOrderBidAskBarViewState.showDebug && Intrinsics.areEqual(this.debugBidText, optionOrderBidAskBarViewState.debugBidText) && Intrinsics.areEqual(this.debugMarkText, optionOrderBidAskBarViewState.debugMarkText) && Intrinsics.areEqual(this.debugAskText, optionOrderBidAskBarViewState.debugAskText) && Float.compare(this.canvasWidth, optionOrderBidAskBarViewState.canvasWidth) == 0 && Intrinsics.areEqual(this.hapticFeedbackUiEvent, optionOrderBidAskBarViewState.hapticFeedbackUiEvent);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((this.bidValue.hashCode() * 31) + this.markLabel.hashCode()) * 31) + this.markValue.hashCode()) * 31) + this.askValue.hashCode()) * 31) + this.limitPriceTickState.hashCode()) * 31) + Boolean.hashCode(this.showMarkTick)) * 31) + Boolean.hashCode(this.showDebug)) * 31) + this.debugBidText.hashCode()) * 31) + this.debugMarkText.hashCode()) * 31) + this.debugAskText.hashCode()) * 31) + Float.hashCode(this.canvasWidth)) * 31;
        UiEvent<Unit> uiEvent = this.hapticFeedbackUiEvent;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "OptionOrderBidAskBarViewState(bidValue=" + this.bidValue + ", markLabel=" + this.markLabel + ", markValue=" + this.markValue + ", askValue=" + this.askValue + ", limitPriceTickState=" + this.limitPriceTickState + ", showMarkTick=" + this.showMarkTick + ", showDebug=" + this.showDebug + ", debugBidText=" + this.debugBidText + ", debugMarkText=" + this.debugMarkText + ", debugAskText=" + this.debugAskText + ", canvasWidth=" + this.canvasWidth + ", hapticFeedbackUiEvent=" + this.hapticFeedbackUiEvent + ")";
    }

    public OptionOrderBidAskBarViewState(String bidValue, String markLabel, String markValue, String askValue, OptionOrderBidAskBarViewState5 limitPriceTickState, boolean z, boolean z2, String debugBidText, String debugMarkText, String debugAskText, float f, UiEvent<Unit> uiEvent) {
        Intrinsics.checkNotNullParameter(bidValue, "bidValue");
        Intrinsics.checkNotNullParameter(markLabel, "markLabel");
        Intrinsics.checkNotNullParameter(markValue, "markValue");
        Intrinsics.checkNotNullParameter(askValue, "askValue");
        Intrinsics.checkNotNullParameter(limitPriceTickState, "limitPriceTickState");
        Intrinsics.checkNotNullParameter(debugBidText, "debugBidText");
        Intrinsics.checkNotNullParameter(debugMarkText, "debugMarkText");
        Intrinsics.checkNotNullParameter(debugAskText, "debugAskText");
        this.bidValue = bidValue;
        this.markLabel = markLabel;
        this.markValue = markValue;
        this.askValue = askValue;
        this.limitPriceTickState = limitPriceTickState;
        this.showMarkTick = z;
        this.showDebug = z2;
        this.debugBidText = debugBidText;
        this.debugMarkText = debugMarkText;
        this.debugAskText = debugAskText;
        this.canvasWidth = f;
        this.hapticFeedbackUiEvent = uiEvent;
    }

    public final String getBidValue() {
        return this.bidValue;
    }

    public final String getMarkLabel() {
        return this.markLabel;
    }

    public final String getMarkValue() {
        return this.markValue;
    }

    public final String getAskValue() {
        return this.askValue;
    }

    public final OptionOrderBidAskBarViewState5 getLimitPriceTickState() {
        return this.limitPriceTickState;
    }

    public final boolean getShowMarkTick() {
        return this.showMarkTick;
    }

    public final boolean getShowDebug() {
        return this.showDebug;
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

    public final float getCanvasWidth() {
        return this.canvasWidth;
    }

    public final UiEvent<Unit> getHapticFeedbackUiEvent() {
        return this.hapticFeedbackUiEvent;
    }
}
