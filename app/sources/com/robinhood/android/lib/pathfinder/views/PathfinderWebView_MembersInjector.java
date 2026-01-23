package com.robinhood.android.lib.pathfinder.views;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderWebView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebView;", "duxo", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "installation", "Lcom/robinhood/prefs/Installation;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class PathfinderWebView_MembersInjector implements MembersInjector<PathfinderWebView> {
    private final Provider<AuthManager> authManager;
    private final Provider<PathfinderWebViewDuxo> duxo;
    private final Provider<Installation> installation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<PathfinderWebView> create(Provider<PathfinderWebViewDuxo> provider, Provider<AuthManager> provider2, Provider<Installation> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectAuthManager(PathfinderWebView pathfinderWebView, AuthManager authManager) {
        INSTANCE.injectAuthManager(pathfinderWebView, authManager);
    }

    @JvmStatic
    public static final void injectDuxo(PathfinderWebView pathfinderWebView, PathfinderWebViewDuxo pathfinderWebViewDuxo) {
        INSTANCE.injectDuxo(pathfinderWebView, pathfinderWebViewDuxo);
    }

    @JvmStatic
    public static final void injectInstallation(PathfinderWebView pathfinderWebView, Installation installation) {
        INSTANCE.injectInstallation(pathfinderWebView, installation);
    }

    public PathfinderWebView_MembersInjector(Provider<PathfinderWebViewDuxo> duxo, Provider<AuthManager> authManager, Provider<Installation> installation) {
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(installation, "installation");
        this.duxo = duxo;
        this.authManager = authManager;
        this.installation = installation;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PathfinderWebView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        PathfinderWebViewDuxo pathfinderWebViewDuxo = this.duxo.get();
        Intrinsics.checkNotNullExpressionValue(pathfinderWebViewDuxo, "get(...)");
        companion.injectDuxo(instance, pathfinderWebViewDuxo);
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion.injectAuthManager(instance, authManager);
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        companion.injectInstallation(instance, installation);
    }

    /* compiled from: PathfinderWebView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebView;", "duxo", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "installation", "Lcom/robinhood/prefs/Installation;", "injectDuxo", "", "instance", "injectAuthManager", "injectInstallation", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<PathfinderWebView> create(Provider<PathfinderWebViewDuxo> duxo, Provider<AuthManager> authManager, Provider<Installation> installation) {
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(installation, "installation");
            return new PathfinderWebView_MembersInjector(duxo, authManager, installation);
        }

        @JvmStatic
        public final void injectDuxo(PathfinderWebView instance, PathfinderWebViewDuxo duxo) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            instance.setDuxo(duxo);
        }

        @JvmStatic
        public final void injectAuthManager(PathfinderWebView instance, AuthManager authManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            instance.setAuthManager(authManager);
        }

        @JvmStatic
        public final void injectInstallation(PathfinderWebView instance, Installation installation) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(installation, "installation");
            instance.setInstallation(installation);
        }
    }
}
