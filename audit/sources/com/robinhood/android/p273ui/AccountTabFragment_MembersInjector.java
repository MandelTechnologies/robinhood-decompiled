package com.robinhood.android.p273ui;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.PackagePreloader;

/* compiled from: AccountTabFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/ui/AccountTabFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/ui/AccountTabFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "packagePreloader", "Lmicrogram/android/PackagePreloader;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AccountTabFragment_MembersInjector implements MembersInjector<AccountTabFragment> {
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<PackagePreloader> packagePreloader;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<AccountTabFragment> create(Provider<BaseFragmentSingletons> provider, Provider<ExperimentsStore> provider2, Provider<PackagePreloader> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectExperimentsStore(AccountTabFragment accountTabFragment, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(accountTabFragment, experimentsStore);
    }

    @JvmStatic
    public static final void injectPackagePreloader(AccountTabFragment accountTabFragment, PackagePreloader packagePreloader) {
        INSTANCE.injectPackagePreloader(accountTabFragment, packagePreloader);
    }

    public AccountTabFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<ExperimentsStore> experimentsStore, Provider<PackagePreloader> packagePreloader) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(packagePreloader, "packagePreloader");
        this.singletons = singletons;
        this.experimentsStore = experimentsStore;
        this.packagePreloader = packagePreloader;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AccountTabFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        PackagePreloader packagePreloader = this.packagePreloader.get();
        Intrinsics.checkNotNullExpressionValue(packagePreloader, "get(...)");
        companion2.injectPackagePreloader(instance, packagePreloader);
    }

    /* compiled from: AccountTabFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/ui/AccountTabFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/ui/AccountTabFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "packagePreloader", "Lmicrogram/android/PackagePreloader;", "injectExperimentsStore", "", "instance", "injectPackagePreloader", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<AccountTabFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<ExperimentsStore> experimentsStore, Provider<PackagePreloader> packagePreloader) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(packagePreloader, "packagePreloader");
            return new AccountTabFragment_MembersInjector(singletons, experimentsStore, packagePreloader);
        }

        @JvmStatic
        public final void injectExperimentsStore(AccountTabFragment instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectPackagePreloader(AccountTabFragment instance, PackagePreloader packagePreloader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(packagePreloader, "packagePreloader");
            instance.setPackagePreloader(packagePreloader);
        }
    }
}
