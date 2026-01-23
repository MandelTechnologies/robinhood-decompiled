package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.material.imageview.ShapeableImageView;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling3;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieReviewCapturesBinding;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieReviewItemBinding;
import com.withpersona.sdk2.inquiry.shared.AdapterHelper;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.StepStyleUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SelfieReviewCapturesRunner.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieReviewCapturesRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$ReviewCapturesScreen;", "binding", "Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewCapturesBinding;", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewCapturesBinding;)V", "adapter", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieReviewCapturesRunner$SelfieImageAdapter;", "singleItemLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "multiItemLayoutManager", "Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "showRendering", "", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Companion", "SelfieImageAdapter", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SelfieReviewCapturesRunner implements LayoutRunner<SelfieWorkflow.Screen.ReviewCapturesScreen> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SelfieImageAdapter adapter;
    private final Pi2SelfieReviewCapturesBinding binding;
    private final GridAutoFitLayoutManager multiItemLayoutManager;
    private final LinearLayoutManager singleItemLayoutManager;

    public SelfieReviewCapturesRunner(Pi2SelfieReviewCapturesBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        SelfieImageAdapter selfieImageAdapter = new SelfieImageAdapter();
        this.adapter = selfieImageAdapter;
        this.singleItemLayoutManager = new LinearLayoutManager(binding.getRoot().getContext());
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.multiItemLayoutManager = new GridAutoFitLayoutManager(context, binding.getRoot().getContext().getResources().getDimensionPixelSize(R$dimen.pi2_review_captures_min_column_width));
        binding.recyclerView.setAdapter(selfieImageAdapter);
        binding.recyclerView.setHasFixedSize(true);
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
    }

    /* compiled from: SelfieReviewCapturesRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieReviewCapturesRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$ReviewCapturesScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<SelfieWorkflow.Screen.ReviewCapturesScreen> {
        private final /* synthetic */ ViewFactory<SelfieWorkflow.Screen.ReviewCapturesScreen> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(SelfieWorkflow.Screen.ReviewCapturesScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super SelfieWorkflow.Screen.ReviewCapturesScreen> getType() {
            return this.$$delegate_0.getType();
        }

        /* compiled from: SelfieReviewCapturesRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$Companion$1 */
        /* synthetic */ class C437311 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2SelfieReviewCapturesBinding> {
            public static final C437311 INSTANCE = new C437311();

            C437311() {
                super(3, Pi2SelfieReviewCapturesBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewCapturesBinding;", 0);
            }

            public final Pi2SelfieReviewCapturesBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Pi2SelfieReviewCapturesBinding.inflate(p0, viewGroup, z);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Pi2SelfieReviewCapturesBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return invoke(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(SelfieWorkflow.Screen.ReviewCapturesScreen.class), C437311.INSTANCE, C437322.INSTANCE);
        }

        /* compiled from: SelfieReviewCapturesRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$Companion$2 */
        /* synthetic */ class C437322 extends FunctionReferenceImpl implements Function1<Pi2SelfieReviewCapturesBinding, SelfieReviewCapturesRunner> {
            public static final C437322 INSTANCE = new C437322();

            C437322() {
                super(1, SelfieReviewCapturesRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewCapturesBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SelfieReviewCapturesRunner invoke(Pi2SelfieReviewCapturesBinding p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new SelfieReviewCapturesRunner(p0);
            }
        }
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final SelfieWorkflow.Screen.ReviewCapturesScreen rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Pi2SelfieReviewCapturesBinding pi2SelfieReviewCapturesBinding = this.binding;
        if (rendering.getSelfies().size() <= 1) {
            pi2SelfieReviewCapturesBinding.recyclerView.setLayoutManager(this.singleItemLayoutManager);
        } else {
            pi2SelfieReviewCapturesBinding.recyclerView.setLayoutManager(this.multiItemLayoutManager);
        }
        TextView title = pi2SelfieReviewCapturesBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        ExtensionsKt.setMarkdown(title, rendering.getStrings().getTitle());
        TextView body = pi2SelfieReviewCapturesBinding.body;
        Intrinsics.checkNotNullExpressionValue(body, "body");
        ExtensionsKt.setMarkdown(body, rendering.getStrings().getDescription());
        pi2SelfieReviewCapturesBinding.usePhotosButton.setText(rendering.getStrings().getSubmitButton());
        pi2SelfieReviewCapturesBinding.usePhotosButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelfieReviewCapturesRunner.showRendering$lambda$5$lambda$1(rendering, view);
            }
        });
        pi2SelfieReviewCapturesBinding.retakeButton.setText(rendering.getStrings().getRetakeButton());
        pi2SelfieReviewCapturesBinding.retakeButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelfieReviewCapturesRunner.showRendering$lambda$5$lambda$2(rendering, view);
            }
        });
        if (rendering.getStyles() != null) {
            applyStyles(rendering.getStyles(), viewEnvironment);
        }
        this.adapter.setStrings(rendering.getStrings());
        this.adapter.setData(rendering.getSelfies());
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieReviewCapturesRunner.showRendering$lambda$5$lambda$3(rendering);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieReviewCapturesRunner.showRendering$lambda$5$lambda$4(rendering);
            }
        };
        Pi2NavigationBar navigationBar = this.binding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$5$lambda$1(SelfieWorkflow.Screen.ReviewCapturesScreen reviewCapturesScreen, View view) {
        reviewCapturesScreen.getOnUsePhotos().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$5$lambda$2(SelfieWorkflow.Screen.ReviewCapturesScreen reviewCapturesScreen, View view) {
        reviewCapturesScreen.getOnRetakePhotos().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$5$lambda$3(SelfieWorkflow.Screen.ReviewCapturesScreen reviewCapturesScreen) {
        reviewCapturesScreen.getOnBack().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$5$lambda$4(SelfieWorkflow.Screen.ReviewCapturesScreen reviewCapturesScreen) {
        reviewCapturesScreen.getOnCancel().invoke();
        return Unit.INSTANCE;
    }

    private final void applyStyles(StepStyles.SelfieStepStyle styles, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        StepStyles.StepCancelButtonComponentStyleContainer base;
        ButtonComponentStyling3 base2;
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.title;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.title.getPaddingRight(), 0);
            TextView title = this.binding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextStyling2.style$default(title, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView2 = this.binding.body;
            textView2.setPadding(textView2.getPaddingLeft(), 0, this.binding.body.getPaddingRight(), 0);
            TextView body = this.binding.body;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            TextStyling2.style$default(body, textStyleValue, null, 2, null);
            this.adapter.setBodyTextStyle(textStyleValue);
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
            Button usePhotosButton = this.binding.usePhotosButton;
            Intrinsics.checkNotNullExpressionValue(usePhotosButton, "usePhotosButton");
            ButtonStyling.style$default(usePhotosButton, buttonPrimaryStyleValue, false, false, 6, null);
        }
        StepStyles.StepSecondaryButtonComponentStyle buttonSecondaryStyle = styles.getButtonSecondaryStyle();
        if (buttonSecondaryStyle != null && (base = buttonSecondaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            Button retakeButton = this.binding.retakeButton;
            Intrinsics.checkNotNullExpressionValue(retakeButton, "retakeButton");
            ButtonStyling.style$default(retakeButton, base2, false, false, 6, null);
        }
        Integer headerButtonColorValue2 = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue2 != null) {
            this.binding.navigationBar.setControlsColor(headerButtonColorValue2.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SelfieReviewCapturesRunner.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u000bJ\u0014\u0010\u001d\u001a\u00020\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\u001e\u001a\u00020\u0018H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieReviewCapturesRunner$SelfieImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "<init>", "()V", "strings", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$ReviewCapturesScreen$Strings;", WebsocketGatewayConstants.DATA_KEY, "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "bodyTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "adapterHelper", "Lcom/withpersona/sdk2/inquiry/shared/AdapterHelper;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem;", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "", "holder", "setStrings", "setBodyTextStyle", "textStyle", "setData", "refreshItems", "SelfieItem", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    static final class SelfieImageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private final AdapterHelper<SelfieItem> adapterHelper;
        private TextBasedComponentStyle bodyTextStyle;
        private List<? extends Selfie> data = CollectionsKt.emptyList();
        private SelfieWorkflow.Screen.ReviewCapturesScreen.Strings strings;

        /* compiled from: SelfieReviewCapturesRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Selfie.Pose.values().length];
                try {
                    iArr[Selfie.Pose.Center.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Selfie.Pose.Left.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Selfie.Pose.Right.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public SelfieImageAdapter() {
            AdapterHelper<SelfieItem> adapterHelper = new AdapterHelper<>(new Function2() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$SelfieImageAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(SelfieReviewCapturesRunner.SelfieImageAdapter.adapterHelper$lambda$0((SelfieReviewCapturesRunner.SelfieImageAdapter.SelfieItem) obj, (SelfieReviewCapturesRunner.SelfieImageAdapter.SelfieItem) obj2));
                }
            }, null, null, 6, null);
            adapterHelper.addItemTypeInternal(Reflection.getOrCreateKotlinClass(SelfieItem.class), Reflection.getOrCreateKotlinClass(Pi2SelfieReviewItemBinding.class), SelfieReviewCapturesRunner2.INSTANCE, new Function3() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$SelfieImageAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SelfieReviewCapturesRunner.SelfieImageAdapter.adapterHelper$lambda$3$lambda$2(this.f$0, (SelfieReviewCapturesRunner.SelfieImageAdapter.SelfieItem) obj, (Pi2SelfieReviewItemBinding) obj2, (RecyclerView.ViewHolder) obj3);
                }
            }, null);
            this.adapterHelper = adapterHelper;
        }

        /* compiled from: SelfieReviewCapturesRunner.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem;", "", "", AnnotatedPrivateKey.LABEL, "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "getSelfie", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class SelfieItem {
            private final String label;
            private final Selfie selfie;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelfieItem)) {
                    return false;
                }
                SelfieItem selfieItem = (SelfieItem) other;
                return Intrinsics.areEqual(this.label, selfieItem.label) && Intrinsics.areEqual(this.selfie, selfieItem.selfie);
            }

            public int hashCode() {
                String str = this.label;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.selfie.hashCode();
            }

            public String toString() {
                return "SelfieItem(label=" + this.label + ", selfie=" + this.selfie + ")";
            }

            public SelfieItem(String str, Selfie selfie) {
                Intrinsics.checkNotNullParameter(selfie, "selfie");
                this.label = str;
                this.selfie = selfie;
            }

            public final String getLabel() {
                return this.label;
            }

            public final Selfie getSelfie() {
                return this.selfie;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean adapterHelper$lambda$0(SelfieItem old, SelfieItem selfieItem) {
            Intrinsics.checkNotNullParameter(old, "old");
            Intrinsics.checkNotNullParameter(selfieItem, "new");
            return Intrinsics.areEqual(old.getSelfie().getAbsoluteFilePath(), selfieItem.getSelfie().getAbsoluteFilePath());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit adapterHelper$lambda$3$lambda$2(SelfieImageAdapter selfieImageAdapter, SelfieItem item, Pi2SelfieReviewItemBinding b, RecyclerView.ViewHolder h) throws IllegalArgumentException {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(b, "b");
            Intrinsics.checkNotNullParameter(h, "h");
            ShapeableImageView image = b.image;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            Coil.imageLoader(image.getContext()).enqueue(new ImageRequest.Builder(image.getContext()).data(item.getSelfie().getAbsoluteFilePath()).target(image).build());
            String label = item.getLabel();
            if (label == null || StringsKt.isBlank(label)) {
                b.label.setVisibility(8);
            } else {
                b.label.setVisibility(0);
                TextView label2 = b.label;
                Intrinsics.checkNotNullExpressionValue(label2, "label");
                ExtensionsKt.setMarkdown(label2, item.getLabel());
            }
            TextBasedComponentStyle textBasedComponentStyle = selfieImageAdapter.bodyTextStyle;
            if (textBasedComponentStyle != null) {
                TextView label3 = b.label;
                Intrinsics.checkNotNullExpressionValue(label3, "label");
                TextStyling2.style$default(label3, textBasedComponentStyle, null, 2, null);
            }
            b.getRoot().setContentDescription(item.getLabel());
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return this.adapterHelper.getItemViewType(position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return this.adapterHelper.onCreateViewHolder(parent, viewType);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: getItemCount */
        public int getSize() {
            return this.adapterHelper.getItemCount();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            this.adapterHelper.onBindViewHolder(holder, position);
        }

        public final void setStrings(SelfieWorkflow.Screen.ReviewCapturesScreen.Strings strings) {
            Intrinsics.checkNotNullParameter(strings, "strings");
            this.strings = strings;
            refreshItems();
        }

        public final void setBodyTextStyle(TextBasedComponentStyle textStyle) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            this.bodyTextStyle = textStyle;
            refreshItems();
        }

        public final void setData(List<? extends Selfie> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            refreshItems();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem] */
        private final void refreshItems() {
            ArrayList arrayList = new ArrayList();
            for (Selfie selfie : this.data) {
                String selfieLabelFront = null;
                if (selfie instanceof Selfie.SelfieImage) {
                    int i = WhenMappings.$EnumSwitchMapping$0[((Selfie.SelfieImage) selfie).getPose().ordinal()];
                    if (i == 1) {
                        SelfieWorkflow.Screen.ReviewCapturesScreen.Strings strings = this.strings;
                        if (strings != null) {
                            selfieLabelFront = strings.getSelfieLabelFront();
                        }
                    } else if (i == 2) {
                        SelfieWorkflow.Screen.ReviewCapturesScreen.Strings strings2 = this.strings;
                        if (strings2 != null) {
                            selfieLabelFront = strings2.getSelfieLabelLeft();
                        }
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SelfieWorkflow.Screen.ReviewCapturesScreen.Strings strings3 = this.strings;
                        if (strings3 != null) {
                            selfieLabelFront = strings3.getSelfieLabelRight();
                        }
                    }
                    selfieLabelFront = new SelfieItem(selfieLabelFront, selfie);
                } else if (!(selfie instanceof Selfie.SelfieVideo)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (selfieLabelFront != null) {
                    arrayList.add(selfieLabelFront);
                }
            }
            AdapterHelper.setItems$default(this.adapterHelper, arrayList, this, null, 4, null);
        }
    }
}
