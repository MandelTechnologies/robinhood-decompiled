package com.robinhood.android.crypto.p094ui.detail.cards;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.cortex.store.asset.AssetDigestStore;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoDetailIacHeroCardInvalidator;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.data.store.iac.IacHeroCardStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailCardDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "breakingNewsStore", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "iacHeroCardStore", "Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;", "iacHeroCardInvalidator", "Lcom/robinhood/librobinhood/data/store/CryptoDetailIacHeroCardInvalidator;", "assetDigestStore", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;", "shownAdvancedAlertCdpCardCountPref", "Lcom/robinhood/prefs/IntPreference;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoDetailCardDuxo_Factory implements Factory<CryptoDetailCardDuxo> {
    private final Provider<AssetDigestStore> assetDigestStore;
    private final Provider<BreakingNewsStore> breakingNewsStore;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CurrencyPairStore> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EducationLessonsStore> educationLessonsStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<CryptoDetailIacHeroCardInvalidator> iacHeroCardInvalidator;
    private final Provider<IacHeroCardStore> iacHeroCardStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<IntPreference> shownAdvancedAlertCdpCardCountPref;
    private final Provider<CryptoDetailCardDuxo6> stateProvider;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoDetailCardDuxo_Factory create(Provider<ExperimentsStore> provider, Provider<CryptoAccountProvider> provider2, Provider<CryptoExperimentsStore> provider3, Provider<CurrencyPairStore> provider4, Provider<UnifiedAccountStore> provider5, Provider<EducationLessonsStore> provider6, Provider<BreakingNewsStore> provider7, Provider<IacHeroCardStore> provider8, Provider<CryptoDetailIacHeroCardInvalidator> provider9, Provider<AssetDigestStore> provider10, Provider<IntPreference> provider11, Provider<CryptoDetailCardDuxo6> provider12, Provider<DuxoBundle> provider13, Provider<SavedStateHandle> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final CryptoDetailCardDuxo newInstance(ExperimentsStore experimentsStore, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CurrencyPairStore currencyPairStore, UnifiedAccountStore unifiedAccountStore, EducationLessonsStore educationLessonsStore, BreakingNewsStore breakingNewsStore, IacHeroCardStore iacHeroCardStore, CryptoDetailIacHeroCardInvalidator cryptoDetailIacHeroCardInvalidator, AssetDigestStore assetDigestStore, IntPreference intPreference, CryptoDetailCardDuxo6 cryptoDetailCardDuxo6, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(experimentsStore, cryptoAccountProvider, cryptoExperimentsStore, currencyPairStore, unifiedAccountStore, educationLessonsStore, breakingNewsStore, iacHeroCardStore, cryptoDetailIacHeroCardInvalidator, assetDigestStore, intPreference, cryptoDetailCardDuxo6, duxoBundle, savedStateHandle);
    }

    public CryptoDetailCardDuxo_Factory(Provider<ExperimentsStore> experimentsStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CurrencyPairStore> currencyPairStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<EducationLessonsStore> educationLessonsStore, Provider<BreakingNewsStore> breakingNewsStore, Provider<IacHeroCardStore> iacHeroCardStore, Provider<CryptoDetailIacHeroCardInvalidator> iacHeroCardInvalidator, Provider<AssetDigestStore> assetDigestStore, Provider<IntPreference> shownAdvancedAlertCdpCardCountPref, Provider<CryptoDetailCardDuxo6> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
        Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
        Intrinsics.checkNotNullParameter(iacHeroCardStore, "iacHeroCardStore");
        Intrinsics.checkNotNullParameter(iacHeroCardInvalidator, "iacHeroCardInvalidator");
        Intrinsics.checkNotNullParameter(assetDigestStore, "assetDigestStore");
        Intrinsics.checkNotNullParameter(shownAdvancedAlertCdpCardCountPref, "shownAdvancedAlertCdpCardCountPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.experimentsStore = experimentsStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.currencyPairStore = currencyPairStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.educationLessonsStore = educationLessonsStore;
        this.breakingNewsStore = breakingNewsStore;
        this.iacHeroCardStore = iacHeroCardStore;
        this.iacHeroCardInvalidator = iacHeroCardInvalidator;
        this.assetDigestStore = assetDigestStore;
        this.shownAdvancedAlertCdpCardCountPref = shownAdvancedAlertCdpCardCountPref;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CryptoDetailCardDuxo get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CurrencyPairStore currencyPairStore = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairStore, "get(...)");
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        EducationLessonsStore educationLessonsStore = this.educationLessonsStore.get();
        Intrinsics.checkNotNullExpressionValue(educationLessonsStore, "get(...)");
        BreakingNewsStore breakingNewsStore = this.breakingNewsStore.get();
        Intrinsics.checkNotNullExpressionValue(breakingNewsStore, "get(...)");
        IacHeroCardStore iacHeroCardStore = this.iacHeroCardStore.get();
        Intrinsics.checkNotNullExpressionValue(iacHeroCardStore, "get(...)");
        CryptoDetailIacHeroCardInvalidator cryptoDetailIacHeroCardInvalidator = this.iacHeroCardInvalidator.get();
        Intrinsics.checkNotNullExpressionValue(cryptoDetailIacHeroCardInvalidator, "get(...)");
        AssetDigestStore assetDigestStore = this.assetDigestStore.get();
        Intrinsics.checkNotNullExpressionValue(assetDigestStore, "get(...)");
        IntPreference intPreference = this.shownAdvancedAlertCdpCardCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        CryptoDetailCardDuxo6 cryptoDetailCardDuxo6 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoDetailCardDuxo6, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(experimentsStore, cryptoAccountProvider, cryptoExperimentsStore, currencyPairStore, unifiedAccountStore, educationLessonsStore, breakingNewsStore, iacHeroCardStore, cryptoDetailIacHeroCardInvalidator, assetDigestStore, intPreference, cryptoDetailCardDuxo6, duxoBundle, savedStateHandle);
    }

    /* compiled from: CryptoDetailCardDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007Jx\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo_Factory;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "breakingNewsStore", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "iacHeroCardStore", "Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;", "iacHeroCardInvalidator", "Lcom/robinhood/librobinhood/data/store/CryptoDetailIacHeroCardInvalidator;", "assetDigestStore", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;", "shownAdvancedAlertCdpCardCountPref", "Lcom/robinhood/prefs/IntPreference;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoDetailCardDuxo_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CurrencyPairStore> currencyPairStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<EducationLessonsStore> educationLessonsStore, Provider<BreakingNewsStore> breakingNewsStore, Provider<IacHeroCardStore> iacHeroCardStore, Provider<CryptoDetailIacHeroCardInvalidator> iacHeroCardInvalidator, Provider<AssetDigestStore> assetDigestStore, Provider<IntPreference> shownAdvancedAlertCdpCardCountPref, Provider<CryptoDetailCardDuxo6> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
            Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
            Intrinsics.checkNotNullParameter(iacHeroCardStore, "iacHeroCardStore");
            Intrinsics.checkNotNullParameter(iacHeroCardInvalidator, "iacHeroCardInvalidator");
            Intrinsics.checkNotNullParameter(assetDigestStore, "assetDigestStore");
            Intrinsics.checkNotNullParameter(shownAdvancedAlertCdpCardCountPref, "shownAdvancedAlertCdpCardCountPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoDetailCardDuxo_Factory(experimentsStore, cryptoAccountProvider, cryptoExperimentsStore, currencyPairStore, unifiedAccountStore, educationLessonsStore, breakingNewsStore, iacHeroCardStore, iacHeroCardInvalidator, assetDigestStore, shownAdvancedAlertCdpCardCountPref, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final CryptoDetailCardDuxo newInstance(ExperimentsStore experimentsStore, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CurrencyPairStore currencyPairStore, UnifiedAccountStore unifiedAccountStore, EducationLessonsStore educationLessonsStore, BreakingNewsStore breakingNewsStore, IacHeroCardStore iacHeroCardStore, CryptoDetailIacHeroCardInvalidator iacHeroCardInvalidator, AssetDigestStore assetDigestStore, IntPreference shownAdvancedAlertCdpCardCountPref, CryptoDetailCardDuxo6 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
            Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
            Intrinsics.checkNotNullParameter(iacHeroCardStore, "iacHeroCardStore");
            Intrinsics.checkNotNullParameter(iacHeroCardInvalidator, "iacHeroCardInvalidator");
            Intrinsics.checkNotNullParameter(assetDigestStore, "assetDigestStore");
            Intrinsics.checkNotNullParameter(shownAdvancedAlertCdpCardCountPref, "shownAdvancedAlertCdpCardCountPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoDetailCardDuxo(experimentsStore, cryptoAccountProvider, cryptoExperimentsStore, currencyPairStore, unifiedAccountStore, educationLessonsStore, breakingNewsStore, iacHeroCardStore, iacHeroCardInvalidator, assetDigestStore, shownAdvancedAlertCdpCardCountPref, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
