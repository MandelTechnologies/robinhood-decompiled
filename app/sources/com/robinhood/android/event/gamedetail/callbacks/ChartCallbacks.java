package com.robinhood.android.event.gamedetail.callbacks;

import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import kotlin.Metadata;

/* compiled from: ChartCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;", "", "onChartScrubbed", "", "point", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "onSpanSelected", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface ChartCallbacks {
    void onChartScrubbed(Point point);

    void onSpanSelected(DisplaySpan span);
}
