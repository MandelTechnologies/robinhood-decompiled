package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.Context;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.workflow1.p415ui.TextControllerControlEditText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.TextChangeListener;
import com.withpersona.sdk2.inquiry.shared.p422ui.TextInputLayoutUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.CountryCodeUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputPhoneNumberBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextInputLayoutStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InputPhoneNumberComponent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a \u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f¨\u0006\r"}, m3636d2 = {"makeView", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;", "updateView", "", "binding", "Lcom/withpersona/sdk2/inquiry/steps/ui/databinding/Pi2UiInputPhoneNumberBinding;", "onCountryInputClick", "Lkotlin/Function0;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputPhoneNumberComponent2 {
    public static final TextInputLayout makeView(InputPhoneNumberComponent inputPhoneNumberComponent, UiComponentHelper uiComponentHelper, final InputPhoneNumber config) {
        EditText editText;
        Intrinsics.checkNotNullParameter(inputPhoneNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiInputPhoneNumberBinding pi2UiInputPhoneNumberBindingInflate = Pi2UiInputPhoneNumberBinding.inflate(uiComponentHelper.getLayoutInflater());
        InputPhoneNumber.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String prefill = attributes.getPrefill();
            if (prefill != null && (editText = pi2UiInputPhoneNumberBindingInflate.inputLayout.getEditText()) != null) {
                editText.setText(prefill);
            }
            String label = attributes.getLabel();
            if (label != null) {
                pi2UiInputPhoneNumberBindingInflate.inputLayout.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                pi2UiInputPhoneNumberBindingInflate.inputLayout.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = pi2UiInputPhoneNumberBindingInflate.inputLayout;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                TextInputLayoutUtils.applyPlaceholderFix(inputLayout);
            }
            EditText editText2 = pi2UiInputPhoneNumberBindingInflate.inputLayout.getEditText();
            if (editText2 != null) {
                TextControllerControlEditText.control(inputPhoneNumberComponent.getTextController(), editText2);
                TextChangeListener.setTextChangedListener(editText2, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
            }
        }
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputPhoneNumberComponent2.makeView$lambda$7$lambda$6(config, pi2UiInputPhoneNumberBindingInflate);
            }
        });
        pi2UiInputPhoneNumberBindingInflate.getRoot().setTag(pi2UiInputPhoneNumberBindingInflate);
        TextInputLayout root = pi2UiInputPhoneNumberBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$7$lambda$6(InputPhoneNumber inputPhoneNumber, Pi2UiInputPhoneNumberBinding pi2UiInputPhoneNumberBinding) throws IllegalArgumentException {
        InputTextBasedComponentStyle styles = inputPhoneNumber.getStyles();
        if (styles != null) {
            TextView prefixTextView = pi2UiInputPhoneNumberBinding.inputLayout.getPrefixTextView();
            Intrinsics.checkNotNullExpressionValue(prefixTextView, "getPrefixTextView(...)");
            TextStyling2.style$default(prefixTextView, styles.getTextBasedStyle(), null, 2, null);
            TextInputLayout inputLayout = pi2UiInputPhoneNumberBinding.inputLayout;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            TextInputLayoutStyling.style(inputLayout, styles);
        }
        return Unit.INSTANCE;
    }

    public static final void updateView(InputPhoneNumberComponent inputPhoneNumberComponent, Pi2UiInputPhoneNumberBinding binding, final Function0<Unit> onCountryInputClick) {
        Intrinsics.checkNotNullParameter(inputPhoneNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onCountryInputClick, "onCountryInputClick");
        binding.inputLayout.setPrefixText(CountryCodeUtils.INSTANCE.getShortenedPrefixText((Option) CollectionsKt.first((List) inputPhoneNumberComponent.getCountryCodeOptionsController().getValue())));
        String selectedCountryCode = inputPhoneNumberComponent.getSelectedCountryCode();
        List<Option> countryCodeOptions = inputPhoneNumberComponent.getCountryCodeOptions();
        if (selectedCountryCode == null && countryCodeOptions.size() == 1) {
            inputPhoneNumberComponent.getCountryCodeOptionsController().setValue(CollectionsKt.listOf(CollectionsKt.first((List) countryCodeOptions)));
        }
        binding.inputLayout.getPrefixTextView().setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponentKt$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onCountryInputClick.invoke();
            }
        });
        TextView prefixTextView = binding.inputLayout.getPrefixTextView();
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        prefixTextView.setBackground(ExtensionsKt.getCountryPickerBackground(context, binding.inputLayout.getPrefixTextView().getTextColors().getDefaultColor(), (int) binding.inputLayout.getPrefixTextView().getPaint().measureText(String.valueOf(binding.inputLayout.getPrefixText()))));
        EditText editText = binding.inputLayout.getEditText();
        if (editText != null) {
            TextChangeListener.setTextChangedListener(editText, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
        }
    }
}
