package com.withpersona.sdk2.inquiry.steps.p423ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.squareup.workflow1.p415ui.AndroidViewRendering;
import com.squareup.workflow1.p415ui.BackPressHandler;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepBottomSheetBinding;
import com.withpersona.sdk2.inquiry.shared.p422ui.BottomSheetUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.BottomSheetStyling2;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UiStepBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012$\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR2\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00000.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/UiStepBottomSheet;", "Lcom/squareup/workflow1/ui/AndroidViewRendering;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "", "hideWhenTappedOutside", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenGenerationResult;", "uiScreenGenerationResult", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenGenerationResult;", "getUiScreenGenerationResult", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenGenerationResult;", "setUiScreenGenerationResult", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenGenerationResult;)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getBottomSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "setBottomSheetBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "Lcom/squareup/workflow1/ui/ViewFactory;", "viewFactory", "Lcom/squareup/workflow1/ui/ViewFactory;", "getViewFactory", "()Lcom/squareup/workflow1/ui/ViewFactory;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class UiStepBottomSheet implements AndroidViewRendering<UiStepBottomSheet> {
    private BottomSheetBehavior<?> bottomSheetBehavior;
    private final String cancelButtonName;
    private final List<Tuples2<String, Function1<UiComponent, Unit>>> componentNamesToActions;
    private final boolean hideWhenTappedOutside;
    private final Function0<Unit> onCancelled;
    private final UiComponentScreen uiScreen;
    private UiStepUtils6 uiScreenGenerationResult;
    private final ViewFactory<UiStepBottomSheet> viewFactory;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiStepBottomSheet)) {
            return false;
        }
        UiStepBottomSheet uiStepBottomSheet = (UiStepBottomSheet) other;
        return Intrinsics.areEqual(this.uiScreen, uiStepBottomSheet.uiScreen) && Intrinsics.areEqual(this.componentNamesToActions, uiStepBottomSheet.componentNamesToActions) && Intrinsics.areEqual(this.onCancelled, uiStepBottomSheet.onCancelled) && Intrinsics.areEqual(this.cancelButtonName, uiStepBottomSheet.cancelButtonName) && this.hideWhenTappedOutside == uiStepBottomSheet.hideWhenTappedOutside;
    }

    public int hashCode() {
        int iHashCode = ((((this.uiScreen.hashCode() * 31) + this.componentNamesToActions.hashCode()) * 31) + this.onCancelled.hashCode()) * 31;
        String str = this.cancelButtonName;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hideWhenTappedOutside);
    }

    public String toString() {
        return "UiStepBottomSheet(uiScreen=" + this.uiScreen + ", componentNamesToActions=" + this.componentNamesToActions + ", onCancelled=" + this.onCancelled + ", cancelButtonName=" + this.cancelButtonName + ", hideWhenTappedOutside=" + this.hideWhenTappedOutside + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiStepBottomSheet(UiComponentScreen uiScreen, List<? extends Tuples2<String, ? extends Function1<? super UiComponent, Unit>>> componentNamesToActions, Function0<Unit> onCancelled, String str, boolean z) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        this.uiScreen = uiScreen;
        this.componentNamesToActions = componentNamesToActions;
        this.onCancelled = onCancelled;
        this.cancelButtonName = str;
        this.hideWhenTappedOutside = z;
        LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
        this.viewFactory = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(UiStepBottomSheet.class), UiStepBottomSheet2.INSTANCE, new Function1<Pi2GenericUiStepBottomSheetBinding, LayoutRunner<UiStepBottomSheet>>() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$special$$inlined$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final LayoutRunner<UiStepBottomSheet> invoke(final Pi2GenericUiStepBottomSheetBinding binding) {
                Intrinsics.checkNotNullParameter(binding, "binding");
                final UiStepBottomSheet uiStepBottomSheet = this.this$0;
                return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$special$$inlined$bind$1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.squareup.workflow1.p415ui.LayoutRunner
                    public final void showRendering(RenderingT rendering, ViewEnvironment viewEnvironment) {
                        View view;
                        Intrinsics.checkNotNullParameter(rendering, "rendering");
                        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                        final UiStepBottomSheet uiStepBottomSheet2 = (UiStepBottomSheet) rendering;
                        Pi2GenericUiStepBottomSheetBinding pi2GenericUiStepBottomSheetBinding = (Pi2GenericUiStepBottomSheetBinding) binding;
                        ViewGroup.LayoutParams layoutParams = pi2GenericUiStepBottomSheetBinding.bottomSheet.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                        Intrinsics.checkNotNull(behavior, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<*>");
                        final BottomSheetBehavior<?> bottomSheetBehavior = (BottomSheetBehavior) behavior;
                        if (!InsetsUtils.getSupportsCustomNavigationBar()) {
                            CoordinatorLayout root = pi2GenericUiStepBottomSheetBinding.getRoot();
                            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                            InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 14, null);
                        }
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$viewFactory$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                uiStepBottomSheet2.onCancelled.invoke();
                            }
                        };
                        ConstraintLayout bottomSheet = pi2GenericUiStepBottomSheetBinding.bottomSheet;
                        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
                        BottomSheetUtils.setup(bottomSheetBehavior, function0, bottomSheet, pi2GenericUiStepBottomSheetBinding.contentScrollView, pi2GenericUiStepBottomSheetBinding.tintScreen);
                        uiStepBottomSheet.setBottomSheetBehavior(bottomSheetBehavior);
                        pi2GenericUiStepBottomSheetBinding.getRoot().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$viewFactory$2$2
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View view2) {
                                Intrinsics.checkNotNullParameter(view2, "view");
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View view2) {
                                Intrinsics.checkNotNullParameter(view2, "view");
                                final BottomSheetBehavior<?> bottomSheetBehavior2 = bottomSheetBehavior;
                                view2.postDelayed(new Runnable() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$viewFactory$2$2$onViewAttachedToWindow$1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        bottomSheetBehavior2.setState(3);
                                    }
                                }, 100L);
                            }
                        });
                        Context context = pi2GenericUiStepBottomSheetBinding.getRoot().getContext();
                        UiStepUtils uiStepUtils = UiStepUtils.INSTANCE;
                        Intrinsics.checkNotNull(context);
                        UiStepUtils6 uiStepUtils6GenerateViewsFromUiScreen$default = UiStepUtils.generateViewsFromUiScreen$default(uiStepUtils, context, uiStepBottomSheet.uiScreen, false, true, false, 16, null);
                        uiStepBottomSheet.setUiScreenGenerationResult(uiStepUtils6GenerateViewsFromUiScreen$default);
                        pi2GenericUiStepBottomSheetBinding.contentContainer.addView(uiStepUtils6GenerateViewsFromUiScreen$default.getContentView());
                        Map<String, ComponentView> componentNameToComponentView = uiStepUtils6GenerateViewsFromUiScreen$default.getViewBindings().getComponentNameToComponentView();
                        for (Tuples2 tuples2 : uiStepBottomSheet.componentNamesToActions) {
                            String str2 = (String) tuples2.getFirst();
                            final Function1 function1 = (Function1) tuples2.getSecond();
                            final ComponentView componentView = componentNameToComponentView.get(str2);
                            if (componentView != null) {
                                componentView.getView().setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$viewFactory$2$3$1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        function1.invoke(componentView.getComponent());
                                    }
                                });
                            }
                        }
                        ComponentView componentView2 = componentNameToComponentView.get(uiStepBottomSheet.cancelButtonName);
                        if (componentView2 != null && (view = componentView2.getView()) != null) {
                            view.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$viewFactory$2$4
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    bottomSheetBehavior.setState(5);
                                }
                            });
                        }
                        ConstraintLayout bottomSheet2 = pi2GenericUiStepBottomSheetBinding.bottomSheet;
                        Intrinsics.checkNotNullExpressionValue(bottomSheet2, "bottomSheet");
                        BackPressHandler.setBackPressedHandler(bottomSheet2, new Function0<Unit>() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$viewFactory$2$5
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                bottomSheetBehavior.setState(5);
                            }
                        });
                        if (uiStepBottomSheet2.hideWhenTappedOutside) {
                            pi2GenericUiStepBottomSheetBinding.tintScreen.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$viewFactory$2$6
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    bottomSheetBehavior.setState(5);
                                }
                            });
                        } else {
                            pi2GenericUiStepBottomSheetBinding.tintScreen.setOnClickListener(null);
                        }
                        NestedScrollView contentScrollView = pi2GenericUiStepBottomSheetBinding.contentScrollView;
                        Intrinsics.checkNotNullExpressionValue(contentScrollView, "contentScrollView");
                        StepStyles.UiStepStyle styles = uiStepBottomSheet.uiScreen.getStyles();
                        FrameLayout contentContainer = pi2GenericUiStepBottomSheetBinding.contentContainer;
                        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
                        BottomSheetStyling2.applyBottomSheetStyles$default(contentScrollView, styles, contentContainer, null, 4, null);
                    }
                };
            }
        });
    }

    public /* synthetic */ UiStepBottomSheet(UiComponentScreen uiComponentScreen, List list, Function0 function0, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiComponentScreen, list, function0, str, (i & 16) != 0 ? true : z);
    }

    public final UiStepUtils6 getUiScreenGenerationResult() {
        return this.uiScreenGenerationResult;
    }

    public final void setUiScreenGenerationResult(UiStepUtils6 uiStepUtils6) {
        this.uiScreenGenerationResult = uiStepUtils6;
    }

    public final BottomSheetBehavior<?> getBottomSheetBehavior() {
        return this.bottomSheetBehavior;
    }

    public final void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        this.bottomSheetBehavior = bottomSheetBehavior;
    }

    @Override // com.squareup.workflow1.p415ui.AndroidViewRendering
    public ViewFactory<UiStepBottomSheet> getViewFactory() {
        return this.viewFactory;
    }
}
