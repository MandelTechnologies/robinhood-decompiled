package com.robinhood.android.trade.options.profitloss;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossPaintCache.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010^\u001a\u00020?2\u0006\u0010_\u001a\u00020`R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u001b\u0010,\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u001b\u00102\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b3\u0010/R\u001b\u00105\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b6\u0010/R\u001b\u00108\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b9\u0010/R\u001b\u0010;\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b<\u0010/R\u001b\u0010>\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\b@\u0010AR\u001b\u0010C\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\bD\u0010AR\u001b\u0010F\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\bG\u0010AR\u001b\u0010I\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u00101\u001a\u0004\bJ\u0010AR\u001b\u0010L\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bM\u0010AR\u001b\u0010O\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u00101\u001a\u0004\bP\u0010AR\u001b\u0010R\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u00101\u001a\u0004\bS\u0010AR\u001b\u0010U\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u00101\u001a\u0004\bV\u0010AR\u001b\u0010X\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u00101\u001a\u0004\bY\u0010AR\u001b\u0010[\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u00101\u001a\u0004\b\\\u0010A¨\u0006a"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;", "", "fontSize", "", "primaryTextColor", "", "secondaryTextColor", "lineColor", "underlyingLineColor", "negativeLineColor", "positiveLineColor", "negativeAreaColor", "positiveAreaColor", "lineWidth", "pointRadius", "selectedPointRadius", "sparklineWidth", "signLeftPadding", "signRightPadding", "regularTypeface", "Landroid/graphics/Typeface;", "boldTypeface", "<init>", "(FIIIIIIIIFFFFFFLandroid/graphics/Typeface;Landroid/graphics/Typeface;)V", "getFontSize", "()F", "getPrimaryTextColor", "()I", "getSecondaryTextColor", "getLineColor", "getUnderlyingLineColor", "getNegativeLineColor", "getPositiveLineColor", "getNegativeAreaColor", "getPositiveAreaColor", "getLineWidth", "getPointRadius", "getSelectedPointRadius", "getSparklineWidth", "getSignLeftPadding", "getSignRightPadding", "getRegularTypeface", "()Landroid/graphics/Typeface;", "getBoldTypeface", "centeredPrimaryTextPaint", "Landroid/text/TextPaint;", "getCenteredPrimaryTextPaint", "()Landroid/text/TextPaint;", "centeredPrimaryTextPaint$delegate", "Lkotlin/Lazy;", "centeredSecondaryTextPaint", "getCenteredSecondaryTextPaint", "centeredSecondaryTextPaint$delegate", "centeredBoldTextPaint", "getCenteredBoldTextPaint", "centeredBoldTextPaint$delegate", "leftAlignedSecondaryTextPaint", "getLeftAlignedSecondaryTextPaint", "leftAlignedSecondaryTextPaint$delegate", "leftAlignedBoldTextPaint", "getLeftAlignedBoldTextPaint", "leftAlignedBoldTextPaint$delegate", "dottedBorderPaint", "Landroid/graphics/Paint;", "getDottedBorderPaint", "()Landroid/graphics/Paint;", "dottedBorderPaint$delegate", "solidLinePaint", "getSolidLinePaint", "solidLinePaint$delegate", "underlyingLinePaint", "getUnderlyingLinePaint", "underlyingLinePaint$delegate", "negativeLinePaint", "getNegativeLinePaint", "negativeLinePaint$delegate", "positiveLinePaint", "getPositiveLinePaint", "positiveLinePaint$delegate", "neutralFillPaint", "getNeutralFillPaint", "neutralFillPaint$delegate", "negativeFillPaint", "getNegativeFillPaint", "negativeFillPaint$delegate", "positiveFillPaint", "getPositiveFillPaint", "positiveFillPaint$delegate", "negativeAreaPaint", "getNegativeAreaPaint", "negativeAreaPaint$delegate", "positiveAreaPaint", "getPositiveAreaPaint", "positiveAreaPaint$delegate", "getFillPaint", "profitLossDirection", "Lcom/robinhood/android/trade/options/profitloss/ProfitLossDirection;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OptionsProfitLossPaintCache {
    public static final int $stable = 8;
    private final Typeface boldTypeface;

    /* renamed from: centeredBoldTextPaint$delegate, reason: from kotlin metadata */
    private final Lazy centeredBoldTextPaint;

    /* renamed from: centeredPrimaryTextPaint$delegate, reason: from kotlin metadata */
    private final Lazy centeredPrimaryTextPaint;

    /* renamed from: centeredSecondaryTextPaint$delegate, reason: from kotlin metadata */
    private final Lazy centeredSecondaryTextPaint;

    /* renamed from: dottedBorderPaint$delegate, reason: from kotlin metadata */
    private final Lazy dottedBorderPaint;
    private final float fontSize;

    /* renamed from: leftAlignedBoldTextPaint$delegate, reason: from kotlin metadata */
    private final Lazy leftAlignedBoldTextPaint;

    /* renamed from: leftAlignedSecondaryTextPaint$delegate, reason: from kotlin metadata */
    private final Lazy leftAlignedSecondaryTextPaint;
    private final int lineColor;
    private final float lineWidth;
    private final int negativeAreaColor;

    /* renamed from: negativeAreaPaint$delegate, reason: from kotlin metadata */
    private final Lazy negativeAreaPaint;

    /* renamed from: negativeFillPaint$delegate, reason: from kotlin metadata */
    private final Lazy negativeFillPaint;
    private final int negativeLineColor;

    /* renamed from: negativeLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy negativeLinePaint;

    /* renamed from: neutralFillPaint$delegate, reason: from kotlin metadata */
    private final Lazy neutralFillPaint;
    private final float pointRadius;
    private final int positiveAreaColor;

    /* renamed from: positiveAreaPaint$delegate, reason: from kotlin metadata */
    private final Lazy positiveAreaPaint;

    /* renamed from: positiveFillPaint$delegate, reason: from kotlin metadata */
    private final Lazy positiveFillPaint;
    private final int positiveLineColor;

    /* renamed from: positiveLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy positiveLinePaint;
    private final int primaryTextColor;
    private final Typeface regularTypeface;
    private final int secondaryTextColor;
    private final float selectedPointRadius;
    private final float signLeftPadding;
    private final float signRightPadding;

    /* renamed from: solidLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy solidLinePaint;
    private final float sparklineWidth;
    private final int underlyingLineColor;

    /* renamed from: underlyingLinePaint$delegate, reason: from kotlin metadata */
    private final Lazy underlyingLinePaint;

    /* compiled from: OptionsProfitLossPaintCache.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfitLossDirection.values().length];
            try {
                iArr[ProfitLossDirection.PROFIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfitLossDirection.LOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfitLossDirection.BREAKEVEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OptionsProfitLossPaintCache(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2, float f3, float f4, float f5, float f6, float f7, Typeface regularTypeface, Typeface boldTypeface) {
        Intrinsics.checkNotNullParameter(regularTypeface, "regularTypeface");
        Intrinsics.checkNotNullParameter(boldTypeface, "boldTypeface");
        this.fontSize = f;
        this.primaryTextColor = i;
        this.secondaryTextColor = i2;
        this.lineColor = i3;
        this.underlyingLineColor = i4;
        this.negativeLineColor = i5;
        this.positiveLineColor = i6;
        this.negativeAreaColor = i7;
        this.positiveAreaColor = i8;
        this.lineWidth = f2;
        this.pointRadius = f3;
        this.selectedPointRadius = f4;
        this.sparklineWidth = f5;
        this.signLeftPadding = f6;
        this.signRightPadding = f7;
        this.regularTypeface = regularTypeface;
        this.boldTypeface = boldTypeface;
        this.centeredPrimaryTextPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.centeredPrimaryTextPaint_delegate$lambda$1(this.f$0);
            }
        });
        this.centeredSecondaryTextPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.centeredSecondaryTextPaint_delegate$lambda$3(this.f$0);
            }
        });
        this.centeredBoldTextPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.centeredBoldTextPaint_delegate$lambda$5(this.f$0);
            }
        });
        this.leftAlignedSecondaryTextPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.leftAlignedSecondaryTextPaint_delegate$lambda$7(this.f$0);
            }
        });
        this.leftAlignedBoldTextPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.leftAlignedBoldTextPaint_delegate$lambda$9(this.f$0);
            }
        });
        this.dottedBorderPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.dottedBorderPaint_delegate$lambda$11(this.f$0);
            }
        });
        this.solidLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.solidLinePaint_delegate$lambda$13(this.f$0);
            }
        });
        this.underlyingLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.underlyingLinePaint_delegate$lambda$15(this.f$0);
            }
        });
        this.negativeLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.negativeLinePaint_delegate$lambda$17(this.f$0);
            }
        });
        this.positiveLinePaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.positiveLinePaint_delegate$lambda$19(this.f$0);
            }
        });
        this.neutralFillPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.neutralFillPaint_delegate$lambda$21(this.f$0);
            }
        });
        this.negativeFillPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.negativeFillPaint_delegate$lambda$23(this.f$0);
            }
        });
        this.positiveFillPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.positiveFillPaint_delegate$lambda$25(this.f$0);
            }
        });
        this.negativeAreaPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.negativeAreaPaint_delegate$lambda$27(this.f$0);
            }
        });
        this.positiveAreaPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossPaintCache$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossPaintCache.positiveAreaPaint_delegate$lambda$29(this.f$0);
            }
        });
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final int getPrimaryTextColor() {
        return this.primaryTextColor;
    }

    public final int getSecondaryTextColor() {
        return this.secondaryTextColor;
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    public final int getUnderlyingLineColor() {
        return this.underlyingLineColor;
    }

    public final int getNegativeLineColor() {
        return this.negativeLineColor;
    }

    public final int getPositiveLineColor() {
        return this.positiveLineColor;
    }

    public final int getNegativeAreaColor() {
        return this.negativeAreaColor;
    }

    public final int getPositiveAreaColor() {
        return this.positiveAreaColor;
    }

    public final float getLineWidth() {
        return this.lineWidth;
    }

    public final float getPointRadius() {
        return this.pointRadius;
    }

    public final float getSelectedPointRadius() {
        return this.selectedPointRadius;
    }

    public final float getSparklineWidth() {
        return this.sparklineWidth;
    }

    public final float getSignLeftPadding() {
        return this.signLeftPadding;
    }

    public final float getSignRightPadding() {
        return this.signRightPadding;
    }

    public final Typeface getRegularTypeface() {
        return this.regularTypeface;
    }

    public final Typeface getBoldTypeface() {
        return this.boldTypeface;
    }

    public final TextPaint getCenteredPrimaryTextPaint() {
        return (TextPaint) this.centeredPrimaryTextPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextPaint centeredPrimaryTextPaint_delegate$lambda$1(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(optionsProfitLossPaintCache.regularTypeface);
        textPaint.setTextSize(optionsProfitLossPaintCache.fontSize);
        textPaint.setColor(optionsProfitLossPaintCache.primaryTextColor);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    public final TextPaint getCenteredSecondaryTextPaint() {
        return (TextPaint) this.centeredSecondaryTextPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextPaint centeredSecondaryTextPaint_delegate$lambda$3(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(optionsProfitLossPaintCache.regularTypeface);
        textPaint.setTextSize(optionsProfitLossPaintCache.fontSize);
        textPaint.setColor(optionsProfitLossPaintCache.secondaryTextColor);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    public final TextPaint getCenteredBoldTextPaint() {
        return (TextPaint) this.centeredBoldTextPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextPaint centeredBoldTextPaint_delegate$lambda$5(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(optionsProfitLossPaintCache.boldTypeface);
        textPaint.setTextSize(optionsProfitLossPaintCache.fontSize);
        textPaint.setColor(optionsProfitLossPaintCache.primaryTextColor);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    public final TextPaint getLeftAlignedSecondaryTextPaint() {
        return (TextPaint) this.leftAlignedSecondaryTextPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextPaint leftAlignedSecondaryTextPaint_delegate$lambda$7(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(optionsProfitLossPaintCache.regularTypeface);
        textPaint.setTextSize(optionsProfitLossPaintCache.fontSize);
        textPaint.setColor(optionsProfitLossPaintCache.secondaryTextColor);
        textPaint.setTextAlign(Paint.Align.LEFT);
        return textPaint;
    }

    public final TextPaint getLeftAlignedBoldTextPaint() {
        return (TextPaint) this.leftAlignedBoldTextPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextPaint leftAlignedBoldTextPaint_delegate$lambda$9(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(optionsProfitLossPaintCache.boldTypeface);
        textPaint.setTextSize(optionsProfitLossPaintCache.fontSize);
        textPaint.setColor(optionsProfitLossPaintCache.primaryTextColor);
        textPaint.setTextAlign(Paint.Align.LEFT);
        return textPaint;
    }

    public final Paint getDottedBorderPaint() {
        return (Paint) this.dottedBorderPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint dottedBorderPaint_delegate$lambda$11(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(optionsProfitLossPaintCache.lineColor);
        paint.setStrokeWidth(optionsProfitLossPaintCache.lineWidth);
        paint.setStyle(Paint.Style.STROKE);
        float f = optionsProfitLossPaintCache.lineWidth;
        paint.setPathEffect(new DashPathEffect(new float[]{f, 3 * f}, 0.0f));
        return paint;
    }

    public final Paint getSolidLinePaint() {
        return (Paint) this.solidLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint solidLinePaint_delegate$lambda$13(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(optionsProfitLossPaintCache.lineColor);
        paint.setStrokeWidth(optionsProfitLossPaintCache.lineWidth);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    public final Paint getUnderlyingLinePaint() {
        return (Paint) this.underlyingLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint underlyingLinePaint_delegate$lambda$15(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(optionsProfitLossPaintCache.underlyingLineColor);
        paint.setStrokeWidth(optionsProfitLossPaintCache.lineWidth);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    public final Paint getNegativeLinePaint() {
        return (Paint) this.negativeLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint negativeLinePaint_delegate$lambda$17(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(optionsProfitLossPaintCache.negativeLineColor);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(optionsProfitLossPaintCache.sparklineWidth);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    public final Paint getPositiveLinePaint() {
        return (Paint) this.positiveLinePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint positiveLinePaint_delegate$lambda$19(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(optionsProfitLossPaintCache.positiveLineColor);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(optionsProfitLossPaintCache.sparklineWidth);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    public final Paint getNeutralFillPaint() {
        return (Paint) this.neutralFillPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint neutralFillPaint_delegate$lambda$21(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(optionsProfitLossPaintCache.lineColor);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    public final Paint getNegativeFillPaint() {
        return (Paint) this.negativeFillPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint negativeFillPaint_delegate$lambda$23(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(optionsProfitLossPaintCache.negativeLineColor);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    public final Paint getPositiveFillPaint() {
        return (Paint) this.positiveFillPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint positiveFillPaint_delegate$lambda$25(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(optionsProfitLossPaintCache.positiveLineColor);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    public final Paint getNegativeAreaPaint() {
        return (Paint) this.negativeAreaPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint negativeAreaPaint_delegate$lambda$27(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(optionsProfitLossPaintCache.negativeAreaColor);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    public final Paint getPositiveAreaPaint() {
        return (Paint) this.positiveAreaPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint positiveAreaPaint_delegate$lambda$29(OptionsProfitLossPaintCache optionsProfitLossPaintCache) {
        Paint paint = new Paint(1);
        paint.setColor(optionsProfitLossPaintCache.positiveAreaColor);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    public final Paint getFillPaint(ProfitLossDirection profitLossDirection) {
        Intrinsics.checkNotNullParameter(profitLossDirection, "profitLossDirection");
        int i = WhenMappings.$EnumSwitchMapping$0[profitLossDirection.ordinal()];
        if (i == 1) {
            return getPositiveFillPaint();
        }
        if (i == 2) {
            return getNegativeFillPaint();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return getNeutralFillPaint();
    }
}
