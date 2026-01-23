package com.robinhood.android.optionsexercise.education;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView;
import com.robinhood.android.optionsexercise.education.OptionExerciseEducationContext;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.util.Money;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtmVisualizationView.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J<\u0010 \u001a\u00020\u001a*\u00020!2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0014H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OtmVisualizationView;", "Lcom/robinhood/android/optionsexercise/education/ExerciseWarningVisualizationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sharePrice", "", "strikePrice", "contractType", "Lcom/robinhood/models/db/OptionContractType;", "warningType", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext$OtmWarningType;", "sharePriceLabel", "strikePriceLabel", "otmLabel", "itmLabel", "dividerHeight", "", "getDividerHeight", "()F", "itmBarSpacing", "otmBarSpacing", "bind", "", "educationContext", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "getBarCenterY", "getTargetHeight", "", "draw", "Landroid/graphics/Canvas;", "dividerTop", "dividerBottom", "barLeft", "barRight", "barTop", "barBottom", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OtmVisualizationView extends ExerciseWarningVisualizationView {
    private OptionContractType contractType;
    private final float dividerHeight;
    private final float itmBarSpacing;
    private final String itmLabel;
    private final float otmBarSpacing;
    private final String otmLabel;
    private String sharePrice;
    private final String sharePriceLabel;
    private String strikePrice;
    private final String strikePriceLabel;
    private OptionExerciseEducationContext.OtmWarningType warningType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OtmVisualizationView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionExerciseEducationContext.OtmWarningType.values().length];
            try {
                iArr[OptionExerciseEducationContext.OtmWarningType.OTM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionExerciseEducationContext.OtmWarningType.ALMOST_OTM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionContractType.values().length];
            try {
                iArr2[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtmVisualizationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.sharePriceLabel = ViewsKt.getString(this, C24704R.string.exercise_warning_visualization_share_label);
        this.strikePriceLabel = ViewsKt.getString(this, C24704R.string.exercise_warning_visualization_strike_label);
        this.otmLabel = ViewsKt.getString(this, C24704R.string.exercise_warning_visualization_otm_label);
        this.itmLabel = ViewsKt.getString(this, C24704R.string.exercise_warning_visualization_itm_label);
        this.dividerHeight = ViewsKt.getDimension(this, C24704R.dimen.exercise_otm_warning_divider_height);
        this.itmBarSpacing = ViewsKt.getDimension(this, C24704R.dimen.exercise_warning_itm_bar_spacing);
        this.otmBarSpacing = ViewsKt.getDimension(this, C24704R.dimen.exercise_warning_otm_bar_spacing);
    }

    @Override // com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView
    protected float getDividerHeight() {
        return this.dividerHeight;
    }

    @Override // com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView
    public void bind(OptionExerciseEducationContext educationContext) {
        Intrinsics.checkNotNullParameter(educationContext, "educationContext");
        this.sharePrice = Money.format$default(educationContext.getEquityPrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        this.contractType = educationContext.getOptionInstrument().getContractType();
        this.strikePrice = Money.format$default(educationContext.getStrikePrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        this.warningType = educationContext.getShowOtmWarning();
    }

    @Override // com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView
    protected float getBarCenterY() {
        String str = this.sharePriceLabel;
        String str2 = this.sharePrice;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharePrice");
            str2 = null;
        }
        ExerciseWarningVisualizationView.LabelPriceBounds labelPriceBounds = getLabelPriceBounds(str, str2, getBoldTextPaint());
        return getTextSpacing() + labelPriceBounds.getLabelHeight() + getTextSpacing() + labelPriceBounds.getPriceHeight() + getExtraTextSpacing() + (getDividerHeight() / 2);
    }

    @Override // com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView
    protected int getTargetHeight() {
        return (int) (getBarCenterY() + (getDividerHeight() / 2) + getExtraTextSpacing() + getTextBounds(this.itmLabel, getPrimaryTextPaint()).getFirst().floatValue() + getTextSpacing());
    }

    @Override // com.robinhood.android.optionsexercise.education.ExerciseWarningVisualizationView
    protected void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        boolean z2;
        float f7;
        float f8;
        Canvas canvas2;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        String str;
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        OptionExerciseEducationContext.OtmWarningType otmWarningType = this.warningType;
        if (otmWarningType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("warningType");
            otmWarningType = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[otmWarningType.ordinal()];
        if (i == 1) {
            z = true;
        } else {
            if (i != 2) {
                throw new IllegalStateException("Tried to show a warning for NOT_OTM state");
            }
            z = false;
        }
        OptionContractType optionContractType = this.contractType;
        if (optionContractType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contractType");
            optionContractType = null;
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i2 = iArr[optionContractType.ordinal()];
        if (i2 == 1) {
            z2 = z;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z2 = !z;
        }
        float f14 = z ? this.otmBarSpacing : this.itmBarSpacing;
        float f15 = 2;
        float f16 = (f3 + f4) / f15;
        float f17 = z2 ? f16 - f14 : f14 + f16;
        float f18 = z2 ? f3 : f16;
        float f19 = z2 ? f16 : f4;
        canvas.drawRect(f18, f5, f19, f6, getBarPaint());
        canvas.drawRect(f18, f5, f19, f6, getLinePaint());
        float strokeWidth = getStrokeWidth() / f15;
        float f20 = z2 ? f4 : f3;
        float f21 = z2 ? f4 + strokeWidth : f3 - strokeWidth;
        canvas.drawLine(f20, f5 - strokeWidth, f20, f6 + strokeWidth, getDottedLinePaint());
        canvas.drawLine(f21, f5, f16, f5, getDottedLinePaint());
        canvas.drawLine(f21, f6, f16, f6, getDottedLinePaint());
        canvas.drawLine(f16, f, f16, f2, getLinePaint());
        drawNub(canvas, f16, f);
        canvas.drawLine(f17, f, f17, f6, getLinePaint());
        drawNub(canvas, f17, f);
        if (z2) {
            f7 = f16;
            f8 = f17;
            canvas.drawLine(f3, f2, f7, f2, getLinePaint());
        } else {
            f7 = f16;
            f8 = f17;
            canvas.drawLine(f4, f2, f7, f2, getLinePaint());
        }
        if (z2) {
            canvas2 = canvas;
            f9 = f2;
            canvas2.drawLine(f4, f9, f7, f2, getDottedLinePaint());
            f10 = f3;
            f11 = f4;
        } else {
            canvas2 = canvas;
            f9 = f2;
            f10 = f3;
            f11 = f4;
            canvas2.drawLine(f10, f9, f7, f2, getDottedLinePaint());
        }
        drawNub(canvas2, f10, f9);
        drawNub(canvas2, f7, f9);
        drawNub(canvas2, f11, f9);
        TextPaint primaryTextPaint = z ? getPrimaryTextPaint() : getSecondaryTextPaint();
        Tuples2<Float, Float> textBounds = getTextBounds(this.otmLabel, primaryTextPaint);
        float fFloatValue = textBounds.component1().floatValue();
        float fFloatValue2 = textBounds.component2().floatValue();
        OptionContractType optionContractType2 = this.contractType;
        if (optionContractType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contractType");
            optionContractType2 = null;
        }
        int i3 = iArr[optionContractType2.ordinal()];
        if (i3 == 1) {
            f12 = f10 + f7;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f12 = f11 + f7;
        }
        canvas2.drawText(this.otmLabel, (f12 / f15) - (fFloatValue2 / f15), f9 + fFloatValue + getExtraTextSpacing(), primaryTextPaint);
        TextPaint secondaryTextPaint = z ? getSecondaryTextPaint() : getPrimaryTextPaint();
        Tuples2<Float, Float> textBounds2 = getTextBounds(this.itmLabel, secondaryTextPaint);
        float fFloatValue3 = textBounds2.component1().floatValue();
        float fFloatValue4 = textBounds2.component2().floatValue();
        OptionContractType optionContractType3 = this.contractType;
        if (optionContractType3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contractType");
            optionContractType3 = null;
        }
        int i4 = iArr[optionContractType3.ordinal()];
        if (i4 == 1) {
            f13 = f11 + f7;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f13 = f10 + f7;
        }
        canvas2.drawText(this.itmLabel, (f13 / f15) - (fFloatValue4 / f15), f9 + fFloatValue3 + getExtraTextSpacing(), secondaryTextPaint);
        String str2 = this.sharePriceLabel;
        String str3 = this.sharePrice;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharePrice");
            str3 = null;
        }
        ExerciseWarningVisualizationView.LabelPriceBounds labelPriceBounds = getLabelPriceBounds(str2, str3, getBoldTextPaint());
        float labelWidth = labelPriceBounds.getLabelWidth();
        float priceHeight = labelPriceBounds.getPriceHeight();
        float priceWidth = z2 ? f8 - labelPriceBounds.getPriceWidth() : f8;
        float extraTextSpacing = f - getExtraTextSpacing();
        if (z2) {
            f8 -= labelWidth;
        }
        canvas2.drawText(this.sharePriceLabel, f8, (extraTextSpacing - priceHeight) - getTextSpacing(), getBoldTextPaint());
        String str4 = this.sharePrice;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharePrice");
            str4 = null;
        }
        canvas2.drawText(str4, priceWidth, extraTextSpacing, getBoldTextPaint());
        String str5 = this.strikePriceLabel;
        String str6 = this.strikePrice;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("strikePrice");
            str6 = null;
        }
        ExerciseWarningVisualizationView.LabelPriceBounds labelPriceBounds2 = getLabelPriceBounds(str5, str6, getPrimaryTextPaint());
        float labelWidth2 = labelPriceBounds2.getLabelWidth();
        float priceHeight2 = labelPriceBounds2.getPriceHeight();
        float priceWidth2 = z2 ? f7 : f7 - labelPriceBounds2.getPriceWidth();
        float extraTextSpacing2 = f - getExtraTextSpacing();
        canvas2.drawText(this.strikePriceLabel, z2 ? f7 : f7 - labelWidth2, (extraTextSpacing2 - priceHeight2) - getTextSpacing(), getPrimaryTextPaint());
        String str7 = this.strikePrice;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("strikePrice");
            str = null;
        } else {
            str = str7;
        }
        canvas2.drawText(str, priceWidth2, extraTextSpacing2, getPrimaryTextPaint());
    }

    /* compiled from: OtmVisualizationView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OtmVisualizationView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/optionsexercise/education/OtmVisualizationView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OtmVisualizationView> {
        private final /* synthetic */ Inflater<OtmVisualizationView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OtmVisualizationView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OtmVisualizationView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C24704R.layout.include_otm_visualization_view);
        }
    }
}
