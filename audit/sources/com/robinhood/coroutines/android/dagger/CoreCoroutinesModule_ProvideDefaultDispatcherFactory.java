package com.robinhood.coroutines.android.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: CoreCoroutinesModule_ProvideDefaultDispatcherFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/coroutines/android/dagger/CoreCoroutinesModule_ProvideDefaultDispatcherFactory;", "Ldagger/internal/Factory;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideDefaultDispatcher", "lib-coroutines-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CoreCoroutinesModule_ProvideDefaultDispatcherFactory implements Factory<CoroutineDispatcher> {
    public static final CoreCoroutinesModule_ProvideDefaultDispatcherFactory INSTANCE = new CoreCoroutinesModule_ProvideDefaultDispatcherFactory();

    private CoreCoroutinesModule_ProvideDefaultDispatcherFactory() {
    }

    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return provideDefaultDispatcher();
    }

    @JvmStatic
    public static final CoreCoroutinesModule_ProvideDefaultDispatcherFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final CoroutineDispatcher provideDefaultDispatcher() {
        Object objCheckNotNull = Preconditions.checkNotNull(CoreCoroutinesModule.INSTANCE.provideDefaultDispatcher(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (CoroutineDispatcher) objCheckNotNull;
    }
}
