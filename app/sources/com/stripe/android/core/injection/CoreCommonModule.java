package com.stripe.android.core.injection;

import com.stripe.android.core.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CoreCommonModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/core/injection/CoreCommonModule;", "", "<init>", "()V", "", "enableLogging", "Lcom/stripe/android/core/Logger;", "provideLogger", "(Z)Lcom/stripe/android/core/Logger;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CoreCommonModule {
    public final Logger provideLogger(boolean enableLogging) {
        return Logger.INSTANCE.getInstance(enableLogging);
    }
}
