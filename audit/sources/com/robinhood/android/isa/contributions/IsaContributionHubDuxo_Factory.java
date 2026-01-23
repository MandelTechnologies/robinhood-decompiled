package com.robinhood.android.isa.contributions;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.store.isa.IsaContributionStore;
import com.robinhood.store.isa.IsaPromotionStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaContributionHubDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionHubDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/isa/contributions/IsaContributionHubDuxo;", "contributionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/isa/IsaContributionStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "promotionStore", "Lcom/robinhood/store/isa/IsaPromotionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/isa/contributions/IsaContributionHubStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaContributionHubDuxo_Factory implements Factory<IsaContributionHubDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<IsaContributionStore> contributionStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<IsaPromotionStore> promotionStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<IsaContributionHubDuxo3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final IsaContributionHubDuxo_Factory create(Provider<IsaContributionStore> provider, Provider<AccountProvider> provider2, Provider<IsaPromotionStore> provider3, Provider<SavedStateHandle> provider4, Provider<IsaContributionHubDuxo3> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final IsaContributionHubDuxo newInstance(IsaContributionStore isaContributionStore, AccountProvider accountProvider, IsaPromotionStore isaPromotionStore, SavedStateHandle savedStateHandle, IsaContributionHubDuxo3 isaContributionHubDuxo3, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(isaContributionStore, accountProvider, isaPromotionStore, savedStateHandle, isaContributionHubDuxo3, duxoBundle);
    }

    public IsaContributionHubDuxo_Factory(Provider<IsaContributionStore> contributionStore, Provider<AccountProvider> accountProvider, Provider<IsaPromotionStore> promotionStore, Provider<SavedStateHandle> savedStateHandle, Provider<IsaContributionHubDuxo3> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(contributionStore, "contributionStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(promotionStore, "promotionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.contributionStore = contributionStore;
        this.accountProvider = accountProvider;
        this.promotionStore = promotionStore;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public IsaContributionHubDuxo get() {
        Companion companion = INSTANCE;
        IsaContributionStore isaContributionStore = this.contributionStore.get();
        Intrinsics.checkNotNullExpressionValue(isaContributionStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        IsaPromotionStore isaPromotionStore = this.promotionStore.get();
        Intrinsics.checkNotNullExpressionValue(isaPromotionStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        IsaContributionHubDuxo3 isaContributionHubDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(isaContributionHubDuxo3, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(isaContributionStore, accountProvider, isaPromotionStore, savedStateHandle, isaContributionHubDuxo3, duxoBundle);
    }

    /* compiled from: IsaContributionHubDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionHubDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/isa/contributions/IsaContributionHubDuxo_Factory;", "contributionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/isa/IsaContributionStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "promotionStore", "Lcom/robinhood/store/isa/IsaPromotionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/isa/contributions/IsaContributionHubStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/isa/contributions/IsaContributionHubDuxo;", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IsaContributionHubDuxo_Factory create(Provider<IsaContributionStore> contributionStore, Provider<AccountProvider> accountProvider, Provider<IsaPromotionStore> promotionStore, Provider<SavedStateHandle> savedStateHandle, Provider<IsaContributionHubDuxo3> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(contributionStore, "contributionStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(promotionStore, "promotionStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new IsaContributionHubDuxo_Factory(contributionStore, accountProvider, promotionStore, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final IsaContributionHubDuxo newInstance(IsaContributionStore contributionStore, AccountProvider accountProvider, IsaPromotionStore promotionStore, SavedStateHandle savedStateHandle, IsaContributionHubDuxo3 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(contributionStore, "contributionStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(promotionStore, "promotionStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new IsaContributionHubDuxo(contributionStore, accountProvider, promotionStore, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
