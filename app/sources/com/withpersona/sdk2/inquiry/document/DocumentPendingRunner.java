package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentLoadingBinding;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.resources.R$attr;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
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

/* compiled from: DocumentPendingRunner.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003J \u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentPendingRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen$LoadingAnimation;", "binding", "Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;)V", "currentLoadingAssetView", "Landroid/view/View;", "showRendering", "", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "getColorFromAttr", "", "Landroid/content/Context;", "attrColor", "typedValue", "Landroid/util/TypedValue;", "resolveRefs", "", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "textPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Companion", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DocumentPendingRunner implements LayoutRunner<DocumentWorkflow.Screen.LoadingAnimation> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Pi2DocumentLoadingBinding binding;
    private View currentLoadingAssetView;

    /* compiled from: DocumentPendingRunner.kt */
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

    public DocumentPendingRunner(Pi2DocumentLoadingBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, R$attr.personaInquiryLoadingLottieRaw, null, false, 6, null);
        if (numResourceIdFromAttr$default != null) {
            binding.pendingAnimation.setAnimation(numResourceIdFromAttr$default.intValue());
            binding.pendingAnimation.removeAllUpdateListeners();
        } else {
            ThemeableLottieAnimationView themeableLottieAnimationView = binding.pendingAnimation;
            int color = Color.parseColor("#4600EB");
            Context context2 = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeableLottieAnimationView.addColorReplacement(color, getColorFromAttr$default(this, context2, androidx.appcompat.R$attr.colorPrimary, null, false, 6, null));
        }
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final DocumentWorkflow.Screen.LoadingAnimation rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Pi2DocumentLoadingBinding pi2DocumentLoadingBinding = this.binding;
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentPendingRunner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentPendingRunner.showRendering$lambda$4$lambda$1(rendering);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentPendingRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentPendingRunner.showRendering$lambda$4$lambda$2(rendering);
            }
        };
        Pi2NavigationBar navigationBar = pi2DocumentLoadingBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = pi2DocumentLoadingBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        String title = rendering.getTitle();
        if (title == null || title.length() == 0) {
            pi2DocumentLoadingBinding.title.setVisibility(8);
        } else {
            pi2DocumentLoadingBinding.title.setText(rendering.getTitle());
            TextView title2 = pi2DocumentLoadingBinding.title;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            ViewUtils3.setAccessibilityFocus(title2);
        }
        String prompt = rendering.getPrompt();
        if (prompt == null || prompt.length() == 0) {
            pi2DocumentLoadingBinding.body.setVisibility(8);
        } else {
            pi2DocumentLoadingBinding.body.setText(rendering.getPrompt());
        }
        NextStep.Document.AssetConfig.PendingPage assetConfig = rendering.getAssetConfig();
        RemoteImage loadingPictograph = assetConfig != null ? assetConfig.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = pi2DocumentLoadingBinding.animationContainer;
            Intrinsics.checkNotNullExpressionValue(animationContainer, "animationContainer");
            this.currentLoadingAssetView = RemoteImageUtils.renderToContainer$default(loadingPictograph, animationContainer, false, 2, null);
            pi2DocumentLoadingBinding.pendingAnimation.setVisibility(8);
        }
        StepStyles.DocumentStepStyle styles = rendering.getStyles();
        if (styles != null) {
            applyStyles(styles, viewEnvironment, rendering.getPendingPageTextVerticalPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$4$lambda$1(DocumentWorkflow.Screen.LoadingAnimation loadingAnimation) {
        loadingAnimation.getOnBack().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$4$lambda$2(DocumentWorkflow.Screen.LoadingAnimation loadingAnimation) {
        loadingAnimation.getOnCancel().invoke();
        return Unit.INSTANCE;
    }

    static /* synthetic */ int getColorFromAttr$default(DocumentPendingRunner documentPendingRunner, Context context, int i, TypedValue typedValue, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return documentPendingRunner.getColorFromAttr(context, i, typedValue, z);
    }

    private final int getColorFromAttr(Context context, int i, TypedValue typedValue, boolean z) {
        context.getTheme().resolveAttribute(i, typedValue, z);
        return typedValue.data;
    }

    private final void applyStyles(StepStyles.DocumentStepStyle styles, ViewEnvironment viewEnvironment, PendingPageTextPosition textPosition) throws IllegalArgumentException {
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
            this.binding.pendingAnimation.addColorReplacement(Color.parseColor("#4600EB"), fillColorValue.intValue());
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            int iIntValue2 = strokeColorValue.intValue();
            this.binding.pendingAnimation.addColorReplacement(Color.parseColor("#180052"), iIntValue2);
            this.binding.pendingAnimation.addColorReplacement(Color.parseColor("#190052"), iIntValue2);
        }
    }

    /* compiled from: DocumentPendingRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentPendingRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen$LoadingAnimation;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<DocumentWorkflow.Screen.LoadingAnimation> {
        private final /* synthetic */ ViewFactory<DocumentWorkflow.Screen.LoadingAnimation> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(DocumentWorkflow.Screen.LoadingAnimation initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super DocumentWorkflow.Screen.LoadingAnimation> getType() {
            return this.$$delegate_0.getType();
        }

        /* compiled from: DocumentPendingRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentPendingRunner$Companion$1 */
        /* synthetic */ class C435641 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2DocumentLoadingBinding> {
            public static final C435641 INSTANCE = new C435641();

            C435641() {
                super(3, Pi2DocumentLoadingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;", 0);
            }

            public final Pi2DocumentLoadingBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Pi2DocumentLoadingBinding.inflate(p0, viewGroup, z);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Pi2DocumentLoadingBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return invoke(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(DocumentWorkflow.Screen.LoadingAnimation.class), C435641.INSTANCE, C435652.INSTANCE);
        }

        /* compiled from: DocumentPendingRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentPendingRunner$Companion$2 */
        /* synthetic */ class C435652 extends FunctionReferenceImpl implements Function1<Pi2DocumentLoadingBinding, DocumentPendingRunner> {
            public static final C435652 INSTANCE = new C435652();

            C435652() {
                super(1, DocumentPendingRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DocumentPendingRunner invoke(Pi2DocumentLoadingBinding p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new DocumentPendingRunner(p0);
            }
        }
    }
}
