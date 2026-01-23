package com.robinhood.android.transfers;

import androidx.paging.PagedList;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.banking.TransferMicrogramAppNames;
import com.robinhood.android.banking.experiments.RecurringExtraCashExperiment;
import com.robinhood.android.banking.microgram.Applications;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.regiongate.AcatsRegionGate;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.transfers.AchRelationshipDocumentVerificationAction;
import com.robinhood.android.transfers.TransfersHubDuxo;
import com.robinhood.android.transfers.transferhub.TransferHubEvent;
import com.robinhood.android.transfers.transferhub.TransferHubManagedServiceImpl;
import com.robinhood.android.transfers.transferhub.TransferHubStateProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
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
import com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.AutomaticDepositWithBankInfo;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.UiDepositSchedule;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.transfers.hub.contracts.TransferHubConfigurationManagedService;
import com.robinhood.transfers.hub.contracts.TransferHubDisplayLogicContainer;
import com.robinhood.transfers.hub.contracts.TransferHubItemClickIdentifier;
import com.robinhood.transfers.hub.contracts.TransferHubManagedService;
import com.robinhood.utils.Either2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.MicrogramLaunchId;
import microgram.android.PackagePreloader;
import microgram.android.RemoteMicrogramApplication;
import p479j$.time.Instant;

