package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.squareup.workflow1.p415ui.AndroidViewRendering;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2ErrorBinding;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.R$raw;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ImageStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ErrorView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\n*\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b#\u0010!R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/ErrorView;", "Lcom/squareup/workflow1/ui/AndroidViewRendering;", "", "titleText", "continueButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onContinueClick", "onBackClick", "onCancelClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "viewEnvironment", "applyStyles", "(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", "Ljava/lang/String;", "getTitleText", "()Ljava/lang/String;", "getContinueButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "getOnContinueClick", "()Lkotlin/jvm/functions/Function0;", "getOnBackClick", "getOnCancelClick", "Lcom/squareup/workflow1/ui/ViewFactory;", "viewFactory", "Lcom/squareup/workflow1/ui/ViewFactory;", "getViewFactory", "()Lcom/squareup/workflow1/ui/ViewFactory;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class ErrorView implements AndroidViewRendering<ErrorView> {
    private final String continueButtonText;
    private final NavigationState navigationState;
    private final Function0<Unit> onBackClick;
    private final Function0<Unit> onCancelClick;
    private final Function0<Unit> onContinueClick;
    private final StepStyles.GovernmentIdStepStyle styles;
    private final String titleText;
    private final ViewFactory<ErrorView> viewFactory;

    public ErrorView(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NavigationState navigationState, Function0<Unit> onContinueClick, Function0<Unit> onBackClick, Function0<Unit> onCancelClick) {
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        this.titleText = str;
        this.continueButtonText = str2;
        this.styles = governmentIdStepStyle;
        this.navigationState = navigationState;
        this.onContinueClick = onContinueClick;
        this.onBackClick = onBackClick;
        this.onCancelClick = onCancelClick;
        LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
        this.viewFactory = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(ErrorView.class), ErrorView3.INSTANCE, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ErrorView.viewFactory$lambda$6(this.f$0, (Pi2ErrorBinding) obj);
            }
        });
    }

    @Override // com.squareup.workflow1.p415ui.AndroidViewRendering
    public ViewFactory<ErrorView> getViewFactory() {
        return this.viewFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutRunner viewFactory$lambda$6(final ErrorView errorView, final Pi2ErrorBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        CoordinatorLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
        return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda1
            @Override // com.squareup.workflow1.p415ui.LayoutRunner
            public final void showRendering(Object obj, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
                ErrorView.viewFactory$lambda$6$lambda$5(binding, errorView, (ErrorView) obj, viewEnvironment);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void viewFactory$lambda$6$lambda$5(final Pi2ErrorBinding pi2ErrorBinding, final ErrorView errorView, final ErrorView rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
        StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        NavigationState navigationState = rendering.navigationState;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ErrorView.viewFactory$lambda$6$lambda$5$lambda$4$lambda$0(this.f$0);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ErrorView.viewFactory$lambda$6$lambda$5$lambda$4$lambda$1(this.f$0);
            }
        };
        Pi2NavigationBar navigationBar = pi2ErrorBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = pi2ErrorBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = rendering.styles;
        final LocalImageComponentStyle base = (governmentIdStepStyle == null || (imageLocalStyle = governmentIdStepStyle.getImageLocalStyle()) == null || (illustration = imageLocalStyle.getIllustration()) == null) ? null : illustration.getBase();
        pi2ErrorBinding.illustration.setAnimation(R$raw.pi2_id_front_fail);
        if (base != null) {
            CoordinatorLayout root2 = pi2ErrorBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(root2, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ErrorView.viewFactory$lambda$6$lambda$5$lambda$4$lambda$2(pi2ErrorBinding, base);
                }
            });
        }
        pi2ErrorBinding.title.setText(rendering.titleText);
        pi2ErrorBinding.continueButton.setText(rendering.continueButtonText);
        pi2ErrorBinding.continueButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ErrorView.viewFactory$lambda$6$lambda$5$lambda$4$lambda$3(this.f$0, view);
            }
        });
        Intrinsics.checkNotNull(pi2ErrorBinding);
        errorView.applyStyles(pi2ErrorBinding, rendering.styles, viewEnvironment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewFactory$lambda$6$lambda$5$lambda$4$lambda$0(ErrorView errorView) {
        errorView.onBackClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewFactory$lambda$6$lambda$5$lambda$4$lambda$1(ErrorView errorView) {
        errorView.onCancelClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewFactory$lambda$6$lambda$5$lambda$4$lambda$2(Pi2ErrorBinding pi2ErrorBinding, LocalImageComponentStyle localImageComponentStyle) {
        ThemeableLottieAnimationView illustration = pi2ErrorBinding.illustration;
        Intrinsics.checkNotNullExpressionValue(illustration, "illustration");
        ImageStyling.applyStyle(illustration, localImageComponentStyle, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void viewFactory$lambda$6$lambda$5$lambda$4$lambda$3(ErrorView errorView, View view) {
        errorView.onContinueClick.invoke();
    }

    public final void applyStyles(Pi2ErrorBinding pi2ErrorBinding, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonComponentStyling8 base2;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        Intrinsics.checkNotNullParameter(pi2ErrorBinding, "<this>");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        if (governmentIdStepStyle == null) {
            return;
        }
        Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            pi2ErrorBinding.getRoot().setBackgroundColor(iIntValue);
            SystemUiControllerUtils.updateSystemUiColor(viewEnvironment, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
        if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextView title = pi2ErrorBinding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextStyling2.style$default(title, base4, null, 2, null);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
        if (buttonPrimaryStyle == null || (base = buttonPrimaryStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return;
        }
        Button continueButton = pi2ErrorBinding.continueButton;
        Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
        ButtonStyling.style$default(continueButton, base2, false, false, 6, null);
    }
}
