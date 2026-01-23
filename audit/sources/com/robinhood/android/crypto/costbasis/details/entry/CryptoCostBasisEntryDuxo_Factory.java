package com.robinhood.android.crypto.costbasis.details.entry;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisEntryDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo;", "cryptoCostBasisStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "resources", "Landroid/content/res/Resources;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoCostBasisEntryDuxo_Factory implements Factory<CryptoCostBasisEntryDuxo> {
    private final Provider<CryptoCostBasisStore> cryptoCostBasisStore;
    private final Provider<CurrencyPairV2Store> currencyPairV2Store;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<Resources> resources;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoCostBasisEntryStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoCostBasisEntryDuxo_Factory create(Provider<CryptoCostBasisStore> provider, Provider<CurrencyPairV2Store> provider2, Provider<Resources> provider3, Provider<SavedStateHandle> provider4, Provider<DuxoBundle> provider5, Provider<CryptoCostBasisEntryStateProvider> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final CryptoCostBasisEntryDuxo newInstance(CryptoCostBasisStore cryptoCostBasisStore, CurrencyPairV2Store currencyPairV2Store, Resources resources, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoCostBasisEntryStateProvider cryptoCostBasisEntryStateProvider) {
        return INSTANCE.newInstance(cryptoCostBasisStore, currencyPairV2Store, resources, savedStateHandle, duxoBundle, cryptoCostBasisEntryStateProvider);
    }

    public CryptoCostBasisEntryDuxo_Factory(Provider<CryptoCostBasisStore> cryptoCostBasisStore, Provider<CurrencyPairV2Store> currencyPairV2Store, Provider<Resources> resources, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<CryptoCostBasisEntryStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(cryptoCostBasisStore, "cryptoCostBasisStore");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoCostBasisStore = cryptoCostBasisStore;
        this.currencyPairV2Store = currencyPairV2Store;
        this.resources = resources;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoCostBasisEntryDuxo get() {
        Companion companion = INSTANCE;
        CryptoCostBasisStore cryptoCostBasisStore = this.cryptoCostBasisStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCostBasisStore, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairV2Store.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoCostBasisEntryStateProvider cryptoCostBasisEntryStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCostBasisEntryStateProvider, "get(...)");
        return companion.newInstance(cryptoCostBasisStore, currencyPairV2Store, resources, savedStateHandle, duxoBundle, cryptoCostBasisEntryStateProvider);
    }

    /* compiled from: CryptoCostBasisEntryDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo_Factory;", "cryptoCostBasisStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "resources", "Landroid/content/res/Resources;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryStateProvider;", "newInstance", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo;", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoCostBasisEntryDuxo_Factory create(Provider<CryptoCostBasisStore> cryptoCostBasisStore, Provider<CurrencyPairV2Store> currencyPairV2Store, Provider<Resources> resources, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<CryptoCostBasisEntryStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoCostBasisStore, "cryptoCostBasisStore");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoCostBasisEntryDuxo_Factory(cryptoCostBasisStore, currencyPairV2Store, resources, savedStateHandle, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final CryptoCostBasisEntryDuxo newInstance(CryptoCostBasisStore cryptoCostBasisStore, CurrencyPairV2Store currencyPairV2Store, Resources resources, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoCostBasisEntryStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoCostBasisStore, "cryptoCostBasisStore");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoCostBasisEntryDuxo(cryptoCostBasisStore, currencyPairV2Store, resources, savedStateHandle, duxoBundle, stateProvider);
        }
    }
}
