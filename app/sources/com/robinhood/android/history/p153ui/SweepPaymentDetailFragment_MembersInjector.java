package com.robinhood.android.history.p153ui;

import com.robinhood.android.account.AccountDisplayNameStore;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.SweepStore;
import com.robinhood.store.base.BackupWithholdingStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepPaymentDetailFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/history/ui/SweepPaymentDetailFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/SweepPaymentDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "sweepStore", "Lcom/robinhood/librobinhood/data/store/SweepStore;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SweepPaymentDetailFragment_MembersInjector implements MembersInjector<SweepPaymentDetailFragment> {
    private final Provider<AccountDisplayNameStore> accountDisplayNameStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BackupWithholdingStore> backupWithholdingStore;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SweepStore> sweepStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SweepPaymentDetailFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AccountProvider> provider2, Provider<SweepStore> provider3, Provider<BackupWithholdingStore> provider4, Provider<AccountDisplayNameStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAccountDisplayNameStore(SweepPaymentDetailFragment sweepPaymentDetailFragment, AccountDisplayNameStore accountDisplayNameStore) {
        INSTANCE.injectAccountDisplayNameStore(sweepPaymentDetailFragment, accountDisplayNameStore);
    }

    @JvmStatic
    public static final void injectAccountProvider(SweepPaymentDetailFragment sweepPaymentDetailFragment, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(sweepPaymentDetailFragment, accountProvider);
    }

    @JvmStatic
    public static final void injectBackupWithholdingStore(SweepPaymentDetailFragment sweepPaymentDetailFragment, BackupWithholdingStore backupWithholdingStore) {
        INSTANCE.injectBackupWithholdingStore(sweepPaymentDetailFragment, backupWithholdingStore);
    }

    @JvmStatic
    public static final void injectSweepStore(SweepPaymentDetailFragment sweepPaymentDetailFragment, SweepStore sweepStore) {
        INSTANCE.injectSweepStore(sweepPaymentDetailFragment, sweepStore);
    }

    public SweepPaymentDetailFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AccountProvider> accountProvider, Provider<SweepStore> sweepStore, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<AccountDisplayNameStore> accountDisplayNameStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(sweepStore, "sweepStore");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(accountDisplayNameStore, "accountDisplayNameStore");
        this.singletons = singletons;
        this.accountProvider = accountProvider;
        this.sweepStore = sweepStore;
        this.backupWithholdingStore = backupWithholdingStore;
        this.accountDisplayNameStore = accountDisplayNameStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SweepPaymentDetailFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion2.injectAccountProvider(instance, accountProvider);
        SweepStore sweepStore = this.sweepStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepStore, "get(...)");
        companion2.injectSweepStore(instance, sweepStore);
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore.get();
        Intrinsics.checkNotNullExpressionValue(backupWithholdingStore, "get(...)");
        companion2.injectBackupWithholdingStore(instance, backupWithholdingStore);
        AccountDisplayNameStore accountDisplayNameStore = this.accountDisplayNameStore.get();
        Intrinsics.checkNotNullExpressionValue(accountDisplayNameStore, "get(...)");
        companion2.injectAccountDisplayNameStore(instance, accountDisplayNameStore);
    }

    /* compiled from: SweepPaymentDetailFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/history/ui/SweepPaymentDetailFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/SweepPaymentDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "sweepStore", "Lcom/robinhood/librobinhood/data/store/SweepStore;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "injectAccountProvider", "", "instance", "injectSweepStore", "injectBackupWithholdingStore", "injectAccountDisplayNameStore", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SweepPaymentDetailFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AccountProvider> accountProvider, Provider<SweepStore> sweepStore, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<AccountDisplayNameStore> accountDisplayNameStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(sweepStore, "sweepStore");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(accountDisplayNameStore, "accountDisplayNameStore");
            return new SweepPaymentDetailFragment_MembersInjector(singletons, accountProvider, sweepStore, backupWithholdingStore, accountDisplayNameStore);
        }

        @JvmStatic
        public final void injectAccountProvider(SweepPaymentDetailFragment instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectSweepStore(SweepPaymentDetailFragment instance, SweepStore sweepStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(sweepStore, "sweepStore");
            instance.setSweepStore(sweepStore);
        }

        @JvmStatic
        public final void injectBackupWithholdingStore(SweepPaymentDetailFragment instance, BackupWithholdingStore backupWithholdingStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            instance.setBackupWithholdingStore(backupWithholdingStore);
        }

        @JvmStatic
        public final void injectAccountDisplayNameStore(SweepPaymentDetailFragment instance, AccountDisplayNameStore accountDisplayNameStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountDisplayNameStore, "accountDisplayNameStore");
            instance.setAccountDisplayNameStore(accountDisplayNameStore);
        }
    }
}
