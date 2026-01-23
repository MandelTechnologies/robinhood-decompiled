package com.plaid.internal;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* renamed from: com.plaid.internal.L5 */
/* loaded from: classes16.dex */
public final class ViewOnAttachStateChangeListenerC5897L5 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ View f1527a;

    /* renamed from: b */
    public final /* synthetic */ C5927O5 f1528b;

    public ViewOnAttachStateChangeListenerC5897L5(View view, C5927O5 c5927o5) {
        this.f1527a = view;
        this.f1528b = c5927o5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f1527a.removeOnAttachStateChangeListener(this);
        C5927O5 c5927o5 = this.f1528b;
        c5927o5.post(new RunnableC5888K5(c5927o5));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
