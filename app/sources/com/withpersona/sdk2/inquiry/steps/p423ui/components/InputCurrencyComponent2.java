package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p422ui.TextInputLayoutUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputNumberBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextInputLayoutStyling;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: InputCurrencyComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputCurrencyComponent2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final TextInputLayout makeView(final InputCurrencyComponent inputCurrencyComponent, UiComponentHelper uiComponentHelper, final InputCurrency config) {
        Intrinsics.checkNotNullParameter(inputCurrencyComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiInputNumberBinding pi2UiInputNumberBindingInflate = Pi2UiInputNumberBinding.inflate(uiComponentHelper.getLayoutInflater());
        InputCurrency.Attributes attributes = config.getAttributes();
        String str = "USD";
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
            String currencyCode = attributes.getCurrencyCode();
            if (currencyCode != null) {
                str = currencyCode;
            }
        }
        final Currency currency = Currency.getInstance(str);
        final NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currency);
        final NumberFormat numberFormat = NumberFormat.getInstance();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Editable text = pi2UiInputNumberBindingInflate.editText.getText();
        objectRef.element = text != null ? text.toString() : 0;
        TextWatcher textWatcher = new TextWatcher() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponentKt$makeView$1$textWatcher$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.CharSequence, java.lang.String] */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) throws IOException, ParseException {
                if (Intrinsics.areEqual(String.valueOf(s), objectRef.element) || s == null || StringsKt.isBlank(s)) {
                    return;
                }
                pi2UiInputNumberBindingInflate.editText.removeTextChangedListener(this);
                String strQuote = Pattern.quote(currency.getSymbol());
                Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
                String strReplace = new Regex(strQuote).replace(s, "");
                StringBuilder sb = new StringBuilder();
                int length = strReplace.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = strReplace.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                Number number = numberFormat.parse(sb.toString());
                if (number != null) {
                    double dDoubleValue = number.doubleValue() / 100.0d;
                    ?? r6 = currencyInstance.format(dDoubleValue);
                    objectRef.element = r6;
                    pi2UiInputNumberBindingInflate.editText.setText((CharSequence) r6);
                    pi2UiInputNumberBindingInflate.editText.setSelection(r6.length());
                    pi2UiInputNumberBindingInflate.editText.addTextChangedListener(this);
                    inputCurrencyComponent.getNumberController().setValue(Double.valueOf(dDoubleValue));
                }
            }
        };
        if (inputCurrencyComponent.getValue() != null) {
            try {
                pi2UiInputNumberBindingInflate.editText.setText(currencyInstance.format(inputCurrencyComponent.getValue().doubleValue()));
            } catch (Exception unused) {
            }
        }
        pi2UiInputNumberBindingInflate.editText.addTextChangedListener(textWatcher);
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputCurrencyComponent2.makeView$lambda$5$lambda$4(config, pi2UiInputNumberBindingInflate);
            }
        });
        TextInputLayout root = pi2UiInputNumberBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$5$lambda$4(InputCurrency inputCurrency, Pi2UiInputNumberBinding pi2UiInputNumberBinding) {
        InputTextBasedComponentStyle styles = inputCurrency.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = pi2UiInputNumberBinding.inputLayout;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            TextInputLayoutStyling.style(inputLayout, styles);
        }
        return Unit.INSTANCE;
    }
}
