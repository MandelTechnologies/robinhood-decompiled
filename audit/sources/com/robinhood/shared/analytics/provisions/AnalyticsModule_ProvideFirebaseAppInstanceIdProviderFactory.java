package com.robinhood.shared.analytics.provisions;

import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProviderWithCache;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsModule_ProvideFirebaseAppInstanceIdProviderFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/analytics/provisions/AnalyticsModule_ProvideFirebaseAppInstanceIdProviderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "provider", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProviderWithCache;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AnalyticsModule_ProvideFirebaseAppInstanceIdProviderFactory implements Factory<FirebaseAppInstanceIdProvider> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<FirebaseAppInstanceIdProviderWithCache> provider;

    @JvmStatic
    public static final AnalyticsModule_ProvideFirebaseAppInstanceIdProviderFactory create(Provider<FirebaseAppInstanceIdProviderWithCache> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final FirebaseAppInstanceIdProvider provideFirebaseAppInstanceIdProvider(FirebaseAppInstanceIdProviderWithCache firebaseAppInstanceIdProviderWithCache) {
        return INSTANCE.provideFirebaseAppInstanceIdProvider(firebaseAppInstanceIdProviderWithCache);
    }

    public AnalyticsModule_ProvideFirebaseAppInstanceIdProviderFactory(Provider<FirebaseAppInstanceIdProviderWithCache> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
    }

    @Override // javax.inject.Provider
    public FirebaseAppInstanceIdProvider get() {
        Companion companion = INSTANCE;
        FirebaseAppInstanceIdProviderWithCache firebaseAppInstanceIdProviderWithCache = this.provider.get();
        Intrinsics.checkNotNullExpressionValue(firebaseAppInstanceIdProviderWithCache, "get(...)");
        return companion.provideFirebaseAppInstanceIdProvider(firebaseAppInstanceIdProviderWithCache);
    }

    /* compiled from: AnalyticsModule_ProvideFirebaseAppInstanceIdProviderFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/analytics/provisions/AnalyticsModule_ProvideFirebaseAppInstanceIdProviderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/analytics/provisions/AnalyticsModule_ProvideFirebaseAppInstanceIdProviderFactory;", "provider", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProviderWithCache;", "provideFirebaseAppInstanceIdProvider", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AnalyticsModule_ProvideFirebaseAppInstanceIdProviderFactory create(Provider<FirebaseAppInstanceIdProviderWithCache> provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            return new AnalyticsModule_ProvideFirebaseAppInstanceIdProviderFactory(provider);
        }

        @JvmStatic
        public final FirebaseAppInstanceIdProvider provideFirebaseAppInstanceIdProvider(FirebaseAppInstanceIdProviderWithCache provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            Object objCheckNotNull = Preconditions.checkNotNull(AnalyticsModule.INSTANCE.provideFirebaseAppInstanceIdProvider(provider), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (FirebaseAppInstanceIdProvider) objCheckNotNull;
        }
    }
}
