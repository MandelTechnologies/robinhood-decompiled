package com.robinhood.android.feature.account.onboarding.accounttype;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.account.store.onboarding.AccountOnboardingStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;

/* compiled from: AccountTypeSelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDuxo;", "accountOnboardingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AccountTypeSelectionDuxo_Factory implements Factory<AccountTypeSelectionDuxo> {
    private final Provider<AccountOnboardingStore> accountOnboardingStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountTypeSelectionDuxo_Factory create(Provider<AccountOnboardingStore> provider, Provider<SavedStateHandle> provider2, Provider<MicrogramComponent.Factory> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final AccountTypeSelectionDuxo newInstance(AccountOnboardingStore accountOnboardingStore, SavedStateHandle savedStateHandle, MicrogramComponent.Factory factory, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountOnboardingStore, savedStateHandle, factory, duxoBundle);
    }

    public AccountTypeSelectionDuxo_Factory(Provider<AccountOnboardingStore> accountOnboardingStore, Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountOnboardingStore, "accountOnboardingStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountOnboardingStore = accountOnboardingStore;
        this.savedStateHandle = savedStateHandle;
        this.microgramComponentFactory = microgramComponentFactory;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AccountTypeSelectionDuxo get() {
        Companion companion = INSTANCE;
        AccountOnboardingStore accountOnboardingStore = this.accountOnboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(accountOnboardingStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountOnboardingStore, savedStateHandle, factory, duxoBundle);
    }

    /* compiled from: AccountTypeSelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDuxo_Factory;", "accountOnboardingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDuxo;", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountTypeSelectionDuxo_Factory create(Provider<AccountOnboardingStore> accountOnboardingStore, Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountOnboardingStore, "accountOnboardingStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountTypeSelectionDuxo_Factory(accountOnboardingStore, savedStateHandle, microgramComponentFactory, duxoBundle);
        }

        @JvmStatic
        public final AccountTypeSelectionDuxo newInstance(AccountOnboardingStore accountOnboardingStore, SavedStateHandle savedStateHandle, MicrogramComponent.Factory microgramComponentFactory, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountOnboardingStore, "accountOnboardingStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountTypeSelectionDuxo(accountOnboardingStore, savedStateHandle, microgramComponentFactory, duxoBundle);
        }
    }
}
