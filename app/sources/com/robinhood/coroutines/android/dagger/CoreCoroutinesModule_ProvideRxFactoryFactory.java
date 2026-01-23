package com.robinhood.coroutines.android.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.p287rx.RxFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CoreCoroutinesModule_ProvideRxFactoryFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/coroutines/android/dagger/CoreCoroutinesModule_ProvideRxFactoryFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/coroutines/rx/RxFactory;", "rootCoroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-coroutines-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CoreCoroutinesModule_ProvideRxFactoryFactory implements Factory<RxFactory> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineScope> rootCoroutineScope;

    @JvmStatic
    public static final CoreCoroutinesModule_ProvideRxFactoryFactory create(Provider<CoroutineScope> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final RxFactory provideRxFactory(CoroutineScope coroutineScope) {
        return INSTANCE.provideRxFactory(coroutineScope);
    }

    public CoreCoroutinesModule_ProvideRxFactoryFactory(Provider<CoroutineScope> rootCoroutineScope) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        this.rootCoroutineScope = rootCoroutineScope;
    }

    @Override // javax.inject.Provider
    public RxFactory get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        return companion.provideRxFactory(coroutineScope);
    }

    /* compiled from: CoreCoroutinesModule_ProvideRxFactoryFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/coroutines/android/dagger/CoreCoroutinesModule_ProvideRxFactoryFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/coroutines/android/dagger/CoreCoroutinesModule_ProvideRxFactoryFactory;", "rootCoroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "provideRxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "lib-coroutines-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CoreCoroutinesModule_ProvideRxFactoryFactory create(Provider<CoroutineScope> rootCoroutineScope) {
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            return new CoreCoroutinesModule_ProvideRxFactoryFactory(rootCoroutineScope);
        }

        @JvmStatic
        public final RxFactory provideRxFactory(CoroutineScope rootCoroutineScope) {
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Object objCheckNotNull = Preconditions.checkNotNull(CoreCoroutinesModule.INSTANCE.provideRxFactory(rootCoroutineScope), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (RxFactory) objCheckNotNull;
        }
    }
}
