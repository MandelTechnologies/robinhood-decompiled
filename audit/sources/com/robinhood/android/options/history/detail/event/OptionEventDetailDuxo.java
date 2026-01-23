package com.robinhood.android.options.history.detail.event;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.contracts.PnlHubContract2;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.options.contracts.OptionEventDetailFragmentKey;
import com.robinhood.android.options.history.detail.event.OptionEventDetailEvent;
import com.robinhood.android.options.history.detail.event.OptionEventDetailViewState;
import com.robinhood.android.portfolio.pnl.ProfitAndLossDetailStore;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem2;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionEventStore;
import com.robinhood.librobinhood.data.store.OptionExerciseStore;
import com.robinhood.models.api.ApiOptionEvent;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.shared.history.compose.Underlying;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossItemResponseDto;
import wormhole.service.p554v1.RealizedGainLossItemDto;

/* compiled from: OptionEventDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001'Bi\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010$\u001a\u00020%H\u0016J\u0006\u0010&\u001a\u00020%R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDataState;", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailViewState;", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionEventStore", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "optionExerciseStore", "Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "profitAndLossDetailStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionEventStore;Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/options/history/detail/event/OptionEventDetailStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "optionEventId", "Ljava/util/UUID;", "onStart", "", "onCancelButtonClicked", "Companion", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionEventDetailDuxo extends BaseDuxo3<OptionEventDetailDataState, OptionEventDetailViewState, OptionEventDetailEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private final IndexStore indexStore;
    private final InstrumentStore instrumentStore;
    private final MarketHoursStore marketHoursStore;
    private final OptionChainStore optionChainStore;
    private final UUID optionEventId;
    private final OptionEventStore optionEventStore;
    private final OptionExerciseStore optionExerciseStore;
    private final ProfitAndLossDetailStore profitAndLossDetailStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionEventDetailDuxo(AccountProvider accountProvider, IndexStore indexStore, InstrumentStore instrumentStore, OptionEventStore optionEventStore, OptionExerciseStore optionExerciseStore, ExperimentsStore experimentsStore, ProfitAndLossDetailStore profitAndLossDetailStore, MarketHoursStore marketHoursStore, OptionChainStore optionChainStore, DuxoBundle duxoBundle, OptionEventDetailStateProvider stateProvider, SavedStateHandle savedStateHandle) {
        super(new OptionEventDetailDataState(null, null, null, null, false, null, null, false, 255, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
        Intrinsics.checkNotNullParameter(optionExerciseStore, "optionExerciseStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.indexStore = indexStore;
        this.instrumentStore = instrumentStore;
        this.optionEventStore = optionEventStore;
        this.optionExerciseStore = optionExerciseStore;
        this.experimentsStore = experimentsStore;
        this.profitAndLossDetailStore = profitAndLossDetailStore;
        this.marketHoursStore = marketHoursStore;
        this.optionChainStore = optionChainStore;
        this.savedStateHandle = savedStateHandle;
        this.optionEventId = ((OptionEventDetailFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getOptionEventId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.optionEventStore.refreshWithAllAccounts(false);
        Observable<UiOptionEvent> observableShare = this.optionEventStore.getOptionEvent(this.optionEventId).share();
        Observable<R> map = observableShare.map(new Function() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$accountNumberObservable$1
            @Override // io.reactivex.functions.Function
            public final String apply(UiOptionEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionEvent().getAccountNumber();
            }
        });
        Observable<R> observableFlatMap = observableShare.flatMap(new Function() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$uiOptionChainObs$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiOptionChain> apply(UiOptionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return this.this$0.optionChainStore.getStreamUiOptionChain().asObservable(event.getOptionInstrument().getOptionChainId());
            }
        });
        Intrinsics.checkNotNull(observableFlatMap);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableFlatMap), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionEventDetailDuxo.onStart$lambda$0(this.f$0, (UiOptionChain) obj);
            }
        });
        Observable observableSwitchMap = observableFlatMap.switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo.onStart.2

            /* compiled from: OptionEventDetailDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OptionChain.UnderlyingType.values().length];
                    try {
                        iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Underlying>> apply(UiOptionChain uiOptionChain) {
                Observable optionals;
                Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
                OptionChain.UnderlyingType underlyingType = uiOptionChain.getUnderlyingType();
                UUID indexUnderlyingId = uiOptionChain.getIndexUnderlyingId();
                UUID singleEquityUnderlyingId = uiOptionChain.getSingleEquityUnderlyingId();
                int i = WhenMappings.$EnumSwitchMapping$0[underlyingType.ordinal()];
                Observable<R> map2 = null;
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (indexUnderlyingId != null) {
                        OptionEventDetailDuxo optionEventDetailDuxo = OptionEventDetailDuxo.this;
                        map2 = optionEventDetailDuxo.asObservable(optionEventDetailDuxo.indexStore.streamIndex(indexUnderlyingId)).map(new Function() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$2$underlyingObs$2$1
                            @Override // io.reactivex.functions.Function
                            public final Underlying.Index apply(Index index) {
                                Intrinsics.checkNotNullParameter(index, "index");
                                return new Underlying.Index(index.getSymbol(), index.getId());
                            }
                        });
                    }
                } else if (singleEquityUnderlyingId != null) {
                    map2 = OptionEventDetailDuxo.this.instrumentStore.getInstrument(singleEquityUnderlyingId).map(new Function() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$2$underlyingObs$1$1
                        @Override // io.reactivex.functions.Function
                        public final Underlying.Equity apply(Instrument instrument) {
                            Intrinsics.checkNotNullParameter(instrument, "instrument");
                            return new Underlying.Equity(instrument.getSymbol(), null, 2, null);
                        }
                    });
                }
                return (map2 == null || (optionals = ObservablesKt.toOptionals(map2)) == null) ? Observable.just(Optional2.INSTANCE) : optionals;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionEventDetailDuxo.onStart$lambda$1(this.f$0, (Optional) obj);
            }
        });
        ObservableSource observableSourceSwitchMapSingle = observableShare.distinctUntilChanged((Function<? super UiOptionEvent, K>) new Function() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$pnlItemObservable$1
            @Override // io.reactivex.functions.Function
            public final Tuples2<UUID, String> apply(UiOptionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return Tuples4.m3642to(event.getId(), event.getOptionEvent().getAccountNumber());
            }
        }).switchMapSingle(new Function() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$pnlItemObservable$2

            /* compiled from: OptionEventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$pnlItemObservable$2$1", m3645f = "OptionEventDetailDuxo.kt", m3646l = {109}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$pnlItemObservable$2$1 */
            static final class C230971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends ProfitAndLossTradeItem>>, Object> {
                final /* synthetic */ UiOptionEvent $event;
                int label;
                final /* synthetic */ OptionEventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C230971(OptionEventDetailDuxo optionEventDetailDuxo, UiOptionEvent uiOptionEvent, Continuation<? super C230971> continuation) {
                    super(2, continuation);
                    this.this$0 = optionEventDetailDuxo;
                    this.$event = uiOptionEvent;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C230971(this.this$0, this.$event, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends ProfitAndLossTradeItem>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super Optional<ProfitAndLossTradeItem>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<ProfitAndLossTradeItem>> continuation) {
                    return ((C230971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ProfitAndLossDetailStore profitAndLossDetailStore = this.this$0.profitAndLossDetailStore;
                        UUID id = this.$event.getId();
                        AssetClassDto assetClassDto = AssetClassDto.ASSET_CLASS_OPTION;
                        String accountNumber = this.$event.getOptionEvent().getAccountNumber();
                        this.label = 1;
                        obj = profitAndLossDetailStore.getItem(id, assetClassDto, accountNumber, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    RealizedGainLossItemDto item = ((GetRealizedGainLossItemResponseDto) obj).getItem();
                    return Optional3.asOptional(item != null ? ProfitAndLossTradeItem2.toDbModel(item, null, null) : null);
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<ProfitAndLossTradeItem>> apply(UiOptionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return RxFactory.DefaultImpls.rxSingle$default(this.this$0.getRxFactory(), null, new C230971(this.this$0, event, null), 1, null).onErrorReturn(new Function() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$pnlItemObservable$2.2
                    @Override // io.reactivex.functions.Function
                    public final Optional<ProfitAndLossTradeItem> apply(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional2.INSTANCE;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSourceSwitchMapSingle, "switchMapSingle(...)");
        Observables observables = Observables.INSTANCE;
        final AccountProvider accountProvider = this.accountProvider;
        Observable observableSwitchMap2 = map.switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo.onStart.4
            @Override // io.reactivex.functions.Function
            public final Observable<Account> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return accountProvider.streamAccount(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        Intrinsics.checkNotNull(observableShare);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observables.combineLatest(observableSwitchMap2, observableShare, observableSourceSwitchMapSingle)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionEventDetailDuxo.onStart$lambda$2(this.f$0, (Tuples3) obj);
            }
        });
        Observable<R> observableFlatMap2 = observableShare.flatMap(new Function() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo.onStart.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarketHours> apply(UiOptionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                OptionEventDetailDuxo.this.marketHoursStore.refresh(false, event.getOptionEvent().getEventDate());
                return OptionEventDetailDuxo.this.marketHoursStore.getMarketHours(event.getOptionEvent().getEventDate());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap2, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionEventDetailDuxo.onStart$lambda$3(this.f$0, (MarketHours) obj);
            }
        });
        getLifecycleScope().launchWhenStarted(new C230968(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(OptionEventDetailDuxo optionEventDetailDuxo, UiOptionChain uiOptionChain) {
        optionEventDetailDuxo.applyMutation(new OptionEventDetailDuxo$onStart$1$1(uiOptionChain, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(OptionEventDetailDuxo optionEventDetailDuxo, Optional optional) {
        optionEventDetailDuxo.applyMutation(new OptionEventDetailDuxo$onStart$3$1((Underlying) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(OptionEventDetailDuxo optionEventDetailDuxo, Tuples3 tuples3) {
        Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
        optionEventDetailDuxo.applyMutation(new OptionEventDetailDuxo$onStart$5$1((Account) tuples3.component1(), (UiOptionEvent) tuples3.component2(), (Optional) tuples3.component3(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(OptionEventDetailDuxo optionEventDetailDuxo, MarketHours marketHours) {
        optionEventDetailDuxo.applyMutation(new OptionEventDetailDuxo$onStart$7$1(marketHours, null));
        return Unit.INSTANCE;
    }

    /* compiled from: OptionEventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$8", m3645f = "OptionEventDetailDuxo.kt", m3646l = {151}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$8 */
    static final class C230968 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C230968(Continuation<? super C230968> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionEventDetailDuxo.this.new C230968(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C230968) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(OptionEventDetailDuxo.this.experimentsStore, new Experiment[]{PnlHubContract2.INSTANCE}, false, null, 6, null));
                final OptionEventDetailDuxo optionEventDetailDuxo = OptionEventDetailDuxo.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo.onStart.8.1

                    /* compiled from: OptionEventDetailDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$8$1$1", m3645f = "OptionEventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$8$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C503261 extends ContinuationImpl7 implements Function2<OptionEventDetailDataState, Continuation<? super OptionEventDetailDataState>, Object> {
                        final /* synthetic */ boolean $pnlUpdatesEnabled;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C503261(boolean z, Continuation<? super C503261> continuation) {
                            super(2, continuation);
                            this.$pnlUpdatesEnabled = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C503261 c503261 = new C503261(this.$pnlUpdatesEnabled, continuation);
                            c503261.L$0 = obj;
                            return c503261;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionEventDetailDataState optionEventDetailDataState, Continuation<? super OptionEventDetailDataState> continuation) {
                            return ((C503261) create(optionEventDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return OptionEventDetailDataState.copy$default((OptionEventDetailDataState) this.L$0, null, null, null, null, false, null, null, this.$pnlUpdatesEnabled, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        optionEventDetailDuxo.applyMutation(new C503261(z, null));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: OptionEventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onCancelButtonClicked$1", m3645f = "OptionEventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onCancelButtonClicked$1 */
    static final class C230901 extends ContinuationImpl7 implements Function2<OptionEventDetailDataState, Continuation<? super OptionEventDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C230901(Continuation<? super C230901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C230901 c230901 = new C230901(continuation);
            c230901.L$0 = obj;
            return c230901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionEventDetailDataState optionEventDetailDataState, Continuation<? super OptionEventDetailDataState> continuation) {
            return ((C230901) create(optionEventDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionEventDetailDataState.copy$default((OptionEventDetailDataState) this.L$0, null, null, null, null, true, null, null, false, 239, null);
        }
    }

    public final void onCancelButtonClicked() {
        applyMutation(new C230901(null));
        Completable completableDoOnTerminate = CompletablesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxCompletable$default(this, null, new C230912(null), 1, null)).doOnTerminate(new Action() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo.onCancelButtonClicked.3

            /* compiled from: OptionEventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onCancelButtonClicked$3$1", m3645f = "OptionEventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onCancelButtonClicked$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionEventDetailDataState, Continuation<? super OptionEventDetailDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionEventDetailDataState optionEventDetailDataState, Continuation<? super OptionEventDetailDataState> continuation) {
                    return ((AnonymousClass1) create(optionEventDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionEventDetailDataState.copy$default((OptionEventDetailDataState) this.L$0, null, null, null, null, false, null, null, false, 239, null);
                }
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                OptionEventDetailDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnTerminate, "doOnTerminate(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnTerminate, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionEventDetailDuxo.onCancelButtonClicked$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: OptionEventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onCancelButtonClicked$2", m3645f = "OptionEventDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onCancelButtonClicked$2 */
    static final class C230912 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C230912(Continuation<? super C230912> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionEventDetailDuxo.this.new C230912(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C230912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (r10 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionEventDetailViewState> stateFlow = OptionEventDetailDuxo.this.getStateFlow();
                Flow<String> flow = new Flow<String>() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onCancelButtonClicked$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onCancelButtonClicked$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onCancelButtonClicked$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionEventDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onCancelButtonClicked$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Account account;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                OptionEventDetailViewState optionEventDetailViewState = (OptionEventDetailViewState) obj;
                                String accountNumber = null;
                                OptionEventDetailViewState.Ready ready = optionEventDetailViewState instanceof OptionEventDetailViewState.Ready ? (OptionEventDetailViewState.Ready) optionEventDetailViewState : null;
                                if (ready != null && (account = ready.getAccount()) != null) {
                                    accountNumber = account.getAccountNumber();
                                }
                                if (accountNumber != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                this.label = 1;
                obj = FlowKt.firstOrNull(flow, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((ApiOptionEvent) obj).toDbModel();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            if (str != null) {
                PostEndpoint<Tuples2<UUID, String>, ApiOptionEvent> cancelOptionExercise = OptionEventDetailDuxo.this.optionExerciseStore.getCancelOptionExercise();
                Tuples2 tuples2M3642to = Tuples4.m3642to(OptionEventDetailDuxo.this.optionEventId, str);
                this.label = 2;
                obj = PostEndpoint.DefaultImpls.post$default(cancelOptionExercise, tuples2M3642to, null, this, 2, null);
            } else {
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancelButtonClicked$lambda$5(OptionEventDetailDuxo optionEventDetailDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        optionEventDetailDuxo.submit(new OptionEventDetailEvent.CancelExerciseErrorEvent(throwable));
        return Unit.INSTANCE;
    }

    /* compiled from: OptionEventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDuxo;", "Lcom/robinhood/android/options/contracts/OptionEventDetailFragmentKey;", "<init>", "()V", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionEventDetailDuxo, OptionEventDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionEventDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (OptionEventDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionEventDetailFragmentKey getArgs(OptionEventDetailDuxo optionEventDetailDuxo) {
            return (OptionEventDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, optionEventDetailDuxo);
        }
    }
}
