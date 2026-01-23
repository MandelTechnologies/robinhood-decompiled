package com.robinhood.android.common.mcduckling.location;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Atlas;
import com.robinhood.prefs.Installation;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LocationProtectionBroadcastReceiver_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/location/LocationProtectionBroadcastReceiver_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionBroadcastReceiver;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "atlas", "Lcom/robinhood/api/retrofit/Atlas;", "installation", "Lcom/robinhood/prefs/Installation;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LocationProtectionBroadcastReceiver_MembersInjector implements MembersInjector<LocationProtectionBroadcastReceiver> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Atlas> atlas;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<Installation> installation;
    private final Provider<LogoutKillswitch> logoutKillswitch;

    @JvmStatic
    public static final MembersInjector<LocationProtectionBroadcastReceiver> create(Provider<CoroutineScope> provider, Provider<LogoutKillswitch> provider2, Provider<Atlas> provider3, Provider<Installation> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectAtlas(LocationProtectionBroadcastReceiver locationProtectionBroadcastReceiver, Atlas atlas) {
        INSTANCE.injectAtlas(locationProtectionBroadcastReceiver, atlas);
    }

    @JvmStatic
    @RootCoroutineScope
    public static final void injectCoroutineScope(LocationProtectionBroadcastReceiver locationProtectionBroadcastReceiver, CoroutineScope coroutineScope) {
        INSTANCE.injectCoroutineScope(locationProtectionBroadcastReceiver, coroutineScope);
    }

    @JvmStatic
    public static final void injectInstallation(LocationProtectionBroadcastReceiver locationProtectionBroadcastReceiver, Installation installation) {
        INSTANCE.injectInstallation(locationProtectionBroadcastReceiver, installation);
    }

    @JvmStatic
    public static final void injectLogoutKillswitch(LocationProtectionBroadcastReceiver locationProtectionBroadcastReceiver, LogoutKillswitch logoutKillswitch) {
        INSTANCE.injectLogoutKillswitch(locationProtectionBroadcastReceiver, logoutKillswitch);
    }

    public LocationProtectionBroadcastReceiver_MembersInjector(Provider<CoroutineScope> coroutineScope, Provider<LogoutKillswitch> logoutKillswitch, Provider<Atlas> atlas, Provider<Installation> installation) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(atlas, "atlas");
        Intrinsics.checkNotNullParameter(installation, "installation");
        this.coroutineScope = coroutineScope;
        this.logoutKillswitch = logoutKillswitch;
        this.atlas = atlas;
        this.installation = installation;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LocationProtectionBroadcastReceiver instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        companion.injectCoroutineScope(instance, coroutineScope);
        LogoutKillswitch logoutKillswitch = this.logoutKillswitch.get();
        Intrinsics.checkNotNullExpressionValue(logoutKillswitch, "get(...)");
        companion.injectLogoutKillswitch(instance, logoutKillswitch);
        Atlas atlas = this.atlas.get();
        Intrinsics.checkNotNullExpressionValue(atlas, "get(...)");
        companion.injectAtlas(instance, atlas);
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        companion.injectInstallation(instance, installation);
    }

    /* compiled from: LocationProtectionBroadcastReceiver_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/location/LocationProtectionBroadcastReceiver_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionBroadcastReceiver;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "atlas", "Lcom/robinhood/api/retrofit/Atlas;", "installation", "Lcom/robinhood/prefs/Installation;", "injectCoroutineScope", "", "instance", "injectLogoutKillswitch", "injectAtlas", "injectInstallation", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<LocationProtectionBroadcastReceiver> create(Provider<CoroutineScope> coroutineScope, Provider<LogoutKillswitch> logoutKillswitch, Provider<Atlas> atlas, Provider<Installation> installation) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(atlas, "atlas");
            Intrinsics.checkNotNullParameter(installation, "installation");
            return new LocationProtectionBroadcastReceiver_MembersInjector(coroutineScope, logoutKillswitch, atlas, installation);
        }

        @JvmStatic
        @RootCoroutineScope
        public final void injectCoroutineScope(LocationProtectionBroadcastReceiver instance, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            instance.setCoroutineScope(coroutineScope);
        }

        @JvmStatic
        public final void injectLogoutKillswitch(LocationProtectionBroadcastReceiver instance, LogoutKillswitch logoutKillswitch) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            instance.setLogoutKillswitch(logoutKillswitch);
        }

        @JvmStatic
        public final void injectAtlas(LocationProtectionBroadcastReceiver instance, Atlas atlas) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(atlas, "atlas");
            instance.setAtlas(atlas);
        }

        @JvmStatic
        public final void injectInstallation(LocationProtectionBroadcastReceiver instance, Installation installation) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(installation, "installation");
            instance.setInstallation(installation);
        }
    }
}
