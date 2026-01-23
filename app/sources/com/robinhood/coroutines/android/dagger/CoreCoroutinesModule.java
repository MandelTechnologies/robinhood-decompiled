package com.robinhood.coroutines.android.dagger;

import com.robinhood.coroutines.android.dagger.annotation.UninstrumentedDispatcherProvider;
import com.robinhood.coroutines.android.dispatch.RhDispatcherProvider;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.coroutines.dagger.annotation.IODispatcher;
import com.robinhood.coroutines.dagger.annotation.MainImmediateDispatcher;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.coroutines.p287rx.RxFactory2;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import dispatch.core.DispatcherProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: CoreCoroutinesModule.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/coroutines/android/dagger/CoreCoroutinesModule;", "", "<init>", "()V", "bindUninstrumentedDispatchProvider", "Ldispatch/core/DispatcherProvider;", "rhDispatcherProvider", "Lcom/robinhood/coroutines/android/dispatch/RhDispatcherProvider;", "provideDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideMainImmediateDispatcher", "provideIODispatcher", "provideRxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "lib-coroutines-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CoreCoroutinesModule {
    public static final CoreCoroutinesModule INSTANCE = new CoreCoroutinesModule();

    @UninstrumentedDispatcherProvider
    public final DispatcherProvider bindUninstrumentedDispatchProvider(RhDispatcherProvider rhDispatcherProvider) {
        Intrinsics.checkNotNullParameter(rhDispatcherProvider, "rhDispatcherProvider");
        return rhDispatcherProvider;
    }

    private CoreCoroutinesModule() {
    }

    @DefaultDispatcher
    public final CoroutineDispatcher provideDefaultDispatcher() {
        return Dispatchers.getDefault();
    }

    @MainImmediateDispatcher
    public final CoroutineDispatcher provideMainImmediateDispatcher() {
        return Dispatchers.getMain().getImmediate();
    }

    @IODispatcher
    public final CoroutineDispatcher provideIODispatcher() {
        return Dispatchers.getIO();
    }

    public final RxFactory provideRxFactory(@RootCoroutineScope CoroutineScope rootCoroutineScope) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        return new RxFactory2(rootCoroutineScope.getCoroutineContext().minusKey(Job.INSTANCE));
    }
}
