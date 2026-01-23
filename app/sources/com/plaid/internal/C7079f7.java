package com.plaid.internal;

import android.view.View;
import com.plaid.link.C7279R;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.plaid.internal.f7 */
/* loaded from: classes16.dex */
public final class C7079f7 {
    /* renamed from: a */
    public static final CoroutineScope m1507a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(C7279R.string.plaid_view_coroutine_scope);
        CoroutineScope coroutineScope = tag instanceof CoroutineScope ? (CoroutineScope) tag : null;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        ViewOnAttachStateChangeListenerC7069e7 viewOnAttachStateChangeListenerC7069e7 = new ViewOnAttachStateChangeListenerC7069e7();
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC7069e7);
        return viewOnAttachStateChangeListenerC7069e7;
    }
}
