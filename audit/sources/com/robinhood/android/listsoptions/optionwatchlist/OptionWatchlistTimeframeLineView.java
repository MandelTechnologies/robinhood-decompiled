package com.robinhood.android.listsoptions.optionwatchlist;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.listsoptions.C20943R;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionWatchlistTimeframeLineView.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistTimeframeLineView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "initialColor", "", "getInitialColor", "()I", "pointRadius", "", "lineWidth", "dashWidth", "dashPathEffect", "Landroid/graphics/DashPathEffect;", "value", "lineColor", "getLineColor", "setLineColor", "(I)V", "pointPaint", "Landroid/graphics/Paint;", "linePaint", "path", "Landroid/graphics/Path;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionWatchlistTimeframeLineView extends View {
    private final DashPathEffect dashPathEffect;
    private final float dashWidth;
    private final Paint linePaint;
    private final float lineWidth;
    private final Path path;
    private final Paint pointPaint;
    private final float pointRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionWatchlistTimeframeLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.pointRadius = ViewsKt.getDimension(this, C20943R.dimen.option_watchlist_timeframe_line_end_radius);
        float dimension = ViewsKt.getDimension(this, C20943R.dimen.option_watchlist_timeframe_line_width);
        this.lineWidth = dimension;
        float dimension2 = ViewsKt.getDimension(this, C20943R.dimen.option_watchlist_timeframe_line_dash_width);
        this.dashWidth = dimension2;
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{dimension2, 2 * dimension2}, 0.0f);
        this.dashPathEffect = dashPathEffect;
        Paint paint = new Paint(1);
        paint.setColor(getInitialColor());
        this.pointPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStrokeWidth(dimension);
        paint2.setColor(getInitialColor());
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setPathEffect(dashPathEffect);
        this.linePaint = paint2;
        this.path = new Path();
    }

    private final int getInitialColor() {
        Resources.Theme theme = getContext().getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(C20690R.attr.colorForeground1, typedValue, true);
        return typedValue.data;
    }

    public final int getLineColor() {
        return this.pointPaint.getColor();
    }

    public final void setLineColor(int i) {
        this.pointPaint.setColor(i);
        this.linePaint.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f = this.pointRadius;
        canvas.drawCircle(f, f, f, this.pointPaint);
        float width = getWidth();
        float f2 = this.pointRadius;
        canvas.drawCircle(width - f2, f2, f2, this.pointPaint);
        this.path.reset();
        Path path = this.path;
        float f3 = this.pointRadius;
        path.moveTo(f3, f3);
        Path path2 = this.path;
        float width2 = getWidth();
        float f4 = this.pointRadius;
        path2.lineTo(width2 - f4, f4);
        canvas.drawPath(this.path, this.linePaint);
    }
}
