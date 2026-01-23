package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p422ui.TextInputLayoutUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiListSelectBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.InputSelectStyling;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InputSelectComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputSelectComponent2 {
    public static final TextInputLayout makeView(InputSelectComponent inputSelectComponent, UiComponentHelper uiComponentHelper, final InputSelect config) {
        EditText editText;
        Intrinsics.checkNotNullParameter(inputSelectComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiListSelectBinding pi2UiListSelectBindingInflate = Pi2UiListSelectBinding.inflate(uiComponentHelper.getLayoutInflater());
        InputSelect.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null && !StringsKt.isBlank(placeholder)) {
                pi2UiListSelectBindingInflate.getRoot().setPlaceholderText(attributes.getPlaceholder());
                pi2UiListSelectBindingInflate.getRoot().setExpandedHintEnabled(false);
                TextInputLayout root = pi2UiListSelectBindingInflate.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                TextInputLayoutUtils.applyPlaceholderFix(root);
            }
            String prefill = attributes.getPrefill();
            if (prefill != null && (editText = pi2UiListSelectBindingInflate.getRoot().getEditText()) != null) {
                editText.setText(prefill);
            }
            String label = attributes.getLabel();
            if (label != null) {
                pi2UiListSelectBindingInflate.getRoot().setHint(label);
            }
        }
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputSelectComponent2.makeView$lambda$5$lambda$4(config, pi2UiListSelectBindingInflate);
            }
        });
        TextInputLayout root2 = pi2UiListSelectBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$5$lambda$4(InputSelect inputSelect, Pi2UiListSelectBinding pi2UiListSelectBinding) {
        InputSelectComponentStyle styles = inputSelect.getStyles();
        if (styles != null) {
            TextInputLayout listSelector = pi2UiListSelectBinding.listSelector;
            Intrinsics.checkNotNullExpressionValue(listSelector, "listSelector");
            InputSelectStyling.style(listSelector, styles);
        }
        return Unit.INSTANCE;
    }
}
