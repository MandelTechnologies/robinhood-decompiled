package com.robinhood.android.chart.blackwidowadvancedchart.duxo;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvanceChartEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/ChartDialog;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartEvent;", "title", "Lcom/robinhood/utils/resource/StringResource;", CarResultComposable2.BODY, "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getBody", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChartDialog implements AdvanceChartEvent {
    public static final int $stable = StringResource.$stable;
    private final StringResource body;
    private final StringResource title;

    public static /* synthetic */ ChartDialog copy$default(ChartDialog chartDialog, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = chartDialog.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = chartDialog.body;
        }
        return chartDialog.copy(stringResource, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getBody() {
        return this.body;
    }

    public final ChartDialog copy(StringResource title, StringResource body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new ChartDialog(title, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDialog)) {
            return false;
        }
        ChartDialog chartDialog = (ChartDialog) other;
        return Intrinsics.areEqual(this.title, chartDialog.title) && Intrinsics.areEqual(this.body, chartDialog.body);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.body.hashCode();
    }

    public String toString() {
        return "ChartDialog(title=" + this.title + ", body=" + this.body + ")";
    }

    public ChartDialog(StringResource title, StringResource body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.title = title;
        this.body = body;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getBody() {
        return this.body;
    }
}
