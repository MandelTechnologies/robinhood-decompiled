package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.store.matcha.MatchaBadgeStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyTabStateStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: McDucklingBadgeStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB½\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "matchaBadgeStore", "Lcom/robinhood/android/store/matcha/MatchaBadgeStore;", "rhyApplicationStore", "Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyTabStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "hasVisitedMcDucklingTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasVisitedMcDucklingTabEligibleRhyPref", "hasShownRhyMigrationSheetPref", "cmSunsetOptedOutPref", "cmSunsetFullscreenCount", "Lcom/robinhood/prefs/IntPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class McDucklingBadgeStore_Factory implements Factory<McDucklingBadgeStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<IntPreference> cmSunsetFullscreenCount;
    private final Provider<BooleanPreference> cmSunsetOptedOutPref;
    private final Provider<CreditCardStore> creditCardStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasShownRhyMigrationSheetPref;
    private final Provider<BooleanPreference> hasVisitedMcDucklingTabEligibleRhyPref;
    private final Provider<BooleanPreference> hasVisitedMcDucklingTabPref;
    private final Provider<MatchaBadgeStore> matchaBadgeStore;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<RhyApplicationStore> rhyApplicationStore;
    private final Provider<RhyTabStateStore> rhyTabStateStore;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<UserStore> userStore;

    @JvmStatic
    public static final McDucklingBadgeStore_Factory create(Provider<StoreBundle> provider, Provider<CreditCardStore> provider2, Provider<ExperimentsStore> provider3, Provider<MatchaBadgeStore> provider4, Provider<RhyApplicationStore> provider5, Provider<RhyAccountStore> provider6, Provider<RhyTabStateStore> provider7, Provider<UserStore> provider8, Provider<BooleanPreference> provider9, Provider<BooleanPreference> provider10, Provider<BooleanPreference> provider11, Provider<BooleanPreference> provider12, Provider<IntPreference> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final McDucklingBadgeStore newInstance(StoreBundle storeBundle, CreditCardStore creditCardStore, ExperimentsStore experimentsStore, MatchaBadgeStore matchaBadgeStore, RhyApplicationStore rhyApplicationStore, RhyAccountStore rhyAccountStore, RhyTabStateStore rhyTabStateStore, UserStore userStore, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, BooleanPreference booleanPreference4, IntPreference intPreference) {
        return INSTANCE.newInstance(storeBundle, creditCardStore, experimentsStore, matchaBadgeStore, rhyApplicationStore, rhyAccountStore, rhyTabStateStore, userStore, booleanPreference, booleanPreference2, booleanPreference3, booleanPreference4, intPreference);
    }

    public McDucklingBadgeStore_Factory(Provider<StoreBundle> storeBundle, Provider<CreditCardStore> creditCardStore, Provider<ExperimentsStore> experimentsStore, Provider<MatchaBadgeStore> matchaBadgeStore, Provider<RhyApplicationStore> rhyApplicationStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RhyTabStateStore> rhyTabStateStore, Provider<UserStore> userStore, Provider<BooleanPreference> hasVisitedMcDucklingTabPref, Provider<BooleanPreference> hasVisitedMcDucklingTabEligibleRhyPref, Provider<BooleanPreference> hasShownRhyMigrationSheetPref, Provider<BooleanPreference> cmSunsetOptedOutPref, Provider<IntPreference> cmSunsetFullscreenCount) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(matchaBadgeStore, "matchaBadgeStore");
        Intrinsics.checkNotNullParameter(rhyApplicationStore, "rhyApplicationStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(hasVisitedMcDucklingTabPref, "hasVisitedMcDucklingTabPref");
        Intrinsics.checkNotNullParameter(hasVisitedMcDucklingTabEligibleRhyPref, "hasVisitedMcDucklingTabEligibleRhyPref");
        Intrinsics.checkNotNullParameter(hasShownRhyMigrationSheetPref, "hasShownRhyMigrationSheetPref");
        Intrinsics.checkNotNullParameter(cmSunsetOptedOutPref, "cmSunsetOptedOutPref");
        Intrinsics.checkNotNullParameter(cmSunsetFullscreenCount, "cmSunsetFullscreenCount");
        this.storeBundle = storeBundle;
        this.creditCardStore = creditCardStore;
        this.experimentsStore = experimentsStore;
        this.matchaBadgeStore = matchaBadgeStore;
        this.rhyApplicationStore = rhyApplicationStore;
        this.rhyAccountStore = rhyAccountStore;
        this.rhyTabStateStore = rhyTabStateStore;
        this.userStore = userStore;
        this.hasVisitedMcDucklingTabPref = hasVisitedMcDucklingTabPref;
        this.hasVisitedMcDucklingTabEligibleRhyPref = hasVisitedMcDucklingTabEligibleRhyPref;
        this.hasShownRhyMigrationSheetPref = hasShownRhyMigrationSheetPref;
        this.cmSunsetOptedOutPref = cmSunsetOptedOutPref;
        this.cmSunsetFullscreenCount = cmSunsetFullscreenCount;
    }

    @Override // javax.inject.Provider
    public McDucklingBadgeStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        CreditCardStore creditCardStore = this.creditCardStore.get();
        Intrinsics.checkNotNullExpressionValue(creditCardStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        MatchaBadgeStore matchaBadgeStore = this.matchaBadgeStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaBadgeStore, "get(...)");
        RhyApplicationStore rhyApplicationStore = this.rhyApplicationStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyApplicationStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        RhyTabStateStore rhyTabStateStore = this.rhyTabStateStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyTabStateStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        BooleanPreference booleanPreference = this.hasVisitedMcDucklingTabPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.hasVisitedMcDucklingTabEligibleRhyPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        BooleanPreference booleanPreference3 = this.hasShownRhyMigrationSheetPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = this.cmSunsetOptedOutPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference4, "get(...)");
        IntPreference intPreference = this.cmSunsetFullscreenCount.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        return companion.newInstance(storeBundle, creditCardStore, experimentsStore, matchaBadgeStore, rhyApplicationStore, rhyAccountStore, rhyTabStateStore, userStore, booleanPreference, booleanPreference2, booleanPreference3, booleanPreference4, intPreference);
    }

    /* compiled from: McDucklingBadgeStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¾\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0007Jp\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0007¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "matchaBadgeStore", "Lcom/robinhood/android/store/matcha/MatchaBadgeStore;", "rhyApplicationStore", "Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyTabStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "hasVisitedMcDucklingTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasVisitedMcDucklingTabEligibleRhyPref", "hasShownRhyMigrationSheetPref", "cmSunsetOptedOutPref", "cmSunsetFullscreenCount", "Lcom/robinhood/prefs/IntPreference;", "newInstance", "Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final McDucklingBadgeStore_Factory create(Provider<StoreBundle> storeBundle, Provider<CreditCardStore> creditCardStore, Provider<ExperimentsStore> experimentsStore, Provider<MatchaBadgeStore> matchaBadgeStore, Provider<RhyApplicationStore> rhyApplicationStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RhyTabStateStore> rhyTabStateStore, Provider<UserStore> userStore, Provider<BooleanPreference> hasVisitedMcDucklingTabPref, Provider<BooleanPreference> hasVisitedMcDucklingTabEligibleRhyPref, Provider<BooleanPreference> hasShownRhyMigrationSheetPref, Provider<BooleanPreference> cmSunsetOptedOutPref, Provider<IntPreference> cmSunsetFullscreenCount) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(matchaBadgeStore, "matchaBadgeStore");
            Intrinsics.checkNotNullParameter(rhyApplicationStore, "rhyApplicationStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(hasVisitedMcDucklingTabPref, "hasVisitedMcDucklingTabPref");
            Intrinsics.checkNotNullParameter(hasVisitedMcDucklingTabEligibleRhyPref, "hasVisitedMcDucklingTabEligibleRhyPref");
            Intrinsics.checkNotNullParameter(hasShownRhyMigrationSheetPref, "hasShownRhyMigrationSheetPref");
            Intrinsics.checkNotNullParameter(cmSunsetOptedOutPref, "cmSunsetOptedOutPref");
            Intrinsics.checkNotNullParameter(cmSunsetFullscreenCount, "cmSunsetFullscreenCount");
            return new McDucklingBadgeStore_Factory(storeBundle, creditCardStore, experimentsStore, matchaBadgeStore, rhyApplicationStore, rhyAccountStore, rhyTabStateStore, userStore, hasVisitedMcDucklingTabPref, hasVisitedMcDucklingTabEligibleRhyPref, hasShownRhyMigrationSheetPref, cmSunsetOptedOutPref, cmSunsetFullscreenCount);
        }

        @JvmStatic
        public final McDucklingBadgeStore newInstance(StoreBundle storeBundle, CreditCardStore creditCardStore, ExperimentsStore experimentsStore, MatchaBadgeStore matchaBadgeStore, RhyApplicationStore rhyApplicationStore, RhyAccountStore rhyAccountStore, RhyTabStateStore rhyTabStateStore, UserStore userStore, BooleanPreference hasVisitedMcDucklingTabPref, BooleanPreference hasVisitedMcDucklingTabEligibleRhyPref, BooleanPreference hasShownRhyMigrationSheetPref, BooleanPreference cmSunsetOptedOutPref, IntPreference cmSunsetFullscreenCount) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(matchaBadgeStore, "matchaBadgeStore");
            Intrinsics.checkNotNullParameter(rhyApplicationStore, "rhyApplicationStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(hasVisitedMcDucklingTabPref, "hasVisitedMcDucklingTabPref");
            Intrinsics.checkNotNullParameter(hasVisitedMcDucklingTabEligibleRhyPref, "hasVisitedMcDucklingTabEligibleRhyPref");
            Intrinsics.checkNotNullParameter(hasShownRhyMigrationSheetPref, "hasShownRhyMigrationSheetPref");
            Intrinsics.checkNotNullParameter(cmSunsetOptedOutPref, "cmSunsetOptedOutPref");
            Intrinsics.checkNotNullParameter(cmSunsetFullscreenCount, "cmSunsetFullscreenCount");
            return new McDucklingBadgeStore(storeBundle, creditCardStore, experimentsStore, matchaBadgeStore, rhyApplicationStore, rhyAccountStore, rhyTabStateStore, userStore, hasVisitedMcDucklingTabPref, hasVisitedMcDucklingTabEligibleRhyPref, hasShownRhyMigrationSheetPref, cmSunsetOptedOutPref, cmSunsetFullscreenCount);
        }
    }
}
