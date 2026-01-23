package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.workflow1.p415ui.TextControllerControlEditText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInternationalDbFieldBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.InputSelectStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextInputLayoutStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InputInternationalDbComponent.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001aL\u0010\u000b\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¨\u0006\u0016"}, m3636d2 = {"toOption", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$CountryOption;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$IdOption;", "makeView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "updateView", "", "binding", "Lcom/withpersona/sdk2/inquiry/steps/ui/databinding/Pi2UiInternationalDbFieldBinding;", "onCountryInputClick", "Lkotlin/Function0;", "onIdTypeInputClick", "countryError", "", "idTypeError", "valueError", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputInternationalDbComponent2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Option toOption(InputInternationalDbComponent.CountryOption countryOption) {
        return new Option(countryOption.getCountryName(), countryOption.getCountryCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Option toOption(InputInternationalDbComponent.IdOption idOption) {
        return new Option(idOption.getName(), idOption.getIdType());
    }

    public static final ConstraintLayout makeView(InputInternationalDbComponent inputInternationalDbComponent, UiComponentHelper uiComponentHelper, final InputInternationalDb config) {
        Intrinsics.checkNotNullParameter(inputInternationalDbComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiInternationalDbFieldBinding pi2UiInternationalDbFieldBindingInflate = Pi2UiInternationalDbFieldBinding.inflate(uiComponentHelper.getLayoutInflater());
        InputInternationalDb.Attributes attributes = config.getAttributes();
        pi2UiInternationalDbFieldBindingInflate.idbLabel.setText(attributes != null ? attributes.getLabel() : null);
        pi2UiInternationalDbFieldBindingInflate.idbCountryInput.setHint(attributes != null ? attributes.getLabelIdbCountry() : null);
        pi2UiInternationalDbFieldBindingInflate.idbIdTypeInput.setHint(attributes != null ? attributes.getLabelIdbType() : null);
        pi2UiInternationalDbFieldBindingInflate.idbValueInput.setHint(attributes != null ? attributes.getLabelIdbValue() : null);
        EditText editText = pi2UiInternationalDbFieldBindingInflate.idbValueInput.getEditText();
        if (editText != null) {
            TextControllerControlEditText.control(inputInternationalDbComponent.getIdValueController(), editText);
        }
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputInternationalDbComponent2.makeView$lambda$6$lambda$5(config, pi2UiInternationalDbFieldBindingInflate);
            }
        });
        pi2UiInternationalDbFieldBindingInflate.getRoot().setTag(pi2UiInternationalDbFieldBindingInflate);
        ConstraintLayout root = pi2UiInternationalDbFieldBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$6$lambda$5(InputInternationalDb inputInternationalDb, Pi2UiInternationalDbFieldBinding pi2UiInternationalDbFieldBinding) throws IllegalArgumentException {
        InputInternationalDb.InputInternationalDbComponentStyle styles = inputInternationalDb.getStyles();
        if (styles != null) {
            InputSelectComponentStyle inputSelectStyle = styles.getInputSelectStyle();
            if (inputSelectStyle != null) {
                TextInputLayout idbCountryInput = pi2UiInternationalDbFieldBinding.idbCountryInput;
                Intrinsics.checkNotNullExpressionValue(idbCountryInput, "idbCountryInput");
                InputSelectStyling.style(idbCountryInput, inputSelectStyle);
                TextInputLayout idbIdTypeInput = pi2UiInternationalDbFieldBinding.idbIdTypeInput;
                Intrinsics.checkNotNullExpressionValue(idbIdTypeInput, "idbIdTypeInput");
                InputSelectStyling.style(idbIdTypeInput, inputSelectStyle);
            }
            InputTextBasedComponentStyle inputTextStyle = styles.getInputTextStyle();
            if (inputTextStyle != null) {
                TextInputLayout idbValueInput = pi2UiInternationalDbFieldBinding.idbValueInput;
                Intrinsics.checkNotNullExpressionValue(idbValueInput, "idbValueInput");
                TextInputLayoutStyling.style(idbValueInput, inputTextStyle);
            }
            TextBasedComponentStyle textStyle = styles.getTextStyle();
            if (textStyle != null) {
                TextView idbDescription = pi2UiInternationalDbFieldBinding.idbDescription;
                Intrinsics.checkNotNullExpressionValue(idbDescription, "idbDescription");
                TextStyling2.style$default(idbDescription, textStyle, null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void updateView(InputInternationalDbComponent inputInternationalDbComponent, Pi2UiInternationalDbFieldBinding binding, final Function0<Unit> onCountryInputClick, final Function0<Unit> onIdTypeInputClick, String str, String str2, String str3) {
        InputInternationalDb.IdType idType;
        Object next;
        Intrinsics.checkNotNullParameter(inputInternationalDbComponent, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onCountryInputClick, "onCountryInputClick");
        Intrinsics.checkNotNullParameter(onIdTypeInputClick, "onIdTypeInputClick");
        EditText editText = binding.idbCountryInput.getEditText();
        if (editText != null) {
            editText.setText(CollectionsKt.joinToString$default(inputInternationalDbComponent.getCountryOptionsController().getValue(), "\n", null, null, 0, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InputInternationalDbComponent2.updateView$lambda$14$lambda$7((Option) obj);
                }
            }, 30, null));
        }
        EditText editText2 = binding.idbIdTypeInput.getEditText();
        if (editText2 != null) {
            editText2.setText(CollectionsKt.joinToString$default(inputInternationalDbComponent.getIdTypeOptionsController().getValue(), "\n", null, null, 0, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InputInternationalDbComponent2.updateView$lambda$14$lambda$8((Option) obj);
                }
            }, 30, null));
        }
        String selectedCountry = inputInternationalDbComponent.getSelectedCountry();
        String selectedIdType = inputInternationalDbComponent.getSelectedIdType();
        List<InputInternationalDbComponent.CountryOption> countryOptions = inputInternationalDbComponent.getCountryOptions();
        List<InputInternationalDbComponent.IdOption> idTypeOptions = inputInternationalDbComponent.getIdTypeOptions();
        boolean hideCountryField = inputInternationalDbComponent.getHideCountryField();
        boolean hideIdTypeField = inputInternationalDbComponent.getHideIdTypeField();
        if (selectedCountry == null) {
            binding.idbIdTypeInput.setEnabled(false);
        } else {
            binding.idbIdTypeInput.setEnabled(true);
        }
        if (selectedCountry == null && countryOptions != null && countryOptions.size() == 1) {
            inputInternationalDbComponent.getCountryOptionsController().setValue(CollectionsKt.listOf(toOption((InputInternationalDbComponent.CountryOption) CollectionsKt.first((List) countryOptions))));
            if (Intrinsics.areEqual(inputInternationalDbComponent.getHideCountryIfSingleChoice(), Boolean.TRUE)) {
                hideCountryField = true;
            }
        }
        if (selectedCountry != null && idTypeOptions != null && idTypeOptions.size() == 1) {
            inputInternationalDbComponent.getIdTypeOptionsController().setValue(CollectionsKt.listOf(toOption((InputInternationalDbComponent.IdOption) CollectionsKt.first((List) idTypeOptions))));
            if (Intrinsics.areEqual(inputInternationalDbComponent.getHideTypeIfSingleChoice(), Boolean.TRUE)) {
                hideIdTypeField = true;
            }
        }
        binding.idbCountryInput.setVisibility(hideCountryField ? 8 : 0);
        binding.idbIdTypeInput.setVisibility(hideIdTypeField ? 8 : 0);
        if (selectedCountry != null && selectedIdType != null) {
            binding.idbValueInput.setEnabled(true);
            List<InputInternationalDb.IdType> allowedIdTypes = inputInternationalDbComponent.getAllowedIdTypes();
            if (allowedIdTypes != null) {
                Iterator<T> it = allowedIdTypes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    InputInternationalDb.IdType idType2 = (InputInternationalDb.IdType) next;
                    if (Intrinsics.areEqual(idType2.getCountryCode(), selectedCountry) && Intrinsics.areEqual(idType2.getIdType(), selectedIdType)) {
                        break;
                    }
                }
                idType = (InputInternationalDb.IdType) next;
            } else {
                idType = null;
            }
            TextInputLayout idbValueInput = binding.idbValueInput;
            Intrinsics.checkNotNullExpressionValue(idbValueInput, "idbValueInput");
            InputMaskedTextComponent2.bindMaskTextInputState(idbValueInput, new MaskTextInputState(null, idType != null ? idType.getMask() : null, idType != null ? idType.getSecure() : null, null, idType != null ? idType.getPlaceholder() : null));
            String description = idType != null ? idType.getDescription() : null;
            if (description == null || StringsKt.isBlank(description)) {
                binding.idbDescription.setVisibility(8);
            } else {
                binding.idbDescription.setVisibility(0);
                binding.idbDescription.setText(idType != null ? idType.getDescription() : null);
            }
        } else {
            binding.idbValueInput.setEnabled(false);
            binding.idbDescription.setVisibility(8);
        }
        binding.idbCountryInput.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onCountryInputClick.invoke();
            }
        });
        EditText editText3 = binding.idbCountryInput.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    onCountryInputClick.invoke();
                }
            });
        }
        binding.idbIdTypeInput.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onIdTypeInputClick.invoke();
            }
        });
        EditText editText4 = binding.idbIdTypeInput.getEditText();
        if (editText4 != null) {
            editText4.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    onIdTypeInputClick.invoke();
                }
            });
        }
        binding.idbCountryInput.setError(str);
        binding.idbIdTypeInput.setError(str2);
        binding.idbValueInput.setError(str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence updateView$lambda$14$lambda$7(Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence updateView$lambda$14$lambda$8(Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }
}
