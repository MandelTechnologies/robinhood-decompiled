package com.robinhood.android.margin.p174ui.limit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginLimitActivityDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MarginLimitActivityDuxo_Factory implements Factory<MarginLimitActivityDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MarginInvestingInfoStore> marginInvestingInfoStore;
    private final Provider<LeveredMarginSettingsStore> marginSettingsStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MarginLimitActivityDuxo_Factory create(Provider<AccountProvider> provider, Provider<UserStore> provider2, Provider<MarginInvestingInfoStore> provider3, Provider<LeveredMarginSettingsStore> provider4, Provider<SavedStateHandle> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final MarginLimitActivityDuxo newInstance(AccountProvider accountProvider, UserStore userStore, MarginInvestingInfoStore marginInvestingInfoStore, LeveredMarginSettingsStore leveredMarginSettingsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, userStore, marginInvestingInfoStore, leveredMarginSettingsStore, savedStateHandle, duxoBundle);
    }

    public MarginLimitActivityDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<UserStore> userStore, Provider<MarginInvestingInfoStore> marginInvestingInfoStore, Provider<LeveredMarginSettingsStore> marginSettingsStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.userStore = userStore;
        this.marginInvestingInfoStore = marginInvestingInfoStore;
        this.marginSettingsStore = marginSettingsStore;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public MarginLimitActivityDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        MarginInvestingInfoStore marginInvestingInfoStore = this.marginInvestingInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(marginInvestingInfoStore, "get(...)");
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.marginSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(leveredMarginSettingsStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, userStore, marginInvestingInfoStore, leveredMarginSettingsStore, savedStateHandle, duxoBundle);
    }

    /* compiled from: MarginLimitActivityDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityDuxo;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarginLimitActivityDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<UserStore> userStore, Provider<MarginInvestingInfoStore> marginInvestingInfoStore, Provider<LeveredMarginSettingsStore> marginSettingsStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new MarginLimitActivityDuxo_Factory(accountProvider, userStore, marginInvestingInfoStore, marginSettingsStore, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final MarginLimitActivityDuxo newInstance(AccountProvider accountProvider, UserStore userStore, MarginInvestingInfoStore marginInvestingInfoStore, LeveredMarginSettingsStore marginSettingsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new MarginLimitActivityDuxo(accountProvider, userStore, marginInvestingInfoStore, marginSettingsStore, savedStateHandle, duxoBundle);
        }
    }
}
