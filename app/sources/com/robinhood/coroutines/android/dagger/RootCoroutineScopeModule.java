package com.robinhood.coroutines.android.dagger;

import com.robinhood.utils.RxGlobalErrorHandler;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import dispatch.core.CoroutineScopes;
import dispatch.core.DispatcherProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RootCoroutineScopeModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/coroutines/android/dagger/RootCoroutineScopeModule;", "", "<init>", "()V", "provideRootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "errorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "lib-coroutines-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RootCoroutineScopeModule {
    public static final RootCoroutineScopeModule INSTANCE = new RootCoroutineScopeModule();

    private RootCoroutineScopeModule() {
    }

    @RootCoroutineScope
    public final CoroutineScope provideRootCoroutineScope(DispatcherProvider dispatcherProvider, RxGlobalErrorHandler errorHandler) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        return CoroutineScopes.DefaultCoroutineScope(dispatcherProvider.getDefault().plus(dispatcherProvider).plus(errorHandler).plus(new CoroutineName("App Root")));
    }
}
