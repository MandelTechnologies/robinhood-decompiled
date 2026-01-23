package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.core.graphics.ColorUtils;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p355ui.Pricebook;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathHelper.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010.\u001a\u00020/H\u0002J\b\u00104\u001a\u00020/H\u0002J\u0014\u00105\u001a\u00020/2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0018\u00106\u001a\u00020/2\b\b\u0001\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u000eJ\u000e\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;J\u000e\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020>J\u0016\u0010?\u001a\u00020/2\u0006\u0010=\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0015J\u0006\u0010A\u001a\u00020/J\u0016\u0010B\u001a\u00020/2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010C\u001a\u00020/2\u0006\u00107\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0014\u001a\u0004\u0018\u00010!@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u0014\u001a\u0004\u0018\u00010'@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b)\u0010*R$\u0010+\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001aR\"\u00101\u001a\u0004\u0018\u0001002\b\u0010\u0014\u001a\u0004\u0018\u000100@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b2\u00103¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/PathHelper;", "", "isBid", "", "<init>", "(Z)V", "entries", "", "Lcom/robinhood/models/ui/Pricebook$Entry;", "rawPath", "Landroid/graphics/Path;", "rawClipPath", "displayPath", "fullBounds", "Landroid/graphics/RectF;", "zoomBounds", "strokePaint", "Landroid/graphics/Paint;", "fillPaint", "backgroundClearPaint", "value", "", "strokeWidth", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "", ResourceTypes.COLOR, "getColor", "()I", "setColor", "(I)V", "Landroid/graphics/Bitmap;", "fillTile", "getFillTile", "()Landroid/graphics/Bitmap;", "setFillTile", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/BitmapShader;", "bitmapShader", "setBitmapShader", "(Landroid/graphics/BitmapShader;)V", "viewHeight", "getViewHeight", "setViewHeight", "updateLinearGradient", "", "Landroid/graphics/LinearGradient;", "linearGradient", "setLinearGradient", "(Landroid/graphics/LinearGradient;)V", "updateFillShader", "updateEntries", "updateZoom", "zoomFraction", "boundsRect", "onMatrixUpdated", "matrix", "Landroid/graphics/Matrix;", "draw", "canvas", "Landroid/graphics/Canvas;", "drawScrubLine", "x", "clear", "populateRawPointsPath", "clipPathToZoomBounds", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class PathHelper {
    public static final int $stable = 8;
    private final Paint backgroundClearPaint;
    private BitmapShader bitmapShader;
    private final Paint fillPaint;
    private Bitmap fillTile;
    private final boolean isBid;
    private LinearGradient linearGradient;
    private final Paint strokePaint;
    private float viewHeight;
    private List<Pricebook.Entry> entries = CollectionsKt.emptyList();
    private final Path rawPath = new Path();
    private final Path rawClipPath = new Path();
    private final Path displayPath = new Path();
    private RectF fullBounds = new RectF();
    private final RectF zoomBounds = new RectF();

    public PathHelper(boolean z) {
        this.isBid = z;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.BEVEL);
        this.strokePaint = paint;
        Paint paint2 = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.fillPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.backgroundClearPaint = paint3;
    }

    public final float getStrokeWidth() {
        return this.strokePaint.getStrokeWidth();
    }

    public final void setStrokeWidth(float f) {
        this.strokePaint.setStrokeWidth(f);
    }

    public final int getColor() {
        return this.strokePaint.getColor();
    }

    public final void setColor(int i) {
        this.strokePaint.setColor(i);
        updateLinearGradient();
    }

    public final Bitmap getFillTile() {
        return this.fillTile;
    }

    public final void setFillTile(Bitmap bitmap) {
        this.fillTile = bitmap;
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            setBitmapShader(new BitmapShader(bitmap, tileMode, tileMode));
        }
    }

    private final void setBitmapShader(BitmapShader bitmapShader) {
        this.bitmapShader = bitmapShader;
        updateFillShader();
    }

    public final float getViewHeight() {
        return this.viewHeight;
    }

    public final void setViewHeight(float f) {
        this.viewHeight = f;
        updateLinearGradient();
    }

    private final void updateLinearGradient() {
        setLinearGradient(new LinearGradient(0.0f, 0.0f, 0.0f, this.viewHeight, new int[]{ColorUtils.setAlphaComponent(getColor(), EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE), ColorUtils.setAlphaComponent(getColor(), 26)}, (float[]) null, Shader.TileMode.CLAMP));
    }

    private final void setLinearGradient(LinearGradient linearGradient) {
        this.linearGradient = linearGradient;
        updateFillShader();
    }

    private final void updateFillShader() {
        LinearGradient linearGradient;
        BitmapShader bitmapShader = this.bitmapShader;
        if (bitmapShader == null || (linearGradient = this.linearGradient) == null) {
            return;
        }
        this.fillPaint.setShader(new ComposeShader(bitmapShader, linearGradient, PorterDuff.Mode.SRC_IN));
    }

    public final void updateEntries(List<Pricebook.Entry> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        populateRawPointsPath(entries);
    }

    public final void updateZoom(float zoomFraction, RectF boundsRect) {
        Intrinsics.checkNotNullParameter(boundsRect, "boundsRect");
        clipPathToZoomBounds(zoomFraction);
        this.rawClipPath.computeBounds(boundsRect, false);
    }

    public final void onMatrixUpdated(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.rawClipPath.transform(matrix, this.displayPath);
    }

    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.displayPath, this.backgroundClearPaint);
        canvas.drawPath(this.displayPath, this.fillPaint);
        canvas.drawPath(this.displayPath, this.strokePaint);
    }

    public final void drawScrubLine(Canvas canvas, float x) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawLine(x, 0.0f, x, this.zoomBounds.height(), this.strokePaint);
    }

    public final void clear() {
        this.rawPath.reset();
    }

    private final void populateRawPointsPath(List<Pricebook.Entry> entries) {
        this.entries = entries;
        PathHelper2.populateWithEntries$default(this.rawPath, entries, this.isBid, this.fullBounds, null, 8, null);
    }

    private final void clipPathToZoomBounds(float zoomFraction) {
        float fWidth = this.fullBounds.width();
        float f = fWidth - (zoomFraction * fWidth);
        this.zoomBounds.set(this.fullBounds);
        boolean z = this.isBid;
        if (z) {
            this.zoomBounds.left += f;
        } else {
            this.zoomBounds.right -= f;
        }
        PathHelper2.populateWithEntries(this.rawClipPath, this.entries, z, new RectF(), this.zoomBounds);
    }
}
