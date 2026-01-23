package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import com.google.android.material.R$attr;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Branding;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputGroup;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputGroup2;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Spacer;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentContainerConfig;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UnknownComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling;
import com.withpersona.sdk2.inquiry.shared.p422ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: UiComponent.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00060\u0001\u001a\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b*\b\u0012\u0004\u0012\u00020\u00060\u0001\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u0006\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002\u001a\u001a\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u001a\u0010\u0017\u001a\u00020\u0018*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016\u001a\f\u0010\u0019\u001a\u00020\u001a*\u00020\u0016H\u0003¨\u0006\u001b"}, m3636d2 = {"updateComponent", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "old", "new", "to", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "toMap", "", "", "toUiComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "areFieldsBlank", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "buttonView", "Lcom/google/android/material/button/MaterialButton;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "buttonViewWithLoadingIndicator", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "getButtonStyle", "", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class UiComponent3 {

    /* compiled from: UiComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Button.ButtonType.values().length];
            try {
                iArr[Button.ButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Button.ButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<UiComponent> updateComponent(List<? extends UiComponent> list, UiComponent old, UiComponent uiComponent) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(uiComponent, "new");
        List<? extends UiComponent> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (UiComponent uiComponentUpdateChildren : list2) {
            if (uiComponentUpdateChildren instanceof UiComponentGroup) {
                if (Intrinsics.areEqual(uiComponentUpdateChildren, old)) {
                    uiComponentUpdateChildren = uiComponent;
                } else {
                    UiComponentGroup uiComponentGroup = (UiComponentGroup) uiComponentUpdateChildren;
                    uiComponentUpdateChildren = uiComponentGroup.updateChildren(updateComponent(uiComponentGroup.getChildren(), old, uiComponent));
                }
            } else if (Intrinsics.areEqual(uiComponentUpdateChildren, old)) {
            }
            arrayList.add(uiComponentUpdateChildren);
        }
        return arrayList;
    }

    /* renamed from: to */
    public static final List<UiComponent> m3260to(List<? extends UiComponentConfig> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            UiComponent uiComponent = toUiComponent((UiComponentConfig) it.next());
            if (uiComponent != null) {
                arrayList.add(uiComponent);
            }
        }
        return arrayList;
    }

    public static final Map<String, UiComponentConfig> toMap(List<? extends UiComponentConfig> list) {
        UiComponentConfig uiComponentConfig;
        Intrinsics.checkNotNullParameter(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        while (!linkedList.isEmpty() && (uiComponentConfig = (UiComponentConfig) linkedList.poll()) != null) {
            if (uiComponentConfig instanceof UiComponentContainerConfig) {
                linkedHashMap.put(uiComponentConfig.getName(), uiComponentConfig);
                List<UiComponentConfig> children = ((UiComponentContainerConfig) uiComponentConfig).getChildren();
                if (children == null) {
                    children = CollectionsKt.emptyList();
                }
                linkedList.addAll(children);
            } else {
                linkedHashMap.put(uiComponentConfig.getName(), uiComponentConfig);
            }
        }
        return linkedHashMap;
    }

    public static final UiComponent toUiComponent(UiComponentConfig uiComponentConfig) {
        Intrinsics.checkNotNullParameter(uiComponentConfig, "<this>");
        if (uiComponentConfig instanceof Branding) {
            return new BrandingComponent((Branding) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Button) {
            Button button = (Button) uiComponentConfig;
            if (button instanceof ActionButton) {
                return new ActionButtonComponent((ActionButton) uiComponentConfig);
            }
            if (button instanceof CancelButton) {
                return new CancelButtonComponent((CancelButton) uiComponentConfig);
            }
            if (button instanceof CombinedStepButton) {
                return new CombinedStepButtonComponent((CombinedStepButton) uiComponentConfig);
            }
            if (button instanceof CompleteButton) {
                return new CompleteButtonComponent((CompleteButton) uiComponentConfig);
            }
            if (button instanceof SubmitButton) {
                return new SubmitButtonComponent((SubmitButton) uiComponentConfig);
            }
            if (button instanceof VerifyPersonaButton) {
                return new VerifyPersonaButtonComponent((VerifyPersonaButton) uiComponentConfig);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (uiComponentConfig instanceof UiComponentContainerConfig) {
            UiComponentContainerConfig uiComponentContainerConfig = (UiComponentContainerConfig) uiComponentConfig;
            if (uiComponentContainerConfig instanceof ClickableStack) {
                return new ClickableStackComponent((ClickableStack) uiComponentConfig);
            }
            if (uiComponentContainerConfig instanceof Footer) {
                return new FooterComponent((Footer) uiComponentConfig);
            }
            if (uiComponentContainerConfig instanceof HorizontalStack) {
                return new HorizontalStackComponent((HorizontalStack) uiComponentConfig);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (uiComponentConfig instanceof CombinedStepImagePreview) {
            return new ImagePreviewComponent((CombinedStepImagePreview) uiComponentConfig);
        }
        if (uiComponentConfig instanceof ESignature) {
            return new ESignatureComponent((ESignature) uiComponentConfig);
        }
        if (uiComponentConfig instanceof GovernmentIdNfcScan) {
            return new GovernmentIdNfcScanComponent((GovernmentIdNfcScan) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputAddress) {
            InputAddress inputAddress = (InputAddress) uiComponentConfig;
            return new InputAddressComponent(inputAddress, areFieldsBlank(inputAddress));
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (uiComponentConfig instanceof InputCheckbox) {
            return new InputCheckboxComponent((InputCheckbox) uiComponentConfig, false, 2, defaultConstructorMarker);
        }
        if (uiComponentConfig instanceof InputGroup) {
            return new InputCheckboxGroupComponent((InputGroup) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputConfirmationCode) {
            return new InputConfirmationCodeComponent((InputConfirmationCode) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputDate) {
            return new InputDateComponent((InputDate) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputMaskedText) {
            return new InputMaskedTextComponent((InputMaskedText) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputMultiSelect) {
            return InputMultiSelectComponent.INSTANCE.from((InputMultiSelect) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputNumber) {
            return new InputNumberComponent((InputNumber) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputPhoneNumber) {
            return InputPhoneNumberComponent.INSTANCE.fromConfig((InputPhoneNumber) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputGroup2) {
            return new InputRadioGroupComponent((InputGroup2) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputSelect) {
            return InputSelectComponent.INSTANCE.from((InputSelect) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputText) {
            return new InputTextComponent((InputText) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputTextArea) {
            return new InputTextAreaComponent((InputTextArea) uiComponentConfig);
        }
        if (uiComponentConfig instanceof LocalImage) {
            return new LocalImageComponent((LocalImage) uiComponentConfig);
        }
        if (uiComponentConfig instanceof PrivacyPolicy) {
            return new PrivacyPolicyComponent((PrivacyPolicy) uiComponentConfig);
        }
        if (uiComponentConfig instanceof QRCode) {
            return new QRCodeComponent((QRCode) uiComponentConfig);
        }
        if (uiComponentConfig instanceof RemoteImage) {
            return toUiComponent((RemoteImage) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Spacer) {
            return new SpacerComponent((Spacer) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Text) {
            return new TextComponent((Text) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Title) {
            return new TitleComponent((Title) uiComponentConfig);
        }
        if (uiComponentConfig instanceof CreatePersonaSheet) {
            return CreatePersonaSheetComponent.INSTANCE.fromConfig((CreatePersonaSheet) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputCurrency) {
            return new InputCurrencyComponent((InputCurrency) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputInternationalDb) {
            return InputInternationalDbComponent.INSTANCE.fromConfig((InputInternationalDb) uiComponentConfig);
        }
        if (Intrinsics.areEqual(uiComponentConfig, UnknownComponentConfig.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RemoteImageComponent toUiComponent(RemoteImage remoteImage) {
        Intrinsics.checkNotNullParameter(remoteImage, "<this>");
        return new RemoteImageComponent(remoteImage);
    }

    private static final boolean areFieldsBlank(InputAddress inputAddress) {
        InputAddress.Attributes attributes = inputAddress.getAttributes();
        String prefillAddressStreet1 = attributes != null ? attributes.getPrefillAddressStreet1() : null;
        if (prefillAddressStreet1 != null && !StringsKt.isBlank(prefillAddressStreet1)) {
            return false;
        }
        InputAddress.Attributes attributes2 = inputAddress.getAttributes();
        String prefillAddressStreet2 = attributes2 != null ? attributes2.getPrefillAddressStreet2() : null;
        if (prefillAddressStreet2 != null && !StringsKt.isBlank(prefillAddressStreet2)) {
            return false;
        }
        InputAddress.Attributes attributes3 = inputAddress.getAttributes();
        String prefillAddressCity = attributes3 != null ? attributes3.getPrefillAddressCity() : null;
        if (prefillAddressCity != null && !StringsKt.isBlank(prefillAddressCity)) {
            return false;
        }
        InputAddress.Attributes attributes4 = inputAddress.getAttributes();
        String prefillAddressPostalCode = attributes4 != null ? attributes4.getPrefillAddressPostalCode() : null;
        if (prefillAddressPostalCode != null && !StringsKt.isBlank(prefillAddressPostalCode)) {
            return false;
        }
        InputAddress.Attributes attributes5 = inputAddress.getAttributes();
        String prefillAddressSubdivision = attributes5 != null ? attributes5.getPrefillAddressSubdivision() : null;
        return prefillAddressSubdivision == null || StringsKt.isBlank(prefillAddressSubdivision);
    }

    public static final MaterialButton buttonView(UiComponent2 uiComponent2, UiComponentHelper uiComponentHelper, Button config) {
        Intrinsics.checkNotNullParameter(uiComponent2, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final ButtonComponentStyling styles = config.getStyles();
        if (styles != null) {
            final MaterialButton materialButton = new MaterialButton(uiComponentHelper.getContext());
            BaseButtonAttributes attributes = config.getAttributes();
            if (attributes != null) {
                materialButton.setText(attributes.getText());
            }
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UiComponent3.buttonView$lambda$5$lambda$4(materialButton, styles);
                }
            });
            return materialButton;
        }
        MaterialButton materialButton2 = new MaterialButton(uiComponentHelper.getContext(), null, getButtonStyle(config));
        BaseButtonAttributes attributes2 = config.getAttributes();
        if (attributes2 != null) {
            materialButton2.setText(attributes2.getText());
        }
        return materialButton2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonView$lambda$5$lambda$4(MaterialButton materialButton, ButtonComponentStyling buttonComponentStyling) {
        ButtonStyling.style$default(materialButton, buttonComponentStyling, false, false, 6, null);
        return Unit.INSTANCE;
    }

    public static final ButtonWithLoadingIndicator buttonViewWithLoadingIndicator(UiComponent2 uiComponent2, UiComponentHelper uiComponentHelper, Button config) {
        Intrinsics.checkNotNullParameter(uiComponent2, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final ButtonComponentStyling styles = config.getStyles();
        if (styles != null) {
            final ButtonWithLoadingIndicator buttonWithLoadingIndicator = new ButtonWithLoadingIndicator(uiComponentHelper.getContext(), 0);
            BaseButtonAttributes attributes = config.getAttributes();
            if (attributes != null) {
                buttonWithLoadingIndicator.setText(attributes.getText());
            }
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UiComponent3.buttonViewWithLoadingIndicator$lambda$11$lambda$10(buttonWithLoadingIndicator, styles);
                }
            });
            return buttonWithLoadingIndicator;
        }
        ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = new ButtonWithLoadingIndicator(uiComponentHelper.getContext(), getButtonStyle(config));
        BaseButtonAttributes attributes2 = config.getAttributes();
        if (attributes2 != null) {
            buttonWithLoadingIndicator2.setText(attributes2.getText());
        }
        return buttonWithLoadingIndicator2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonViewWithLoadingIndicator$lambda$11$lambda$10(ButtonWithLoadingIndicator buttonWithLoadingIndicator, ButtonComponentStyling buttonComponentStyling) {
        ButtonStyling.style(buttonWithLoadingIndicator, buttonComponentStyling);
        return Unit.INSTANCE;
    }

    private static final int getButtonStyle(Button button) {
        BaseButtonAttributes attributes = button.getAttributes();
        Button.ButtonType buttonType = attributes != null ? attributes.getButtonType() : null;
        int i = buttonType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonType.ordinal()];
        if (i == -1) {
            return R$attr.materialButtonStyle;
        }
        if (i == 1) {
            return R$attr.materialButtonStyle;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return com.withpersona.sdk2.inquiry.resources.R$attr.materialButtonStyleSecondary;
    }
}
