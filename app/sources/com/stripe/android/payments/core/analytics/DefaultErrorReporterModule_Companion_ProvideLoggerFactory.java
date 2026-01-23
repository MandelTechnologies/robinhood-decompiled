package com.stripe.android.payments.core.analytics;

import com.stripe.android.core.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes22.dex */
public final class DefaultErrorReporterModule_Companion_ProvideLoggerFactory implements Factory<Logger> {
    public static Logger provideLogger() {
        return (Logger) Preconditions.checkNotNullFromProvides(ErrorReporter3.INSTANCE.provideLogger());
    }
}
