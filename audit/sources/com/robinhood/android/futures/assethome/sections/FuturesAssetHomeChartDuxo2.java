package com.robinhood.android.futures.assethome.sections;

import com.robinhood.models.serverdriven.experimental.api.Point;
import kotlin.Metadata;

/* compiled from: FuturesAssetHomeChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartCallbacks;", "", "onScrub", "", "point", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "onSpanSelected", "span", "", "showNetReturnsBottomSheet", "hideNetReturnsBottomSheet", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartCallbacks, reason: use source file name */
/* loaded from: classes3.dex */
public interface FuturesAssetHomeChartDuxo2 {
    void hideNetReturnsBottomSheet();

    void onScrub(Point point);

    void onSpanSelected(String span);

    void showNetReturnsBottomSheet();
}
