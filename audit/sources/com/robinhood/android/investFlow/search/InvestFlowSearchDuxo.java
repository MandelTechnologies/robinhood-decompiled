package com.robinhood.android.investFlow.search;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.core.InvestFlowBasketItem;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowDiscoveryPageResponse;
import com.robinhood.librobinhood.data.store.EtpDetailsStore;
import com.robinhood.librobinhood.data.store.InstrumentPositionStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore;
import com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore;
import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.store.search.SearchStore;
import com.robinhood.store.search.SearchStore3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestFlowSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001IBY\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u001eJ\u0014\u0010+\u001a\u00020&2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-J\u000e\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020(J\b\u00101\u001a\u00020&H\u0016J\u0006\u00102\u001a\u00020&J\u000e\u00103\u001a\u00020&2\u0006\u00104\u001a\u000205J\b\u00106\u001a\u00020&H\u0016J\u0018\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020.2\b\b\u0002\u00109\u001a\u00020(J\u0010\u0010:\u001a\u00020&2\u0006\u00108\u001a\u00020.H\u0002J$\u00107\u001a\u00020&2\u0006\u0010;\u001a\u00020<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0002\u00109\u001a\u00020(J\u0018\u0010>\u001a\u00020&2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<H\u0002J\u000e\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020<J\u0006\u0010A\u001a\u00020&J\u0010\u0010B\u001a\u00020&2\u0006\u0010C\u001a\u00020<H\u0002J\b\u0010D\u001a\u00020&H\u0002J\b\u0010E\u001a\u00020&H\u0002J\b\u0010F\u001a\u00020&H\u0002J\b\u0010G\u001a\u00020&H\u0002J\b\u0010H\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/InvestFlowSearchDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/investFlow/search/InvestFlowSearchViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "listsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "searchStore", "Lcom/robinhood/store/search/SearchStore;", "investFlowStore", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/store/search/SearchStore;Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "searchRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext;", "searchScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "discoverScreen", "focusOnSearch", "", "focused", "", "search", "query", "setSelectedItems", "selectedItems", "", "Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem;", "enableSearchItems", "enable", "onStart", "refreshDiscovery", "searchItemTap", "searchItem", "Lcom/robinhood/android/common/search/SearchItem;", "onStop", "onItemClicked", "basketItem", "isDoubleClick", "showProspectus", "assetId", "Ljava/util/UUID;", "listId", "logItemDoubleClick", "deleteItem", "deletedId", "logSearchAppear", "logSearchItemTap", "id", "logDiscoverAppear", "logDiscoverDisappear", "logSearchFocus", "logSearchType", "logClearSearch", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowSearchDuxo extends OldBaseDuxo<InvestFlowSearchViewState> implements HasSavedState {
    private static final String LOGGING_ID_STOCKS = "Stocks N ETFs";
    private final AccountProvider accountProvider;
    private final Screen discoverScreen;
    private final EtpDetailsStore etpDetailsStore;
    private final EventLogger eventLogger;
    private final InstrumentPositionStore instrumentPositionStore;
    private final TraderRecurringTradabilityStore instrumentRecurringTradabilityStore;
    private final InstrumentStore instrumentStore;
    private final InvestFlowStore investFlowStore;
    private final CuratedListStore listsStore;
    private InvestFlowContext loggingContext;
    private final SavedStateHandle savedStateHandle;
    private final PublishRelay<String> searchRelay;
    private final Screen searchScreen;
    private final SearchStore searchStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final StringResource tooManyItemsStringResource = StringResource.INSTANCE.invoke(C19349R.string.invest_flow_too_many_items, new Object[0]);

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestFlowSearchDuxo(AccountProvider accountProvider, EtpDetailsStore etpDetailsStore, InstrumentStore instrumentStore, InstrumentPositionStore instrumentPositionStore, CuratedListStore listsStore, SearchStore searchStore, InvestFlowStore investFlowStore, EventLogger eventLogger, TraderRecurringTradabilityStore instrumentRecurringTradabilityStore, SavedStateHandle savedStateHandle) {
        super(new InvestFlowSearchViewState(false, null, ((InvestFlowSearchArgs) INSTANCE.getArgs(savedStateHandle)).getSelectedItems(), null, null, null, null, null, null, null, null, null, 4091, null), null, 2, null);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
        Intrinsics.checkNotNullParameter(listsStore, "listsStore");
        Intrinsics.checkNotNullParameter(searchStore, "searchStore");
        Intrinsics.checkNotNullParameter(investFlowStore, "investFlowStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.etpDetailsStore = etpDetailsStore;
        this.instrumentStore = instrumentStore;
        this.instrumentPositionStore = instrumentPositionStore;
        this.listsStore = listsStore;
        this.searchStore = searchStore;
        this.investFlowStore = investFlowStore;
        this.eventLogger = eventLogger;
        this.instrumentRecurringTradabilityStore = instrumentRecurringTradabilityStore;
        this.savedStateHandle = savedStateHandle;
        PublishRelay<String> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.searchRelay = publishRelayCreate;
        this.searchScreen = new Screen(Screen.Name.INVEST_FLOW_SEARCH, null, LOGGING_ID_STOCKS, null, 10, null);
        this.discoverScreen = new Screen(Screen.Name.INVEST_FLOW_DISCOVER, null, LOGGING_ID_STOCKS, null, 10, null);
    }

    public final void focusOnSearch(final boolean focused) {
        logSearchFocus();
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.focusOnSearch$lambda$0(focused, (InvestFlowSearchViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState focusOnSearch$lambda$0(boolean z, InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, z, null, null, null, null, null, null, null, null, null, null, null, 4094, null);
    }

    public final void search(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (query.length() > 0) {
            this.searchRelay.accept(query);
            logSearchType();
        } else {
            logClearSearch();
            applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowSearchDuxo.search$lambda$1((InvestFlowSearchViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState search$lambda$1(InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, null, null, null, null, null, null, null, null, null, null, 4093, null);
    }

    public final void setSelectedItems(final List<? extends InvestFlowBasketItem> selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.setSelectedItems$lambda$2(selectedItems, (InvestFlowSearchViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState setSelectedItems$lambda$2(List list, InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, list, null, null, null, null, null, null, null, null, null, 4091, null);
    }

    public final void enableSearchItems(final boolean enable) {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.enableSearchItems$lambda$3(enable, (InvestFlowSearchViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState enableSearchItems$lambda$3(boolean z, InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, null, new UiEvent(Boolean.valueOf(z)), null, null, null, null, null, null, null, null, 4087, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        AccountProvider accountProvider = this.accountProvider;
        Companion companion = INSTANCE;
        Single<Account> singleFirstOrError = accountProvider.streamAccount(((InvestFlowSearchArgs) companion.getArgs((HasSavedState) this)).getAccountNumber()).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.onStart$lambda$5(this.f$0, (Account) obj);
            }
        });
        Observable<R> observableSwitchMap = this.searchRelay.switchMap(new Function() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends SearchStore3> apply(String query) {
                Intrinsics.checkNotNullParameter(query, "query");
                return SearchStore.search$default(InvestFlowSearchDuxo.this.searchStore, query, CollectionsKt.listOf(SearchContentType.INSTRUMENTS), null, null, false, null, 60, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.onStart$lambda$7(this.f$0, (SearchStore3) obj);
            }
        });
        this.instrumentPositionStore.refreshHoldingInstrumentPositionsForAccount(false, ((InvestFlowSearchArgs) companion.getArgs((HasSavedState) this)).getAccountNumber());
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentPositionStore.getHoldingInstrumentPositionsForAccount(((InvestFlowSearchArgs) companion.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.onStart$lambda$9(this.f$0, (List) obj);
            }
        });
        refreshDiscovery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(InvestFlowSearchDuxo investFlowSearchDuxo, final Account account) {
        investFlowSearchDuxo.loggingContext = new InvestFlowContext(InvestFlowContext.Allocation.DEFAULT, InvestFlowContext.OrderStatus.SUCCESS, InvestFlowContext.EntryPoint.BB_DISCOVERY, account.getBrokerageAccountType().toString(), ((InvestFlowSearchArgs) INSTANCE.getArgs((HasSavedState) investFlowSearchDuxo)).getLoggingParams().getSource(), null, 32, null);
        investFlowSearchDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.onStart$lambda$5$lambda$4(account, (InvestFlowSearchViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState onStart$lambda$5$lambda$4(Account account, InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, null, null, null, null, null, account.getBrokerageAccountType(), null, null, null, null, 3967, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(InvestFlowSearchDuxo investFlowSearchDuxo, final SearchStore3 searchStore3) {
        investFlowSearchDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.onStart$lambda$7$lambda$6(searchStore3, (InvestFlowSearchViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState onStart$lambda$7$lambda$6(SearchStore3 searchStore3, InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, false, searchStore3, null, null, null, null, null, null, null, null, null, null, 4093, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(InvestFlowSearchDuxo investFlowSearchDuxo, final List instrumentPositions) {
        Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
        investFlowSearchDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.onStart$lambda$9$lambda$8(instrumentPositions, (InvestFlowSearchViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState onStart$lambda$9$lambda$8(List list, InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, null, null, null, null, null, null, list, null, null, null, 3839, null);
    }

    public final void refreshDiscovery() {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.refreshDiscovery$lambda$10((InvestFlowSearchViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.investFlowStore.fetchInvestFlowDiscoveryPage(ApiAssetType.EQUITY), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.refreshDiscovery$lambda$12(this.f$0, (ApiInvestFlowDiscoveryPageResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.refreshDiscovery$lambda$14(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState refreshDiscovery$lambda$10(InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, null, null, null, null, null, null, null, null, null, null, 4063, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshDiscovery$lambda$12(InvestFlowSearchDuxo investFlowSearchDuxo, final ApiInvestFlowDiscoveryPageResponse discoveryResponse) {
        Intrinsics.checkNotNullParameter(discoveryResponse, "discoveryResponse");
        investFlowSearchDuxo.logDiscoverAppear();
        investFlowSearchDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.refreshDiscovery$lambda$12$lambda$11(discoveryResponse, (InvestFlowSearchViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState refreshDiscovery$lambda$12$lambda$11(ApiInvestFlowDiscoveryPageResponse apiInvestFlowDiscoveryPageResponse, InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, null, null, null, null, apiInvestFlowDiscoveryPageResponse, null, null, null, null, null, 3999, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshDiscovery$lambda$14(InvestFlowSearchDuxo investFlowSearchDuxo, final Throwable err) {
        Intrinsics.checkNotNullParameter(err, "err");
        investFlowSearchDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.refreshDiscovery$lambda$14$lambda$13(err, (InvestFlowSearchViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState refreshDiscovery$lambda$14$lambda$13(Throwable th, InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, null, null, null, th, null, null, null, null, null, null, 4063, null);
    }

    public final void searchItemTap(final SearchItem searchItem) {
        UUID id;
        Intrinsics.checkNotNullParameter(searchItem, "searchItem");
        if (searchItem instanceof SearchItem.InstrumentResult) {
            id = ((SearchItem.InstrumentResult) searchItem).getInstrument().getId();
        } else if (searchItem instanceof SearchItem.InstrumentPositionResult) {
            id = ((SearchItem.InstrumentPositionResult) searchItem).getInstrument().getId();
        } else {
            throw new IllegalStateException("showing a non-instrument in the search results");
        }
        logSearchItemTap(id);
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentRecurringTradabilityStore.fetchRecurringInstrumentTradable(id), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.searchItemTap$lambda$16(this.f$0, searchItem, (InstrumentRecurringTradability) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchItemTap$lambda$16(InvestFlowSearchDuxo investFlowSearchDuxo, final SearchItem searchItem, final InstrumentRecurringTradability tradability) {
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        investFlowSearchDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.searchItemTap$lambda$16$lambda$15(searchItem, tradability, (InvestFlowSearchViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState searchItemTap$lambda$16$lambda$15(SearchItem searchItem, InstrumentRecurringTradability instrumentRecurringTradability, InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, null, null, new UiEvent(new Tuples2(searchItem, instrumentRecurringTradability)), null, null, null, null, null, null, null, 4079, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStop() {
        logDiscoverDisappear();
        super.onStop();
    }

    public static /* synthetic */ void onItemClicked$default(InvestFlowSearchDuxo investFlowSearchDuxo, InvestFlowBasketItem investFlowBasketItem, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        investFlowSearchDuxo.onItemClicked(investFlowBasketItem, z);
    }

    public final synchronized void onItemClicked(final InvestFlowBasketItem basketItem, final boolean isDoubleClick) {
        Intrinsics.checkNotNullParameter(basketItem, "basketItem");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.onItemClicked$lambda$18(basketItem, isDoubleClick, this, (InvestFlowSearchViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState onItemClicked$lambda$18(InvestFlowBasketItem investFlowBasketItem, boolean z, InvestFlowSearchDuxo investFlowSearchDuxo, InvestFlowSearchViewState applyMutation) {
        boolean z2;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        List mutableList = CollectionsKt.toMutableList((Collection) applyMutation.getSelectedItems());
        List<InvestFlowBasketItem> selectedItems = applyMutation.getSelectedItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedItems, 10));
        Iterator<T> it = selectedItems.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestFlowBasketItem) it.next()).getId());
        }
        if (!arrayList.contains(investFlowBasketItem.getId())) {
            mutableList.add(investFlowBasketItem);
        } else {
            int size = mutableList.size();
            for (int i = 0; i < size; i++) {
                InvestFlowBasketItem investFlowBasketItem2 = (InvestFlowBasketItem) mutableList.get(i);
                if (Intrinsics.areEqual(investFlowBasketItem2.getId(), investFlowBasketItem.getId())) {
                    mutableList.remove(investFlowBasketItem2);
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (mutableList.size() > 10) {
            return InvestFlowSearchViewState.copy$default(applyMutation, false, null, null, null, null, null, null, null, null, new UiEvent(tooManyItemsStringResource), null, null, 3583, null);
        }
        if (z2) {
            return InvestFlowSearchViewState.copy$default(applyMutation, false, null, mutableList, null, null, null, null, null, null, null, null, null, 4091, null);
        }
        if (!(investFlowBasketItem instanceof InvestFlowBasketItem.Equity)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z3 = z && ((InvestFlowBasketItem.Equity) investFlowBasketItem).getInstrument().isEtpOrCef();
        if (z3) {
            investFlowSearchDuxo.showProspectus(investFlowBasketItem);
        }
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, mutableList, null, null, null, null, null, null, null, !z3 ? new UiEvent(investFlowBasketItem) : null, null, 3067, null);
    }

    private final void showProspectus(InvestFlowBasketItem basketItem) {
        Query<UUID, EtpDetails> streamEtpDetails = this.etpDetailsStore.getStreamEtpDetails();
        Intrinsics.checkNotNull(basketItem, "null cannot be cast to non-null type com.robinhood.android.investFlow.core.InvestFlowBasketItem.Equity");
        Single<EtpDetails> singleFirstOrError = streamEtpDetails.asObservable(((InvestFlowBasketItem.Equity) basketItem).getId()).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.showProspectus$lambda$20(this.f$0, (EtpDetails) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showProspectus$lambda$20(InvestFlowSearchDuxo investFlowSearchDuxo, final EtpDetails etpDetails) {
        investFlowSearchDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.showProspectus$lambda$20$lambda$19(etpDetails, (InvestFlowSearchViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState showProspectus$lambda$20$lambda$19(EtpDetails etpDetails, InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, null, null, null, null, null, null, null, null, null, new UiEvent(new Tuples2(etpDetails.getSymbol(), etpDetails)), 2047, null);
    }

    public static /* synthetic */ void onItemClicked$default(InvestFlowSearchDuxo investFlowSearchDuxo, UUID uuid, UUID uuid2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        investFlowSearchDuxo.onItemClicked(uuid, uuid2, z);
    }

    public final void onItemClicked(UUID assetId, UUID listId, final boolean isDoubleClick) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Single singleFirstOrError = this.instrumentStore.getInstrument(assetId).map(new Function() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo.onItemClicked.2
            @Override // io.reactivex.functions.Function
            public final InvestFlowBasketItem.Equity apply(Instrument it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new InvestFlowBasketItem.Equity(it);
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.onItemClicked$lambda$21(this.f$0, isDoubleClick, (InvestFlowBasketItem.Equity) obj);
            }
        });
        if (!isDoubleClick || listId == null) {
            return;
        }
        logItemDoubleClick(assetId, listId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClicked$lambda$21(InvestFlowSearchDuxo investFlowSearchDuxo, boolean z, InvestFlowBasketItem.Equity equity) {
        Intrinsics.checkNotNull(equity);
        investFlowSearchDuxo.onItemClicked(equity, z);
        return Unit.INSTANCE;
    }

    private final void logItemDoubleClick(final UUID assetId, UUID listId) {
        Maybe<Optional<CuratedList>> maybeFirstElement = this.listsStore.streamCuratedListOptional(listId).firstElement();
        Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "firstElement(...)");
        LifecycleHost.DefaultImpls.bind$default(this, maybeFirstElement, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.logItemDoubleClick$lambda$22(this.f$0, assetId, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logItemDoubleClick$lambda$22(InvestFlowSearchDuxo investFlowSearchDuxo, UUID uuid, Optional optional) {
        String displayName;
        UUID id;
        String string2;
        CuratedList curatedList = (CuratedList) optional.component1();
        EventLogger eventLogger = investFlowSearchDuxo.eventLogger;
        Screen screen = investFlowSearchDuxo.discoverScreen;
        Component.ComponentType componentType = Component.ComponentType.LIST_CHIP;
        String string3 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        Component component = new Component(componentType, string3, null, 4, null);
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, new com.robinhood.rosetta.eventlogging.List((curatedList == null || (id = curatedList.getId()) == null || (string2 = id.toString()) == null) ? "" : string2, (curatedList == null || (displayName = curatedList.getDisplayName()) == null) ? "" : displayName, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    public final void deleteItem(final UUID deletedId) {
        Intrinsics.checkNotNullParameter(deletedId, "deletedId");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchDuxo.deleteItem$lambda$24(deletedId, (InvestFlowSearchViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSearchViewState deleteItem$lambda$24(UUID uuid, InvestFlowSearchViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        List<InvestFlowBasketItem> selectedItems = applyMutation.getSelectedItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : selectedItems) {
            if (!Intrinsics.areEqual(((InvestFlowBasketItem) obj).getId(), uuid)) {
                arrayList.add(obj);
            }
        }
        return InvestFlowSearchViewState.copy$default(applyMutation, false, null, arrayList, null, null, null, null, null, null, null, null, null, 4091, null);
    }

    public final void logSearchAppear() {
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, this.searchScreen, null, null, null, 29, null);
    }

    private final void logSearchItemTap(UUID id) {
        EventLogger eventLogger = this.eventLogger;
        Screen screen = this.searchScreen;
        Component.ComponentType componentType = Component.ComponentType.SEARCH_RESULT_ROW;
        String string2 = id.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE, screen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
    }

    private final void logDiscoverAppear() {
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, this.discoverScreen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.loggingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -524289, -1, -1, -1, 16383, null), 13, null);
    }

    private final void logDiscoverDisappear() {
        EventLogger.DefaultImpls.logDisappear$default(this.eventLogger, null, this.discoverScreen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.loggingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -524289, -1, -1, -1, 16383, null), 13, null);
    }

    private final void logSearchFocus() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, this.discoverScreen, new Component(Component.ComponentType.SEARCH_BAR, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.loggingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -524289, -1, -1, -1, 16383, null), false, 41, null);
    }

    private final void logSearchType() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.TYPE_SEARCH_QUERY, this.searchScreen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.loggingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -524289, -1, -1, -1, 16383, null), false, 44, null);
    }

    private final void logClearSearch() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.CLEAR_SEARCH_QUERY, this.searchScreen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.loggingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -524289, -1, -1, -1, 16383, null), false, 44, null);
    }

    /* compiled from: InvestFlowSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/InvestFlowSearchDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investFlow/search/InvestFlowSearchDuxo;", "Lcom/robinhood/android/investFlow/search/InvestFlowSearchArgs;", "<init>", "()V", "LOGGING_ID_STOCKS", "", "tooManyItemsStringResource", "Lcom/robinhood/utils/resource/StringResource;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InvestFlowSearchDuxo, InvestFlowSearchArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowSearchArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InvestFlowSearchArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowSearchArgs getArgs(InvestFlowSearchDuxo investFlowSearchDuxo) {
            return (InvestFlowSearchArgs) DuxoCompanion.DefaultImpls.getArgs(this, investFlowSearchDuxo);
        }
    }
}
