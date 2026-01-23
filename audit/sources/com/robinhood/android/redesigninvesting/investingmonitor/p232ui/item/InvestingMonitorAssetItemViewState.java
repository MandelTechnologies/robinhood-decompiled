package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.item;

import android.os.Parcelable;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingMonitorAssetViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemViewState;", "", "assetQuote", "Lcom/robinhood/android/redesign/model/AssetQuote;", "futureChart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "<init>", "(Lcom/robinhood/android/redesign/model/AssetQuote;Lcom/robinhood/models/serverdriven/experimental/api/Chart;)V", "getAssetQuote", "()Lcom/robinhood/android/redesign/model/AssetQuote;", "getFutureChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "formattedPercentChange", "", "getFormattedPercentChange", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InvestingMonitorAssetItemViewState {
    private final AssetQuote assetQuote;
    private final Chart<Parcelable> futureChart;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final NumberFormatter percentFormatter = Formats.getNoSignWithHundredthDecimalPercentFormat();

    /* JADX WARN: Multi-variable type inference failed */
    public InvestingMonitorAssetItemViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestingMonitorAssetItemViewState copy$default(InvestingMonitorAssetItemViewState investingMonitorAssetItemViewState, AssetQuote assetQuote, Chart chart, int i, Object obj) {
        if ((i & 1) != 0) {
            assetQuote = investingMonitorAssetItemViewState.assetQuote;
        }
        if ((i & 2) != 0) {
            chart = investingMonitorAssetItemViewState.futureChart;
        }
        return investingMonitorAssetItemViewState.copy(assetQuote, chart);
    }

    /* renamed from: component1, reason: from getter */
    public final AssetQuote getAssetQuote() {
        return this.assetQuote;
    }

    public final Chart<Parcelable> component2() {
        return this.futureChart;
    }

    public final InvestingMonitorAssetItemViewState copy(AssetQuote assetQuote, Chart<? extends Parcelable> futureChart) {
        return new InvestingMonitorAssetItemViewState(assetQuote, futureChart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestingMonitorAssetItemViewState)) {
            return false;
        }
        InvestingMonitorAssetItemViewState investingMonitorAssetItemViewState = (InvestingMonitorAssetItemViewState) other;
        return Intrinsics.areEqual(this.assetQuote, investingMonitorAssetItemViewState.assetQuote) && Intrinsics.areEqual(this.futureChart, investingMonitorAssetItemViewState.futureChart);
    }

    public int hashCode() {
        AssetQuote assetQuote = this.assetQuote;
        int iHashCode = (assetQuote == null ? 0 : assetQuote.hashCode()) * 31;
        Chart<Parcelable> chart = this.futureChart;
        return iHashCode + (chart != null ? chart.hashCode() : 0);
    }

    public String toString() {
        return "InvestingMonitorAssetItemViewState(assetQuote=" + this.assetQuote + ", futureChart=" + this.futureChart + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvestingMonitorAssetItemViewState(AssetQuote assetQuote, Chart<? extends Parcelable> chart) {
        this.assetQuote = assetQuote;
        this.futureChart = chart;
    }

    public /* synthetic */ InvestingMonitorAssetItemViewState(AssetQuote assetQuote, Chart chart, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : assetQuote, (i & 2) != 0 ? null : chart);
    }

    public final AssetQuote getAssetQuote() {
        return this.assetQuote;
    }

    public final Chart<Parcelable> getFutureChart() {
        return this.futureChart;
    }

    public final String getFormattedPercentChange() {
        AssetQuote assetQuote = this.assetQuote;
        if (assetQuote != null) {
            return percentFormatter.format(assetQuote.getPercentChange());
        }
        return null;
    }

    /* compiled from: InvestingMonitorAssetViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemViewState$Companion;", "", "<init>", "()V", "percentFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getPercentFormatter", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NumberFormatter getPercentFormatter() {
            return InvestingMonitorAssetItemViewState.percentFormatter;
        }
    }
}
