package com.robinhood.android.navigation.deeplink;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity_MembersInjector;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeeplinkResolverActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/DeeplinkResolverActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/navigation/deeplink/DeeplinkResolverActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "injectedDeepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-deep-link-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DeeplinkResolverActivity_MembersInjector implements MembersInjector<DeeplinkResolverActivity> {
    private final Provider<AuthManager> authManager;
    private final Provider<DeepLinkResolver> injectedDeepLinkResolver;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DeeplinkResolverActivity> create(Provider<BaseActivitySingletons> provider, Provider<AuthManager> provider2, Provider<DeepLinkResolver> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectInjectedDeepLinkResolver(DeeplinkResolverActivity deeplinkResolverActivity, DeepLinkResolver deepLinkResolver) {
        INSTANCE.injectInjectedDeepLinkResolver(deeplinkResolverActivity, deepLinkResolver);
    }

    public DeeplinkResolverActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<AuthManager> authManager, Provider<DeepLinkResolver> injectedDeepLinkResolver) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(injectedDeepLinkResolver, "injectedDeepLinkResolver");
        this.singletons = singletons;
        this.authManager = authManager;
        this.injectedDeepLinkResolver = injectedDeepLinkResolver;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DeeplinkResolverActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        BaseDeeplinkResolverActivity_MembersInjector.Companion companion2 = BaseDeeplinkResolverActivity_MembersInjector.INSTANCE;
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion2.injectAuthManager(instance, authManager);
        Companion companion3 = INSTANCE;
        DeepLinkResolver deepLinkResolver = this.injectedDeepLinkResolver.get();
        Intrinsics.checkNotNullExpressionValue(deepLinkResolver, "get(...)");
        companion3.injectInjectedDeepLinkResolver(instance, deepLinkResolver);
    }

    /* compiled from: DeeplinkResolverActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/DeeplinkResolverActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/navigation/deeplink/DeeplinkResolverActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "injectedDeepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "injectInjectedDeepLinkResolver", "", "instance", "feature-deep-link-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DeeplinkResolverActivity> create(Provider<BaseActivitySingletons> singletons, Provider<AuthManager> authManager, Provider<DeepLinkResolver> injectedDeepLinkResolver) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(injectedDeepLinkResolver, "injectedDeepLinkResolver");
            return new DeeplinkResolverActivity_MembersInjector(singletons, authManager, injectedDeepLinkResolver);
        }

        @JvmStatic
        public final void injectInjectedDeepLinkResolver(DeeplinkResolverActivity instance, DeepLinkResolver injectedDeepLinkResolver) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(injectedDeepLinkResolver, "injectedDeepLinkResolver");
            instance.setInjectedDeepLinkResolver(injectedDeepLinkResolver);
        }
    }
}
