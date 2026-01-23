package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputGroup;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputGroup4;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.StringSetController;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputCheckboxBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputCheckboxGroupBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InputCheckboxGroupComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Landroid/widget/LinearLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputCheckboxGroupComponent2 {
    public static final LinearLayout makeView(final InputCheckboxGroupComponent inputCheckboxGroupComponent, UiComponentHelper uiComponentHelper, final InputGroup config) {
        List<InputGroup4> listEmptyList;
        String str;
        TextBasedComponentStyle errorTextStyle;
        boolean z;
        JsonLogicBoolean jsonLogicBoolean;
        JsonLogicBoolean disabled;
        List<String> prefill;
        Intrinsics.checkNotNullParameter(inputCheckboxGroupComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiInputCheckboxGroupBinding pi2UiInputCheckboxGroupBindingInflate = Pi2UiInputCheckboxGroupBinding.inflate(uiComponentHelper.getLayoutInflater());
        InputGroup.Attributes attributes = config.getAttributes();
        final ArrayList arrayList = new ArrayList();
        Set set = (attributes == null || (prefill = attributes.getPrefill()) == null) ? null : CollectionsKt.toSet(prefill);
        if (attributes == null || (listEmptyList = attributes.getOptions()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        for (InputGroup4 inputGroup4 : listEmptyList) {
            String value = inputGroup4.getValue();
            Boolean boolValueOf = Boolean.valueOf(set != null && set.contains(inputGroup4.getValue()));
            String text = inputGroup4.getText();
            String descriptionText = inputGroup4.getDescriptionText();
            JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
            if (attributes != null) {
                z = true;
                jsonLogicBoolean = hidden;
                disabled = attributes.getDisabled();
            } else {
                z = true;
                jsonLogicBoolean = hidden;
                disabled = null;
            }
            InputCheckbox inputCheckbox = new InputCheckbox(value, new InputCheckbox.Attributes(boolValueOf, text, descriptionText, jsonLogicBoolean, disabled), config.getStyles());
            InputCheckboxComponent inputCheckboxComponent = new InputCheckboxComponent(inputCheckbox, (set == null || set.contains(inputGroup4.getValue()) != z) ? false : z);
            Pi2UiInputCheckboxBinding pi2UiInputCheckboxBindingInflate = Pi2UiInputCheckboxBinding.inflate(uiComponentHelper.getLayoutInflater(), pi2UiInputCheckboxGroupBindingInflate.checkboxGroupContainer, false);
            Intrinsics.checkNotNullExpressionValue(pi2UiInputCheckboxBindingInflate, "inflate(...)");
            pi2UiInputCheckboxGroupBindingInflate.checkboxGroupContainer.addView(InputCheckboxComponent2.makeView(inputCheckboxComponent, uiComponentHelper, pi2UiInputCheckboxBindingInflate, inputCheckbox));
            pi2UiInputCheckboxBindingInflate.checkbox.setTag(inputGroup4.getValue());
            if (inputCheckboxGroupComponent.getStringSetController().getValue().contains(inputGroup4.getValue())) {
                pi2UiInputCheckboxBindingInflate.checkbox.setChecked(z);
            }
            MaterialCheckBox checkbox = pi2UiInputCheckboxBindingInflate.checkbox;
            Intrinsics.checkNotNullExpressionValue(checkbox, "checkbox");
            arrayList.add(checkbox);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((MaterialCheckBox) it.next()).addOnCheckedStateChangedListener(new MaterialCheckBox.OnCheckedStateChangedListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponentKt$$ExternalSyntheticLambda0
                @Override // com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener
                public final void onCheckedStateChangedListener(MaterialCheckBox materialCheckBox, int i) {
                    InputCheckboxGroupComponent2.makeView$lambda$5$lambda$1(inputCheckboxGroupComponent, arrayList, materialCheckBox, i);
                }
            });
        }
        InputCheckbox.InputCheckboxComponentStyle styles = config.getStyles();
        if (styles == null || (errorTextStyle = styles.getErrorTextStyle()) == null) {
            str = null;
        } else {
            TextView checkboxGroupError = pi2UiInputCheckboxGroupBindingInflate.checkboxGroupError;
            Intrinsics.checkNotNullExpressionValue(checkboxGroupError, "checkboxGroupError");
            str = null;
            TextStyling2.style$default(checkboxGroupError, errorTextStyle, null, 2, null);
        }
        String label = attributes != null ? attributes.getLabel() : str;
        if (label != null && label.length() != 0) {
            pi2UiInputCheckboxGroupBindingInflate.checkboxGroupLabel.setVisibility(0);
            pi2UiInputCheckboxGroupBindingInflate.checkboxGroupLabel.setText(label);
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InputCheckboxGroupComponent2.makeView$lambda$5$lambda$4(config, pi2UiInputCheckboxGroupBindingInflate);
                }
            });
        } else {
            pi2UiInputCheckboxGroupBindingInflate.checkboxGroupLabel.setVisibility(8);
        }
        pi2UiInputCheckboxGroupBindingInflate.getRoot().setTag(pi2UiInputCheckboxGroupBindingInflate);
        LinearLayout root = pi2UiInputCheckboxGroupBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    private static final void makeView$lambda$5$updateValue(InputCheckboxGroupComponent inputCheckboxGroupComponent, List<MaterialCheckBox> list) {
        String str;
        StringSetController stringSetController = inputCheckboxGroupComponent.getStringSetController();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MaterialCheckBox materialCheckBox : list) {
            if (materialCheckBox.isChecked()) {
                Object tag = materialCheckBox.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
                str = (String) tag;
            } else {
                str = null;
            }
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        stringSetController.setValue(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeView$lambda$5$lambda$1(InputCheckboxGroupComponent inputCheckboxGroupComponent, List list, MaterialCheckBox checkBox, int i) {
        Intrinsics.checkNotNullParameter(checkBox, "checkBox");
        makeView$lambda$5$updateValue(inputCheckboxGroupComponent, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$5$lambda$4(InputGroup inputGroup, Pi2UiInputCheckboxGroupBinding pi2UiInputCheckboxGroupBinding) throws IllegalArgumentException {
        TextBasedComponentStyle textBasedStyle;
        InputCheckbox.InputCheckboxComponentStyle styles = inputGroup.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView checkboxGroupLabel = pi2UiInputCheckboxGroupBinding.checkboxGroupLabel;
            Intrinsics.checkNotNullExpressionValue(checkboxGroupLabel, "checkboxGroupLabel");
            TextStyling2.style$default(checkboxGroupLabel, textBasedStyle, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
