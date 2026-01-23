package com.robinhood.android.lib.pathfinder;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.api.pathfinder.userview.UserViewPageType;
import com.robinhood.utils.ReleaseVersion;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderStateRegistry_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010BB\u0012\u001d\u0010\u0003\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b0\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R%\u0010\u0003\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry;", "resolvers", "Ljavax/inject/Provider;", "", "Lcom/robinhood/models/api/pathfinder/userview/UserViewPageType;", "Lcom/robinhood/android/lib/pathfinder/UserViewPageResolver;", "Lkotlin/jvm/JvmSuppressWildcards;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PathfinderStateRegistry_Factory implements Factory<PathfinderStateRegistry> {
    private final Provider<Navigator> navigator;
    private final Provider<ReleaseVersion> releaseVersion;
    private final Provider<Map<UserViewPageType, UserViewPageResolver>> resolvers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PathfinderStateRegistry_Factory create(Provider<Map<UserViewPageType, UserViewPageResolver>> provider, Provider<Navigator> provider2, Provider<ReleaseVersion> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final PathfinderStateRegistry newInstance(Lazy<Map<UserViewPageType, UserViewPageResolver>> lazy, Navigator navigator, ReleaseVersion releaseVersion) {
        return INSTANCE.newInstance(lazy, navigator, releaseVersion);
    }

    public PathfinderStateRegistry_Factory(Provider<Map<UserViewPageType, UserViewPageResolver>> resolvers, Provider<Navigator> navigator, Provider<ReleaseVersion> releaseVersion) {
        Intrinsics.checkNotNullParameter(resolvers, "resolvers");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        this.resolvers = resolvers;
        this.navigator = navigator;
        this.releaseVersion = releaseVersion;
    }

    @Override // javax.inject.Provider
    public PathfinderStateRegistry get() {
        Companion companion = INSTANCE;
        Lazy<Map<UserViewPageType, UserViewPageResolver>> lazy = DoubleCheck.lazy(this.resolvers);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        return companion.newInstance(lazy, navigator, releaseVersion);
    }

    /* compiled from: PathfinderStateRegistry_Factory.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0004\u001a\u00020\u00052\u001d\u0010\u0006\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u0007J7\u0010\u0010\u001a\u00020\u00112\u001d\u0010\u0006\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b0\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry_Factory;", "resolvers", "Ljavax/inject/Provider;", "", "Lcom/robinhood/models/api/pathfinder/userview/UserViewPageType;", "Lcom/robinhood/android/lib/pathfinder/UserViewPageResolver;", "Lkotlin/jvm/JvmSuppressWildcards;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "newInstance", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry;", "Ldagger/Lazy;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PathfinderStateRegistry_Factory create(Provider<Map<UserViewPageType, UserViewPageResolver>> resolvers, Provider<Navigator> navigator, Provider<ReleaseVersion> releaseVersion) {
            Intrinsics.checkNotNullParameter(resolvers, "resolvers");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            return new PathfinderStateRegistry_Factory(resolvers, navigator, releaseVersion);
        }

        @JvmStatic
        public final PathfinderStateRegistry newInstance(Lazy<Map<UserViewPageType, UserViewPageResolver>> resolvers, Navigator navigator, ReleaseVersion releaseVersion) {
            Intrinsics.checkNotNullParameter(resolvers, "resolvers");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            return new PathfinderStateRegistry(resolvers, navigator, releaseVersion);
        }
    }
}
