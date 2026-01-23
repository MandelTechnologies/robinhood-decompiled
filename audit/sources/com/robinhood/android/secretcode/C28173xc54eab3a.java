package com.robinhood.android.secretcode;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.lifecycle.MainTabActivityListener;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureSecretCodeModule_ProvideSecretCodeManagerMainTabActivityListenerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/secretcode/FeatureSecretCodeModule_ProvideSecretCodeManagerMainTabActivityListenerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "secretCodeManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/secretcode/SecretCodeManager;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-secret-code_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.secretcode.FeatureSecretCodeModule_ProvideSecretCodeManagerMainTabActivityListenerFactory */
/* loaded from: classes20.dex */
public final class C28173xc54eab3a implements Factory<MainTabActivityListener> {
    private final Provider<SecretCodeManager> secretCodeManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final C28173xc54eab3a create(Provider<SecretCodeManager> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final MainTabActivityListener provideSecretCodeManagerMainTabActivityListener(SecretCodeManager secretCodeManager) {
        return INSTANCE.provideSecretCodeManagerMainTabActivityListener(secretCodeManager);
    }

    public C28173xc54eab3a(Provider<SecretCodeManager> secretCodeManager) {
        Intrinsics.checkNotNullParameter(secretCodeManager, "secretCodeManager");
        this.secretCodeManager = secretCodeManager;
    }

    @Override // javax.inject.Provider
    public MainTabActivityListener get() {
        Companion companion = INSTANCE;
        SecretCodeManager secretCodeManager = this.secretCodeManager.get();
        Intrinsics.checkNotNullExpressionValue(secretCodeManager, "get(...)");
        return companion.provideSecretCodeManagerMainTabActivityListener(secretCodeManager);
    }

    /* compiled from: FeatureSecretCodeModule_ProvideSecretCodeManagerMainTabActivityListenerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/secretcode/FeatureSecretCodeModule_ProvideSecretCodeManagerMainTabActivityListenerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/secretcode/FeatureSecretCodeModule_ProvideSecretCodeManagerMainTabActivityListenerFactory;", "secretCodeManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/secretcode/SecretCodeManager;", "provideSecretCodeManagerMainTabActivityListener", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "feature-secret-code_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.secretcode.FeatureSecretCodeModule_ProvideSecretCodeManagerMainTabActivityListenerFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C28173xc54eab3a create(Provider<SecretCodeManager> secretCodeManager) {
            Intrinsics.checkNotNullParameter(secretCodeManager, "secretCodeManager");
            return new C28173xc54eab3a(secretCodeManager);
        }

        @JvmStatic
        public final MainTabActivityListener provideSecretCodeManagerMainTabActivityListener(SecretCodeManager secretCodeManager) {
            Intrinsics.checkNotNullParameter(secretCodeManager, "secretCodeManager");
            Object objCheckNotNull = Preconditions.checkNotNull(FeatureSecretCodeModule.INSTANCE.provideSecretCodeManagerMainTabActivityListener(secretCodeManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (MainTabActivityListener) objCheckNotNull;
        }
    }
}
