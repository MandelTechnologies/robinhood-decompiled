package com.withpersona.sdk2.inquiry.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.squareup.workflow1.p415ui.BackPressHandler;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.LayoutRunnerViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles2;
import com.withpersona.sdk2.inquiry.resources.R$attr;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.StepStyleUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: InquiryInitializingRunner.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\b*\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006#"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryInitializingRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen$InquiryLoadingScreen;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "getColorFromAttr", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "animationResId", "", "setLoadingAnimation", "(I)V", "rendering", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "viewEnvironment", "showRendering", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen$InquiryLoadingScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/airbnb/lottie/LottieAnimationView;", "pendingAnimation", "Lcom/airbnb/lottie/LottieAnimationView;", "customAnimation", "Ljava/lang/Integer;", "currentAnimationRes", "Companion", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class InquiryInitializingRunner implements LayoutRunner<InquiryWorkflow.Screen.InquiryLoadingScreen> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Integer currentAnimationRes;
    private final Integer customAnimation;
    private final LottieAnimationView pendingAnimation;
    private final View view;

    public InquiryInitializingRunner(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        View viewFindViewById = view.findViewById(R$id.animationview_inquiry_initializingspinner);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        this.pendingAnimation = lottieAnimationView;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, R$attr.personaInquiryLoadingLottieRaw, null, false, 6, null);
        this.customAnimation = numResourceIdFromAttr$default;
        if (numResourceIdFromAttr$default != null) {
            setLoadingAnimation(numResourceIdFromAttr$default.intValue());
            lottieAnimationView.removeAllUpdateListeners();
        } else {
            lottieAnimationView.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.STROKE_COLOR, (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryInitializingRunner$$ExternalSyntheticLambda3
                @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                    return InquiryInitializingRunner._init_$lambda$0(this.f$0, lottieFrameInfo);
                }
            });
            lottieAnimationView.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.COLOR, (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryInitializingRunner$$ExternalSyntheticLambda4
                @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                    return InquiryInitializingRunner._init_$lambda$1(this.f$0, lottieFrameInfo);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _init_$lambda$0(InquiryInitializingRunner inquiryInitializingRunner, LottieFrameInfo lottieFrameInfo) {
        Context context = inquiryInitializingRunner.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(getColorFromAttr$default(inquiryInitializingRunner, context, com.google.android.material.R$attr.colorPrimaryVariant, null, false, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _init_$lambda$1(InquiryInitializingRunner inquiryInitializingRunner, LottieFrameInfo lottieFrameInfo) {
        Context context = inquiryInitializingRunner.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(getColorFromAttr$default(inquiryInitializingRunner, context, androidx.appcompat.R$attr.colorPrimary, null, false, 6, null));
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final InquiryWorkflow.Screen.InquiryLoadingScreen rendering, ViewEnvironment viewEnvironment) {
        InquiryInitializingRunner inquiryInitializingRunner;
        int colorFromAttr$default;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        if (rendering.getUseBasicSpinner() && this.customAnimation == null) {
            setLoadingAnimation(R$raw.pi2_initial_load_animation);
            this.pendingAnimation.setScaleX(0.5f);
            this.pendingAnimation.setScaleY(0.5f);
        }
        if (rendering.getUseBasicSpinner()) {
            Context context = this.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, R$attr.personaInitialLoadingBackgroundDrawable, null, false, 6, null);
            if (numResourceIdFromAttr$default != null) {
                this.view.setBackground(ContextCompat.getDrawable(this.view.getContext(), numResourceIdFromAttr$default.intValue()));
            }
        }
        StepStyles2 styles = rendering.getStyles();
        if (styles == null || (backgroundColorValue = styles.getBackgroundColorValue()) == null) {
            Context context2 = this.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            inquiryInitializingRunner = this;
            colorFromAttr$default = getColorFromAttr$default(inquiryInitializingRunner, context2, R.attr.colorBackground, null, false, 6, null);
        } else {
            colorFromAttr$default = backgroundColorValue.intValue();
            inquiryInitializingRunner = this;
        }
        SystemUiControllerUtils.updateSystemUiColor(viewEnvironment, colorFromAttr$default);
        StepStyles2 styles2 = rendering.getStyles();
        if (styles2 != null) {
            Integer backgroundColorValue2 = styles2.getBackgroundColorValue();
            if (backgroundColorValue2 != null) {
                inquiryInitializingRunner.view.setBackgroundColor(backgroundColorValue2.intValue());
            }
            Context context3 = inquiryInitializingRunner.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = StepStyleUtils.backgroundImageDrawable(styles2, context3);
            if (drawableBackgroundImageDrawable != null) {
                inquiryInitializingRunner.view.setBackground(drawableBackgroundImageDrawable);
            }
            if (inquiryInitializingRunner.customAnimation == null) {
                Integer fillColorValue = styles2.getFillColorValue();
                if (fillColorValue != null) {
                    final int iIntValue = fillColorValue.intValue();
                    inquiryInitializingRunner.pendingAnimation.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.COLOR, (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryInitializingRunner$$ExternalSyntheticLambda0
                        @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                        public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                            return InquiryInitializingRunner.showRendering$lambda$9$lambda$6$lambda$5(iIntValue, lottieFrameInfo);
                        }
                    });
                }
                Integer strokeColorValue = styles2.getStrokeColorValue();
                if (strokeColorValue != null) {
                    final int iIntValue2 = strokeColorValue.intValue();
                    inquiryInitializingRunner.pendingAnimation.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.STROKE_COLOR, (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryInitializingRunner$$ExternalSyntheticLambda1
                        @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                        public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                            return InquiryInitializingRunner.showRendering$lambda$9$lambda$8$lambda$7(iIntValue2, lottieFrameInfo);
                        }
                    });
                }
            }
        }
        BackPressHandler.setBackPressedHandler(inquiryInitializingRunner.view, new Function0() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryInitializingRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InquiryInitializingRunner.showRendering$lambda$10(rendering);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer showRendering$lambda$9$lambda$6$lambda$5(int i, LottieFrameInfo lottieFrameInfo) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer showRendering$lambda$9$lambda$8$lambda$7(int i, LottieFrameInfo lottieFrameInfo) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$10(InquiryWorkflow.Screen.InquiryLoadingScreen inquiryLoadingScreen) {
        inquiryLoadingScreen.getOnBack().invoke();
        return Unit.INSTANCE;
    }

    static /* synthetic */ int getColorFromAttr$default(InquiryInitializingRunner inquiryInitializingRunner, Context context, int i, TypedValue typedValue, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return inquiryInitializingRunner.getColorFromAttr(context, i, typedValue, z);
    }

    private final int getColorFromAttr(Context context, int i, TypedValue typedValue, boolean z) {
        context.getTheme().resolveAttribute(i, typedValue, z);
        return typedValue.data;
    }

    private final void setLoadingAnimation(int animationResId) {
        Integer num = this.currentAnimationRes;
        if (num != null && num.intValue() == animationResId) {
            return;
        }
        this.currentAnimationRes = Integer.valueOf(animationResId);
        this.pendingAnimation.cancelAnimation();
        this.pendingAnimation.setMinFrame(0);
        this.pendingAnimation.setAnimation(animationResId);
        this.pendingAnimation.playAnimation();
    }

    /* compiled from: InquiryInitializingRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryInitializingRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen$InquiryLoadingScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<InquiryWorkflow.Screen.InquiryLoadingScreen> {
        private final /* synthetic */ ViewFactory<InquiryWorkflow.Screen.InquiryLoadingScreen> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(InquiryWorkflow.Screen.InquiryLoadingScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super InquiryWorkflow.Screen.InquiryLoadingScreen> getType() {
            return this.$$delegate_0.getType();
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new LayoutRunnerViewFactory(Reflection.getOrCreateKotlinClass(InquiryWorkflow.Screen.InquiryLoadingScreen.class), R$layout.pi2_inquiry_initializing, C436161.INSTANCE);
        }

        /* compiled from: InquiryInitializingRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryInitializingRunner$Companion$1 */
        /* synthetic */ class C436161 extends FunctionReferenceImpl implements Function1<View, InquiryInitializingRunner> {
            public static final C436161 INSTANCE = new C436161();

            C436161() {
                super(1, InquiryInitializingRunner.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InquiryInitializingRunner invoke(View p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new InquiryInitializingRunner(p0);
            }
        }
    }
}
