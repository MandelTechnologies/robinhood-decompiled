package com.robinhood.android.internalassettransfers.validation;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountFeatureParityChecker_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AccountFeatureParityChecker_Factory implements Factory<AccountFeatureParityChecker> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountFeatureParityChecker_Factory create(Provider<AccountProvider> provider, Provider<LeveredMarginSettingsStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final AccountFeatureParityChecker newInstance(AccountProvider accountProvider, LeveredMarginSettingsStore leveredMarginSettingsStore) {
        return INSTANCE.newInstance(accountProvider, leveredMarginSettingsStore);
    }

    public AccountFeatureParityChecker_Factory(Provider<AccountProvider> accountProvider, Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
        this.accountProvider = accountProvider;
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
    }

    @Override // javax.inject.Provider
    public AccountFeatureParityChecker get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.leveredMarginSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(leveredMarginSettingsStore, "get(...)");
        return companion.newInstance(accountProvider, leveredMarginSettingsStore);
    }

    /* compiled from: AccountFeatureParityChecker_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "newInstance", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountFeatureParityChecker_Factory create(Provider<AccountProvider> accountProvider, Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
            return new AccountFeatureParityChecker_Factory(accountProvider, leveredMarginSettingsStore);
        }

        @JvmStatic
        public final AccountFeatureParityChecker newInstance(AccountProvider accountProvider, LeveredMarginSettingsStore leveredMarginSettingsStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
            return new AccountFeatureParityChecker(accountProvider, leveredMarginSettingsStore);
        }
    }
}
