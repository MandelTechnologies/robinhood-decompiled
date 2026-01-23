package com.robinhood.android.store.matcha;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaBadgeStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaBadgeStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/store/matcha/MatchaBadgeStore;", "rhyAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "treatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "pendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "hasSeenBadgePref", "Lcom/robinhood/prefs/BooleanPreference;", "lastSeenTransactionCountPref", "Lcom/robinhood/prefs/IntPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MatchaBadgeStore_Factory implements Factory<MatchaBadgeStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BooleanPreference> hasSeenBadgePref;
    private final Provider<IntPreference> lastSeenTransactionCountPref;
    private final Provider<MatchaPendingTransactionStore> pendingTransactionStore;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<MatchaTreatmentStore> treatmentStore;

    @JvmStatic
    public static final MatchaBadgeStore_Factory create(Provider<RhyAccountStore> provider, Provider<MatchaTreatmentStore> provider2, Provider<MatchaPendingTransactionStore> provider3, Provider<BooleanPreference> provider4, Provider<IntPreference> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final MatchaBadgeStore newInstance(RhyAccountStore rhyAccountStore, MatchaTreatmentStore matchaTreatmentStore, MatchaPendingTransactionStore matchaPendingTransactionStore, BooleanPreference booleanPreference, IntPreference intPreference, StoreBundle storeBundle) {
        return INSTANCE.newInstance(rhyAccountStore, matchaTreatmentStore, matchaPendingTransactionStore, booleanPreference, intPreference, storeBundle);
    }

    public MatchaBadgeStore_Factory(Provider<RhyAccountStore> rhyAccountStore, Provider<MatchaTreatmentStore> treatmentStore, Provider<MatchaPendingTransactionStore> pendingTransactionStore, Provider<BooleanPreference> hasSeenBadgePref, Provider<IntPreference> lastSeenTransactionCountPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(treatmentStore, "treatmentStore");
        Intrinsics.checkNotNullParameter(pendingTransactionStore, "pendingTransactionStore");
        Intrinsics.checkNotNullParameter(hasSeenBadgePref, "hasSeenBadgePref");
        Intrinsics.checkNotNullParameter(lastSeenTransactionCountPref, "lastSeenTransactionCountPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.rhyAccountStore = rhyAccountStore;
        this.treatmentStore = treatmentStore;
        this.pendingTransactionStore = pendingTransactionStore;
        this.hasSeenBadgePref = hasSeenBadgePref;
        this.lastSeenTransactionCountPref = lastSeenTransactionCountPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public MatchaBadgeStore get() {
        Companion companion = INSTANCE;
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        MatchaTreatmentStore matchaTreatmentStore = this.treatmentStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaTreatmentStore, "get(...)");
        MatchaPendingTransactionStore matchaPendingTransactionStore = this.pendingTransactionStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaPendingTransactionStore, "get(...)");
        BooleanPreference booleanPreference = this.hasSeenBadgePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        IntPreference intPreference = this.lastSeenTransactionCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(rhyAccountStore, matchaTreatmentStore, matchaPendingTransactionStore, booleanPreference, intPreference, storeBundle);
    }

    /* compiled from: MatchaBadgeStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaBadgeStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/store/matcha/MatchaBadgeStore_Factory;", "rhyAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "treatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "pendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "hasSeenBadgePref", "Lcom/robinhood/prefs/BooleanPreference;", "lastSeenTransactionCountPref", "Lcom/robinhood/prefs/IntPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/store/matcha/MatchaBadgeStore;", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MatchaBadgeStore_Factory create(Provider<RhyAccountStore> rhyAccountStore, Provider<MatchaTreatmentStore> treatmentStore, Provider<MatchaPendingTransactionStore> pendingTransactionStore, Provider<BooleanPreference> hasSeenBadgePref, Provider<IntPreference> lastSeenTransactionCountPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(treatmentStore, "treatmentStore");
            Intrinsics.checkNotNullParameter(pendingTransactionStore, "pendingTransactionStore");
            Intrinsics.checkNotNullParameter(hasSeenBadgePref, "hasSeenBadgePref");
            Intrinsics.checkNotNullParameter(lastSeenTransactionCountPref, "lastSeenTransactionCountPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MatchaBadgeStore_Factory(rhyAccountStore, treatmentStore, pendingTransactionStore, hasSeenBadgePref, lastSeenTransactionCountPref, storeBundle);
        }

        @JvmStatic
        public final MatchaBadgeStore newInstance(RhyAccountStore rhyAccountStore, MatchaTreatmentStore treatmentStore, MatchaPendingTransactionStore pendingTransactionStore, BooleanPreference hasSeenBadgePref, IntPreference lastSeenTransactionCountPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(treatmentStore, "treatmentStore");
            Intrinsics.checkNotNullParameter(pendingTransactionStore, "pendingTransactionStore");
            Intrinsics.checkNotNullParameter(hasSeenBadgePref, "hasSeenBadgePref");
            Intrinsics.checkNotNullParameter(lastSeenTransactionCountPref, "lastSeenTransactionCountPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MatchaBadgeStore(rhyAccountStore, treatmentStore, pendingTransactionStore, hasSeenBadgePref, lastSeenTransactionCountPref, storeBundle);
        }
    }
}
