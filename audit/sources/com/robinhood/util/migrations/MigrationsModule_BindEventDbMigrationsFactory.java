package com.robinhood.util.migrations;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MigrationsModule_BindEventDbMigrationsFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/util/migrations/MigrationsModule_BindEventDbMigrationsFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/util/migrations/LastUpdatedAtMigrations;", "eventMigrations", "Ljavax/inject/Provider;", "Lcom/robinhood/util/migrations/EventContractDatabaseLastUpdatedAtMigrations;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MigrationsModule_BindEventDbMigrationsFactory implements Factory<LastUpdatedAtMigrations> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EventContractDatabaseLastUpdatedAtMigrations> eventMigrations;

    @JvmStatic
    public static final LastUpdatedAtMigrations bindEventDbMigrations(EventContractDatabaseLastUpdatedAtMigrations eventContractDatabaseLastUpdatedAtMigrations) {
        return INSTANCE.bindEventDbMigrations(eventContractDatabaseLastUpdatedAtMigrations);
    }

    @JvmStatic
    public static final MigrationsModule_BindEventDbMigrationsFactory create(Provider<EventContractDatabaseLastUpdatedAtMigrations> provider) {
        return INSTANCE.create(provider);
    }

    public MigrationsModule_BindEventDbMigrationsFactory(Provider<EventContractDatabaseLastUpdatedAtMigrations> eventMigrations) {
        Intrinsics.checkNotNullParameter(eventMigrations, "eventMigrations");
        this.eventMigrations = eventMigrations;
    }

    @Override // javax.inject.Provider
    public LastUpdatedAtMigrations get() {
        Companion companion = INSTANCE;
        EventContractDatabaseLastUpdatedAtMigrations eventContractDatabaseLastUpdatedAtMigrations = this.eventMigrations.get();
        Intrinsics.checkNotNullExpressionValue(eventContractDatabaseLastUpdatedAtMigrations, "get(...)");
        return companion.bindEventDbMigrations(eventContractDatabaseLastUpdatedAtMigrations);
    }

    /* compiled from: MigrationsModule_BindEventDbMigrationsFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/util/migrations/MigrationsModule_BindEventDbMigrationsFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/util/migrations/MigrationsModule_BindEventDbMigrationsFactory;", "eventMigrations", "Ljavax/inject/Provider;", "Lcom/robinhood/util/migrations/EventContractDatabaseLastUpdatedAtMigrations;", "bindEventDbMigrations", "Lcom/robinhood/util/migrations/LastUpdatedAtMigrations;", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MigrationsModule_BindEventDbMigrationsFactory create(Provider<EventContractDatabaseLastUpdatedAtMigrations> eventMigrations) {
            Intrinsics.checkNotNullParameter(eventMigrations, "eventMigrations");
            return new MigrationsModule_BindEventDbMigrationsFactory(eventMigrations);
        }

        @JvmStatic
        public final LastUpdatedAtMigrations bindEventDbMigrations(EventContractDatabaseLastUpdatedAtMigrations eventMigrations) {
            Intrinsics.checkNotNullParameter(eventMigrations, "eventMigrations");
            Object objCheckNotNull = Preconditions.checkNotNull(MigrationsModule.INSTANCE.bindEventDbMigrations(eventMigrations), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (LastUpdatedAtMigrations) objCheckNotNull;
        }
    }
}
