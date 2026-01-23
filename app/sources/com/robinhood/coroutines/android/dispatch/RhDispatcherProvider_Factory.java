package com.robinhood.coroutines.android.dispatch;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: RhDispatcherProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/coroutines/android/dispatch/RhDispatcherProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/coroutines/android/dispatch/RhDispatcherProvider;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineDispatcher;", "io", "mainImmediate", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-coroutines-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhDispatcherProvider_Factory implements Factory<RhDispatcherProvider> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineDispatcher> default;
    private final Provider<CoroutineDispatcher> io;
    private final Provider<CoroutineDispatcher> mainImmediate;

    @JvmStatic
    public static final RhDispatcherProvider_Factory create(Provider<CoroutineDispatcher> provider, Provider<CoroutineDispatcher> provider2, Provider<CoroutineDispatcher> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final RhDispatcherProvider newInstance(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3) {
        return INSTANCE.newInstance(coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3);
    }

    public RhDispatcherProvider_Factory(Provider<CoroutineDispatcher> provider, Provider<CoroutineDispatcher> io2, Provider<CoroutineDispatcher> mainImmediate) {
        Intrinsics.checkNotNullParameter(provider, "default");
        Intrinsics.checkNotNullParameter(io2, "io");
        Intrinsics.checkNotNullParameter(mainImmediate, "mainImmediate");
        this.default = provider;
        this.io = io2;
        this.mainImmediate = mainImmediate;
    }

    @Override // javax.inject.Provider
    public RhDispatcherProvider get() {
        Companion companion = INSTANCE;
        CoroutineDispatcher coroutineDispatcher = this.default.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher, "get(...)");
        CoroutineDispatcher coroutineDispatcher2 = this.io.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher2, "get(...)");
        CoroutineDispatcher coroutineDispatcher3 = this.mainImmediate.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher3, "get(...)");
        return companion.newInstance(coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3);
    }

    /* compiled from: RhDispatcherProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/coroutines/android/dispatch/RhDispatcherProvider_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/coroutines/android/dispatch/RhDispatcherProvider_Factory;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineDispatcher;", "io", "mainImmediate", "newInstance", "Lcom/robinhood/coroutines/android/dispatch/RhDispatcherProvider;", "lib-coroutines-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhDispatcherProvider_Factory create(Provider<CoroutineDispatcher> provider, Provider<CoroutineDispatcher> io2, Provider<CoroutineDispatcher> mainImmediate) {
            Intrinsics.checkNotNullParameter(provider, "default");
            Intrinsics.checkNotNullParameter(io2, "io");
            Intrinsics.checkNotNullParameter(mainImmediate, "mainImmediate");
            return new RhDispatcherProvider_Factory(provider, io2, mainImmediate);
        }

        @JvmStatic
        public final RhDispatcherProvider newInstance(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher io2, CoroutineDispatcher mainImmediate) {
            Intrinsics.checkNotNullParameter(coroutineDispatcher, "default");
            Intrinsics.checkNotNullParameter(io2, "io");
            Intrinsics.checkNotNullParameter(mainImmediate, "mainImmediate");
            return new RhDispatcherProvider(coroutineDispatcher, io2, mainImmediate);
        }
    }
}
