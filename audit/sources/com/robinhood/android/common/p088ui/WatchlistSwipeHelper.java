package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.common.strings.C32428R;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatchlistSwipeHelper.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JF\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0003\u0010\u0013\u001a\u00020\u00142\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0003\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0018J<\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0003\u0010\u0013\u001a\u00020\u00142\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0003\u0010\u0016\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/ui/WatchlistSwipeHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "backgroundPaint", "Landroid/graphics/Paint;", "textPaint", "Landroid/text/TextPaint;", "padding", "", "drawBackgroundWithEndLabel", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "c", "Landroid/graphics/Canvas;", "dX", "labelRes", "", "foregroundColor", "backgroundColor", "displayMetrics", "Landroid/util/DisplayMetrics;", "drawBackgroundWithStartLabel", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class WatchlistSwipeHelper {
    private final Paint backgroundPaint;
    private final Context context;
    private final float padding;
    private final TextPaint textPaint;

    public WatchlistSwipeHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.backgroundPaint = new Paint();
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(ContextsUiExtensions.getFont(context, C16915R.font.capsule_sans_text_bold));
        textPaint.setTextSize(context.getResources().getDimension(C13997R.dimen.text_size_mobius_regular_medium));
        this.textPaint = textPaint;
        this.padding = context.getResources().getDimension(C13997R.dimen.rds_spacing_medium);
    }

    public static /* synthetic */ void drawBackgroundWithEndLabel$default(WatchlistSwipeHelper watchlistSwipeHelper, RecyclerView.ViewHolder viewHolder, Canvas canvas, float f, int i, int i2, int i3, DisplayMetrics displayMetrics, int i4, Object obj) throws Resources.NotFoundException {
        if ((i4 & 8) != 0) {
            i = C32428R.string.general_label_delete;
        }
        int i5 = i;
        if ((i4 & 16) != 0) {
            i2 = watchlistSwipeHelper.context.getColor(C20690R.color.mobius_white);
        }
        int i6 = i2;
        if ((i4 & 32) != 0) {
            i3 = ThemeColors.getThemeColor(watchlistSwipeHelper.context, C20690R.attr.colorNegative);
        }
        int i7 = i3;
        if ((i4 & 64) != 0) {
            displayMetrics = watchlistSwipeHelper.context.getResources().getDisplayMetrics();
        }
        watchlistSwipeHelper.drawBackgroundWithEndLabel(viewHolder, canvas, f, i5, i6, i7, displayMetrics);
    }

    public final void drawBackgroundWithEndLabel(RecyclerView.ViewHolder viewHolder, Canvas c, float dX, int labelRes, int foregroundColor, int backgroundColor, DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        String string2 = this.context.getString(labelRes);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.backgroundPaint.setColor(backgroundColor);
        this.textPaint.setColor(foregroundColor);
        this.textPaint.setTextAlign(Paint.Align.RIGHT);
        float f = displayMetrics.widthPixels;
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        float top = itemView.getTop();
        float bottom = itemView.getBottom();
        float f2 = 2;
        float fDescent = ((top + bottom) / f2) - ((this.textPaint.descent() + this.textPaint.ascent()) / f2);
        Rect rect = new Rect((int) (dX + f), (int) top, (int) f, (int) bottom);
        c.clipRect(rect);
        c.drawRect(rect, this.backgroundPaint);
        c.drawText(string2, f - this.padding, fDescent, this.textPaint);
    }

    public static /* synthetic */ void drawBackgroundWithStartLabel$default(WatchlistSwipeHelper watchlistSwipeHelper, RecyclerView.ViewHolder viewHolder, Canvas canvas, float f, int i, int i2, int i3, int i4, Object obj) throws Resources.NotFoundException {
        if ((i4 & 8) != 0) {
            i = C32428R.string.general_label_buy;
        }
        int i5 = i;
        if ((i4 & 16) != 0) {
            i2 = ThemeColors.getThemeColor(watchlistSwipeHelper.context, C20690R.attr.colorPositive);
        }
        int i6 = i2;
        if ((i4 & 32) != 0) {
            i3 = ThemeColors.getThemeColor(watchlistSwipeHelper.context, C20690R.attr.colorPositive);
        }
        watchlistSwipeHelper.drawBackgroundWithStartLabel(viewHolder, canvas, f, i5, i6, i3);
    }

    public final void drawBackgroundWithStartLabel(RecyclerView.ViewHolder viewHolder, Canvas c, float dX, int labelRes, int foregroundColor, int backgroundColor) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(c, "c");
        String string2 = this.context.getString(labelRes);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.backgroundPaint.setColor(backgroundColor);
        this.backgroundPaint.setAlpha(25);
        this.textPaint.setColor(foregroundColor);
        this.textPaint.setTextAlign(Paint.Align.LEFT);
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        float top = itemView.getTop();
        float bottom = itemView.getBottom();
        float f = 2;
        float fDescent = ((top + bottom) / f) - ((this.textPaint.descent() + this.textPaint.ascent()) / f);
        Rect rect = new Rect(0, (int) top, (int) dX, (int) bottom);
        c.clipRect(rect);
        c.drawRect(rect, this.backgroundPaint);
        c.drawText(string2, this.padding, fDescent, this.textPaint);
    }
}
