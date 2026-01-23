package com.withpersona.sdk2.inquiry.steps.p423ui.styling;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.utils.extensions.ResourceTypes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.p422ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ViewUtils5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: ButtonStyling.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\f"}, m3636d2 = {ResourceTypes.STYLE, "", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "Landroid/widget/Button;", "isLoading", "", "shouldStyleWidthAndHeight", "getStyledBackground", "Landroid/graphics/drawable/GradientDrawable;", "isEnabled", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ButtonStyling {

    /* compiled from: ButtonStyling.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void style(ButtonWithLoadingIndicator buttonWithLoadingIndicator, ButtonComponentStyling styles) {
        Intrinsics.checkNotNullParameter(buttonWithLoadingIndicator, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        style$default(buttonWithLoadingIndicator.getButton(), styles, false, false, 6, null);
        Integer activeTextColorValue = styles.getActiveTextColorValue();
        if (activeTextColorValue != null) {
            buttonWithLoadingIndicator.getProgressBar().setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{activeTextColorValue.intValue()}));
        }
    }

    public static /* synthetic */ void style$default(Button button, ButtonComponentStyling buttonComponentStyling, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        style(button, buttonComponentStyling, z, z2);
    }

    private static final void style$applyStyles(ButtonComponentStyling buttonComponentStyling, Button button, boolean z, boolean z2) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Integer baseTextColorValue = buttonComponentStyling.getBaseTextColorValue();
        if (baseTextColorValue != null) {
            int iIntValue = baseTextColorValue.intValue();
            Integer activeTextColorValue = buttonComponentStyling.getActiveTextColorValue();
            int iIntValue2 = activeTextColorValue != null ? activeTextColorValue.intValue() : iIntValue;
            Integer disabledTextColorValue = buttonComponentStyling.getDisabledTextColorValue();
            button.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue2, disabledTextColorValue != null ? disabledTextColorValue.intValue() : iIntValue, iIntValue}));
        }
        Double fontSizeValue = buttonComponentStyling.getFontSizeValue();
        if (fontSizeValue != null) {
            button.setTextSize((float) fontSizeValue.doubleValue());
        }
        Double letterSpacingValue = buttonComponentStyling.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            button.setLetterSpacing((float) (letterSpacingValue.doubleValue() / button.getTextSize()));
        }
        String fontNameValue = buttonComponentStyling.getFontNameValue();
        StyleElements.FontWeight fontWeightValue = buttonComponentStyling.getFontWeightValue();
        if (fontWeightValue == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        TextStyling2.setTypeface$default(button, fontNameValue, fontWeightValue, null, 4, null);
        Double lineHeightValue = buttonComponentStyling.getLineHeightValue();
        if (lineHeightValue != null) {
            double dDoubleValue = lineHeightValue.doubleValue();
            if (Build.VERSION.SDK_INT >= 28) {
                button.setLineHeight((int) ExtensionsKt.getDpToPx(dDoubleValue));
            }
        }
        button.setBackground(getStyledBackground(buttonComponentStyling, button.isEnabled(), z));
        button.setBackgroundTintList(null);
        float f = 0.0f;
        button.setElevation(0.0f);
        button.setStateListAnimator(null);
        button.setAllCaps(false);
        Object parent = button.getParent();
        View view = parent instanceof ButtonWithLoadingIndicator ? (View) parent : button;
        StyleElements.SizeSet marginValue = buttonComponentStyling.getMarginValue();
        if (marginValue != null) {
            ViewUtils5.setMargins(button, marginValue);
            if (view instanceof ButtonWithLoadingIndicator) {
                ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
                ProgressBar progressBar = buttonWithLoadingIndicator.getProgressBar();
                StyleElements.Size left = marginValue.getLeft();
                int paddingLeft = (left == null || (dp4 = left.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingLeft() : (int) ExtensionsKt.getDpToPx(dp4.doubleValue());
                StyleElements.Size top = marginValue.getTop();
                int paddingTop = (top == null || (dp3 = top.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingTop() : (int) ExtensionsKt.getDpToPx(dp3.doubleValue());
                StyleElements.Size right = marginValue.getRight();
                int paddingRight = (right == null || (dp2 = right.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingRight() : (int) ExtensionsKt.getDpToPx(dp2.doubleValue());
                StyleElements.Size bottom = marginValue.getBottom();
                progressBar.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp = bottom.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingBottom() : (int) ExtensionsKt.getDpToPx(dp.doubleValue()));
            }
        }
        StyleElements.SizeSet paddingValue = buttonComponentStyling.getPaddingValue();
        if (paddingValue != null) {
            ViewUtils5.setPaddingFromSizeSet(button, paddingValue);
        }
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Double widthValue = buttonComponentStyling.getWidthValue();
            if (widthValue != null) {
                double dDoubleValue2 = widthValue.doubleValue();
                if (z2) {
                    layoutParams.width = RangesKt.coerceAtMost((int) ExtensionsKt.getDpToPx(dDoubleValue2), measuredWidth);
                }
            }
            Double heightValue = buttonComponentStyling.getHeightValue();
            if (heightValue != null) {
                double dDoubleValue3 = heightValue.doubleValue();
                if (z2) {
                    layoutParams.height = (int) ExtensionsKt.getDpToPx(dDoubleValue3);
                }
            }
            if (view instanceof ButtonWithLoadingIndicator) {
                int i = layoutParams.height;
                ViewGroup.LayoutParams layoutParams2 = button.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int i2 = i + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                ViewGroup.LayoutParams layoutParams3 = button.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                layoutParams.height = i2 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
            }
            StyleElements.PositionType justificationValue = buttonComponentStyling.getJustificationValue();
            if (justificationValue != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams;
                int i3 = WhenMappings.$EnumSwitchMapping$0[justificationValue.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        f = 0.5f;
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f = 1.0f;
                    }
                }
                layoutParams4.horizontalBias = f;
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void style(final Button button, final ButtonComponentStyling styles, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(button, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        if (button.isLaidOut()) {
            style$applyStyles(styles, button, z, z2);
        } else {
            ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(button, new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ButtonStyling.style$lambda$11(styles, button, z, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit style$lambda$11(ButtonComponentStyling buttonComponentStyling, Button button, boolean z, boolean z2) {
        style$applyStyles(buttonComponentStyling, button, z, z2);
        return Unit.INSTANCE;
    }

    private static final GradientDrawable getStyledBackground(ButtonComponentStyling buttonComponentStyling, boolean z, boolean z2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Double borderWidthValue = buttonComponentStyling.getBorderWidthValue();
        int dpToPx = borderWidthValue != null ? (int) ExtensionsKt.getDpToPx(borderWidthValue.doubleValue()) : 0;
        Integer baseBorderColorValue = buttonComponentStyling.getBaseBorderColorValue();
        int iIntValue = baseBorderColorValue != null ? baseBorderColorValue.intValue() : 0;
        Integer activeTextColorValue = buttonComponentStyling.getActiveTextColorValue();
        int iIntValue2 = activeTextColorValue != null ? activeTextColorValue.intValue() : iIntValue;
        Integer disabledTextColorValue = buttonComponentStyling.getDisabledTextColorValue();
        gradientDrawable.setStroke(dpToPx, new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue2, disabledTextColorValue != null ? disabledTextColorValue.intValue() : iIntValue, iIntValue}));
        Double borderRadiusValue = buttonComponentStyling.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            float dpToPx2 = (float) ExtensionsKt.getDpToPx(borderRadiusValue.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.checkNotNull(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{dpToPx2, dpToPx2, dpToPx2, dpToPx2, dpToPx2, dpToPx2, dpToPx2, dpToPx2});
        }
        Integer baseBackgroundColorValue = buttonComponentStyling.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            Integer activeBackgroundColorValue = buttonComponentStyling.getActiveBackgroundColorValue();
            int iIntValue3 = activeBackgroundColorValue != null ? activeBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            Integer disabledBackgroundColorValue = buttonComponentStyling.getDisabledBackgroundColorValue();
            int iIntValue4 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue3, iIntValue4, baseBackgroundColorValue.intValue()});
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue3, iIntValue4, baseBackgroundColorValue.intValue()}));
        }
        return gradientDrawable;
    }
}
