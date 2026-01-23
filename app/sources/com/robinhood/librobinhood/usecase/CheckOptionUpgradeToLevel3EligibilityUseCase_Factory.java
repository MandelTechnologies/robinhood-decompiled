package com.robinhood.librobinhood.usecase;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionOnboardingStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckOptionUpgradeToLevel3EligibilityUseCase_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionOnboardingStore", "Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CheckOptionUpgradeToLevel3EligibilityUseCase_Factory implements Factory<CheckOptionUpgradeToLevel3EligibilityUseCase> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<OptionOnboardingStore> optionOnboardingStore;
    private final Provider<OptionOrderStore> optionOrderStore;

    @JvmStatic
    public static final CheckOptionUpgradeToLevel3EligibilityUseCase_Factory create(Provider<AccountProvider> provider, Provider<ExperimentsStore> provider2, Provider<OptionOnboardingStore> provider3, Provider<OptionOrderStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CheckOptionUpgradeToLevel3EligibilityUseCase newInstance(AccountProvider accountProvider, ExperimentsStore experimentsStore, OptionOnboardingStore optionOnboardingStore, OptionOrderStore optionOrderStore) {
        return INSTANCE.newInstance(accountProvider, experimentsStore, optionOnboardingStore, optionOrderStore);
    }

    public CheckOptionUpgradeToLevel3EligibilityUseCase_Factory(Provider<AccountProvider> accountProvider, Provider<ExperimentsStore> experimentsStore, Provider<OptionOnboardingStore> optionOnboardingStore, Provider<OptionOrderStore> optionOrderStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionOnboardingStore, "optionOnboardingStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
        this.optionOnboardingStore = optionOnboardingStore;
        this.optionOrderStore = optionOrderStore;
    }

    @Override // javax.inject.Provider
    public CheckOptionUpgradeToLevel3EligibilityUseCase get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        OptionOnboardingStore optionOnboardingStore = this.optionOnboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOnboardingStore, "get(...)");
        OptionOrderStore optionOrderStore = this.optionOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStore, "get(...)");
        return companion.newInstance(accountProvider, experimentsStore, optionOnboardingStore, optionOrderStore);
    }

    /* compiled from: CheckOptionUpgradeToLevel3EligibilityUseCase_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionOnboardingStore", "Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "newInstance", "Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CheckOptionUpgradeToLevel3EligibilityUseCase_Factory create(Provider<AccountProvider> accountProvider, Provider<ExperimentsStore> experimentsStore, Provider<OptionOnboardingStore> optionOnboardingStore, Provider<OptionOrderStore> optionOrderStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionOnboardingStore, "optionOnboardingStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            return new CheckOptionUpgradeToLevel3EligibilityUseCase_Factory(accountProvider, experimentsStore, optionOnboardingStore, optionOrderStore);
        }

        @JvmStatic
        public final CheckOptionUpgradeToLevel3EligibilityUseCase newInstance(AccountProvider accountProvider, ExperimentsStore experimentsStore, OptionOnboardingStore optionOnboardingStore, OptionOrderStore optionOrderStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionOnboardingStore, "optionOnboardingStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            return new CheckOptionUpgradeToLevel3EligibilityUseCase(accountProvider, experimentsStore, optionOnboardingStore, optionOrderStore);
        }
    }
}
