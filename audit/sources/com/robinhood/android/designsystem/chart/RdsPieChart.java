package com.robinhood.android.designsystem.chart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.view.DefStyleProvider;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p479j$.time.Duration;

/* compiled from: RdsPieChart.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0013\u0018\u0000 K2\u00020\u0001:\u0002LKB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\t2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010.\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR,\u0010B\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR,\u0010H\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010C\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010G¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/RdsPieChart;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "", "currAngle", "sweepAngle", "", "drawArc", "(Landroid/graphics/Canvas;FF)V", "clear", "()V", "value", "", ResourceTypes.COLOR, "addSlice", "(FLjava/lang/Integer;)V", "animateSlices", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "workPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Rect;", "workRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "workRectF", "Landroid/graphics/RectF;", "", "Lcom/robinhood/android/designsystem/chart/RdsPieChart$Slice;", "slices", "Ljava/util/List;", "", "startTimeMillis", "J", "totalValue", "F", "getTotalValue", "()F", "setTotalValue", "(F)V", "Landroid/view/animation/Interpolator;", "interpolator", "Landroid/view/animation/Interpolator;", "getInterpolator", "()Landroid/view/animation/Interpolator;", "setInterpolator", "(Landroid/view/animation/Interpolator;)V", "j$/time/Duration", "animationDuration", "Lj$/time/Duration;", "getAnimationDuration", "()Lj$/time/Duration;", "setAnimationDuration", "(Lj$/time/Duration;)V", "trackColor", "I", "getTrackColor", "()I", "setTrackColor", "(I)V", "defaultSliceColor", "getDefaultSliceColor", "setDefaultSliceColor", "Companion", "Slice", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RdsPieChart extends View {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final float MINIMUM_FRACTION = 0.01f;
    private Duration animationDuration;
    private int defaultSliceColor;
    private Interpolator interpolator;
    private final List<Slice> slices;
    private long startTimeMillis;
    private float totalValue;
    private int trackColor;
    private final Paint workPaint;
    private final Rect workRect;
    private final RectF workRectF;

    @JvmOverloads
    public final void addSlice(float f) {
        addSlice$default(this, f, null, 2, null);
    }

    public /* synthetic */ RdsPieChart(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RdsPieChart(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Companion companion = INSTANCE;
        super(context, attributeSet, companion.getDefStyleAttr());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.workPaint = paint;
        this.workRect = new Rect();
        this.workRectF = new RectF();
        this.slices = new ArrayList();
        this.totalValue = 1.0f;
        this.interpolator = new FastOutSlowInInterpolator();
        Duration durationOfMillis = Duration.ofMillis(500L);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        this.animationDuration = durationOfMillis;
        int[] RdsPieChart = C13997R.styleable.RdsPieChart;
        Intrinsics.checkNotNullExpressionValue(RdsPieChart, "RdsPieChart");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsPieChart, companion.getDefStyleAttr(), 0);
        paint.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(C13997R.styleable.RdsPieChart_pieStrokeWidth, 0.0f));
        setDefaultSliceColor(typedArrayObtainStyledAttributes.getColor(C13997R.styleable.RdsPieChart_pieDefaultSliceColor, 0));
        setTrackColor(typedArrayObtainStyledAttributes.getColor(C13997R.styleable.RdsPieChart_pieTrackColor, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* compiled from: RdsPieChart.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/RdsPieChart$Slice;", "", "value", "", ResourceTypes.COLOR, "", "<init>", "(FLjava/lang/Integer;)V", "getValue", "()F", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(FLjava/lang/Integer;)Lcom/robinhood/android/designsystem/chart/RdsPieChart$Slice;", "equals", "", "other", "hashCode", "toString", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    private static final /* data */ class Slice {
        private final Integer color;
        private final float value;

        public static /* synthetic */ Slice copy$default(Slice slice, float f, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                f = slice.value;
            }
            if ((i & 2) != 0) {
                num = slice.color;
            }
            return slice.copy(f, num);
        }

        /* renamed from: component1, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getColor() {
            return this.color;
        }

        public final Slice copy(float value, Integer color) {
            return new Slice(value, color);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Slice)) {
                return false;
            }
            Slice slice = (Slice) other;
            return Float.compare(this.value, slice.value) == 0 && Intrinsics.areEqual(this.color, slice.color);
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(this.value) * 31;
            Integer num = this.color;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Slice(value=" + this.value + ", color=" + this.color + ")";
        }

        public Slice(float f, Integer num) {
            this.value = f;
            this.color = num;
        }

        public final Integer getColor() {
            return this.color;
        }

        public final float getValue() {
            return this.value;
        }
    }

    public final float getTotalValue() {
        return this.totalValue;
    }

    public final void setTotalValue(float f) {
        this.totalValue = f;
    }

    public final Interpolator getInterpolator() {
        return this.interpolator;
    }

    public final void setInterpolator(Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "<set-?>");
        this.interpolator = interpolator;
    }

    public final Duration getAnimationDuration() {
        return this.animationDuration;
    }

    public final void setAnimationDuration(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<set-?>");
        this.animationDuration = duration;
    }

    public final int getTrackColor() {
        return this.trackColor;
    }

    public final void setTrackColor(int i) {
        this.trackColor = i;
        invalidate();
    }

    public final int getDefaultSliceColor() {
        return this.defaultSliceColor;
    }

    public final void setDefaultSliceColor(int i) {
        this.defaultSliceColor = i;
        invalidate();
    }

    public final void clear() {
        this.slices.clear();
        invalidate();
    }

    public static /* synthetic */ void addSlice$default(RdsPieChart rdsPieChart, float f, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        rdsPieChart.addSlice(f, num);
    }

    @JvmOverloads
    public final void addSlice(float value, Integer color) {
        this.slices.add(new Slice(value, color));
        invalidate();
    }

    public final void animateSlices() {
        this.startTimeMillis = System.currentTimeMillis();
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            size = RangesKt.coerceAtMost(size, size2);
        } else if (mode == 0) {
            size = size2;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = RangesKt.coerceAtMost(size2, size);
        } else if (mode2 == 0) {
            size2 = size;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.getClipBounds(this.workRect);
        float strokeWidth = this.workPaint.getStrokeWidth();
        float f = strokeWidth / 2.0f;
        RectF rectF = this.workRectF;
        Rect rect = this.workRect;
        rectF.left = rect.left + f;
        rectF.top = rect.top + f;
        rectF.right = rect.right - f;
        rectF.bottom = rect.bottom - f;
        float fWidth = (strokeWidth / ((float) ((rectF.width() / 2.0f) * 6.283185307179586d))) / this.totalValue;
        float f2 = 2.0f * fWidth;
        this.workPaint.setColor(this.trackColor);
        drawArc(canvas, 0.0f, 360.0f);
        float f3 = 1.0f;
        float fCoerceIn = RangesKt.coerceIn((System.currentTimeMillis() - this.startTimeMillis) / this.animationDuration.toMillis(), 0.0f, 1.0f);
        float interpolation = this.interpolator.getInterpolation(fCoerceIn);
        float f4 = this.totalValue;
        List<Slice> list = this.slices;
        float size = (1 - (list.size() * f2)) * 360;
        int i = 0;
        boolean z = list.size() == 1;
        int size2 = list.size();
        while (i < size2) {
            Slice slice = list.get(i);
            float value = slice.getValue();
            Integer color = slice.getColor();
            float fCoerceAtLeast = value / f4;
            if (z) {
                fCoerceAtLeast = RangesKt.coerceAtLeast(fCoerceAtLeast, 0.01f);
            }
            float f5 = fCoerceAtLeast + fWidth;
            float f6 = (-90.0f) - (fWidth * size);
            float f7 = (fWidth - f5) * size * interpolation;
            float f8 = f3;
            this.workPaint.setColor(color != null ? color.intValue() : this.defaultSliceColor);
            drawArc(canvas, f6, f7);
            fWidth = f5 + f2;
            i++;
            f3 = f8;
        }
        if (fCoerceIn < f3) {
            postInvalidateOnAnimation();
        }
    }

    private final void drawArc(Canvas canvas, float f, float f2) {
        canvas.drawArc(this.workRectF, f, f2, false, this.workPaint);
    }

    /* compiled from: RdsPieChart.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/RdsPieChart$Companion;", "Lcom/robinhood/scarlet/view/DefStyleProvider;", "<init>", "()V", "MINIMUM_FRACTION", "", "defStyleAttr", "", "getDefStyleAttr", "()I", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion implements DefStyleProvider {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleRes() {
            return DefStyleProvider.DefaultImpls.getDefStyleRes(this);
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleAttr() {
            return C20690R.attr.pieChartStyle;
        }
    }
}
