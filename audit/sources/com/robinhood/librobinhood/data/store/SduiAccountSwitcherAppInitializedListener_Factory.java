package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiAccountSwitcherAppInitializedListener_Factory.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB(\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherAppInitializedListener_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherAppInitializedListener;", "sduiAccountSwitcherStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherStore;", "Lkotlin/jvm/JvmSuppressWildcards;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SduiAccountSwitcherAppInitializedListener_Factory implements Factory<SduiAccountSwitcherAppInitializedListener> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineScope> rootCoroutineScope;
    private final Provider<SduiAccountSwitcherStore> sduiAccountSwitcherStore;

    @JvmStatic
    public static final SduiAccountSwitcherAppInitializedListener_Factory create(Provider<SduiAccountSwitcherStore> provider, Provider<CoroutineScope> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final SduiAccountSwitcherAppInitializedListener newInstance(Lazy<SduiAccountSwitcherStore> lazy, CoroutineScope coroutineScope) {
        return INSTANCE.newInstance(lazy, coroutineScope);
    }

    public SduiAccountSwitcherAppInitializedListener_Factory(Provider<SduiAccountSwitcherStore> sduiAccountSwitcherStore, Provider<CoroutineScope> rootCoroutineScope) {
        Intrinsics.checkNotNullParameter(sduiAccountSwitcherStore, "sduiAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        this.sduiAccountSwitcherStore = sduiAccountSwitcherStore;
        this.rootCoroutineScope = rootCoroutineScope;
    }

    @Override // javax.inject.Provider
    public SduiAccountSwitcherAppInitializedListener get() {
        Companion companion = INSTANCE;
        Lazy<SduiAccountSwitcherStore> lazy = DoubleCheck.lazy(this.sduiAccountSwitcherStore);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        return companion.newInstance(lazy, coroutineScope);
    }

    /* compiled from: SduiAccountSwitcherAppInitializedListener_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0007J#\u0010\f\u001a\u00020\r2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherAppInitializedListener_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherAppInitializedListener_Factory;", "sduiAccountSwitcherStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherStore;", "Lkotlin/jvm/JvmSuppressWildcards;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "newInstance", "Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherAppInitializedListener;", "Ldagger/Lazy;", "lib-store-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SduiAccountSwitcherAppInitializedListener_Factory create(Provider<SduiAccountSwitcherStore> sduiAccountSwitcherStore, Provider<CoroutineScope> rootCoroutineScope) {
            Intrinsics.checkNotNullParameter(sduiAccountSwitcherStore, "sduiAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            return new SduiAccountSwitcherAppInitializedListener_Factory(sduiAccountSwitcherStore, rootCoroutineScope);
        }

        @JvmStatic
        public final SduiAccountSwitcherAppInitializedListener newInstance(Lazy<SduiAccountSwitcherStore> sduiAccountSwitcherStore, CoroutineScope rootCoroutineScope) {
            Intrinsics.checkNotNullParameter(sduiAccountSwitcherStore, "sduiAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            return new SduiAccountSwitcherAppInitializedListener(sduiAccountSwitcherStore, rootCoroutineScope);
        }
    }
}
