package com.robinhood.android.graph.spark;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GraphViewPaintCache.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\f\u0010[\u001a\u00020\\*\u000205H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0011\u0010\u0019\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u001b\u00104\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b6\u00107R\u001b\u0010:\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b;\u00107R\u001b\u0010=\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b>\u00107R\u001b\u0010@\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bA\u00107R\u001b\u0010C\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bD\u00107R\u001b\u0010F\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u00109\u001a\u0004\bG\u00107R\u001b\u0010I\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u00109\u001a\u0004\bJ\u00107R\u001b\u0010L\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u00109\u001a\u0004\bM\u00107R\u001d\u0010O\u001a\u0004\u0018\u0001058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u00109\u001a\u0004\bP\u00107R\u001b\u0010R\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u00109\u001a\u0004\bS\u00107R\u001b\u0010U\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u00109\u001a\u0004\bV\u00107R\u001b\u0010X\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u00109\u001a\u0004\bY\u00107¨\u0006]"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/GraphViewPaintCache;", "", "fill", "", "screenBackgroundColor", "", "baseLineDashLength", "", "baseLineDashSpacing", "baseLineColor", "baseLineWidth", "cornerRadius", "lineColor", "Landroid/content/res/ColorStateList;", "secondaryLineColor", "lineWidth", "secondaryLineWidth", "prePublicLineColor", "scrubLineWidth", "scrubLineColor", "glowRadius", "glowColor", "etfLineColor", "etfStrokeWidth", "etfDashLength", "etfDashSpacing", "<init>", "(ZIFFIFFLandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;FFIFIFIIFFF)V", "getFill", "()Z", "getScreenBackgroundColor", "()I", "getBaseLineDashLength", "()F", "getBaseLineDashSpacing", "getBaseLineColor", "getBaseLineWidth", "getCornerRadius", "getLineColor", "()Landroid/content/res/ColorStateList;", "getSecondaryLineColor", "getLineWidth", "getSecondaryLineWidth", "getPrePublicLineColor", "getScrubLineWidth", "getScrubLineColor", "getGlowRadius", "getGlowColor", "getEtfLineColor", "getEtfStrokeWidth", "getEtfDashLength", "getEtfDashSpacing", "baseLinePaint", "Landroid/graphics/Paint;", "getBaseLinePaint", "()Landroid/graphics/Paint;", "baseLinePaint$delegate", "Lkotlin/Lazy;", "lowLightBaseLinePaint", "getLowLightBaseLinePaint", "lowLightBaseLinePaint$delegate", "sparkLinePaint", "getSparkLinePaint", "sparkLinePaint$delegate", "secondarySparkLinePaint", "getSecondarySparkLinePaint", "secondarySparkLinePaint$delegate", "highlightedSecondarySparkLinePaint", "getHighlightedSecondarySparkLinePaint", "highlightedSecondarySparkLinePaint$delegate", "lowLightSparkPaint", "getLowLightSparkPaint", "lowLightSparkPaint$delegate", "prePublicLinePaint", "getPrePublicLinePaint", "prePublicLinePaint$delegate", "scrubLinePaint", "getScrubLinePaint", "scrubLinePaint$delegate", "glowPaint", "getGlowPaint", "glowPaint$delegate", "spyLinePaint", "getSpyLinePaint", "spyLinePaint$delegate", "lowLightSpyLinePaint", "getLowLightSpyLinePaint", "lowLightSpyLinePaint$delegate", "annotationDotPaint", "getAnnotationDotPaint", "annotationDotPaint$delegate", "applyCommonLinePaintFlags", "", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GraphViewPaintCache {
    public static final int $stable = 8;

    /* renamed from: annotationDotPaint$delegate, reason: from kotlin metadata */
    private final Lazy annotationDotPaint;
    private final int baseLineColor;
    private final float baseLineDashLength;
    private final float baseLineDashSpacing;

    /* renamed from: baseLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy baseLinePaint;
    private final float baseLineWidth;
    private final float cornerRadius;
    private final float etfDashLength;
    private final float etfDashSpacing;
    private final int etfLineColor;
    private final float etfStrokeWidth;
    private final boolean fill;
    private final int glowColor;

    /* renamed from: glowPaint$delegate, reason: from kotlin metadata */
    private final Lazy glowPaint;
    private final float glowRadius;

    /* renamed from: highlightedSecondarySparkLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy highlightedSecondarySparkLinePaint;
    private final ColorStateList lineColor;
    private final float lineWidth;

    /* renamed from: lowLightBaseLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy lowLightBaseLinePaint;

    /* renamed from: lowLightSparkPaint$delegate, reason: from kotlin metadata */
    private final Lazy lowLightSparkPaint;

    /* renamed from: lowLightSpyLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy lowLightSpyLinePaint;
    private final int prePublicLineColor;

    /* renamed from: prePublicLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy prePublicLinePaint;
    private final int screenBackgroundColor;
    private final int scrubLineColor;

    /* renamed from: scrubLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy scrubLinePaint;
    private final float scrubLineWidth;
    private final ColorStateList secondaryLineColor;
    private final float secondaryLineWidth;

    /* renamed from: secondarySparkLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy secondarySparkLinePaint;

    /* renamed from: sparkLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy sparkLinePaint;

    /* renamed from: spyLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy spyLinePaint;

    public GraphViewPaintCache(boolean z, int i, float f, float f2, int i2, float f3, float f4, ColorStateList lineColor, ColorStateList secondaryLineColor, float f5, float f6, int i3, float f7, int i4, float f8, int i5, int i6, float f9, float f10, float f11) {
        Intrinsics.checkNotNullParameter(lineColor, "lineColor");
        Intrinsics.checkNotNullParameter(secondaryLineColor, "secondaryLineColor");
        this.fill = z;
        this.screenBackgroundColor = i;
        this.baseLineDashLength = f;
        this.baseLineDashSpacing = f2;
        this.baseLineColor = i2;
        this.baseLineWidth = f3;
        this.cornerRadius = f4;
        this.lineColor = lineColor;
        this.secondaryLineColor = secondaryLineColor;
        this.lineWidth = f5;
        this.secondaryLineWidth = f6;
        this.prePublicLineColor = i3;
        this.scrubLineWidth = f7;
        this.scrubLineColor = i4;
        this.glowRadius = f8;
        this.glowColor = i5;
        this.etfLineColor = i6;
        this.etfStrokeWidth = f9;
        this.etfDashLength = f10;
        this.etfDashSpacing = f11;
        this.baseLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.baseLinePaint_delegate$lambda$1(this.f$0);
            }
        });
        this.lowLightBaseLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.lowLightBaseLinePaint_delegate$lambda$3(this.f$0);
            }
        });
        this.sparkLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.sparkLinePaint_delegate$lambda$5(this.f$0);
            }
        });
        this.secondarySparkLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.secondarySparkLinePaint_delegate$lambda$7(this.f$0);
            }
        });
        this.highlightedSecondarySparkLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.highlightedSecondarySparkLinePaint_delegate$lambda$9(this.f$0);
            }
        });
        this.lowLightSparkPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.lowLightSparkPaint_delegate$lambda$11(this.f$0);
            }
        });
        this.prePublicLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.prePublicLinePaint_delegate$lambda$13(this.f$0);
            }
        });
        this.scrubLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.scrubLinePaint_delegate$lambda$15(this.f$0);
            }
        });
        this.glowPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.glowPaint_delegate$lambda$18(this.f$0);
            }
        });
        this.spyLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.spyLinePaint_delegate$lambda$20(this.f$0);
            }
        });
        this.lowLightSpyLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.lowLightSpyLinePaint_delegate$lambda$22(this.f$0);
            }
        });
        this.annotationDotPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphViewPaintCache$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphViewPaintCache.annotationDotPaint_delegate$lambda$24(this.f$0);
            }
        });
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final int getScreenBackgroundColor() {
        return this.screenBackgroundColor;
    }

    public final float getBaseLineDashLength() {
        return this.baseLineDashLength;
    }

    public final float getBaseLineDashSpacing() {
        return this.baseLineDashSpacing;
    }

    public final int getBaseLineColor() {
        return this.baseLineColor;
    }

    public final float getBaseLineWidth() {
        return this.baseLineWidth;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final ColorStateList getLineColor() {
        return this.lineColor;
    }

    public final ColorStateList getSecondaryLineColor() {
        return this.secondaryLineColor;
    }

    public final float getLineWidth() {
        return this.lineWidth;
    }

    public final float getSecondaryLineWidth() {
        return this.secondaryLineWidth;
    }

    public final int getPrePublicLineColor() {
        return this.prePublicLineColor;
    }

    public final float getScrubLineWidth() {
        return this.scrubLineWidth;
    }

    public final int getScrubLineColor() {
        return this.scrubLineColor;
    }

    public final float getGlowRadius() {
        return this.glowRadius;
    }

    public final int getGlowColor() {
        return this.glowColor;
    }

    public final int getEtfLineColor() {
        return this.etfLineColor;
    }

    public final float getEtfStrokeWidth() {
        return this.etfStrokeWidth;
    }

    public final float getEtfDashLength() {
        return this.etfDashLength;
    }

    public final float getEtfDashSpacing() {
        return this.etfDashSpacing;
    }

    public final Paint getBaseLinePaint() {
        return (Paint) this.baseLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint baseLinePaint_delegate$lambda$1(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(graphViewPaintCache.baseLineColor);
        paint.setStrokeWidth(graphViewPaintCache.baseLineWidth);
        paint.setPathEffect(new DashPathEffect(new float[]{graphViewPaintCache.baseLineDashLength, graphViewPaintCache.baseLineDashSpacing}, 0.0f));
        return paint;
    }

    public final Paint getLowLightBaseLinePaint() {
        return (Paint) this.lowLightBaseLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint lowLightBaseLinePaint_delegate$lambda$3(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(graphViewPaintCache.getBaseLinePaint());
        paint.setColor(ColorUtils.blendARGB(graphViewPaintCache.screenBackgroundColor, graphViewPaintCache.baseLineColor, 0.4f));
        return paint;
    }

    public final Paint getSparkLinePaint() {
        return (Paint) this.sparkLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint sparkLinePaint_delegate$lambda$5(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(graphViewPaintCache.lineColor.getDefaultColor());
        paint.setStrokeWidth(graphViewPaintCache.lineWidth);
        graphViewPaintCache.applyCommonLinePaintFlags(paint);
        return paint;
    }

    public final Paint getSecondarySparkLinePaint() {
        return (Paint) this.secondarySparkLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint secondarySparkLinePaint_delegate$lambda$7(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(graphViewPaintCache.secondaryLineColor.getDefaultColor());
        paint.setStrokeWidth(graphViewPaintCache.secondaryLineWidth);
        graphViewPaintCache.applyCommonLinePaintFlags(paint);
        return paint;
    }

    public final Paint getHighlightedSecondarySparkLinePaint() {
        return (Paint) this.highlightedSecondarySparkLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint highlightedSecondarySparkLinePaint_delegate$lambda$9(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(1);
        ColorStateList colorStateList = graphViewPaintCache.secondaryLineColor;
        paint.setColor(colorStateList.getColorForState(new int[]{R.attr.state_selected}, colorStateList.getDefaultColor()));
        paint.setStrokeWidth(graphViewPaintCache.lineWidth);
        graphViewPaintCache.applyCommonLinePaintFlags(paint);
        return paint;
    }

    public final Paint getLowLightSparkPaint() {
        return (Paint) this.lowLightSparkPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint lowLightSparkPaint_delegate$lambda$11(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(graphViewPaintCache.getSparkLinePaint());
        paint.setPathEffect(graphViewPaintCache.getSparkLinePaint().getPathEffect());
        return paint;
    }

    public final Paint getPrePublicLinePaint() {
        return (Paint) this.prePublicLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint prePublicLinePaint_delegate$lambda$13(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(graphViewPaintCache.getSparkLinePaint());
        paint.setColor(graphViewPaintCache.prePublicLineColor);
        return paint;
    }

    public final Paint getScrubLinePaint() {
        return (Paint) this.scrubLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint scrubLinePaint_delegate$lambda$15(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(graphViewPaintCache.scrubLineWidth);
        paint.setColor(graphViewPaintCache.scrubLineColor);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    public final Paint getGlowPaint() {
        return (Paint) this.glowPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint glowPaint_delegate$lambda$18(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(graphViewPaintCache.getSparkLinePaint());
        paint.setColor(graphViewPaintCache.glowColor);
        if (graphViewPaintCache.glowRadius == 0.0f) {
            return null;
        }
        return paint;
    }

    public final Paint getSpyLinePaint() {
        return (Paint) this.spyLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint spyLinePaint_delegate$lambda$20(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(graphViewPaintCache.etfLineColor);
        paint.setStrokeWidth(graphViewPaintCache.etfStrokeWidth);
        paint.setPathEffect(new DashPathEffect(new float[]{graphViewPaintCache.etfDashLength, graphViewPaintCache.etfDashSpacing}, 0.0f));
        return paint;
    }

    public final Paint getLowLightSpyLinePaint() {
        return (Paint) this.lowLightSpyLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint lowLightSpyLinePaint_delegate$lambda$22(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(graphViewPaintCache.getSpyLinePaint());
        paint.setColor(ColorUtils.blendARGB(graphViewPaintCache.screenBackgroundColor, graphViewPaintCache.getSpyLinePaint().getColor(), 0.5f));
        return paint;
    }

    public final Paint getAnnotationDotPaint() {
        return (Paint) this.annotationDotPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint annotationDotPaint_delegate$lambda$24(GraphViewPaintCache graphViewPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(graphViewPaintCache.lineColor.getDefaultColor());
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    private final void applyCommonLinePaintFlags(Paint paint) {
        paint.setStyle(this.fill ? Paint.Style.FILL : Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(this.cornerRadius));
    }
}
