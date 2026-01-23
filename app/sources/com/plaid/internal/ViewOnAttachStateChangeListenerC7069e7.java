package com.plaid.internal;

import android.view.View;
import com.plaid.link.C7279R;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.Supervisor3;

/* renamed from: com.plaid.internal.e7 */
/* loaded from: classes16.dex */
public final class ViewOnAttachStateChangeListenerC7069e7 implements CoroutineScope, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final CoroutineContext f2759a = Supervisor3.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO());

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f2759a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(C7279R.string.plaid_view_coroutine_scope, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Job6.cancel$default(this.f2759a, null, 1, null);
        view.setTag(C7279R.string.plaid_view_coroutine_scope, null);
    }
}
