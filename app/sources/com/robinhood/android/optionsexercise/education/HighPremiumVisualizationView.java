package com.robinhood.android.optionsexercise.education;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView;
import com.robinhood.models.util.Money;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: HighPremiumVisualizationView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014J<\u0010\u001a\u001a\u00020\u0014*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0014R\u0014\u0010\b\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/HighPremiumVisualizationView;", "Lcom/robinhood/android/optionsexercise/education/ExerciseWarningVisualizationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dividerHeight", "", "getDividerHeight", "()F", "extrinsicLabel", "", "intrinsicLabel", "contractPremiumText", "extrinsicPrice", "intrinsicPrice", "dividerPosition", "bind", "", "educationContext", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "getBarCenterY", "getTargetHeight", "", "draw", "Landroid/graphics/Canvas;", "dividerTop", "dividerBottom", "barLeft", "barRight", "barTop", "barBottom", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class HighPremiumVisualizationView extends ExerciseWarningVisualizationView {
    private String contractPremiumText;
    private final float dividerHeight;
    private float dividerPosition;
    private final String extrinsicLabel;
    private String extrinsicPrice;
    private final String intrinsicLabel;
    private String intrinsicPrice;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighPremiumVisualizationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dividerHeight = ViewsKt.getDimension(this, C24704R.dimen.exercise_premium_warning_divider_height);
        this.extrinsicLabel = ViewsKt.getString(this, C24704R.string.exercise_warning_visualization_extrinsic_label);
        this.intrinsicLabel = ViewsKt.getString(this, C24704R.string.exercise_warning_visualization_intrinsic_label);
        this.dividerPosition = 0.5f;
    }

    @Override // com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView
    protected float getDividerHeight() {
        return this.dividerHeight;
    }

    @Override // com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView
    public void bind(OptionExerciseEducationContext educationContext) {
        Intrinsics.checkNotNullParameter(educationContext, "educationContext");
        this.extrinsicPrice = Money.format$default(educationContext.getExtrinsicValue(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        this.intrinsicPrice = Money.format$default(educationContext.getIntrinsicValue(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        this.contractPremiumText = ViewsKt.getString(this, C24704R.string.exercise_warning_visualization_contract_premium, Money.format$default(educationContext.getPremium(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        this.dividerPosition = educationContext.getExtrinsicValue().div(educationContext.getPremium()).floatValue();
    }

    @Override // com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView
    protected float getBarCenterY() {
        String str = this.contractPremiumText;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contractPremiumText");
            str = null;
        }
        return getTextSpacing() + getTextBounds(str, getPrimaryTextPaint()).getFirst().floatValue() + getExtraTextSpacing() + (getDividerHeight() / 2);
    }

    @Override // com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView
    protected int getTargetHeight() {
        String str = this.extrinsicLabel;
        String str2 = this.extrinsicPrice;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("extrinsicPrice");
            str2 = null;
        }
        ExerciseWarningVisualizationView.LabelPriceBounds labelPriceBounds = getLabelPriceBounds(str, str2, getBoldTextPaint());
        float f = 2;
        return (int) (getBarCenterY() + (getDividerHeight() / f) + getExtraTextSpacing() + labelPriceBounds.getLabelHeight() + (getTextSpacing() * f) + labelPriceBounds.getPriceHeight());
    }

    @Override // com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView
    protected void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        float f7 = ((f4 - f3) * this.dividerPosition) + f3;
        canvas.drawRect(f3, f5, f7, f6, getBarPaint());
        canvas.drawRect(f3, f5, f7, f6, getLinePaint());
        float f8 = 2;
        float strokeWidth = getStrokeWidth() / f8;
        canvas.drawLine(f4, f5 - strokeWidth, f4, f6 + strokeWidth, getDottedLinePaint());
        float f9 = f4 + strokeWidth;
        canvas.drawLine(f9, f5, f7, f5, getDottedLinePaint());
        canvas.drawLine(f9, f6, f7, f6, getDottedLinePaint());
        canvas.drawLine(f7, f, f7, f2, getLinePaint());
        drawNub(canvas, f7, f2);
        canvas.drawLine(f3, f, f4, f, getLinePaint());
        drawNub(canvas, f3, f);
        drawNub(canvas, f4, f);
        canvas.drawLine(f3, f2, f7, f2, getLinePaint());
        drawNub(canvas, f3, f2);
        canvas.drawLine(f4, f2, f7, f2, getDottedLinePaint());
        drawNub(canvas, f4, f2);
        String str = this.contractPremiumText;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contractPremiumText");
            str = null;
        }
        float fFloatValue = ((f3 + f4) / f8) - (getTextBounds(str, getPrimaryTextPaint()).getSecond().floatValue() / f8);
        float extraTextSpacing = f - getExtraTextSpacing();
        String str3 = this.contractPremiumText;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contractPremiumText");
            str3 = null;
        }
        canvas.drawText(str3, fFloatValue, extraTextSpacing, getPrimaryTextPaint());
        String str4 = this.extrinsicLabel;
        String str5 = this.extrinsicPrice;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("extrinsicPrice");
            str5 = null;
        }
        ExerciseWarningVisualizationView.LabelPriceBounds labelPriceBounds = getLabelPriceBounds(str4, str5, getBoldTextPaint());
        float labelHeight = labelPriceBounds.getLabelHeight();
        float labelWidth = labelPriceBounds.getLabelWidth();
        float priceHeight = labelPriceBounds.getPriceHeight();
        float priceWidth = labelPriceBounds.getPriceWidth();
        float f10 = labelWidth / f8;
        float fCoerceAtLeast = RangesKt.coerceAtLeast((f3 + f7) / f8, f3 + f10);
        float f11 = fCoerceAtLeast - f10;
        float extraTextSpacing2 = labelHeight + f2 + getExtraTextSpacing();
        float f12 = fCoerceAtLeast - (priceWidth / f8);
        float textSpacing = priceHeight + extraTextSpacing2 + getTextSpacing();
        canvas.drawText(this.extrinsicLabel, f11, extraTextSpacing2, getBoldTextPaint());
        String str6 = this.extrinsicPrice;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("extrinsicPrice");
            str6 = null;
        }
        canvas.drawText(str6, f12, textSpacing, getBoldTextPaint());
        String str7 = this.intrinsicLabel;
        String str8 = this.intrinsicPrice;
        if (str8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intrinsicPrice");
            str8 = null;
        }
        ExerciseWarningVisualizationView.LabelPriceBounds labelPriceBounds2 = getLabelPriceBounds(str7, str8, getSecondaryTextPaint());
        float labelHeight2 = labelPriceBounds2.getLabelHeight();
        float labelWidth2 = labelPriceBounds2.getLabelWidth();
        float priceHeight2 = labelPriceBounds2.getPriceHeight();
        float priceWidth2 = labelPriceBounds2.getPriceWidth();
        float f13 = labelWidth2 / f8;
        float fCoerceAtMost = RangesKt.coerceAtMost((f7 + f4) / f8, f4 - f13);
        float f14 = fCoerceAtMost - f13;
        float extraTextSpacing3 = f2 + labelHeight2 + getExtraTextSpacing();
        float f15 = fCoerceAtMost - (priceWidth2 / f8);
        float textSpacing2 = priceHeight2 + extraTextSpacing3 + getTextSpacing();
        canvas.drawText(this.intrinsicLabel, f14, extraTextSpacing3, getSecondaryTextPaint());
        String str9 = this.intrinsicPrice;
        if (str9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intrinsicPrice");
        } else {
            str2 = str9;
        }
        canvas.drawText(str2, f15, textSpacing2, getSecondaryTextPaint());
    }

    /* compiled from: HighPremiumVisualizationView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/HighPremiumVisualizationView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/optionsexercise/education/HighPremiumVisualizationView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<HighPremiumVisualizationView> {
        private final /* synthetic */ Inflater<HighPremiumVisualizationView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public HighPremiumVisualizationView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (HighPremiumVisualizationView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C24704R.layout.include_high_premium_visualization_view);
        }
    }
}
