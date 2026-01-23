package com.stripe.android.core.injection;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CoroutineContextModule.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/core/injection/CoroutineContextModule;", "", "()V", "provideUIContext", "Lkotlin/coroutines/CoroutineContext;", "provideWorkContext", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class CoroutineContextModule {
    public final CoroutineContext provideWorkContext() {
        return Dispatchers.getIO();
    }

    public final CoroutineContext provideUIContext() {
        return Dispatchers.getMain();
    }
}
