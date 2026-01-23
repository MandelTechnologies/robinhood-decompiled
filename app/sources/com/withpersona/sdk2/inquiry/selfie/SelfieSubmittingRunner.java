package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.resources.R$attr;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieSubmittingScreenBinding;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.RemoteImageUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.StepStyleUtils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: SelfieSubmittingRunner.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieSubmittingRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$SubmittingScreen;", "binding", "Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieSubmittingScreenBinding;", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieSubmittingScreenBinding;)V", "currentLoadingAssetView", "Landroid/view/View;", "showRendering", "", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "textPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Companion", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SelfieSubmittingRunner implements LayoutRunner<SelfieWorkflow.Screen.SubmittingScreen> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Pi2SelfieSubmittingScreenBinding binding;
    private View currentLoadingAssetView;

    /* compiled from: SelfieSubmittingRunner.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SelfieSubmittingRunner(final Pi2SelfieSubmittingScreenBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, R$attr.personaInquiryLoadingLottieRaw, null, false, 6, null);
        if (numResourceIdFromAttr$default != null) {
            binding.pendingAnimation.setAnimation(numResourceIdFromAttr$default.intValue());
            binding.pendingAnimation.removeAllAnimatorListeners();
        } else {
            binding.pendingAnimation.addValueCallback(new KeyPath("scanner", "**"), (KeyPath) LottieProperty.COLOR, (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieSubmittingRunner$$ExternalSyntheticLambda0
                @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                    return SelfieSubmittingRunner.$r8$lambda$kJSDiS3EXfxmiwqHloIHoYTDFZ0(binding, lottieFrameInfo);
                }
            });
        }
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
    }

    public static Integer $r8$lambda$kJSDiS3EXfxmiwqHloIHoYTDFZ0(Pi2SelfieSubmittingScreenBinding pi2SelfieSubmittingScreenBinding, LottieFrameInfo lottieFrameInfo) {
        Context context = pi2SelfieSubmittingScreenBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(ResTools.getColorFromAttr$default(context, androidx.appcompat.R$attr.colorPrimary, null, false, 6, null));
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final SelfieWorkflow.Screen.SubmittingScreen rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Pi2SelfieSubmittingScreenBinding pi2SelfieSubmittingScreenBinding = this.binding;
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieSubmittingRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieSubmittingRunner.showRendering$lambda$5$lambda$2(rendering);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieSubmittingRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieSubmittingRunner.showRendering$lambda$5$lambda$3(rendering);
            }
        };
        Pi2NavigationBar navigationBar = pi2SelfieSubmittingScreenBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = pi2SelfieSubmittingScreenBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        if (rendering.getTitle().length() == 0) {
            pi2SelfieSubmittingScreenBinding.title.setVisibility(8);
        } else {
            pi2SelfieSubmittingScreenBinding.title.setText(rendering.getTitle());
            TextView title = pi2SelfieSubmittingScreenBinding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            ViewUtils3.setAccessibilityFocus(title);
        }
        if (rendering.getDescription().length() == 0) {
            pi2SelfieSubmittingScreenBinding.body.setVisibility(8);
        } else {
            pi2SelfieSubmittingScreenBinding.body.setText(rendering.getDescription());
        }
        RemoteImage customLoadingAsset = rendering.getCustomLoadingAsset();
        if (customLoadingAsset != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = pi2SelfieSubmittingScreenBinding.animationContainer;
            Intrinsics.checkNotNullExpressionValue(animationContainer, "animationContainer");
            this.currentLoadingAssetView = RemoteImageUtils.renderToContainer$default(customLoadingAsset, animationContainer, false, 2, null);
            pi2SelfieSubmittingScreenBinding.pendingAnimation.setVisibility(8);
        }
        StepStyles.SelfieStepStyle styles = rendering.getStyles();
        if (styles != null) {
            applyStyles(styles, viewEnvironment, rendering.getPendingPageTextVerticalPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$5$lambda$2(SelfieWorkflow.Screen.SubmittingScreen submittingScreen) {
        submittingScreen.getOnBack().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$5$lambda$3(SelfieWorkflow.Screen.SubmittingScreen submittingScreen) {
        submittingScreen.getOnCancel().invoke();
        return Unit.INSTANCE;
    }

    private final void applyStyles(StepStyles.SelfieStepStyle styles, ViewEnvironment viewEnvironment, PendingPageTextPosition textPosition) throws IllegalArgumentException {
        int[] iArr;
        float f;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            if (textPosition == PendingPageTextPosition.TOP) {
                pendingPageAlignmentValue = StyleElements.PositionType.START;
            } else {
                pendingPageAlignmentValue = StyleElements.PositionType.CENTER;
            }
        }
        if (textPosition == PendingPageTextPosition.TOP) {
            iArr = new int[]{this.binding.title.getId(), this.binding.body.getId(), this.binding.animationContainer.getId()};
        } else {
            iArr = new int[]{this.binding.animationContainer.getId(), this.binding.title.getId(), this.binding.body.getId()};
        }
        int[] iArr2 = iArr;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.binding.contentContainer);
        int i = WhenMappings.$EnumSwitchMapping$0[pendingPageAlignmentValue.ordinal()];
        if (i == 1) {
            f = 0.0f;
        } else if (i == 2) {
            f = 0.5f;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = 1.0f;
        }
        constraintSet.createVerticalChain(0, 3, 0, 4, iArr2, null, 2);
        constraintSet.setVerticalBias(ArraysKt.first(iArr2), f);
        constraintSet.applyTo(this.binding.contentContainer);
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
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView title = this.binding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextStyling2.style$default(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.body;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            TextStyling2.style$default(body, processingTextStyleValue, null, 2, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            int iIntValue2 = fillColorValue.intValue();
            this.binding.pendingAnimation.addColorReplacement(Color.parseColor("#AA85FF"), iIntValue2);
            this.binding.pendingAnimation.addColorReplacement(Color.parseColor("#4600EB"), iIntValue2);
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            this.binding.pendingAnimation.addColorReplacement(Color.parseColor("#190052"), strokeColorValue.intValue());
        }
        Integer backgroundColorValue2 = styles.getBackgroundColorValue();
        if (backgroundColorValue2 != null) {
            int iIntValue3 = backgroundColorValue2.intValue();
            this.binding.pendingAnimation.addColorReplacement(Color.parseColor("#FFFFFF"), iIntValue3);
            this.binding.pendingAnimation.addColorReplacement(Color.parseColor("#F1EBFF"), iIntValue3);
        }
    }

    /* compiled from: SelfieSubmittingRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieSubmittingRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$SubmittingScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<SelfieWorkflow.Screen.SubmittingScreen> {
        private final /* synthetic */ ViewFactory<SelfieWorkflow.Screen.SubmittingScreen> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(SelfieWorkflow.Screen.SubmittingScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super SelfieWorkflow.Screen.SubmittingScreen> getType() {
            return this.$$delegate_0.getType();
        }

        /* compiled from: SelfieSubmittingRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieSubmittingRunner$Companion$1 */
        /* synthetic */ class C437331 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2SelfieSubmittingScreenBinding> {
            public static final C437331 INSTANCE = new C437331();

            C437331() {
                super(3, Pi2SelfieSubmittingScreenBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieSubmittingScreenBinding;", 0);
            }

            public final Pi2SelfieSubmittingScreenBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Pi2SelfieSubmittingScreenBinding.inflate(p0, viewGroup, z);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Pi2SelfieSubmittingScreenBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return invoke(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(SelfieWorkflow.Screen.SubmittingScreen.class), C437331.INSTANCE, C437342.INSTANCE);
        }

        /* compiled from: SelfieSubmittingRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieSubmittingRunner$Companion$2 */
        /* synthetic */ class C437342 extends FunctionReferenceImpl implements Function1<Pi2SelfieSubmittingScreenBinding, SelfieSubmittingRunner> {
            public static final C437342 INSTANCE = new C437342();

            C437342() {
                super(1, SelfieSubmittingRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieSubmittingScreenBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SelfieSubmittingRunner invoke(Pi2SelfieSubmittingScreenBinding p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new SelfieSubmittingRunner(p0);
            }
        }
    }
}
