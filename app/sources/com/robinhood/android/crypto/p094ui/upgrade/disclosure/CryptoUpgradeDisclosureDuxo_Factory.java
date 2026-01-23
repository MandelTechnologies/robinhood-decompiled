package com.robinhood.android.crypto.p094ui.upgrade.disclosure;

import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.librobinhood.data.store.CryptoUpgradeStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDisclosureDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDuxo;", "agreementsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/agreements/AgreementsStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "cryptoUpgradeStore", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoUpgradeDisclosureDuxo_Factory implements Factory<CryptoUpgradeDisclosureDuxo> {
    private final Provider<AgreementsStore> agreementsStore;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore;
    private final Provider<CryptoUpgradeStore> cryptoUpgradeStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoUpgradeDisclosureStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoUpgradeDisclosureDuxo_Factory create(Provider<AgreementsStore> provider, Provider<CryptoAccountStore> provider2, Provider<CryptoResidencyDocumentStore> provider3, Provider<CryptoUpgradeStore> provider4, Provider<DuxoBundle> provider5, Provider<CryptoUpgradeDisclosureStateProvider> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final CryptoUpgradeDisclosureDuxo newInstance(AgreementsStore agreementsStore, CryptoAccountStore cryptoAccountStore, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, CryptoUpgradeStore cryptoUpgradeStore, DuxoBundle duxoBundle, CryptoUpgradeDisclosureStateProvider cryptoUpgradeDisclosureStateProvider) {
        return INSTANCE.newInstance(agreementsStore, cryptoAccountStore, cryptoResidencyDocumentStore, cryptoUpgradeStore, duxoBundle, cryptoUpgradeDisclosureStateProvider);
    }

    public CryptoUpgradeDisclosureDuxo_Factory(Provider<AgreementsStore> agreementsStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore, Provider<CryptoUpgradeStore> cryptoUpgradeStore, Provider<DuxoBundle> duxoBundle, Provider<CryptoUpgradeDisclosureStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
        Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.agreementsStore = agreementsStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoResidencyDocumentStore = cryptoResidencyDocumentStore;
        this.cryptoUpgradeStore = cryptoUpgradeStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoUpgradeDisclosureDuxo get() {
        Companion companion = INSTANCE;
        AgreementsStore agreementsStore = this.agreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(agreementsStore, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        CryptoResidencyDocumentStore cryptoResidencyDocumentStore = this.cryptoResidencyDocumentStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoResidencyDocumentStore, "get(...)");
        CryptoUpgradeStore cryptoUpgradeStore = this.cryptoUpgradeStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoUpgradeStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoUpgradeDisclosureStateProvider cryptoUpgradeDisclosureStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoUpgradeDisclosureStateProvider, "get(...)");
        return companion.newInstance(agreementsStore, cryptoAccountStore, cryptoResidencyDocumentStore, cryptoUpgradeStore, duxoBundle, cryptoUpgradeDisclosureStateProvider);
    }

    /* compiled from: CryptoUpgradeDisclosureDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDuxo_Factory;", "agreementsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/agreements/AgreementsStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "cryptoUpgradeStore", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureStateProvider;", "newInstance", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoUpgradeDisclosureDuxo_Factory create(Provider<AgreementsStore> agreementsStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore, Provider<CryptoUpgradeStore> cryptoUpgradeStore, Provider<DuxoBundle> duxoBundle, Provider<CryptoUpgradeDisclosureStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
            Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoUpgradeDisclosureDuxo_Factory(agreementsStore, cryptoAccountStore, cryptoResidencyDocumentStore, cryptoUpgradeStore, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final CryptoUpgradeDisclosureDuxo newInstance(AgreementsStore agreementsStore, CryptoAccountStore cryptoAccountStore, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, CryptoUpgradeStore cryptoUpgradeStore, DuxoBundle duxoBundle, CryptoUpgradeDisclosureStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
            Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoUpgradeDisclosureDuxo(agreementsStore, cryptoAccountStore, cryptoResidencyDocumentStore, cryptoUpgradeStore, duxoBundle, stateProvider);
        }
    }
}
