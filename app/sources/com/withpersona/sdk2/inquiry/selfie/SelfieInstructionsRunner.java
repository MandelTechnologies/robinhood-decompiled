package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.resources.R$attr;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieInstructionsBinding;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ImageStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.RemoteImageUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.StepStyleUtils;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: SelfieInstructionsRunner.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieInstructionsRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$InstructionsScreen;", "binding", "Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;)V", "currentInstructionAssetView", "Landroid/view/View;", "showRendering", "", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "styleAnimation", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "applyStyles", "Companion", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SelfieInstructionsRunner implements LayoutRunner<SelfieWorkflow.Screen.InstructionsScreen> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Pi2SelfieInstructionsBinding binding;
    private View currentInstructionAssetView;

    public SelfieInstructionsRunner(Pi2SelfieInstructionsBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        ScrollView root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
    }

    /* compiled from: SelfieInstructionsRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieInstructionsRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$InstructionsScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<SelfieWorkflow.Screen.InstructionsScreen> {
        private final /* synthetic */ ViewFactory<SelfieWorkflow.Screen.InstructionsScreen> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(SelfieWorkflow.Screen.InstructionsScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super SelfieWorkflow.Screen.InstructionsScreen> getType() {
            return this.$$delegate_0.getType();
        }

        /* compiled from: SelfieInstructionsRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$Companion$1 */
        /* synthetic */ class C437251 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2SelfieInstructionsBinding> {
            public static final C437251 INSTANCE = new C437251();

            C437251() {
                super(3, Pi2SelfieInstructionsBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;", 0);
            }

            public final Pi2SelfieInstructionsBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Pi2SelfieInstructionsBinding.inflate(p0, viewGroup, z);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Pi2SelfieInstructionsBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return invoke(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(SelfieWorkflow.Screen.InstructionsScreen.class), C437251.INSTANCE, C437262.INSTANCE);
        }

        /* compiled from: SelfieInstructionsRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$Companion$2 */
        /* synthetic */ class C437262 extends FunctionReferenceImpl implements Function1<Pi2SelfieInstructionsBinding, SelfieInstructionsRunner> {
            public static final C437262 INSTANCE = new C437262();

            C437262() {
                super(1, SelfieInstructionsRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SelfieInstructionsRunner invoke(Pi2SelfieInstructionsBinding p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new SelfieInstructionsRunner(p0);
            }
        }
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final SelfieWorkflow.Screen.InstructionsScreen rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Pi2SelfieInstructionsBinding pi2SelfieInstructionsBinding = this.binding;
        Context context = pi2SelfieInstructionsBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, R$attr.personaStartSelfieHeaderImage, null, false, 6, null);
        if (numResourceIdFromAttr$default != null) {
            this.binding.imageviewSelfieHeaderImage.setImageResource(numResourceIdFromAttr$default.intValue());
            this.binding.imageviewSelfieHeaderImage.setVisibility(0);
        }
        pi2SelfieInstructionsBinding.textviewSelfieStartTitle.setText(rendering.getTitle());
        pi2SelfieInstructionsBinding.textviewSelfieStartBody.setText(rendering.getPrompt());
        Markwon.create(pi2SelfieInstructionsBinding.textviewSelfieDisclosure.getContext()).mo17580setMarkdown(pi2SelfieInstructionsBinding.textviewSelfieDisclosure, rendering.getDisclosure());
        pi2SelfieInstructionsBinding.startButton.setText(rendering.getStart());
        pi2SelfieInstructionsBinding.startButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelfieInstructionsRunner.showRendering$lambda$3$lambda$0(rendering, view);
            }
        });
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieInstructionsRunner.showRendering$lambda$3$lambda$1(rendering);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieInstructionsRunner.showRendering$lambda$3$lambda$2(rendering);
            }
        };
        Pi2NavigationBar navigationBar = pi2SelfieInstructionsBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ScrollView root = pi2SelfieInstructionsBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer numResourceIdFromAttr$default2 = ResTools.resourceIdFromAttr$default(context2, R$attr.personaInquirySelfieLottieRaw, null, false, 6, null);
        if (rendering.getInstructionAsset() != null) {
            if (this.currentInstructionAssetView == null) {
                RemoteImage instructionAsset = rendering.getInstructionAsset();
                ConstraintLayout nestedUiContainer = pi2SelfieInstructionsBinding.nestedUiContainer;
                Intrinsics.checkNotNullExpressionValue(nestedUiContainer, "nestedUiContainer");
                this.currentInstructionAssetView = RemoteImageUtils.renderToContainer$default(instructionAsset, nestedUiContainer, false, 2, null);
                pi2SelfieInstructionsBinding.instructionAnimation.setVisibility(8);
            }
        } else if (numResourceIdFromAttr$default2 != null) {
            pi2SelfieInstructionsBinding.instructionAnimation.setAnimation(numResourceIdFromAttr$default2.intValue());
            pi2SelfieInstructionsBinding.instructionAnimation.removeAllUpdateListeners();
        } else {
            styleAnimation(rendering.getStyles());
        }
        if (rendering.getStyles() != null) {
            applyStyles(rendering.getStyles(), viewEnvironment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$3$lambda$0(SelfieWorkflow.Screen.InstructionsScreen instructionsScreen, View view) {
        instructionsScreen.getOnClick().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$3$lambda$1(SelfieWorkflow.Screen.InstructionsScreen instructionsScreen) {
        instructionsScreen.getOnBack().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$3$lambda$2(SelfieWorkflow.Screen.InstructionsScreen instructionsScreen) {
        instructionsScreen.getOnCancel().invoke();
        return Unit.INSTANCE;
    }

    private final void styleAnimation(StepStyles.SelfieStepStyle styles) {
        if (styles != null) {
            ThemeableLottieAnimationView instructionAnimation = this.binding.instructionAnimation;
            Intrinsics.checkNotNullExpressionValue(instructionAnimation, "instructionAnimation");
            ImageStyling.applyStyle(instructionAnimation, styles.getSelfieStartIconStyle(), new String[]{"#022050"}, new String[]{"#AA85FF"}, new String[]{"#DBCCFF"});
            return;
        }
        ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.instructionAnimation;
        int color = Color.parseColor("#022050");
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView.addColorReplacement(color, ResTools.getColorFromAttr$default(context, com.google.android.material.R$attr.colorPrimaryVariant, null, false, 6, null));
        ThemeableLottieAnimationView themeableLottieAnimationView2 = this.binding.instructionAnimation;
        int color2 = Color.parseColor("#AA85FF");
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        themeableLottieAnimationView2.addColorReplacement(color2, ResTools.getColorFromAttr$default(context2, com.google.android.material.R$attr.colorSecondary, null, false, 6, null));
        Context context3 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int colorFromAttr$default = ResTools.getColorFromAttr$default(context3, com.google.android.material.R$attr.colorSecondary, null, false, 6, null);
        Context context4 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.binding.instructionAnimation.addColorReplacement(Color.parseColor("#DBCCFF"), ColorUtils.blendARGB(colorFromAttr$default, ResTools.getColorFromAttr$default(context4, com.google.android.material.R$attr.colorSurface, null, false, 6, null), 0.66f));
    }

    private final void applyStyles(StepStyles.SelfieStepStyle styles, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.textviewSelfieStartTitle;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.textviewSelfieStartTitle.getPaddingRight(), 0);
            TextView textviewSelfieStartTitle = this.binding.textviewSelfieStartTitle;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartTitle, "textviewSelfieStartTitle");
            TextStyling2.style$default(textviewSelfieStartTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView2 = this.binding.textviewSelfieStartBody;
            textView2.setPadding(textView2.getPaddingLeft(), 0, this.binding.textviewSelfieStartBody.getPaddingRight(), 0);
            TextView textviewSelfieStartBody = this.binding.textviewSelfieStartBody;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartBody, "textviewSelfieStartBody");
            TextStyling2.style$default(textviewSelfieStartBody, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textView3 = this.binding.textviewSelfieDisclosure;
            textView3.setPadding(textView3.getPaddingLeft(), 0, this.binding.textviewSelfieDisclosure.getPaddingRight(), 0);
            TextView textviewSelfieDisclosure = this.binding.textviewSelfieDisclosure;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieDisclosure, "textviewSelfieDisclosure");
            TextStyling2.style$default(textviewSelfieDisclosure, disclaimerStyleValue, null, 2, null);
        }
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            SystemUiControllerUtils.updateSystemUiColor(viewEnvironment, iIntValue);
        }
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawableBackgroundImageDrawable = StepStyleUtils.backgroundImageDrawable(styles, context);
        if (drawableBackgroundImageDrawable != null) {
            this.binding.getRoot().setBackground(drawableBackgroundImageDrawable);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.navigationBar.setControlsColor(headerButtonColorValue.intValue());
        }
        ButtonComponentStyling8 buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            Button startButton = this.binding.startButton;
            Intrinsics.checkNotNullExpressionValue(startButton, "startButton");
            ButtonStyling.style$default(startButton, buttonPrimaryStyleValue, false, false, 6, null);
        }
    }
}
