package com.squareup.workflow1.p415ui;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcherOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackPressHandler.kt */
@Metadata(m3635d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\r\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\u0006\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0017\u001a\u00020\u0007R\u001b\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/squareup/workflow1/ui/HandleBackPressWhenAttached;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "view", "Landroid/view/View;", "handler", "Lkotlin/Function0;", "", "Lcom/squareup/workflow1/ui/BackPressHandler;", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "getHandler", "()Lkotlin/jvm/functions/Function0;", "onBackPressedCallback", "com/squareup/workflow1/ui/HandleBackPressWhenAttached$onBackPressedCallback$1", "Lcom/squareup/workflow1/ui/HandleBackPressWhenAttached$onBackPressedCallback$1;", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onViewAttachedToWindow", "attachedView", "onViewDetachedFromWindow", "detachedView", "start", "stop", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.HandleBackPressWhenAttached, reason: use source file name */
/* loaded from: classes12.dex */
final class BackPressHandler2 implements View.OnAttachStateChangeListener, DefaultLifecycleObserver {
    private final Function0<Unit> handler;
    private final BackPressHandler3 onBackPressedCallback;
    private final View view;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.squareup.workflow1.ui.HandleBackPressWhenAttached$onBackPressedCallback$1] */
    public BackPressHandler2(View view, Function0<Unit> handler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.view = view;
        this.handler = handler;
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: com.squareup.workflow1.ui.HandleBackPressWhenAttached$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.this$0.getHandler().invoke();
            }
        };
    }

    public final Function0<Unit> getHandler() {
        return this.handler;
    }

    public final void start() {
        Lifecycle lifecycle;
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerOnBackPressedDispatcherOwnerOrNull = BackPressHandler.onBackPressedDispatcherOwnerOrNull(context);
        if (onBackPressedDispatcherOwnerOnBackPressedDispatcherOwnerOrNull == null) {
            return;
        }
        onBackPressedDispatcherOwnerOnBackPressedDispatcherOwnerOrNull.getOnBackPressedDispatcher().addCallback(onBackPressedDispatcherOwnerOnBackPressedDispatcherOwnerOrNull, this.onBackPressedCallback);
        this.view.addOnAttachStateChangeListener(this);
        if (this.view.isAttachedToWindow()) {
            onViewAttachedToWindow(this.view);
        }
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.view);
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }

    public final void stop() {
        Lifecycle lifecycle;
        remove();
        this.view.removeOnAttachStateChangeListener(this);
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.view);
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View attachedView) {
        Intrinsics.checkNotNullParameter(attachedView, "attachedView");
        if (this.view != attachedView) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        setEnabled(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View detachedView) {
        Intrinsics.checkNotNullParameter(detachedView, "detachedView");
        if (this.view != detachedView) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        setEnabled(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        stop();
    }
}
