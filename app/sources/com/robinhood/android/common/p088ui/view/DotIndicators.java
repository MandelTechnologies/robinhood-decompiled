package com.robinhood.android.common.p088ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.robinhood.android.common.C11048R;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: DotIndicators.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001.B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0018J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0014J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0014J\b\u0010(\u001a\u00020\tH\u0002J\b\u0010)\u001a\u00020\tH\u0002J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/DotIndicators;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dotRadius", "", "strokeWidth", "dotSpacing", "value", "dotColor", "getDotColor", "()I", "setDotColor", "(I)V", "secondaryColor", "getSecondaryColor", "setSecondaryColor", "workPaint", "Landroid/graphics/Paint;", "drawStyle", "Lcom/robinhood/android/common/ui/view/DotIndicators$DrawStyle;", "numDots", "numActivated", "setNumDots", "", "dots", "setNumActivated", "position", "setDrawStyle", ResourceTypes.STYLE, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "calculateWidth", "calculateHeight", "drawPageIndicator", "drawPinHollow", "drawPinFilled", "drawAndTranslate", "DrawStyle", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class DotIndicators extends View {
    public static final int $stable = 8;
    private int dotColor;
    private final int dotRadius;
    private final int dotSpacing;
    private DrawStyle drawStyle;
    private int numActivated;
    private int numDots;
    private int secondaryColor;
    private final int strokeWidth;
    private final Paint workPaint;

    /* compiled from: DotIndicators.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DrawStyle.values().length];
            try {
                iArr[DrawStyle.PAGE_INDICATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DrawStyle.PIN_HOLLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DrawStyle.PIN_FILLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotIndicators(Context context, AttributeSet attributeSet) {
        DrawStyle drawStyle;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.workPaint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11048R.styleable.DotIndicators);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i = typedArrayObtainStyledAttributes.getInt(C11048R.styleable.DotIndicators_drawStyle, 0);
        if (i == 0) {
            drawStyle = DrawStyle.PAGE_INDICATOR;
        } else if (i == 1) {
            drawStyle = DrawStyle.PIN_HOLLOW;
        } else if (i == 2) {
            drawStyle = DrawStyle.PIN_FILLED;
        } else {
            throw new IllegalArgumentException("Unknown style constant " + i);
        }
        this.drawStyle = drawStyle;
        this.dotRadius = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C11048R.styleable.DotIndicators_dotRadius, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C11048R.styleable.DotIndicators_strokeWidth, 0);
        this.strokeWidth = dimensionPixelOffset;
        this.dotSpacing = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C11048R.styleable.DotIndicators_dotSpacing, 0);
        this.numDots = typedArrayObtainStyledAttributes.getInt(C11048R.styleable.DotIndicators_numDots, 0);
        setDotColor(typedArrayObtainStyledAttributes.getColor(C11048R.styleable.DotIndicators_dotColor, 0));
        setSecondaryColor(typedArrayObtainStyledAttributes.getColor(C11048R.styleable.DotIndicators_secondaryColor, 0));
        typedArrayObtainStyledAttributes.recycle();
        paint.setStrokeWidth(dimensionPixelOffset);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DotIndicators.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/DotIndicators$DrawStyle;", "", "<init>", "(Ljava/lang/String;I)V", "PAGE_INDICATOR", "PIN_HOLLOW", "PIN_FILLED", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DrawStyle {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DrawStyle[] $VALUES;
        public static final DrawStyle PAGE_INDICATOR = new DrawStyle("PAGE_INDICATOR", 0);
        public static final DrawStyle PIN_HOLLOW = new DrawStyle("PIN_HOLLOW", 1);
        public static final DrawStyle PIN_FILLED = new DrawStyle("PIN_FILLED", 2);

        private static final /* synthetic */ DrawStyle[] $values() {
            return new DrawStyle[]{PAGE_INDICATOR, PIN_HOLLOW, PIN_FILLED};
        }

        public static EnumEntries<DrawStyle> getEntries() {
            return $ENTRIES;
        }

        private DrawStyle(String str, int i) {
        }

        static {
            DrawStyle[] drawStyleArr$values = $values();
            $VALUES = drawStyleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(drawStyleArr$values);
        }

        public static DrawStyle valueOf(String str) {
            return (DrawStyle) Enum.valueOf(DrawStyle.class, str);
        }

        public static DrawStyle[] values() {
            return (DrawStyle[]) $VALUES.clone();
        }
    }

    public final int getDotColor() {
        return this.dotColor;
    }

    public final void setDotColor(int i) {
        this.dotColor = i;
        invalidate();
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final void setSecondaryColor(int i) {
        this.secondaryColor = i;
        invalidate();
    }

    public final void setNumDots(int dots) {
        this.numDots = dots;
        this.numActivated = RangesKt.coerceAtMost(this.numActivated, dots);
        requestLayout();
    }

    public final void setNumActivated(int position) {
        this.numActivated = position;
        invalidate();
    }

    public final void setDrawStyle(DrawStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawStyle = style;
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(calculateWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(calculateHeight(), 1073741824));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int iSave = canvas.save();
        canvas.translate(this.strokeWidth + getPaddingStart(), this.strokeWidth + getPaddingTop());
        try {
            this.workPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            DrawStyle drawStyle = this.drawStyle;
            int i = drawStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[drawStyle.ordinal()];
            if (i == 1) {
                drawPageIndicator(canvas);
            } else if (i == 2) {
                drawPinHollow(canvas);
            } else if (i == 3) {
                drawPinFilled(canvas);
            } else {
                throw new IllegalArgumentException("Unknown draw style");
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    private final int calculateWidth() {
        int i = this.numDots;
        return (i * 2 * (this.dotRadius + this.strokeWidth)) + ((i - 1) * this.dotSpacing) + getPaddingStart() + getPaddingEnd();
    }

    private final int calculateHeight() {
        return ((this.dotRadius + this.strokeWidth) * 2) + getPaddingTop() + getPaddingBottom();
    }

    private final void drawPageIndicator(Canvas canvas) {
        int i = this.numDots;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == this.numActivated) {
                this.workPaint.setColor(this.secondaryColor);
            } else {
                this.workPaint.setColor(this.dotColor);
            }
            drawAndTranslate(canvas);
        }
    }

    private final void drawPinHollow(Canvas canvas) {
        this.workPaint.setColor(this.dotColor);
        int i = this.numDots;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == this.numActivated) {
                this.workPaint.setStyle(Paint.Style.STROKE);
            }
            drawAndTranslate(canvas);
        }
    }

    private final void drawPinFilled(Canvas canvas) {
        this.workPaint.setColor(this.dotColor);
        int i = this.numDots;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == this.numActivated) {
                this.workPaint.setColor(this.secondaryColor);
            }
            drawAndTranslate(canvas);
        }
    }

    private final void drawAndTranslate(Canvas canvas) {
        int i = this.dotRadius;
        canvas.drawCircle(i, i, i, this.workPaint);
        canvas.translate(((this.dotRadius + this.strokeWidth) * 2) + this.dotSpacing, 0.0f);
    }
}
