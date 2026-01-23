package com.robinhood.android.search.highlights.duxo;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.search.highlights.SearchHighlightsManager;
import com.robinhood.android.search.highlights.model.SearchHighlightData;
import com.robinhood.android.search.highlights.p249ui.subpages.SearchHighlightSubpageData;
import com.robinhood.android.search.highlights.util.SearchHighlightExperiments;
import com.robinhood.android.search.highlights.util.SearchHighlightsExperiment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import search_coprocessor.p542v1.GetSearchHighlightsResponseDto;
import search_coprocessor.p542v1.GetSearchSubpageContentResponseDto;
import search_coprocessor.p542v1.SearchSubpageDto;
import timber.log.Timber;

/* compiled from: SearchHighlightsDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0010\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011J\u0014\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u001e\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u000e\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0011J\u0018\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u000e\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u00142\u0006\u0010%\u001a\u00020!J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010%\u001a\u00020!H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "searchHighlightsManager", "Lcom/robinhood/android/search/highlights/SearchHighlightsManager;", "experimentManager", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/search/highlights/SearchHighlightsManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "pendingDeeplinkSubpageId", "", "lastProcessedDeeplinkSubpageId", "onCreate", "", "preloadIfNeeded", "refreshSubPages", "streamSearchHighlightRelatedExperiments", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/search/highlights/util/SearchHighlightExperiments;", "onSearchPageOpened", "subpageId", "processDeeplinkIfNeeded", "subpages", "", "Lsearch_coprocessor/v1/SearchSubpageDto;", "convertSubpageIdToSubPageData", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "targetSubpageId", "onSubpageTargetRequested", "selectSubpageFromDeeplink", "subpage", "toggleShowMoreEarnings", "showMore", "", "onSubpageSelected", "performTabSelection", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchHighlightsDuxo extends BaseDuxo4<SearchHighlightsViewState> implements HasSavedState {
    public static final int $stable = 8;
    private final ExperimentsStore experimentManager;
    private volatile String lastProcessedDeeplinkSubpageId;
    private volatile String pendingDeeplinkSubpageId;
    private final SavedStateHandle savedStateHandle;
    private final SearchHighlightsManager searchHighlightsManager;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHighlightsDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, SearchHighlightsManager searchHighlightsManager, ExperimentsStore experimentManager) {
        super(new SearchHighlightsViewState(null, null, null, false, null, 31, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(searchHighlightsManager, "searchHighlightsManager");
        Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
        this.savedStateHandle = savedStateHandle;
        this.searchHighlightsManager = searchHighlightsManager;
        this.experimentManager = experimentManager;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C279301(null));
    }

    /* compiled from: SearchHighlightsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$onCreate$1", m3645f = "SearchHighlightsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$onCreate$1 */
    static final class C279301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C279301(Continuation<? super C279301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C279301 c279301 = SearchHighlightsDuxo.this.new C279301(continuation);
            c279301.L$0 = obj;
            return c279301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SearchHighlightsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$onCreate$1$1", m3645f = "SearchHighlightsDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchHighlightsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchHighlightsDuxo searchHighlightsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = searchHighlightsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.streamSearchHighlightRelatedExperiments(), new C27927xc2fad594(null, this.this$0));
                    final SearchHighlightsDuxo searchHighlightsDuxo = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo.onCreate.1.1.2

                        /* compiled from: SearchHighlightsDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$onCreate$1$1$2$1", m3645f = "SearchHighlightsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$onCreate$1$1$2$1, reason: invalid class name and collision with other inner class name */
                        static final class C505251 extends ContinuationImpl7 implements Function2<SearchHighlightsViewState, Continuation<? super SearchHighlightsViewState>, Object> {
                            final /* synthetic */ SearchHighlightExperiments $experiments;
                            final /* synthetic */ SearchHighlightData $highlightData;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C505251(SearchHighlightExperiments searchHighlightExperiments, SearchHighlightData searchHighlightData, Continuation<? super C505251> continuation) {
                                super(2, continuation);
                                this.$experiments = searchHighlightExperiments;
                                this.$highlightData = searchHighlightData;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C505251 c505251 = new C505251(this.$experiments, this.$highlightData, continuation);
                                c505251.L$0 = obj;
                                return c505251;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(SearchHighlightsViewState searchHighlightsViewState, Continuation<? super SearchHighlightsViewState> continuation) {
                                return ((C505251) create(searchHighlightsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                Map<String, GetSearchSubpageContentResponseDto> subPageContents;
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                SearchHighlightsViewState searchHighlightsViewState = (SearchHighlightsViewState) this.L$0;
                                SearchHighlightExperiments searchHighlightExperiments = this.$experiments;
                                SearchHighlightData searchHighlightData = this.$highlightData;
                                ImmutableMap immutableMap = null;
                                GetSearchHighlightsResponseDto highlightsResponse = searchHighlightData != null ? searchHighlightData.getHighlightsResponse() : null;
                                SearchHighlightData searchHighlightData2 = this.$highlightData;
                                if (searchHighlightData2 != null && (subPageContents = searchHighlightData2.getSubPageContents()) != null) {
                                    immutableMap = extensions2.toImmutableMap(subPageContents);
                                }
                                return SearchHighlightsViewState.copy$default(searchHighlightsViewState, searchHighlightExperiments, highlightsResponse, immutableMap, false, null, 24, null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Tuples2<SearchHighlightExperiments, SearchHighlightData>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Tuples2<SearchHighlightExperiments, SearchHighlightData> tuples2, Continuation<? super Unit> continuation) {
                            GetSearchHighlightsResponseDto highlightsResponse;
                            SearchHighlightExperiments searchHighlightExperimentsComponent1 = tuples2.component1();
                            SearchHighlightData searchHighlightDataComponent2 = tuples2.component2();
                            List<SearchSubpageDto> listEmptyList = null;
                            searchHighlightsDuxo.applyMutation(new C505251(searchHighlightExperimentsComponent1, searchHighlightDataComponent2, null));
                            SearchHighlightsDuxo searchHighlightsDuxo2 = searchHighlightsDuxo;
                            if (searchHighlightDataComponent2 != null && (highlightsResponse = searchHighlightDataComponent2.getHighlightsResponse()) != null) {
                                listEmptyList = highlightsResponse.getSubpages();
                            }
                            if (listEmptyList == null) {
                                listEmptyList = CollectionsKt.emptyList();
                            }
                            searchHighlightsDuxo2.processDeeplinkIfNeeded(listEmptyList);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowTransformLatest.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(SearchHighlightsDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void preloadIfNeeded() {
        Timber.INSTANCE.mo3350d("Preloading search highlights", new Object[0]);
    }

    /* compiled from: SearchHighlightsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$refreshSubPages$1", m3645f = "SearchHighlightsDuxo.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$refreshSubPages$1 */
    static final class C279331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C279331(Continuation<? super C279331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchHighlightsDuxo.this.new C279331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SearchHighlightsManager searchHighlightsManager = SearchHighlightsDuxo.this.searchHighlightsManager;
                this.label = 1;
                if (SearchHighlightsManager.refreshSubpagesIfNeeded$default(searchHighlightsManager, null, false, this, 3, null) == coroutine_suspended) {
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

    public final void refreshSubPages() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C279331(null), 3, null);
    }

    public final Flow<SearchHighlightExperiments> streamSearchHighlightRelatedExperiments() {
        final Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentManager, new Experiment[]{SearchHighlightsExperiment.INSTANCE}, false, null, 4, null);
        return new Flow<SearchHighlightExperiments>() { // from class: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$streamSearchHighlightRelatedExperiments$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$streamSearchHighlightRelatedExperiments$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$streamSearchHighlightRelatedExperiments$$inlined$map$1$2", m3645f = "SearchHighlightsDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$streamSearchHighlightRelatedExperiments$$inlined$map$1$2$1, reason: invalid class name */
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
                        SearchHighlightExperiments searchHighlightExperiments = new SearchHighlightExperiments(((Boolean) obj).booleanValue());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(searchHighlightExperiments, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super SearchHighlightExperiments> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamStateFlow$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final void onSearchPageOpened(String subpageId) {
        this.experimentManager.logExposure(SearchHighlightsExperiment.INSTANCE);
        refreshSubPages();
        if (subpageId != null) {
            onSubpageTargetRequested(subpageId);
        }
    }

    public final void processDeeplinkIfNeeded(List<SearchSubpageDto> subpages) {
        SearchHighlightSubpageData searchHighlightSubpageDataConvertSubpageIdToSubPageData;
        Intrinsics.checkNotNullParameter(subpages, "subpages");
        String str = this.pendingDeeplinkSubpageId;
        if (str == null || Intrinsics.areEqual(str, this.lastProcessedDeeplinkSubpageId) || (searchHighlightSubpageDataConvertSubpageIdToSubPageData = convertSubpageIdToSubPageData(str, subpages)) == null) {
            return;
        }
        selectSubpageFromDeeplink(searchHighlightSubpageDataConvertSubpageIdToSubPageData, str);
    }

    public final SearchHighlightSubpageData convertSubpageIdToSubPageData(String targetSubpageId, List<SearchSubpageDto> subpages) {
        Object next;
        Intrinsics.checkNotNullParameter(targetSubpageId, "targetSubpageId");
        Intrinsics.checkNotNullParameter(subpages, "subpages");
        Iterator<T> it = subpages.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((SearchSubpageDto) next).getId(), targetSubpageId)) {
                break;
            }
        }
        SearchSubpageDto searchSubpageDto = (SearchSubpageDto) next;
        if (searchSubpageDto != null) {
            return new SearchHighlightSubpageData.Remote(targetSubpageId, searchSubpageDto);
        }
        return null;
    }

    public final void onSubpageTargetRequested(final String targetSubpageId) {
        Intrinsics.checkNotNullParameter(targetSubpageId, "targetSubpageId");
        if (Intrinsics.areEqual(targetSubpageId, this.lastProcessedDeeplinkSubpageId)) {
            return;
        }
        withDataState(new Function1() { // from class: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchHighlightsDuxo.onSubpageTargetRequested$lambda$4(this.f$0, targetSubpageId, (SearchHighlightsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSubpageTargetRequested$lambda$4(SearchHighlightsDuxo searchHighlightsDuxo, String str, SearchHighlightsViewState dataState) {
        SearchHighlightSubpageData next;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Iterator<SearchHighlightSubpageData> it = dataState.getSubpages().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(next.getId(), str)) {
                break;
            }
        }
        SearchHighlightSubpageData searchHighlightSubpageData = next;
        if (searchHighlightSubpageData != null) {
            searchHighlightsDuxo.selectSubpageFromDeeplink(searchHighlightSubpageData, str);
        } else {
            searchHighlightsDuxo.pendingDeeplinkSubpageId = str;
        }
        return Unit.INSTANCE;
    }

    private final void selectSubpageFromDeeplink(SearchHighlightSubpageData subpage, String subpageId) {
        this.pendingDeeplinkSubpageId = null;
        this.lastProcessedDeeplinkSubpageId = subpageId;
        performTabSelection(subpage);
    }

    /* compiled from: SearchHighlightsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$toggleShowMoreEarnings$1", m3645f = "SearchHighlightsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$toggleShowMoreEarnings$1 */
    static final class C279341 extends ContinuationImpl7 implements Function2<SearchHighlightsViewState, Continuation<? super SearchHighlightsViewState>, Object> {
        final /* synthetic */ boolean $showMore;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C279341(boolean z, Continuation<? super C279341> continuation) {
            super(2, continuation);
            this.$showMore = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C279341 c279341 = new C279341(this.$showMore, continuation);
            c279341.L$0 = obj;
            return c279341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SearchHighlightsViewState searchHighlightsViewState, Continuation<? super SearchHighlightsViewState> continuation) {
            return ((C279341) create(searchHighlightsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SearchHighlightsViewState.copy$default((SearchHighlightsViewState) this.L$0, null, null, null, !this.$showMore, null, 23, null);
        }
    }

    public final void toggleShowMoreEarnings(boolean showMore) {
        applyMutation(new C279341(showMore, null));
    }

    public final void onSubpageSelected(SearchHighlightSubpageData subpage) {
        Intrinsics.checkNotNullParameter(subpage, "subpage");
        this.lastProcessedDeeplinkSubpageId = null;
        performTabSelection(subpage);
    }

    /* compiled from: SearchHighlightsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$performTabSelection$1", m3645f = "SearchHighlightsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$performTabSelection$1 */
    static final class C279311 extends ContinuationImpl7 implements Function2<SearchHighlightsViewState, Continuation<? super SearchHighlightsViewState>, Object> {
        final /* synthetic */ SearchHighlightSubpageData $subpage;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C279311(SearchHighlightSubpageData searchHighlightSubpageData, Continuation<? super C279311> continuation) {
            super(2, continuation);
            this.$subpage = searchHighlightSubpageData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C279311 c279311 = new C279311(this.$subpage, continuation);
            c279311.L$0 = obj;
            return c279311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SearchHighlightsViewState searchHighlightsViewState, Continuation<? super SearchHighlightsViewState> continuation) {
            return ((C279311) create(searchHighlightsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SearchHighlightsViewState.copy$default((SearchHighlightsViewState) this.L$0, null, null, null, false, this.$subpage, 15, null);
        }
    }

    private final void performTabSelection(SearchHighlightSubpageData subpage) {
        applyMutation(new C279311(subpage, null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C279322(subpage, this, null), 3, null);
    }

    /* compiled from: SearchHighlightsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$performTabSelection$2", m3645f = "SearchHighlightsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo$performTabSelection$2 */
    static final class C279322 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SearchHighlightSubpageData $subpage;
        int label;
        final /* synthetic */ SearchHighlightsDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C279322(SearchHighlightSubpageData searchHighlightSubpageData, SearchHighlightsDuxo searchHighlightsDuxo, Continuation<? super C279322> continuation) {
            super(2, continuation);
            this.$subpage = searchHighlightSubpageData;
            this.this$0 = searchHighlightsDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C279322(this.$subpage, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279322) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$subpage instanceof SearchHighlightSubpageData.Remote) {
                    SearchHighlightsManager searchHighlightsManager = this.this$0.searchHighlightsManager;
                    List<? extends SearchHighlightSubpageData> listListOf = CollectionsKt.listOf(this.$subpage);
                    this.label = 1;
                    if (searchHighlightsManager.refreshSubpagesIfNeeded(listListOf, false, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
}
