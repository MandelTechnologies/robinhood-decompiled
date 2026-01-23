package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.workflow1.p415ui.TextController;
import com.squareup.workflow1.p415ui.TextControllerControlEditText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p422ui.TextInputLayoutUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputTextAreaBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextInputLayoutStyling;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InputTextAreaComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputTextAreaComponent2 {
    public static final TextInputLayout makeView(InputTextAreaComponent inputTextAreaComponent, UiComponentHelper uiComponentHelper, final InputTextArea config) {
        Intrinsics.checkNotNullParameter(inputTextAreaComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiInputTextAreaBinding pi2UiInputTextAreaBindingInflate = Pi2UiInputTextAreaBinding.inflate(uiComponentHelper.getLayoutInflater());
        InputTextArea.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            TextController textController = inputTextAreaComponent.getTextController();
            TextInputEditText editText = pi2UiInputTextAreaBindingInflate.editText;
            Intrinsics.checkNotNullExpressionValue(editText, "editText");
            TextControllerControlEditText.control(textController, editText);
            String label = attributes.getLabel();
            if (label != null) {
                pi2UiInputTextAreaBindingInflate.inputLayout.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                pi2UiInputTextAreaBindingInflate.inputLayout.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = pi2UiInputTextAreaBindingInflate.inputLayout;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                TextInputLayoutUtils.applyPlaceholderFix(inputLayout);
            }
            Integer rows = attributes.getRows();
            if (rows != null) {
                int iIntValue = rows.intValue();
                pi2UiInputTextAreaBindingInflate.editText.setMaxLines(iIntValue);
                pi2UiInputTextAreaBindingInflate.editText.setMinLines(iIntValue);
                pi2UiInputTextAreaBindingInflate.editText.setVerticalScrollBarEnabled(true);
            }
        }
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputTextAreaComponent2.makeView$lambda$6$lambda$5(config, pi2UiInputTextAreaBindingInflate);
            }
        });
        TextInputLayout root = pi2UiInputTextAreaBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$6$lambda$5(InputTextArea inputTextArea, Pi2UiInputTextAreaBinding pi2UiInputTextAreaBinding) {
        InputTextBasedComponentStyle styles = inputTextArea.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = pi2UiInputTextAreaBinding.inputLayout;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            TextInputLayoutStyling.style(inputLayout, styles);
        }
        return Unit.INSTANCE;
    }
}
