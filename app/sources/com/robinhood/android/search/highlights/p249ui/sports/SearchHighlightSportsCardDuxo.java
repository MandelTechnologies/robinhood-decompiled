package com.robinhood.android.search.highlights.p249ui.sports;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventStateStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.utils.extensions.StringsKt;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import p479j$.time.Clock;
import search_coprocessor.p542v1.SportCarouselDto;

/* compiled from: SearchHighlightSportsCardDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u001e\u001dB9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardDataState;", "Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardDuxo$InitialArgs;", "Lcom/robinhood/store/event/EventStore;", "eventStore", "Lcom/robinhood/store/event/EventStateStore;", "eventStateStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketdataStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/event/EventStateStore;Lcom/robinhood/store/event/EventMarketdataStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "Lkotlinx/coroutines/Job;", "bind", "()Lkotlinx/coroutines/Job;", "Lcom/robinhood/store/event/EventStore;", "Lcom/robinhood/store/event/EventStateStore;", "Lcom/robinhood/store/event/EventMarketdataStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "InitialArgs", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchHighlightSportsCardDuxo extends BaseDuxo<SearchHighlightSportsCardDataState, SearchHighlightSportsCardViewState> implements HasArgs<InitialArgs> {
    private final EventMarketdataStore eventMarketdataStore;
    private final EventStateStore eventStateStore;
    private final EventStore eventStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitialArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitialArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHighlightSportsCardDuxo(EventStore eventStore, EventStateStore eventStateStore, EventMarketdataStore eventMarketdataStore, Clock clock, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new SearchHighlightSportsCardDataState(null, null, null, null, false, clock, null, 95, null), new SearchHighlightSportsCardProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.eventStore = eventStore;
        this.eventStateStore = eventStateStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final Job bind() {
        UUID uuid;
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        try {
            uuid = StringsKt.toUuid(((InitialArgs) INSTANCE.getArgs((HasArgs) this)).getEvent().getId());
        } catch (IllegalArgumentException unused) {
            uuid = null;
        }
        if (uuid == null) {
            return completableJobSupervisorJob$default;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C280261(uuid, null), 2, null);
        return completableJobSupervisorJob$default;
    }

    /* compiled from: SearchHighlightSportsCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.sports.SearchHighlightSportsCardDuxo$bind$1", m3645f = "SearchHighlightSportsCardDuxo.kt", m3646l = {77}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.highlights.ui.sports.SearchHighlightSportsCardDuxo$bind$1 */
    static final class C280261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $eventId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C280261(UUID uuid, Continuation<? super C280261> continuation) {
            super(2, continuation);
            this.$eventId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchHighlightSportsCardDuxo.this.new C280261(this.$eventId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C280261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow sharedFlowShareIn = FlowKt.shareIn(SearchHighlightSportsCardDuxo.this.eventStore.streamEvent(this.$eventId), SearchHighlightSportsCardDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
                Flow flowCombine = FlowKt.combine(sharedFlowShareIn, FlowKt.transformLatest(sharedFlowShareIn, new C28024xfba24bb3(null, SearchHighlightSportsCardDuxo.this)), FlowKt.transformLatest(sharedFlowShareIn, new C28025xfba24bb4(null, SearchHighlightSportsCardDuxo.this)), new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SearchHighlightSportsCardDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SearchHighlightSportsCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\t\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Triple;", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "event", "quotes", "eventState"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.sports.SearchHighlightSportsCardDuxo$bind$1$1", m3645f = "SearchHighlightSportsCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.sports.SearchHighlightSportsCardDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function4<UiEcEvent, Map<UUID, ? extends EventQuote>, PredictionMarketEventState, Continuation<? super Tuples3<? extends UiEcEvent, ? extends Map<UUID, ? extends EventQuote>, ? extends PredictionMarketEventState>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(4, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(UiEcEvent uiEcEvent, Map<UUID, EventQuote> map, PredictionMarketEventState predictionMarketEventState, Continuation<? super Tuples3<UiEcEvent, ? extends Map<UUID, EventQuote>, PredictionMarketEventState>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = uiEcEvent;
                anonymousClass1.L$1 = map;
                anonymousClass1.L$2 = predictionMarketEventState;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(UiEcEvent uiEcEvent, Map<UUID, ? extends EventQuote> map, PredictionMarketEventState predictionMarketEventState, Continuation<? super Tuples3<? extends UiEcEvent, ? extends Map<UUID, ? extends EventQuote>, ? extends PredictionMarketEventState>> continuation) {
                return invoke2(uiEcEvent, (Map<UUID, EventQuote>) map, predictionMarketEventState, (Continuation<? super Tuples3<UiEcEvent, ? extends Map<UUID, EventQuote>, PredictionMarketEventState>>) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new Tuples3((UiEcEvent) this.L$0, (Map) this.L$1, (PredictionMarketEventState) this.L$2);
            }
        }

        /* compiled from: SearchHighlightSportsCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\b0\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Triple;", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.sports.SearchHighlightSportsCardDuxo$bind$1$2", m3645f = "SearchHighlightSportsCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.sports.SearchHighlightSportsCardDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples3<? extends UiEcEvent, ? extends Map<UUID, ? extends EventQuote>, ? extends PredictionMarketEventState>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchHighlightSportsCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SearchHighlightSportsCardDuxo searchHighlightSportsCardDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchHighlightSportsCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends UiEcEvent, ? extends Map<UUID, ? extends EventQuote>, ? extends PredictionMarketEventState> tuples3, Continuation<? super Unit> continuation) {
                return invoke2((Tuples3<UiEcEvent, ? extends Map<UUID, EventQuote>, PredictionMarketEventState>) tuples3, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples3<UiEcEvent, ? extends Map<UUID, EventQuote>, PredictionMarketEventState> tuples3, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchHighlightSportsCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.sports.SearchHighlightSportsCardDuxo$bind$1$2$1", m3645f = "SearchHighlightSportsCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.highlights.ui.sports.SearchHighlightSportsCardDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchHighlightSportsCardDataState, Continuation<? super SearchHighlightSportsCardDataState>, Object> {
                final /* synthetic */ UiEcEvent $event;
                final /* synthetic */ PredictionMarketEventState $eventState;
                final /* synthetic */ Map<UUID, EventQuote> $quotes;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SearchHighlightSportsCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SearchHighlightSportsCardDuxo searchHighlightSportsCardDuxo, UiEcEvent uiEcEvent, PredictionMarketEventState predictionMarketEventState, Map<UUID, EventQuote> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = searchHighlightSportsCardDuxo;
                    this.$event = uiEcEvent;
                    this.$eventState = predictionMarketEventState;
                    this.$quotes = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$event, this.$eventState, this.$quotes, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchHighlightSportsCardDataState searchHighlightSportsCardDataState, Continuation<? super SearchHighlightSportsCardDataState> continuation) {
                    return ((AnonymousClass1) create(searchHighlightSportsCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SearchHighlightSportsCardDataState searchHighlightSportsCardDataState = (SearchHighlightSportsCardDataState) this.L$0;
                    return searchHighlightSportsCardDataState.copy(((InitialArgs) SearchHighlightSportsCardDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getEvent().getContract_id_to_aux_description(), this.$event, this.$eventState, this.$event.getOrderedContracts(), false, searchHighlightSportsCardDataState.getClock(), this.$quotes);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples3 tuples3 = (Tuples3) this.L$0;
                UiEcEvent uiEcEvent = (UiEcEvent) tuples3.component1();
                Map map = (Map) tuples3.component2();
                PredictionMarketEventState predictionMarketEventState = (PredictionMarketEventState) tuples3.component3();
                SearchHighlightSportsCardDuxo searchHighlightSportsCardDuxo = this.this$0;
                searchHighlightSportsCardDuxo.applyMutation(new AnonymousClass1(searchHighlightSportsCardDuxo, uiEcEvent, predictionMarketEventState, map, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: SearchHighlightSportsCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardDuxo$InitialArgs;", "Landroid/os/Parcelable;", "event", "Lsearch_coprocessor/v1/SportCarouselDto$EventDto;", "<init>", "(Lsearch_coprocessor/v1/SportCarouselDto$EventDto;)V", "getEvent", "()Lsearch_coprocessor/v1/SportCarouselDto$EventDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitialArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitialArgs> CREATOR = new Creator();
        private final SportCarouselDto.EventDto event;

        /* compiled from: SearchHighlightSportsCardDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitialArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitialArgs((SportCarouselDto.EventDto) parcel.readParcelable(InitialArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs[] newArray(int i) {
                return new InitialArgs[i];
            }
        }

        public static /* synthetic */ InitialArgs copy$default(InitialArgs initialArgs, SportCarouselDto.EventDto eventDto, int i, Object obj) {
            if ((i & 1) != 0) {
                eventDto = initialArgs.event;
            }
            return initialArgs.copy(eventDto);
        }

        /* renamed from: component1, reason: from getter */
        public final SportCarouselDto.EventDto getEvent() {
            return this.event;
        }

        public final InitialArgs copy(SportCarouselDto.EventDto event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return new InitialArgs(event);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitialArgs) && Intrinsics.areEqual(this.event, ((InitialArgs) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "InitialArgs(event=" + this.event + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.event, flags);
        }

        public InitialArgs(SportCarouselDto.EventDto event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public final SportCarouselDto.EventDto getEvent() {
            return this.event;
        }
    }

    /* compiled from: SearchHighlightSportsCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardDuxo;", "Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardDuxo$InitialArgs;", "<init>", "()V", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<SearchHighlightSportsCardDuxo, InitialArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitialArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitialArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitialArgs getArgs(SearchHighlightSportsCardDuxo searchHighlightSportsCardDuxo) {
            return (InitialArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, searchHighlightSportsCardDuxo);
        }
    }
}
