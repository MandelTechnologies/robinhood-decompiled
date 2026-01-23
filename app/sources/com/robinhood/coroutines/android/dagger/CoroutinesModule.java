package com.robinhood.coroutines.android.dagger;

import com.robinhood.coroutines.android.dagger.annotation.UninstrumentedDispatcherProvider;
import dispatch.core.DispatcherProvider;
import kotlin.Metadata;

/* compiled from: CoroutinesModule.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/coroutines/android/dagger/CoroutinesModule;", "", "<init>", "()V", "bindDispatchProvider", "Ldispatch/core/DispatcherProvider;", "uninstrumentedDispatcherProvider", "lib-coroutines-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class CoroutinesModule {
    public abstract DispatcherProvider bindDispatchProvider(@UninstrumentedDispatcherProvider DispatcherProvider uninstrumentedDispatcherProvider);
}
