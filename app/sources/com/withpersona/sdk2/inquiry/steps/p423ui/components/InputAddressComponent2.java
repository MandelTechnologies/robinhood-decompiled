package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.robinhood.iso.countrycode.CountryCode;
import com.squareup.workflow1.p415ui.TextController;
import com.squareup.workflow1.p415ui.TextControllerControlEditText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.TwoStateViewController;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiAddressFieldBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextInputLayoutStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InputAddressComponent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¨\u0006\t"}, m3636d2 = {"makeView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "copyControllers", "other", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputAddressComponent2 {
    public static final ConstraintLayout makeView(final InputAddressComponent inputAddressComponent, UiComponentHelper uiComponentHelper, final InputAddress config) {
        String placeholderAddressSubdivision;
        String placeholderAddressPostalCode;
        Intrinsics.checkNotNullParameter(inputAddressComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiAddressFieldBinding pi2UiAddressFieldBindingInflate = Pi2UiAddressFieldBinding.inflate(uiComponentHelper.getLayoutInflater());
        InputAddress.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            TextController textControllerForAddressStreet1 = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText = pi2UiAddressFieldBindingInflate.addressFieldCollapsed.getEditText();
            Intrinsics.checkNotNull(editText);
            TextControllerControlEditText.control(textControllerForAddressStreet1, editText);
            TextController textControllerForAddressStreet12 = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText2 = pi2UiAddressFieldBindingInflate.addressFieldExpanded.getEditText();
            Intrinsics.checkNotNull(editText2);
            TextControllerControlEditText.control(textControllerForAddressStreet12, editText2);
            TextController textControllerForAddressStreet2 = inputAddressComponent.getTextControllerForAddressStreet2();
            EditText editText3 = pi2UiAddressFieldBindingInflate.addressSuite.getEditText();
            Intrinsics.checkNotNull(editText3);
            TextControllerControlEditText.control(textControllerForAddressStreet2, editText3);
            TextController textControllerForAddressCity = inputAddressComponent.getTextControllerForAddressCity();
            EditText editText4 = pi2UiAddressFieldBindingInflate.addressCity.getEditText();
            Intrinsics.checkNotNull(editText4);
            TextControllerControlEditText.control(textControllerForAddressCity, editText4);
            TextController textControllerForAddressSubdivision = inputAddressComponent.getTextControllerForAddressSubdivision();
            EditText editText5 = pi2UiAddressFieldBindingInflate.addressSubdivision.getEditText();
            Intrinsics.checkNotNull(editText5);
            TextControllerControlEditText.control(textControllerForAddressSubdivision, editText5);
            TextController textControllerForAddressPostalCode = inputAddressComponent.getTextControllerForAddressPostalCode();
            EditText editText6 = pi2UiAddressFieldBindingInflate.addressPostalCode.getEditText();
            Intrinsics.checkNotNull(editText6);
            TextControllerControlEditText.control(textControllerForAddressPostalCode, editText6);
            String placeholderAutocomplete = attributes.getPlaceholderAutocomplete();
            if (placeholderAutocomplete != null) {
                pi2UiAddressFieldBindingInflate.addressFieldCollapsed.setHint(placeholderAutocomplete);
            }
            String placeholderAddressStreet1 = attributes.getPlaceholderAddressStreet1();
            if (placeholderAddressStreet1 != null) {
                pi2UiAddressFieldBindingInflate.addressFieldExpanded.setHint(placeholderAddressStreet1);
            }
            String placeholderAddressStreet2 = attributes.getPlaceholderAddressStreet2();
            if (placeholderAddressStreet2 != null) {
                pi2UiAddressFieldBindingInflate.addressSuite.setHint(placeholderAddressStreet2);
            }
            String placeholderAddressCity = attributes.getPlaceholderAddressCity();
            if (placeholderAddressCity != null) {
                pi2UiAddressFieldBindingInflate.addressCity.setHint(placeholderAddressCity);
            }
            boolean zAreEqual = Intrinsics.areEqual(attributes.getSelectedCountryCode(), CountryCode.COUNTRY_CODE_US);
            TextInputLayout textInputLayout = pi2UiAddressFieldBindingInflate.addressSubdivision;
            if (zAreEqual) {
                placeholderAddressSubdivision = attributes.getPlaceholderAddressSubdivisionUs();
            } else {
                placeholderAddressSubdivision = attributes.getPlaceholderAddressSubdivision();
            }
            textInputLayout.setHint(placeholderAddressSubdivision);
            TextInputLayout textInputLayout2 = pi2UiAddressFieldBindingInflate.addressPostalCode;
            if (zAreEqual) {
                placeholderAddressPostalCode = attributes.getPlaceholderAddressPostalCodeUs();
            } else {
                placeholderAddressPostalCode = attributes.getPlaceholderAddressPostalCode();
            }
            textInputLayout2.setHint(placeholderAddressPostalCode);
            String label = attributes.getLabel();
            if (label != null) {
                pi2UiAddressFieldBindingInflate.addressLabel.setText(label);
            }
            String editAddressManuallyPrompt = attributes.getEditAddressManuallyPrompt();
            if (editAddressManuallyPrompt != null) {
                pi2UiAddressFieldBindingInflate.addressExpandComponentsButton.setText(editAddressManuallyPrompt);
            }
        }
        pi2UiAddressFieldBindingInflate.getRoot().setTag(pi2UiAddressFieldBindingInflate);
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputAddressComponent2.makeView$lambda$11$lambda$9(config, pi2UiAddressFieldBindingInflate);
            }
        });
        pi2UiAddressFieldBindingInflate.addressExpandComponentsButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponentKt$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InputAddressComponent2.makeView$lambda$11$lambda$10(inputAddressComponent, view);
            }
        });
        pi2UiAddressFieldBindingInflate.getRoot().setTag(pi2UiAddressFieldBindingInflate);
        ConstraintLayout root = pi2UiAddressFieldBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$11$lambda$9(InputAddress inputAddress, Pi2UiAddressFieldBinding pi2UiAddressFieldBinding) throws IllegalArgumentException {
        InputTextBasedComponentStyle inputTextStyle;
        TextBasedComponentStyle expandComponentsButtonStyle;
        InputAddress.AddressComponentStyle styles = inputAddress.getStyles();
        if (styles != null && (expandComponentsButtonStyle = styles.getExpandComponentsButtonStyle()) != null) {
            TextView addressExpandComponentsButton = pi2UiAddressFieldBinding.addressExpandComponentsButton;
            Intrinsics.checkNotNullExpressionValue(addressExpandComponentsButton, "addressExpandComponentsButton");
            TextStyling2.style$default(addressExpandComponentsButton, expandComponentsButtonStyle, null, 2, null);
        }
        InputAddress.AddressComponentStyle styles2 = inputAddress.getStyles();
        if (styles2 != null && (inputTextStyle = styles2.getInputTextStyle()) != null) {
            TextView addressLabel = pi2UiAddressFieldBinding.addressLabel;
            Intrinsics.checkNotNullExpressionValue(addressLabel, "addressLabel");
            TextStyling2.style$default(addressLabel, inputTextStyle.getLabelTextBasedStyle(), null, 2, null);
            TextInputLayout addressFieldCollapsed = pi2UiAddressFieldBinding.addressFieldCollapsed;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsed, "addressFieldCollapsed");
            TextInputLayoutStyling.style(addressFieldCollapsed, inputTextStyle);
            TextInputLayout addressFieldExpanded = pi2UiAddressFieldBinding.addressFieldExpanded;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpanded, "addressFieldExpanded");
            TextInputLayoutStyling.style(addressFieldExpanded, inputTextStyle);
            TextInputLayout addressSuite = pi2UiAddressFieldBinding.addressSuite;
            Intrinsics.checkNotNullExpressionValue(addressSuite, "addressSuite");
            TextInputLayoutStyling.style(addressSuite, inputTextStyle);
            TextInputLayout addressCity = pi2UiAddressFieldBinding.addressCity;
            Intrinsics.checkNotNullExpressionValue(addressCity, "addressCity");
            TextInputLayoutStyling.style(addressCity, inputTextStyle);
            TextInputLayout addressSubdivision = pi2UiAddressFieldBinding.addressSubdivision;
            Intrinsics.checkNotNullExpressionValue(addressSubdivision, "addressSubdivision");
            TextInputLayoutStyling.style(addressSubdivision, inputTextStyle);
            TextInputLayout addressPostalCode = pi2UiAddressFieldBinding.addressPostalCode;
            Intrinsics.checkNotNullExpressionValue(addressPostalCode, "addressPostalCode");
            TextInputLayoutStyling.style(addressPostalCode, inputTextStyle);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeView$lambda$11$lambda$10(InputAddressComponent inputAddressComponent, View view) {
        inputAddressComponent.setAddressComponentsCollapsed(Boolean.FALSE);
        TwoStateViewController twoStateViewControllerIsAddressFieldCollapsed = inputAddressComponent.getIsAddressFieldCollapsed();
        Boolean boolIsAddressComponentsCollapsed = inputAddressComponent.getIsAddressComponentsCollapsed();
        twoStateViewControllerIsAddressFieldCollapsed.setValue(boolIsAddressComponentsCollapsed != null ? boolIsAddressComponentsCollapsed.booleanValue() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputAddressComponent copyControllers(InputAddressComponent inputAddressComponent, InputAddressComponent inputAddressComponent2) {
        inputAddressComponent.setAddressFieldCollapsed(inputAddressComponent2.getIsAddressFieldCollapsed());
        inputAddressComponent.setTextControllerForAddressStreet1(inputAddressComponent2.getTextControllerForAddressStreet1());
        inputAddressComponent.setTextControllerForAddressStreet2(inputAddressComponent2.getTextControllerForAddressStreet2());
        inputAddressComponent.setTextControllerForAddressCity(inputAddressComponent2.getTextControllerForAddressCity());
        inputAddressComponent.setTextControllerForAddressSubdivision(inputAddressComponent2.getTextControllerForAddressSubdivision());
        inputAddressComponent.setTextControllerForAddressPostalCode(inputAddressComponent2.getTextControllerForAddressPostalCode());
        return inputAddressComponent;
    }
}
