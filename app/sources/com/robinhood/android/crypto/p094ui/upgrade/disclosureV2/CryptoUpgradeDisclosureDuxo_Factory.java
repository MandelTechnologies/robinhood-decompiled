package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2;

import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoAgreementsStore;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.librobinhood.data.store.CryptoUpgradeStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDisclosureDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDuxo;", "cryptoAgreementsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAgreementsStore;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "cryptoUpgradeStore", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoUpgradeDisclosureDuxo_Factory implements Factory<CryptoUpgradeDisclosureDuxo> {
    private final Provider<AgreementsStore> agreementsStore;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoAgreementsStore> cryptoAgreementsStore;
    private final Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore;
    private final Provider<CryptoUpgradeStore> cryptoUpgradeStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoUpgradeDisclosureStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoUpgradeDisclosureDuxo_Factory create(Provider<CryptoAgreementsStore> provider, Provider<AgreementsStore> provider2, Provider<CryptoUpgradeStore> provider3, Provider<CryptoResidencyDocumentStore> provider4, Provider<CryptoAccountStore> provider5, Provider<DuxoBundle> provider6, Provider<CryptoUpgradeDisclosureStateProvider> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final CryptoUpgradeDisclosureDuxo newInstance(CryptoAgreementsStore cryptoAgreementsStore, AgreementsStore agreementsStore, CryptoUpgradeStore cryptoUpgradeStore, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, CryptoAccountStore cryptoAccountStore, DuxoBundle duxoBundle, CryptoUpgradeDisclosureStateProvider cryptoUpgradeDisclosureStateProvider) {
        return INSTANCE.newInstance(cryptoAgreementsStore, agreementsStore, cryptoUpgradeStore, cryptoResidencyDocumentStore, cryptoAccountStore, duxoBundle, cryptoUpgradeDisclosureStateProvider);
    }

    public CryptoUpgradeDisclosureDuxo_Factory(Provider<CryptoAgreementsStore> cryptoAgreementsStore, Provider<AgreementsStore> agreementsStore, Provider<CryptoUpgradeStore> cryptoUpgradeStore, Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<DuxoBundle> duxoBundle, Provider<CryptoUpgradeDisclosureStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(cryptoAgreementsStore, "cryptoAgreementsStore");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
        Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoAgreementsStore = cryptoAgreementsStore;
        this.agreementsStore = agreementsStore;
        this.cryptoUpgradeStore = cryptoUpgradeStore;
        this.cryptoResidencyDocumentStore = cryptoResidencyDocumentStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoUpgradeDisclosureDuxo get() {
        Companion companion = INSTANCE;
        CryptoAgreementsStore cryptoAgreementsStore = this.cryptoAgreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAgreementsStore, "get(...)");
        AgreementsStore agreementsStore = this.agreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(agreementsStore, "get(...)");
        CryptoUpgradeStore cryptoUpgradeStore = this.cryptoUpgradeStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoUpgradeStore, "get(...)");
        CryptoResidencyDocumentStore cryptoResidencyDocumentStore = this.cryptoResidencyDocumentStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoResidencyDocumentStore, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoUpgradeDisclosureStateProvider cryptoUpgradeDisclosureStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoUpgradeDisclosureStateProvider, "get(...)");
        return companion.newInstance(cryptoAgreementsStore, agreementsStore, cryptoUpgradeStore, cryptoResidencyDocumentStore, cryptoAccountStore, duxoBundle, cryptoUpgradeDisclosureStateProvider);
    }

    /* compiled from: CryptoUpgradeDisclosureDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDuxo_Factory;", "cryptoAgreementsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAgreementsStore;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "cryptoUpgradeStore", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureStateProvider;", "newInstance", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoUpgradeDisclosureDuxo_Factory create(Provider<CryptoAgreementsStore> cryptoAgreementsStore, Provider<AgreementsStore> agreementsStore, Provider<CryptoUpgradeStore> cryptoUpgradeStore, Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<DuxoBundle> duxoBundle, Provider<CryptoUpgradeDisclosureStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoAgreementsStore, "cryptoAgreementsStore");
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
            Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoUpgradeDisclosureDuxo_Factory(cryptoAgreementsStore, agreementsStore, cryptoUpgradeStore, cryptoResidencyDocumentStore, cryptoAccountStore, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final CryptoUpgradeDisclosureDuxo newInstance(CryptoAgreementsStore cryptoAgreementsStore, AgreementsStore agreementsStore, CryptoUpgradeStore cryptoUpgradeStore, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, CryptoAccountStore cryptoAccountStore, DuxoBundle duxoBundle, CryptoUpgradeDisclosureStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoAgreementsStore, "cryptoAgreementsStore");
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
            Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoUpgradeDisclosureDuxo(cryptoAgreementsStore, agreementsStore, cryptoUpgradeStore, cryptoResidencyDocumentStore, cryptoAccountStore, duxoBundle, stateProvider);
        }
    }
}
