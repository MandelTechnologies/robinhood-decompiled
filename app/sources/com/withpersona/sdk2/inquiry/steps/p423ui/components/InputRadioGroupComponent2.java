package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputGroup2;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputGroup4;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2RadioButtonBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputRadioGroupBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ViewUtils5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InputRadioGroupComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Landroid/widget/LinearLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputRadioGroupComponent2 {
    public static final LinearLayout makeView(final InputRadioGroupComponent inputRadioGroupComponent, UiComponentHelper uiComponentHelper, final InputGroup2 config) {
        List<InputGroup4> listEmptyList;
        TextBasedComponentStyle errorTextStyle;
        Intrinsics.checkNotNullParameter(inputRadioGroupComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiInputRadioGroupBinding pi2UiInputRadioGroupBindingInflate = Pi2UiInputRadioGroupBinding.inflate(uiComponentHelper.getLayoutInflater());
        InputGroup2.Attributes attributes = config.getAttributes();
        final ArrayList arrayList = new ArrayList();
        if (attributes == null || (listEmptyList = attributes.getOptions()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        for (final InputGroup4 inputGroup4 : listEmptyList) {
            final Pi2RadioButtonBinding pi2RadioButtonBindingInflate = Pi2RadioButtonBinding.inflate(uiComponentHelper.getLayoutInflater(), pi2UiInputRadioGroupBindingInflate.getRoot(), false);
            TextView radioButtonLabel = pi2RadioButtonBindingInflate.radioButtonLabel;
            Intrinsics.checkNotNullExpressionValue(radioButtonLabel, "radioButtonLabel");
            ExtensionsKt.setMarkdown(radioButtonLabel, inputGroup4.getText());
            String descriptionText = inputGroup4.getDescriptionText();
            if (descriptionText == null || StringsKt.isBlank(descriptionText)) {
                pi2RadioButtonBindingInflate.radioButtonDescription.setVisibility(8);
            } else {
                pi2RadioButtonBindingInflate.radioButtonDescription.setVisibility(0);
                TextView radioButtonDescription = pi2RadioButtonBindingInflate.radioButtonDescription;
                Intrinsics.checkNotNullExpressionValue(radioButtonDescription, "radioButtonDescription");
                ExtensionsKt.setMarkdown(radioButtonDescription, descriptionText);
            }
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InputRadioGroupComponent2.makeView$lambda$15$lambda$9$lambda$4(config, pi2RadioButtonBindingInflate);
                }
            });
            pi2RadioButtonBindingInflate.radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponentKt$$ExternalSyntheticLambda1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    InputRadioGroupComponent2.makeView$lambda$15$lambda$9$lambda$7(arrayList, config, inputGroup4, inputRadioGroupComponent, compoundButton, z);
                }
            });
            pi2RadioButtonBindingInflate.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponentKt$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InputRadioGroupComponent2.makeView$lambda$15$lambda$9$lambda$8(pi2RadioButtonBindingInflate, view);
                }
            });
            pi2UiInputRadioGroupBindingInflate.radioButtonContainer.addView(pi2RadioButtonBindingInflate.getRoot());
            MaterialRadioButton radioButton = pi2RadioButtonBindingInflate.radioButton;
            Intrinsics.checkNotNullExpressionValue(radioButton, "radioButton");
            arrayList.add(radioButton);
            if (Intrinsics.areEqual(inputRadioGroupComponent.getTextController().getTextValue(), inputGroup4.getValue())) {
                pi2RadioButtonBindingInflate.radioButton.setChecked(true);
            }
        }
        InputGroup2.InputRadioGroupComponentStyle styles = config.getStyles();
        if (styles != null && (errorTextStyle = styles.getErrorTextStyle()) != null) {
            TextView radioGroupError = pi2UiInputRadioGroupBindingInflate.radioGroupError;
            Intrinsics.checkNotNullExpressionValue(radioGroupError, "radioGroupError");
            TextStyling2.style$default(radioGroupError, errorTextStyle, null, 2, null);
        }
        String label = attributes != null ? attributes.getLabel() : null;
        if (label != null && label.length() != 0) {
            pi2UiInputRadioGroupBindingInflate.radioGroupLabel.setVisibility(0);
            pi2UiInputRadioGroupBindingInflate.radioGroupLabel.setText(label);
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InputRadioGroupComponent2.makeView$lambda$15$lambda$12(config, pi2UiInputRadioGroupBindingInflate);
                }
            });
        } else {
            pi2UiInputRadioGroupBindingInflate.radioGroupLabel.setVisibility(8);
        }
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponentKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputRadioGroupComponent2.makeView$lambda$15$lambda$14(config, pi2UiInputRadioGroupBindingInflate);
            }
        });
        pi2UiInputRadioGroupBindingInflate.getRoot().setTag(pi2UiInputRadioGroupBindingInflate);
        LinearLayout root = pi2UiInputRadioGroupBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    private static final void makeView$lambda$15$radioButtonOptionSelected(InputRadioGroupComponent inputRadioGroupComponent, InputGroup2 inputGroup2, String str) {
        List<InputGroup4> options;
        Object next;
        InputGroup2.Attributes attributes = inputGroup2.getAttributes();
        String value = null;
        if (attributes != null && (options = attributes.getOptions()) != null) {
            Iterator<T> it = options.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.areEqual(((InputGroup4) next).getText(), str)) {
                        break;
                    }
                }
            }
            InputGroup4 inputGroup4 = (InputGroup4) next;
            if (inputGroup4 != null) {
                value = inputGroup4.getValue();
            }
        }
        if (value != null) {
            inputRadioGroupComponent.getTextController().setTextValue(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$15$lambda$9$lambda$4(InputGroup2 inputGroup2, Pi2RadioButtonBinding pi2RadioButtonBinding) throws IllegalArgumentException {
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle;
        InputGroup2.InputRadioGroupComponentStyle styles = inputGroup2.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView radioButtonLabel = pi2RadioButtonBinding.radioButtonLabel;
            Intrinsics.checkNotNullExpressionValue(radioButtonLabel, "radioButtonLabel");
            TextStyling2.style$default(radioButtonLabel, textBasedStyle, null, 2, null);
        }
        InputGroup2.InputRadioGroupComponentStyle styles2 = inputGroup2.getStyles();
        if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
            TextView radioButtonDescription = pi2RadioButtonBinding.radioButtonDescription;
            Intrinsics.checkNotNullExpressionValue(radioButtonDescription, "radioButtonDescription");
            TextStyling2.style$default(radioButtonDescription, descriptionTextStyle, null, 2, null);
        }
        pi2RadioButtonBinding.radioButton.setButtonTintList(ColorStateList.valueOf(ColorUtils.setAlphaComponent(pi2RadioButtonBinding.radioButtonLabel.getCurrentTextColor(), 150)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeView$lambda$15$lambda$9$lambda$7(List list, InputGroup2 inputGroup2, InputGroup4 inputGroup4, InputRadioGroupComponent inputRadioGroupComponent, CompoundButton compoundButton, boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.areEqual((RadioButton) obj, compoundButton)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((RadioButton) it.next()).setChecked(false);
            }
            makeView$lambda$15$radioButtonOptionSelected(inputRadioGroupComponent, inputGroup2, inputGroup4.getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeView$lambda$15$lambda$9$lambda$8(Pi2RadioButtonBinding pi2RadioButtonBinding, View view) {
        if (pi2RadioButtonBinding.radioButton.isChecked()) {
            return;
        }
        pi2RadioButtonBinding.radioButton.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$15$lambda$12(InputGroup2 inputGroup2, Pi2UiInputRadioGroupBinding pi2UiInputRadioGroupBinding) throws IllegalArgumentException {
        TextBasedComponentStyle textBasedStyle;
        InputGroup2.InputRadioGroupComponentStyle styles = inputGroup2.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView radioGroupLabel = pi2UiInputRadioGroupBinding.radioGroupLabel;
            Intrinsics.checkNotNullExpressionValue(radioGroupLabel, "radioGroupLabel");
            TextStyling2.style$default(radioGroupLabel, textBasedStyle, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$15$lambda$14(InputGroup2 inputGroup2, Pi2UiInputRadioGroupBinding pi2UiInputRadioGroupBinding) {
        StyleElements.SizeSet margins;
        InputGroup2.InputRadioGroupComponentStyle styles = inputGroup2.getStyles();
        if (styles != null && (margins = styles.getMargins()) != null) {
            LinearLayout root = pi2UiInputRadioGroupBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewUtils5.setMargins(root, margins);
        }
        return Unit.INSTANCE;
    }
}
