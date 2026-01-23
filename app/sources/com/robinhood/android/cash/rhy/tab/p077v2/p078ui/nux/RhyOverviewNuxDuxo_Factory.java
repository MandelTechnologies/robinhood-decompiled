package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux;

import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RhyReferralAttributionStore;
import com.robinhood.librobinhood.data.store.RhyReferralEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.librobinhood.store.RhyOverviewAccountStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.store.history.HistoryStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOverviewNuxDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0091\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004¢\u0006\u0004\b'\u0010(J\b\u0010)\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDuxo;", "paymentCardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyOverviewAccountStore", "Lcom/robinhood/librobinhood/store/RhyOverviewAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "rhyReferralEligibilityStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "rhyReferralAttributionStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore;", "hasClickedDirectDepositNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownRhyNuxTimestampPref", "Lcom/robinhood/prefs/LongPreference;", "debugAddedCardToGooglePayPref", "hasViewedRefereeOfferPref", "rhyDebugHideNuxPref", "stateProvider", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RhyOverviewNuxDuxo_Factory implements Factory<RhyOverviewNuxDuxo> {
    private final Provider<BooleanPreference> debugAddedCardToGooglePayPref;
    private final Provider<DirectDepositRelationshipStore> directDepositRelationshipStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GooglePayManager> googlePayManager;
    private final Provider<BooleanPreference> hasClickedDirectDepositNuxPref;
    private final Provider<LongPreference> hasShownRhyNuxTimestampPref;
    private final Provider<BooleanPreference> hasViewedRefereeOfferPref;
    private final Provider<HistoryStore> historyStore;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<PaymentCardStore> paymentCardStore;
    private final Provider<PaymentTransferStore> paymentTransferStore;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<BooleanPreference> rhyDebugHideNuxPref;
    private final Provider<RhyOverviewAccountStore> rhyOverviewAccountStore;
    private final Provider<RhyReferralAttributionStore> rhyReferralAttributionStore;
    private final Provider<RhyReferralEligibilityStore> rhyReferralEligibilityStore;
    private final Provider<RhyOverviewNuxStateProvider> stateProvider;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RhyOverviewNuxDuxo_Factory create(Provider<PaymentCardStore> provider, Provider<DirectDepositRelationshipStore> provider2, Provider<GooglePayManager> provider3, Provider<HistoryStore> provider4, Provider<MinervaAccountStore> provider5, Provider<PaymentTransferStore> provider6, Provider<RhyAccountStore> provider7, Provider<RhyOverviewAccountStore> provider8, Provider<ExperimentsStore> provider9, Provider<StaticContentStore> provider10, Provider<RhyReferralEligibilityStore> provider11, Provider<RhyReferralAttributionStore> provider12, Provider<BooleanPreference> provider13, Provider<LongPreference> provider14, Provider<BooleanPreference> provider15, Provider<BooleanPreference> provider16, Provider<BooleanPreference> provider17, Provider<RhyOverviewNuxStateProvider> provider18, Provider<DuxoBundle> provider19) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    @JvmStatic
    public static final RhyOverviewNuxDuxo newInstance(PaymentCardStore paymentCardStore, DirectDepositRelationshipStore directDepositRelationshipStore, GooglePayManager googlePayManager, HistoryStore historyStore, MinervaAccountStore minervaAccountStore, PaymentTransferStore paymentTransferStore, RhyAccountStore rhyAccountStore, RhyOverviewAccountStore rhyOverviewAccountStore, ExperimentsStore experimentsStore, StaticContentStore staticContentStore, RhyReferralEligibilityStore rhyReferralEligibilityStore, RhyReferralAttributionStore rhyReferralAttributionStore, BooleanPreference booleanPreference, LongPreference longPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, BooleanPreference booleanPreference4, RhyOverviewNuxStateProvider rhyOverviewNuxStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(paymentCardStore, directDepositRelationshipStore, googlePayManager, historyStore, minervaAccountStore, paymentTransferStore, rhyAccountStore, rhyOverviewAccountStore, experimentsStore, staticContentStore, rhyReferralEligibilityStore, rhyReferralAttributionStore, booleanPreference, longPreference, booleanPreference2, booleanPreference3, booleanPreference4, rhyOverviewNuxStateProvider, duxoBundle);
    }

    public RhyOverviewNuxDuxo_Factory(Provider<PaymentCardStore> paymentCardStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<GooglePayManager> googlePayManager, Provider<HistoryStore> historyStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<PaymentTransferStore> paymentTransferStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RhyOverviewAccountStore> rhyOverviewAccountStore, Provider<ExperimentsStore> experimentsStore, Provider<StaticContentStore> staticContentStore, Provider<RhyReferralEligibilityStore> rhyReferralEligibilityStore, Provider<RhyReferralAttributionStore> rhyReferralAttributionStore, Provider<BooleanPreference> hasClickedDirectDepositNuxPref, Provider<LongPreference> hasShownRhyNuxTimestampPref, Provider<BooleanPreference> debugAddedCardToGooglePayPref, Provider<BooleanPreference> hasViewedRefereeOfferPref, Provider<BooleanPreference> rhyDebugHideNuxPref, Provider<RhyOverviewNuxStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rhyOverviewAccountStore, "rhyOverviewAccountStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
        Intrinsics.checkNotNullParameter(rhyReferralAttributionStore, "rhyReferralAttributionStore");
        Intrinsics.checkNotNullParameter(hasClickedDirectDepositNuxPref, "hasClickedDirectDepositNuxPref");
        Intrinsics.checkNotNullParameter(hasShownRhyNuxTimestampPref, "hasShownRhyNuxTimestampPref");
        Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
        Intrinsics.checkNotNullParameter(hasViewedRefereeOfferPref, "hasViewedRefereeOfferPref");
        Intrinsics.checkNotNullParameter(rhyDebugHideNuxPref, "rhyDebugHideNuxPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.paymentCardStore = paymentCardStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.googlePayManager = googlePayManager;
        this.historyStore = historyStore;
        this.minervaAccountStore = minervaAccountStore;
        this.paymentTransferStore = paymentTransferStore;
        this.rhyAccountStore = rhyAccountStore;
        this.rhyOverviewAccountStore = rhyOverviewAccountStore;
        this.experimentsStore = experimentsStore;
        this.staticContentStore = staticContentStore;
        this.rhyReferralEligibilityStore = rhyReferralEligibilityStore;
        this.rhyReferralAttributionStore = rhyReferralAttributionStore;
        this.hasClickedDirectDepositNuxPref = hasClickedDirectDepositNuxPref;
        this.hasShownRhyNuxTimestampPref = hasShownRhyNuxTimestampPref;
        this.debugAddedCardToGooglePayPref = debugAddedCardToGooglePayPref;
        this.hasViewedRefereeOfferPref = hasViewedRefereeOfferPref;
        this.rhyDebugHideNuxPref = rhyDebugHideNuxPref;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public RhyOverviewNuxDuxo get() {
        Companion companion = INSTANCE;
        PaymentCardStore paymentCardStore = this.paymentCardStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentCardStore, "get(...)");
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositRelationshipStore, "get(...)");
        GooglePayManager googlePayManager = this.googlePayManager.get();
        Intrinsics.checkNotNullExpressionValue(googlePayManager, "get(...)");
        HistoryStore historyStore = this.historyStore.get();
        Intrinsics.checkNotNullExpressionValue(historyStore, "get(...)");
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        PaymentTransferStore paymentTransferStore = this.paymentTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentTransferStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        RhyOverviewAccountStore rhyOverviewAccountStore = this.rhyOverviewAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyOverviewAccountStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        RhyReferralEligibilityStore rhyReferralEligibilityStore = this.rhyReferralEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyReferralEligibilityStore, "get(...)");
        RhyReferralAttributionStore rhyReferralAttributionStore = this.rhyReferralAttributionStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyReferralAttributionStore, "get(...)");
        BooleanPreference booleanPreference = this.hasClickedDirectDepositNuxPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        LongPreference longPreference = this.hasShownRhyNuxTimestampPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        LongPreference longPreference2 = longPreference;
        BooleanPreference booleanPreference2 = this.debugAddedCardToGooglePayPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        BooleanPreference booleanPreference3 = booleanPreference2;
        BooleanPreference booleanPreference4 = this.hasViewedRefereeOfferPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference4, "get(...)");
        BooleanPreference booleanPreference5 = booleanPreference4;
        BooleanPreference booleanPreference6 = this.rhyDebugHideNuxPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference6, "get(...)");
        BooleanPreference booleanPreference7 = booleanPreference6;
        RhyOverviewNuxStateProvider rhyOverviewNuxStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(rhyOverviewNuxStateProvider, "get(...)");
        RhyOverviewNuxStateProvider rhyOverviewNuxStateProvider2 = rhyOverviewNuxStateProvider;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(paymentCardStore, directDepositRelationshipStore, googlePayManager, historyStore, minervaAccountStore, paymentTransferStore, rhyAccountStore, rhyOverviewAccountStore, experimentsStore, staticContentStore, rhyReferralEligibilityStore, rhyReferralAttributionStore, booleanPreference, longPreference2, booleanPreference3, booleanPreference5, booleanPreference7, rhyOverviewNuxStateProvider2, duxoBundle);
    }

    /* compiled from: RhyOverviewNuxDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0092\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0007H\u0007J \u0001\u0010*\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDuxo_Factory;", "paymentCardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyOverviewAccountStore", "Lcom/robinhood/librobinhood/store/RhyOverviewAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "rhyReferralEligibilityStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "rhyReferralAttributionStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore;", "hasClickedDirectDepositNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownRhyNuxTimestampPref", "Lcom/robinhood/prefs/LongPreference;", "debugAddedCardToGooglePayPref", "hasViewedRefereeOfferPref", "rhyDebugHideNuxPref", "stateProvider", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDuxo;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyOverviewNuxDuxo_Factory create(Provider<PaymentCardStore> paymentCardStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<GooglePayManager> googlePayManager, Provider<HistoryStore> historyStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<PaymentTransferStore> paymentTransferStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RhyOverviewAccountStore> rhyOverviewAccountStore, Provider<ExperimentsStore> experimentsStore, Provider<StaticContentStore> staticContentStore, Provider<RhyReferralEligibilityStore> rhyReferralEligibilityStore, Provider<RhyReferralAttributionStore> rhyReferralAttributionStore, Provider<BooleanPreference> hasClickedDirectDepositNuxPref, Provider<LongPreference> hasShownRhyNuxTimestampPref, Provider<BooleanPreference> debugAddedCardToGooglePayPref, Provider<BooleanPreference> hasViewedRefereeOfferPref, Provider<BooleanPreference> rhyDebugHideNuxPref, Provider<RhyOverviewNuxStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(rhyOverviewAccountStore, "rhyOverviewAccountStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
            Intrinsics.checkNotNullParameter(rhyReferralAttributionStore, "rhyReferralAttributionStore");
            Intrinsics.checkNotNullParameter(hasClickedDirectDepositNuxPref, "hasClickedDirectDepositNuxPref");
            Intrinsics.checkNotNullParameter(hasShownRhyNuxTimestampPref, "hasShownRhyNuxTimestampPref");
            Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
            Intrinsics.checkNotNullParameter(hasViewedRefereeOfferPref, "hasViewedRefereeOfferPref");
            Intrinsics.checkNotNullParameter(rhyDebugHideNuxPref, "rhyDebugHideNuxPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RhyOverviewNuxDuxo_Factory(paymentCardStore, directDepositRelationshipStore, googlePayManager, historyStore, minervaAccountStore, paymentTransferStore, rhyAccountStore, rhyOverviewAccountStore, experimentsStore, staticContentStore, rhyReferralEligibilityStore, rhyReferralAttributionStore, hasClickedDirectDepositNuxPref, hasShownRhyNuxTimestampPref, debugAddedCardToGooglePayPref, hasViewedRefereeOfferPref, rhyDebugHideNuxPref, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final RhyOverviewNuxDuxo newInstance(PaymentCardStore paymentCardStore, DirectDepositRelationshipStore directDepositRelationshipStore, GooglePayManager googlePayManager, HistoryStore historyStore, MinervaAccountStore minervaAccountStore, PaymentTransferStore paymentTransferStore, RhyAccountStore rhyAccountStore, RhyOverviewAccountStore rhyOverviewAccountStore, ExperimentsStore experimentsStore, StaticContentStore staticContentStore, RhyReferralEligibilityStore rhyReferralEligibilityStore, RhyReferralAttributionStore rhyReferralAttributionStore, BooleanPreference hasClickedDirectDepositNuxPref, LongPreference hasShownRhyNuxTimestampPref, BooleanPreference debugAddedCardToGooglePayPref, BooleanPreference hasViewedRefereeOfferPref, BooleanPreference rhyDebugHideNuxPref, RhyOverviewNuxStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(rhyOverviewAccountStore, "rhyOverviewAccountStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
            Intrinsics.checkNotNullParameter(rhyReferralAttributionStore, "rhyReferralAttributionStore");
            Intrinsics.checkNotNullParameter(hasClickedDirectDepositNuxPref, "hasClickedDirectDepositNuxPref");
            Intrinsics.checkNotNullParameter(hasShownRhyNuxTimestampPref, "hasShownRhyNuxTimestampPref");
            Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
            Intrinsics.checkNotNullParameter(hasViewedRefereeOfferPref, "hasViewedRefereeOfferPref");
            Intrinsics.checkNotNullParameter(rhyDebugHideNuxPref, "rhyDebugHideNuxPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RhyOverviewNuxDuxo(paymentCardStore, directDepositRelationshipStore, googlePayManager, historyStore, minervaAccountStore, paymentTransferStore, rhyAccountStore, rhyOverviewAccountStore, experimentsStore, staticContentStore, rhyReferralEligibilityStore, rhyReferralAttributionStore, hasClickedDirectDepositNuxPref, hasShownRhyNuxTimestampPref, debugAddedCardToGooglePayPref, hasViewedRefereeOfferPref, rhyDebugHideNuxPref, stateProvider, duxoBundle);
        }
    }
}
