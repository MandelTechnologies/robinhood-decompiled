package com.robinhood.android.common.banner;

import com.robinhood.android.common.banner.MainBannerView;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainBannerView_BannerToShowProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB.\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/banner/MainBannerView_BannerToShowProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/banner/MainBannerView$BannerToShowProvider;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "bannerProviders", "", "Lcom/robinhood/android/common/banner/BannerProvider;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class MainBannerView_BannerToShowProvider_Factory implements Factory<MainBannerView.BannerToShowProvider> {
    private final Provider<AuthManager> authManager;
    private final Provider<Set<BannerProvider>> bannerProviders;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MainBannerView_BannerToShowProvider_Factory create(Provider<AuthManager> provider, Provider<Set<BannerProvider>> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final MainBannerView.BannerToShowProvider newInstance(AuthManager authManager, Lazy<Set<BannerProvider>> lazy) {
        return INSTANCE.newInstance(authManager, lazy);
    }

    public MainBannerView_BannerToShowProvider_Factory(Provider<AuthManager> authManager, Provider<Set<BannerProvider>> bannerProviders) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(bannerProviders, "bannerProviders");
        this.authManager = authManager;
        this.bannerProviders = bannerProviders;
    }

    @Override // javax.inject.Provider
    public MainBannerView.BannerToShowProvider get() {
        Companion companion = INSTANCE;
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        Lazy<Set<BannerProvider>> lazy = DoubleCheck.lazy(this.bannerProviders);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.newInstance(authManager, lazy);
    }

    /* compiled from: MainBannerView_BannerToShowProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007H\u0007J)\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u000fH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/banner/MainBannerView_BannerToShowProvider_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/banner/MainBannerView_BannerToShowProvider_Factory;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "bannerProviders", "", "Lcom/robinhood/android/common/banner/BannerProvider;", "Lkotlin/jvm/JvmSuppressWildcards;", "newInstance", "Lcom/robinhood/android/common/banner/MainBannerView$BannerToShowProvider;", "Ldagger/Lazy;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MainBannerView_BannerToShowProvider_Factory create(Provider<AuthManager> authManager, Provider<Set<BannerProvider>> bannerProviders) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(bannerProviders, "bannerProviders");
            return new MainBannerView_BannerToShowProvider_Factory(authManager, bannerProviders);
        }

        @JvmStatic
        public final MainBannerView.BannerToShowProvider newInstance(AuthManager authManager, Lazy<Set<BannerProvider>> bannerProviders) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(bannerProviders, "bannerProviders");
            return new MainBannerView.BannerToShowProvider(authManager, bannerProviders);
        }
    }
}
