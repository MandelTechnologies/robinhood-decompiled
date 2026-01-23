package com.robinhood.store.futures.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.futures.FuturesAccountProvider;
import com.robinhood.store.futures.RealFuturesAccountProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesProvisionsModule_ProvideFuturesAccountProviderFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/futures/provisions/FuturesProvisionsModule_ProvideFuturesAccountProviderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/account/futures/FuturesAccountProvider;", "module", "Lcom/robinhood/store/futures/provisions/FuturesProvisionsModule;", "provider", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/RealFuturesAccountProvider;", "<init>", "(Lcom/robinhood/store/futures/provisions/FuturesProvisionsModule;Ljavax/inject/Provider;)V", "get", "Companion", "lib-futures-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FuturesProvisionsModule_ProvideFuturesAccountProviderFactory implements Factory<FuturesAccountProvider> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FuturesProvisionsModule module;
    private final Provider<RealFuturesAccountProvider> provider;

    @JvmStatic
    public static final FuturesProvisionsModule_ProvideFuturesAccountProviderFactory create(FuturesProvisionsModule futuresProvisionsModule, Provider<RealFuturesAccountProvider> provider) {
        return INSTANCE.create(futuresProvisionsModule, provider);
    }

    @JvmStatic
    public static final FuturesAccountProvider provideFuturesAccountProvider(FuturesProvisionsModule futuresProvisionsModule, RealFuturesAccountProvider realFuturesAccountProvider) {
        return INSTANCE.provideFuturesAccountProvider(futuresProvisionsModule, realFuturesAccountProvider);
    }

    public FuturesProvisionsModule_ProvideFuturesAccountProviderFactory(FuturesProvisionsModule module, Provider<RealFuturesAccountProvider> provider) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.module = module;
        this.provider = provider;
    }

    @Override // javax.inject.Provider
    public FuturesAccountProvider get() {
        Companion companion = INSTANCE;
        FuturesProvisionsModule futuresProvisionsModule = this.module;
        RealFuturesAccountProvider realFuturesAccountProvider = this.provider.get();
        Intrinsics.checkNotNullExpressionValue(realFuturesAccountProvider, "get(...)");
        return companion.provideFuturesAccountProvider(futuresProvisionsModule, realFuturesAccountProvider);
    }

    /* compiled from: FuturesProvisionsModule_ProvideFuturesAccountProviderFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/store/futures/provisions/FuturesProvisionsModule_ProvideFuturesAccountProviderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/futures/provisions/FuturesProvisionsModule_ProvideFuturesAccountProviderFactory;", "module", "Lcom/robinhood/store/futures/provisions/FuturesProvisionsModule;", "provider", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/RealFuturesAccountProvider;", "provideFuturesAccountProvider", "Lcom/robinhood/android/lib/account/futures/FuturesAccountProvider;", "lib-futures-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesProvisionsModule_ProvideFuturesAccountProviderFactory create(FuturesProvisionsModule module, Provider<RealFuturesAccountProvider> provider) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(provider, "provider");
            return new FuturesProvisionsModule_ProvideFuturesAccountProviderFactory(module, provider);
        }

        @JvmStatic
        public final FuturesAccountProvider provideFuturesAccountProvider(FuturesProvisionsModule module, RealFuturesAccountProvider provider) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideFuturesAccountProvider(provider), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (FuturesAccountProvider) objCheckNotNull;
        }
    }
}
