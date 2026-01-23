package com.robinhood.android.chart.blackwidowadvancedchart;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlackWidowAdvancedChartViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/QuoteState;", "", "currentPrice", "Lcom/robinhood/utils/resource/StringResource;", "percentChange", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getCurrentPrice", "()Lcom/robinhood/utils/resource/StringResource;", "getPercentChange", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class QuoteState {
    public static final int $stable = StringResource.$stable;
    private final StringResource currentPrice;
    private final StringResource percentChange;

    public static /* synthetic */ QuoteState copy$default(QuoteState quoteState, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = quoteState.currentPrice;
        }
        if ((i & 2) != 0) {
            stringResource2 = quoteState.percentChange;
        }
        return quoteState.copy(stringResource, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getCurrentPrice() {
        return this.currentPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getPercentChange() {
        return this.percentChange;
    }

    public final QuoteState copy(StringResource currentPrice, StringResource percentChange) {
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        Intrinsics.checkNotNullParameter(percentChange, "percentChange");
        return new QuoteState(currentPrice, percentChange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuoteState)) {
            return false;
        }
        QuoteState quoteState = (QuoteState) other;
        return Intrinsics.areEqual(this.currentPrice, quoteState.currentPrice) && Intrinsics.areEqual(this.percentChange, quoteState.percentChange);
    }

    public int hashCode() {
        return (this.currentPrice.hashCode() * 31) + this.percentChange.hashCode();
    }

    public String toString() {
        return "QuoteState(currentPrice=" + this.currentPrice + ", percentChange=" + this.percentChange + ")";
    }

    public QuoteState(StringResource currentPrice, StringResource percentChange) {
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        Intrinsics.checkNotNullParameter(percentChange, "percentChange");
        this.currentPrice = currentPrice;
        this.percentChange = percentChange;
    }

    public final StringResource getCurrentPrice() {
        return this.currentPrice;
    }

    public final StringResource getPercentChange() {
        return this.percentChange;
    }
}
