package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Build;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.workflow1.p415ui.TextController;
import com.squareup.workflow1.p415ui.TextControllerControlEditText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p422ui.TextInputLayoutUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputTextBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextInputLayoutStyling;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InputTextComponent.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002\u001a\f\u0010\t\u001a\u00020\f*\u00020\rH\u0002¨\u0006\u000e"}, m3636d2 = {"makeView", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;", "textController", "Lcom/squareup/workflow1/ui/TextController;", "to", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputTextComponent2 {

    /* compiled from: InputTextComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InputText.InputType.values().length];
            try {
                iArr[InputText.InputType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputText.InputType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputText.InputType.NUMBER_PAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputText.AutofillHint.values().length];
            try {
                iArr2[InputText.AutofillHint.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_LAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InputText.AutofillHint.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InputText.AutofillHint.ADDRESS_LINE_1.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InputText.AutofillHint.ADDRESS_LINE_2.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InputText.AutofillHint.CITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InputText.AutofillHint.COUNTRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[InputText.AutofillHint.POSTAL_CODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ TextInputLayout makeView$default(InputTextComponent inputTextComponent, UiComponentHelper uiComponentHelper, InputText inputText, TextController textController, int i, Object obj) {
        if ((i & 4) != 0) {
            textController = inputTextComponent.getTextController();
        }
        return makeView(inputTextComponent, uiComponentHelper, inputText, textController);
    }

    public static final TextInputLayout makeView(InputTextComponent inputTextComponent, UiComponentHelper uiComponentHelper, final InputText config, TextController textController) {
        Intrinsics.checkNotNullParameter(inputTextComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(textController, "textController");
        final Pi2UiInputTextBinding pi2UiInputTextBindingInflate = Pi2UiInputTextBinding.inflate(uiComponentHelper.getLayoutInflater());
        TextInputEditText editText = pi2UiInputTextBindingInflate.editText;
        Intrinsics.checkNotNullExpressionValue(editText, "editText");
        TextControllerControlEditText.control(textController, editText);
        InputText.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                pi2UiInputTextBindingInflate.inputLayout.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                pi2UiInputTextBindingInflate.inputLayout.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = pi2UiInputTextBindingInflate.inputLayout;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                TextInputLayoutUtils.applyPlaceholderFix(inputLayout);
            }
            pi2UiInputTextBindingInflate.editText.setInputType(m3257to(attributes.getInputType()));
            if (Build.VERSION.SDK_INT >= 26) {
                InputText.AutofillHint autofillHint = attributes.getAutofillHint();
                pi2UiInputTextBindingInflate.inputLayout.setAutofillHints(new String[]{autofillHint != null ? m3258to(autofillHint) : null});
            }
        }
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputTextComponent2.makeView$lambda$6$lambda$5(config, pi2UiInputTextBindingInflate);
            }
        });
        TextInputLayout root = pi2UiInputTextBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$6$lambda$5(InputText inputText, Pi2UiInputTextBinding pi2UiInputTextBinding) {
        InputTextBasedComponentStyle styles = inputText.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = pi2UiInputTextBinding.inputLayout;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            TextInputLayoutStyling.style(inputLayout, styles);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: to */
    private static final int m3257to(InputText.InputType inputType) {
        int i = WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 32;
        }
        if (i == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: to */
    private static final String m3258to(InputText.AutofillHint autofillHint) {
        switch (WhenMappings.$EnumSwitchMapping$1[autofillHint.ordinal()]) {
            case 1:
                return "personName";
            case 2:
                return "personGivenName";
            case 3:
                return "personMiddleName";
            case 4:
                return "personFamilyName";
            case 5:
                return "emailAddress";
            case 6:
                return "streetAddress";
            case 7:
                return "extendedAddress";
            case 8:
                return "addressLocality";
            case 9:
                return "addressCountry";
            case 10:
                return "postalCode";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
