package com.squareup.workflow1.p415ui.androidx;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowLifecycleOwner.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0017\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\nH\u0001¢\u0006\u0002\b\u001dR\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/squareup/workflow1/ui/androidx/RealWorkflowLifecycleOwner;", "Lcom/squareup/workflow1/ui/androidx/WorkflowLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/lifecycle/LifecycleEventObserver;", "findParentLifecycle", "Lkotlin/Function1;", "Landroid/view/View;", "Landroidx/lifecycle/Lifecycle;", "enforceMainThread", "", "(Lkotlin/jvm/functions/Function1;Z)V", "destroyOnDetach", "hasBeenDestroyed", "localLifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "parentLifecycle", "view", "", "getLifecycle", "onStateChanged", "source", "event", "Landroidx/lifecycle/Lifecycle$Event;", "onViewAttachedToWindow", "v", "onViewDetachedFromWindow", "updateLifecycle", "isAttached", "updateLifecycle$wf1_core_android", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.androidx.RealWorkflowLifecycleOwner, reason: use source file name */
/* loaded from: classes12.dex */
public final class WorkflowLifecycleOwner2 implements WorkflowLifecycleOwner, LifecycleOwner, View.OnAttachStateChangeListener, LifecycleEventObserver {
    private boolean destroyOnDetach;
    private final Function1<View, Lifecycle> findParentLifecycle;
    private boolean hasBeenDestroyed;
    private final LifecycleRegistry localLifecycle;
    private Lifecycle parentLifecycle;
    private View view;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkflowLifecycleOwner2(Function1<? super View, ? extends Lifecycle> findParentLifecycle, boolean z) {
        LifecycleRegistry lifecycleRegistryCreateUnsafe;
        Intrinsics.checkNotNullParameter(findParentLifecycle, "findParentLifecycle");
        this.findParentLifecycle = findParentLifecycle;
        if (z) {
            lifecycleRegistryCreateUnsafe = new LifecycleRegistry(this);
        } else {
            lifecycleRegistryCreateUnsafe = LifecycleRegistry.createUnsafe(this);
            Intrinsics.checkNotNullExpressionValue(lifecycleRegistryCreateUnsafe, "createUnsafe(this)");
        }
        this.localLifecycle = lifecycleRegistryCreateUnsafe;
    }

    public /* synthetic */ WorkflowLifecycleOwner2(Function1 function1, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? true : z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (this.localLifecycle.getState() == Lifecycle.State.DESTROYED || this.hasBeenDestroyed) {
            return;
        }
        this.view = v;
        Lifecycle lifecycle = this.parentLifecycle;
        Lifecycle lifecycleInvoke = this.findParentLifecycle.invoke(v);
        this.parentLifecycle = lifecycleInvoke;
        if (lifecycleInvoke != lifecycle) {
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
            Lifecycle lifecycle2 = this.parentLifecycle;
            if (lifecycle2 != null) {
                lifecycle2.addObserver(this);
            }
        }
        updateLifecycle$wf1_core_android(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        updateLifecycle$wf1_core_android(false);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        updateLifecycle$wf1_core_android$default(this, false, 1, null);
    }

    @Override // com.squareup.workflow1.p415ui.androidx.WorkflowLifecycleOwner
    public void destroyOnDetach() {
        if (this.destroyOnDetach) {
            return;
        }
        this.destroyOnDetach = true;
        updateLifecycle$wf1_core_android$default(this, false, 1, null);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.localLifecycle;
    }

    public static /* synthetic */ void updateLifecycle$wf1_core_android$default(WorkflowLifecycleOwner2 workflowLifecycleOwner2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            View view = workflowLifecycleOwner2.view;
            z = view == null ? false : view.isAttachedToWindow();
        }
        workflowLifecycleOwner2.updateLifecycle$wf1_core_android(z);
    }

    public final void updateLifecycle$wf1_core_android(boolean isAttached) {
        Lifecycle lifecycle = this.parentLifecycle;
        Lifecycle.State state = lifecycle == null ? null : lifecycle.getState();
        Lifecycle.State state2 = this.localLifecycle.getState();
        Intrinsics.checkNotNullExpressionValue(state2, "localLifecycle.currentState");
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        if (state2 == state3 || this.hasBeenDestroyed) {
            this.view = null;
            return;
        }
        LifecycleRegistry lifecycleRegistry = this.localLifecycle;
        if (this.destroyOnDetach && !isAttached) {
            state = state3;
        } else if (state == null && state2 != (state = Lifecycle.State.INITIALIZED)) {
            throw new AssertionError("Must have a parent lifecycle after attaching and until being destroyed.");
        }
        if (state == state3) {
            this.hasBeenDestroyed = true;
            Lifecycle lifecycle2 = this.parentLifecycle;
            if (lifecycle2 != null) {
                lifecycle2.removeObserver(this);
            }
            this.parentLifecycle = null;
            View view = this.view;
            if (view != null) {
                this.view = null;
                view.removeOnAttachStateChangeListener(this);
            }
            Lifecycle.State state4 = Lifecycle.State.INITIALIZED;
            if (state2 == state4) {
                state3 = state4;
            }
        } else {
            state3 = state;
        }
        lifecycleRegistry.setCurrentState(state3);
    }
}
