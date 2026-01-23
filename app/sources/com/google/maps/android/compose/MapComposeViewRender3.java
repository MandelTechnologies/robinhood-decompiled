package com.google.maps.android.compose;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MapComposeViewRender.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J0\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0014¨\u0006\u0011"}, m3636d2 = {"Lcom/google/maps/android/compose/NoDrawContainerView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "onLayout", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "", "l", "", "t", Constants.REVENUE_AMOUNT_KEY, "b", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.google.maps.android.compose.NoDrawContainerView, reason: use source file name */
/* loaded from: classes27.dex */
final class MapComposeViewRender3 extends ViewGroup {
    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapComposeViewRender3(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
