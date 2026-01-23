package com.robinhood.android.charts;

import com.robinhood.android.charts.model.Point;
import kotlin.Metadata;

/* compiled from: Interactions.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/charts/ScrubListener;", "", "longPressTimeoutMillis", "", "getLongPressTimeoutMillis", "()J", "onScrub", "", "point", "Lcom/robinhood/android/charts/model/Point;", "onScrubStopped", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.ScrubListener, reason: use source file name */
/* loaded from: classes7.dex */
public interface Interactions5 {
    long getLongPressTimeoutMillis();

    void onScrub(Point point);

    void onScrubStopped();
}
