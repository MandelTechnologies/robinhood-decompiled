package com.robinhood.android.util;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.achrelationship.QueuedTransferStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhShortcutManagerImpl_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/util/RhShortcutManagerImpl_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/util/RhShortcutManagerImpl;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "application", "Landroid/app/Application;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "queuedTransferStore", "Lcom/robinhood/store/achrelationship/QueuedTransferStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhShortcutManagerImpl_Factory implements Factory<RhShortcutManagerImpl> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<Application> application;
    private final Provider<AuthManager> authManager;
    private final Provider<BalancesStore> balancesStore;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<QueuedTransferStore> queuedTransferStore;
    private final Provider<RxFactory> rxFactory;

    @JvmStatic
    public static final RhShortcutManagerImpl_Factory create(Provider<CoroutineScope> provider, Provider<Application> provider2, Provider<AchRelationshipStore> provider3, Provider<BalancesStore> provider4, Provider<QueuedTransferStore> provider5, Provider<AuthManager> provider6, Provider<RxFactory> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final RhShortcutManagerImpl newInstance(CoroutineScope coroutineScope, Application application, AchRelationshipStore achRelationshipStore, BalancesStore balancesStore, QueuedTransferStore queuedTransferStore, AuthManager authManager, RxFactory rxFactory) {
        return INSTANCE.newInstance(coroutineScope, application, achRelationshipStore, balancesStore, queuedTransferStore, authManager, rxFactory);
    }

    public RhShortcutManagerImpl_Factory(Provider<CoroutineScope> coroutineScope, Provider<Application> application, Provider<AchRelationshipStore> achRelationshipStore, Provider<BalancesStore> balancesStore, Provider<QueuedTransferStore> queuedTransferStore, Provider<AuthManager> authManager, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(queuedTransferStore, "queuedTransferStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.coroutineScope = coroutineScope;
        this.application = application;
        this.achRelationshipStore = achRelationshipStore;
        this.balancesStore = balancesStore;
        this.queuedTransferStore = queuedTransferStore;
        this.authManager = authManager;
        this.rxFactory = rxFactory;
    }

    @Override // javax.inject.Provider
    public RhShortcutManagerImpl get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        Application application = this.application.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        BalancesStore balancesStore = this.balancesStore.get();
        Intrinsics.checkNotNullExpressionValue(balancesStore, "get(...)");
        QueuedTransferStore queuedTransferStore = this.queuedTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(queuedTransferStore, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        return companion.newInstance(coroutineScope, application, achRelationshipStore, balancesStore, queuedTransferStore, authManager, rxFactory);
    }

    /* compiled from: RhShortcutManagerImpl_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/util/RhShortcutManagerImpl_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/util/RhShortcutManagerImpl_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "application", "Landroid/app/Application;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "queuedTransferStore", "Lcom/robinhood/store/achrelationship/QueuedTransferStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "newInstance", "Lcom/robinhood/android/util/RhShortcutManagerImpl;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhShortcutManagerImpl_Factory create(Provider<CoroutineScope> coroutineScope, Provider<Application> application, Provider<AchRelationshipStore> achRelationshipStore, Provider<BalancesStore> balancesStore, Provider<QueuedTransferStore> queuedTransferStore, Provider<AuthManager> authManager, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(queuedTransferStore, "queuedTransferStore");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new RhShortcutManagerImpl_Factory(coroutineScope, application, achRelationshipStore, balancesStore, queuedTransferStore, authManager, rxFactory);
        }

        @JvmStatic
        public final RhShortcutManagerImpl newInstance(CoroutineScope coroutineScope, Application application, AchRelationshipStore achRelationshipStore, BalancesStore balancesStore, QueuedTransferStore queuedTransferStore, AuthManager authManager, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(queuedTransferStore, "queuedTransferStore");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new RhShortcutManagerImpl(coroutineScope, application, achRelationshipStore, balancesStore, queuedTransferStore, authManager, rxFactory);
        }
    }
}
