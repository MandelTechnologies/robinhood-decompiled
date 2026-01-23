package com.robinhood.shared.security.prompts;

import android.content.Context;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PromptsFetchManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/security/prompts/PromptsFetchManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/prompts/PromptsFetchManager;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "promptsFetchKillswitch", "Lcom/robinhood/shared/security/prompts/PromptsFetchKillswitch;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-prompts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PromptsFetchManager_Factory implements Factory<PromptsFetchManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AuthManager> authManager;
    private final Provider<Context> context;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<LockscreenManager> lockscreenManager;
    private final Provider<Navigator> navigator;
    private final Provider<NotificationManager> notificationManager;
    private final Provider<PromptsFetchKillswitch> promptsFetchKillswitch;
    private final Provider<Sheriff> sheriff;

    @JvmStatic
    public static final PromptsFetchManager_Factory create(Provider<Context> provider, Provider<CoroutineScope> provider2, Provider<AuthManager> provider3, Provider<LockscreenManager> provider4, Provider<Navigator> provider5, Provider<Sheriff> provider6, Provider<ExperimentsStore> provider7, Provider<NotificationManager> provider8, Provider<PromptsFetchKillswitch> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final PromptsFetchManager newInstance(Context context, CoroutineScope coroutineScope, AuthManager authManager, LockscreenManager lockscreenManager, Navigator navigator, Sheriff sheriff, ExperimentsStore experimentsStore, NotificationManager notificationManager, PromptsFetchKillswitch promptsFetchKillswitch) {
        return INSTANCE.newInstance(context, coroutineScope, authManager, lockscreenManager, navigator, sheriff, experimentsStore, notificationManager, promptsFetchKillswitch);
    }

    public PromptsFetchManager_Factory(Provider<Context> context, Provider<CoroutineScope> coroutineScope, Provider<AuthManager> authManager, Provider<LockscreenManager> lockscreenManager, Provider<Navigator> navigator, Provider<Sheriff> sheriff, Provider<ExperimentsStore> experimentsStore, Provider<NotificationManager> notificationManager, Provider<PromptsFetchKillswitch> promptsFetchKillswitch) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(promptsFetchKillswitch, "promptsFetchKillswitch");
        this.context = context;
        this.coroutineScope = coroutineScope;
        this.authManager = authManager;
        this.lockscreenManager = lockscreenManager;
        this.navigator = navigator;
        this.sheriff = sheriff;
        this.experimentsStore = experimentsStore;
        this.notificationManager = notificationManager;
        this.promptsFetchKillswitch = promptsFetchKillswitch;
    }

    @Override // javax.inject.Provider
    public PromptsFetchManager get() {
        Companion companion = INSTANCE;
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        LockscreenManager lockscreenManager = this.lockscreenManager.get();
        Intrinsics.checkNotNullExpressionValue(lockscreenManager, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        Sheriff sheriff = this.sheriff.get();
        Intrinsics.checkNotNullExpressionValue(sheriff, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        NotificationManager notificationManager = this.notificationManager.get();
        Intrinsics.checkNotNullExpressionValue(notificationManager, "get(...)");
        PromptsFetchKillswitch promptsFetchKillswitch = this.promptsFetchKillswitch.get();
        Intrinsics.checkNotNullExpressionValue(promptsFetchKillswitch, "get(...)");
        return companion.newInstance(context, coroutineScope, authManager, lockscreenManager, navigator, sheriff, experimentsStore, notificationManager, promptsFetchKillswitch);
    }

    /* compiled from: PromptsFetchManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/security/prompts/PromptsFetchManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/security/prompts/PromptsFetchManager_Factory;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "promptsFetchKillswitch", "Lcom/robinhood/shared/security/prompts/PromptsFetchKillswitch;", "newInstance", "Lcom/robinhood/shared/security/prompts/PromptsFetchManager;", "lib-prompts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PromptsFetchManager_Factory create(Provider<Context> context, Provider<CoroutineScope> coroutineScope, Provider<AuthManager> authManager, Provider<LockscreenManager> lockscreenManager, Provider<Navigator> navigator, Provider<Sheriff> sheriff, Provider<ExperimentsStore> experimentsStore, Provider<NotificationManager> notificationManager, Provider<PromptsFetchKillswitch> promptsFetchKillswitch) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
            Intrinsics.checkNotNullParameter(promptsFetchKillswitch, "promptsFetchKillswitch");
            return new PromptsFetchManager_Factory(context, coroutineScope, authManager, lockscreenManager, navigator, sheriff, experimentsStore, notificationManager, promptsFetchKillswitch);
        }

        @JvmStatic
        public final PromptsFetchManager newInstance(Context context, CoroutineScope coroutineScope, AuthManager authManager, LockscreenManager lockscreenManager, Navigator navigator, Sheriff sheriff, ExperimentsStore experimentsStore, NotificationManager notificationManager, PromptsFetchKillswitch promptsFetchKillswitch) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
            Intrinsics.checkNotNullParameter(promptsFetchKillswitch, "promptsFetchKillswitch");
            return new PromptsFetchManager(context, coroutineScope, authManager, lockscreenManager, navigator, sheriff, experimentsStore, notificationManager, promptsFetchKillswitch);
        }
    }
}
