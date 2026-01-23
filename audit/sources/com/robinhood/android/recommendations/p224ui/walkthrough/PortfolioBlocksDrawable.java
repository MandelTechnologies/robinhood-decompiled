package com.robinhood.android.recommendations.p224ui.walkthrough;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;
import kotlin.ranges.RangesKt;

/* compiled from: PortfolioBlocksDrawable.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 N2\u00020\u0001:\u0002MNB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J8\u00102\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0013H\u0002J(\u00108\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0002J(\u0010;\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0002J(\u0010<\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0013H\u0002J8\u0010>\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0013H\u0002J(\u0010@\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0002J(\u0010A\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0002J(\u0010B\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0002J\u001a\u0010C\u001a\u00020D2\b\b\u0001\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u0007H\u0003J\u0010\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020DH\u0016J\u0012\u0010I\u001a\u00020/2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010L\u001a\u00020DH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020 0\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\tR\u0014\u0010,\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\t¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioBlocksDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "xDelta", "", "getXDelta", "()F", "yDelta", "getYDelta", "rectHeight", "getRectHeight", "startRectY", "getStartRectY", "shadowDepth", "getShadowDepth", "rectPaint", "Landroid/graphics/Paint;", "topRhombusPaint", "sideRhombusPaint", "linePaint", "shadowPaints", "", "value", "", "hideShadows", "getHideShadows", "()Z", "setHideShadows", "(Z)V", "Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioBlocksDrawable$Block;", "blocks", "getBlocks", "()Ljava/util/List;", "setBlocks", "(Ljava/util/List;)V", "spacingWidth", "getSpacingWidth", "setSpacingWidth", "(F)V", "width", "getWidth", "height", "getHeight", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawBlock", "weight", "startXOffset", "percentageStartX", "yOffset", "shadowPaint", "drawRectangle", "startRectX", "rectWidth", "drawRectOutline", "drawShadow", "paint", "drawVerticalRhombus", "fillPaint", "drawTopRhombusOutline", "drawSideRhombus", "drawSideRhombusOutline", "getRgbColor", "", "colorInt", "rgbRatio", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "Block", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public class PortfolioBlocksDrawable extends Drawable {
    private static final float LINE_STROKE_WIDTH = 2.0f;
    private static final int MAX_OPACITY = 255;
    private static final float MAX_SPACING_WIDTH = 32.0f;
    private static final float RGB_RATIO_CENTER_RECT = 0.925f;
    private static final float RGB_RATIO_SIDE_RHOMBUS = 0.8f;
    private static final float RGB_RATIO_TOP_RHOMBUS = 1.0f;
    private static final float WEIGHTS_SUM_BUFFER = 1.0E-4f;
    private List<Block> blocks;
    private final Context context;
    private boolean hideShadows;
    private final Paint linePaint;
    private final Paint rectPaint;
    private List<? extends Paint> shadowPaints;
    private final Paint sideRhombusPaint;
    private float spacingWidth;
    private final Paint topRhombusPaint;
    private static final Ranges3<Float> WEIGHTS_SUM_RANGE = RangesKt.rangeTo(0.9999f, 1.0001f);
    private static final float RHOMBUS_INNER_ANGLE_RADIANS = (float) Math.toRadians(45.0d);

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public PortfolioBlocksDrawable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.rectPaint = new Paint();
        this.topRhombusPaint = new Paint();
        this.sideRhombusPaint = new Paint();
        Paint paint = new Paint();
        paint.setColor(context.getColor(C20690R.color.mobius_black));
        paint.setStrokeWidth(2.0f);
        this.linePaint = paint;
        this.shadowPaints = CollectionsKt.emptyList();
        this.blocks = CollectionsKt.emptyList();
    }

    private final float getXDelta() {
        return ((float) Math.cos(RHOMBUS_INNER_ANGLE_RADIANS)) * getRectHeight();
    }

    private final float getYDelta() {
        return (((float) Math.sin(RHOMBUS_INNER_ANGLE_RADIANS)) * getRectHeight()) / 1.5f;
    }

    private final float getRectHeight() {
        return getHeight() / 5.0f;
    }

    private final float getStartRectY() {
        return getRectHeight() * 2.5f;
    }

    private final float getShadowDepth() {
        return getYDelta() / 2.0f;
    }

    public final boolean getHideShadows() {
        return this.hideShadows;
    }

    public final void setHideShadows(boolean z) {
        this.hideShadows = z;
        invalidateSelf();
    }

    public final List<Block> getBlocks() {
        return this.blocks;
    }

    public final void setBlocks(List<Block> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List<Block> list = value;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((Block) it.next()).getWeight()));
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).floatValue() <= 0.0f) {
                    throw new IllegalStateException("Cannot have negative weights");
                }
            }
        }
        Ranges3<Float> ranges3 = WEIGHTS_SUM_RANGE;
        if (!ranges3.contains(Float.valueOf(CollectionsKt.sumOfFloat(arrayList)))) {
            throw new IllegalStateException(("Sum of weights must be within range [" + ranges3.getStart() + ":" + ranges3.getEndInclusive() + "]").toString());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Block block : list) {
            Paint paint = new Paint();
            paint.setColor(ThemeColors.getThemeColor(this.context, C20690R.attr.colorForeground2));
            paint.setAlpha((int) (block.getShadowOpacity() * 255));
            arrayList2.add(paint);
        }
        this.shadowPaints = arrayList2;
        this.blocks = value;
        invalidateSelf();
    }

    public final float getSpacingWidth() {
        return this.spacingWidth;
    }

    public final void setSpacingWidth(float f) {
        this.spacingWidth = RangesKt.coerceIn(f, 0.0f, MAX_SPACING_WIDTH);
        invalidateSelf();
    }

    private final float getWidth() {
        return (getBounds().width() - getXDelta()) - Math.max(this.spacingWidth * this.blocks.size(), 2.0f);
    }

    private final float getHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = 0;
        float weight = 0.0f;
        for (Object obj : this.blocks) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Block block = (Block) obj;
            this.rectPaint.setColor(getRgbColor(block.getColor(), RGB_RATIO_CENTER_RECT));
            this.topRhombusPaint.setColor(getRgbColor(block.getColor(), 1.0f));
            this.sideRhombusPaint.setColor(getRgbColor(block.getColor(), 0.8f));
            Canvas canvas2 = canvas;
            drawBlock(canvas2, block.getWeight(), this.spacingWidth * i, weight, block.getYOffsetPercentage() * getRectHeight(), this.shadowPaints.get(i));
            weight += block.getWeight();
            canvas = canvas2;
            i = i2;
        }
    }

    private final void drawBlock(Canvas canvas, float weight, float startXOffset, float percentageStartX, float yOffset, Paint shadowPaint) {
        float width = (getWidth() * percentageStartX) + startXOffset + (this.spacingWidth / 2);
        float width2 = getWidth() * weight;
        if (!this.hideShadows) {
            drawShadow(canvas, width, width2, shadowPaint);
        }
        drawRectangle(canvas, width, width2, yOffset);
        drawRectOutline(canvas, width, width2, yOffset);
        drawSideRhombus(canvas, width, width2, yOffset);
        drawSideRhombusOutline(canvas, width, width2, yOffset);
        drawTopRhombusOutline(canvas, width, width2, yOffset);
        drawVerticalRhombus(canvas, width, getStartRectY(), width2, yOffset, this.topRhombusPaint);
    }

    private final void drawRectangle(Canvas canvas, float startRectX, float rectWidth, float yOffset) {
        Path path = new Path();
        path.moveTo(startRectX, getStartRectY() + yOffset);
        float f = rectWidth + startRectX;
        path.lineTo(f, getStartRectY() + yOffset);
        path.lineTo(f, getStartRectY() + yOffset + getRectHeight());
        path.lineTo(startRectX, getStartRectY() + yOffset + getRectHeight());
        path.lineTo(startRectX, getStartRectY() + yOffset);
        path.close();
        canvas.drawPath(path, this.rectPaint);
    }

    private final void drawRectOutline(Canvas canvas, float startRectX, float rectWidth, float yOffset) {
        float f = startRectX + rectWidth;
        canvas.drawLine(startRectX, getStartRectY() + yOffset, f, getStartRectY() + yOffset, this.linePaint);
        canvas.drawLine(f, getStartRectY() + yOffset, f, getStartRectY() + yOffset + getRectHeight(), this.linePaint);
        canvas.drawLine(f, getStartRectY() + yOffset + getRectHeight(), startRectX, getStartRectY() + yOffset + getRectHeight(), this.linePaint);
        canvas.drawLine(startRectX, getStartRectY() + yOffset + getRectHeight(), startRectX, getStartRectY() + yOffset, this.linePaint);
    }

    private final void drawShadow(Canvas canvas, float startRectX, float rectWidth, Paint paint) {
        drawVerticalRhombus(canvas, startRectX, getStartRectY() + getRectHeight() + getShadowDepth(), rectWidth, 0.0f, paint);
    }

    private final void drawVerticalRhombus(Canvas canvas, float startRectX, float startRectY, float rectWidth, float yOffset, Paint fillPaint) {
        Path path = new Path();
        float f = startRectY + yOffset;
        path.moveTo(startRectX, f);
        path.lineTo(getXDelta() + startRectX, f - getYDelta());
        path.lineTo(getXDelta() + startRectX + rectWidth, f - getYDelta());
        path.lineTo(rectWidth + startRectX, f);
        path.lineTo(startRectX, f);
        path.close();
        canvas.drawPath(path, fillPaint);
    }

    private final void drawTopRhombusOutline(Canvas canvas, float startRectX, float rectWidth, float yOffset) {
        canvas.drawLine(startRectX, getStartRectY() + yOffset, startRectX + getXDelta(), (getStartRectY() + yOffset) - getYDelta(), this.linePaint);
        canvas.drawLine(startRectX + getXDelta(), (getStartRectY() + yOffset) - getYDelta(), getXDelta() + startRectX + rectWidth, (getStartRectY() + yOffset) - getYDelta(), this.linePaint);
        float f = startRectX + rectWidth;
        canvas.drawLine(getXDelta() + startRectX + rectWidth, (getStartRectY() + yOffset) - getYDelta(), f, getStartRectY() + yOffset, this.linePaint);
        canvas.drawLine(f, getStartRectY() + yOffset, startRectX, getStartRectY() + yOffset, this.linePaint);
    }

    private final void drawSideRhombus(Canvas canvas, float startRectX, float rectWidth, float yOffset) {
        Path path = new Path();
        float f = startRectX + rectWidth;
        path.moveTo(f, getStartRectY() + yOffset + getRectHeight());
        path.lineTo(f, getStartRectY() + yOffset);
        path.lineTo(getXDelta() + f, (getStartRectY() + yOffset) - getYDelta());
        path.lineTo(getXDelta() + f, ((getStartRectY() + yOffset) - getYDelta()) + getRectHeight());
        path.lineTo(f, getStartRectY() + yOffset + getRectHeight());
        path.close();
        canvas.drawPath(path, this.sideRhombusPaint);
    }

    private final void drawSideRhombusOutline(Canvas canvas, float startRectX, float rectWidth, float yOffset) {
        float f = startRectX + rectWidth;
        canvas.drawLine(f, getStartRectY() + yOffset, getXDelta() + startRectX + rectWidth, (getStartRectY() + yOffset) - getYDelta(), this.linePaint);
        canvas.drawLine(getXDelta() + startRectX + rectWidth, (getStartRectY() + yOffset) - getYDelta(), getXDelta() + startRectX + rectWidth, ((getStartRectY() + yOffset) - getYDelta()) + getRectHeight(), this.linePaint);
        canvas.drawLine(startRectX + getXDelta() + rectWidth, ((getStartRectY() + yOffset) - getYDelta()) + getRectHeight(), f, getStartRectY() + yOffset + getRectHeight(), this.linePaint);
        canvas.drawLine(f, getStartRectY() + yOffset + getRectHeight(), f, getStartRectY() + yOffset, this.linePaint);
    }

    private final int getRgbColor(int colorInt, float rgbRatio) {
        return Color.rgb((int) (Color.red(colorInt) * rgbRatio), (int) (Color.green(colorInt) * rgbRatio), (int) (Color.blue(colorInt) * rgbRatio));
    }

    /* compiled from: PortfolioBlocksDrawable.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioBlocksDrawable$Block;", "Landroid/os/Parcelable;", "weight", "", "yOffsetPercentage", "shadowOpacity", ResourceTypes.COLOR, "", "<init>", "(FFFI)V", "getWeight", "()F", "getYOffsetPercentage", "getShadowOpacity", "getColor", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Block implements Parcelable {
        public static final Parcelable.Creator<Block> CREATOR = new Creator();
        private final int color;
        private final float shadowOpacity;
        private final float weight;
        private final float yOffsetPercentage;

        /* compiled from: PortfolioBlocksDrawable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Block> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Block createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Block(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Block[] newArray(int i) {
                return new Block[i];
            }
        }

        public static /* synthetic */ Block copy$default(Block block, float f, float f2, float f3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = block.weight;
            }
            if ((i2 & 2) != 0) {
                f2 = block.yOffsetPercentage;
            }
            if ((i2 & 4) != 0) {
                f3 = block.shadowOpacity;
            }
            if ((i2 & 8) != 0) {
                i = block.color;
            }
            return block.copy(f, f2, f3, i);
        }

        /* renamed from: component1, reason: from getter */
        public final float getWeight() {
            return this.weight;
        }

        /* renamed from: component2, reason: from getter */
        public final float getYOffsetPercentage() {
            return this.yOffsetPercentage;
        }

        /* renamed from: component3, reason: from getter */
        public final float getShadowOpacity() {
            return this.shadowOpacity;
        }

        /* renamed from: component4, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        public final Block copy(float weight, float yOffsetPercentage, float shadowOpacity, int color) {
            return new Block(weight, yOffsetPercentage, shadowOpacity, color);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Block)) {
                return false;
            }
            Block block = (Block) other;
            return Float.compare(this.weight, block.weight) == 0 && Float.compare(this.yOffsetPercentage, block.yOffsetPercentage) == 0 && Float.compare(this.shadowOpacity, block.shadowOpacity) == 0 && this.color == block.color;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.weight) * 31) + Float.hashCode(this.yOffsetPercentage)) * 31) + Float.hashCode(this.shadowOpacity)) * 31) + Integer.hashCode(this.color);
        }

        public String toString() {
            return "Block(weight=" + this.weight + ", yOffsetPercentage=" + this.yOffsetPercentage + ", shadowOpacity=" + this.shadowOpacity + ", color=" + this.color + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.weight);
            dest.writeFloat(this.yOffsetPercentage);
            dest.writeFloat(this.shadowOpacity);
            dest.writeInt(this.color);
        }

        public Block(float f, float f2, float f3, int i) {
            this.weight = f;
            this.yOffsetPercentage = f2;
            this.shadowOpacity = f3;
            this.color = i;
        }

        public /* synthetic */ Block(float f, float f2, float f3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 1.0f : f3, (i2 & 8) != 0 ? 0 : i);
        }

        public final float getWeight() {
            return this.weight;
        }

        public final float getYOffsetPercentage() {
            return this.yOffsetPercentage;
        }

        public final float getShadowOpacity() {
            return this.shadowOpacity;
        }

        public final int getColor() {
            return this.color;
        }
    }
}
