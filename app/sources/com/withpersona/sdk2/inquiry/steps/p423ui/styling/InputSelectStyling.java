package com.withpersona.sdk2.inquiry.steps.p423ui.styling;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.robinhood.utils.extensions.ResourceTypes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ViewUtils5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InputSelectStyling.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, m3636d2 = {ResourceTypes.STYLE, "", "Lcom/google/android/material/textfield/TextInputLayout;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "addBottomBorder", "bottomBorderWidth", "", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputSelectStyling {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit style$lambda$2$lambda$0(TextInputLayout textInputLayout, int i, int i2, int i3, boolean z) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !StringsKt.any(error)) {
            TextInputLayoutStyling.setBackgroundStateColors(textInputLayout, z, i, i2, i3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$2$lambda$1(TextInputLayout textInputLayout, int i, int i2, int i3, int i4, View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        CharSequence error = textInputLayout.getError();
        if (error != null && StringsKt.any(error)) {
            textInputLayout.setBoxBackgroundColor(i);
        } else {
            TextInputLayoutStyling.setBackgroundStateColors(textInputLayout, textInputLayout.hasFocus(), i2, i3, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [T, com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt$$ExternalSyntheticLambda0] */
    public static final void style(final TextInputLayout textInputLayout, InputSelectComponentStyle styles) {
        int i;
        Double dValueOf = Double.valueOf(0.0d);
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            final int iIntValue = baseBackgroundColorValue.intValue();
            Integer focusedBackgroundColorValue = styles.getFocusedBackgroundColorValue();
            final int iIntValue2 = focusedBackgroundColorValue != null ? focusedBackgroundColorValue.intValue() : iIntValue;
            Integer disabledBackgroundColorValue = styles.getDisabledBackgroundColorValue();
            final int iIntValue3 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : iIntValue;
            Integer errorBackgroundColorValue = styles.getErrorBackgroundColorValue();
            final int iIntValue4 = errorBackgroundColorValue != null ? errorBackgroundColorValue.intValue() : iIntValue;
            textInputLayout.setBoxBackgroundMode(2);
            TextInputLayoutStyling.setBackgroundStateColors(textInputLayout, textInputLayout.hasFocus(), iIntValue, iIntValue2, iIntValue3);
            objectRef.element = new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InputSelectStyling.style$lambda$2$lambda$0(textInputLayout, iIntValue, iIntValue2, iIntValue3, ((Boolean) obj).booleanValue());
                }
            };
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt$$ExternalSyntheticLambda1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    InputSelectStyling.style$lambda$2$lambda$1(textInputLayout, iIntValue4, iIntValue, iIntValue2, iIntValue3, view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            });
        }
        Integer baseBorderColorValue = styles.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int iIntValue5 = baseBorderColorValue.intValue();
            Integer focusedBorderColorValue = styles.getFocusedBorderColorValue();
            int iIntValue6 = focusedBorderColorValue != null ? focusedBorderColorValue.intValue() : iIntValue5;
            Integer disabledBorderColorValue = styles.getDisabledBorderColorValue();
            i = -16842910;
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue5, iIntValue6, disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : iIntValue5}));
            Integer errorBorderColorValue = styles.getErrorBorderColorValue();
            if (errorBorderColorValue != null) {
                iIntValue5 = errorBorderColorValue.intValue();
            }
            textInputLayout.setBoxStrokeErrorColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue5, iIntValue5, iIntValue5}));
        } else {
            i = -16842910;
        }
        Double topBorderWidthValue = styles.getTopBorderWidthValue();
        if (topBorderWidthValue != null) {
            double dDoubleValue = topBorderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(ExtensionsKt.getDpToPx(dDoubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(ExtensionsKt.getDpToPx(dDoubleValue)));
        }
        if (textInputLayout.getBoxStrokeWidth() == 0) {
            Double bottomBorderWidthValue = styles.getBottomBorderWidthValue();
            if ((bottomBorderWidthValue != null ? bottomBorderWidthValue.doubleValue() : 0.0d) > 0.0d) {
                Double bottomBorderWidthValue2 = styles.getBottomBorderWidthValue();
                addBottomBorder(textInputLayout, (int) Math.ceil(bottomBorderWidthValue2 != null ? ExtensionsKt.getDpToPx(bottomBorderWidthValue2.doubleValue()) : 0.0d));
            }
        }
        Integer chevronColor = styles.getChevronColor();
        if (chevronColor != null) {
            int iIntValue7 = chevronColor.intValue();
            textInputLayout.setEndIconTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842908}, new int[]{R.attr.state_hovered}, new int[]{R.attr.state_enabled}, new int[]{i}}, new int[]{iIntValue7, iIntValue7, iIntValue7, iIntValue7, iIntValue7, iIntValue7}));
        }
        Double borderRadiusValue = styles.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double dDoubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.setBoxCornerRadii((float) ExtensionsKt.getDpToPx(dDoubleValue2), (float) ExtensionsKt.getDpToPx(dDoubleValue2), (float) ExtensionsKt.getDpToPx(dDoubleValue2), (float) ExtensionsKt.getDpToPx(dDoubleValue2));
        }
        StyleElements.SizeSet inputSelectBoxMargins = styles.getInputSelectBoxMargins();
        if (inputSelectBoxMargins != null) {
            ViewUtils5.setMargins(textInputLayout, inputSelectBoxMargins);
        }
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            TextStyling2.style$default(editText, styles.getTextBasedStyle(), null, 2, null);
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            ViewUtils5.setMargins(editText2, new StyleElements.SizeSet(new StyleElements.DPSize(dValueOf), new StyleElements.DPSize(dValueOf), new StyleElements.DPSize(dValueOf), new StyleElements.DPSize(dValueOf)));
        }
        Integer baseTextColor = styles.getBaseTextColor();
        if (baseTextColor != null) {
            int iIntValue8 = baseTextColor.intValue();
            Integer valueFocusedTextColor = styles.getValueFocusedTextColor();
            int iIntValue9 = valueFocusedTextColor != null ? valueFocusedTextColor.intValue() : iIntValue8;
            Integer valueDisabledTextColor = styles.getValueDisabledTextColor();
            int iIntValue10 = valueDisabledTextColor != null ? valueDisabledTextColor.intValue() : iIntValue8;
            Integer valueErrorTextColor = styles.getValueErrorTextColor();
            final int iIntValue11 = valueErrorTextColor != null ? valueErrorTextColor.intValue() : iIntValue8;
            final ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i}, new int[]{-16842914}}, new int[]{iIntValue8, iIntValue9, iIntValue10, iIntValue8});
            EditText editText3 = textInputLayout.getEditText();
            if (editText3 != null) {
                editText3.setTextColor(colorStateList);
            }
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt$$ExternalSyntheticLambda2
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    InputSelectStyling.style$lambda$9$lambda$8(textInputLayout, iIntValue11, colorStateList, view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            });
        }
        Integer errorBaseTextColor = styles.getErrorBaseTextColor();
        if (errorBaseTextColor != null) {
            int iIntValue12 = errorBaseTextColor.intValue();
            Integer errorErrorTextColor = styles.getErrorErrorTextColor();
            int iIntValue13 = errorErrorTextColor != null ? errorErrorTextColor.intValue() : iIntValue12;
            Integer errorFocusedTextColor = styles.getErrorFocusedTextColor();
            int iIntValue14 = errorFocusedTextColor != null ? errorFocusedTextColor.intValue() : iIntValue12;
            Integer errorDisabledTextColor = styles.getErrorDisabledTextColor();
            if (errorDisabledTextColor != null) {
                iIntValue12 = errorDisabledTextColor.intValue();
            }
            textInputLayout.setErrorTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i}, new int[]{-16842914}}, new int[]{iIntValue13, iIntValue14, iIntValue12, iIntValue13}));
        }
        Integer labelBaseTextColor = styles.getLabelBaseTextColor();
        if (labelBaseTextColor != null) {
            int iIntValue15 = labelBaseTextColor.intValue();
            Integer labelFocusedTextColor = styles.getLabelFocusedTextColor();
            int iIntValue16 = labelFocusedTextColor != null ? labelFocusedTextColor.intValue() : iIntValue15;
            Integer labelDisabledTextColor = styles.getLabelDisabledTextColor();
            int iIntValue17 = labelDisabledTextColor != null ? labelDisabledTextColor.intValue() : iIntValue15;
            Integer labelErrorTextColor = styles.getLabelErrorTextColor();
            int iIntValue18 = labelErrorTextColor != null ? labelErrorTextColor.intValue() : iIntValue15;
            final ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i}, new int[]{-16842914}}, new int[]{iIntValue15, iIntValue16, iIntValue17, iIntValue15});
            final ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i}, new int[]{-16842914}}, new int[]{iIntValue18, iIntValue18, iIntValue18, iIntValue18});
            textInputLayout.setDefaultHintTextColor(colorStateList2);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt$$ExternalSyntheticLambda3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    InputSelectStyling.style$lambda$12$lambda$11(textInputLayout, colorStateList3, colorStateList2, view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            });
        }
        Integer placeholderBaseTextColor = styles.getPlaceholderBaseTextColor();
        if (placeholderBaseTextColor != null) {
            int iIntValue19 = placeholderBaseTextColor.intValue();
            Integer placeholderFocusedTextColor = styles.getPlaceholderFocusedTextColor();
            int iIntValue20 = placeholderFocusedTextColor != null ? placeholderFocusedTextColor.intValue() : iIntValue19;
            Integer placeholderErrorTextColor = styles.getPlaceholderErrorTextColor();
            int iIntValue21 = placeholderErrorTextColor != null ? placeholderErrorTextColor.intValue() : iIntValue19;
            Integer placeholderDisabledTextColor = styles.getPlaceholderDisabledTextColor();
            final ColorStateList colorStateList4 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i}, new int[]{-16842914}}, new int[]{iIntValue19, iIntValue20, placeholderDisabledTextColor != null ? placeholderDisabledTextColor.intValue() : iIntValue19, iIntValue19});
            final ColorStateList colorStateList5 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i}, new int[]{-16842914}}, new int[]{iIntValue21, iIntValue21, iIntValue21, iIntValue21});
            textInputLayout.setPlaceholderTextColor(colorStateList4);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt$$ExternalSyntheticLambda4
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    InputSelectStyling.style$lambda$14$lambda$13(textInputLayout, colorStateList5, colorStateList4, view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            });
        }
        EditText editText4 = textInputLayout.getEditText();
        if (editText4 != null) {
            editText4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt$$ExternalSyntheticLambda5
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    InputSelectStyling.style$lambda$16(textInputLayout, objectRef, view, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$9$lambda$8(TextInputLayout textInputLayout, int i, ColorStateList colorStateList, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        CharSequence error = textInputLayout.getError();
        if (error != null && StringsKt.any(error)) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextColor(i);
                return;
            }
            return;
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$12$lambda$11(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        CharSequence error = textInputLayout.getError();
        if (error != null && StringsKt.any(error)) {
            textInputLayout.setDefaultHintTextColor(colorStateList);
        } else {
            textInputLayout.setDefaultHintTextColor(colorStateList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$14$lambda$13(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        CharSequence error = textInputLayout.getError();
        if (error != null && StringsKt.any(error)) {
            textInputLayout.setPlaceholderTextColor(colorStateList);
        } else {
            textInputLayout.setPlaceholderTextColor(colorStateList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$16(TextInputLayout textInputLayout, final Ref.ObjectRef objectRef, View view, final boolean z) {
        textInputLayout.post(new Runnable() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                InputSelectStyling.style$lambda$16$lambda$15(objectRef, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$16$lambda$15(Ref.ObjectRef objectRef, boolean z) {
        Function1 function1 = (Function1) objectRef.element;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    private static final void addBottomBorder(TextInputLayout textInputLayout, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(i, textInputLayout.getBoxStrokeColor());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        int i2 = -i;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        layerDrawable.setLayerInset(0, i2, i2, i2, marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        textInputLayout.setBackground(layerDrawable);
    }
}
