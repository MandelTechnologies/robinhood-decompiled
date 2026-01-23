package com.robinhood.android.shareholderexperience.questionlist;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListEvent;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.QuestionsResponseState;
import com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.shareholderx.models.p401db.DropdownItem;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.shareholderx.models.p401db.QaEventPageType;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import com.robinhood.udf.UiEvent;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Maybes;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.subjects.BehaviorSubject;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QuestionListDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001&B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\u0016\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0019J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0019J\u000e\u0010#\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0019J\u0006\u0010$\u001a\u00020\u0014J\u0006\u0010%\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "shareholderExperienceStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderExperienceStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderExperienceStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "sortSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/robinhood/shareholderx/models/db/DropdownItem;", "kotlin.jvm.PlatformType", "filterSubject", "setIfInitial", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onStart", "fetchDeepLinkQuestion", "Lio/reactivex/Maybe;", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "getInstrumentId", "Lio/reactivex/Single;", "Ljava/util/UUID;", "setDropdownSelection", "type", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownType;", "deleteQuestion", "question", "onVoteClicked", "onCardClicked", "resetFilter", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class QuestionListDuxo extends OldBaseDuxo<QuestionListViewState> implements HasSavedState {
    private final BehaviorSubject<DropdownItem> filterSubject;
    private final InstrumentStore instrumentStore;
    private final SavedStateHandle savedStateHandle;
    private final ShareholderExperienceStore shareholderExperienceStore;
    private final BehaviorSubject<DropdownItem> sortSubject;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: QuestionListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DropdownType.values().length];
            try {
                iArr[DropdownType.SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DropdownType.FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuestionListDuxo(InstrumentStore instrumentStore, ShareholderExperienceStore shareholderExperienceStore, SavedStateHandle savedStateHandle) {
        super(new QuestionListViewState(null, null, null, null, null, false, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(shareholderExperienceStore, "shareholderExperienceStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.instrumentStore = instrumentStore;
        this.shareholderExperienceStore = shareholderExperienceStore;
        this.savedStateHandle = savedStateHandle;
        BehaviorSubject<DropdownItem> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.sortSubject = behaviorSubjectCreate;
        BehaviorSubject<DropdownItem> behaviorSubjectCreate2 = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate2, "create(...)");
        this.filterSubject = behaviorSubjectCreate2;
    }

    private final void setIfInitial(BehaviorSubject<DropdownItem> behaviorSubject, DropdownItem dropdownItem) {
        if (behaviorSubject.getValue() != null || dropdownItem == null) {
            return;
        }
        behaviorSubject.onNext(dropdownItem);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Companion companion = INSTANCE;
        if (((LegacyFragmentKey.ShareholderEventQuestionList) companion.getArgs((HasSavedState) this)).getSymbol() != null) {
            InstrumentStore instrumentStore = this.instrumentStore;
            String symbol = ((LegacyFragmentKey.ShareholderEventQuestionList) companion.getArgs((HasSavedState) this)).getSymbol();
            if (symbol == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            InstrumentStore.refreshBySymbol$default(instrumentStore, true, symbol, false, 4, null);
        }
        Observable<R> observableFlatMapObservable = getInstrumentId().flatMapObservable(new Function() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onStart$metadataQuery$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends QaEventMetadata> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return this.this$0.shareholderExperienceStore.getMetadataQuery(instrumentId, ((LegacyFragmentKey.ShareholderEventQuestionList) QuestionListDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getEventSlug()).timeout(Observable.timer(10L, TimeUnit.SECONDS), new Function() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onStart$metadataQuery$1.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<Long> apply(QaEventMetadata it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Observable.never();
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableFlatMapObservable, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.onStart$lambda$2(this.f$0, (QaEventMetadata) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.onStart$lambda$4(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        Observable observableSwitchMap = observableFlatMapObservable.filter(new Predicate() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onStart$answeredQuestionsStream$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(QaEventMetadata it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getPageType() == QaEventPageType.QUESTIONS_WITH_ANSWERS;
            }
        }).map(new Function() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onStart$answeredQuestionsStream$2
            @Override // io.reactivex.functions.Function
            public final UUID apply(QaEventMetadata it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getInstrumentId();
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onStart$answeredQuestionsStream$3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends QuestionsResponseState> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return this.this$0.shareholderExperienceStore.streamAnsweredQuestions(instrumentId, ((LegacyFragmentKey.ShareholderEventQuestionList) QuestionListDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getEventSlug());
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onStart$answeredQuestionsStream$4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends QuestionsResponseState> apply(QuestionsResponseState responseState) {
                Intrinsics.checkNotNullParameter(responseState, "responseState");
                if (responseState instanceof QuestionsResponseState.Error) {
                    this.this$0.retry();
                    return Observable.just(responseState).delay(5L, TimeUnit.SECONDS);
                }
                if (!(responseState instanceof QuestionsResponseState.Success) && !Intrinsics.areEqual(responseState, QuestionsResponseState.Loading.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Observable.just(responseState);
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable<UUID> observable = getInstrumentId().toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<DropdownItem> observableDistinctUntilChanged = this.sortSubject.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable<DropdownItem> observableDistinctUntilChanged2 = this.filterSubject.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        Observable observableOnErrorReturnItem = observableSwitchMap.mergeWith(observables.combineLatest(observable, observableDistinctUntilChanged, observableDistinctUntilChanged2).doOnNext(new QuestionListDuxo$onStart$unansweredQuestionsStream$1(this)).switchMap(new Function() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onStart$unansweredQuestionsStream$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends QuestionsResponseState> apply(Tuples3<UUID, DropdownItem, DropdownItem> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                UUID uuidComponent1 = tuples3.component1();
                DropdownItem dropdownItemComponent2 = tuples3.component2();
                DropdownItem dropdownItemComponent3 = tuples3.component3();
                ShareholderExperienceStore shareholderExperienceStore = this.this$0.shareholderExperienceStore;
                Intrinsics.checkNotNull(uuidComponent1);
                return shareholderExperienceStore.streamQuestions(uuidComponent1, ((LegacyFragmentKey.ShareholderEventQuestionList) QuestionListDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getEventSlug(), dropdownItemComponent3.getValue(), dropdownItemComponent2.getValue());
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onStart$unansweredQuestionsStream$3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends QuestionsResponseState> apply(QuestionsResponseState responseState) {
                Intrinsics.checkNotNullParameter(responseState, "responseState");
                if (responseState instanceof QuestionsResponseState.Error) {
                    this.this$0.retry();
                    return Observable.just(responseState).delay(5L, TimeUnit.SECONDS);
                }
                if (!(responseState instanceof QuestionsResponseState.Success) && !Intrinsics.areEqual(responseState, QuestionsResponseState.Loading.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Observable.just(responseState);
            }
        })).onErrorReturnItem(QuestionsResponseState.Error.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
        bind(observableOnErrorReturnItem, LifecycleEvent.ON_STOP).subscribeKotlin(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.onStart$lambda$6(this.f$0, (QuestionsResponseState) obj);
            }
        });
        Maybes maybes = Maybes.INSTANCE;
        Maybe<ShareholderQuestion> maybeFetchDeepLinkQuestion = fetchDeepLinkQuestion();
        Maybe maybeFirstElement = observableFlatMapObservable.firstElement();
        Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "firstElement(...)");
        Maybe maybeOnErrorComplete = maybes.zip(maybeFetchDeepLinkQuestion, maybeFirstElement).onErrorComplete();
        Intrinsics.checkNotNullExpressionValue(maybeOnErrorComplete, "onErrorComplete(...)");
        LifecycleHost.DefaultImpls.bind$default(this, maybeOnErrorComplete, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.onStart$lambda$8(this.f$0, (Tuples2) obj);
            }
        });
        String sayReferenceId = ((LegacyFragmentKey.ShareholderEventQuestionList) companion.getArgs((HasSavedState) this)).getSayReferenceId();
        if (sayReferenceId != null) {
            RxFactory.DefaultImpls.rxCompletable$default(this, null, new QuestionListDuxo$onStart$5$1(this, sayReferenceId, null), 1, null).onErrorComplete().subscribe();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(final QuestionListDuxo questionListDuxo, final QaEventMetadata qaEventMetadata) {
        questionListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.onStart$lambda$2$lambda$1(qaEventMetadata, questionListDuxo, (QuestionListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuestionListViewState onStart$lambda$2$lambda$1(QaEventMetadata qaEventMetadata, QuestionListDuxo questionListDuxo, QuestionListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(qaEventMetadata);
        QuestionListViewState metadata = applyMutation.setMetadata(qaEventMetadata);
        questionListDuxo.setIfInitial(questionListDuxo.sortSubject, metadata.getActiveSort());
        questionListDuxo.setIfInitial(questionListDuxo.filterSubject, metadata.getActiveFilter());
        return metadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(QuestionListDuxo questionListDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        questionListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.onStart$lambda$4$lambda$3((QuestionListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuestionListViewState onStart$lambda$4$lambda$3(QuestionListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return QuestionListViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(QuestionListEvent.FetchMetadataFailed.INSTANCE), false, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(QuestionListDuxo questionListDuxo, final QuestionsResponseState questionsResponseState) {
        questionListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.onStart$lambda$6$lambda$5(questionsResponseState, (QuestionListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuestionListViewState onStart$lambda$6$lambda$5(QuestionsResponseState questionsResponseState, QuestionListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(questionsResponseState);
        return QuestionListViewState.copy$default(applyMutation, null, null, null, questionsResponseState, null, false, 55, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$8(QuestionListDuxo questionListDuxo, Tuples2 tuples2) {
        final ShareholderQuestion shareholderQuestion = (ShareholderQuestion) tuples2.component1();
        final QaEventMetadata qaEventMetadata = (QaEventMetadata) tuples2.component2();
        questionListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.onStart$lambda$8$lambda$7(shareholderQuestion, qaEventMetadata, (QuestionListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuestionListViewState onStart$lambda$8$lambda$7(ShareholderQuestion shareholderQuestion, QaEventMetadata qaEventMetadata, QuestionListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(shareholderQuestion);
        Intrinsics.checkNotNull(qaEventMetadata);
        return applyMutation.reduceShowLinkedQuestionEvent(shareholderQuestion, qaEventMetadata);
    }

    private final Maybe<ShareholderQuestion> fetchDeepLinkQuestion() {
        final UUID questionId = ((LegacyFragmentKey.ShareholderEventQuestionList) INSTANCE.getArgs((HasSavedState) this)).getQuestionId();
        if (questionId == null) {
            Maybe<ShareholderQuestion> maybeEmpty = Maybe.empty();
            Intrinsics.checkNotNullExpressionValue(maybeEmpty, "empty(...)");
            return maybeEmpty;
        }
        Maybe maybeFlatMapMaybe = getInstrumentId().flatMapMaybe(new Function() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo.fetchDeepLinkQuestion.1

            /* compiled from: QuestionListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$fetchDeepLinkQuestion$1$1", m3645f = "QuestionListDuxo.kt", m3646l = {167}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$fetchDeepLinkQuestion$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ShareholderQuestion>, Object> {
                final /* synthetic */ UUID $instrumentId;
                final /* synthetic */ UUID $questionId;
                int label;
                final /* synthetic */ QuestionListDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(QuestionListDuxo questionListDuxo, UUID uuid, UUID uuid2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = questionListDuxo;
                    this.$instrumentId = uuid;
                    this.$questionId = uuid2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$instrumentId, this.$questionId, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ShareholderQuestion> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    ShareholderExperienceStore shareholderExperienceStore = this.this$0.shareholderExperienceStore;
                    UUID uuid = this.$instrumentId;
                    Intrinsics.checkNotNull(uuid);
                    String eventSlug = ((LegacyFragmentKey.ShareholderEventQuestionList) QuestionListDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getEventSlug();
                    UUID uuid2 = this.$questionId;
                    this.label = 1;
                    Object question = shareholderExperienceStore.getQuestion(uuid, eventSlug, uuid2, this);
                    return question == coroutine_suspended ? coroutine_suspended : question;
                }
            }

            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends ShareholderQuestion> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                QuestionListDuxo questionListDuxo = QuestionListDuxo.this;
                return RxFactory.DefaultImpls.rxMaybe$default(questionListDuxo, null, new AnonymousClass1(questionListDuxo, instrumentId, questionId, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeFlatMapMaybe, "flatMapMaybe(...)");
        return maybeFlatMapMaybe;
    }

    private final Single<UUID> getInstrumentId() {
        Companion companion = INSTANCE;
        if (((LegacyFragmentKey.ShareholderEventQuestionList) companion.getArgs((HasSavedState) this)).getInstrumentId() != null) {
            Single<UUID> singleJust = Single.just(((LegacyFragmentKey.ShareholderEventQuestionList) companion.getArgs((HasSavedState) this)).getInstrumentId());
            Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
            return singleJust;
        }
        if (((LegacyFragmentKey.ShareholderEventQuestionList) companion.getArgs((HasSavedState) this)).getSymbol() == null) {
            Single<UUID> singleError = Single.error(new IllegalStateException("Shareholder Event Question List Launched without instrument ID or symbol!"));
            Intrinsics.checkNotNullExpressionValue(singleError, "error(...)");
            return singleError;
        }
        InstrumentStore instrumentStore = this.instrumentStore;
        String symbol = ((LegacyFragmentKey.ShareholderEventQuestionList) companion.getArgs((HasSavedState) this)).getSymbol();
        if (symbol == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Observable<Instrument> instrumentBySymbol = instrumentStore.getInstrumentBySymbol(symbol);
        final C285161 c285161 = new PropertyReference1Impl() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo.getInstrumentId.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Instrument) obj).getId();
            }
        };
        Single<UUID> singleFirstOrError = instrumentBySymbol.map(new Function(c285161) { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxoKt$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c285161, "function");
                this.function = c285161;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        return singleFirstOrError;
    }

    public final void setDropdownSelection(final DropdownType type2, final DropdownItem item) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(item, "item");
        applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.setDropdownSelection$lambda$10(type2, item, (QuestionListViewState) obj);
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            this.sortSubject.onNext(item);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.filterSubject.onNext(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuestionListViewState setDropdownSelection$lambda$10(DropdownType dropdownType, DropdownItem dropdownItem, QuestionListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        int i = WhenMappings.$EnumSwitchMapping$0[dropdownType.ordinal()];
        if (i == 1) {
            return QuestionListViewState.copy$default(applyMutation, null, null, dropdownItem, null, null, false, 59, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return QuestionListViewState.copy$default(applyMutation, null, dropdownItem, null, null, null, false, 61, null);
    }

    public final void deleteQuestion(final ShareholderQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        Completable completableFlatMapCompletable = getInstrumentId().flatMapCompletable(new Function() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo.deleteQuestion.1

            /* compiled from: QuestionListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$deleteQuestion$1$1", m3645f = "QuestionListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$deleteQuestion$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ UUID $instrumentId;
                final /* synthetic */ ShareholderQuestion $question;
                int label;
                final /* synthetic */ QuestionListDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(QuestionListDuxo questionListDuxo, UUID uuid, ShareholderQuestion shareholderQuestion, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = questionListDuxo;
                    this.$instrumentId = uuid;
                    this.$question = shareholderQuestion;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$instrumentId, this.$question, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ShareholderExperienceStore shareholderExperienceStore = this.this$0.shareholderExperienceStore;
                        UUID uuid = this.$instrumentId;
                        Intrinsics.checkNotNull(uuid);
                        String eventSlug = ((LegacyFragmentKey.ShareholderEventQuestionList) QuestionListDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getEventSlug();
                        ShareholderQuestion shareholderQuestion = this.$question;
                        this.label = 1;
                        if (shareholderExperienceStore.deleteQuestion(uuid, eventSlug, shareholderQuestion, this) == coroutine_suspended) {
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

            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                QuestionListDuxo questionListDuxo = QuestionListDuxo.this;
                return RxFactory.DefaultImpls.rxCompletable$default(questionListDuxo, null, new AnonymousClass1(questionListDuxo, instrumentId, question, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableFlatMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionListDuxo.deleteQuestion$lambda$12(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.deleteQuestion$lambda$14(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteQuestion$lambda$12(QuestionListDuxo questionListDuxo) {
        questionListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.deleteQuestion$lambda$12$lambda$11((QuestionListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuestionListViewState deleteQuestion$lambda$12$lambda$11(QuestionListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return QuestionListViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(QuestionListEvent.QuestionDeletionSucceeded.INSTANCE), false, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteQuestion$lambda$14(QuestionListDuxo questionListDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        questionListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.deleteQuestion$lambda$14$lambda$13((QuestionListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuestionListViewState deleteQuestion$lambda$14$lambda$13(QuestionListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return QuestionListViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(QuestionListEvent.QuestionDeletionFailed.INSTANCE), false, 47, null);
    }

    /* compiled from: QuestionListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onVoteClicked$1", m3645f = "QuestionListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onVoteClicked$1 */
    static final class C285181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ShareholderQuestion $question;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C285181(ShareholderQuestion shareholderQuestion, Continuation<? super C285181> continuation) {
            super(2, continuation);
            this.$question = shareholderQuestion;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QuestionListDuxo.this.new C285181(this.$question, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C285181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ShareholderExperienceStore shareholderExperienceStore = QuestionListDuxo.this.shareholderExperienceStore;
                ShareholderQuestion shareholderQuestion = this.$question;
                String eventSlug = ((LegacyFragmentKey.ShareholderEventQuestionList) QuestionListDuxo.INSTANCE.getArgs((HasSavedState) QuestionListDuxo.this)).getEventSlug();
                this.label = 1;
                if (shareholderExperienceStore.toggleVote(shareholderQuestion, eventSlug, this) == coroutine_suspended) {
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

    public final void onVoteClicked(ShareholderQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        Completable completableOnErrorComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C285181(question, null), 1, null).doOnError(new Consumer() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo.onVoteClicked.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                QuestionListDuxo.this.shareholderExperienceStore.refresh();
            }
        }).onErrorComplete();
        Intrinsics.checkNotNullExpressionValue(completableOnErrorComplete, "onErrorComplete(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableOnErrorComplete, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    public final void onCardClicked(final ShareholderQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.onCardClicked$lambda$15(question, (QuestionListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuestionListViewState onCardClicked$lambda$15(ShareholderQuestion shareholderQuestion, QuestionListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.reduceQuestionClicked(shareholderQuestion);
    }

    public final void resetFilter() {
        applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo.resetFilter$lambda$16(this.f$0, (QuestionListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuestionListViewState resetFilter$lambda$16(QuestionListDuxo questionListDuxo, QuestionListViewState applyMutation) {
        List<DropdownItem> filters;
        DropdownItem dropdownItem;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        QaEventMetadata eventMetadata = applyMutation.getEventMetadata();
        if (eventMetadata == null || (filters = eventMetadata.getFilters()) == null || (dropdownItem = (DropdownItem) CollectionsKt.firstOrNull((List) filters)) == null) {
            return applyMutation;
        }
        questionListDuxo.filterSubject.onNext(dropdownItem);
        return QuestionListViewState.copy$default(applyMutation, null, dropdownItem, null, null, null, false, 61, null);
    }

    public final void retry() {
        this.shareholderExperienceStore.refresh();
    }

    /* compiled from: QuestionListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderEventQuestionList;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<QuestionListDuxo, LegacyFragmentKey.ShareholderEventQuestionList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.ShareholderEventQuestionList getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.ShareholderEventQuestionList) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.ShareholderEventQuestionList getArgs(QuestionListDuxo questionListDuxo) {
            return (LegacyFragmentKey.ShareholderEventQuestionList) DuxoCompanion.DefaultImpls.getArgs(this, questionListDuxo);
        }
    }
}
