package com.robinhood.android.transfers;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.librobinhood.data.store.DepositScheduleStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBonusStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.PackagePreloader;

/* compiled from: TransfersHubDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0083\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004¢\u0006\u0004\b(\u0010)J\b\u0010*\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/transfers/TransfersHubDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/TransfersHubDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "depositScheduleStore", "Lcom/robinhood/librobinhood/data/store/DepositScheduleStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "acatsBonusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferV2LimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "microgramPackagePreloader", "Lmicrogram/android/PackagePreloader;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TransfersHubDuxo_Factory implements Factory<TransfersHubDuxo> {
    private final Provider<AcatsBonusStore> acatsBonusStore;
    private final Provider<AcatsTransferStore> acatsTransferStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<AutomaticDepositStore> automaticDepositStore;
    private final Provider<DebitCardInstrumentStore> debitCardInstrumentStore;
    private final Provider<DepositScheduleStore> depositScheduleStore;
    private final Provider<DocumentRequestStore> documentRequestStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore;
    private final Provider<HistoryStore> historyStore;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<PackagePreloader> microgramPackagePreloader;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<TransferAccountStore> transferAccountStore;
    private final Provider<TransferV2LimitsStore> transferV2LimitsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final TransfersHubDuxo_Factory create(Provider<AccountProvider> provider, Provider<AchRelationshipStore> provider2, Provider<AutomaticDepositStore> provider3, Provider<DebitCardInstrumentStore> provider4, Provider<ExperimentsStore> provider5, Provider<HistoryStore> provider6, Provider<DepositScheduleStore> provider7, Provider<RhyAccountStore> provider8, Provider<DocumentRequestStore> provider9, Provider<RegionGateProvider> provider10, Provider<AcatsBonusStore> provider11, Provider<AcatsTransferStore> provider12, Provider<GoldDepositBoostMaxAwarenessStore> provider13, Provider<MicrogramManager> provider14, Provider<TransferAccountStore> provider15, Provider<TransferV2LimitsStore> provider16, Provider<PackagePreloader> provider17, Provider<DuxoBundle> provider18) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    @JvmStatic
    public static final TransfersHubDuxo newInstance(AccountProvider accountProvider, AchRelationshipStore achRelationshipStore, AutomaticDepositStore automaticDepositStore, DebitCardInstrumentStore debitCardInstrumentStore, ExperimentsStore experimentsStore, HistoryStore historyStore, DepositScheduleStore depositScheduleStore, RhyAccountStore rhyAccountStore, DocumentRequestStore documentRequestStore, RegionGateProvider regionGateProvider, AcatsBonusStore acatsBonusStore, AcatsTransferStore acatsTransferStore, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, MicrogramManager microgramManager, TransferAccountStore transferAccountStore, TransferV2LimitsStore transferV2LimitsStore, PackagePreloader packagePreloader, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, achRelationshipStore, automaticDepositStore, debitCardInstrumentStore, experimentsStore, historyStore, depositScheduleStore, rhyAccountStore, documentRequestStore, regionGateProvider, acatsBonusStore, acatsTransferStore, goldDepositBoostMaxAwarenessStore, microgramManager, transferAccountStore, transferV2LimitsStore, packagePreloader, duxoBundle);
    }

    public TransfersHubDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AchRelationshipStore> achRelationshipStore, Provider<AutomaticDepositStore> automaticDepositStore, Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<ExperimentsStore> experimentsStore, Provider<HistoryStore> historyStore, Provider<DepositScheduleStore> depositScheduleStore, Provider<RhyAccountStore> rhyAccountStore, Provider<DocumentRequestStore> documentRequestStore, Provider<RegionGateProvider> regionGateProvider, Provider<AcatsBonusStore> acatsBonusStore, Provider<AcatsTransferStore> acatsTransferStore, Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore, Provider<MicrogramManager> microgramManager, Provider<TransferAccountStore> transferAccountStore, Provider<TransferV2LimitsStore> transferV2LimitsStore, Provider<PackagePreloader> microgramPackagePreloader, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(depositScheduleStore, "depositScheduleStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(acatsBonusStore, "acatsBonusStore");
        Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
        Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(transferV2LimitsStore, "transferV2LimitsStore");
        Intrinsics.checkNotNullParameter(microgramPackagePreloader, "microgramPackagePreloader");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.achRelationshipStore = achRelationshipStore;
        this.automaticDepositStore = automaticDepositStore;
        this.debitCardInstrumentStore = debitCardInstrumentStore;
        this.experimentsStore = experimentsStore;
        this.historyStore = historyStore;
        this.depositScheduleStore = depositScheduleStore;
        this.rhyAccountStore = rhyAccountStore;
        this.documentRequestStore = documentRequestStore;
        this.regionGateProvider = regionGateProvider;
        this.acatsBonusStore = acatsBonusStore;
        this.acatsTransferStore = acatsTransferStore;
        this.goldDepositBoostMaxAwarenessStore = goldDepositBoostMaxAwarenessStore;
        this.microgramManager = microgramManager;
        this.transferAccountStore = transferAccountStore;
        this.transferV2LimitsStore = transferV2LimitsStore;
        this.microgramPackagePreloader = microgramPackagePreloader;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public TransfersHubDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        AutomaticDepositStore automaticDepositStore = this.automaticDepositStore.get();
        Intrinsics.checkNotNullExpressionValue(automaticDepositStore, "get(...)");
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(debitCardInstrumentStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        HistoryStore historyStore = this.historyStore.get();
        Intrinsics.checkNotNullExpressionValue(historyStore, "get(...)");
        DepositScheduleStore depositScheduleStore = this.depositScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(depositScheduleStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        DocumentRequestStore documentRequestStore = this.documentRequestStore.get();
        Intrinsics.checkNotNullExpressionValue(documentRequestStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        AcatsBonusStore acatsBonusStore = this.acatsBonusStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsBonusStore, "get(...)");
        AcatsTransferStore acatsTransferStore = this.acatsTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsTransferStore, "get(...)");
        GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore = this.goldDepositBoostMaxAwarenessStore.get();
        Intrinsics.checkNotNullExpressionValue(goldDepositBoostMaxAwarenessStore, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        MicrogramManager microgramManager2 = microgramManager;
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        TransferAccountStore transferAccountStore2 = transferAccountStore;
        TransferV2LimitsStore transferV2LimitsStore = this.transferV2LimitsStore.get();
        Intrinsics.checkNotNullExpressionValue(transferV2LimitsStore, "get(...)");
        TransferV2LimitsStore transferV2LimitsStore2 = transferV2LimitsStore;
        PackagePreloader packagePreloader = this.microgramPackagePreloader.get();
        Intrinsics.checkNotNullExpressionValue(packagePreloader, "get(...)");
        PackagePreloader packagePreloader2 = packagePreloader;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, achRelationshipStore, automaticDepositStore, debitCardInstrumentStore, experimentsStore, historyStore, depositScheduleStore, rhyAccountStore, documentRequestStore, regionGateProvider, acatsBonusStore, acatsTransferStore, goldDepositBoostMaxAwarenessStore, microgramManager2, transferAccountStore2, transferV2LimitsStore2, packagePreloader2, duxoBundle);
    }

    /* compiled from: TransfersHubDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0084\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0007H\u0007J\u0098\u0001\u0010+\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0007¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/transfers/TransfersHubDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/TransfersHubDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "depositScheduleStore", "Lcom/robinhood/librobinhood/data/store/DepositScheduleStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "acatsBonusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferV2LimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "microgramPackagePreloader", "Lmicrogram/android/PackagePreloader;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/transfers/TransfersHubDuxo;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransfersHubDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AchRelationshipStore> achRelationshipStore, Provider<AutomaticDepositStore> automaticDepositStore, Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<ExperimentsStore> experimentsStore, Provider<HistoryStore> historyStore, Provider<DepositScheduleStore> depositScheduleStore, Provider<RhyAccountStore> rhyAccountStore, Provider<DocumentRequestStore> documentRequestStore, Provider<RegionGateProvider> regionGateProvider, Provider<AcatsBonusStore> acatsBonusStore, Provider<AcatsTransferStore> acatsTransferStore, Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore, Provider<MicrogramManager> microgramManager, Provider<TransferAccountStore> transferAccountStore, Provider<TransferV2LimitsStore> transferV2LimitsStore, Provider<PackagePreloader> microgramPackagePreloader, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(depositScheduleStore, "depositScheduleStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(acatsBonusStore, "acatsBonusStore");
            Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
            Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(transferV2LimitsStore, "transferV2LimitsStore");
            Intrinsics.checkNotNullParameter(microgramPackagePreloader, "microgramPackagePreloader");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new TransfersHubDuxo_Factory(accountProvider, achRelationshipStore, automaticDepositStore, debitCardInstrumentStore, experimentsStore, historyStore, depositScheduleStore, rhyAccountStore, documentRequestStore, regionGateProvider, acatsBonusStore, acatsTransferStore, goldDepositBoostMaxAwarenessStore, microgramManager, transferAccountStore, transferV2LimitsStore, microgramPackagePreloader, duxoBundle);
        }

        @JvmStatic
        public final TransfersHubDuxo newInstance(AccountProvider accountProvider, AchRelationshipStore achRelationshipStore, AutomaticDepositStore automaticDepositStore, DebitCardInstrumentStore debitCardInstrumentStore, ExperimentsStore experimentsStore, HistoryStore historyStore, DepositScheduleStore depositScheduleStore, RhyAccountStore rhyAccountStore, DocumentRequestStore documentRequestStore, RegionGateProvider regionGateProvider, AcatsBonusStore acatsBonusStore, AcatsTransferStore acatsTransferStore, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, MicrogramManager microgramManager, TransferAccountStore transferAccountStore, TransferV2LimitsStore transferV2LimitsStore, PackagePreloader microgramPackagePreloader, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(depositScheduleStore, "depositScheduleStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(acatsBonusStore, "acatsBonusStore");
            Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
            Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(transferV2LimitsStore, "transferV2LimitsStore");
            Intrinsics.checkNotNullParameter(microgramPackagePreloader, "microgramPackagePreloader");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new TransfersHubDuxo(accountProvider, achRelationshipStore, automaticDepositStore, debitCardInstrumentStore, experimentsStore, historyStore, depositScheduleStore, rhyAccountStore, documentRequestStore, regionGateProvider, acatsBonusStore, acatsTransferStore, goldDepositBoostMaxAwarenessStore, microgramManager, transferAccountStore, transferV2LimitsStore, microgramPackagePreloader, duxoBundle);
        }
    }
}
