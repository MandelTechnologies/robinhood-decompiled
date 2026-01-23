package com.robinhood.librobinhood.logging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore;
import com.robinhood.utils.LogoutKillswitch;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyGlobalLoggingContext_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "rhyAccountLoggingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyGlobalLoggingContext_Factory implements Factory<RhyGlobalLoggingContext> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DirectDepositRelationshipStore> directDepositRelationshipStore;
    private final Provider<LogoutKillswitch> logoutKillswitch;
    private final Provider<RhyAccountLoggingStore> rhyAccountLoggingStore;

    @JvmStatic
    public static final RhyGlobalLoggingContext_Factory create(Provider<RhyAccountLoggingStore> provider, Provider<DirectDepositRelationshipStore> provider2, Provider<LogoutKillswitch> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final RhyGlobalLoggingContext newInstance(RhyAccountLoggingStore rhyAccountLoggingStore, DirectDepositRelationshipStore directDepositRelationshipStore, LogoutKillswitch logoutKillswitch) {
        return INSTANCE.newInstance(rhyAccountLoggingStore, directDepositRelationshipStore, logoutKillswitch);
    }

    public RhyGlobalLoggingContext_Factory(Provider<RhyAccountLoggingStore> rhyAccountLoggingStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<LogoutKillswitch> logoutKillswitch) {
        Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        this.rhyAccountLoggingStore = rhyAccountLoggingStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.logoutKillswitch = logoutKillswitch;
    }

    @Override // javax.inject.Provider
    public RhyGlobalLoggingContext get() {
        Companion companion = INSTANCE;
        RhyAccountLoggingStore rhyAccountLoggingStore = this.rhyAccountLoggingStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountLoggingStore, "get(...)");
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositRelationshipStore, "get(...)");
        LogoutKillswitch logoutKillswitch = this.logoutKillswitch.get();
        Intrinsics.checkNotNullExpressionValue(logoutKillswitch, "get(...)");
        return companion.newInstance(rhyAccountLoggingStore, directDepositRelationshipStore, logoutKillswitch);
    }

    /* compiled from: RhyGlobalLoggingContext_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext_Factory;", "rhyAccountLoggingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "newInstance", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyGlobalLoggingContext_Factory create(Provider<RhyAccountLoggingStore> rhyAccountLoggingStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<LogoutKillswitch> logoutKillswitch) {
            Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            return new RhyGlobalLoggingContext_Factory(rhyAccountLoggingStore, directDepositRelationshipStore, logoutKillswitch);
        }

        @JvmStatic
        public final RhyGlobalLoggingContext newInstance(RhyAccountLoggingStore rhyAccountLoggingStore, DirectDepositRelationshipStore directDepositRelationshipStore, LogoutKillswitch logoutKillswitch) {
            Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            return new RhyGlobalLoggingContext(rhyAccountLoggingStore, directDepositRelationshipStore, logoutKillswitch);
        }
    }
}
