package com.robinhood.android.transfers.p271ui.max.i18n;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.lib.p166fx.provider.FxRatesProvider;
import com.robinhood.android.transfers.p271ui.max.i18n.creation.InternationalCreateTransferRequestFactory;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¯\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferStateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "internationalCreateTransferRequestFactory", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;", "defaultUkExternalTransferAccountPref", "Lcom/robinhood/prefs/StringPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InternationalTransferDuxo_Factory implements Factory<InternationalTransferDuxo> {
    private final Provider<BalancesStore> balancesStore;
    private final Provider<StringPreference> defaultUkExternalTransferAccountPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FxRatesProvider> fxRatesProvider;
    private final Provider<InternationalCreateTransferRequestFactory> internationalCreateTransferRequestFactory;
    private final Provider<LazyMoshi> moshi;
    private final Provider<TraderPortfolioStore> portfolioStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<InternationalTransferStateProvider> stateProvider;
    private final Provider<TransferAccountStore> transferAccountStore;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InternationalTransferDuxo_Factory create(Provider<InternationalTransferStateProvider> provider, Provider<UserStore> provider2, Provider<FxRatesProvider> provider3, Provider<BalancesStore> provider4, Provider<TraderPortfolioStore> provider5, Provider<TransfersBonfireApi> provider6, Provider<TransferAccountStore> provider7, Provider<InternationalCreateTransferRequestFactory> provider8, Provider<StringPreference> provider9, Provider<LazyMoshi> provider10, Provider<DuxoBundle> provider11, Provider<SavedStateHandle> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final InternationalTransferDuxo newInstance(InternationalTransferStateProvider internationalTransferStateProvider, UserStore userStore, FxRatesProvider fxRatesProvider, BalancesStore balancesStore, TraderPortfolioStore traderPortfolioStore, TransfersBonfireApi transfersBonfireApi, TransferAccountStore transferAccountStore, InternationalCreateTransferRequestFactory internationalCreateTransferRequestFactory, StringPreference stringPreference, LazyMoshi lazyMoshi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(internationalTransferStateProvider, userStore, fxRatesProvider, balancesStore, traderPortfolioStore, transfersBonfireApi, transferAccountStore, internationalCreateTransferRequestFactory, stringPreference, lazyMoshi, duxoBundle, savedStateHandle);
    }

    public InternationalTransferDuxo_Factory(Provider<InternationalTransferStateProvider> stateProvider, Provider<UserStore> userStore, Provider<FxRatesProvider> fxRatesProvider, Provider<BalancesStore> balancesStore, Provider<TraderPortfolioStore> portfolioStore, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<TransferAccountStore> transferAccountStore, Provider<InternationalCreateTransferRequestFactory> internationalCreateTransferRequestFactory, Provider<StringPreference> defaultUkExternalTransferAccountPref, Provider<LazyMoshi> moshi, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(internationalCreateTransferRequestFactory, "internationalCreateTransferRequestFactory");
        Intrinsics.checkNotNullParameter(defaultUkExternalTransferAccountPref, "defaultUkExternalTransferAccountPref");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.stateProvider = stateProvider;
        this.userStore = userStore;
        this.fxRatesProvider = fxRatesProvider;
        this.balancesStore = balancesStore;
        this.portfolioStore = portfolioStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.transferAccountStore = transferAccountStore;
        this.internationalCreateTransferRequestFactory = internationalCreateTransferRequestFactory;
        this.defaultUkExternalTransferAccountPref = defaultUkExternalTransferAccountPref;
        this.moshi = moshi;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public InternationalTransferDuxo get() {
        Companion companion = INSTANCE;
        InternationalTransferStateProvider internationalTransferStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(internationalTransferStateProvider, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        FxRatesProvider fxRatesProvider = this.fxRatesProvider.get();
        Intrinsics.checkNotNullExpressionValue(fxRatesProvider, "get(...)");
        BalancesStore balancesStore = this.balancesStore.get();
        Intrinsics.checkNotNullExpressionValue(balancesStore, "get(...)");
        TraderPortfolioStore traderPortfolioStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(traderPortfolioStore, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        InternationalCreateTransferRequestFactory internationalCreateTransferRequestFactory = this.internationalCreateTransferRequestFactory.get();
        Intrinsics.checkNotNullExpressionValue(internationalCreateTransferRequestFactory, "get(...)");
        StringPreference stringPreference = this.defaultUkExternalTransferAccountPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(internationalTransferStateProvider, userStore, fxRatesProvider, balancesStore, traderPortfolioStore, transfersBonfireApi, transferAccountStore, internationalCreateTransferRequestFactory, stringPreference, lazyMoshi, duxoBundle, savedStateHandle);
    }

    /* compiled from: InternationalTransferDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J°\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0007Jh\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferStateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "internationalCreateTransferRequestFactory", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;", "defaultUkExternalTransferAccountPref", "Lcom/robinhood/prefs/StringPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InternationalTransferDuxo_Factory create(Provider<InternationalTransferStateProvider> stateProvider, Provider<UserStore> userStore, Provider<FxRatesProvider> fxRatesProvider, Provider<BalancesStore> balancesStore, Provider<TraderPortfolioStore> portfolioStore, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<TransferAccountStore> transferAccountStore, Provider<InternationalCreateTransferRequestFactory> internationalCreateTransferRequestFactory, Provider<StringPreference> defaultUkExternalTransferAccountPref, Provider<LazyMoshi> moshi, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(internationalCreateTransferRequestFactory, "internationalCreateTransferRequestFactory");
            Intrinsics.checkNotNullParameter(defaultUkExternalTransferAccountPref, "defaultUkExternalTransferAccountPref");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new InternationalTransferDuxo_Factory(stateProvider, userStore, fxRatesProvider, balancesStore, portfolioStore, transfersBonfireApi, transferAccountStore, internationalCreateTransferRequestFactory, defaultUkExternalTransferAccountPref, moshi, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final InternationalTransferDuxo newInstance(InternationalTransferStateProvider stateProvider, UserStore userStore, FxRatesProvider fxRatesProvider, BalancesStore balancesStore, TraderPortfolioStore portfolioStore, TransfersBonfireApi transfersBonfireApi, TransferAccountStore transferAccountStore, InternationalCreateTransferRequestFactory internationalCreateTransferRequestFactory, StringPreference defaultUkExternalTransferAccountPref, LazyMoshi moshi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(internationalCreateTransferRequestFactory, "internationalCreateTransferRequestFactory");
            Intrinsics.checkNotNullParameter(defaultUkExternalTransferAccountPref, "defaultUkExternalTransferAccountPref");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new InternationalTransferDuxo(stateProvider, userStore, fxRatesProvider, balancesStore, portfolioStore, transfersBonfireApi, transferAccountStore, internationalCreateTransferRequestFactory, defaultUkExternalTransferAccountPref, moshi, duxoBundle, savedStateHandle);
        }
    }
}
