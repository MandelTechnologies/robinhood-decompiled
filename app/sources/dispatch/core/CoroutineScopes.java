package dispatch.core;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;

/* compiled from: CoroutineScopes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ldispatch/core/DefaultCoroutineScope;", "DefaultCoroutineScope", "(Lkotlin/coroutines/CoroutineContext;)Ldispatch/core/DefaultCoroutineScope;", "dispatch-core"}, m3637k = 2, m3638mv = {1, 5, 1}, m3640xi = 48)
/* renamed from: dispatch.core.CoroutineScopesKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class CoroutineScopes {
    public static final CoroutineScopes2 DefaultCoroutineScope(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return new CoroutineScopes2() { // from class: dispatch.core.CoroutineScopesKt.DefaultCoroutineScope.2
            private final CoroutineContext coroutineContext;

            {
                CoroutineContext coroutineContextSupervisorJob$default = (Job) this.$coroutineContext.get(Job.INSTANCE);
                coroutineContextSupervisorJob$default = coroutineContextSupervisorJob$default == null ? Supervisor3.SupervisorJob$default(null, 1, null) : coroutineContextSupervisorJob$default;
                DispatcherProvider dispatcherProvider = (DispatcherProvider) this.$coroutineContext.get(DispatcherProvider.INSTANCE);
                dispatcherProvider = dispatcherProvider == null ? DefaultDispatcherProvider.INSTANCE.get() : dispatcherProvider;
                this.coroutineContext = this.$coroutineContext.plus(coroutineContextSupervisorJob$default).plus(dispatcherProvider).plus(dispatcherProvider.getDefault());
            }

            @Override // kotlinx.coroutines.CoroutineScope
            public CoroutineContext getCoroutineContext() {
                return this.coroutineContext;
            }
        };
    }
}
