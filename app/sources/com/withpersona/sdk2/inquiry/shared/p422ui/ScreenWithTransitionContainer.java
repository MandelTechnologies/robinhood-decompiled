package com.withpersona.sdk2.inquiry.shared.p422ui;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.transition.Scene;
import androidx.transition.Slide;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.squareup.workflow1.p415ui.BuilderViewFactory;
import com.squareup.workflow1.p415ui.Compatible;
import com.squareup.workflow1.p415ui.Named;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.ViewRegistry;
import com.squareup.workflow1.p415ui.ViewRegistry2;
import com.squareup.workflow1.p415ui.ViewRegistry4;
import com.squareup.workflow1.p415ui.ViewShowRendering;
import com.squareup.workflow1.p415ui.WorkflowViewState;
import com.squareup.workflow1.p415ui.WorkflowViewState2;
import com.squareup.workflow1.p415ui.androidx.WorkflowAndroidXSupport;
import com.squareup.workflow1.p415ui.androidx.WorkflowLifecycleOwner;
import com.squareup.workflow1.p415ui.backstack.BackStackConfig;
import com.squareup.workflow1.p415ui.backstack.ViewStateCache;
import com.squareup.workflow1.p415ui.container.R$id;
import com.withpersona.sdk2.inquiry.shared.p422ui.ScreenWithTransitionContainer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: ScreenWithTransitionContainer.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 %2\u00020\u0001:\u0002$%B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0004J\"\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u001fH\u0014J\b\u0010\"\u001a\u00020\u0014H\u0014J\b\u0010#\u001a\u00020\u0014H\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "viewStateCache", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "currentView", "Landroid/view/View;", "getCurrentView", "()Landroid/view/View;", "currentRendering", "Lcom/squareup/workflow1/ui/Named;", "update", "", "newRendering", "Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;", "newViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "performTransition", "oldViewMaybe", "newView", NavTransition2.KEY_TRANSITION, "Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenTransition;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "onAttachedToWindow", "onDetachedFromWindow", "SavedState", "Companion", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public class ScreenWithTransitionContainer extends FrameLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Named<?> currentRendering;
    private final ViewStateCache viewStateCache;

    /* compiled from: ScreenWithTransitionContainer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenWithTransition2.values().length];
            try {
                iArr[ScreenWithTransition2.SLIDE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenWithTransition2.SLIDE_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenWithTransition2.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ScreenWithTransitionContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScreenWithTransitionContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewStateCache = new ViewStateCache();
    }

    private final View getCurrentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    protected final void update(ScreenWithTransition newRendering, ViewEnvironment newViewEnvironment) {
        WorkflowLifecycleOwner workflowLifecycleOwner;
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(newViewEnvironment, "newViewEnvironment");
        ViewEnvironment viewEnvironmentPlus = newViewEnvironment.plus(Tuples4.m3642to(BackStackConfig.INSTANCE, BackStackConfig.First));
        Named<?> named = new Named<>(newRendering.getScreen(), "screen_with_transition");
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = ViewShowRendering.canShowRendering(currentView, named) ? currentView : null;
            if (view != null) {
                this.viewStateCache.prune(CollectionsKt.listOf(named));
                ViewShowRendering.showRendering(view, named, viewEnvironmentPlus);
                return;
            }
        }
        ViewRegistry viewRegistry = (ViewRegistry) viewEnvironmentPlus.get(ViewRegistry.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View viewBuildView = ViewRegistry2.buildView(viewRegistry, named, viewEnvironmentPlus, context, this, new ViewRegistry4() { // from class: com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer$$ExternalSyntheticLambda0
            @Override // com.squareup.workflow1.p415ui.ViewRegistry4
            public final void startView(View view2, Function0 function0) {
                ScreenWithTransitionContainer.update$lambda$2(view2, function0);
            }
        });
        ViewShowRendering.start(viewBuildView);
        performTransition(currentView, viewBuildView, newRendering.getTransition());
        if (currentView != null && (workflowLifecycleOwner = WorkflowLifecycleOwner.INSTANCE.get(currentView)) != null) {
            workflowLifecycleOwner.destroyOnDetach();
        }
        this.currentRendering = named;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void update$lambda$2(View view, Function0 doStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(doStart, "doStart");
        WorkflowLifecycleOwner.Companion.installOn$default(WorkflowLifecycleOwner.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    protected void performTransition(View oldViewMaybe, View newView, ScreenWithTransition2 transition) {
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(newView, "newView");
        Intrinsics.checkNotNullParameter(transition, "transition");
        if (oldViewMaybe != null) {
            View viewFindViewById = oldViewMaybe.findViewById(R$id.back_stack_body);
            View viewFindViewById2 = newView.findViewById(R$id.back_stack_body);
            if (viewFindViewById == null || viewFindViewById2 == null) {
                viewFindViewById2 = newView;
            } else {
                oldViewMaybe = viewFindViewById;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[transition.ordinal()];
            if (i == 1) {
                tuples2M3642to = Tuples4.m3642to(8388611, 8388613);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TransitionManager.m672go(new Scene(this, newView), null);
                    return;
                }
                tuples2M3642to = Tuples4.m3642to(8388613, 8388611);
            }
            TransitionSet interpolator = new TransitionSet().addTransition(new Slide(((Number) tuples2M3642to.component1()).intValue()).addTarget(oldViewMaybe)).addTransition(new Slide(((Number) tuples2M3642to.component2()).intValue()).addTarget(viewFindViewById2)).setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
            Intrinsics.checkNotNullExpressionValue(interpolator, "setInterpolator(...)");
            TransitionManager.endTransitions(this);
            TransitionManager.m672go(new Scene(this, newView), interpolator);
            return;
        }
        addView(newView);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState != null) {
            return new SavedState(parcelableOnSaveInstanceState, this.viewStateCache.save());
        }
        return null;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            this.viewStateCache.restore(savedState.getSavedViewState());
            super.onRestoreInstanceState(((SavedState) state).getSuperState());
        } else {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        SavedStateRegistryOwner savedStateRegistryOwnerStateRegistryOwnerFromViewTreeOrContext = WorkflowAndroidXSupport.INSTANCE.stateRegistryOwnerFromViewTreeOrContext(this);
        Compatible.Companion companion = Compatible.INSTANCE;
        WorkflowViewState<?> workflowViewStateOrNull = WorkflowViewState2.getWorkflowViewStateOrNull(this);
        Object showing = workflowViewStateOrNull == null ? null : workflowViewStateOrNull.getShowing();
        if (showing == null) {
            showing = null;
        }
        Intrinsics.checkNotNull(showing);
        this.viewStateCache.attachToParentRegistryOwner(Compatible.Companion.keyFor$default(companion, showing, null, 2, null), savedStateRegistryOwnerStateRegistryOwnerFromViewTreeOrContext);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.viewStateCache.detachFromParentRegistry();
        super.onDetachedFromWindow();
    }

    /* compiled from: ScreenWithTransitionContainer.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;", "Landroid/view/View$BaseSavedState;", "superState", "Landroid/os/Parcelable;", "savedViewState", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "<init>", "(Landroid/os/Parcelable;Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getSavedViewState", "()Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "writeToParcel", "", "out", "flags", "", "CREATOR", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ViewStateCache.Saved savedViewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable superState, ViewStateCache.Saved savedViewState) {
            super(superState);
            Intrinsics.checkNotNullParameter(superState, "superState");
            Intrinsics.checkNotNullParameter(savedViewState, "savedViewState");
            this.savedViewState = savedViewState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            Parcelable parcelable = source.readParcelable(ViewStateCache.Saved.class.getClassLoader());
            Intrinsics.checkNotNull(parcelable);
            this.savedViewState = (ViewStateCache.Saved) parcelable;
        }

        public final ViewStateCache.Saved getSavedViewState() {
            return this.savedViewState;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeParcelable(this.savedViewState, flags);
        }

        /* compiled from: ScreenWithTransitionContainer.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;", "<init>", "()V", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer$SavedState$CREATOR, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<SavedState> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new SavedState(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }
    }

    /* compiled from: ScreenWithTransitionContainer.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion implements ViewFactory<ScreenWithTransition> {
        private final /* synthetic */ BuilderViewFactory<ScreenWithTransition> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(ScreenWithTransition initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super ScreenWithTransition> getType() {
            return this.$$delegate_0.getType();
        }

        private Companion() {
            this.$$delegate_0 = new BuilderViewFactory<>(Reflection.getOrCreateKotlinClass(ScreenWithTransition.class), new Function4() { // from class: com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return ScreenWithTransitionContainer.Companion.__delegate_0$lambda$1((ScreenWithTransition) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View __delegate_0$lambda$1(ScreenWithTransition initialRendering, ViewEnvironment initialEnv, Context context, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
            Intrinsics.checkNotNullParameter(context, "context");
            ScreenWithTransitionContainer screenWithTransitionContainer = new ScreenWithTransitionContainer(context, null, 0, 0, 14, null);
            screenWithTransitionContainer.setId(com.withpersona.sdk2.inquiry.shared.R$id.pi2_back_stack_screen_runner);
            screenWithTransitionContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ViewShowRendering.bindShowRendering(screenWithTransitionContainer, initialRendering, initialEnv, new ScreenWithTransitionContainer2(screenWithTransitionContainer));
            return screenWithTransitionContainer;
        }
    }
}
