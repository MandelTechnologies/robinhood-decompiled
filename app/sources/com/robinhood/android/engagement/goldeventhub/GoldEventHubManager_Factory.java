package com.robinhood.android.engagement.goldeventhub;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldEventHubManager_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/engagement/goldeventhub/GoldEventHubManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/engagement/goldeventhub/GoldEventHubManager;", "microgramManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "context", "Landroid/content/Context;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-gold-event-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class GoldEventHubManager_Factory implements Factory<GoldEventHubManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> context;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<CoroutineScope> microgramCoroutineScope;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<LazyMoshi> moshi;
    private final Provider<Navigator> navigator;

    @JvmStatic
    public static final GoldEventHubManager_Factory create(Provider<MicrogramManager> provider, Provider<Context> provider2, Provider<CoroutineScope> provider3, Provider<ExperimentsStore> provider4, Provider<Navigator> provider5, Provider<LazyMoshi> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final GoldEventHubManager newInstance(MicrogramManager microgramManager, Context context, CoroutineScope coroutineScope, ExperimentsStore experimentsStore, Navigator navigator, LazyMoshi lazyMoshi) {
        return INSTANCE.newInstance(microgramManager, context, coroutineScope, experimentsStore, navigator, lazyMoshi);
    }

    public GoldEventHubManager_Factory(Provider<MicrogramManager> microgramManager, Provider<Context> context, Provider<CoroutineScope> microgramCoroutineScope, Provider<ExperimentsStore> experimentsStore, Provider<Navigator> navigator, Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.microgramManager = microgramManager;
        this.context = context;
        this.microgramCoroutineScope = microgramCoroutineScope;
        this.experimentsStore = experimentsStore;
        this.navigator = navigator;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public GoldEventHubManager get() {
        Companion companion = INSTANCE;
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        CoroutineScope coroutineScope = this.microgramCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.newInstance(microgramManager, context, coroutineScope, experimentsStore, navigator, lazyMoshi);
    }

    /* compiled from: GoldEventHubManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/engagement/goldeventhub/GoldEventHubManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/engagement/goldeventhub/GoldEventHubManager_Factory;", "microgramManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "context", "Landroid/content/Context;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "newInstance", "Lcom/robinhood/android/engagement/goldeventhub/GoldEventHubManager;", "lib-gold-event-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldEventHubManager_Factory create(Provider<MicrogramManager> microgramManager, Provider<Context> context, Provider<CoroutineScope> microgramCoroutineScope, Provider<ExperimentsStore> experimentsStore, Provider<Navigator> navigator, Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new GoldEventHubManager_Factory(microgramManager, context, microgramCoroutineScope, experimentsStore, navigator, moshi);
        }

        @JvmStatic
        public final GoldEventHubManager newInstance(MicrogramManager microgramManager, Context context, CoroutineScope microgramCoroutineScope, ExperimentsStore experimentsStore, Navigator navigator, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new GoldEventHubManager(microgramManager, context, microgramCoroutineScope, experimentsStore, navigator, moshi);
        }
    }
}
