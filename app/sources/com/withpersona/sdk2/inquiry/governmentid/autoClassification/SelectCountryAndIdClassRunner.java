package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidSelectCountryAndIdClassBinding;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.p423ui.inputSelect.InputSelectBottomSheetController;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.InputSelectStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: SelectCountryAndIdClassRunner.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\n*\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\rH\u0002J$\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/SelectCountryAndIdClassRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$AutoClassificationSelectCountryAndIdClassScreen;", "binding", "Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSelectCountryAndIdClassBinding;", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSelectCountryAndIdClassBinding;)V", "inputSelectBottomSheetController", "Lcom/withpersona/sdk2/inquiry/steps/ui/inputSelect/InputSelectBottomSheetController;", "showRendering", "", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "showInputSelectBottomSheet", "inputSelectComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;", "onOptionSelected", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "Companion", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SelectCountryAndIdClassRunner implements LayoutRunner<GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Pi2GovernmentidSelectCountryAndIdClassBinding binding;
    private final InputSelectBottomSheetController inputSelectBottomSheetController;

    public SelectCountryAndIdClassRunner(Pi2GovernmentidSelectCountryAndIdClassBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.inputSelectBottomSheetController = new InputSelectBottomSheetController(root);
        LinearLayout contentView = binding.contentView;
        Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
        InsetsUtils.applyInsetsAsPadding$default(contentView, false, false, false, false, 15, null);
    }

    /* compiled from: SelectCountryAndIdClassRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/SelectCountryAndIdClassRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$AutoClassificationSelectCountryAndIdClassScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen> {
        private final /* synthetic */ ViewFactory<GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen> getType() {
            return this.$$delegate_0.getType();
        }

        /* compiled from: SelectCountryAndIdClassRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner$Companion$1 */
        /* synthetic */ class C435971 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2GovernmentidSelectCountryAndIdClassBinding> {
            public static final C435971 INSTANCE = new C435971();

            C435971() {
                super(3, Pi2GovernmentidSelectCountryAndIdClassBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSelectCountryAndIdClassBinding;", 0);
            }

            public final Pi2GovernmentidSelectCountryAndIdClassBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Pi2GovernmentidSelectCountryAndIdClassBinding.inflate(p0, viewGroup, z);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Pi2GovernmentidSelectCountryAndIdClassBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return invoke(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen.class), C435971.INSTANCE, C435982.INSTANCE);
        }

        /* compiled from: SelectCountryAndIdClassRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner$Companion$2 */
        /* synthetic */ class C435982 extends FunctionReferenceImpl implements Function1<Pi2GovernmentidSelectCountryAndIdClassBinding, SelectCountryAndIdClassRunner> {
            public static final C435982 INSTANCE = new C435982();

            C435982() {
                super(1, SelectCountryAndIdClassRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSelectCountryAndIdClassBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SelectCountryAndIdClassRunner invoke(Pi2GovernmentidSelectCountryAndIdClassBinding p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new SelectCountryAndIdClassRunner(p0);
            }
        }
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Pi2GovernmentidSelectCountryAndIdClassBinding pi2GovernmentidSelectCountryAndIdClassBinding = this.binding;
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectCountryAndIdClassRunner.showRendering$lambda$7$lambda$0(rendering);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectCountryAndIdClassRunner.showRendering$lambda$7$lambda$1(rendering);
            }
        };
        Pi2NavigationBar navigationBar = pi2GovernmentidSelectCountryAndIdClassBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = pi2GovernmentidSelectCountryAndIdClassBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        pi2GovernmentidSelectCountryAndIdClassBinding.title.setText(rendering.getTitle());
        Option option = (Option) CollectionsKt.firstOrNull((List) rendering.getCountrySelectComponent().getSelectedOptions());
        String text = option != null ? option.getText() : null;
        pi2GovernmentidSelectCountryAndIdClassBinding.countrySelector.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectCountryAndIdClassRunner.showRendering$lambda$7$lambda$2(this.f$0, rendering, view);
            }
        });
        EditText editText = pi2GovernmentidSelectCountryAndIdClassBinding.countrySelector.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectCountryAndIdClassRunner.showRendering$lambda$7$lambda$3(this.f$0, rendering, view);
                }
            });
        }
        EditText editText2 = pi2GovernmentidSelectCountryAndIdClassBinding.countrySelector.getEditText();
        if (editText2 != null) {
            editText2.setText(text);
        }
        if (text != null) {
            pi2GovernmentidSelectCountryAndIdClassBinding.idClassSelector.setEnabled(true);
            EditText editText3 = pi2GovernmentidSelectCountryAndIdClassBinding.idClassSelector.getEditText();
            if (editText3 != null) {
                editText3.setEnabled(true);
            }
            pi2GovernmentidSelectCountryAndIdClassBinding.idClassSelector.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectCountryAndIdClassRunner.showRendering$lambda$7$lambda$4(this.f$0, rendering, view);
                }
            });
            EditText editText4 = pi2GovernmentidSelectCountryAndIdClassBinding.idClassSelector.getEditText();
            if (editText4 != null) {
                editText4.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner$$ExternalSyntheticLambda5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SelectCountryAndIdClassRunner.showRendering$lambda$7$lambda$5(this.f$0, rendering, view);
                    }
                });
            }
            EditText editText5 = pi2GovernmentidSelectCountryAndIdClassBinding.idClassSelector.getEditText();
            if (editText5 != null) {
                Option option2 = (Option) CollectionsKt.firstOrNull((List) rendering.getIdClassSelectComponent().getSelectedOptions());
                editText5.setText(option2 != null ? option2.getText() : null);
            }
        } else {
            pi2GovernmentidSelectCountryAndIdClassBinding.idClassSelector.setEnabled(false);
            EditText editText6 = pi2GovernmentidSelectCountryAndIdClassBinding.idClassSelector.getEditText();
            if (editText6 != null) {
                editText6.setEnabled(false);
            }
        }
        pi2GovernmentidSelectCountryAndIdClassBinding.countrySelectorText.setText(rendering.getCountryInputTitle());
        pi2GovernmentidSelectCountryAndIdClassBinding.idClassSelectorText.setText(rendering.getIdClassInputTitle());
        pi2GovernmentidSelectCountryAndIdClassBinding.continueButton.setEnabled(rendering.getIsContinueEnabled());
        pi2GovernmentidSelectCountryAndIdClassBinding.continueButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectCountryAndIdClassRunner.showRendering$lambda$7$lambda$6(rendering, view);
            }
        });
        pi2GovernmentidSelectCountryAndIdClassBinding.continueButton.setText(rendering.getContinueButtonText());
        applyStyles(pi2GovernmentidSelectCountryAndIdClassBinding, rendering.getStyles(), viewEnvironment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$7$lambda$0(GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen) {
        autoClassificationSelectCountryAndIdClassScreen.getOnBackClick().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$7$lambda$1(GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen) {
        autoClassificationSelectCountryAndIdClassScreen.getOnCancelClick().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$7$lambda$2(SelectCountryAndIdClassRunner selectCountryAndIdClassRunner, GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen, View view) {
        selectCountryAndIdClassRunner.showInputSelectBottomSheet(autoClassificationSelectCountryAndIdClassScreen.getCountrySelectComponent(), autoClassificationSelectCountryAndIdClassScreen.getOnCountrySelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$7$lambda$3(SelectCountryAndIdClassRunner selectCountryAndIdClassRunner, GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen, View view) {
        selectCountryAndIdClassRunner.showInputSelectBottomSheet(autoClassificationSelectCountryAndIdClassScreen.getCountrySelectComponent(), autoClassificationSelectCountryAndIdClassScreen.getOnCountrySelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$7$lambda$4(SelectCountryAndIdClassRunner selectCountryAndIdClassRunner, GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen, View view) {
        selectCountryAndIdClassRunner.showInputSelectBottomSheet(autoClassificationSelectCountryAndIdClassScreen.getIdClassSelectComponent(), autoClassificationSelectCountryAndIdClassScreen.getOnIdClassSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$7$lambda$5(SelectCountryAndIdClassRunner selectCountryAndIdClassRunner, GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen, View view) {
        selectCountryAndIdClassRunner.showInputSelectBottomSheet(autoClassificationSelectCountryAndIdClassScreen.getIdClassSelectComponent(), autoClassificationSelectCountryAndIdClassScreen.getOnIdClassSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$7$lambda$6(GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen, View view) {
        autoClassificationSelectCountryAndIdClassScreen.getOnContinueClick().invoke();
    }

    private final void applyStyles(Pi2GovernmentidSelectCountryAndIdClassBinding pi2GovernmentidSelectCountryAndIdClassBinding, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonComponentStyling8 base2;
        StepStyles.InputSelectStyleContainer base3;
        InputSelectComponentStyle base4;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        StepStyles.StepTextBasedComponentStyleContainer base7;
        TextBasedComponentStyle base8;
        if (governmentIdStepStyle == null) {
            return;
        }
        Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            pi2GovernmentidSelectCountryAndIdClassBinding.getRoot().setBackgroundColor(iIntValue);
            SystemUiControllerUtils.updateSystemUiColor(viewEnvironment, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
        if (titleStyle != null && (base7 = titleStyle.getBase()) != null && (base8 = base7.getBase()) != null) {
            TextView title = pi2GovernmentidSelectCountryAndIdClassBinding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextStyling2.style$default(title, base8, null, 2, null);
        }
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle.getTextStyle();
        if (textStyle != null && (base5 = textStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            TextView countrySelectorText = pi2GovernmentidSelectCountryAndIdClassBinding.countrySelectorText;
            Intrinsics.checkNotNullExpressionValue(countrySelectorText, "countrySelectorText");
            TextStyling2.style$default(countrySelectorText, base6, null, 2, null);
            TextView idClassSelectorText = pi2GovernmentidSelectCountryAndIdClassBinding.idClassSelectorText;
            Intrinsics.checkNotNullExpressionValue(idClassSelectorText, "idClassSelectorText");
            TextStyling2.style$default(idClassSelectorText, base6, null, 2, null);
        }
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle = governmentIdStepStyle.getInputSelectStyle();
        if (inputSelectStyle != null && (base3 = inputSelectStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextInputLayout countrySelector = pi2GovernmentidSelectCountryAndIdClassBinding.countrySelector;
            Intrinsics.checkNotNullExpressionValue(countrySelector, "countrySelector");
            InputSelectStyling.style(countrySelector, base4);
            TextInputLayout idClassSelector = pi2GovernmentidSelectCountryAndIdClassBinding.idClassSelector;
            Intrinsics.checkNotNullExpressionValue(idClassSelector, "idClassSelector");
            InputSelectStyling.style(idClassSelector, base4);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
        if (buttonPrimaryStyle == null || (base = buttonPrimaryStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return;
        }
        Button continueButton = pi2GovernmentidSelectCountryAndIdClassBinding.continueButton;
        Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
        ButtonStyling.style$default(continueButton, base2, false, false, 6, null);
    }

    private final void showInputSelectBottomSheet(InputSelectBoxComponent inputSelectComponent, final Function1<? super Option, Unit> onOptionSelected) {
        this.inputSelectBottomSheetController.show(inputSelectComponent, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectCountryAndIdClassRunner.showInputSelectBottomSheet$lambda$13(onOptionSelected, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showInputSelectBottomSheet$lambda$13(Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Option option = (Option) CollectionsKt.firstOrNull(selectedItems);
        if (option == null) {
            return Unit.INSTANCE;
        }
        function1.invoke(option);
        return Unit.INSTANCE;
    }
}
