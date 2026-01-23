package com.withpersona.sdk2.inquiry.steps.p423ui.styling;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import androidx.compose.p011ui.graphics.BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline0;
import androidx.compose.p011ui.graphics.BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline1;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.robinhood.utils.extensions.ResourceTypes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ViewUtils5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: TextInputLayoutStyling.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a*\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0002¨\u0006\u000e"}, m3636d2 = {ResourceTypes.STYLE, "", "Lcom/google/android/material/textfield/TextInputLayout;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "setBackgroundStateColors", "hasFocus", "", "baseBackgroundColor", "", "focusedColor", "disabledColor", "setCursorColorFilter", ResourceTypes.COLOR, "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class TextInputLayoutStyling {
    /* JADX WARN: Type inference failed for: r0v59, types: [T, com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt$$ExternalSyntheticLambda1] */
    public static final void style(final TextInputLayout textInputLayout, InputTextBasedComponentStyle styles) {
        Integer focusedBackgroundColorValue;
        Double valueLineHeightValue;
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        Integer baseBorderColorValue = styles.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int iIntValue = baseBorderColorValue.intValue();
            Integer focusedBorderColorValue = styles.getFocusedBorderColorValue();
            int iIntValue2 = focusedBorderColorValue != null ? focusedBorderColorValue.intValue() : iIntValue;
            Integer disabledBorderColorValue = styles.getDisabledBorderColorValue();
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue, iIntValue2, disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : iIntValue}));
            Integer errorBorderColorValue = styles.getErrorBorderColorValue();
            if (errorBorderColorValue != null) {
                iIntValue = errorBorderColorValue.intValue();
            }
            textInputLayout.setBoxStrokeErrorColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue, iIntValue, iIntValue}));
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            final int iIntValue3 = baseBackgroundColorValue.intValue();
            Integer focusedBackgroundColorValue2 = styles.getFocusedBackgroundColorValue();
            final int iIntValue4 = focusedBackgroundColorValue2 != null ? focusedBackgroundColorValue2.intValue() : iIntValue3;
            Integer disabledBackgroundColorValue = styles.getDisabledBackgroundColorValue();
            final int iIntValue5 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : iIntValue3;
            Integer errorBackgroundColorValue = styles.getErrorBackgroundColorValue();
            final int iIntValue6 = errorBackgroundColorValue != null ? errorBackgroundColorValue.intValue() : iIntValue3;
            textInputLayout.setBoxBackgroundMode(2);
            setBackgroundStateColors(textInputLayout, textInputLayout.hasFocus(), iIntValue3, iIntValue4, iIntValue5);
            objectRef.element = new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TextInputLayoutStyling.style$lambda$3$lambda$1(textInputLayout, iIntValue3, iIntValue4, iIntValue5, ((Boolean) obj).booleanValue());
                }
            };
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt$$ExternalSyntheticLambda2
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    TextInputLayoutStyling.style$lambda$3$lambda$2(textInputLayout, iIntValue6, iIntValue3, iIntValue4, iIntValue5, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }
        Double borderWidthValue = styles.getBorderWidthValue();
        if (borderWidthValue != null) {
            double dDoubleValue = borderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(ExtensionsKt.getDpToPx(dDoubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(ExtensionsKt.getDpToPx(dDoubleValue)));
        }
        Double borderRadiusValue = styles.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double dDoubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.setBoxCornerRadii((float) ExtensionsKt.getDpToPx(dDoubleValue2), (float) ExtensionsKt.getDpToPx(dDoubleValue2), (float) ExtensionsKt.getDpToPx(dDoubleValue2), (float) ExtensionsKt.getDpToPx(dDoubleValue2));
        }
        Double valueFontSizeValue = styles.getValueFontSizeValue();
        if (valueFontSizeValue != null) {
            double dDoubleValue3 = valueFontSizeValue.doubleValue();
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextSize((float) dDoubleValue3);
            }
        }
        Double valueLetterSpacingValue = styles.getValueLetterSpacingValue();
        if (valueLetterSpacingValue != null) {
            double dDoubleValue4 = valueLetterSpacingValue.doubleValue() / (textInputLayout.getEditText() != null ? r0.getTextSize() : 12.0f);
            EditText editText2 = textInputLayout.getEditText();
            if (editText2 != null) {
                editText2.setLetterSpacing((float) dDoubleValue4);
            }
        }
        EditText editText3 = textInputLayout.getEditText();
        if (editText3 != null) {
            String baseFontFamilyValue = styles.getBaseFontFamilyValue();
            StyleElements.FontWeight valueFontWeightValue = styles.getValueFontWeightValue();
            if (valueFontWeightValue == null) {
                valueFontWeightValue = StyleElements.FontWeight.NORMAL;
            }
            TextStyling2.setTypeface(editText3, baseFontFamilyValue, valueFontWeightValue, new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TextInputLayoutStyling.style$lambda$8(textInputLayout, (Typeface) obj);
                }
            });
        }
        EditText editText4 = textInputLayout.getEditText();
        textInputLayout.setTypeface(editText4 != null ? editText4.getTypeface() : null);
        EditText editText5 = textInputLayout.getEditText();
        if (editText5 != null) {
            String valueFontFamilyValue = styles.getValueFontFamilyValue();
            StyleElements.FontWeight valueFontWeightValue2 = styles.getValueFontWeightValue();
            if (valueFontWeightValue2 == null) {
                valueFontWeightValue2 = StyleElements.FontWeight.NORMAL;
            }
            TextStyling2.setTypeface$default(editText5, valueFontFamilyValue, valueFontWeightValue2, null, 4, null);
        }
        if (Build.VERSION.SDK_INT >= 28 && (valueLineHeightValue = styles.getValueLineHeightValue()) != null) {
            double dDoubleValue5 = valueLineHeightValue.doubleValue();
            EditText editText6 = textInputLayout.getEditText();
            if (editText6 != null) {
                editText6.setLineHeight((int) ExtensionsKt.getDpToPx(dDoubleValue5));
            }
        }
        Integer baseTextColor = styles.getBaseTextColor();
        if (baseTextColor != null) {
            int iIntValue7 = baseTextColor.intValue();
            Integer valueFocusedTextColor = styles.getValueFocusedTextColor();
            final int iIntValue8 = valueFocusedTextColor != null ? valueFocusedTextColor.intValue() : iIntValue7;
            Integer valueDisabledTextColor = styles.getValueDisabledTextColor();
            int iIntValue9 = valueDisabledTextColor != null ? valueDisabledTextColor.intValue() : iIntValue7;
            Integer valueErrorTextColor = styles.getValueErrorTextColor();
            final int iIntValue10 = valueErrorTextColor != null ? valueErrorTextColor.intValue() : iIntValue7;
            final ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue7, iIntValue8, iIntValue9, iIntValue7});
            EditText editText7 = textInputLayout.getEditText();
            if (editText7 != null) {
                editText7.setTextColor(colorStateList);
            }
            setCursorColorFilter(textInputLayout, iIntValue8);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt$$ExternalSyntheticLambda4
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    TextInputLayoutStyling.style$lambda$11$lambda$10(textInputLayout, iIntValue10, colorStateList, iIntValue8, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }
        Integer errorBaseTextColor = styles.getErrorBaseTextColor();
        if (errorBaseTextColor != null) {
            int iIntValue11 = errorBaseTextColor.intValue();
            Integer errorErrorTextColor = styles.getErrorErrorTextColor();
            int iIntValue12 = errorErrorTextColor != null ? errorErrorTextColor.intValue() : iIntValue11;
            Integer errorFocusedTextColor = styles.getErrorFocusedTextColor();
            int iIntValue13 = errorFocusedTextColor != null ? errorFocusedTextColor.intValue() : iIntValue11;
            Integer errorDisabledTextColor = styles.getErrorDisabledTextColor();
            if (errorDisabledTextColor != null) {
                iIntValue11 = errorDisabledTextColor.intValue();
            }
            textInputLayout.setErrorTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue12, iIntValue13, iIntValue11, iIntValue12}));
        }
        Integer labelBaseTextColor = styles.getLabelBaseTextColor();
        if (labelBaseTextColor != null) {
            int iIntValue14 = labelBaseTextColor.intValue();
            Integer labelFocusedTextColor = styles.getLabelFocusedTextColor();
            int iIntValue15 = labelFocusedTextColor != null ? labelFocusedTextColor.intValue() : iIntValue14;
            Integer labelDisabledTextColor = styles.getLabelDisabledTextColor();
            int iIntValue16 = labelDisabledTextColor != null ? labelDisabledTextColor.intValue() : iIntValue14;
            Integer labelErrorTextColor = styles.getLabelErrorTextColor();
            int iIntValue17 = labelErrorTextColor != null ? labelErrorTextColor.intValue() : iIntValue14;
            final ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue14, iIntValue15, iIntValue16, iIntValue14});
            final ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue17, iIntValue17, iIntValue17, iIntValue17});
            textInputLayout.setDefaultHintTextColor(colorStateList2);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt$$ExternalSyntheticLambda5
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    TextInputLayoutStyling.style$lambda$14$lambda$13(textInputLayout, colorStateList3, colorStateList2, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }
        EditText editText8 = textInputLayout.getEditText();
        MaterialAutoCompleteTextView materialAutoCompleteTextView = editText8 instanceof MaterialAutoCompleteTextView ? (MaterialAutoCompleteTextView) editText8 : null;
        if (materialAutoCompleteTextView != null && (focusedBackgroundColorValue = styles.getFocusedBackgroundColorValue()) != null) {
            materialAutoCompleteTextView.setDropDownBackgroundDrawable(new ColorDrawable(focusedBackgroundColorValue.intValue()));
        }
        StyleElements.SizeSet inputTextBoxMargins = styles.getInputTextBoxMargins();
        if (inputTextBoxMargins != null) {
            ViewUtils5.setMargins(textInputLayout, inputTextBoxMargins);
        }
        Integer placeholderBaseTextColor = styles.getPlaceholderBaseTextColor();
        if (placeholderBaseTextColor != null) {
            int iIntValue18 = placeholderBaseTextColor.intValue();
            Integer placeholderFocusedTextColor = styles.getPlaceholderFocusedTextColor();
            int iIntValue19 = placeholderFocusedTextColor != null ? placeholderFocusedTextColor.intValue() : iIntValue18;
            Integer placeholderErrorTextColor = styles.getPlaceholderErrorTextColor();
            int iIntValue20 = placeholderErrorTextColor != null ? placeholderErrorTextColor.intValue() : iIntValue18;
            Integer placeholderDisabledTextColor = styles.getPlaceholderDisabledTextColor();
            final ColorStateList colorStateList4 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue18, iIntValue19, placeholderDisabledTextColor != null ? placeholderDisabledTextColor.intValue() : iIntValue18, iIntValue18});
            final ColorStateList colorStateList5 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue20, iIntValue20, iIntValue20, iIntValue20});
            textInputLayout.setPlaceholderTextColor(colorStateList4);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt$$ExternalSyntheticLambda6
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    TextInputLayoutStyling.style$lambda$19$lambda$18(textInputLayout, colorStateList5, colorStateList4, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }
        EditText editText9 = textInputLayout.getEditText();
        if (editText9 != null) {
            editText9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt$$ExternalSyntheticLambda7
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    TextInputLayoutStyling.style$lambda$21(textInputLayout, objectRef, view, z);
                }
            });
        }
        Integer baseMaskToggleColor = styles.getBaseMaskToggleColor();
        if (baseMaskToggleColor != null) {
            int iIntValue21 = baseMaskToggleColor.intValue();
            Integer focusedMaskToggleColor = styles.getFocusedMaskToggleColor();
            int iIntValue22 = focusedMaskToggleColor != null ? focusedMaskToggleColor.intValue() : iIntValue21;
            Integer disabledMaskToggleColor = styles.getDisabledMaskToggleColor();
            textInputLayout.setEndIconTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue21, iIntValue22, disabledMaskToggleColor != null ? disabledMaskToggleColor.intValue() : iIntValue21, iIntValue21}));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit style$lambda$3$lambda$1(TextInputLayout textInputLayout, int i, int i2, int i3, boolean z) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !StringsKt.any(error)) {
            setBackgroundStateColors(textInputLayout, z, i, i2, i3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$3$lambda$2(TextInputLayout textInputLayout, int i, int i2, int i3, int i4, View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        CharSequence error = textInputLayout.getError();
        if (error != null && StringsKt.any(error)) {
            textInputLayout.setBoxBackgroundColor(i);
        } else {
            setBackgroundStateColors(textInputLayout, textInputLayout.hasFocus(), i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit style$lambda$8(TextInputLayout textInputLayout, Typeface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        textInputLayout.setTypeface(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$11$lambda$10(TextInputLayout textInputLayout, int i, ColorStateList colorStateList, int i2, View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        CharSequence error = textInputLayout.getError();
        if (error != null && StringsKt.any(error)) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextColor(i);
            }
            setCursorColorFilter(textInputLayout, i);
            return;
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTextColor(colorStateList);
        }
        setCursorColorFilter(textInputLayout, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$14$lambda$13(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        CharSequence error = textInputLayout.getError();
        if (error != null && StringsKt.any(error)) {
            textInputLayout.setDefaultHintTextColor(colorStateList);
        } else {
            textInputLayout.setDefaultHintTextColor(colorStateList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$19$lambda$18(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        CharSequence error = textInputLayout.getError();
        if (error != null && StringsKt.any(error)) {
            textInputLayout.setPlaceholderTextColor(colorStateList);
        } else {
            textInputLayout.setPlaceholderTextColor(colorStateList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$21(TextInputLayout textInputLayout, final Ref.ObjectRef objectRef, View view, final boolean z) {
        textInputLayout.post(new Runnable() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                TextInputLayoutStyling.style$lambda$21$lambda$20(objectRef, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void style$lambda$21$lambda$20(Ref.ObjectRef objectRef, boolean z) {
        Function1 function1 = (Function1) objectRef.element;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public static final void setBackgroundStateColors(TextInputLayout textInputLayout, boolean z, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        if (z) {
            textInputLayout.setBoxBackgroundColor(i2);
        } else if (textInputLayout.isEnabled()) {
            textInputLayout.setBoxBackgroundColor(i);
        } else {
            textInputLayout.setBoxBackgroundColor(i3);
        }
    }

    private static final void setCursorColorFilter(TextInputLayout textInputLayout, int i) {
        EditText editText;
        Drawable textCursorDrawable;
        if (Build.VERSION.SDK_INT < 29 || (editText = textInputLayout.getEditText()) == null || (textCursorDrawable = editText.getTextCursorDrawable()) == null) {
            return;
        }
        BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline1.m222m();
        textCursorDrawable.setColorFilter(BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline0.m221m(i, BlendMode.SRC_ATOP));
    }
}
