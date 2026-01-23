package com.robinhood.coroutines.android.dispatch;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.coroutines.dagger.annotation.IODispatcher;
import com.robinhood.coroutines.dagger.annotation.MainImmediateDispatcher;
import dispatch.core.DispatcherProvider;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RhDispatcherProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/coroutines/android/dispatch/RhDispatcherProvider;", "Ldispatch/core/DispatcherProvider;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lkotlinx/coroutines/CoroutineDispatcher;", "io", "mainImmediate", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getIo", "getMainImmediate", "main", "getMain", "unconfined", "getUnconfined", "lib-coroutines-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhDispatcherProvider implements DispatcherProvider {
    private final CoroutineDispatcher default;
    private final CoroutineDispatcher io;
    private final CoroutineDispatcher mainImmediate;

    @Override // dispatch.core.DispatcherProvider, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) DispatcherProvider.DefaultImpls.fold(this, r, function2);
    }

    @Override // dispatch.core.DispatcherProvider, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) DispatcherProvider.DefaultImpls.get(this, key);
    }

    @Override // dispatch.core.DispatcherProvider, kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<?> getKey() {
        return DispatcherProvider.DefaultImpls.getKey(this);
    }

    @Override // dispatch.core.DispatcherProvider, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return DispatcherProvider.DefaultImpls.minusKey(this, key);
    }

    @Override // dispatch.core.DispatcherProvider, kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return DispatcherProvider.DefaultImpls.plus(this, coroutineContext);
    }

    public RhDispatcherProvider(@DefaultDispatcher CoroutineDispatcher coroutineDispatcher, @IODispatcher CoroutineDispatcher io2, @MainImmediateDispatcher CoroutineDispatcher mainImmediate) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "default");
        Intrinsics.checkNotNullParameter(io2, "io");
        Intrinsics.checkNotNullParameter(mainImmediate, "mainImmediate");
        this.default = coroutineDispatcher;
        this.io = io2;
        this.mainImmediate = mainImmediate;
    }

    @Override // dispatch.core.DispatcherProvider
    public CoroutineDispatcher getDefault() {
        return this.default;
    }

    @Override // dispatch.core.DispatcherProvider
    public CoroutineDispatcher getIo() {
        return this.io;
    }

    @Override // dispatch.core.DispatcherProvider
    public CoroutineDispatcher getMainImmediate() {
        return this.mainImmediate;
    }

    @Override // dispatch.core.DispatcherProvider
    public CoroutineDispatcher getMain() {
        return Dispatchers.getMain();
    }

    @Override // dispatch.core.DispatcherProvider
    public CoroutineDispatcher getUnconfined() {
        return Dispatchers.getUnconfined();
    }
}
