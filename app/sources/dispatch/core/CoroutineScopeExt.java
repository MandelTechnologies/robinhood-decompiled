package dispatch.core;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CoroutineScopeExt.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefaultDispatcher", "(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "Ldispatch/core/DispatcherProvider;", "getDispatcherProvider", "(Lkotlinx/coroutines/CoroutineScope;)Ldispatch/core/DispatcherProvider;", "dispatcherProvider", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)Ldispatch/core/DispatcherProvider;", "dispatch-core"}, m3637k = 2, m3638mv = {1, 5, 1}, m3640xi = 48)
/* renamed from: dispatch.core.CoroutineScopeExtKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class CoroutineScopeExt {
    public static final CoroutineDispatcher getDefaultDispatcher(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        return getDispatcherProvider(coroutineScope).getDefault();
    }

    public static final DispatcherProvider getDispatcherProvider(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        return getDispatcherProvider(coroutineScope.getCoroutineContext());
    }

    public static final DispatcherProvider getDispatcherProvider(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "<this>");
        DispatcherProvider dispatcherProvider = (DispatcherProvider) coroutineContext.get(DispatcherProvider.INSTANCE);
        return dispatcherProvider == null ? DefaultDispatcherProvider.INSTANCE.get() : dispatcherProvider;
    }
}
