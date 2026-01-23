package com.robinhood.android.taxcertification;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.odyssey.lib.BaseSdActivitySingletons;
import com.robinhood.android.odyssey.lib.BaseSdActivity_MembersInjector;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.LogoutKillswitch;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxCertificationOdysseyActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxCertificationOdysseyActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/taxcertification/TaxCertificationOdysseyActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "sdSingletons", "Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TaxCertificationOdysseyActivity_MembersInjector implements MembersInjector<TaxCertificationOdysseyActivity> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BackupWithholdingStore> backupWithholdingStore;
    private final Provider<LogoutKillswitch> logoutKillswitch;
    private final Provider<BaseSdActivitySingletons> sdSingletons;
    private final Provider<BaseActivitySingletons> singletons;

    @JvmStatic
    public static final MembersInjector<TaxCertificationOdysseyActivity> create(Provider<BaseActivitySingletons> provider, Provider<BaseSdActivitySingletons> provider2, Provider<AccountProvider> provider3, Provider<BackupWithholdingStore> provider4, Provider<LogoutKillswitch> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAccountProvider(TaxCertificationOdysseyActivity taxCertificationOdysseyActivity, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(taxCertificationOdysseyActivity, accountProvider);
    }

    @JvmStatic
    public static final void injectBackupWithholdingStore(TaxCertificationOdysseyActivity taxCertificationOdysseyActivity, BackupWithholdingStore backupWithholdingStore) {
        INSTANCE.injectBackupWithholdingStore(taxCertificationOdysseyActivity, backupWithholdingStore);
    }

    @JvmStatic
    public static final void injectLogoutKillswitch(TaxCertificationOdysseyActivity taxCertificationOdysseyActivity, LogoutKillswitch logoutKillswitch) {
        INSTANCE.injectLogoutKillswitch(taxCertificationOdysseyActivity, logoutKillswitch);
    }

    public TaxCertificationOdysseyActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<BaseSdActivitySingletons> sdSingletons, Provider<AccountProvider> accountProvider, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<LogoutKillswitch> logoutKillswitch) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(sdSingletons, "sdSingletons");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        this.singletons = singletons;
        this.sdSingletons = sdSingletons;
        this.accountProvider = accountProvider;
        this.backupWithholdingStore = backupWithholdingStore;
        this.logoutKillswitch = logoutKillswitch;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TaxCertificationOdysseyActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        BaseSdActivity_MembersInjector.Companion companion2 = BaseSdActivity_MembersInjector.INSTANCE;
        BaseSdActivitySingletons baseSdActivitySingletons = this.sdSingletons.get();
        Intrinsics.checkNotNullExpressionValue(baseSdActivitySingletons, "get(...)");
        companion2.injectSdSingletons(instance, baseSdActivitySingletons);
        Companion companion3 = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion3.injectAccountProvider(instance, accountProvider);
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore.get();
        Intrinsics.checkNotNullExpressionValue(backupWithholdingStore, "get(...)");
        companion3.injectBackupWithholdingStore(instance, backupWithholdingStore);
        LogoutKillswitch logoutKillswitch = this.logoutKillswitch.get();
        Intrinsics.checkNotNullExpressionValue(logoutKillswitch, "get(...)");
        companion3.injectLogoutKillswitch(instance, logoutKillswitch);
    }

    /* compiled from: TaxCertificationOdysseyActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxCertificationOdysseyActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/taxcertification/TaxCertificationOdysseyActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "sdSingletons", "Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "injectAccountProvider", "", "instance", "injectBackupWithholdingStore", "injectLogoutKillswitch", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<TaxCertificationOdysseyActivity> create(Provider<BaseActivitySingletons> singletons, Provider<BaseSdActivitySingletons> sdSingletons, Provider<AccountProvider> accountProvider, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<LogoutKillswitch> logoutKillswitch) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(sdSingletons, "sdSingletons");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            return new TaxCertificationOdysseyActivity_MembersInjector(singletons, sdSingletons, accountProvider, backupWithholdingStore, logoutKillswitch);
        }

        @JvmStatic
        public final void injectAccountProvider(TaxCertificationOdysseyActivity instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectBackupWithholdingStore(TaxCertificationOdysseyActivity instance, BackupWithholdingStore backupWithholdingStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            instance.setBackupWithholdingStore(backupWithholdingStore);
        }

        @JvmStatic
        public final void injectLogoutKillswitch(TaxCertificationOdysseyActivity instance, LogoutKillswitch logoutKillswitch) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            instance.setLogoutKillswitch(logoutKillswitch);
        }
    }
}
