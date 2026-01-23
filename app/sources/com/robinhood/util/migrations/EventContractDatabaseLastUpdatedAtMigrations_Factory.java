package com.robinhood.util.migrations;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractDatabaseLastUpdatedAtMigrations_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/util/migrations/EventContractDatabaseLastUpdatedAtMigrations_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/util/migrations/EventContractDatabaseLastUpdatedAtMigrations;", "eventDbVersion", "Ljavax/inject/Provider;", "", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EventContractDatabaseLastUpdatedAtMigrations_Factory implements Factory<EventContractDatabaseLastUpdatedAtMigrations> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Integer> eventDbVersion;

    @JvmStatic
    public static final EventContractDatabaseLastUpdatedAtMigrations_Factory create(Provider<Integer> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final EventContractDatabaseLastUpdatedAtMigrations newInstance(int i) {
        return INSTANCE.newInstance(i);
    }

    public EventContractDatabaseLastUpdatedAtMigrations_Factory(Provider<Integer> eventDbVersion) {
        Intrinsics.checkNotNullParameter(eventDbVersion, "eventDbVersion");
        this.eventDbVersion = eventDbVersion;
    }

    @Override // javax.inject.Provider
    public EventContractDatabaseLastUpdatedAtMigrations get() {
        Companion companion = INSTANCE;
        Integer num = this.eventDbVersion.get();
        Intrinsics.checkNotNullExpressionValue(num, "get(...)");
        return companion.newInstance(num.intValue());
    }

    /* compiled from: EventContractDatabaseLastUpdatedAtMigrations_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/util/migrations/EventContractDatabaseLastUpdatedAtMigrations_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/util/migrations/EventContractDatabaseLastUpdatedAtMigrations_Factory;", "eventDbVersion", "Ljavax/inject/Provider;", "", "newInstance", "Lcom/robinhood/util/migrations/EventContractDatabaseLastUpdatedAtMigrations;", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventContractDatabaseLastUpdatedAtMigrations_Factory create(Provider<Integer> eventDbVersion) {
            Intrinsics.checkNotNullParameter(eventDbVersion, "eventDbVersion");
            return new EventContractDatabaseLastUpdatedAtMigrations_Factory(eventDbVersion);
        }

        @JvmStatic
        public final EventContractDatabaseLastUpdatedAtMigrations newInstance(int eventDbVersion) {
            return new EventContractDatabaseLastUpdatedAtMigrations(eventDbVersion);
        }
    }
}
