package com.robinhood.util;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.util.migrations.LastUpdatedAtMigrations;
import com.robinhood.utils.LogoutKillswitch;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LastUpdatedAtManager_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BJ\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/util/LastUpdatedAtManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/util/LastUpdatedAtManager;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "oneTimeClearManager", "Lcom/robinhood/util/OneTimeClearManager;", "migrations", "", "Lcom/robinhood/util/migrations/LastUpdatedAtMigrations;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LastUpdatedAtManager_Factory implements Factory<LastUpdatedAtManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> app;
    private final Provider<LogoutKillswitch> logoutKillswitch;
    private final Provider<Set<LastUpdatedAtMigrations>> migrations;
    private final Provider<OneTimeClearManager> oneTimeClearManager;

    @JvmStatic
    public static final LastUpdatedAtManager_Factory create(Provider<Application> provider, Provider<LogoutKillswitch> provider2, Provider<OneTimeClearManager> provider3, Provider<Set<LastUpdatedAtMigrations>> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final LastUpdatedAtManager newInstance(Application application, LogoutKillswitch logoutKillswitch, OneTimeClearManager oneTimeClearManager, Set<LastUpdatedAtMigrations> set) {
        return INSTANCE.newInstance(application, logoutKillswitch, oneTimeClearManager, set);
    }

    public LastUpdatedAtManager_Factory(Provider<Application> app, Provider<LogoutKillswitch> logoutKillswitch, Provider<OneTimeClearManager> oneTimeClearManager, Provider<Set<LastUpdatedAtMigrations>> migrations) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(oneTimeClearManager, "oneTimeClearManager");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        this.app = app;
        this.logoutKillswitch = logoutKillswitch;
        this.oneTimeClearManager = oneTimeClearManager;
        this.migrations = migrations;
    }

    @Override // javax.inject.Provider
    public LastUpdatedAtManager get() {
        Companion companion = INSTANCE;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        LogoutKillswitch logoutKillswitch = this.logoutKillswitch.get();
        Intrinsics.checkNotNullExpressionValue(logoutKillswitch, "get(...)");
        OneTimeClearManager oneTimeClearManager = this.oneTimeClearManager.get();
        Intrinsics.checkNotNullExpressionValue(oneTimeClearManager, "get(...)");
        Set<LastUpdatedAtMigrations> set = this.migrations.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        return companion.newInstance(application, logoutKillswitch, oneTimeClearManager, set);
    }

    /* compiled from: LastUpdatedAtManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00100\u0007H\u0007J3\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/util/LastUpdatedAtManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/util/LastUpdatedAtManager_Factory;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "oneTimeClearManager", "Lcom/robinhood/util/OneTimeClearManager;", "migrations", "", "Lcom/robinhood/util/migrations/LastUpdatedAtMigrations;", "Lkotlin/jvm/JvmSuppressWildcards;", "newInstance", "Lcom/robinhood/util/LastUpdatedAtManager;", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LastUpdatedAtManager_Factory create(Provider<Application> app, Provider<LogoutKillswitch> logoutKillswitch, Provider<OneTimeClearManager> oneTimeClearManager, Provider<Set<LastUpdatedAtMigrations>> migrations) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(oneTimeClearManager, "oneTimeClearManager");
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new LastUpdatedAtManager_Factory(app, logoutKillswitch, oneTimeClearManager, migrations);
        }

        @JvmStatic
        public final LastUpdatedAtManager newInstance(Application app, LogoutKillswitch logoutKillswitch, OneTimeClearManager oneTimeClearManager, Set<LastUpdatedAtMigrations> migrations) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(oneTimeClearManager, "oneTimeClearManager");
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new LastUpdatedAtManager(app, logoutKillswitch, oneTimeClearManager, migrations);
        }
    }
}
