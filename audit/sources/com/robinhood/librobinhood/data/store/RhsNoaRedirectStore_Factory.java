package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.prefs.LongPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhsNoaRedirectStore_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore;", "directDepositRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "hasDismissedT60RhsNoaRedirectPref", "Lcom/robinhood/prefs/LongPreference;", "hasShownT30RhsNoaRedirectSheetPref", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhsNoaRedirectStore_Factory implements Factory<RhsNoaRedirectStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DirectDepositRelationshipStore> directDepositRelationshipStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<LongPreference> hasDismissedT60RhsNoaRedirectPref;
    private final Provider<LongPreference> hasShownT30RhsNoaRedirectSheetPref;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final RhsNoaRedirectStore_Factory create(Provider<DirectDepositRelationshipStore> provider, Provider<RhyAccountStore> provider2, Provider<ExperimentsStore> provider3, Provider<LongPreference> provider4, Provider<LongPreference> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final RhsNoaRedirectStore newInstance(DirectDepositRelationshipStore directDepositRelationshipStore, RhyAccountStore rhyAccountStore, ExperimentsStore experimentsStore, LongPreference longPreference, LongPreference longPreference2, StoreBundle storeBundle) {
        return INSTANCE.newInstance(directDepositRelationshipStore, rhyAccountStore, experimentsStore, longPreference, longPreference2, storeBundle);
    }

    public RhsNoaRedirectStore_Factory(Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<RhyAccountStore> rhyAccountStore, Provider<ExperimentsStore> experimentsStore, Provider<LongPreference> hasDismissedT60RhsNoaRedirectPref, Provider<LongPreference> hasShownT30RhsNoaRedirectSheetPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(hasDismissedT60RhsNoaRedirectPref, "hasDismissedT60RhsNoaRedirectPref");
        Intrinsics.checkNotNullParameter(hasShownT30RhsNoaRedirectSheetPref, "hasShownT30RhsNoaRedirectSheetPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.rhyAccountStore = rhyAccountStore;
        this.experimentsStore = experimentsStore;
        this.hasDismissedT60RhsNoaRedirectPref = hasDismissedT60RhsNoaRedirectPref;
        this.hasShownT30RhsNoaRedirectSheetPref = hasShownT30RhsNoaRedirectSheetPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public RhsNoaRedirectStore get() {
        Companion companion = INSTANCE;
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositRelationshipStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        LongPreference longPreference = this.hasDismissedT60RhsNoaRedirectPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        LongPreference longPreference2 = this.hasShownT30RhsNoaRedirectSheetPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference2, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(directDepositRelationshipStore, rhyAccountStore, experimentsStore, longPreference, longPreference2, storeBundle);
    }

    /* compiled from: RhsNoaRedirectStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0007J8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore_Factory;", "directDepositRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "hasDismissedT60RhsNoaRedirectPref", "Lcom/robinhood/prefs/LongPreference;", "hasShownT30RhsNoaRedirectSheetPref", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhsNoaRedirectStore_Factory create(Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<RhyAccountStore> rhyAccountStore, Provider<ExperimentsStore> experimentsStore, Provider<LongPreference> hasDismissedT60RhsNoaRedirectPref, Provider<LongPreference> hasShownT30RhsNoaRedirectSheetPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(hasDismissedT60RhsNoaRedirectPref, "hasDismissedT60RhsNoaRedirectPref");
            Intrinsics.checkNotNullParameter(hasShownT30RhsNoaRedirectSheetPref, "hasShownT30RhsNoaRedirectSheetPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RhsNoaRedirectStore_Factory(directDepositRelationshipStore, rhyAccountStore, experimentsStore, hasDismissedT60RhsNoaRedirectPref, hasShownT30RhsNoaRedirectSheetPref, storeBundle);
        }

        @JvmStatic
        public final RhsNoaRedirectStore newInstance(DirectDepositRelationshipStore directDepositRelationshipStore, RhyAccountStore rhyAccountStore, ExperimentsStore experimentsStore, LongPreference hasDismissedT60RhsNoaRedirectPref, LongPreference hasShownT30RhsNoaRedirectSheetPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(hasDismissedT60RhsNoaRedirectPref, "hasDismissedT60RhsNoaRedirectPref");
            Intrinsics.checkNotNullParameter(hasShownT30RhsNoaRedirectSheetPref, "hasShownT30RhsNoaRedirectSheetPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RhsNoaRedirectStore(directDepositRelationshipStore, rhyAccountStore, experimentsStore, hasDismissedT60RhsNoaRedirectPref, hasShownT30RhsNoaRedirectSheetPref, storeBundle);
        }
    }
}
