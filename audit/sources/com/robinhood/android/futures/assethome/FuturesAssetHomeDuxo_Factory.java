package com.robinhood.android.futures.assethome;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.futures.FuturesAccountStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;

/* compiled from: FuturesAssetHomeDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/FuturesAssetHomeDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeDuxo;", "futuresAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/FuturesAccountStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "futuresAssetHomeEducationTourFinishedPref", "Lcom/robinhood/prefs/BooleanPreference;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FuturesAssetHomeDuxo_Factory implements Factory<FuturesAssetHomeDuxo> {
    private final Provider<AccountSelectorHomeManager> accountSelectorHomeManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<BooleanPreference> futuresAssetHomeEducationTourFinishedPref;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<PositionsV2Store> positionsV2Store;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<FuturesAssetHomeStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FuturesAssetHomeDuxo_Factory create(Provider<FuturesAccountStore> provider, Provider<PositionsV2Store> provider2, Provider<MicrogramComponent.Factory> provider3, Provider<BooleanPreference> provider4, Provider<AccountSelectorHomeManager> provider5, Provider<DuxoBundle> provider6, Provider<FuturesAssetHomeStateProvider> provider7, Provider<SavedStateHandle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final FuturesAssetHomeDuxo newInstance(FuturesAccountStore futuresAccountStore, PositionsV2Store positionsV2Store, MicrogramComponent.Factory factory, BooleanPreference booleanPreference, AccountSelectorHomeManager accountSelectorHomeManager, DuxoBundle duxoBundle, FuturesAssetHomeStateProvider futuresAssetHomeStateProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(futuresAccountStore, positionsV2Store, factory, booleanPreference, accountSelectorHomeManager, duxoBundle, futuresAssetHomeStateProvider, savedStateHandle);
    }

    public FuturesAssetHomeDuxo_Factory(Provider<FuturesAccountStore> futuresAccountStore, Provider<PositionsV2Store> positionsV2Store, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<BooleanPreference> futuresAssetHomeEducationTourFinishedPref, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<DuxoBundle> duxoBundle, Provider<FuturesAssetHomeStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(futuresAssetHomeEducationTourFinishedPref, "futuresAssetHomeEducationTourFinishedPref");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.futuresAccountStore = futuresAccountStore;
        this.positionsV2Store = positionsV2Store;
        this.microgramComponentFactory = microgramComponentFactory;
        this.futuresAssetHomeEducationTourFinishedPref = futuresAssetHomeEducationTourFinishedPref;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public FuturesAssetHomeDuxo get() {
        Companion companion = INSTANCE;
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        PositionsV2Store positionsV2Store = this.positionsV2Store.get();
        Intrinsics.checkNotNullExpressionValue(positionsV2Store, "get(...)");
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        BooleanPreference booleanPreference = this.futuresAssetHomeEducationTourFinishedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManager.get();
        Intrinsics.checkNotNullExpressionValue(accountSelectorHomeManager, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        FuturesAssetHomeStateProvider futuresAssetHomeStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(futuresAssetHomeStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(futuresAccountStore, positionsV2Store, factory, booleanPreference, accountSelectorHomeManager, duxoBundle, futuresAssetHomeStateProvider, savedStateHandle);
    }

    /* compiled from: FuturesAssetHomeDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/FuturesAssetHomeDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeDuxo_Factory;", "futuresAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/FuturesAccountStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "futuresAssetHomeEducationTourFinishedPref", "Lcom/robinhood/prefs/BooleanPreference;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeDuxo;", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesAssetHomeDuxo_Factory create(Provider<FuturesAccountStore> futuresAccountStore, Provider<PositionsV2Store> positionsV2Store, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<BooleanPreference> futuresAssetHomeEducationTourFinishedPref, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<DuxoBundle> duxoBundle, Provider<FuturesAssetHomeStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(futuresAssetHomeEducationTourFinishedPref, "futuresAssetHomeEducationTourFinishedPref");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new FuturesAssetHomeDuxo_Factory(futuresAccountStore, positionsV2Store, microgramComponentFactory, futuresAssetHomeEducationTourFinishedPref, accountSelectorHomeManager, duxoBundle, stateProvider, savedStateHandle);
        }

        @JvmStatic
        public final FuturesAssetHomeDuxo newInstance(FuturesAccountStore futuresAccountStore, PositionsV2Store positionsV2Store, MicrogramComponent.Factory microgramComponentFactory, BooleanPreference futuresAssetHomeEducationTourFinishedPref, AccountSelectorHomeManager accountSelectorHomeManager, DuxoBundle duxoBundle, FuturesAssetHomeStateProvider stateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(futuresAssetHomeEducationTourFinishedPref, "futuresAssetHomeEducationTourFinishedPref");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new FuturesAssetHomeDuxo(futuresAccountStore, positionsV2Store, microgramComponentFactory, futuresAssetHomeEducationTourFinishedPref, accountSelectorHomeManager, duxoBundle, stateProvider, savedStateHandle);
        }
    }
}
