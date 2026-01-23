package com.withpersona.sdk2.inquiry.shared.p422ui;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneShotPreDrawListenerWithDiscardedFrame.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/OneShotPreDrawListenerWithDiscardedFrame;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/view/View$OnAttachStateChangeListener;", "view", "Landroid/view/View;", "runnable", "Ljava/lang/Runnable;", "<init>", "(Landroid/view/View;Ljava/lang/Runnable;)V", "viewTreeObserver", "Landroid/view/ViewTreeObserver;", "onPreDraw", "", "onViewAttachedToWindow", "", "v", "onViewDetachedFromWindow", "removeListener", "Companion", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class OneShotPreDrawListenerWithDiscardedFrame implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Runnable runnable;
    private final View view;
    private ViewTreeObserver viewTreeObserver;

    public /* synthetic */ OneShotPreDrawListenerWithDiscardedFrame(View view, Runnable runnable, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, runnable);
    }

    private OneShotPreDrawListenerWithDiscardedFrame(View view, Runnable runnable) {
        this.view = view;
        this.runnable = runnable;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "getViewTreeObserver(...)");
        this.viewTreeObserver = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        removeListener();
        this.runnable.run();
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.viewTreeObserver = v.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        removeListener();
    }

    private final void removeListener() {
        if (this.viewTreeObserver.isAlive()) {
            this.viewTreeObserver.removeOnPreDrawListener(this);
        } else {
            this.view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.view.removeOnAttachStateChangeListener(this);
    }

    /* compiled from: OneShotPreDrawListenerWithDiscardedFrame.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/OneShotPreDrawListenerWithDiscardedFrame$Companion;", "", "<init>", "()V", "add", "Lcom/withpersona/sdk2/inquiry/shared/ui/OneShotPreDrawListenerWithDiscardedFrame;", "view", "Landroid/view/View;", "runnable", "Ljava/lang/Runnable;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OneShotPreDrawListenerWithDiscardedFrame add(View view, Runnable runnable) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            OneShotPreDrawListenerWithDiscardedFrame oneShotPreDrawListenerWithDiscardedFrame = new OneShotPreDrawListenerWithDiscardedFrame(view, runnable, null);
            view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListenerWithDiscardedFrame);
            view.addOnAttachStateChangeListener(oneShotPreDrawListenerWithDiscardedFrame);
            return oneShotPreDrawListenerWithDiscardedFrame;
        }
    }
}
