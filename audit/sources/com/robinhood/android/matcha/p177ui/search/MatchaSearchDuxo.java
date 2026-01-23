package com.robinhood.android.matcha.p177ui.search;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.common.RosettaConverters;
import com.robinhood.android.matcha.p177ui.incentives.MatchaIncentivesExperiment;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchEvent;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchFragment;
import com.robinhood.android.store.matcha.MatchaContactsStore;
import com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore;
import com.robinhood.android.store.matcha.MatchaSearchStore;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.p320db.matcha.MatchaSearchUser;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.P2PContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: MatchaSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 F2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001FBI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010,\u001a\u00020-H\u0016J\u000e\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001cJ\u000e\u00100\u001a\u00020-2\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000202J\u000e\u00104\u001a\u00020-2\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u00020-J\u000e\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020:J\u000e\u0010;\u001a\u00020-2\u0006\u00109\u001a\u00020:J\u0006\u0010<\u001a\u00020-J\u0006\u0010=\u001a\u00020-J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u00109\u001a\u00020:H\u0002J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010B\u001a\u00020-2\u0006\u00109\u001a\u00020:H\u0002J\u0016\u0010C\u001a\u00020@2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020:0EH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchViewState;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "contactsStore", "Lcom/robinhood/android/store/matcha/MatchaContactsStore;", "searchStore", "Lcom/robinhood/android/store/matcha/MatchaSearchStore;", "incentivesSummaryStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/store/matcha/MatchaContactsStore;Lcom/robinhood/android/store/matcha/MatchaSearchStore;Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/matcha/ui/search/MatchaSearchStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "queryRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/P2PContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/P2PContext;", "loggingContext$delegate", "Lkotlin/Lazy;", "onStart", "", "updateQuery", "query", "setContactsEnabled", "enabled", "", "onBackspace", "onTagClick", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "onTagRemoveClick", "onTransactorSelected", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "onContactConfirmed", "onContinuePressed", "onTransactorListConfirmed", "createTransactorSelectedAction", "Lio/reactivex/Single;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected;", "createContactInviteEvent", "onMultiUserTransactorSelected", "createMultiUserTransactorSelectedAction", "transactors", "", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaSearchDuxo extends BaseDuxo3<MatchaSearchDataState, MatchaSearchViewState, MatchaSearchEvent> implements HasSavedState {
    public static final int MAX_TRANSACTOR_LIST_SIZE = 20;
    private final MatchaContactsStore contactsStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final MatchaIncentivesSummaryStore incentivesSummaryStore;

    /* renamed from: loggingContext$delegate, reason: from kotlin metadata */
    private final Lazy loggingContext;
    private final PublishRelay<String> queryRelay;
    private final SavedStateHandle savedStateHandle;
    private final MatchaSearchStore searchStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaSearchDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MatchaSearchDuxo(MatchaContactsStore contactsStore, MatchaSearchStore searchStore, MatchaIncentivesSummaryStore incentivesSummaryStore, ExperimentsStore experimentsStore, EventLogger eventLogger, MatchaSearchStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        List listListOf;
        Intrinsics.checkNotNullParameter(contactsStore, "contactsStore");
        Intrinsics.checkNotNullParameter(searchStore, "searchStore");
        Intrinsics.checkNotNullParameter(incentivesSummaryStore, "incentivesSummaryStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        boolean isMultiuserUi = ((MatchaSearchFragment.Args) companion.getArgs(savedStateHandle)).getIsMultiuserUi();
        Transactor selectedTransactor = ((MatchaSearchFragment.Args) companion.getArgs(savedStateHandle)).getSelectedTransactor();
        super(new MatchaSearchDataState(isMultiuserUi, ((MatchaSearchFragment.Args) companion.getArgs(savedStateHandle)).getAmount(), ((MatchaSearchFragment.Args) companion.getArgs(savedStateHandle)).getDirection(), null, null, null, null, null, null, false, (selectedTransactor == null || (listListOf = CollectionsKt.listOf(selectedTransactor)) == null) ? CollectionsKt.emptyList() : listListOf, null, null, 7160, null), stateProvider, duxoBundle);
        this.contactsStore = contactsStore;
        this.searchStore = searchStore;
        this.incentivesSummaryStore = incentivesSummaryStore;
        this.experimentsStore = experimentsStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        PublishRelay<String> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.queryRelay = publishRelayCreate;
        this.loggingContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaSearchDuxo.loggingContext_delegate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen getEventScreen() {
        return new Screen(Screen.Name.P2P_SEARCH, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getScreenEventContext() {
        return new Context(0, 0, 0, null, null, null, null, Context.ProductTag.PEER_TO_PEER, 0, null, ((MatchaSearchFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEntryPoint().getIdentifier(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -1, -1, -268435457, -1, -1, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P2PContext getLoggingContext() {
        return (P2PContext) this.loggingContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P2PContext loggingContext_delegate$lambda$1(MatchaSearchDuxo matchaSearchDuxo) {
        Companion companion = INSTANCE;
        return new P2PContext(RosettaConverters.toProtobuf(((MatchaSearchFragment.Args) companion.getArgs((HasSavedState) matchaSearchDuxo)).getDirection()), null, ((MatchaSearchFragment.Args) companion.getArgs((HasSavedState) matchaSearchDuxo)).getAmount().getDecimalValue().floatValue(), null, null, null, 58, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.searchStore.refreshEmptyState();
        LifecycleHost.DefaultImpls.bind$default(this, this.searchStore.streamEmptyState(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaSearchDuxo.onStart$lambda$2(this.f$0, (List) obj);
            }
        });
        Observable<String> observableFilter = this.queryRelay.filter(new Predicate() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo.onStart.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return !StringsKt.isBlank(p0);
            }
        });
        final MatchaSearchStore matchaSearchStore = this.searchStore;
        Observable<R> observableSwitchMapSingle = observableFilter.switchMapSingle(new Function() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final Single<MatchaSearchStore.SearchResponse> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return matchaSearchStore.search(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaSearchDuxo.onStart$lambda$3(this.f$0, (MatchaSearchStore.SearchResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaSearchDuxo.onStart$lambda$4(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        Observable<String> observableStartWith = this.queryRelay.startWith((PublishRelay<String>) "");
        final MatchaContactsStore matchaContactsStore = this.contactsStore;
        Observable<R> observableSwitchMap = observableStartWith.switchMap(new Function() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo.onStart.6
            @Override // io.reactivex.functions.Function
            public final Observable<List<ReferralContact>> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return matchaContactsStore.searchContacts(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaSearchDuxo.onStart$lambda$5(this.f$0, (List) obj);
            }
        });
        this.incentivesSummaryStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.incentivesSummaryStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaSearchDuxo.onStart$lambda$6(this.f$0, (MatchaIncentivesSummary) obj);
            }
        });
        Observable observableDistinctUntilChanged = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{MatchaIncentivesExperiment.INSTANCE}, false, null, 6, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaSearchDuxo.onStart$lambda$7(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(MatchaSearchDuxo matchaSearchDuxo, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaSearchDuxo.applyMutation(new MatchaSearchDuxo2(it, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(MatchaSearchDuxo matchaSearchDuxo, MatchaSearchStore.SearchResponse searchResponse) {
        matchaSearchDuxo.applyMutation(new MatchaSearchDuxo3(searchResponse, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(MatchaSearchDuxo matchaSearchDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        matchaSearchDuxo.submit(new MatchaSearchEvent.Error(throwable));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(MatchaSearchDuxo matchaSearchDuxo, List list) {
        matchaSearchDuxo.applyMutation(new MatchaSearchDuxo4(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(MatchaSearchDuxo matchaSearchDuxo, MatchaIncentivesSummary incentivesSummary) {
        Intrinsics.checkNotNullParameter(incentivesSummary, "incentivesSummary");
        matchaSearchDuxo.applyMutation(new MatchaSearchDuxo5(incentivesSummary, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(MatchaSearchDuxo matchaSearchDuxo, Boolean bool) {
        matchaSearchDuxo.applyMutation(new MatchaSearchDuxo6(bool, null));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$updateQuery$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$updateQuery$1 */
    static final class C215091 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
        final /* synthetic */ String $query;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215091(String str, Continuation<? super C215091> continuation) {
            super(2, continuation);
            this.$query = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215091 c215091 = new C215091(this.$query, continuation);
            c215091.L$0 = obj;
            return c215091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
            return ((C215091) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchaSearchDataState.copy$default((MatchaSearchDataState) this.L$0, false, null, null, this.$query, null, null, null, null, null, false, null, null, null, 6135, null);
        }
    }

    public final void updateQuery(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.queryRelay.accept(query);
        applyMutation(new C215091(query, null));
    }

    public final void setContactsEnabled(boolean enabled) {
        if (enabled) {
            this.contactsStore.refresh();
        }
        applyMutation(new C215081(enabled, null));
    }

    /* compiled from: MatchaSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$setContactsEnabled$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$setContactsEnabled$1 */
    static final class C215081 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
        final /* synthetic */ boolean $enabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215081(boolean z, Continuation<? super C215081> continuation) {
            super(2, continuation);
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215081 c215081 = new C215081(this.$enabled, continuation);
            c215081.L$0 = obj;
            return c215081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
            return ((C215081) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchaSearchDataState.copy$default((MatchaSearchDataState) this.L$0, false, null, null, null, null, null, null, boxing.boxBoolean(this.$enabled), null, false, null, null, null, 8063, null);
        }
    }

    /* compiled from: MatchaSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onBackspace$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onBackspace$1 */
    static final class C214981 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C214981(Continuation<? super C214981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214981 c214981 = MatchaSearchDuxo.this.new C214981(continuation);
            c214981.L$0 = obj;
            return c214981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
            return ((C214981) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MatchaSearchDataState matchaSearchDataState = (MatchaSearchDataState) this.L$0;
            if (matchaSearchDataState.getQuery().length() == 0 && !matchaSearchDataState.getTransactors().isEmpty()) {
                if (matchaSearchDataState.getSelectedTransactorIndex() == null) {
                    return MatchaSearchDataState.copy$default(matchaSearchDataState, false, null, null, null, null, null, null, null, null, false, null, boxing.boxInt(CollectionsKt.getLastIndex(matchaSearchDataState.getTransactors())), null, 6143, null);
                }
                MatchaSearchDuxo.this.onTagRemoveClick();
            }
            return matchaSearchDataState;
        }
    }

    public final boolean onBackspace() {
        applyMutation(new C214981(null));
        return true;
    }

    /* compiled from: MatchaSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onTagClick$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onTagClick$1 */
    static final class C215041 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
        final /* synthetic */ int $index;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MatchaSearchDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215041(int i, MatchaSearchDuxo matchaSearchDuxo, Continuation<? super C215041> continuation) {
            super(2, continuation);
            this.$index = i;
            this.this$0 = matchaSearchDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215041 c215041 = new C215041(this.$index, this.this$0, continuation);
            c215041.L$0 = obj;
            return c215041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
            return ((C215041) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UserInteractionEventData.Action action;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MatchaSearchDataState matchaSearchDataState = (MatchaSearchDataState) this.L$0;
            Integer selectedTransactorIndex = matchaSearchDataState.getSelectedTransactorIndex();
            boolean z = selectedTransactorIndex != null && selectedTransactorIndex.intValue() == this.$index;
            EventLogger eventLogger = this.this$0.eventLogger;
            Screen eventScreen = this.this$0.getEventScreen();
            Context contextCopy$default = Context.copy$default(this.this$0.getScreenEventContext(), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, P2PContext.copy$default(this.this$0.getLoggingContext(), null, RosettaConverters.toTargetType(matchaSearchDataState.getTransactors().get(this.$index)), 0.0f, null, null, null, 61, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -268435457, -1, -1, 16383, null);
            Component component = new Component(Component.ComponentType.CHIP, null, null, 6, null);
            if (z) {
                action = UserInteractionEventData.Action.DESELECT;
            } else {
                action = UserInteractionEventData.Action.SELECT;
            }
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, component, null, contextCopy$default, false, 40, null);
            return MatchaSearchDataState.copy$default(matchaSearchDataState, false, null, null, null, null, null, null, null, null, false, null, z ? null : boxing.boxInt(this.$index), null, 6143, null);
        }
    }

    public final void onTagClick(int index) {
        applyMutation(new C215041(index, this, null));
    }

    /* compiled from: MatchaSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onTagRemoveClick$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onTagRemoveClick$1 */
    static final class C215051 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C215051(Continuation<? super C215051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215051 c215051 = new C215051(continuation);
            c215051.L$0 = obj;
            return c215051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
            return ((C215051) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MatchaSearchDataState matchaSearchDataState = (MatchaSearchDataState) this.L$0;
            Integer selectedTransactorIndex = matchaSearchDataState.getSelectedTransactorIndex();
            Intrinsics.checkNotNull(selectedTransactorIndex);
            int iIntValue = selectedTransactorIndex.intValue();
            List<Transactor> transactors = matchaSearchDataState.getTransactors();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj2 : transactors) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i != iIntValue) {
                    arrayList.add(obj2);
                }
                i = i2;
            }
            return MatchaSearchDataState.copy$default(matchaSearchDataState, false, null, null, null, null, null, null, null, null, false, arrayList, null, null, 5119, null);
        }
    }

    public final void onTagRemoveClick() {
        applyMutation(new C215051(null));
    }

    public final void onTransactorSelected(Transactor transactor) {
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        if (((MatchaSearchFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getIsMultiuserUi()) {
            onMultiUserTransactorSelected(transactor);
            return;
        }
        EventLogger eventLogger = this.eventLogger;
        Screen eventScreen = getEventScreen();
        Context contextCopy$default = Context.copy$default(getScreenEventContext(), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, P2PContext.copy$default(getLoggingContext(), null, RosettaConverters.toTargetType(transactor), 0.0f, null, null, null, 61, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -268435457, -1, -1, 16383, null);
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, eventScreen, new Component(Component.ComponentType.ROW, null, null, 6, null), null, contextCopy$default, false, 40, null);
        applyMutation(new C215061(transactor, null));
        LifecycleHost.DefaultImpls.bind$default(this, createTransactorSelectedAction(transactor), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C215072(this), new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaSearchDuxo.onTransactorSelected$lambda$8(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: MatchaSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onTransactorSelected$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onTransactorSelected$1 */
    static final class C215061 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
        final /* synthetic */ Transactor $transactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215061(Transactor transactor, Continuation<? super C215061> continuation) {
            super(2, continuation);
            this.$transactor = transactor;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215061 c215061 = new C215061(this.$transactor, continuation);
            c215061.L$0 = obj;
            return c215061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
            return ((C215061) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchaSearchDataState.copy$default((MatchaSearchDataState) this.L$0, false, null, null, null, null, null, null, null, null, false, CollectionsKt.listOf(this.$transactor), null, null, 7167, null);
        }
    }

    /* compiled from: MatchaSearchDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onTransactorSelected$2 */
    /* synthetic */ class C215072 extends FunctionReferenceImpl implements Function1<MatchaSearchEvent, Unit> {
        C215072(Object obj) {
            super(1, obj, MatchaSearchDuxo.class, "submit", "submit(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MatchaSearchEvent matchaSearchEvent) {
            invoke2(matchaSearchEvent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MatchaSearchEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MatchaSearchDuxo) this.receiver).submit(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransactorSelected$lambda$8(MatchaSearchDuxo matchaSearchDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaSearchDuxo.submit(new MatchaSearchEvent.Error(it));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onContactConfirmed$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onContactConfirmed$1 */
    static final class C214991 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
        final /* synthetic */ Transactor $transactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214991(Transactor transactor, Continuation<? super C214991> continuation) {
            super(2, continuation);
            this.$transactor = transactor;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214991 c214991 = MatchaSearchDuxo.this.new C214991(this.$transactor, continuation);
            c214991.L$0 = obj;
            return c214991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
            return ((C214991) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List<Transactor> listPlus;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MatchaSearchDataState matchaSearchDataState = (MatchaSearchDataState) this.L$0;
            if (((MatchaSearchFragment.Args) MatchaSearchDuxo.INSTANCE.getArgs((HasSavedState) MatchaSearchDuxo.this)).getIsMultiuserUi()) {
                if (matchaSearchDataState.getTransactors().size() == 20) {
                    MatchaSearchDuxo.this.submit(MatchaSearchEvent.TooManyPeopleError.INSTANCE);
                    listPlus = matchaSearchDataState.getTransactors();
                } else {
                    listPlus = CollectionsKt.plus((Collection<? extends Transactor>) matchaSearchDataState.getTransactors(), this.$transactor);
                }
                return MatchaSearchDataState.copy$default(matchaSearchDataState, false, null, null, "", null, null, null, null, null, false, listPlus, null, null, 5111, null);
            }
            MatchaSearchDuxo.this.submit(new MatchaSearchEvent.TransactorSelected.NextScreen(CollectionsKt.listOf(this.$transactor)));
            return MatchaSearchDataState.copy$default(matchaSearchDataState, false, null, null, null, null, null, null, null, null, false, CollectionsKt.listOf(this.$transactor), null, null, 7167, null);
        }
    }

    public final void onContactConfirmed(Transactor transactor) {
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        applyMutation(new C214991(transactor, null));
    }

    public final void onContinuePressed() {
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaSearchDuxo.onContinuePressed$lambda$10(this.f$0, (MatchaSearchDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinuePressed$lambda$10(MatchaSearchDuxo matchaSearchDuxo, MatchaSearchDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger eventLogger = matchaSearchDuxo.eventLogger;
        Screen eventScreen = matchaSearchDuxo.getEventScreen();
        Context screenEventContext = matchaSearchDuxo.getScreenEventContext();
        P2PContext loggingContext = matchaSearchDuxo.getLoggingContext();
        List<Transactor> transactors = it.getTransactors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(transactors, 10));
        Iterator<T> it2 = transactors.iterator();
        while (it2.hasNext()) {
            arrayList.add(RosettaConverters.toTargetType((Transactor) it2.next()));
        }
        Context contextCopy$default = Context.copy$default(screenEventContext, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, P2PContext.copy$default(loggingContext, null, null, 0.0f, null, arrayList, null, 47, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -268435457, -1, -1, 16383, null);
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTINUE, eventScreen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, contextCopy$default, false, 40, null);
        matchaSearchDuxo.submit(matchaSearchDuxo.createMultiUserTransactorSelectedAction(it.getTransactors()));
        return Unit.INSTANCE;
    }

    public final void onTransactorListConfirmed() {
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaSearchDuxo.onTransactorListConfirmed$lambda$11(this.f$0, (MatchaSearchDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransactorListConfirmed$lambda$11(MatchaSearchDuxo matchaSearchDuxo, MatchaSearchDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaSearchDuxo.submit(new MatchaSearchEvent.TransactorSelected.NextScreen(it.getTransactors()));
        return Unit.INSTANCE;
    }

    private final Single<MatchaSearchEvent.TransactorSelected> createTransactorSelectedAction(final Transactor transactor) {
        Single<MatchaSearchEvent.TransactorSelected> singleDoAfterTerminate;
        Object nextScreen;
        int i = WhenMappings.$EnumSwitchMapping$0[((MatchaSearchFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDirection().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (transactor instanceof Transactor.User) {
                Single<MatchaSearchEvent.TransactorSelected> singleJust = Single.just(new MatchaSearchEvent.TransactorSelected.NextScreen(CollectionsKt.listOf(transactor)));
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
            if (!(transactor instanceof Transactor.Email) && !(transactor instanceof Transactor.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            return createContactInviteEvent(transactor);
        }
        if (transactor instanceof Transactor.User) {
            Transactor.User user = (Transactor.User) transactor;
            if (!user.isConnection()) {
                nextScreen = new MatchaSearchEvent.TransactorSelected.ConfirmNewTransactor(user);
            } else {
                nextScreen = new MatchaSearchEvent.TransactorSelected.NextScreen(CollectionsKt.listOf(transactor));
            }
            singleDoAfterTerminate = Single.just(nextScreen);
        } else {
            if (!(transactor instanceof Transactor.Email) && !(transactor instanceof Transactor.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            Single<R> singleFlatMap = this.searchStore.search(transactor.getIdentifier()).flatMap(new Function() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo.createTransactorSelectedAction.1
                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends MatchaSearchEvent.TransactorSelected> apply(MatchaSearchStore.SearchResponse searchResponse) {
                    Intrinsics.checkNotNullParameter(searchResponse, "<destruct>");
                    List<MatchaSearchUser> listComponent1 = searchResponse.component1();
                    List<MatchaSearchUser> listComponent2 = searchResponse.component2();
                    if (listComponent1.isEmpty() && listComponent2.isEmpty()) {
                        return MatchaSearchDuxo.this.createContactInviteEvent(transactor);
                    }
                    Single singleJust2 = Single.just(new MatchaSearchEvent.TransactorSelected.ReverseLookupContact(transactor));
                    Intrinsics.checkNotNull(singleJust2);
                    return singleJust2;
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
            singleDoAfterTerminate = SingleDelay2.minTimeInFlight(singleFlatMap, 1000L, TimeUnit.MILLISECONDS).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo.createTransactorSelectedAction.2

                /* compiled from: MatchaSearchDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$createTransactorSelectedAction$2$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$createTransactorSelectedAction$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
                    final /* synthetic */ Transactor $transactor;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Transactor transactor, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$transactor = transactor;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transactor, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
                        return ((AnonymousClass1) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return MatchaSearchDataState.copy$default((MatchaSearchDataState) this.L$0, false, null, null, null, null, null, null, null, null, false, null, null, this.$transactor.getContactId(), 4095, null);
                    }
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Disposable disposable) {
                    MatchaSearchDuxo.this.applyMutation(new AnonymousClass1(transactor, null));
                }
            }).doAfterTerminate(new Action() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo.createTransactorSelectedAction.3

                /* compiled from: MatchaSearchDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$createTransactorSelectedAction$3$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$createTransactorSelectedAction$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
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
                    public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
                        return ((AnonymousClass1) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return MatchaSearchDataState.copy$default((MatchaSearchDataState) this.L$0, false, null, null, null, null, null, null, null, null, false, null, null, null, 4095, null);
                    }
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    MatchaSearchDuxo.this.applyMutation(new AnonymousClass1(null));
                }
            });
        }
        Intrinsics.checkNotNull(singleDoAfterTerminate);
        return singleDoAfterTerminate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<MatchaSearchEvent.TransactorSelected> createContactInviteEvent(Transactor transactor) {
        if ((transactor instanceof Transactor.Email) || (transactor instanceof Transactor.Phone)) {
            Single<MatchaSearchEvent.TransactorSelected> singleJust = Single.just(new MatchaSearchEvent.TransactorSelected.InviteContact(transactor));
            Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
            return singleJust;
        }
        if (transactor instanceof Transactor.User) {
            throw new IllegalStateException("Unexpected");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: MatchaSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onMultiUserTransactorSelected$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onMultiUserTransactorSelected$1 */
    static final class C215001 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
        final /* synthetic */ Transactor $transactor;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MatchaSearchDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215001(Transactor transactor, MatchaSearchDuxo matchaSearchDuxo, Continuation<? super C215001> continuation) {
            super(2, continuation);
            this.$transactor = transactor;
            this.this$0 = matchaSearchDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215001 c215001 = new C215001(this.$transactor, this.this$0, continuation);
            c215001.L$0 = obj;
            return c215001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
            return ((C215001) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UserInteractionEventData.Action action;
            List listPlus;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MatchaSearchDataState matchaSearchDataState = (MatchaSearchDataState) this.L$0;
            List<Transactor> transactors = matchaSearchDataState.getTransactors();
            Transactor transactor = this.$transactor;
            boolean z = false;
            if (!(transactors instanceof Collection) || !transactors.isEmpty()) {
                Iterator<T> it = transactors.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(((Transactor) it.next()).getDisplayName(), transactor.getDisplayName())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z || (this.$transactor instanceof Transactor.User)) {
                EventLogger eventLogger = this.this$0.eventLogger;
                Screen eventScreen = this.this$0.getEventScreen();
                Context contextCopy$default = Context.copy$default(this.this$0.getScreenEventContext(), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, P2PContext.copy$default(this.this$0.getLoggingContext(), null, RosettaConverters.toTargetType(this.$transactor), 0.0f, null, null, null, 61, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -268435457, -1, -1, 16383, null);
                Component component = new Component(Component.ComponentType.ROW, null, null, 6, null);
                if (z) {
                    action = UserInteractionEventData.Action.DESELECT;
                } else {
                    action = UserInteractionEventData.Action.SELECT;
                }
                EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, component, null, contextCopy$default, false, 40, null);
                if (z) {
                    List<Transactor> transactors2 = matchaSearchDataState.getTransactors();
                    Transactor transactor2 = this.$transactor;
                    listPlus = new ArrayList();
                    for (Object obj2 : transactors2) {
                        if (!Intrinsics.areEqual(((Transactor) obj2).getDisplayName(), transactor2.getDisplayName())) {
                            listPlus.add(obj2);
                        }
                    }
                } else if (matchaSearchDataState.getTransactors().size() == 20) {
                    this.this$0.submit(MatchaSearchEvent.TooManyPeopleError.INSTANCE);
                    listPlus = matchaSearchDataState.getTransactors();
                } else {
                    listPlus = CollectionsKt.plus((Collection<? extends Transactor>) matchaSearchDataState.getTransactors(), this.$transactor);
                }
                return MatchaSearchDataState.copy$default(matchaSearchDataState, false, null, null, "", null, null, null, null, null, false, listPlus, null, null, 5111, null);
            }
            this.this$0.submit(new MatchaSearchEvent.TransactorSelected.ReverseLookupContact(this.$transactor));
            return matchaSearchDataState;
        }
    }

    private final void onMultiUserTransactorSelected(Transactor transactor) {
        applyMutation(new C215001(transactor, this, null));
    }

    private final MatchaSearchEvent.TransactorSelected createMultiUserTransactorSelectedAction(List<? extends Transactor> transactors) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : transactors) {
            Transactor transactor = (Transactor) obj;
            if ((transactor instanceof Transactor.User) && !((Transactor.User) transactor).isConnection()) {
                arrayList.add(obj);
            }
        }
        if (((MatchaSearchFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDirection() == Direction.REQUEST || arrayList.isEmpty()) {
            return new MatchaSearchEvent.TransactorSelected.NextScreen(transactors);
        }
        if (arrayList.size() == 1) {
            Object objFirst = CollectionsKt.first((List<? extends Object>) arrayList);
            Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type com.robinhood.android.matcha.models.ui.Transactor.User");
            return new MatchaSearchEvent.TransactorSelected.ConfirmNewTransactor((Transactor.User) objFirst);
        }
        return new MatchaSearchEvent.TransactorSelected.ConfirmNewTransactors(arrayList);
    }

    /* compiled from: MatchaSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDuxo;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchFragment$Args;", "<init>", "()V", "MAX_TRANSACTOR_LIST_SIZE", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaSearchDuxo, MatchaSearchFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaSearchFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MatchaSearchFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaSearchFragment.Args getArgs(MatchaSearchDuxo matchaSearchDuxo) {
            return (MatchaSearchFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, matchaSearchDuxo);
        }
    }
}
