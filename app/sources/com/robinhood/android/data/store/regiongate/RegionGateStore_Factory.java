package com.robinhood.android.data.store.regiongate;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RegionGateStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BX\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/data/store/regiongate/RegionGateStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/data/store/regiongate/RegionGateStore;", "userStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStoreExtension", "Lcom/robinhood/android/data/store/regiongate/ExperimentsStoreExtension;", "regionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "Lkotlin/jvm/JvmSuppressWildcards;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RegionGateStore_Factory implements Factory<RegionGateStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<ExperimentsStoreExtension> experimentsStoreExtension;
    private final Provider<Set<RegionGate>> regionGates;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<UserStore> userStore;

    @JvmStatic
    public static final RegionGateStore_Factory create(Provider<UserStore> provider, Provider<ExperimentsStore> provider2, Provider<ExperimentsStoreExtension> provider3, Provider<Set<RegionGate>> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final RegionGateStore newInstance(UserStore userStore, ExperimentsStore experimentsStore, ExperimentsStoreExtension experimentsStoreExtension, Set<RegionGate> set, StoreBundle storeBundle) {
        return INSTANCE.newInstance(userStore, experimentsStore, experimentsStoreExtension, set, storeBundle);
    }

    public RegionGateStore_Factory(Provider<UserStore> userStore, Provider<ExperimentsStore> experimentsStore, Provider<ExperimentsStoreExtension> experimentsStoreExtension, Provider<Set<RegionGate>> regionGates, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(experimentsStoreExtension, "experimentsStoreExtension");
        Intrinsics.checkNotNullParameter(regionGates, "regionGates");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.userStore = userStore;
        this.experimentsStore = experimentsStore;
        this.experimentsStoreExtension = experimentsStoreExtension;
        this.regionGates = regionGates;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public RegionGateStore get() {
        Companion companion = INSTANCE;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ExperimentsStoreExtension experimentsStoreExtension = this.experimentsStoreExtension.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStoreExtension, "get(...)");
        Set<RegionGate> set = this.regionGates.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(userStore, experimentsStore, experimentsStoreExtension, set, storeBundle);
    }

    /* compiled from: RegionGateStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J;\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/data/store/regiongate/RegionGateStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/data/store/regiongate/RegionGateStore_Factory;", "userStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStoreExtension", "Lcom/robinhood/android/data/store/regiongate/ExperimentsStoreExtension;", "regionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "Lkotlin/jvm/JvmSuppressWildcards;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/data/store/regiongate/RegionGateStore;", "lib-store-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RegionGateStore_Factory create(Provider<UserStore> userStore, Provider<ExperimentsStore> experimentsStore, Provider<ExperimentsStoreExtension> experimentsStoreExtension, Provider<Set<RegionGate>> regionGates, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(experimentsStoreExtension, "experimentsStoreExtension");
            Intrinsics.checkNotNullParameter(regionGates, "regionGates");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RegionGateStore_Factory(userStore, experimentsStore, experimentsStoreExtension, regionGates, storeBundle);
        }

        @JvmStatic
        public final RegionGateStore newInstance(UserStore userStore, ExperimentsStore experimentsStore, ExperimentsStoreExtension experimentsStoreExtension, Set<RegionGate> regionGates, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(experimentsStoreExtension, "experimentsStoreExtension");
            Intrinsics.checkNotNullParameter(regionGates, "regionGates");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RegionGateStore(userStore, experimentsStore, experimentsStoreExtension, regionGates, storeBundle);
        }
    }
}
