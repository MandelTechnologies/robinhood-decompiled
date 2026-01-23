package com.robinhood.android.optionsexercise.education;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ExerciseWarningVisualizationView.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001PB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u00100\u001a\u000201H\u0014J\u0018\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0017H\u0014J\u0010\u00105\u001a\u0002012\u0006\u00106\u001a\u000207H\u0014J\u0010\u00108\u001a\u0002012\u0006\u00109\u001a\u00020:H&J\b\u0010;\u001a\u00020\tH$J\b\u0010<\u001a\u00020\u0017H$J<\u0010=\u001a\u000201*\u0002072\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH$J\u001c\u0010D\u001a\u000201*\u0002072\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\tH\u0004J$\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020 H\u0004J \u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020J2\u0006\u0010O\u001a\u00020J2\u0006\u0010K\u001a\u00020 H\u0004R\u0012\u0010\b\u001a\u00020\tX¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020 X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020(X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020(X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020(X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/ExerciseWarningVisualizationView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dividerHeight", "", "getDividerHeight", "()F", "barHeight", "strokeWidth", "getStrokeWidth", "circleRadius", "fontSize", "getFontSize", "textSpacing", "getTextSpacing", "extraTextSpacing", "getExtraTextSpacing", "primaryColor", "", "secondaryColor", "barColor", "regularTypeface", "Landroid/graphics/Typeface;", "boldTypeface", "rect", "Landroid/graphics/Rect;", "primaryTextPaint", "Landroid/text/TextPaint;", "getPrimaryTextPaint", "()Landroid/text/TextPaint;", "secondaryTextPaint", "getSecondaryTextPaint", "boldTextPaint", "getBoldTextPaint", "barPaint", "Landroid/graphics/Paint;", "getBarPaint", "()Landroid/graphics/Paint;", "circlePaint", "linePaint", "getLinePaint", "dottedLinePaint", "getDottedLinePaint", "onAttachedToWindow", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "educationContext", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "getBarCenterY", "getTargetHeight", "draw", "dividerTop", "dividerBottom", "barLeft", "barRight", "barTop", "barBottom", "drawNub", "cx", "cy", "getTextBounds", "Lkotlin/Pair;", "text", "", "paint", "getLabelPriceBounds", "Lcom/robinhood/android/optionsexercise/education/ExerciseWarningVisualizationView$LabelPriceBounds;", AnnotatedPrivateKey.LABEL, AnalyticsStrings.TAG_SORT_ORDER_PRICE, "LabelPriceBounds", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class ExerciseWarningVisualizationView extends View {
    public static final int $stable = 8;
    private final int barColor;
    private final float barHeight;
    private final Paint barPaint;
    private final TextPaint boldTextPaint;
    private final Typeface boldTypeface;
    private final Paint circlePaint;
    private final float circleRadius;
    private final Paint dottedLinePaint;
    private final float extraTextSpacing;
    private final float fontSize;
    private final Paint linePaint;
    private int primaryColor;
    private final TextPaint primaryTextPaint;
    private final Rect rect;
    private final Typeface regularTypeface;
    private int secondaryColor;
    private final TextPaint secondaryTextPaint;
    private final float strokeWidth;
    private final float textSpacing;

    public abstract void bind(OptionExerciseEducationContext educationContext);

    protected abstract void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6);

    protected abstract float getBarCenterY();

    protected abstract float getDividerHeight();

    protected abstract int getTargetHeight();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseWarningVisualizationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.barHeight = ViewsKt.getDimension(this, C24704R.dimen.exercise_warning_bar_height);
        float dimension = ViewsKt.getDimension(this, C24704R.dimen.exercise_warning_line_stroke);
        this.strokeWidth = dimension;
        this.circleRadius = ViewsKt.getDimension(this, C24704R.dimen.exercise_warning_nub_radius);
        float dimension2 = ViewsKt.getDimension(this, C13997R.dimen.text_size_mobius_regular_small);
        this.fontSize = dimension2;
        float dimension3 = ViewsKt.getDimension(this, C13997R.dimen.rds_spacing_small);
        this.textSpacing = dimension3;
        this.extraTextSpacing = dimension3 * 1.5f;
        this.primaryColor = ThemeColors.getThemeColor(context, R.attr.textColorPrimary);
        this.secondaryColor = ThemeColors.getThemeColor(context, R.attr.textColorSecondary);
        int color = context.getColor(C24704R.color.option_exercise_warning_visualization_bar);
        this.barColor = color;
        Typeface typefaceLoad = RhTypeface.REGULAR.load(context);
        this.regularTypeface = typefaceLoad;
        Typeface typefaceLoad2 = RhTypeface.BOLD.load(context);
        this.boldTypeface = typefaceLoad2;
        this.rect = new Rect();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(typefaceLoad);
        textPaint.setTextSize(dimension2);
        textPaint.setColor(this.primaryColor);
        this.primaryTextPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(typefaceLoad);
        textPaint2.setTextSize(dimension2);
        textPaint2.setColor(this.secondaryColor);
        this.secondaryTextPaint = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        textPaint3.setTypeface(typefaceLoad2);
        textPaint3.setTextSize(dimension2);
        textPaint3.setColor(this.primaryColor);
        this.boldTextPaint = textPaint3;
        Paint paint = new Paint(1);
        paint.setColor(color);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.barPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.primaryColor);
        paint2.setStyle(style);
        this.circlePaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(this.primaryColor);
        paint3.setStrokeWidth(dimension);
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        this.linePaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(this.primaryColor);
        paint4.setStrokeWidth(dimension);
        paint4.setStyle(style2);
        paint4.setPathEffect(new DashPathEffect(new float[]{paint4.getStrokeWidth(), 3 * paint4.getStrokeWidth()}, 0.0f));
        this.dottedLinePaint = paint4;
    }

    protected final float getStrokeWidth() {
        return this.strokeWidth;
    }

    protected final float getFontSize() {
        return this.fontSize;
    }

    protected final float getTextSpacing() {
        return this.textSpacing;
    }

    protected final float getExtraTextSpacing() {
        return this.extraTextSpacing;
    }

    protected final TextPaint getPrimaryTextPaint() {
        return this.primaryTextPaint;
    }

    protected final TextPaint getSecondaryTextPaint() {
        return this.secondaryTextPaint;
    }

    protected final TextPaint getBoldTextPaint() {
        return this.boldTextPaint;
    }

    protected final Paint getBarPaint() {
        return this.barPaint;
    }

    protected final Paint getLinePaint() {
        return this.linePaint;
    }

    protected final Paint getDottedLinePaint() {
        return this.dottedLinePaint;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(Views.baseActivity(this).getDayNightStyleChanges()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExerciseWarningVisualizationView.onAttachedToWindow$lambda$7(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$7(ExerciseWarningVisualizationView exerciseWarningVisualizationView, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context context = exerciseWarningVisualizationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        exerciseWarningVisualizationView.primaryColor = ThemeColors.getThemeColor(context, R.attr.textColorPrimary);
        Context context2 = exerciseWarningVisualizationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        exerciseWarningVisualizationView.secondaryColor = ThemeColors.getThemeColor(context2, R.attr.textColorSecondary);
        exerciseWarningVisualizationView.circlePaint.setColor(exerciseWarningVisualizationView.primaryColor);
        exerciseWarningVisualizationView.linePaint.setColor(exerciseWarningVisualizationView.primaryColor);
        exerciseWarningVisualizationView.dottedLinePaint.setColor(exerciseWarningVisualizationView.primaryColor);
        exerciseWarningVisualizationView.primaryTextPaint.setColor(exerciseWarningVisualizationView.primaryColor);
        exerciseWarningVisualizationView.boldTextPaint.setColor(exerciseWarningVisualizationView.primaryColor);
        exerciseWarningVisualizationView.secondaryTextPaint.setColor(exerciseWarningVisualizationView.secondaryColor);
        exerciseWarningVisualizationView.invalidate();
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), getTargetHeight());
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.getClipBounds(this.rect);
        float f = this.rect.left;
        float f2 = this.circleRadius;
        float f3 = f + f2;
        float f4 = r0.right - f2;
        float f5 = 2;
        float dividerHeight = getDividerHeight() / f5;
        float f6 = this.barHeight / f5;
        float barCenterY = getBarCenterY();
        draw(canvas, barCenterY - dividerHeight, barCenterY + dividerHeight, f3, f4, barCenterY - f6, barCenterY + f6);
    }

    protected final void drawNub(Canvas canvas, float f, float f2) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        canvas.drawCircle(f, f2, this.circleRadius, this.circlePaint);
    }

    protected final Tuples2<Float, Float> getTextBounds(String text, TextPaint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, text.length(), this.rect);
        return Tuples4.m3642to(Float.valueOf(this.rect.height()), Float.valueOf(this.rect.width()));
    }

    protected final LabelPriceBounds getLabelPriceBounds(String label, String price, TextPaint paint) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Tuples2<Float, Float> textBounds = getTextBounds(label, paint);
        float fFloatValue = textBounds.component1().floatValue();
        float fFloatValue2 = textBounds.component2().floatValue();
        Tuples2<Float, Float> textBounds2 = getTextBounds(price, paint);
        return new LabelPriceBounds(fFloatValue, fFloatValue2, textBounds2.component1().floatValue(), textBounds2.component2().floatValue());
    }

    /* compiled from: ExerciseWarningVisualizationView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/ExerciseWarningVisualizationView$LabelPriceBounds;", "", "labelHeight", "", "labelWidth", "priceHeight", "priceWidth", "<init>", "(FFFF)V", "getLabelHeight", "()F", "getLabelWidth", "getPriceHeight", "getPriceWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LabelPriceBounds {
        public static final int $stable = 0;
        private final float labelHeight;
        private final float labelWidth;
        private final float priceHeight;
        private final float priceWidth;

        public static /* synthetic */ LabelPriceBounds copy$default(LabelPriceBounds labelPriceBounds, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = labelPriceBounds.labelHeight;
            }
            if ((i & 2) != 0) {
                f2 = labelPriceBounds.labelWidth;
            }
            if ((i & 4) != 0) {
                f3 = labelPriceBounds.priceHeight;
            }
            if ((i & 8) != 0) {
                f4 = labelPriceBounds.priceWidth;
            }
            return labelPriceBounds.copy(f, f2, f3, f4);
        }

        /* renamed from: component1, reason: from getter */
        public final float getLabelHeight() {
            return this.labelHeight;
        }

        /* renamed from: component2, reason: from getter */
        public final float getLabelWidth() {
            return this.labelWidth;
        }

        /* renamed from: component3, reason: from getter */
        public final float getPriceHeight() {
            return this.priceHeight;
        }

        /* renamed from: component4, reason: from getter */
        public final float getPriceWidth() {
            return this.priceWidth;
        }

        public final LabelPriceBounds copy(float labelHeight, float labelWidth, float priceHeight, float priceWidth) {
            return new LabelPriceBounds(labelHeight, labelWidth, priceHeight, priceWidth);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LabelPriceBounds)) {
                return false;
            }
            LabelPriceBounds labelPriceBounds = (LabelPriceBounds) other;
            return Float.compare(this.labelHeight, labelPriceBounds.labelHeight) == 0 && Float.compare(this.labelWidth, labelPriceBounds.labelWidth) == 0 && Float.compare(this.priceHeight, labelPriceBounds.priceHeight) == 0 && Float.compare(this.priceWidth, labelPriceBounds.priceWidth) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.labelHeight) * 31) + Float.hashCode(this.labelWidth)) * 31) + Float.hashCode(this.priceHeight)) * 31) + Float.hashCode(this.priceWidth);
        }

        public String toString() {
            return "LabelPriceBounds(labelHeight=" + this.labelHeight + ", labelWidth=" + this.labelWidth + ", priceHeight=" + this.priceHeight + ", priceWidth=" + this.priceWidth + ")";
        }

        public LabelPriceBounds(float f, float f2, float f3, float f4) {
            this.labelHeight = f;
            this.labelWidth = f2;
            this.priceHeight = f3;
            this.priceWidth = f4;
        }

        public final float getLabelHeight() {
            return this.labelHeight;
        }

        public final float getLabelWidth() {
            return this.labelWidth;
        }

        public final float getPriceHeight() {
            return this.priceHeight;
        }

        public final float getPriceWidth() {
            return this.priceWidth;
        }
    }
}
