package com.robinhood.android.crypto.authorize.wallet;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.BffCryptoTradingStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthorizeWalletDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "bffCryptoTradingStore", "Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-authorize-wallet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AuthorizeWalletDuxo_Factory implements Factory<AuthorizeWalletDuxo> {
    private final Provider<BffCryptoTradingStore> bffCryptoTradingStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AuthorizeWalletDuxo_Factory create(Provider<DuxoBundle> provider, Provider<SavedStateHandle> provider2, Provider<MarginSubscriptionStore> provider3, Provider<BffCryptoTradingStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final AuthorizeWalletDuxo newInstance(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, MarginSubscriptionStore marginSubscriptionStore, BffCryptoTradingStore bffCryptoTradingStore) {
        return INSTANCE.newInstance(duxoBundle, savedStateHandle, marginSubscriptionStore, bffCryptoTradingStore);
    }

    public AuthorizeWalletDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<BffCryptoTradingStore> bffCryptoTradingStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.bffCryptoTradingStore = bffCryptoTradingStore;
    }

    @Override // javax.inject.Provider
    public AuthorizeWalletDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        BffCryptoTradingStore bffCryptoTradingStore = this.bffCryptoTradingStore.get();
        Intrinsics.checkNotNullExpressionValue(bffCryptoTradingStore, "get(...)");
        return companion.newInstance(duxoBundle, savedStateHandle, marginSubscriptionStore, bffCryptoTradingStore);
    }

    /* compiled from: AuthorizeWalletDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "bffCryptoTradingStore", "Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;", "newInstance", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletDuxo;", "feature-authorize-wallet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AuthorizeWalletDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<BffCryptoTradingStore> bffCryptoTradingStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
            return new AuthorizeWalletDuxo_Factory(duxoBundle, savedStateHandle, marginSubscriptionStore, bffCryptoTradingStore);
        }

        @JvmStatic
        public final AuthorizeWalletDuxo newInstance(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, MarginSubscriptionStore marginSubscriptionStore, BffCryptoTradingStore bffCryptoTradingStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
            return new AuthorizeWalletDuxo(duxoBundle, savedStateHandle, marginSubscriptionStore, bffCryptoTradingStore);
        }
    }
}
