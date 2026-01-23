package androidx.lifecycle;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Lifecycle.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/Lifecycle;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "eventFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/lifecycle/Lifecycle$Event;", "getEventFlow", "(Landroidx/lifecycle/Lifecycle;)Lkotlinx/coroutines/flow/Flow;", "lifecycle-common"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.lifecycle.LifecycleKt, reason: use source file name */
/* loaded from: classes.dex */
public final class Lifecycle3 {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        Lifecycle2 lifecycle2;
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        do {
            Lifecycle2 lifecycle22 = (Lifecycle2) lifecycle.getInternalScopeRef().get();
            if (lifecycle22 != null) {
                return lifecycle22;
            }
            lifecycle2 = new Lifecycle2(lifecycle, Supervisor3.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()));
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(lifecycle.getInternalScopeRef(), null, lifecycle2));
        lifecycle2.register();
        return lifecycle2;
    }

    public static final Flow<Lifecycle.Event> getEventFlow(Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        return FlowKt.flowOn(FlowKt.callbackFlow(new Lifecycle4(lifecycle, null)), Dispatchers.getMain().getImmediate());
    }
}
