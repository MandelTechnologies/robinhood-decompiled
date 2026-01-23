package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.workflow1.p415ui.TextControllerControlEditText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.resources.R$string;
import com.withpersona.sdk2.inquiry.shared.p422ui.TextInputLayoutUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$drawable;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$id;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputMaskedTextComponent3;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiSecureTextBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextInputLayoutStyling;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InputMaskedTextComponent.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\n\u001a\u0014\u0010\u000b\u001a\u00020\b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m3636d2 = {"makeView", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;", "bindMaskTextInputState", "", "newState", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskTextInputState;", "format", "Landroid/text/Editable;", "mask", "", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputMaskedTextComponent2 {
    public static final TextInputLayout makeView(InputMaskedTextComponent inputMaskedTextComponent, UiComponentHelper uiComponentHelper, final InputMaskedText config) {
        Intrinsics.checkNotNullParameter(inputMaskedTextComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiSecureTextBinding pi2UiSecureTextBindingInflate = Pi2UiSecureTextBinding.inflate(uiComponentHelper.getLayoutInflater());
        TextInputLayout root = pi2UiSecureTextBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InputMaskedText.Attributes attributes = config.getAttributes();
        String prefill = attributes != null ? attributes.getPrefill() : null;
        InputMaskedText.Attributes attributes2 = config.getAttributes();
        String mask = attributes2 != null ? attributes2.getMask() : null;
        InputMaskedText.Attributes attributes3 = config.getAttributes();
        Boolean secure = attributes3 != null ? attributes3.getSecure() : null;
        InputMaskedText.Attributes attributes4 = config.getAttributes();
        String label = attributes4 != null ? attributes4.getLabel() : null;
        InputMaskedText.Attributes attributes5 = config.getAttributes();
        bindMaskTextInputState(root, new MaskTextInputState(prefill, mask, secure, label, attributes5 != null ? attributes5.getPlaceholder() : null));
        EditText editText = pi2UiSecureTextBindingInflate.getRoot().getEditText();
        if (editText != null) {
            TextControllerControlEditText.control(inputMaskedTextComponent.getTextController(), editText);
        }
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputMaskedTextComponent2.makeView$lambda$3$lambda$2(config, pi2UiSecureTextBindingInflate);
            }
        });
        TextInputLayout root2 = pi2UiSecureTextBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$3$lambda$2(InputMaskedText inputMaskedText, Pi2UiSecureTextBinding pi2UiSecureTextBinding) {
        InputTextBasedComponentStyle styles = inputMaskedText.getStyles();
        if (styles != null) {
            TextInputLayout root = pi2UiSecureTextBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            TextInputLayoutStyling.style(root, styles);
        }
        return Unit.INSTANCE;
    }

    public static final void bindMaskTextInputState(final TextInputLayout textInputLayout, MaskTextInputState newState) {
        EditText editText;
        final String mask;
        EditText editText2;
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(newState, "newState");
        Object tag = textInputLayout.getTag(R$id.pi2_current_state);
        if (Intrinsics.areEqual(tag instanceof MaskTextInputState ? (MaskTextInputState) tag : null, newState)) {
            return;
        }
        textInputLayout.setTag(R$id.pi2_current_state, newState);
        String prefill = newState.getPrefill();
        if (prefill != null && (editText2 = textInputLayout.getEditText()) != null) {
            editText2.setText(prefill);
        }
        String label = newState.getLabel();
        if (label != null) {
            textInputLayout.setHint(label);
        }
        String placeholder = newState.getPlaceholder();
        if (placeholder != null) {
            textInputLayout.setPlaceholderText(placeholder);
            TextInputLayoutUtils.applyPlaceholderFix(textInputLayout);
        }
        if (Intrinsics.areEqual(newState.getSecure(), Boolean.TRUE) && (mask = newState.getMask()) != null) {
            textInputLayout.setEndIconMode(-1);
            textInputLayout.setEndIconDrawable(ContextCompat.getDrawable(textInputLayout.getContext(), R$drawable.pi2_material_ic_visibility_on));
            textInputLayout.setEndIconContentDescription(textInputLayout.getContext().getString(R$string.pi2_toggle_secure_button));
            EditText editText3 = textInputLayout.getEditText();
            if (editText3 != null) {
                editText3.setTransformationMethod(new InputMaskedTextComponent6(mask));
            }
            textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponentKt$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InputMaskedTextComponent2.bindMaskTextInputState$lambda$8$lambda$7(textInputLayout, mask, view);
                }
            });
        }
        Object tag2 = textInputLayout.getTag(R$id.pi2_mask_text_watcher);
        InputMaskedTextComponent5 inputMaskedTextComponent5 = tag2 instanceof InputMaskedTextComponent5 ? (InputMaskedTextComponent5) tag2 : null;
        if (inputMaskedTextComponent5 != null && (editText = textInputLayout.getEditText()) != null) {
            editText.removeTextChangedListener(inputMaskedTextComponent5);
        }
        String mask2 = newState.getMask();
        if (mask2 == null || StringsKt.isBlank(mask2)) {
            return;
        }
        InputMaskedTextComponent5 inputMaskedTextComponent52 = new InputMaskedTextComponent5(newState.getMask());
        EditText editText4 = textInputLayout.getEditText();
        if (editText4 != null) {
            editText4.addTextChangedListener(inputMaskedTextComponent52);
        }
        textInputLayout.setTag(R$id.pi2_mask_text_watcher, inputMaskedTextComponent52);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMaskTextInputState$lambda$8$lambda$7(TextInputLayout textInputLayout, String str, View view) {
        int i;
        EditText editText = textInputLayout.getEditText();
        boolean z = (editText != null ? editText.getTransformationMethod() : null) != null;
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTransformationMethod(z ? null : new InputMaskedTextComponent6(str));
        }
        Context context = textInputLayout.getContext();
        if (z) {
            i = R$drawable.pi2_material_ic_visibility_off;
        } else {
            i = R$drawable.pi2_material_ic_visibility_on;
        }
        textInputLayout.setEndIconDrawable(ContextCompat.getDrawable(context, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void format(Editable editable, String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            InputMaskedTextComponent3 inputMaskedTextComponent3FromChar = InputMaskedTextComponent3.INSTANCE.fromChar(cCharAt);
            while (true) {
                if (i < editable.length()) {
                    char cCharAt2 = editable.charAt(i);
                    if (inputMaskedTextComponent3FromChar.match(cCharAt2)) {
                        sb.append(cCharAt2);
                        i++;
                        break;
                    } else {
                        if (inputMaskedTextComponent3FromChar instanceof InputMaskedTextComponent3.Literal) {
                            sb.append(cCharAt);
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        editable.replace(0, editable.length(), sb);
    }
}
