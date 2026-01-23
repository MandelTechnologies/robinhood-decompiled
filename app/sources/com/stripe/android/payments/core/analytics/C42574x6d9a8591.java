package com.stripe.android.payments.core.analytics;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.functions.Function0;

/* renamed from: com.stripe.android.payments.core.analytics.DefaultErrorReporterModule_Companion_ProvidePublishableKeyFactory */
/* loaded from: classes22.dex */
public final class C42574x6d9a8591 implements Factory<Function0<String>> {
    public static Function0<String> providePublishableKey(Context context) {
        return (Function0) Preconditions.checkNotNullFromProvides(ErrorReporter3.INSTANCE.providePublishableKey(context));
    }
}
