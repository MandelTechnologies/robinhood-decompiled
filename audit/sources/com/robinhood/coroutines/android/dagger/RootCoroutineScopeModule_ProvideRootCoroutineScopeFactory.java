package com.robinhood.coroutines.android.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RootCoroutineScopeModule_ProvideRootCoroutineScopeFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/coroutines/android/dagger/RootCoroutineScopeModule_ProvideRootCoroutineScopeFactory;", "Ldagger/internal/Factory;", "Lkotlinx/coroutines/CoroutineScope;", "dispatcherProvider", "Ljavax/inject/Provider;", "Ldispatch/core/DispatcherProvider;", "errorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-coroutines-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RootCoroutineScopeModule_ProvideRootCoroutineScopeFactory implements Factory<CoroutineScope> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxGlobalErrorHandler> errorHandler;

    @JvmStatic
    public static final RootCoroutineScopeModule_ProvideRootCoroutineScopeFactory create(Provider<DispatcherProvider> provider, Provider<RxGlobalErrorHandler> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final CoroutineScope provideRootCoroutineScope(DispatcherProvider dispatcherProvider, RxGlobalErrorHandler rxGlobalErrorHandler) {
        return INSTANCE.provideRootCoroutineScope(dispatcherProvider, rxGlobalErrorHandler);
    }

    public RootCoroutineScopeModule_ProvideRootCoroutineScopeFactory(Provider<DispatcherProvider> dispatcherProvider, Provider<RxGlobalErrorHandler> errorHandler) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.dispatcherProvider = dispatcherProvider;
        this.errorHandler = errorHandler;
    }

    @Override // javax.inject.Provider
    public CoroutineScope get() {
        Companion companion = INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        RxGlobalErrorHandler rxGlobalErrorHandler = this.errorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        return companion.provideRootCoroutineScope(dispatcherProvider, rxGlobalErrorHandler);
    }

    /* compiled from: RootCoroutineScopeModule_ProvideRootCoroutineScopeFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/coroutines/android/dagger/RootCoroutineScopeModule_ProvideRootCoroutineScopeFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/coroutines/android/dagger/RootCoroutineScopeModule_ProvideRootCoroutineScopeFactory;", "dispatcherProvider", "Ljavax/inject/Provider;", "Ldispatch/core/DispatcherProvider;", "errorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "provideRootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "lib-coroutines-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RootCoroutineScopeModule_ProvideRootCoroutineScopeFactory create(Provider<DispatcherProvider> dispatcherProvider, Provider<RxGlobalErrorHandler> errorHandler) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
            return new RootCoroutineScopeModule_ProvideRootCoroutineScopeFactory(dispatcherProvider, errorHandler);
        }

        @JvmStatic
        public final CoroutineScope provideRootCoroutineScope(DispatcherProvider dispatcherProvider, RxGlobalErrorHandler errorHandler) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
            Object objCheckNotNull = Preconditions.checkNotNull(RootCoroutineScopeModule.INSTANCE.provideRootCoroutineScope(dispatcherProvider, errorHandler), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (CoroutineScope) objCheckNotNull;
        }
    }
}
