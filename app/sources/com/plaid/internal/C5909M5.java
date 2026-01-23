package com.plaid.internal;

import androidx.core.view.ViewCompat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@SourceDebugExtension
/* renamed from: com.plaid.internal.M5 */
/* loaded from: classes16.dex */
public final class C5909M5<T> implements FlowCollector {

    /* renamed from: a */
    public final /* synthetic */ C5927O5 f1550a;

    public C5909M5(C5927O5 c5927o5) {
        this.f1550a = c5927o5;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ((Boolean) obj).getClass();
        C5927O5 c5927o5 = this.f1550a;
        if (ViewCompat.isAttachedToWindow(c5927o5)) {
            c5927o5.post(new RunnableC5888K5(c5927o5));
        } else {
            c5927o5.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC5897L5(c5927o5, c5927o5));
        }
        return Unit.INSTANCE;
    }
}
