package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p422ui.TextInputLayoutUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputNumberBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextInputLayoutStyling;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InputNumberComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputNumberComponent2 {
    public static final TextInputLayout makeView(final InputNumberComponent inputNumberComponent, UiComponentHelper uiComponentHelper, final InputNumber config) {
        Intrinsics.checkNotNullParameter(inputNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiInputNumberBinding pi2UiInputNumberBindingInflate = Pi2UiInputNumberBinding.inflate(uiComponentHelper.getLayoutInflater());
        InputNumber.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                pi2UiInputNumberBindingInflate.inputLayout.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                pi2UiInputNumberBindingInflate.inputLayout.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = pi2UiInputNumberBindingInflate.inputLayout;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                TextInputLayoutUtils.applyPlaceholderFix(inputLayout);
            }
            Integer precision = attributes.getPrecision();
            if (precision != null) {
                int iIntValue = precision.intValue();
                EditText editText = pi2UiInputNumberBindingInflate.inputLayout.getEditText();
                if (editText != null) {
                    editText.setFilters(new DecimalPrecisionFilter[]{new DecimalPrecisionFilter(iIntValue)});
                }
            }
        }
        pi2UiInputNumberBindingInflate.editText.setText(String.valueOf(inputNumberComponent.getNumberController().getValue()));
        TextInputEditText editText2 = pi2UiInputNumberBindingInflate.editText;
        Intrinsics.checkNotNullExpressionValue(editText2, "editText");
        editText2.addTextChangedListener(new TextWatcher() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponentKt$makeView$lambda$7$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String string2;
                inputNumberComponent.getNumberController().setValue((s == null || (string2 = s.toString()) == null) ? null : StringsKt.toDoubleOrNull(string2));
            }
        });
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputNumberComponent2.makeView$lambda$7$lambda$6(config, pi2UiInputNumberBindingInflate);
            }
        });
        TextInputLayout root = pi2UiInputNumberBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$7$lambda$6(InputNumber inputNumber, Pi2UiInputNumberBinding pi2UiInputNumberBinding) {
        InputTextBasedComponentStyle styles = inputNumber.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = pi2UiInputNumberBinding.inputLayout;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            TextInputLayoutStyling.style(inputLayout, styles);
        }
        return Unit.INSTANCE;
    }
}
