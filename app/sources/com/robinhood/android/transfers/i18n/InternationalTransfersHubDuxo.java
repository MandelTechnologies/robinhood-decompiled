package com.robinhood.android.transfers.i18n;

import androidx.lifecycle.SavedStateHandle;
import androidx.paging.PagedList;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.banking.experiments.McwGbTransfersRollout;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.mcw.contracts.CurrencyConverterKey;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.StocksAndSharesIsaRegionGate;
import com.robinhood.android.transfers.contracts.InternalTransferAccountSelection;
import com.robinhood.android.transfers.contracts.InternationalTransfer;
import com.robinhood.android.transfers.contracts.LimitsHubDetails;
import com.robinhood.android.transfers.contracts.UkTransfer;
import com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo2;
import com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment;
import com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.WithdrawableAmountBreakdownStore;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableCashOverview;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.store.paymentinstrument.PaymentInstrumentStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: InternationalTransfersHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001*BQ\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020!J\u0006\u0010)\u001a\u00020!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState;", "Lcom/robinhood/android/transfers/i18n/I18nTransfersHubEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "withdrawableAmountBreakdownStore", "Lcom/robinhood/librobinhood/data/store/bonfire/WithdrawableAmountBreakdownStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/bonfire/WithdrawableAmountBreakdownStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "paymentInstrumentTypeForLocality", "Lcom/robinhood/models/api/bonfire/paymentinstruments/PaymentInstrumentType;", "getPaymentInstrumentTypeForLocality", "()Lcom/robinhood/models/api/bonfire/paymentinstruments/PaymentInstrumentType;", "onStart", "", "onTransferActionClick", "direction", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "onActionRowClick", "row", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$ActionBarWithRows$ActionRow;", "onConvertClick", "onLimitTextClick", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class InternationalTransfersHubDuxo extends BaseDuxo3<InternationalTransfersHubDataState, InternationalTransfersHubViewState, InternationalTransfersHubDuxo2> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private final HistoryStore historyStore;
    private final PaymentInstrumentStore paymentInstrumentStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InternationalTransfersHubDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow.values().length];
            try {
                iArr[InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow.TRANSFER_IN_IRA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow.TRANSFER_BETWEEN_ACCOUNTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow.VIEW_TRANSFER_LIMITS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternationalTransfersHubDuxo(AccountProvider accountProvider, HistoryStore historyStore, PaymentInstrumentStore paymentInstrumentStore, RegionGateProvider regionGateProvider, WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, InternationalTransfersHubStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new InternationalTransfersHubDataState(((InternationalTransfersHubFragment.Args) INSTANCE.getArgs(savedStateHandle)).getLocality(), null, null, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(withdrawableAmountBreakdownStore, "withdrawableAmountBreakdownStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.historyStore = historyStore;
        this.paymentInstrumentStore = paymentInstrumentStore;
        this.regionGateProvider = regionGateProvider;
        this.withdrawableAmountBreakdownStore = withdrawableAmountBreakdownStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    private final PaymentInstrumentType getPaymentInstrumentTypeForLocality() {
        Companion companion = INSTANCE;
        CountryCode.Supported locality = ((InternationalTransfersHubFragment.Args) companion.getArgs((HasSavedState) this)).getLocality();
        if (locality instanceof CountryCode.Supported.UnitedKingdom) {
            return PaymentInstrumentType.UK_BANK_ACCOUNT;
        }
        if (Affiliate.RHSG.INSTANCE.contains(locality)) {
            return PaymentInstrumentType.I18N_BANK_ACCOUNT;
        }
        throw new IllegalStateException(("Unsupported locality: " + ((InternationalTransfersHubFragment.Args) companion.getArgs((HasSavedState) this)).getLocality()).toString());
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        Observable observableJust;
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C302751(null));
        HistoryStore historyStore = this.historyStore;
        Optional.Companion companion = Optional.INSTANCE;
        Observable observableJust2 = Observable.just(companion.m2972of(HistoryEvent.State.PENDING));
        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
        HistoryFilter historyFilter = HistoryFilter.TRANSFERS;
        Observable observableJust3 = Observable.just(historyFilter.getTransactionTypes());
        Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
        Instant instant = Instant.EPOCH;
        Observable observableJust4 = Observable.just(instant);
        Intrinsics.checkNotNullExpressionValue(observableJust4, "just(...)");
        LifecycleHost.DefaultImpls.bind$default(this, HistoryStore.stream$default(historyStore, observableJust2, observableJust3, observableJust4, null, null, 5, 24, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransfersHubDuxo.onStart$lambda$0(this.f$0, (PagedList) obj);
            }
        });
        HistoryStore historyStore2 = this.historyStore;
        Observable observableJust5 = Observable.just(companion.m2972of(HistoryEvent.State.SETTLED));
        Intrinsics.checkNotNullExpressionValue(observableJust5, "just(...)");
        Observable observableJust6 = Observable.just(historyFilter.getTransactionTypes());
        Intrinsics.checkNotNullExpressionValue(observableJust6, "just(...)");
        Observable observableJust7 = Observable.just(instant);
        Intrinsics.checkNotNullExpressionValue(observableJust7, "just(...)");
        LifecycleHost.DefaultImpls.bind$default(this, HistoryStore.stream$default(historyStore2, observableJust5, observableJust6, observableJust7, null, null, 5, 24, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransfersHubDuxo.onStart$lambda$1(this.f$0, (PagedList) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.paymentInstrumentStore.stream(CollectionsKt.listOf(getPaymentInstrumentTypeForLocality())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransfersHubDuxo.onStart$lambda$2(this.f$0, (List) obj);
            }
        });
        CountryCode.Supported locality = ((InternationalTransfersHubFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getLocality();
        if (locality instanceof CountryCode.Supported.UnitedKingdom) {
            observableJust = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{McwGbTransfersRollout.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$shouldFetchWithdrawableCashOverview$1
                @Override // io.reactivex.functions.Function
                public final Boolean apply(Boolean it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(!it.booleanValue());
                }
            });
        } else {
            observableJust = Affiliate.RHSG.INSTANCE.contains(locality) ? Observable.just(Boolean.TRUE) : Observable.just(Boolean.FALSE);
        }
        Observable observablePollWithdrawableCashOverview$default = WithdrawableAmountBreakdownStore.pollWithdrawableCashOverview$default(this.withdrawableAmountBreakdownStore, null, 1, null);
        Intrinsics.checkNotNull(observableJust);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observablePollWithdrawableCashOverview$default, observableJust, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransfersHubDuxo.onStart$lambda$3(this.f$0, (ApiWithdrawableCashOverview) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C302766(null), 3, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAllAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransfersHubDuxo.onStart$lambda$4(this.f$0, (List) obj);
            }
        });
    }

    /* compiled from: InternationalTransfersHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$1", m3645f = "InternationalTransfersHubDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$1 */
    static final class C302751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C302751(Continuation<? super C302751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransfersHubDuxo.this.new C302751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C302751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(InternationalTransfersHubDuxo.this.experimentsStore, new Experiment[]{McwGbTransfersRollout.INSTANCE}, false, null, 6, null);
                final InternationalTransfersHubDuxo internationalTransfersHubDuxo = InternationalTransfersHubDuxo.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo.onStart.1.1

                    /* compiled from: InternationalTransfersHubDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$1$1$1", m3645f = "InternationalTransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C506001 extends ContinuationImpl7 implements Function2<InternationalTransfersHubDataState, Continuation<? super InternationalTransfersHubDataState>, Object> {
                        final /* synthetic */ boolean $it;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C506001(boolean z, Continuation<? super C506001> continuation) {
                            super(2, continuation);
                            this.$it = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C506001 c506001 = new C506001(this.$it, continuation);
                            c506001.L$0 = obj;
                            return c506001;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InternationalTransfersHubDataState internationalTransfersHubDataState, Continuation<? super InternationalTransfersHubDataState> continuation) {
                            return ((C506001) create(internationalTransfersHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return InternationalTransfersHubDataState.copy$default((InternationalTransfersHubDataState) this.L$0, null, null, null, null, null, boxing.boxBoolean(this.$it), false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        internationalTransfersHubDuxo.applyMutation(new C506001(z, null));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowStreamStateFlow$default.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(InternationalTransfersHubDuxo internationalTransfersHubDuxo, PagedList pendingHistoryItems) {
        Intrinsics.checkNotNullParameter(pendingHistoryItems, "pendingHistoryItems");
        internationalTransfersHubDuxo.applyMutation(new InternationalTransfersHubDuxo3(pendingHistoryItems, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(InternationalTransfersHubDuxo internationalTransfersHubDuxo, PagedList completedHistoryItems) {
        Intrinsics.checkNotNullParameter(completedHistoryItems, "completedHistoryItems");
        internationalTransfersHubDuxo.applyMutation(new InternationalTransfersHubDuxo4(completedHistoryItems, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(InternationalTransfersHubDuxo internationalTransfersHubDuxo, List paymentInstruments) {
        Intrinsics.checkNotNullParameter(paymentInstruments, "paymentInstruments");
        internationalTransfersHubDuxo.applyMutation(new InternationalTransfersHubDuxo5(paymentInstruments, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(InternationalTransfersHubDuxo internationalTransfersHubDuxo, ApiWithdrawableCashOverview it) {
        Intrinsics.checkNotNullParameter(it, "it");
        internationalTransfersHubDuxo.applyMutation(new InternationalTransfersHubDuxo6(it, null));
        return Unit.INSTANCE;
    }

    /* compiled from: InternationalTransfersHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$6", m3645f = "InternationalTransfersHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$6 */
    static final class C302766 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C302766(Continuation<? super C302766> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransfersHubDuxo.this.new C302766(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C302766) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(InternationalTransfersHubDuxo.this.regionGateProvider, StocksAndSharesIsaRegionGate.INSTANCE, false, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternationalTransfersHubDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: InternationalTransfersHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isIsaEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$6$1", m3645f = "InternationalTransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ InternationalTransfersHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternationalTransfersHubDuxo internationalTransfersHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internationalTransfersHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternationalTransfersHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$6$1$1", m3645f = "InternationalTransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506011 extends ContinuationImpl7 implements Function2<InternationalTransfersHubDataState, Continuation<? super InternationalTransfersHubDataState>, Object> {
                final /* synthetic */ boolean $isIsaEnabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506011(boolean z, Continuation<? super C506011> continuation) {
                    super(2, continuation);
                    this.$isIsaEnabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506011 c506011 = new C506011(this.$isIsaEnabled, continuation);
                    c506011.L$0 = obj;
                    return c506011;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternationalTransfersHubDataState internationalTransfersHubDataState, Continuation<? super InternationalTransfersHubDataState> continuation) {
                    return ((C506011) create(internationalTransfersHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternationalTransfersHubDataState.copy$default((InternationalTransfersHubDataState) this.L$0, null, null, null, null, null, null, this.$isIsaEnabled, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506011(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(InternationalTransfersHubDuxo internationalTransfersHubDuxo, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        internationalTransfersHubDuxo.applyMutation(new InternationalTransfersHubDuxo7(it, null));
        return Unit.INSTANCE;
    }

    public final void onTransferActionClick(final TransferDirectionV2 direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransfersHubDuxo.onTransferActionClick$lambda$5(this.f$0, direction, (InternationalTransfersHubDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransferActionClick$lambda$5(InternationalTransfersHubDuxo internationalTransfersHubDuxo, TransferDirectionV2 transferDirectionV2, InternationalTransfersHubDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        CountryCode.Supported locality = state.getLocality();
        if (locality instanceof CountryCode.Supported.UnitedKingdom) {
            internationalTransfersHubDuxo.submit(new InternationalTransfersHubDuxo2.StartActivity(new UkTransfer(transferDirectionV2, null, null, null, MAXTransferContext.EntryPoint.TRANSFER_HUB, 14, null)));
        } else if (Affiliate.RHSG.INSTANCE.contains(locality)) {
            internationalTransfersHubDuxo.submit(new InternationalTransfersHubDuxo2.StartActivity(new InternationalTransfer(transferDirectionV2.toTransferDirection(), null, null, MAXTransferContext.EntryPoint.TRANSFER_HUB, 6, null)));
        } else {
            throw new IllegalStateException(("Unsupported locality: " + state.getLocality()).toString());
        }
        return Unit.INSTANCE;
    }

    public final void onActionRowClick(InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow row) {
        Intrinsics.checkNotNullParameter(row, "row");
        int i = WhenMappings.$EnumSwitchMapping$0[row.ordinal()];
        if (i == 1) {
            withDataState(new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InternationalTransfersHubDuxo.onActionRowClick$lambda$6(this.f$0, (InternationalTransfersHubDataState) obj);
                }
            });
        } else if (i == 2) {
            submit(new InternationalTransfersHubDuxo2.ShowFragment(InternalTransferAccountSelection.INSTANCE));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            onLimitTextClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActionRowClick$lambda$6(InternationalTransfersHubDuxo internationalTransfersHubDuxo, InternationalTransfersHubDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        internationalTransfersHubDuxo.submit(new InternationalTransfersHubDuxo2.LaunchDeeplink(InternationalTransfersHubStateProvider2.getIsaTransferDeeplink(state)));
        return Unit.INSTANCE;
    }

    public final void onConvertClick() {
        submit(new InternationalTransfersHubDuxo2.StartActivity(new CurrencyConverterKey(null, null, null, null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null)));
    }

    public final void onLimitTextClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransfersHubDuxo.onLimitTextClick$lambda$7(this.f$0, (InternationalTransfersHubDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLimitTextClick$lambda$7(InternationalTransfersHubDuxo internationalTransfersHubDuxo, InternationalTransfersHubDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        CountryCode.Supported locality = state.getLocality();
        if (locality instanceof CountryCode.Supported.UnitedKingdom) {
            internationalTransfersHubDuxo.submit(new InternationalTransfersHubDuxo2.ShowFragment(LimitsHubDetails.INSTANCE));
        } else if (Affiliate.RHSG.INSTANCE.contains(locality)) {
            internationalTransfersHubDuxo.submit(new InternationalTransfersHubDuxo2.ViewUrl(StringResource.INSTANCE.invoke(C30556R.string.i18n_transfer_hub_support_limits_url, new Object[0])));
        } else {
            throw new IllegalStateException(("Unsupported locality: " + state.getLocality()).toString());
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InternationalTransfersHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDuxo;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubFragment$Args;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InternationalTransfersHubDuxo, InternationalTransfersHubFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternationalTransfersHubFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (InternationalTransfersHubFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternationalTransfersHubFragment.Args getArgs(InternationalTransfersHubDuxo internationalTransfersHubDuxo) {
            return (InternationalTransfersHubFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, internationalTransfersHubDuxo);
        }
    }
}
