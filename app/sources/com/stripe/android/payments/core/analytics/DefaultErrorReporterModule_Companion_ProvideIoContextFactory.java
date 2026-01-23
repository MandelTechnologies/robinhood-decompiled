package com.stripe.android.payments.core.analytics;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes22.dex */
public final class DefaultErrorReporterModule_Companion_ProvideIoContextFactory implements Factory<CoroutineContext> {
    public static CoroutineContext provideIoContext() {
        return (CoroutineContext) Preconditions.checkNotNullFromProvides(ErrorReporter3.INSTANCE.provideIoContext());
    }
}
