package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.p422ui.TextViewUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputCheckboxBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InputCheckboxComponent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, m3636d2 = {"makeView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "binding", "Lcom/withpersona/sdk2/inquiry/steps/ui/databinding/Pi2UiInputCheckboxBinding;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputCheckboxComponent2 {
    public static final ConstraintLayout makeView(InputCheckboxComponent inputCheckboxComponent, UiComponentHelper uiComponentHelper, InputCheckbox config) {
        Intrinsics.checkNotNullParameter(inputCheckboxComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        Pi2UiInputCheckboxBinding pi2UiInputCheckboxBindingInflate = Pi2UiInputCheckboxBinding.inflate(uiComponentHelper.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(pi2UiInputCheckboxBindingInflate, "inflate(...)");
        return makeView(inputCheckboxComponent, uiComponentHelper, pi2UiInputCheckboxBindingInflate, config);
    }

    public static final ConstraintLayout makeView(final InputCheckboxComponent inputCheckboxComponent, UiComponentHelper uiComponentHelper, final Pi2UiInputCheckboxBinding binding, final InputCheckbox config) {
        AttributeStyles.TextBasedTextColorStyle textColorHighlight;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        Integer value;
        Intrinsics.checkNotNullParameter(inputCheckboxComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(config, "config");
        Context context = uiComponentHelper.getContext();
        binding.checkbox.setChecked(inputCheckboxComponent.getTwoStateViewController().getValue());
        binding.checkbox.setClickable(false);
        binding.checkbox.setFocusable(false);
        InputCheckbox.Attributes attributes = config.getAttributes();
        String label = attributes != null ? attributes.getLabel() : null;
        if (label == null || StringsKt.isBlank(label)) {
            binding.checkboxLabel.setVisibility(8);
        } else {
            binding.checkboxLabel.setVisibility(0);
            TextView checkboxLabel = binding.checkboxLabel;
            Intrinsics.checkNotNullExpressionValue(checkboxLabel, "checkboxLabel");
            ExtensionsKt.setMarkdown(checkboxLabel, label);
        }
        InputCheckbox.Attributes attributes2 = config.getAttributes();
        String descriptionText = attributes2 != null ? attributes2.getDescriptionText() : null;
        if (descriptionText == null || StringsKt.isBlank(descriptionText)) {
            binding.checkboxDescription.setVisibility(8);
        } else {
            binding.checkboxDescription.setVisibility(0);
            TextView checkboxDescription = binding.checkboxDescription;
            Intrinsics.checkNotNullExpressionValue(checkboxDescription, "checkboxDescription");
            ExtensionsKt.setMarkdown(checkboxDescription, descriptionText);
        }
        binding.checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponentKt$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                InputCheckboxComponent2.makeView$lambda$9$lambda$0(inputCheckboxComponent, compoundButton, z);
            }
        });
        binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponentKt$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InputCheckboxComponent2.makeView$lambda$9$lambda$1(binding, view);
            }
        });
        InputCheckbox.InputCheckboxComponentStyle styles = config.getStyles();
        if (styles != null && (textColorHighlight = styles.getTextColorHighlight()) != null && (base = textColorHighlight.getBase()) != null && (base2 = base.getBase()) != null && (value = base2.getValue()) != null) {
            binding.checkbox.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{ColorUtils.setAlphaComponent(ResTools.getColorFromAttr$default(context, R$attr.colorOnSurface, null, false, 6, null), (int) (ResourcesCompat.getFloat(context.getResources(), R$dimen.material_emphasis_disabled) * 255)), ResTools.getColorFromAttr$default(context, R$attr.colorOnSurface, null, false, 6, null), value.intValue()}));
        }
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputCheckboxComponent2.makeView$lambda$9$lambda$8(config, binding);
            }
        });
        binding.getRoot().setTag(binding);
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeView$lambda$9$lambda$0(InputCheckboxComponent inputCheckboxComponent, CompoundButton compoundButton, boolean z) {
        inputCheckboxComponent.getTwoStateViewController().setValue(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeView$lambda$9$lambda$1(Pi2UiInputCheckboxBinding pi2UiInputCheckboxBinding, View view) {
        pi2UiInputCheckboxBinding.checkbox.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$9$lambda$8(InputCheckbox inputCheckbox, Pi2UiInputCheckboxBinding pi2UiInputCheckboxBinding) throws IllegalArgumentException {
        TextBasedComponentStyle errorTextStyle;
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle;
        InputCheckbox.InputCheckboxComponentStyle styles = inputCheckbox.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView checkboxLabel = pi2UiInputCheckboxBinding.checkboxLabel;
            Intrinsics.checkNotNullExpressionValue(checkboxLabel, "checkboxLabel");
            TextStyling2.style$default(checkboxLabel, textBasedStyle, null, 2, null);
        }
        InputCheckbox.InputCheckboxComponentStyle styles2 = inputCheckbox.getStyles();
        if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
            TextView checkboxDescription = pi2UiInputCheckboxBinding.checkboxDescription;
            Intrinsics.checkNotNullExpressionValue(checkboxDescription, "checkboxDescription");
            TextStyling2.style$default(checkboxDescription, descriptionTextStyle, null, 2, null);
        }
        InputCheckbox.InputCheckboxComponentStyle styles3 = inputCheckbox.getStyles();
        if (styles3 != null && (errorTextStyle = styles3.getErrorTextStyle()) != null) {
            TextView checkboxError = pi2UiInputCheckboxBinding.checkboxError;
            Intrinsics.checkNotNullExpressionValue(checkboxError, "checkboxError");
            TextStyling2.style$default(checkboxError, errorTextStyle, null, 2, null);
        }
        TextView checkboxLabel2 = pi2UiInputCheckboxBinding.checkboxLabel;
        Intrinsics.checkNotNullExpressionValue(checkboxLabel2, "checkboxLabel");
        ViewGroup.LayoutParams layoutParams = checkboxLabel2.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            TextView checkboxLabel3 = pi2UiInputCheckboxBinding.checkboxLabel;
            Intrinsics.checkNotNullExpressionValue(checkboxLabel3, "checkboxLabel");
            int iCalculateLines = TextViewUtils.calculateLines(checkboxLabel3);
            TextView checkboxDescription2 = pi2UiInputCheckboxBinding.checkboxDescription;
            Intrinsics.checkNotNullExpressionValue(checkboxDescription2, "checkboxDescription");
            int iCalculateLines2 = iCalculateLines + TextViewUtils.calculateLines(checkboxDescription2);
            if (iCalculateLines2 != 0) {
                if (iCalculateLines2 == 1) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) com.withpersona.sdk2.inquiry.shared.ExtensionsKt.getDpToPx(0.0d);
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) com.withpersona.sdk2.inquiry.shared.ExtensionsKt.getDpToPx(4.0d);
                }
            }
            checkboxLabel2.setLayoutParams(layoutParams2);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
