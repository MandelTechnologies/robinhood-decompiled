package com.squareup.workflow1.p415ui.backstack;

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
import com.squareup.workflow1.p415ui.BuilderViewFactory;
import com.squareup.workflow1.p415ui.Compatible;
import com.squareup.workflow1.p415ui.Compatible2;
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
import com.squareup.workflow1.p415ui.backstack.ViewStateCache;
import com.squareup.workflow1.p415ui.container.R$id;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: BackStackContainer.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 #2\u00020\u0001:\u0002#$B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\"\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u001c\u0010\u001f\u001a\u00020\u00142\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010!\u001a\u00020\"H\u0004R\u001a\u0010\n\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "currentRendering", "Lcom/squareup/workflow1/ui/backstack/BackStackScreen;", "Lcom/squareup/workflow1/ui/Named;", "currentView", "Landroid/view/View;", "getCurrentView", "()Landroid/view/View;", "viewStateCache", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "onAttachedToWindow", "", "onDetachedFromWindow", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "performTransition", "oldViewMaybe", "newView", "popped", "", "update", "newRendering", "newViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "Companion", "SavedState", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public class BackStackContainer extends FrameLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private BackStackScreen<Named<?>> currentRendering;
    private final ViewStateCache viewStateCache;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BackStackContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BackStackContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BackStackContainer(Context context, AttributeSet attributeSet, int i, int i2) {
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

    protected final void update(BackStackScreen<?> newRendering, ViewEnvironment newViewEnvironment) {
        WorkflowLifecycleOwner workflowLifecycleOwner;
        List<Named<?>> backStack;
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(newViewEnvironment, "newViewEnvironment");
        ViewEnvironment viewEnvironmentPlus = newViewEnvironment.plus(Tuples4.m3642to(BackStackConfig.INSTANCE, newRendering.getBackStack().isEmpty() ? BackStackConfig.First : BackStackConfig.Other));
        BackStackScreen map = newRendering.map(new Function1<Object, Named<?>>() { // from class: com.squareup.workflow1.ui.backstack.BackStackContainer$update$named$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Named<?> invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Named<>(it, "backstack");
            }
        });
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = ViewShowRendering.canShowRendering(currentView, map.getTop()) ? currentView : null;
            if (view != null) {
                this.viewStateCache.prune(map.getFrames());
                ViewShowRendering.showRendering(view, map.getTop(), viewEnvironmentPlus);
                return;
            }
        }
        ViewRegistry viewRegistry = (ViewRegistry) viewEnvironmentPlus.get(ViewRegistry.INSTANCE);
        Object top = map.getTop();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        View viewBuildView = ViewRegistry2.buildView(viewRegistry, top, viewEnvironmentPlus, context, this, new ViewRegistry4() { // from class: com.squareup.workflow1.ui.backstack.BackStackContainer$$ExternalSyntheticLambda0
            @Override // com.squareup.workflow1.p415ui.ViewRegistry4
            public final void startView(View view2, Function0 function0) {
                BackStackContainer.m26831update$lambda2(view2, function0);
            }
        });
        ViewShowRendering.start(viewBuildView);
        this.viewStateCache.update(map.getBackStack(), currentView, viewBuildView);
        BackStackScreen<Named<?>> backStackScreen = this.currentRendering;
        boolean z = false;
        if (backStackScreen != null && (backStack = backStackScreen.getBackStack()) != null) {
            List<Named<?>> list = backStack;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Compatible2.compatible((Named) it.next(), map.getTop())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        performTransition(currentView, viewBuildView, z);
        if (currentView != null && (workflowLifecycleOwner = WorkflowLifecycleOwner.INSTANCE.get(currentView)) != null) {
            workflowLifecycleOwner.destroyOnDetach();
        }
        this.currentRendering = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: update$lambda-2, reason: not valid java name */
    public static final void m26831update$lambda2(View view, Function0 doStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(doStart, "doStart");
        WorkflowLifecycleOwner.Companion.installOn$default(WorkflowLifecycleOwner.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    protected void performTransition(View oldViewMaybe, View newView, boolean popped) {
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(newView, "newView");
        if (oldViewMaybe == null) {
            addView(newView);
            return;
        }
        View viewFindViewById = oldViewMaybe.findViewById(R$id.back_stack_body);
        View viewFindViewById2 = newView.findViewById(R$id.back_stack_body);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            viewFindViewById2 = newView;
        } else {
            oldViewMaybe = viewFindViewById;
        }
        if (!popped) {
            tuples2M3642to = Tuples4.m3642to(8388611, 8388613);
        } else {
            if (!popped) {
                throw new NoWhenBranchMatchedException();
            }
            tuples2M3642to = Tuples4.m3642to(8388613, 8388611);
        }
        TransitionSet interpolator = new TransitionSet().addTransition(new Slide(((Number) tuples2M3642to.component1()).intValue()).addTarget(oldViewMaybe)).addTransition(new Slide(((Number) tuples2M3642to.component2()).intValue()).addTarget(viewFindViewById2)).setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
        Intrinsics.checkNotNullExpressionValue(interpolator, "TransitionSet()\n        …DecelerateInterpolator())");
        TransitionManager.endTransitions(this);
        TransitionManager.m672go(new Scene(this, newView), interpolator);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        return new SavedState(parcelableOnSaveInstanceState, this.viewStateCache.save());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Unit unit = null;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            this.viewStateCache.restore(savedState.getSavedViewState());
            super.onRestoreInstanceState(((SavedState) state).getSuperState());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
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

    /* compiled from: BackStackContainer.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState;", "Landroid/view/View$BaseSavedState;", "superState", "Landroid/os/Parcelable;", "savedViewState", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "(Landroid/os/Parcelable;Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getSavedViewState", "()Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "writeToParcel", "", "out", "flags", "", "CREATOR", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
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
            Intrinsics.checkNotNullExpressionValue(parcelable, "source.readParcelable(Vi…class.java.classLoader)!!");
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

        /* compiled from: BackStackContainer.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState;", "()V", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState;", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
        /* renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$SavedState$CREATOR, reason: from kotlin metadata */
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

    /* compiled from: BackStackContainer.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J1\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0001R\u001e\u0010\u0004\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/squareup/workflow1/ui/backstack/BackStackScreen;", "()V", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Companion implements ViewFactory<BackStackScreen<?>> {
        private final /* synthetic */ BuilderViewFactory<BackStackScreen<?>> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(BackStackScreen<?> initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super BackStackScreen<?>> getType() {
            return this.$$delegate_0.getType();
        }

        private Companion() {
            this.$$delegate_0 = new BuilderViewFactory<>(Reflection.getOrCreateKotlinClass(BackStackScreen.class), new Function4<BackStackScreen<?>, ViewEnvironment, Context, ViewGroup, View>() { // from class: com.squareup.workflow1.ui.backstack.BackStackContainer.Companion.1
                @Override // kotlin.jvm.functions.Function4
                public final View invoke(BackStackScreen<?> initialRendering, ViewEnvironment initialEnv, Context context, ViewGroup viewGroup) {
                    Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
                    Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
                    Intrinsics.checkNotNullParameter(context, "context");
                    BackStackContainer backStackContainer = new BackStackContainer(context, null, 0, 0, 14, null);
                    backStackContainer.setId(R$id.workflow_back_stack_container);
                    backStackContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    ViewShowRendering.bindShowRendering(backStackContainer, initialRendering, initialEnv, new BackStackContainer2(backStackContainer));
                    return backStackContainer;
                }
            });
        }
    }
}
