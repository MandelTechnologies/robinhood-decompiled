package com.robinhood.android.rhsconversion;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.librobinhood.data.store.identi.UserAgreementsStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.RhProcessLifecycleOwner;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhsConversionUpdateManager_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionUpdateManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/rhsconversion/RhsConversionUpdateManager;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "userAgreementsStore", "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "isConvertedPref", "Lcom/robinhood/prefs/BooleanPreference;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RhsConversionUpdateManager_Factory implements Factory<RhsConversionUpdateManager> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BooleanPreference> isConvertedPref;
    private final Provider<LockscreenManager> lockscreenManager;
    private final Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    private final Provider<UserAgreementsStore> userAgreementsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RhsConversionUpdateManager_Factory create(Provider<AccountProvider> provider, Provider<UserAgreementsStore> provider2, Provider<BooleanPreference> provider3, Provider<LockscreenManager> provider4, Provider<RhProcessLifecycleOwner> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final RhsConversionUpdateManager newInstance(AccountProvider accountProvider, UserAgreementsStore userAgreementsStore, BooleanPreference booleanPreference, LockscreenManager lockscreenManager, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        return INSTANCE.newInstance(accountProvider, userAgreementsStore, booleanPreference, lockscreenManager, rhProcessLifecycleOwner);
    }

    public RhsConversionUpdateManager_Factory(Provider<AccountProvider> accountProvider, Provider<UserAgreementsStore> userAgreementsStore, Provider<BooleanPreference> isConvertedPref, Provider<LockscreenManager> lockscreenManager, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(userAgreementsStore, "userAgreementsStore");
        Intrinsics.checkNotNullParameter(isConvertedPref, "isConvertedPref");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.accountProvider = accountProvider;
        this.userAgreementsStore = userAgreementsStore;
        this.isConvertedPref = isConvertedPref;
        this.lockscreenManager = lockscreenManager;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
    }

    @Override // javax.inject.Provider
    public RhsConversionUpdateManager get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        UserAgreementsStore userAgreementsStore = this.userAgreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(userAgreementsStore, "get(...)");
        BooleanPreference booleanPreference = this.isConvertedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        LockscreenManager lockscreenManager = this.lockscreenManager.get();
        Intrinsics.checkNotNullExpressionValue(lockscreenManager, "get(...)");
        RhProcessLifecycleOwner rhProcessLifecycleOwner = this.rhProcessLifecycleOwner.get();
        Intrinsics.checkNotNullExpressionValue(rhProcessLifecycleOwner, "get(...)");
        return companion.newInstance(accountProvider, userAgreementsStore, booleanPreference, lockscreenManager, rhProcessLifecycleOwner);
    }

    /* compiled from: RhsConversionUpdateManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionUpdateManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/rhsconversion/RhsConversionUpdateManager_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "userAgreementsStore", "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "isConvertedPref", "Lcom/robinhood/prefs/BooleanPreference;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "newInstance", "Lcom/robinhood/android/rhsconversion/RhsConversionUpdateManager;", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhsConversionUpdateManager_Factory create(Provider<AccountProvider> accountProvider, Provider<UserAgreementsStore> userAgreementsStore, Provider<BooleanPreference> isConvertedPref, Provider<LockscreenManager> lockscreenManager, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(userAgreementsStore, "userAgreementsStore");
            Intrinsics.checkNotNullParameter(isConvertedPref, "isConvertedPref");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            return new RhsConversionUpdateManager_Factory(accountProvider, userAgreementsStore, isConvertedPref, lockscreenManager, rhProcessLifecycleOwner);
        }

        @JvmStatic
        public final RhsConversionUpdateManager newInstance(AccountProvider accountProvider, UserAgreementsStore userAgreementsStore, BooleanPreference isConvertedPref, LockscreenManager lockscreenManager, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(userAgreementsStore, "userAgreementsStore");
            Intrinsics.checkNotNullParameter(isConvertedPref, "isConvertedPref");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            return new RhsConversionUpdateManager(accountProvider, userAgreementsStore, isConvertedPref, lockscreenManager, rhProcessLifecycleOwner);
        }
    }
}
