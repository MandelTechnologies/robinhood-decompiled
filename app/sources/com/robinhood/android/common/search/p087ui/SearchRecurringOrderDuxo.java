package com.robinhood.android.common.search.p087ui;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.common.search.p087ui.SearchRecurringOrderDuxo;
import com.robinhood.android.common.search.p087ui.SearchRecurringOrderFragment;
import com.robinhood.android.common.search.p087ui.SearchRecurringOrderViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentPositionStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.bonfire.ListDisclosuresStore;
import com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.models.api.search.extensions.SearchResponses;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListItems;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.p320db.bonfire.ListDisclosure;
import com.robinhood.models.p355ui.InstrumentPosition;
import com.robinhood.recurring.models.RecurringInvestmentsConstants;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.store.search.SearchStore;
import com.robinhood.store.search.SearchStore3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import io.reactivex.Notification;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SearchRecurringOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001HBq\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020$J\b\u0010+\u001a\u00020)H\u0016J\u000e\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020'J\u0006\u0010.\u001a\u00020)J\u000e\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020)2\u0006\u00103\u001a\u000201J\u000e\u00104\u001a\u00020)2\u0006\u00103\u001a\u000201J\u0006\u00105\u001a\u00020)J\u0006\u00106\u001a\u00020)J\u0006\u00107\u001a\u00020)J\u0006\u00108\u001a\u00020)J\b\u00109\u001a\u00020)H\u0002J\b\u0010:\u001a\u00020)H\u0002J\b\u0010;\u001a\u00020)H\u0002J,\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0@H\u0002J\u0010\u0010D\u001a\u00020)2\u0006\u0010=\u001a\u00020EH\u0002J\f\u0010F\u001a\u00020G*\u00020'H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010'0'0#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/SearchRecurringOrderDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "searchStore", "Lcom/robinhood/store/search/SearchStore;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "listDisclosuresStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/search/SearchStore;Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "searchRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "searchItemTappedRelay", "Lcom/robinhood/android/common/search/SearchItem;", "search", "", "query", "onCreate", "onSearchItemTapped", "searchItem", "toggleDisclaimer", "onCardItemTapped", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Ljava/util/UUID;", "onChipInstrumentTapped", "id", "onChipCryptoTapped", "logInstrumentTapped", "logSearchBarTapped", "logSearchResultTapped", "logBrokerageSavingsTapped", "logChipTapped", "logCardTapped", "handleLoading", "handleSuccess", "searchResult", "Lcom/robinhood/store/search/SearchResult$Success;", "positions", "", "Lcom/robinhood/models/db/Position;", "cryptoHoldings", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "handleError", "Lcom/robinhood/store/search/SearchResult$Error;", "toInvestmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "Companion", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SearchRecurringOrderDuxo extends OldBaseDuxo<SearchRecurringOrderViewState> implements HasSavedState {
    private static final InstrumentRecurringTradability BROKERAGE_OPTION_INSTRUMENT;
    private final CryptoHoldingStore cryptoHoldingStore;
    private final CuratedListItemsStore curatedListItemsStore;
    private final CuratedListStore curatedListStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final InstrumentPositionStore instrumentPositionStore;
    private final TraderRecurringTradabilityStore instrumentRecurringTradabilityStore;
    private final InstrumentStore instrumentStore;
    private final ListDisclosuresStore listDisclosuresStore;
    private final PositionStore positionStore;
    private final SavedStateHandle savedStateHandle;
    private final PublishRelay<SearchItem> searchItemTappedRelay;
    private final PublishRelay<String> searchRelay;
    private final SearchStore searchStore;
    private final SweepsInterestStore sweepsInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final void logBrokerageSavingsTapped() {
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchRecurringOrderDuxo(SearchStore searchStore, InstrumentPositionStore instrumentPositionStore, TraderRecurringTradabilityStore instrumentRecurringTradabilityStore, PositionStore positionStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, EventLogger eventLogger, CryptoHoldingStore cryptoHoldingStore, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, ListDisclosuresStore listDisclosuresStore, SweepsInterestStore sweepsInterestStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(searchStore, "searchStore");
        Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
        Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(listDisclosuresStore, "listDisclosuresStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        boolean showCrypto = ((SearchRecurringOrderFragment.Args) companion.getArgs(savedStateHandle)).getShowCrypto();
        boolean showSeparateEtfHoldings = ((SearchRecurringOrderFragment.Args) companion.getArgs(savedStateHandle)).getShowSeparateEtfHoldings();
        boolean maybeShowTopRecurringList = ((SearchRecurringOrderFragment.Args) companion.getArgs(savedStateHandle)).getMaybeShowTopRecurringList();
        SearchRecurringOrderFragment.Args.LearnMoreContent learnMoreContent = ((SearchRecurringOrderFragment.Args) companion.getArgs(savedStateHandle)).getLearnMoreContent();
        CharSequence learnMoreStr = learnMoreContent != null ? learnMoreContent.getLearnMoreStr() : null;
        SearchRecurringOrderFragment.Args.LearnMoreContent learnMoreContent2 = ((SearchRecurringOrderFragment.Args) companion.getArgs(savedStateHandle)).getLearnMoreContent();
        super(new SearchRecurringOrderViewState(null, null, null, null, null, showCrypto, showSeparateEtfHoldings, maybeShowTopRecurringList, null, null, null, false, false, null, null, null, null, null, null, learnMoreStr, learnMoreContent2 != null ? learnMoreContent2.getLearnMoreBtnStr() : null, ((SearchRecurringOrderFragment.Args) companion.getArgs(savedStateHandle)).getIsForPaycheckRecurringInvestments(), ((SearchRecurringOrderFragment.Args) companion.getArgs(savedStateHandle)).getTopContent(), null, 8912671, null), null, 2, null);
        this.searchStore = searchStore;
        this.instrumentPositionStore = instrumentPositionStore;
        this.instrumentRecurringTradabilityStore = instrumentRecurringTradabilityStore;
        this.positionStore = positionStore;
        this.experimentsStore = experimentsStore;
        this.instrumentStore = instrumentStore;
        this.eventLogger = eventLogger;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.curatedListStore = curatedListStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.listDisclosuresStore = listDisclosuresStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.savedStateHandle = savedStateHandle;
        PublishRelay<String> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.searchRelay = publishRelayCreate;
        PublishRelay<SearchItem> publishRelayCreate2 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate2, "create(...)");
        this.searchItemTappedRelay = publishRelayCreate2;
    }

    public final void search(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (query.length() > 0) {
            this.searchRelay.accept(query);
        } else {
            applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchRecurringOrderDuxo.search$lambda$0((SearchRecurringOrderViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState search$lambda$0(SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, false, false, false, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16744447, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentPositionStore.getIndividualAccountHoldingInstrumentPositions(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$2(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.cryptoHoldingStore.streamCryptoHoldings(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$4(this.f$0, (List) obj);
            }
        });
        SweepsInterestStore.refreshNoAccountNumber$default(this.sweepsInterestStore, false, 1, null);
        Observable<Optional<BigDecimal>> observableDistinctUntilChanged = this.sweepsInterestStore.streamInterestNoAccountNumber().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$6(this.f$0, (Optional) obj);
            }
        });
        UUID uuidFromString = UUID.fromString(RecurringInvestmentsConstants.TOP_RECURRING_LIST_ID);
        CuratedListStore curatedListStore = this.curatedListStore;
        Intrinsics.checkNotNull(uuidFromString);
        ApiCuratedList.OwnerType ownerType = ApiCuratedList.OwnerType.ROBINHOOD;
        curatedListStore.refreshList(false, uuidFromString, ownerType);
        LifecycleHost.DefaultImpls.bind$default(this, this.curatedListStore.streamCuratedList(uuidFromString), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$8(this.f$0, (CuratedList) obj);
            }
        });
        CuratedListItemsStore.refreshListItems$default(this.curatedListItemsStore, false, uuidFromString, ownerType, null, null, null, 56, null);
        Observable<CuratedListItems> observableTake = this.curatedListItemsStore.streamCuratedListItems(uuidFromString).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$10(this.f$0, (CuratedListItems) obj);
            }
        });
        Observable<ListDisclosure> observableDistinctUntilChanged2 = this.listDisclosuresStore.stream(uuidFromString, ownerType).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$12(this.f$0, (ListDisclosure) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.RECURRING_FIND_AN_INVESTMENT.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$14(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable observableSwitchMap = this.searchRelay.switchMap(new Function() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo.onCreate.8
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends SearchStore3> apply(String query) {
                List listListOf;
                Intrinsics.checkNotNullParameter(query, "query");
                if (((SearchRecurringOrderFragment.Args) SearchRecurringOrderDuxo.INSTANCE.getArgs((HasSavedState) SearchRecurringOrderDuxo.this)).getShowCrypto()) {
                    listListOf = CollectionsKt.listOf((Object[]) new SearchContentType[]{SearchContentType.CURRENCY_PAIRS, SearchContentType.INSTRUMENTS});
                } else {
                    listListOf = CollectionsKt.listOf(SearchContentType.INSTRUMENTS);
                }
                return SearchStore.search$default(SearchRecurringOrderDuxo.this.searchStore, query, listListOf, null, null, false, null, 60, null);
            }
        }).replay(1).refCount().switchMap(new Function() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo.onCreate.9
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<SearchStore3, Tuples2<List<Position>, List<UiCryptoHolding>>>> apply(final SearchStore3 searchResult) {
                Intrinsics.checkNotNullParameter(searchResult, "searchResult");
                if (!(searchResult instanceof SearchStore3.Success)) {
                    return Observable.just(Tuples4.m3642to(searchResult, new Tuples2(CollectionsKt.emptyList(), CollectionsKt.emptyList())));
                }
                SearchStore3.Success success = (SearchStore3.Success) searchResult;
                List<Instrument> instruments = SearchResponses.getInstruments(success.getResponses());
                List<UiCurrencyPair> currencyPairs = SearchResponses.getCurrencyPairs(success.getResponses());
                if (instruments.isEmpty() && currencyPairs.isEmpty()) {
                    return Observable.just(Tuples4.m3642to(searchResult, new Tuples2(CollectionsKt.emptyList(), CollectionsKt.emptyList())));
                }
                List<Instrument> list = instruments;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Instrument) it.next()).getId());
                }
                Observable<R> observableJust = arrayList.isEmpty() ? Observable.just(Tuples4.m3642to(searchResult, CollectionsKt.emptyList())) : SearchRecurringOrderDuxo.this.positionStore.getIndividualAccountPositionsForInstruments(arrayList).map(new Function() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$onCreate$9$instrumentObs$1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<SearchStore3, List<Position>> apply(List<Position> positions) {
                        Intrinsics.checkNotNullParameter(positions, "positions");
                        return Tuples4.m3642to(searchResult, positions);
                    }
                });
                List<UiCurrencyPair> list2 = currencyPairs;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((UiCurrencyPair) it2.next()).getId());
                }
                Observable<R> observableJust2 = arrayList2.isEmpty() ? Observable.just(Tuples4.m3642to(searchResult, CollectionsKt.emptyList())) : SearchRecurringOrderDuxo.this.cryptoHoldingStore.streamCryptoHoldingList(arrayList2).map(new Function() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$onCreate$9$cryptoObs$1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<SearchStore3, List<UiCryptoHolding>> apply(List<UiCryptoHolding> holding) {
                        Intrinsics.checkNotNullParameter(holding, "holding");
                        return Tuples4.m3642to(searchResult, holding);
                    }
                });
                Observables observables = Observables.INSTANCE;
                Intrinsics.checkNotNull(observableJust);
                Intrinsics.checkNotNull(observableJust2);
                return observables.combineLatest(observableJust, observableJust2).map(new Function() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo.onCreate.9.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<SearchStore3.Success, Tuples2<List<Position>, List<UiCryptoHolding>>> apply(Tuples2<? extends Tuples2<? extends SearchStore3, ? extends List<Position>>, ? extends Tuples2<? extends SearchStore3, ? extends List<UiCryptoHolding>>> tuples2) {
                        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                        return Tuples4.m3642to(searchResult, new Tuples2(tuples2.component1().getSecond(), tuples2.component2().getSecond()));
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$15(this.f$0, (Tuples2) obj);
            }
        });
        Observable<R> observableSwitchMapSingle = this.searchItemTappedRelay.doOnEach(new C1180311()).switchMapSingle(new Function() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo.onCreate.12
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<SearchItem, InstrumentRecurringTradability>> apply(final SearchItem searchItem) {
                Single<InstrumentRecurringTradability> singleNever;
                Intrinsics.checkNotNullParameter(searchItem, "searchItem");
                if (searchItem instanceof SearchItem.CryptoHoldingResult) {
                    singleNever = SearchRecurringOrderDuxo.this.instrumentRecurringTradabilityStore.fetchCryptoRecurringTradable(((SearchItem.CryptoHoldingResult) searchItem).getCurrencyPairId());
                } else if (searchItem instanceof SearchItem.CryptoResult) {
                    singleNever = SearchRecurringOrderDuxo.this.instrumentRecurringTradabilityStore.fetchCryptoRecurringTradable(((SearchItem.CryptoResult) searchItem).getCurrencyPair().getId());
                } else if (searchItem instanceof SearchItem.InstrumentPositionResult) {
                    singleNever = SearchRecurringOrderDuxo.this.instrumentRecurringTradabilityStore.fetchRecurringInstrumentTradable(((SearchItem.InstrumentPositionResult) searchItem).getInstrument().getId());
                } else if (searchItem instanceof SearchItem.InstrumentResult) {
                    singleNever = SearchRecurringOrderDuxo.this.instrumentRecurringTradabilityStore.fetchRecurringInstrumentTradable(((SearchItem.InstrumentResult) searchItem).getInstrument().getId());
                } else if (searchItem instanceof SearchItem.RurSavingsChoice) {
                    singleNever = Single.just(SearchRecurringOrderDuxo.BROKERAGE_OPTION_INSTRUMENT);
                } else {
                    if (!(searchItem instanceof SearchItem.Disclaimer) && !(searchItem instanceof SearchItem.SearchHeaderWithIcon) && !(searchItem instanceof SearchItem.SearchHeader) && !(searchItem instanceof SearchItem.SearchLearnMoreRow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    singleNever = Single.never();
                }
                return singleNever.map(new Function() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo.onCreate.12.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<SearchItem, InstrumentRecurringTradability> apply(InstrumentRecurringTradability tradability) {
                        Intrinsics.checkNotNullParameter(tradability, "tradability");
                        return Tuples4.m3642to(searchItem, tradability);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$17(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$19(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(SearchRecurringOrderDuxo searchRecurringOrderDuxo, final List instrumentPositions) {
        Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
        searchRecurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$2$lambda$1(instrumentPositions, (SearchRecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState onCreate$lambda$2$lambda$1(List list, SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (list.isEmpty()) {
            return SearchRecurringOrderViewState.copy$default(applyMutation, null, new UiEvent(Unit.INSTANCE), null, null, null, false, false, false, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16777213, null);
        }
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, false, false, false, null, null, null, false, false, list, null, null, null, null, null, null, null, false, null, null, 16769023, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(SearchRecurringOrderDuxo searchRecurringOrderDuxo, final List cryptoHoldings) {
        Intrinsics.checkNotNullParameter(cryptoHoldings, "cryptoHoldings");
        searchRecurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$4$lambda$3(cryptoHoldings, (SearchRecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState onCreate$lambda$4$lambda$3(List list, SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, false, false, false, null, null, null, false, false, null, list, null, null, null, null, null, null, false, null, null, 16760831, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(SearchRecurringOrderDuxo searchRecurringOrderDuxo, final Optional optional) {
        searchRecurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$6$lambda$5(optional, (SearchRecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState onCreate$lambda$6$lambda$5(Optional optional, SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, false, false, false, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, (BigDecimal) optional.getOrNull(), 8388607, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(SearchRecurringOrderDuxo searchRecurringOrderDuxo, final CuratedList curatedList) {
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        searchRecurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$8$lambda$7(curatedList, (SearchRecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState onCreate$lambda$8$lambda$7(CuratedList curatedList, SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, false, false, false, curatedList, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16776959, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(SearchRecurringOrderDuxo searchRecurringOrderDuxo, final CuratedListItems curatedListItems) {
        searchRecurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$10$lambda$9(curatedListItems, (SearchRecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState onCreate$lambda$10$lambda$9(CuratedListItems curatedListItems, SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, false, false, false, null, curatedListItems.getListItems(), null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16776703, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$12(SearchRecurringOrderDuxo searchRecurringOrderDuxo, final ListDisclosure listDisclosure) {
        searchRecurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$12$lambda$11(listDisclosure, (SearchRecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState onCreate$lambda$12$lambda$11(ListDisclosure listDisclosure, SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, false, false, false, null, null, listDisclosure, false, false, null, null, null, null, null, null, null, null, false, null, null, 16776191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$14(SearchRecurringOrderDuxo searchRecurringOrderDuxo, final boolean z) {
        searchRecurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$14$lambda$13(z, (SearchRecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState onCreate$lambda$14$lambda$13(boolean z, SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, false, false, false, null, null, null, false, z, null, null, null, null, null, null, null, null, false, null, null, 16773119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$15(SearchRecurringOrderDuxo searchRecurringOrderDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        SearchStore3 searchStore3 = (SearchStore3) objComponent1;
        Tuples2 tuples22 = (Tuples2) tuples2.component2();
        if (searchStore3 instanceof SearchStore3.Loading) {
            searchRecurringOrderDuxo.handleLoading();
        } else if (searchStore3 instanceof SearchStore3.Success) {
            searchRecurringOrderDuxo.handleSuccess((SearchStore3.Success) searchStore3, (List) tuples22.getFirst(), (List) tuples22.getSecond());
        } else {
            if (!(searchStore3 instanceof SearchStore3.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            searchRecurringOrderDuxo.handleError((SearchStore3.Error) searchStore3);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SearchRecurringOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$onCreate$11 */
    static final class C1180311<T> implements Consumer {
        C1180311() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Notification<SearchItem> notification) {
            SearchRecurringOrderDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$onCreate$11$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchRecurringOrderDuxo.C1180311.accept$lambda$0((SearchRecurringOrderViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchRecurringOrderViewState accept$lambda$0(SearchRecurringOrderViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, new UiEvent(Boolean.TRUE), new UiEvent(Boolean.FALSE), null, false, false, false, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16777203, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$17(final SearchRecurringOrderDuxo searchRecurringOrderDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        final SearchItem searchItem = (SearchItem) objComponent1;
        Object objComponent2 = tuples2.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
        final InstrumentRecurringTradability instrumentRecurringTradability = (InstrumentRecurringTradability) objComponent2;
        searchRecurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$17$lambda$16(this.f$0, searchItem, instrumentRecurringTradability, (SearchRecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState onCreate$lambda$17$lambda$16(SearchRecurringOrderDuxo searchRecurringOrderDuxo, SearchItem searchItem, InstrumentRecurringTradability instrumentRecurringTradability, SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, new UiEvent(Boolean.FALSE), new UiEvent(Boolean.TRUE), new UiEvent(new SearchRecurringOrderViewState.SearchItemClickEventResult(searchRecurringOrderDuxo.toInvestmentTarget(searchItem), instrumentRecurringTradability)), false, false, false, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16777187, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$19(SearchRecurringOrderDuxo searchRecurringOrderDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        searchRecurringOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCreate$lambda$19$lambda$18((SearchRecurringOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState onCreate$lambda$19$lambda$18(SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, new UiEvent(Boolean.FALSE), new UiEvent(Boolean.TRUE), null, false, false, false, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16777187, null);
    }

    public final void onSearchItemTapped(SearchItem searchItem) {
        Intrinsics.checkNotNullParameter(searchItem, "searchItem");
        this.searchItemTappedRelay.accept(searchItem);
    }

    public final void toggleDisclaimer() {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.toggleDisclaimer$lambda$20((SearchRecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState toggleDisclaimer$lambda$20(SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, null, null, null, false, false, false, null, null, null, !applyMutation.getDisclaimerExpanded(), false, null, null, null, null, null, null, null, null, false, null, null, 16775167, null);
    }

    public final void onCardItemTapped(UUID item) {
        Intrinsics.checkNotNullParameter(item, "item");
        logCardTapped();
        this.instrumentStore.refresh(false, item);
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentStore.getInstrument(item), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onCardItemTapped$lambda$21(this.f$0, (Instrument) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCardItemTapped$lambda$21(SearchRecurringOrderDuxo searchRecurringOrderDuxo, Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        searchRecurringOrderDuxo.searchItemTappedRelay.accept(new SearchItem.InstrumentResult(instrument, instrument.getCanBuyFractional(), false, 4, null));
        return Unit.INSTANCE;
    }

    public final void onChipInstrumentTapped(final UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        logChipTapped();
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentPositionStore.getIndividualAccountHoldingInstrumentPositions(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onChipInstrumentTapped$lambda$23(this.f$0, id, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onChipInstrumentTapped$lambda$23(SearchRecurringOrderDuxo searchRecurringOrderDuxo, UUID uuid, List instrumentPositions) {
        Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
        Object obj = null;
        boolean z = false;
        for (Object obj2 : instrumentPositions) {
            if (Intrinsics.areEqual(((InstrumentPosition) obj2).getInstrument().getId(), uuid)) {
                if (z) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z = true;
                obj = obj2;
            }
        }
        if (z) {
            InstrumentPosition instrumentPosition = (InstrumentPosition) obj;
            if (instrumentPosition.getPosition() != null) {
                Instrument instrument = instrumentPosition.getInstrument();
                Position position = instrumentPosition.getPosition();
                Intrinsics.checkNotNull(position);
                searchRecurringOrderDuxo.searchItemTappedRelay.accept(new SearchItem.InstrumentPositionResult(instrument, position, instrumentPosition.getInstrument().getCanBuyFractional(), false, 8, null));
            }
            return Unit.INSTANCE;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void onChipCryptoTapped(final UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        logChipTapped();
        LifecycleHost.DefaultImpls.bind$default(this, this.cryptoHoldingStore.streamCryptoHoldings(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.onChipCryptoTapped$lambda$25(this.f$0, id, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onChipCryptoTapped$lambda$25(SearchRecurringOrderDuxo searchRecurringOrderDuxo, UUID uuid, List cryptoHoldings) {
        Intrinsics.checkNotNullParameter(cryptoHoldings, "cryptoHoldings");
        Object obj = null;
        boolean z = false;
        for (Object obj2 : cryptoHoldings) {
            if (Intrinsics.areEqual(((UiCryptoHolding) obj2).getCurrency().getId(), uuid)) {
                if (z) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z = true;
                obj = obj2;
            }
        }
        if (z) {
            UiCryptoHolding uiCryptoHolding = (UiCryptoHolding) obj;
            searchRecurringOrderDuxo.searchItemTappedRelay.accept(new SearchItem.CryptoHoldingResult(uiCryptoHolding.getCurrencyPairId(), uiCryptoHolding.getCurrency(), uiCryptoHolding.getQuantity()));
            return Unit.INSTANCE;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void logInstrumentTapped() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.ENTER_RECURRING_CREATION, new Screen(Screen.Name.RECURRING_FIND_INVESTMENT_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.ASSET_ROW, null, null, 6, null), null, null, false, 56, null);
    }

    public final void logSearchBarTapped() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.RECURRING_FIND_INVESTMENT_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.SEARCH_BAR, null, null, 6, null), null, null, false, 57, null);
    }

    public final void logSearchResultTapped() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.ENTER_RECURRING_CREATION, new Screen(Screen.Name.RECURRING_FIND_INVESTMENT_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.SEARCH_RESULT_ROW, null, null, 6, null), null, null, false, 56, null);
    }

    private final void logChipTapped() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.ENTER_RECURRING_CREATION, new Screen(Screen.Name.RECURRING_FIND_INVESTMENT_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.CHIP, null, null, 6, null), null, null, false, 56, null);
    }

    private final void logCardTapped() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.ENTER_RECURRING_CREATION, new Screen(Screen.Name.RECURRING_FIND_INVESTMENT_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.ASSET_CARD, null, null, 6, null), null, null, false, 56, null);
    }

    private final void handleLoading() {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.handleLoading$lambda$26((SearchRecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState handleLoading$lambda$26(SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, new UiEvent(Boolean.TRUE), null, null, false, false, false, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16777210, null);
    }

    private final void handleSuccess(final SearchStore3.Success searchResult, final List<Position> positions, final List<UiCryptoHolding> cryptoHoldings) {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.handleSuccess$lambda$27(searchResult, positions, cryptoHoldings, (SearchRecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState handleSuccess$lambda$27(SearchStore3.Success success, List list, List list2, SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, null, null, new UiEvent(Boolean.FALSE), null, null, false, false, false, null, null, null, false, false, null, null, success, list, list2, null, null, null, false, null, null, 16547834, null);
    }

    private final void handleError(final SearchStore3.Error searchResult) {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchRecurringOrderDuxo.handleError$lambda$28(searchResult, (SearchRecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchRecurringOrderViewState handleError$lambda$28(SearchStore3.Error error, SearchRecurringOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SearchRecurringOrderViewState.copy$default(applyMutation, new UiEvent(error.getThrowable()), null, new UiEvent(Boolean.FALSE), null, null, false, false, false, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16777210, null);
    }

    private final InvestmentTarget toInvestmentTarget(SearchItem searchItem) {
        if (searchItem instanceof SearchItem.CryptoHoldingResult) {
            return new InvestmentTarget(((SearchItem.CryptoHoldingResult) searchItem).getCurrencyPairId(), null, ApiAssetType.CRYPTO);
        }
        if (searchItem instanceof SearchItem.CryptoResult) {
            SearchItem.CryptoResult cryptoResult = (SearchItem.CryptoResult) searchItem;
            return new InvestmentTarget(cryptoResult.getCurrencyPair().getId(), cryptoResult.getCurrencyPair().getDisplaySymbol(), ApiAssetType.CRYPTO);
        }
        if (searchItem instanceof SearchItem.InstrumentPositionResult) {
            SearchItem.InstrumentPositionResult instrumentPositionResult = (SearchItem.InstrumentPositionResult) searchItem;
            return new InvestmentTarget(instrumentPositionResult.getInstrument().getId(), instrumentPositionResult.getInstrument().getDisplaySymbol(), ApiAssetType.EQUITY);
        }
        if (searchItem instanceof SearchItem.InstrumentResult) {
            SearchItem.InstrumentResult instrumentResult = (SearchItem.InstrumentResult) searchItem;
            return new InvestmentTarget(instrumentResult.getInstrument().getId(), instrumentResult.getInstrument().getDisplaySymbol(), ApiAssetType.EQUITY);
        }
        if (searchItem instanceof SearchItem.RurSavingsChoice) {
            return new InvestmentTarget(null, null, ApiAssetType.BROKERAGE_CASH);
        }
        if (!(searchItem instanceof SearchItem.Disclaimer) && !(searchItem instanceof SearchItem.SearchHeaderWithIcon) && !(searchItem instanceof SearchItem.SearchHeader) && !(searchItem instanceof SearchItem.SearchLearnMoreRow)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Not a suitable investment target");
    }

    /* compiled from: SearchRecurringOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/SearchRecurringOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderDuxo;", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Args;", "<init>", "()V", "BROKERAGE_OPTION_INSTRUMENT", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SearchRecurringOrderDuxo, SearchRecurringOrderFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SearchRecurringOrderFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (SearchRecurringOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SearchRecurringOrderFragment.Args getArgs(SearchRecurringOrderDuxo searchRecurringOrderDuxo) {
            return (SearchRecurringOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, searchRecurringOrderDuxo);
        }
    }

    static {
        UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-00000000000");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        BROKERAGE_OPTION_INSTRUMENT = new InstrumentRecurringTradability(uuidFromString, true, null);
    }
}
