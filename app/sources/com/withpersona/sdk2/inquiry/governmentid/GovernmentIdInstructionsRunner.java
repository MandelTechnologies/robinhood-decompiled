package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidInstructionsBinding;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.resources.R$attr;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.SnackBarState;
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
import kotlin.text.StringsKt;

/* compiled from: GovernmentIdInstructionsRunner.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdInstructionsRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$InstructionsScreen;", "binding", "Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;)V", "shouldHideSeparators", "", "dividerItemDecoration", "Landroidx/recyclerview/widget/DividerItemDecoration;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "showRendering", "", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Companion", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class GovernmentIdInstructionsRunner implements LayoutRunner<GovernmentIdScreen2.InstructionsScreen> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Pi2GovernmentidInstructionsBinding binding;
    private final DividerItemDecoration dividerItemDecoration;
    private final RecyclerView recyclerView;
    private final boolean shouldHideSeparators;

    public GovernmentIdInstructionsRunner(Pi2GovernmentidInstructionsBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zBoolFromAttr$default = ResTools.boolFromAttr$default(context, R$attr.personaHideSeparators, null, false, false, 14, null);
        this.shouldHideSeparators = zBoolFromAttr$default;
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(binding.getRoot().getContext(), 1);
        this.dividerItemDecoration = dividerItemDecoration;
        RecyclerView recyclerView = binding.recyclerviewGovernmentidIdlist;
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        if (!zBoolFromAttr$default) {
            recyclerView.addItemDecoration(dividerItemDecoration);
        }
        Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
        this.recyclerView = recyclerView;
        CoordinatorLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final GovernmentIdScreen2.InstructionsScreen rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, R$attr.personaGovIdSelectHeaderImage, null, false, 6, null);
        NextStep.GovernmentId.AssetConfig.SelectPage assetConfig = rendering.getAssetConfig();
        RemoteImage headerPictograph = assetConfig != null ? assetConfig.getHeaderPictograph() : null;
        if (numResourceIdFromAttr$default != null) {
            this.binding.imageviewGovernmentidHeaderImage.setImageResource(numResourceIdFromAttr$default.intValue());
            TextView textviewGovernmentidInstructionsTitle = this.binding.textviewGovernmentidInstructionsTitle;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsTitle, "textviewGovernmentidInstructionsTitle");
            ViewGroup.LayoutParams layoutParams = textviewGovernmentidInstructionsTitle.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                textviewGovernmentidInstructionsTitle.setLayoutParams(marginLayoutParams);
                this.binding.governmentidHeaderImageContainer.setVisibility(8);
                this.binding.imageviewGovernmentidHeaderImage.setVisibility(0);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else if (headerPictograph != null) {
            ConstraintLayout governmentidHeaderImageContainer = this.binding.governmentidHeaderImageContainer;
            Intrinsics.checkNotNullExpressionValue(governmentidHeaderImageContainer, "governmentidHeaderImageContainer");
            RemoteImageUtils.renderToContainer$default(headerPictograph, governmentidHeaderImageContainer, false, 2, null);
            this.binding.governmentidHeaderImageContainer.setVisibility(0);
            this.binding.imageviewGovernmentidHeaderImage.setVisibility(8);
        } else {
            this.binding.governmentidHeaderImageContainer.setVisibility(8);
            this.binding.imageviewGovernmentidHeaderImage.setVisibility(8);
        }
        this.binding.textviewGovernmentidInstructionsTitle.setText(rendering.getTitle());
        TextView textviewGovernmentidInstructionsBody = this.binding.textviewGovernmentidInstructionsBody;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsBody, "textviewGovernmentidInstructionsBody");
        GovernmentIdInstructionsRunner2.setOrHideText(textviewGovernmentidInstructionsBody, rendering.getPrompt());
        TextView textviewGovernmentidInstructionslistheader = this.binding.textviewGovernmentidInstructionslistheader;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionslistheader, "textviewGovernmentidInstructionslistheader");
        GovernmentIdInstructionsRunner2.setOrHideText(textviewGovernmentidInstructionslistheader, rendering.getChooseText());
        TextView textviewGovernmentidInstructionsDisclaimer = this.binding.textviewGovernmentidInstructionsDisclaimer;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsDisclaimer, "textviewGovernmentidInstructionsDisclaimer");
        GovernmentIdInstructionsRunner2.setOrHideText(textviewGovernmentidInstructionsDisclaimer, rendering.getDisclaimer());
        if (!StringsKt.isBlank(rendering.getDisclaimer())) {
            this.binding.navigationBar.setAccessibilityTraversalAfter(R$id.textview_governmentid_instructions_disclaimer);
        }
        this.binding.listDivider.setVisibility(this.shouldHideSeparators ? 8 : 0);
        RecyclerView.Adapter adapter = this.recyclerView.getAdapter();
        GovernmentIdListAdapter governmentIdListAdapter = adapter instanceof GovernmentIdListAdapter ? (GovernmentIdListAdapter) adapter : null;
        if (governmentIdListAdapter == null) {
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            governmentIdListAdapter = new GovernmentIdListAdapter(context2, rendering.getEnabledIdClasses(), rendering.getStyles(), rendering.getAssetConfig(), new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdInstructionsRunner.showRendering$lambda$2(rendering, (IdConfig) obj);
                }
            });
        }
        if (this.recyclerView.getAdapter() == null) {
            this.recyclerView.setAdapter(governmentIdListAdapter);
        }
        governmentIdListAdapter.setEnabled(rendering.getIsEnabled());
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdInstructionsRunner.showRendering$lambda$3(rendering);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdInstructionsRunner.showRendering$lambda$4(rendering);
            }
        };
        Pi2NavigationBar navigationBar = this.binding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        CoordinatorLayout root2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        SnackBarState.renderErrorSnackbarIfNeeded$default(root2, rendering.getError(), rendering.getOnErrorDismissed(), null, 0, 0, 56, null);
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        if (styles != null) {
            applyStyles(styles, viewEnvironment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$2(GovernmentIdScreen2.InstructionsScreen instructionsScreen, IdConfig idClass) {
        Intrinsics.checkNotNullParameter(idClass, "idClass");
        instructionsScreen.getSelectIdClass().invoke(idClass);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$3(GovernmentIdScreen2.InstructionsScreen instructionsScreen) {
        instructionsScreen.getOnBack().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$4(GovernmentIdScreen2.InstructionsScreen instructionsScreen) {
        instructionsScreen.getOnCancel().invoke();
        return Unit.INSTANCE;
    }

    private final void applyStyles(StepStyles.GovernmentIdStepStyle styles, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
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
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textviewGovernmentidInstructionsTitle = this.binding.textviewGovernmentidInstructionsTitle;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsTitle, "textviewGovernmentidInstructionsTitle");
            TextStyling2.style$default(textviewGovernmentidInstructionsTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textviewGovernmentidInstructionsBody = this.binding.textviewGovernmentidInstructionsBody;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsBody, "textviewGovernmentidInstructionsBody");
            TextStyling2.style$default(textviewGovernmentidInstructionsBody, textStyleValue, null, 2, null);
            TextView textviewGovernmentidInstructionslistheader = this.binding.textviewGovernmentidInstructionslistheader;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionslistheader, "textviewGovernmentidInstructionslistheader");
            TextStyling2.style$default(textviewGovernmentidInstructionslistheader, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textviewGovernmentidInstructionsDisclaimer = this.binding.textviewGovernmentidInstructionsDisclaimer;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsDisclaimer, "textviewGovernmentidInstructionsDisclaimer");
            TextStyling2.style$default(textviewGovernmentidInstructionsDisclaimer, disclaimerStyleValue, null, 2, null);
        }
        Integer governmentIdSelectOptionBorderColorValue = styles.getGovernmentIdSelectOptionBorderColorValue();
        if (governmentIdSelectOptionBorderColorValue != null) {
            int iIntValue2 = governmentIdSelectOptionBorderColorValue.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iIntValue2, iIntValue2});
            gradientDrawable.setSize((int) Math.ceil(ExtensionsKt.getDpToPx(1.0d)), (int) Math.ceil(ExtensionsKt.getDpToPx(1.0d)));
            this.dividerItemDecoration.setDrawable(gradientDrawable);
            this.binding.listDivider.setBackgroundColor(iIntValue2);
        }
        Double governmentIdOptionBorderWidthValue = styles.getGovernmentIdOptionBorderWidthValue();
        if (governmentIdOptionBorderWidthValue != null) {
            final double dDoubleValue = governmentIdOptionBorderWidthValue.doubleValue();
            GradientDrawable gradientDrawable2 = (GradientDrawable) this.dividerItemDecoration.getDrawable();
            if (gradientDrawable2 != null) {
                gradientDrawable2.setSize((int) Math.ceil(ExtensionsKt.getDpToPx(dDoubleValue)), (int) Math.ceil(ExtensionsKt.getDpToPx(dDoubleValue)));
            }
            View listDivider = this.binding.listDivider;
            Intrinsics.checkNotNullExpressionValue(listDivider, "listDivider");
            ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(listDivider, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdInstructionsRunner.applyStyles$lambda$15$lambda$14(this.f$0, dDoubleValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyStyles$lambda$15$lambda$14(GovernmentIdInstructionsRunner governmentIdInstructionsRunner, double d) {
        View view = governmentIdInstructionsRunner.binding.listDivider;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (d > 0.0d) {
            layoutParams.height = (int) ExtensionsKt.getDpToPx(d);
        } else {
            governmentIdInstructionsRunner.binding.listDivider.setVisibility(8);
        }
        view.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }

    /* compiled from: GovernmentIdInstructionsRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdInstructionsRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$InstructionsScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<GovernmentIdScreen2.InstructionsScreen> {
        private final /* synthetic */ ViewFactory<GovernmentIdScreen2.InstructionsScreen> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(GovernmentIdScreen2.InstructionsScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super GovernmentIdScreen2.InstructionsScreen> getType() {
            return this.$$delegate_0.getType();
        }

        /* compiled from: GovernmentIdInstructionsRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner$Companion$1 */
        /* synthetic */ class C435851 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2GovernmentidInstructionsBinding> {
            public static final C435851 INSTANCE = new C435851();

            C435851() {
                super(3, Pi2GovernmentidInstructionsBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;", 0);
            }

            public final Pi2GovernmentidInstructionsBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Pi2GovernmentidInstructionsBinding.inflate(p0, viewGroup, z);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Pi2GovernmentidInstructionsBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return invoke(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(GovernmentIdScreen2.InstructionsScreen.class), C435851.INSTANCE, C435862.INSTANCE);
        }

        /* compiled from: GovernmentIdInstructionsRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner$Companion$2 */
        /* synthetic */ class C435862 extends FunctionReferenceImpl implements Function1<Pi2GovernmentidInstructionsBinding, GovernmentIdInstructionsRunner> {
            public static final C435862 INSTANCE = new C435862();

            C435862() {
                super(1, GovernmentIdInstructionsRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final GovernmentIdInstructionsRunner invoke(Pi2GovernmentidInstructionsBinding p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new GovernmentIdInstructionsRunner(p0);
            }
        }
    }
}
