package com.robinhood.android.common.recurring.sourceoffunds;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsViewState;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.money.Currencies;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.ObservablesKt;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RecurringOrderSourceOfFundsDuxo.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002'(B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u001a\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001f\u001a\u00020\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0002H\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "cryptoBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "completeSourceOfFundsSelectionRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "investmentScheduleId", "Ljava/util/UUID;", "onResume", "setSourceOfFunds", "sourceOfFunds", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationshipId", "updateSourceOfFundsSelection", "getUpdateInvestmentScheduleArgs", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo$UpdateInvestmentScheduleArgs;", "state", "getUpdateInvestmentScheduleObservable", "Lio/reactivex/Observable;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsViewState$UpdateInvestmentScheduleResult;", "args", "UpdateInvestmentScheduleArgs", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderSourceOfFundsDuxo extends OldBaseDuxo<RecurringOrderSourceOfFundsViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final PublishRelay<Unit> completeSourceOfFundsSelectionRelay;
    private final CryptoBuyingPowerStore cryptoBuyingPowerStore;
    private final InstrumentBuyingPowerStore instrumentBuyingPowerStore;
    private final UUID investmentScheduleId;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final LeveredMarginSettingsStore marginSettingsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringOrderSourceOfFundsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiAssetType.values().length];
            try {
                iArr[ApiAssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAssetType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAssetType.BROKERAGE_CASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAssetType.TOKENIZED_STOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiInvestmentSchedule.SourceOfFunds.values().length];
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringOrderSourceOfFundsDuxo(AchRelationshipStore achRelationshipStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, CryptoBuyingPowerStore cryptoBuyingPowerStore, TraderInvestmentScheduleStore investmentScheduleStore, LeveredMarginSettingsStore marginSettingsStore, SavedStateHandle savedStateHandle) {
        InvestmentSchedule investmentSchedule;
        InvestmentSchedule investmentSchedule2;
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        InvestmentTarget investmentTarget = ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs(savedStateHandle)).getInvestmentTarget();
        RecurringOrderActionType actionType = ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs(savedStateHandle)).getActionType();
        InvestmentScheduleAmount.Dollar amount = ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs(savedStateHandle)).getAmount();
        RecurringOrderActionType actionType2 = ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs(savedStateHandle)).getActionType();
        Scheduler scheduler = null;
        Object[] objArr = 0;
        RecurringOrderActionType.Edit edit = actionType2 instanceof RecurringOrderActionType.Edit ? (RecurringOrderActionType.Edit) actionType2 : null;
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = (edit == null || (investmentSchedule2 = edit.getInvestmentSchedule()) == null) ? null : investmentSchedule2.getSourceOfFunds();
        RecurringOrderActionType actionType3 = ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs(savedStateHandle)).getActionType();
        RecurringOrderActionType.Edit edit2 = actionType3 instanceof RecurringOrderActionType.Edit ? (RecurringOrderActionType.Edit) actionType3 : null;
        super(new RecurringOrderSourceOfFundsViewState(null, null, null, null, investmentTarget, actionType, sourceOfFunds, (edit2 == null || (investmentSchedule = edit2.getInvestmentSchedule()) == null) ? null : investmentSchedule.getAchRelationshipId(), amount, null, ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs(savedStateHandle)).getLoggingSource(), ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs(savedStateHandle)).getAccountNumber(), 527, null), scheduler, 2, objArr == true ? 1 : 0);
        this.achRelationshipStore = achRelationshipStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.cryptoBuyingPowerStore = cryptoBuyingPowerStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.marginSettingsStore = marginSettingsStore;
        this.savedStateHandle = savedStateHandle;
        PublishRelay<Unit> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.completeSourceOfFundsSelectionRelay = publishRelayCreate;
        RecurringOrderActionType actionType4 = ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs((HasSavedState) this)).getActionType();
        RecurringOrderActionType.Edit edit3 = actionType4 instanceof RecurringOrderActionType.Edit ? (RecurringOrderActionType.Edit) actionType4 : null;
        this.investmentScheduleId = edit3 != null ? edit3.getInvestmentScheduleId() : null;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        Observable<InstrumentBuyingPower> observableAsObservable;
        Observable map;
        Tuples2<UUID, String> tuples2M3642to;
        Observable<MarginSettings> observableStreamMarginSettingsIndividual;
        Flow<CryptoBuyingPower> flowStreamBuyingPowerForCrypto;
        super.onResume();
        Companion companion = INSTANCE;
        InvestmentTarget investmentTarget = ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs((HasSavedState) this)).getInvestmentTarget();
        UUID instrumentId = investmentTarget.getInstrumentId();
        if (instrumentId == null) {
            throw new IllegalStateException("EquityRecurringOrderSourceOfFundsDuxo requires an instrumentId");
        }
        this.achRelationshipStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getLinkedRelationshipsByState(SetsKt.setOf((Object[]) new ApiAchRelationship.State[]{ApiAchRelationship.State.NEW, ApiAchRelationship.State.APPROVED})), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsDuxo.onResume$lambda$2(this.f$0, (List) obj);
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[investmentTarget.getTargetType().ordinal()];
        if (i == 1) {
            String accountNumber = ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber();
            if (accountNumber == null || (tuples2M3642to = Tuples4.m3642to(instrumentId, accountNumber)) == null || (observableAsObservable = this.instrumentBuyingPowerStore.getStreamSelectedAccountBuyingPowerForInstrument().asObservable(tuples2M3642to)) == null) {
                observableAsObservable = this.instrumentBuyingPowerStore.getStreamIndividualAccountBuyingPowerForInstrument().asObservable(instrumentId);
            }
            map = observableAsObservable.map(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$onResume$buyingPowerObservable$1
                @Override // io.reactivex.functions.Function
                public final Money apply(InstrumentBuyingPower it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getBuyingPowerAmount();
                }
            });
        } else {
            if (i != 2) {
                if (i == 3) {
                    throw new UnsupportedOperationException("This flow doesn't support brokerage cash");
                }
                if (i == 4) {
                    throw new IllegalStateException("This flow doesn't support tokenized stocks");
                }
                throw new NoWhenBranchMatchedException();
            }
            String accountNumber2 = ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber();
            if (accountNumber2 != null) {
                CryptoBuyingPowerStore cryptoBuyingPowerStore = this.cryptoBuyingPowerStore;
                String currencyCode = Currencies.USD.getCurrencyCode();
                Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
                flowStreamBuyingPowerForCrypto = cryptoBuyingPowerStore.streamBuyingPowerForRhsAccountNumber(accountNumber2, currencyCode);
            } else {
                CryptoBuyingPowerStore cryptoBuyingPowerStore2 = this.cryptoBuyingPowerStore;
                String currencyCode2 = Currencies.USD.getCurrencyCode();
                Intrinsics.checkNotNullExpressionValue(currencyCode2, "getCurrencyCode(...)");
                flowStreamBuyingPowerForCrypto = cryptoBuyingPowerStore2.streamBuyingPowerForCrypto(currencyCode2);
            }
            map = asObservable(flowStreamBuyingPowerForCrypto).map(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$onResume$buyingPowerObservable$2
                @Override // io.reactivex.functions.Function
                public final Money apply(CryptoBuyingPower it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getBuyingPower();
                }
            });
        }
        Single singleDoOnSubscribe = map.firstOrError().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo.onResume.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.LOADING_BUYING_POWER_RECURRING_FUNDS, true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsDuxo.onResume$lambda$5(this.f$0, (Money) obj);
            }
        });
        String accountNumber3 = ((RecurringOrderSourceOfFundsFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber3 == null || (observableStreamMarginSettingsIndividual = this.marginSettingsStore.streamMarginSettings(accountNumber3)) == null) {
            observableStreamMarginSettingsIndividual = this.marginSettingsStore.streamMarginSettingsIndividual();
        }
        LifecycleHost.DefaultImpls.bind$default(this, observableStreamMarginSettingsIndividual, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsDuxo.onResume$lambda$8(this.f$0, (MarginSettings) obj);
            }
        });
        Observable<R> map2 = getStates().map(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(this.$receiver$inlined.getUpdateInvestmentScheduleArgs((RecurringOrderSourceOfFundsViewState) it));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((RecurringOrderSourceOfFundsDuxo$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableSwitchMap = ObservablesKt.withLatestFrom(this.completeSourceOfFundsSelectionRelay, com.robinhood.utils.extensions.ObservablesKt.filterIsPresent(map2)).switchMap(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo.onResume.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult> apply(Tuples2<Unit, UpdateInvestmentScheduleArgs> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                UpdateInvestmentScheduleArgs updateInvestmentScheduleArgsComponent2 = tuples2.component2();
                RecurringOrderSourceOfFundsDuxo recurringOrderSourceOfFundsDuxo = RecurringOrderSourceOfFundsDuxo.this;
                Intrinsics.checkNotNull(updateInvestmentScheduleArgsComponent2);
                return recurringOrderSourceOfFundsDuxo.getUpdateInvestmentScheduleObservable(updateInvestmentScheduleArgsComponent2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsDuxo.onResume$lambda$11(this.f$0, (RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult) obj);
            }
        });
        UUID uuid = this.investmentScheduleId;
        if (uuid != null) {
            this.investmentScheduleStore.refresh(false);
            LifecycleHost.DefaultImpls.bind$default(this, this.investmentScheduleStore.getStreamInvestmentSchedule().asObservable(uuid), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderSourceOfFundsDuxo.onResume$lambda$14$lambda$13(this.f$0, (InvestmentSchedule) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(RecurringOrderSourceOfFundsDuxo recurringOrderSourceOfFundsDuxo, final List linkedAchRelationships) {
        Intrinsics.checkNotNullParameter(linkedAchRelationships, "linkedAchRelationships");
        recurringOrderSourceOfFundsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsDuxo.onResume$lambda$2$lambda$1(linkedAchRelationships, (RecurringOrderSourceOfFundsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderSourceOfFundsViewState onResume$lambda$2$lambda$1(List list, RecurringOrderSourceOfFundsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderSourceOfFundsViewState.copy$default(applyMutation, null, list, null, null, null, null, null, null, null, null, null, null, 4093, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(RecurringOrderSourceOfFundsDuxo recurringOrderSourceOfFundsDuxo, final Money money) {
        recurringOrderSourceOfFundsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsDuxo.onResume$lambda$5$lambda$4(money, (RecurringOrderSourceOfFundsViewState) obj);
            }
        });
        IdlingResourceCounters2.setBusy(IdlingResourceType.LOADING_BUYING_POWER_RECURRING_FUNDS, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderSourceOfFundsViewState onResume$lambda$5$lambda$4(Money money, RecurringOrderSourceOfFundsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(money);
        return RecurringOrderSourceOfFundsViewState.copy$default(applyMutation, new RecurringOrderSourceOfFundsViewState.FundingSource.BuyingPower(money), null, null, null, null, null, null, null, null, null, null, null, 4094, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(RecurringOrderSourceOfFundsDuxo recurringOrderSourceOfFundsDuxo, final MarginSettings marginSettings) {
        Intrinsics.checkNotNullParameter(marginSettings, "marginSettings");
        recurringOrderSourceOfFundsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsDuxo.onResume$lambda$8$lambda$7(marginSettings, (RecurringOrderSourceOfFundsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderSourceOfFundsViewState onResume$lambda$8$lambda$7(MarginSettings marginSettings, RecurringOrderSourceOfFundsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderSourceOfFundsViewState.copy$default(applyMutation, null, null, marginSettings, null, null, null, null, null, null, null, null, null, 4091, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(RecurringOrderSourceOfFundsDuxo recurringOrderSourceOfFundsDuxo, final RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult updateInvestmentScheduleResult) {
        recurringOrderSourceOfFundsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsDuxo.onResume$lambda$11$lambda$10(updateInvestmentScheduleResult, (RecurringOrderSourceOfFundsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderSourceOfFundsViewState onResume$lambda$11$lambda$10(RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult updateInvestmentScheduleResult, RecurringOrderSourceOfFundsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderSourceOfFundsViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, updateInvestmentScheduleResult, null, null, 3583, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14$lambda$13(RecurringOrderSourceOfFundsDuxo recurringOrderSourceOfFundsDuxo, final InvestmentSchedule schedule) {
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        recurringOrderSourceOfFundsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsDuxo.onResume$lambda$14$lambda$13$lambda$12(schedule, (RecurringOrderSourceOfFundsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderSourceOfFundsViewState onResume$lambda$14$lambda$13$lambda$12(InvestmentSchedule investmentSchedule, RecurringOrderSourceOfFundsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderSourceOfFundsViewState.copy$default(applyMutation, null, null, null, investmentSchedule, null, null, null, null, null, null, null, null, 4087, null);
    }

    public final void setSourceOfFunds(final ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, final UUID achRelationshipId) {
        int i = sourceOfFunds == null ? -1 : WhenMappings.$EnumSwitchMapping$1[sourceOfFunds.ordinal()];
        if (i != -1) {
            if (i == 1) {
                this.achRelationshipStore.refresh(true);
            } else {
                if (i == 2) {
                    throw new IllegalStateException("Direct deposit is not supported here!\nThis should be handled by EquityRecurringOrderPaycheckSourceDuxo.");
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderSourceOfFundsDuxo.setSourceOfFunds$lambda$15(sourceOfFunds, achRelationshipId, (RecurringOrderSourceOfFundsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderSourceOfFundsViewState setSourceOfFunds$lambda$15(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid, RecurringOrderSourceOfFundsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderSourceOfFundsViewState.copy$default(applyMutation, null, null, null, null, null, null, sourceOfFunds, uuid, null, null, null, null, 3903, null);
    }

    public final void updateSourceOfFundsSelection() {
        this.completeSourceOfFundsSelectionRelay.accept(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateInvestmentScheduleArgs getUpdateInvestmentScheduleArgs(RecurringOrderSourceOfFundsViewState state) {
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = state.getSourceOfFunds();
        if (sourceOfFunds == null) {
            return null;
        }
        return new UpdateInvestmentScheduleArgs(state.getInvestmentScheduleId(), sourceOfFunds, state.getAchRelationshipId(), state.getAmount(), state.getAccountNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult> getUpdateInvestmentScheduleObservable(UpdateInvestmentScheduleArgs args) {
        Observable map;
        final UUID investmentScheduleId = args.getInvestmentScheduleId();
        final ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = args.getSourceOfFunds();
        final UUID achRelationshipId = args.getAchRelationshipId();
        final String accountNumber = args.getAccountNumber();
        if (investmentScheduleId != null) {
            if (sourceOfFunds != ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER) {
                map = TraderInvestmentScheduleStore.updateInvestmentSchedule$default(this.investmentScheduleStore, investmentScheduleId, null, null, sourceOfFunds, achRelationshipId, null, null, null, null, 486, null).toObservable().map(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$getUpdateInvestmentScheduleObservable$obs$1
                    @Override // io.reactivex.functions.Function
                    public final RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult apply(InvestmentSchedule investmentSchedule) {
                        Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
                        InvestmentScheduleAmount investmentScheduleAmount = investmentSchedule.getInvestmentScheduleAmount();
                        Intrinsics.checkNotNull(investmentScheduleAmount, "null cannot be cast to non-null type com.robinhood.recurring.models.InvestmentScheduleAmount.Dollar");
                        return new RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult.Success(new UiEvent(new RecurringOrderSourceOfFundsViewState.InvestmentScheduleUpdate((InvestmentScheduleAmount.Dollar) investmentScheduleAmount, investmentSchedule.getSourceOfFunds(), investmentSchedule.getAchRelationshipId(), accountNumber)), true);
                    }
                });
            } else {
                map = this.investmentScheduleStore.getStreamInvestmentSchedule().asObservable(investmentScheduleId).switchMapSingle(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$getUpdateInvestmentScheduleObservable$obs$2
                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends InvestmentSchedule> apply(InvestmentSchedule investmentSchedule) {
                        Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
                        return this.this$0.investmentScheduleStore.updateInvestmentScheduleBackup(investmentScheduleId, sourceOfFunds, achRelationshipId, investmentSchedule.isBackupAchEnabled() ? achRelationshipId : null);
                    }
                }).map(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo$getUpdateInvestmentScheduleObservable$obs$3
                    @Override // io.reactivex.functions.Function
                    public final RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult apply(InvestmentSchedule investmentSchedule) {
                        Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
                        InvestmentScheduleAmount investmentScheduleAmount = investmentSchedule.getInvestmentScheduleAmount();
                        Intrinsics.checkNotNull(investmentScheduleAmount, "null cannot be cast to non-null type com.robinhood.recurring.models.InvestmentScheduleAmount.Dollar");
                        return new RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult.Success(new UiEvent(new RecurringOrderSourceOfFundsViewState.InvestmentScheduleUpdate((InvestmentScheduleAmount.Dollar) investmentScheduleAmount, investmentSchedule.getSourceOfFunds(), investmentSchedule.getAchRelationshipId(), accountNumber)), false, 2, null);
                    }
                });
            }
            Observable<RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult> observableOnErrorReturn = map.startWith((Observable) RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult.Loading.INSTANCE).onErrorReturn(new Function() { // from class: com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsDuxo.getUpdateInvestmentScheduleObservable.1
                @Override // io.reactivex.functions.Function
                public final RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult apply(Throwable throwable) {
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    return new RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult.Failure(new UiEvent(throwable));
                }
            });
            Intrinsics.checkNotNull(observableOnErrorReturn);
            return observableOnErrorReturn;
        }
        Observable<RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult> observableJust = Observable.just(new RecurringOrderSourceOfFundsViewState.UpdateInvestmentScheduleResult.Success(new UiEvent(new RecurringOrderSourceOfFundsViewState.InvestmentScheduleUpdate(args.getAmount(), sourceOfFunds, achRelationshipId, accountNumber)), false, 2, null));
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RecurringOrderSourceOfFundsDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo$UpdateInvestmentScheduleArgs;", "", "investmentScheduleId", "Ljava/util/UUID;", "sourceOfFunds", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationshipId", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "accountNumber", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;Ljava/lang/String;)V", "getInvestmentScheduleId", "()Ljava/util/UUID;", "getSourceOfFunds", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "getAchRelationshipId", "getAmount", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class UpdateInvestmentScheduleArgs {
        private final String accountNumber;
        private final UUID achRelationshipId;
        private final InvestmentScheduleAmount.Dollar amount;
        private final UUID investmentScheduleId;
        private final ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;

        public static /* synthetic */ UpdateInvestmentScheduleArgs copy$default(UpdateInvestmentScheduleArgs updateInvestmentScheduleArgs, UUID uuid, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid2, InvestmentScheduleAmount.Dollar dollar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = updateInvestmentScheduleArgs.investmentScheduleId;
            }
            if ((i & 2) != 0) {
                sourceOfFunds = updateInvestmentScheduleArgs.sourceOfFunds;
            }
            if ((i & 4) != 0) {
                uuid2 = updateInvestmentScheduleArgs.achRelationshipId;
            }
            if ((i & 8) != 0) {
                dollar = updateInvestmentScheduleArgs.amount;
            }
            if ((i & 16) != 0) {
                str = updateInvestmentScheduleArgs.accountNumber;
            }
            String str2 = str;
            UUID uuid3 = uuid2;
            return updateInvestmentScheduleArgs.copy(uuid, sourceOfFunds, uuid3, dollar, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInvestmentScheduleId() {
            return this.investmentScheduleId;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiInvestmentSchedule.SourceOfFunds getSourceOfFunds() {
            return this.sourceOfFunds;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        /* renamed from: component4, reason: from getter */
        public final InvestmentScheduleAmount.Dollar getAmount() {
            return this.amount;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UpdateInvestmentScheduleArgs copy(UUID investmentScheduleId, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, InvestmentScheduleAmount.Dollar amount, String accountNumber) {
            Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
            return new UpdateInvestmentScheduleArgs(investmentScheduleId, sourceOfFunds, achRelationshipId, amount, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateInvestmentScheduleArgs)) {
                return false;
            }
            UpdateInvestmentScheduleArgs updateInvestmentScheduleArgs = (UpdateInvestmentScheduleArgs) other;
            return Intrinsics.areEqual(this.investmentScheduleId, updateInvestmentScheduleArgs.investmentScheduleId) && this.sourceOfFunds == updateInvestmentScheduleArgs.sourceOfFunds && Intrinsics.areEqual(this.achRelationshipId, updateInvestmentScheduleArgs.achRelationshipId) && Intrinsics.areEqual(this.amount, updateInvestmentScheduleArgs.amount) && Intrinsics.areEqual(this.accountNumber, updateInvestmentScheduleArgs.accountNumber);
        }

        public int hashCode() {
            UUID uuid = this.investmentScheduleId;
            int iHashCode = (((uuid == null ? 0 : uuid.hashCode()) * 31) + this.sourceOfFunds.hashCode()) * 31;
            UUID uuid2 = this.achRelationshipId;
            int iHashCode2 = (iHashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
            InvestmentScheduleAmount.Dollar dollar = this.amount;
            int iHashCode3 = (iHashCode2 + (dollar == null ? 0 : dollar.hashCode())) * 31;
            String str = this.accountNumber;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "UpdateInvestmentScheduleArgs(investmentScheduleId=" + this.investmentScheduleId + ", sourceOfFunds=" + this.sourceOfFunds + ", achRelationshipId=" + this.achRelationshipId + ", amount=" + this.amount + ", accountNumber=" + this.accountNumber + ")";
        }

        public UpdateInvestmentScheduleArgs(UUID uuid, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid2, InvestmentScheduleAmount.Dollar dollar, String str) {
            Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
            this.investmentScheduleId = uuid;
            this.sourceOfFunds = sourceOfFunds;
            this.achRelationshipId = uuid2;
            this.amount = dollar;
            this.accountNumber = str;
        }

        public final UUID getInvestmentScheduleId() {
            return this.investmentScheduleId;
        }

        public final ApiInvestmentSchedule.SourceOfFunds getSourceOfFunds() {
            return this.sourceOfFunds;
        }

        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        public final InvestmentScheduleAmount.Dollar getAmount() {
            return this.amount;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: RecurringOrderSourceOfFundsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment$Args;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecurringOrderSourceOfFundsDuxo, RecurringOrderSourceOfFundsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderSourceOfFundsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringOrderSourceOfFundsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderSourceOfFundsFragment.Args getArgs(RecurringOrderSourceOfFundsDuxo recurringOrderSourceOfFundsDuxo) {
            return (RecurringOrderSourceOfFundsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recurringOrderSourceOfFundsDuxo);
        }
    }
}