/* compiled from: TransfersHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0099\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010)J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020+H\u0002J*\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020+H\u0002J\u000e\u00107\u001a\u00020+2\u0006\u00108\u001a\u000209R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/transfers/TransfersHubDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/TransfersHubViewState;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "depositScheduleStore", "Lcom/robinhood/librobinhood/data/store/DepositScheduleStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "acatsBonusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferV2LimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "microgramPackagePreloader", "Lmicrogram/android/PackagePreloader;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/librobinhood/data/store/DepositScheduleStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;Lmicrogram/android/PackagePreloader;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "refreshData", "useFallbackNonOrderedSubscriptionPattern", "useFallbackNonMicrogramExperience", "acatsRegionGate", "", "rhyAccount", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "retirementTransferUpsellExperiment", "acatsBonusInfo", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;", "finishSubscriptions", "checkDocumentVerification", "documentRequestId", "Ljava/util/UUID;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransfersHubDuxo extends BaseDuxo3<TransfersHubViewState, TransfersHubViewState, TransferHubEvent> {
    public static final int $stable = 8;
    private final AcatsBonusStore acatsBonusStore;
    private final AcatsTransferStore acatsTransferStore;
    private final AccountProvider accountProvider;
    private final AchRelationshipStore achRelationshipStore;
    private final AutomaticDepositStore automaticDepositStore;
    private final DebitCardInstrumentStore debitCardInstrumentStore;
    private final DepositScheduleStore depositScheduleStore;
    private final DocumentRequestStore documentRequestStore;
    private final ExperimentsStore experimentsStore;
    private final GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore;
    private final HistoryStore historyStore;
    private final MicrogramManager microgramManager;
    private final PackagePreloader microgramPackagePreloader;
    private final RegionGateProvider regionGateProvider;
    private final RhyAccountStore rhyAccountStore;
    private final TransferAccountStore transferAccountStore;
    private final TransferV2LimitsStore transferV2LimitsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransfersHubDuxo(AccountProvider accountProvider, AchRelationshipStore achRelationshipStore, AutomaticDepositStore automaticDepositStore, DebitCardInstrumentStore debitCardInstrumentStore, ExperimentsStore experimentsStore, HistoryStore historyStore, DepositScheduleStore depositScheduleStore, RhyAccountStore rhyAccountStore, DocumentRequestStore documentRequestStore, RegionGateProvider regionGateProvider, AcatsBonusStore acatsBonusStore, AcatsTransferStore acatsTransferStore, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, MicrogramManager microgramManager, TransferAccountStore transferAccountStore, TransferV2LimitsStore transferV2LimitsStore, PackagePreloader microgramPackagePreloader, DuxoBundle duxoBundle) {
        super(new TransfersHubViewState(null, null, false, false, false, null, null, false, false, false, null, false, null, false, 16383, null), new TransferHubStateProvider(), duxoBundle);
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
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new C300691(null));
        refreshData();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C300702(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C300713(null), 3, null);
    }

    /* compiled from: TransfersHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/TransfersHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$onCreate$1", m3645f = "TransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.TransfersHubDuxo$onCreate$1 */
    static final class C300691 extends ContinuationImpl7 implements Function2<TransfersHubViewState, Continuation<? super TransfersHubViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C300691(Continuation<? super C300691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C300691 c300691 = new C300691(continuation);
            c300691.L$0 = obj;
            return c300691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransfersHubViewState transfersHubViewState, Continuation<? super TransfersHubViewState> continuation) {
            return ((C300691) create(transfersHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TransfersHubViewState transfersHubViewState = (TransfersHubViewState) this.L$0;
            return transfersHubViewState.copy((16255 & 1) != 0 ? transfersHubViewState.achRelationships : null, (16255 & 2) != 0 ? transfersHubViewState.activeDebitCardInstruments : null, (16255 & 4) != 0 ? transfersHubViewState.hasAutomaticDeposits : false, (16255 & 8) != 0 ? transfersHubViewState.isCashManagementEnabled : false, (16255 & 16) != 0 ? transfersHubViewState.hasRhyAccount : false, (16255 & 32) != 0 ? transfersHubViewState.pendingHistoryItems : null, (16255 & 64) != 0 ? transfersHubViewState.historyItems : null, (16255 & 128) != 0 ? transfersHubViewState.isUserInAutoDepositRecurringHookExperiment : false, (16255 & 256) != 0 ? transfersHubViewState.isInWithdrawableCashInfoExperiment : false, (16255 & 512) != 0 ? transfersHubViewState.isAcatsRegionGateSupported : false, (16255 & 1024) != 0 ? transfersHubViewState.acatsBonusInfo : null, (16255 & 2048) != 0 ? transfersHubViewState.isInRetirementTransferExperiment : false, (16255 & 4096) != 0 ? transfersHubViewState.transferHubMicrogramSource : null, (16255 & 8192) != 0 ? transfersHubViewState.isLoading : true);
        }
    }

    /* compiled from: TransfersHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2", m3645f = "TransfersHubDuxo.kt", m3646l = {103}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2 */
    static final class C300702 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C300702(Continuation<? super C300702> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransfersHubDuxo.this.new C300702(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C300702) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long millis = TimeUnit.SECONDS.toMillis(30L);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(TransfersHubDuxo.this, null);
                    this.label = 1;
                    if (Timeout6.withTimeout(millis, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception unused) {
                TransfersHubDuxo.this.useFallbackNonOrderedSubscriptionPattern();
            }
            return Unit.INSTANCE;
        }

        /* compiled from: TransfersHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2$1", m3645f = "TransfersHubDuxo.kt", m3646l = {105, 106, 110, 112, 113, 114, 117, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            boolean Z$0;
            boolean Z$1;
            boolean Z$2;
            int label;
            final /* synthetic */ TransfersHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TransfersHubDuxo transfersHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = transfersHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x017e  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x01af  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x01eb  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x021e A[PHI: r2 r4 r8 r9 r10 r11 r12
              0x021e: PHI (r2v19 boolean) = (r2v17 boolean), (r2v21 boolean) binds: [B:39:0x021a, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]
              0x021e: PHI (r4v3 java.lang.Object) = (r4v2 java.lang.Object), (r4v7 java.lang.Object) binds: [B:39:0x021a, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]
              0x021e: PHI (r8v24 boolean) = (r8v22 boolean), (r8v27 boolean) binds: [B:39:0x021a, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]
              0x021e: PHI (r9v23 boolean) = (r9v21 boolean), (r9v27 boolean) binds: [B:39:0x021a, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]
              0x021e: PHI (r10v21 com.robinhood.models.db.bonfire.RhyAccount) = (r10v18 com.robinhood.models.db.bonfire.RhyAccount), (r10v24 com.robinhood.models.db.bonfire.RhyAccount) binds: [B:39:0x021a, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]
              0x021e: PHI (r11v22 kotlinx.coroutines.CoroutineScope) = (r11v19 kotlinx.coroutines.CoroutineScope), (r11v25 kotlinx.coroutines.CoroutineScope) binds: [B:39:0x021a, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]
              0x021e: PHI (r12v14 com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo) = 
              (r12v12 com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo)
              (r12v15 com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo)
             binds: [B:39:0x021a, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0251  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x026c  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x02f3 A[Catch: Exception -> 0x02ec, TryCatch #0 {Exception -> 0x02ec, blocks: (B:53:0x027f, B:55:0x02e0, B:72:0x0316, B:61:0x02f3, B:62:0x02f8, B:64:0x02fe, B:66:0x030a, B:68:0x030e), top: B:83:0x027f }] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x02fe A[Catch: Exception -> 0x02ec, TryCatch #0 {Exception -> 0x02ec, blocks: (B:53:0x027f, B:55:0x02e0, B:72:0x0316, B:61:0x02f3, B:62:0x02f8, B:64:0x02fe, B:66:0x030a, B:68:0x030e), top: B:83:0x027f }] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0314  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0315  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0336  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x027b A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CoroutineScope coroutineScope;
                Object objFirst;
                Object objFirst2;
                CoroutineScope coroutineScope2;
                boolean z;
                Object objFirst3;
                boolean z2;
                RhyAccount rhyAccount;
                CoroutineScope coroutineScope3;
                Object objFirst4;
                RhyAccount rhyAccount2;
                boolean z3;
                CoroutineScope coroutineScope4;
                Object objFirst5;
                boolean z4;
                boolean z5;
                CoroutineScope coroutineScope5;
                RhyAccount rhyAccount3;
                boolean z6;
                ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo;
                Object objFirst6;
                Object objFirst7;
                boolean z7;
                boolean z8;
                boolean z9;
                List list;
                CoroutineScope coroutineScope6;
                RhyAccount rhyAccount4;
                ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo2;
                boolean zBooleanValue;
                Iterator it;
                Object next;
                TransferAccount transferAccount;
                Exception exc;
                boolean z10;
                ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo3;
                RhyAccount rhyAccount5;
                TransferHubConfigurationManagedService transferHubConfigurationManagedService;
                TransferHubManagedService transferHubManagedService;
                List list2;
                Iterator it2;
                int i;
                TransferHubDisplayLogicContainer transferHubDisplayLogicContainer;
                TransferHubManagedService transferHubManagedService2;
                RhyAccount rhyAccount6;
                boolean z11;
                TransferAccount transferAccount2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        coroutineScope = (CoroutineScope) this.L$0;
                        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.this$0.regionGateProvider, AcatsRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null);
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        objFirst = FlowKt.first(flowBuffer$default, this);
                        if (objFirst != coroutine_suspended) {
                            boolean zBooleanValue2 = ((Boolean) objFirst).booleanValue();
                            Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(this.this$0.rhyAccountStore.streamSpendingAccount()), Integer.MAX_VALUE, null, 2, null);
                            this.L$0 = coroutineScope;
                            this.Z$0 = zBooleanValue2;
                            this.label = 2;
                            objFirst2 = FlowKt.first(flowBuffer$default2, this);
                            if (objFirst2 != coroutine_suspended) {
                                coroutineScope2 = coroutineScope;
                                z = zBooleanValue2;
                                RhyAccount rhyAccount7 = (RhyAccount) ((Optional) objFirst2).getOrNull();
                                Flow flowBuffer$default3 = Context7.buffer$default(RxConvert.asFlow(ObservablesKt.connectWhen$default(ObservablesKt.connectWhen$default(ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{TransferHubExperiment.INSTANCE}, false, null, 6, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.this$0.regionGateProvider, RetirementRegionGate.INSTANCE, false, 2, null), null, 2, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.this$0.regionGateProvider, GoldRegionGate.INSTANCE, false, 2, null), null, 2, null)), Integer.MAX_VALUE, null, 2, null);
                                this.L$0 = coroutineScope2;
                                this.L$1 = rhyAccount7;
                                this.Z$0 = z;
                                this.label = 3;
                                objFirst3 = FlowKt.first(flowBuffer$default3, this);
                                if (objFirst3 != coroutine_suspended) {
                                    CoroutineScope coroutineScope7 = coroutineScope2;
                                    z2 = z;
                                    rhyAccount = rhyAccount7;
                                    coroutineScope3 = coroutineScope7;
                                    boolean zBooleanValue3 = ((Boolean) objFirst3).booleanValue();
                                    Flow flowBuffer$default4 = Context7.buffer$default(RxConvert.asFlow(this.this$0.goldDepositBoostMaxAwarenessStore.streamGoldDepositBoostMaxAwareness()), Integer.MAX_VALUE, null, 2, null);
                                    this.L$0 = coroutineScope3;
                                    this.L$1 = rhyAccount;
                                    this.Z$0 = z2;
                                    this.Z$1 = zBooleanValue3;
                                    this.label = 4;
                                    objFirst4 = FlowKt.first(flowBuffer$default4, this);
                                    if (objFirst4 != coroutine_suspended) {
                                        CoroutineScope coroutineScope8 = coroutineScope3;
                                        rhyAccount2 = rhyAccount;
                                        z3 = zBooleanValue3;
                                        coroutineScope4 = coroutineScope8;
                                        boolean zBooleanValue4 = ((Boolean) objFirst4).booleanValue();
                                        Observable<ApiAcatsBonusPromoInfo> observable = this.this$0.acatsBonusStore.getBonusInfo().toObservable();
                                        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
                                        Flow flowBuffer$default5 = Context7.buffer$default(RxConvert.asFlow(observable), Integer.MAX_VALUE, null, 2, null);
                                        this.L$0 = coroutineScope4;
                                        this.L$1 = rhyAccount2;
                                        this.Z$0 = z2;
                                        this.Z$1 = z3;
                                        this.Z$2 = zBooleanValue4;
                                        this.label = 5;
                                        objFirst5 = FlowKt.first(flowBuffer$default5, this);
                                        if (objFirst5 != coroutine_suspended) {
                                            boolean z12 = z2;
                                            z4 = z3;
                                            z5 = zBooleanValue4;
                                            coroutineScope5 = coroutineScope4;
                                            rhyAccount3 = rhyAccount2;
                                            z6 = z12;
                                            apiAcatsBonusPromoInfo = (ApiAcatsBonusPromoInfo) objFirst5;
                                            Flow flowBuffer$default6 = Context7.buffer$default(RxConvert.asFlow(this.this$0.transferAccountStore.fetchIfStaleThenStream()), Integer.MAX_VALUE, null, 2, null);
                                            this.L$0 = coroutineScope5;
                                            this.L$1 = rhyAccount3;
                                            this.L$2 = apiAcatsBonusPromoInfo;
                                            this.Z$0 = z6;
                                            this.Z$1 = z4;
                                            this.Z$2 = z5;
                                            this.label = 6;
                                            objFirst6 = FlowKt.first(flowBuffer$default6, this);
                                            if (objFirst6 != coroutine_suspended) {
                                                List list3 = (List) objFirst6;
                                                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{RecurringExtraCashExperiment.INSTANCE}, false, null, 6, null);
                                                this.L$0 = coroutineScope5;
                                                this.L$1 = rhyAccount3;
                                                this.L$2 = apiAcatsBonusPromoInfo;
                                                this.L$3 = list3;
                                                this.Z$0 = z6;
                                                this.Z$1 = z4;
                                                this.Z$2 = z5;
                                                this.label = 7;
                                                objFirst7 = FlowKt.first(flowStreamStateFlow$default, this);
                                                if (objFirst7 != coroutine_suspended) {
                                                    z7 = z5;
                                                    z8 = z4;
                                                    z9 = z6;
                                                    list = list3;
                                                    coroutineScope6 = coroutineScope5;
                                                    rhyAccount4 = rhyAccount3;
                                                    apiAcatsBonusPromoInfo2 = apiAcatsBonusPromoInfo;
                                                    zBooleanValue = ((Boolean) objFirst7).booleanValue();
                                                    it = list.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            next = null;
                                                        } else {
                                                            next = it.next();
                                                            if (((TransferAccount) next).isRhs()) {
                                                            }
                                                        }
                                                    }
                                                    transferAccount = (TransferAccount) next;
                                                    try {
                                                        transferHubConfigurationManagedService = (TransferHubConfigurationManagedService) MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.this$0.microgramManager, coroutineScope6, new MicrogramLaunchId(Applications.getTransferHubRedesignApplication(), null, 2, null), null, 4, null).getComponent().getServiceLocator().getClient(TransferHubConfigurationManagedService.class);
                                                        transferHubManagedService = (TransferHubManagedService) MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.this$0.microgramManager, coroutineScope6, new MicrogramLaunchId(Applications.getTransferHubRedesignApplication(), null, 2, null), null, 4, null).getComponent().getServiceLocator().getHostImplementation(TransferHubManagedService.class);
                                                        list2 = list;
                                                        if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                                            it2 = list2.iterator();
                                                            i = 0;
                                                            while (it2.hasNext()) {
                                                                if (!((TransferAccount) it2.next()).isExternal() && (i = i + 1) < 0) {
                                                                    CollectionsKt.throwCountOverflow();
                                                                }
                                                            }
                                                        } else {
                                                            i = 0;
                                                        }
                                                        boolean z13 = true;
                                                        if (i > 1) {
                                                            z13 = false;
                                                        }
                                                        transferHubDisplayLogicContainer = new TransferHubDisplayLogicContainer(z9, z8, z7, z13);
                                                        this.L$0 = rhyAccount4;
                                                        this.L$1 = apiAcatsBonusPromoInfo2;
                                                        this.L$2 = transferAccount;
                                                        this.L$3 = transferHubConfigurationManagedService;
                                                        this.L$4 = transferHubManagedService;
                                                        this.Z$0 = z9;
                                                        this.Z$1 = z8;
                                                        this.Z$2 = zBooleanValue;
                                                        this.label = 8;
                                                    } catch (Exception e) {
                                                        exc = e;
                                                        z10 = z9;
                                                        apiAcatsBonusPromoInfo3 = apiAcatsBonusPromoInfo2;
                                                        rhyAccount5 = rhyAccount4;
                                                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 4, null);
                                                        TransfersHubDuxo transfersHubDuxo = this.this$0;
                                                        Intrinsics.checkNotNull(apiAcatsBonusPromoInfo3);
                                                        transfersHubDuxo.useFallbackNonMicrogramExperience(z10, rhyAccount5, z8, apiAcatsBonusPromoInfo3);
                                                        return Unit.INSTANCE;
                                                    }
                                                    if (transferHubManagedService.setDataForDisplayLogic(transferHubDisplayLogicContainer, this) != coroutine_suspended) {
                                                        transferHubManagedService2 = transferHubManagedService;
                                                        z10 = z9;
                                                        apiAcatsBonusPromoInfo3 = apiAcatsBonusPromoInfo2;
                                                        rhyAccount6 = rhyAccount4;
                                                        z11 = zBooleanValue;
                                                        transferAccount2 = transferAccount;
                                                        try {
                                                            BuildersKt__Builders_commonKt.launch$default(this.this$0.getLifecycleScope(), null, null, new AnonymousClass2(this.this$0, transferHubManagedService2, transferHubConfigurationManagedService, transferAccount2, rhyAccount6, z11, null), 3, null);
                                                            this.this$0.applyMutation(new AnonymousClass3(null));
                                                        } catch (Exception e2) {
                                                            exc = e2;
                                                            rhyAccount5 = rhyAccount6;
                                                            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 4, null);
                                                            TransfersHubDuxo transfersHubDuxo2 = this.this$0;
                                                            Intrinsics.checkNotNull(apiAcatsBonusPromoInfo3);
                                                            transfersHubDuxo2.useFallbackNonMicrogramExperience(z10, rhyAccount5, z8, apiAcatsBonusPromoInfo3);
                                                            return Unit.INSTANCE;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        coroutineScope = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objFirst = obj;
                        boolean zBooleanValue22 = ((Boolean) objFirst).booleanValue();
                        Flow flowBuffer$default22 = Context7.buffer$default(RxConvert.asFlow(this.this$0.rhyAccountStore.streamSpendingAccount()), Integer.MAX_VALUE, null, 2, null);
                        this.L$0 = coroutineScope;
                        this.Z$0 = zBooleanValue22;
                        this.label = 2;
                        objFirst2 = FlowKt.first(flowBuffer$default22, this);
                        if (objFirst2 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        z = this.Z$0;
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objFirst2 = obj;
                        RhyAccount rhyAccount72 = (RhyAccount) ((Optional) objFirst2).getOrNull();
                        Flow flowBuffer$default32 = Context7.buffer$default(RxConvert.asFlow(ObservablesKt.connectWhen$default(ObservablesKt.connectWhen$default(ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{TransferHubExperiment.INSTANCE}, false, null, 6, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.this$0.regionGateProvider, RetirementRegionGate.INSTANCE, false, 2, null), null, 2, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.this$0.regionGateProvider, GoldRegionGate.INSTANCE, false, 2, null), null, 2, null)), Integer.MAX_VALUE, null, 2, null);
                        this.L$0 = coroutineScope2;
                        this.L$1 = rhyAccount72;
                        this.Z$0 = z;
                        this.label = 3;
                        objFirst3 = FlowKt.first(flowBuffer$default32, this);
                        if (objFirst3 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        boolean z14 = this.Z$0;
                        RhyAccount rhyAccount8 = (RhyAccount) this.L$1;
                        coroutineScope3 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        z2 = z14;
                        rhyAccount = rhyAccount8;
                        objFirst3 = obj;
                        boolean zBooleanValue32 = ((Boolean) objFirst3).booleanValue();
                        Flow flowBuffer$default42 = Context7.buffer$default(RxConvert.asFlow(this.this$0.goldDepositBoostMaxAwarenessStore.streamGoldDepositBoostMaxAwareness()), Integer.MAX_VALUE, null, 2, null);
                        this.L$0 = coroutineScope3;
                        this.L$1 = rhyAccount;
                        this.Z$0 = z2;
                        this.Z$1 = zBooleanValue32;
                        this.label = 4;
                        objFirst4 = FlowKt.first(flowBuffer$default42, this);
                        if (objFirst4 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 4:
                        z3 = this.Z$1;
                        z2 = this.Z$0;
                        rhyAccount2 = (RhyAccount) this.L$1;
                        coroutineScope4 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objFirst4 = obj;
                        boolean zBooleanValue42 = ((Boolean) objFirst4).booleanValue();
                        Observable<ApiAcatsBonusPromoInfo> observable2 = this.this$0.acatsBonusStore.getBonusInfo().toObservable();
                        Intrinsics.checkNotNullExpressionValue(observable2, "toObservable(...)");
                        Flow flowBuffer$default52 = Context7.buffer$default(RxConvert.asFlow(observable2), Integer.MAX_VALUE, null, 2, null);
                        this.L$0 = coroutineScope4;
                        this.L$1 = rhyAccount2;
                        this.Z$0 = z2;
                        this.Z$1 = z3;
                        this.Z$2 = zBooleanValue42;
                        this.label = 5;
                        objFirst5 = FlowKt.first(flowBuffer$default52, this);
                        if (objFirst5 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 5:
                        z5 = this.Z$2;
                        z4 = this.Z$1;
                        z6 = this.Z$0;
                        rhyAccount3 = (RhyAccount) this.L$1;
                        coroutineScope5 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objFirst5 = obj;
                        apiAcatsBonusPromoInfo = (ApiAcatsBonusPromoInfo) objFirst5;
                        Flow flowBuffer$default62 = Context7.buffer$default(RxConvert.asFlow(this.this$0.transferAccountStore.fetchIfStaleThenStream()), Integer.MAX_VALUE, null, 2, null);
                        this.L$0 = coroutineScope5;
                        this.L$1 = rhyAccount3;
                        this.L$2 = apiAcatsBonusPromoInfo;
                        this.Z$0 = z6;
                        this.Z$1 = z4;
                        this.Z$2 = z5;
                        this.label = 6;
                        objFirst6 = FlowKt.first(flowBuffer$default62, this);
                        if (objFirst6 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 6:
                        z5 = this.Z$2;
                        boolean z15 = this.Z$1;
                        boolean z16 = this.Z$0;
                        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo4 = (ApiAcatsBonusPromoInfo) this.L$2;
                        rhyAccount3 = (RhyAccount) this.L$1;
                        coroutineScope5 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        apiAcatsBonusPromoInfo = apiAcatsBonusPromoInfo4;
                        z6 = z16;
                        z4 = z15;
                        objFirst6 = obj;
                        List list32 = (List) objFirst6;
                        Flow flowStreamStateFlow$default2 = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{RecurringExtraCashExperiment.INSTANCE}, false, null, 6, null);
                        this.L$0 = coroutineScope5;
                        this.L$1 = rhyAccount3;
                        this.L$2 = apiAcatsBonusPromoInfo;
                        this.L$3 = list32;
                        this.Z$0 = z6;
                        this.Z$1 = z4;
                        this.Z$2 = z5;
                        this.label = 7;
                        objFirst7 = FlowKt.first(flowStreamStateFlow$default2, this);
                        if (objFirst7 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 7:
                        boolean z17 = this.Z$2;
                        boolean z18 = this.Z$1;
                        z9 = this.Z$0;
                        list = (List) this.L$3;
                        apiAcatsBonusPromoInfo2 = (ApiAcatsBonusPromoInfo) this.L$2;
                        rhyAccount4 = (RhyAccount) this.L$1;
                        CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        z7 = z17;
                        z8 = z18;
                        objFirst7 = obj;
                        coroutineScope6 = coroutineScope9;
                        zBooleanValue = ((Boolean) objFirst7).booleanValue();
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        transferAccount = (TransferAccount) next;
                        transferHubConfigurationManagedService = (TransferHubConfigurationManagedService) MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.this$0.microgramManager, coroutineScope6, new MicrogramLaunchId(Applications.getTransferHubRedesignApplication(), null, 2, null), null, 4, null).getComponent().getServiceLocator().getClient(TransferHubConfigurationManagedService.class);
                        transferHubManagedService = (TransferHubManagedService) MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.this$0.microgramManager, coroutineScope6, new MicrogramLaunchId(Applications.getTransferHubRedesignApplication(), null, 2, null), null, 4, null).getComponent().getServiceLocator().getHostImplementation(TransferHubManagedService.class);
                        list2 = list;
                        if (list2 instanceof Collection) {
                            it2 = list2.iterator();
                            i = 0;
                            while (it2.hasNext()) {
                            }
                            boolean z132 = true;
                            if (i > 1) {
                            }
                            transferHubDisplayLogicContainer = new TransferHubDisplayLogicContainer(z9, z8, z7, z132);
                            this.L$0 = rhyAccount4;
                            this.L$1 = apiAcatsBonusPromoInfo2;
                            this.L$2 = transferAccount;
                            this.L$3 = transferHubConfigurationManagedService;
                            this.L$4 = transferHubManagedService;
                            this.Z$0 = z9;
                            this.Z$1 = z8;
                            this.Z$2 = zBooleanValue;
                            this.label = 8;
                            if (transferHubManagedService.setDataForDisplayLogic(transferHubDisplayLogicContainer, this) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 8:
                        boolean z19 = this.Z$2;
                        z8 = this.Z$1;
                        z10 = this.Z$0;
                        TransferHubManagedService transferHubManagedService3 = (TransferHubManagedService) this.L$4;
                        transferHubConfigurationManagedService = (TransferHubConfigurationManagedService) this.L$3;
                        TransferAccount transferAccount3 = (TransferAccount) this.L$2;
                        apiAcatsBonusPromoInfo3 = (ApiAcatsBonusPromoInfo) this.L$1;
                        rhyAccount5 = (RhyAccount) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            z11 = z19;
                            transferHubManagedService2 = transferHubManagedService3;
                            transferAccount2 = transferAccount3;
                            rhyAccount6 = rhyAccount5;
                            BuildersKt__Builders_commonKt.launch$default(this.this$0.getLifecycleScope(), null, null, new AnonymousClass2(this.this$0, transferHubManagedService2, transferHubConfigurationManagedService, transferAccount2, rhyAccount6, z11, null), 3, null);
                            this.this$0.applyMutation(new AnonymousClass3(null));
                        } catch (Exception e3) {
                            exc = e3;
                            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 4, null);
                            TransfersHubDuxo transfersHubDuxo22 = this.this$0;
                            Intrinsics.checkNotNull(apiAcatsBonusPromoInfo3);
                            transfersHubDuxo22.useFallbackNonMicrogramExperience(z10, rhyAccount5, z8, apiAcatsBonusPromoInfo3);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: TransfersHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2$1$2", m3645f = "TransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ TransferHubConfigurationManagedService $configService;
                final /* synthetic */ boolean $isInRecurringExtraCashExperiment;
                final /* synthetic */ TransferHubManagedService $managedService;
                final /* synthetic */ TransferAccount $rhsAccount;
                final /* synthetic */ RhyAccount $rhyAccount;
                int label;
                final /* synthetic */ TransfersHubDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(TransfersHubDuxo transfersHubDuxo, TransferHubManagedService transferHubManagedService, TransferHubConfigurationManagedService transferHubConfigurationManagedService, TransferAccount transferAccount, RhyAccount rhyAccount, boolean z, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = transfersHubDuxo;
                    this.$managedService = transferHubManagedService;
                    this.$configService = transferHubConfigurationManagedService;
                    this.$rhsAccount = transferAccount;
                    this.$rhyAccount = rhyAccount;
                    this.$isInRecurringExtraCashExperiment = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.this$0, this.$managedService, this.$configService, this.$rhsAccount, this.$rhyAccount, this.$isInRecurringExtraCashExperiment, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TransfersHubDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/TransfersHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2$1$2$1", m3645f = "TransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C505921 extends ContinuationImpl7 implements Function2<TransfersHubViewState, Continuation<? super TransfersHubViewState>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    C505921(Continuation<? super C505921> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505921 c505921 = new C505921(continuation);
                        c505921.L$0 = obj;
                        return c505921;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TransfersHubViewState transfersHubViewState, Continuation<? super TransfersHubViewState> continuation) {
                        return ((C505921) create(transfersHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        TransfersHubViewState transfersHubViewState = (TransfersHubViewState) this.L$0;
                        return transfersHubViewState.copy((16255 & 1) != 0 ? transfersHubViewState.achRelationships : null, (16255 & 2) != 0 ? transfersHubViewState.activeDebitCardInstruments : null, (16255 & 4) != 0 ? transfersHubViewState.hasAutomaticDeposits : false, (16255 & 8) != 0 ? transfersHubViewState.isCashManagementEnabled : false, (16255 & 16) != 0 ? transfersHubViewState.hasRhyAccount : false, (16255 & 32) != 0 ? transfersHubViewState.pendingHistoryItems : null, (16255 & 64) != 0 ? transfersHubViewState.historyItems : null, (16255 & 128) != 0 ? transfersHubViewState.isUserInAutoDepositRecurringHookExperiment : false, (16255 & 256) != 0 ? transfersHubViewState.isInWithdrawableCashInfoExperiment : false, (16255 & 512) != 0 ? transfersHubViewState.isAcatsRegionGateSupported : false, (16255 & 1024) != 0 ? transfersHubViewState.acatsBonusInfo : null, (16255 & 2048) != 0 ? transfersHubViewState.isInRetirementTransferExperiment : false, (16255 & 4096) != 0 ? transfersHubViewState.transferHubMicrogramSource : null, (16255 & 8192) != 0 ? transfersHubViewState.isLoading : false);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C505921(null));
                        this.this$0.finishSubscriptions();
                        TransferHubManagedService transferHubManagedService = this.$managedService;
                        Intrinsics.checkNotNull(transferHubManagedService, "null cannot be cast to non-null type com.robinhood.android.transfers.transferhub.TransferHubManagedServiceImpl");
                        final TransfersHubDuxo transfersHubDuxo = this.this$0;
                        final TransferHubConfigurationManagedService transferHubConfigurationManagedService = this.$configService;
                        final TransferAccount transferAccount = this.$rhsAccount;
                        final RhyAccount rhyAccount = this.$rhyAccount;
                        final boolean z = this.$isInRecurringExtraCashExperiment;
                        ((TransferHubManagedServiceImpl) transferHubManagedService).setHandler(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2$1$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return TransfersHubDuxo.C300702.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0(transfersHubDuxo, transferHubConfigurationManagedService, transferAccount, rhyAccount, z, (TransferHubItemClickIdentifier) obj2);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$0(TransfersHubDuxo transfersHubDuxo, TransferHubConfigurationManagedService transferHubConfigurationManagedService, TransferAccount transferAccount, RhyAccount rhyAccount, boolean z, TransferHubItemClickIdentifier transferHubItemClickIdentifier) {
                    BuildersKt__Builders_commonKt.launch$default(transfersHubDuxo.getLifecycleScope(), null, null, new TransfersHubDuxo$onCreate$2$1$2$2$1(transfersHubDuxo, transferHubItemClickIdentifier, transferHubConfigurationManagedService, transferAccount, rhyAccount, z, null), 3, null);
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: TransfersHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/TransfersHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2$1$3", m3645f = "TransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<TransfersHubViewState, Continuation<? super TransfersHubViewState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TransfersHubViewState transfersHubViewState, Continuation<? super TransfersHubViewState> continuation) {
                    return ((AnonymousClass3) create(transfersHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    TransfersHubViewState transfersHubViewState = (TransfersHubViewState) this.L$0;
                    return transfersHubViewState.copy((16255 & 1) != 0 ? transfersHubViewState.achRelationships : null, (16255 & 2) != 0 ? transfersHubViewState.activeDebitCardInstruments : null, (16255 & 4) != 0 ? transfersHubViewState.hasAutomaticDeposits : false, (16255 & 8) != 0 ? transfersHubViewState.isCashManagementEnabled : false, (16255 & 16) != 0 ? transfersHubViewState.hasRhyAccount : false, (16255 & 32) != 0 ? transfersHubViewState.pendingHistoryItems : null, (16255 & 64) != 0 ? transfersHubViewState.historyItems : null, (16255 & 128) != 0 ? transfersHubViewState.isUserInAutoDepositRecurringHookExperiment : false, (16255 & 256) != 0 ? transfersHubViewState.isInWithdrawableCashInfoExperiment : false, (16255 & 512) != 0 ? transfersHubViewState.isAcatsRegionGateSupported : false, (16255 & 1024) != 0 ? transfersHubViewState.acatsBonusInfo : null, (16255 & 2048) != 0 ? transfersHubViewState.isInRetirementTransferExperiment : false, (16255 & 4096) != 0 ? transfersHubViewState.transferHubMicrogramSource : Applications.getTransferHubRedesignApplication(), (16255 & 8192) != 0 ? transfersHubViewState.isLoading : false);
                }
            }
        }
    }

    /* compiled from: TransfersHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$onCreate$3", m3645f = "TransfersHubDuxo.kt", m3646l = {182}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.TransfersHubDuxo$onCreate$3 */
    static final class C300713 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C300713(Continuation<? super C300713> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransfersHubDuxo.this.new C300713(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C300713) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PackagePreloader packagePreloader = TransfersHubDuxo.this.microgramPackagePreloader;
                    RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(TransferMicrogramAppNames.PILL_SUGGESTIONS, null, 2, null);
                    this.label = 1;
                    if (packagePreloader.mo28945preloadgIAlus(remoteMicrogramApplication, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ((Result) obj).getValue();
                }
            } catch (Exception e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void refreshData() {
        this.achRelationshipStore.refresh(false);
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        this.experimentsStore.refresh(false);
        this.acatsTransferStore.refresh(true);
        this.transferV2LimitsStore.refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void useFallbackNonOrderedSubscriptionPattern() {
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, AcatsRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.useFallbackNonOrderedSubscriptionPattern$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<Account> observableStreamIndividualAccount = this.accountProvider.streamIndividualAccount();
        final C300732 c300732 = new PropertyReference1Impl() { // from class: com.robinhood.android.transfers.TransfersHubDuxo.useFallbackNonOrderedSubscriptionPattern.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((Account) obj).getCashManagementEnabled());
            }
        };
        Observable observableDistinctUntilChanged = observableStreamIndividualAccount.map(new Function(c300732) { // from class: com.robinhood.android.transfers.TransfersHubDuxo$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c300732, "function");
                this.function = c300732;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.useFallbackNonOrderedSubscriptionPattern$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.rhyAccountStore.streamSpendingAccount(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.useFallbackNonOrderedSubscriptionPattern$lambda$2(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = ObservablesKt.connectWhen$default(ObservablesKt.connectWhen$default(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{TransferHubExperiment.INSTANCE}, false, null, 6, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, RetirementRegionGate.INSTANCE, false, 2, null), null, 2, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, GoldRegionGate.INSTANCE, false, 2, null), null, 2, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.useFallbackNonOrderedSubscriptionPattern$lambda$3(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.acatsBonusStore.getBonusInfo(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.useFallbackNonOrderedSubscriptionPattern$lambda$4(this.f$0, (ApiAcatsBonusPromoInfo) obj);
            }
        });
        applyMutation(new C300747(null));
        finishSubscriptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit useFallbackNonOrderedSubscriptionPattern$lambda$0(TransfersHubDuxo transfersHubDuxo, boolean z) {
        transfersHubDuxo.applyMutation(new TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$1$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit useFallbackNonOrderedSubscriptionPattern$lambda$1(TransfersHubDuxo transfersHubDuxo, Boolean bool) {
        transfersHubDuxo.applyMutation(new TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$3$1(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit useFallbackNonOrderedSubscriptionPattern$lambda$2(TransfersHubDuxo transfersHubDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        transfersHubDuxo.applyMutation(new TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$4$1((RhyAccount) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit useFallbackNonOrderedSubscriptionPattern$lambda$3(TransfersHubDuxo transfersHubDuxo, Boolean bool) {
        transfersHubDuxo.applyMutation(new TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$5$1(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit useFallbackNonOrderedSubscriptionPattern$lambda$4(TransfersHubDuxo transfersHubDuxo, ApiAcatsBonusPromoInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        transfersHubDuxo.applyMutation(new TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$6$1(it, null));
        return Unit.INSTANCE;
    }

    /* compiled from: TransfersHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/TransfersHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$7", m3645f = "TransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$7 */
    static final class C300747 extends ContinuationImpl7 implements Function2<TransfersHubViewState, Continuation<? super TransfersHubViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C300747(Continuation<? super C300747> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C300747 c300747 = new C300747(continuation);
            c300747.L$0 = obj;
            return c300747;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransfersHubViewState transfersHubViewState, Continuation<? super TransfersHubViewState> continuation) {
            return ((C300747) create(transfersHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TransfersHubViewState transfersHubViewState = (TransfersHubViewState) this.L$0;
            return transfersHubViewState.copy((16255 & 1) != 0 ? transfersHubViewState.achRelationships : null, (16255 & 2) != 0 ? transfersHubViewState.activeDebitCardInstruments : null, (16255 & 4) != 0 ? transfersHubViewState.hasAutomaticDeposits : false, (16255 & 8) != 0 ? transfersHubViewState.isCashManagementEnabled : false, (16255 & 16) != 0 ? transfersHubViewState.hasRhyAccount : false, (16255 & 32) != 0 ? transfersHubViewState.pendingHistoryItems : null, (16255 & 64) != 0 ? transfersHubViewState.historyItems : null, (16255 & 128) != 0 ? transfersHubViewState.isUserInAutoDepositRecurringHookExperiment : false, (16255 & 256) != 0 ? transfersHubViewState.isInWithdrawableCashInfoExperiment : false, (16255 & 512) != 0 ? transfersHubViewState.isAcatsRegionGateSupported : false, (16255 & 1024) != 0 ? transfersHubViewState.acatsBonusInfo : null, (16255 & 2048) != 0 ? transfersHubViewState.isInRetirementTransferExperiment : false, (16255 & 4096) != 0 ? transfersHubViewState.transferHubMicrogramSource : null, (16255 & 8192) != 0 ? transfersHubViewState.isLoading : false);
        }
    }

    /* compiled from: TransfersHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/TransfersHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$useFallbackNonMicrogramExperience$1", m3645f = "TransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.TransfersHubDuxo$useFallbackNonMicrogramExperience$1 */
    static final class C300721 extends ContinuationImpl7 implements Function2<TransfersHubViewState, Continuation<? super TransfersHubViewState>, Object> {
        final /* synthetic */ ApiAcatsBonusPromoInfo $acatsBonusInfo;
        final /* synthetic */ boolean $acatsRegionGate;
        final /* synthetic */ boolean $retirementTransferUpsellExperiment;
        final /* synthetic */ RhyAccount $rhyAccount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C300721(RhyAccount rhyAccount, boolean z, ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo, boolean z2, Continuation<? super C300721> continuation) {
            super(2, continuation);
            this.$rhyAccount = rhyAccount;
            this.$acatsRegionGate = z;
            this.$acatsBonusInfo = apiAcatsBonusPromoInfo;
            this.$retirementTransferUpsellExperiment = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C300721 c300721 = new C300721(this.$rhyAccount, this.$acatsRegionGate, this.$acatsBonusInfo, this.$retirementTransferUpsellExperiment, continuation);
            c300721.L$0 = obj;
            return c300721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransfersHubViewState transfersHubViewState, Continuation<? super TransfersHubViewState> continuation) {
            return ((C300721) create(transfersHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TransfersHubViewState transfersHubViewState = (TransfersHubViewState) this.L$0;
            return transfersHubViewState.copy((16255 & 1) != 0 ? transfersHubViewState.achRelationships : null, (16255 & 2) != 0 ? transfersHubViewState.activeDebitCardInstruments : null, (16255 & 4) != 0 ? transfersHubViewState.hasAutomaticDeposits : false, (16255 & 8) != 0 ? transfersHubViewState.isCashManagementEnabled : false, (16255 & 16) != 0 ? transfersHubViewState.hasRhyAccount : this.$rhyAccount != null, (16255 & 32) != 0 ? transfersHubViewState.pendingHistoryItems : null, (16255 & 64) != 0 ? transfersHubViewState.historyItems : null, (16255 & 128) != 0 ? transfersHubViewState.isUserInAutoDepositRecurringHookExperiment : false, (16255 & 256) != 0 ? transfersHubViewState.isInWithdrawableCashInfoExperiment : false, (16255 & 512) != 0 ? transfersHubViewState.isAcatsRegionGateSupported : this.$acatsRegionGate, (16255 & 1024) != 0 ? transfersHubViewState.acatsBonusInfo : this.$acatsBonusInfo, (16255 & 2048) != 0 ? transfersHubViewState.isInRetirementTransferExperiment : this.$retirementTransferUpsellExperiment, (16255 & 4096) != 0 ? transfersHubViewState.transferHubMicrogramSource : null, (16255 & 8192) != 0 ? transfersHubViewState.isLoading : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void useFallbackNonMicrogramExperience(boolean acatsRegionGate, RhyAccount rhyAccount, boolean retirementTransferUpsellExperiment, ApiAcatsBonusPromoInfo acatsBonusInfo) {
        applyMutation(new C300721(rhyAccount, acatsRegionGate, acatsBonusInfo, retirementTransferUpsellExperiment, null));
        finishSubscriptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishSubscriptions() {
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getLinkedAchRelationships(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.finishSubscriptions$lambda$5(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.debitCardInstrumentStore.getActiveDebitCardInstruments(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.finishSubscriptions$lambda$6(this.f$0, (List) obj);
            }
        });
        Observable observableDistinctUntilChanged = Observables.INSTANCE.combineLatest(this.automaticDepositStore.getAutomaticDeposits(), this.depositScheduleStore.getStreamDepositSchedules().asObservable(Unit.INSTANCE)).map(new Function() { // from class: com.robinhood.android.transfers.TransfersHubDuxo.finishSubscriptions.3
            @Override // io.reactivex.functions.Function
            public final List<Object> apply(Tuples2<? extends List<AutomaticDepositWithBankInfo>, ? extends List<UiDepositSchedule>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return CollectionsKt.plus((Collection) tuples2.component1(), (Iterable) tuples2.component2());
            }
        }).map(new Function() { // from class: com.robinhood.android.transfers.TransfersHubDuxo.finishSubscriptions.4
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<? extends Object> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.finishSubscriptions$lambda$7(this.f$0, (Boolean) obj);
            }
        });
        HistoryStore historyStore = this.historyStore;
        Optional.Companion companion = Optional.INSTANCE;
        Observable observableJust = Observable.just(companion.m2972of(HistoryEvent.State.PENDING));
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        HistoryFilter historyFilter = HistoryFilter.TRANSFERS;
        Observable observableJust2 = Observable.just(historyFilter.getTransactionTypes());
        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
        Instant instant = Instant.EPOCH;
        Observable observableJust3 = Observable.just(instant);
        Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
        LifecycleHost.DefaultImpls.bind$default(this, HistoryStore.stream$default(historyStore, observableJust, observableJust2, observableJust3, null, null, 5, 24, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.finishSubscriptions$lambda$8(this.f$0, (PagedList) obj);
            }
        });
        HistoryStore historyStore2 = this.historyStore;
        Observable observableJust4 = Observable.just(companion.m2972of(HistoryEvent.State.SETTLED));
        Intrinsics.checkNotNullExpressionValue(observableJust4, "just(...)");
        Observable observableJust5 = Observable.just(historyFilter.getTransactionTypes());
        Intrinsics.checkNotNullExpressionValue(observableJust5, "just(...)");
        Observable observableJust6 = Observable.just(instant);
        Intrinsics.checkNotNullExpressionValue(observableJust6, "just(...)");
        LifecycleHost.DefaultImpls.bind$default(this, HistoryStore.stream$default(historyStore2, observableJust4, observableJust5, observableJust6, null, null, 5, 24, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.finishSubscriptions$lambda$9(this.f$0, (PagedList) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.AUTO_DEPOSIT_RECURRING_INVESTMENTS_HOOK.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.finishSubscriptions$lambda$10(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finishSubscriptions$lambda$5(TransfersHubDuxo transfersHubDuxo, List relationships) {
        Intrinsics.checkNotNullParameter(relationships, "relationships");
        transfersHubDuxo.applyMutation(new TransfersHubDuxo$finishSubscriptions$1$1(relationships, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finishSubscriptions$lambda$6(TransfersHubDuxo transfersHubDuxo, List activeDebitCardInstruments) {
        Intrinsics.checkNotNullParameter(activeDebitCardInstruments, "activeDebitCardInstruments");
        transfersHubDuxo.applyMutation(new TransfersHubDuxo$finishSubscriptions$2$1(activeDebitCardInstruments, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finishSubscriptions$lambda$7(TransfersHubDuxo transfersHubDuxo, Boolean bool) {
        transfersHubDuxo.applyMutation(new TransfersHubDuxo$finishSubscriptions$5$1(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finishSubscriptions$lambda$8(TransfersHubDuxo transfersHubDuxo, PagedList pendingHistoryItems) {
        Intrinsics.checkNotNullParameter(pendingHistoryItems, "pendingHistoryItems");
        transfersHubDuxo.applyMutation(new TransfersHubDuxo$finishSubscriptions$6$1(pendingHistoryItems, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finishSubscriptions$lambda$9(TransfersHubDuxo transfersHubDuxo, PagedList historyItems) {
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        transfersHubDuxo.applyMutation(new TransfersHubDuxo$finishSubscriptions$7$1(historyItems, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finishSubscriptions$lambda$10(TransfersHubDuxo transfersHubDuxo, boolean z) {
        transfersHubDuxo.applyMutation(new TransfersHubDuxo$finishSubscriptions$8$1(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: TransfersHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$checkDocumentVerification$1", m3645f = "TransfersHubDuxo.kt", m3646l = {360}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.TransfersHubDuxo$checkDocumentVerification$1 */
    static final class C300661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AchRelationshipDocumentVerificationAction>, Object> {
        final /* synthetic */ UUID $documentRequestId;
        int label;

        /* compiled from: TransfersHubDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.TransfersHubDuxo$checkDocumentVerification$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiDocumentRequest.State.values().length];
                try {
                    iArr[ApiDocumentRequest.State.PENDING_UPLOAD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiDocumentRequest.State.RE_REQUESTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiDocumentRequest.State.UPLOADED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ApiDocumentRequest.State.CANCELLED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ApiDocumentRequest.State.PENDING_UPLOAD_EMAIL_ONLY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C300661(UUID uuid, Continuation<? super C300661> continuation) {
            super(2, continuation);
            this.$documentRequestId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransfersHubDuxo.this.new C300661(this.$documentRequestId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AchRelationshipDocumentVerificationAction> continuation) {
            return ((C300661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DocumentRequestStore documentRequestStore = TransfersHubDuxo.this.documentRequestStore;
                UUID uuid = this.$documentRequestId;
                this.label = 1;
                obj = documentRequestStore.getDocumentRequest(uuid, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DocumentRequest documentRequest = (DocumentRequest) obj;
            ApiDocumentRequest.State state = documentRequest.getState();
            int i2 = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 != -1) {
                if (i2 == 1 || i2 == 2) {
                    return new AchRelationshipDocumentVerificationAction.NeedsUpload(documentRequest);
                }
                if (i2 == 3) {
                    return AchRelationshipDocumentVerificationAction.AlreadyUploaded.INSTANCE;
                }
                if (i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return AchRelationshipDocumentVerificationAction.ContactSupport.INSTANCE;
        }
    }

    public final void checkDocumentVerification(UUID documentRequestId) {
        Intrinsics.checkNotNullParameter(documentRequestId, "documentRequestId");
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C300661(documentRequestId, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.checkDocumentVerification$lambda$11(this.f$0, (AchRelationshipDocumentVerificationAction) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.TransfersHubDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubDuxo.checkDocumentVerification$lambda$12(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkDocumentVerification$lambda$11(TransfersHubDuxo transfersHubDuxo, AchRelationshipDocumentVerificationAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        transfersHubDuxo.submit(new TransferHubEvent.AchRelationshipDocumentVerificationAction(Either2.asLeft(action)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkDocumentVerification$lambda$12(TransfersHubDuxo transfersHubDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        transfersHubDuxo.submit(new TransferHubEvent.AchRelationshipDocumentVerificationAction(Either2.asRight(throwable)));
        return Unit.INSTANCE;
    }
}
