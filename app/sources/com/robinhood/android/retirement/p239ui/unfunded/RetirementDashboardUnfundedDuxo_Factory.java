package com.robinhood.android.retirement.p239ui.unfunded;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementDashboardUnfundedDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDuxo;", "inboxBadgeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "matchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "retirementNuxStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RetirementDashboardUnfundedDuxo_Factory implements Factory<RetirementDashboardUnfundedDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<IacInfoBannerStore> iacInfoBannerStore;
    private final Provider<InboxBadgeStore> inboxBadgeStore;
    private final Provider<RetirementMatchStore> matchStore;
    private final Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore;
    private final Provider<RetirementNuxStore> retirementNuxStore;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RetirementDashboardUnfundedDuxo_Factory create(Provider<InboxBadgeStore> provider, Provider<RetirementMatchStore> provider2, Provider<RetirementAccountSwitcherStore> provider3, Provider<RetirementNuxStore> provider4, Provider<IacInfoBannerStore> provider5, Provider<DuxoBundle> provider6, Provider<SavedStateHandle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final RetirementDashboardUnfundedDuxo newInstance(InboxBadgeStore inboxBadgeStore, RetirementMatchStore retirementMatchStore, RetirementAccountSwitcherStore retirementAccountSwitcherStore, RetirementNuxStore retirementNuxStore, IacInfoBannerStore iacInfoBannerStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(inboxBadgeStore, retirementMatchStore, retirementAccountSwitcherStore, retirementNuxStore, iacInfoBannerStore, duxoBundle, savedStateHandle);
    }

    public RetirementDashboardUnfundedDuxo_Factory(Provider<InboxBadgeStore> inboxBadgeStore, Provider<RetirementMatchStore> matchStore, Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore, Provider<RetirementNuxStore> retirementNuxStore, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
        Intrinsics.checkNotNullParameter(matchStore, "matchStore");
        Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(retirementNuxStore, "retirementNuxStore");
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.inboxBadgeStore = inboxBadgeStore;
        this.matchStore = matchStore;
        this.retirementAccountSwitcherStore = retirementAccountSwitcherStore;
        this.retirementNuxStore = retirementNuxStore;
        this.iacInfoBannerStore = iacInfoBannerStore;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public RetirementDashboardUnfundedDuxo get() {
        Companion companion = INSTANCE;
        InboxBadgeStore inboxBadgeStore = this.inboxBadgeStore.get();
        Intrinsics.checkNotNullExpressionValue(inboxBadgeStore, "get(...)");
        RetirementMatchStore retirementMatchStore = this.matchStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementMatchStore, "get(...)");
        RetirementAccountSwitcherStore retirementAccountSwitcherStore = this.retirementAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementAccountSwitcherStore, "get(...)");
        RetirementNuxStore retirementNuxStore = this.retirementNuxStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementNuxStore, "get(...)");
        IacInfoBannerStore iacInfoBannerStore = this.iacInfoBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(iacInfoBannerStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(inboxBadgeStore, retirementMatchStore, retirementAccountSwitcherStore, retirementNuxStore, iacInfoBannerStore, duxoBundle, savedStateHandle);
    }

    /* compiled from: RetirementDashboardUnfundedDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDuxo_Factory;", "inboxBadgeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "matchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "retirementNuxStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDuxo;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RetirementDashboardUnfundedDuxo_Factory create(Provider<InboxBadgeStore> inboxBadgeStore, Provider<RetirementMatchStore> matchStore, Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore, Provider<RetirementNuxStore> retirementNuxStore, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            Intrinsics.checkNotNullParameter(matchStore, "matchStore");
            Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(retirementNuxStore, "retirementNuxStore");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RetirementDashboardUnfundedDuxo_Factory(inboxBadgeStore, matchStore, retirementAccountSwitcherStore, retirementNuxStore, iacInfoBannerStore, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final RetirementDashboardUnfundedDuxo newInstance(InboxBadgeStore inboxBadgeStore, RetirementMatchStore matchStore, RetirementAccountSwitcherStore retirementAccountSwitcherStore, RetirementNuxStore retirementNuxStore, IacInfoBannerStore iacInfoBannerStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            Intrinsics.checkNotNullParameter(matchStore, "matchStore");
            Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(retirementNuxStore, "retirementNuxStore");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RetirementDashboardUnfundedDuxo(inboxBadgeStore, matchStore, retirementAccountSwitcherStore, retirementNuxStore, iacInfoBannerStore, duxoBundle, savedStateHandle);
        }
    }
}
