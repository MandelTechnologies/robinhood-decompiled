package com.robinhood.android.search.highlights.p249ui.earnings;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import com.robinhood.shared.equities.models.store.TraderEarningStore;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.temporal.ChronoUnit;
import search_coprocessor.p542v1.AssetDto;

/* compiled from: SearchHighlightsEarningRowDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002'&B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightsEarningRowDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightsEarningRowViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightsEarningRowDuxo$InitialArgs;", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "earningsStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/shared/equities/models/store/TraderEarningStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "Ljava/util/UUID;", "assetId", "", "updateStores", "(Ljava/util/UUID;)V", "onCreate", "()V", "Lkotlinx/coroutines/Job;", "bind", "()Lkotlinx/coroutines/Job;", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "InitialArgs", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchHighlightsEarningRowDuxo extends BaseDuxo4<SearchHighlightsEarningRowViewState> implements HasArgs<InitialArgs> {
    private final Clock clock;
    private final TraderEarningStore earningsStore;
    private final InstrumentStore instrumentStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitialArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitialArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    public final Clock getClock() {
        return this.clock;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHighlightsEarningRowDuxo(TraderEarningStore earningsStore, QuoteStore quoteStore, InstrumentStore instrumentStore, Clock clock, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new SearchHighlightsEarningRowViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(earningsStore, "earningsStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.earningsStore = earningsStore;
        this.quoteStore = quoteStore;
        this.instrumentStore = instrumentStore;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        UUID uuid;
        super.onCreate();
        try {
            uuid = StringsKt.toUuid(((InitialArgs) INSTANCE.getArgs((HasArgs) this)).getAsset().getId());
        } catch (IllegalArgumentException unused) {
            uuid = null;
        }
        if (uuid == null) {
            return;
        }
        updateStores(uuid);
    }

    public final Job bind() {
        UUID uuid;
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        try {
            uuid = StringsKt.toUuid(((InitialArgs) INSTANCE.getArgs((HasArgs) this)).getAsset().getId());
        } catch (IllegalArgumentException unused) {
            uuid = null;
        }
        if (uuid == null) {
            return completableJobSupervisorJob$default;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C279591(uuid, null), 2, null);
        return completableJobSupervisorJob$default;
    }

    /* compiled from: SearchHighlightsEarningRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1", m3645f = "SearchHighlightsEarningRowDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1 */
    static final class C279591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $assetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C279591(UUID uuid, Continuation<? super C279591> continuation) {
            super(2, continuation);
            this.$assetId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchHighlightsEarningRowDuxo.this.new C279591(this.$assetId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Instant instant = SearchHighlightsEarningRowDuxo.this.getClock().instant();
                Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                ZoneId newYorkZoneId = UtilsKt.getNewYorkZoneId();
                Intrinsics.checkNotNullExpressionValue(newYorkZoneId, "<get-newYorkZoneId>(...)");
                final LocalDate localDate = Instants.toLocalDate(instant, newYorkZoneId);
                final Flow flowOnStart = FlowKt.onStart(Context7.buffer$default(RxConvert.asFlow(SearchHighlightsEarningRowDuxo.this.earningsStore.getEarnings(this.$assetId)), Integer.MAX_VALUE, null, 2, null), new SearchHighlightsEarningRowDuxo4(null));
                Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(SearchHighlightsEarningRowDuxo.this.instrumentStore.getInstrument(this.$assetId)), Integer.MAX_VALUE, null, 2, null), new C27956xfcddb28f(null, SearchHighlightsEarningRowDuxo.this, this.$assetId, new Flow<Earning>() { // from class: com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Earning> flowCollector, Continuation continuation) {
                        Object objCollect = flowOnStart.collect(new AnonymousClass2(flowCollector, localDate), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ LocalDate $now$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1$invokeSuspend$$inlined$map$1$2", m3645f = "SearchHighlightsEarningRowDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, LocalDate localDate) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$now$inlined = localDate;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        /* JADX WARN: Type inference failed for: r2v10 */
                        /* JADX WARN: Type inference failed for: r2v11 */
                        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r2v4 */
                        /* JADX WARN: Type inference failed for: r2v5 */
                        /* JADX WARN: Type inference failed for: r2v7 */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            LocalDate localDate;
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
                                List<Earning> earnings = ((UiEarnings) obj).getEarnings();
                                ArrayList arrayList = new ArrayList();
                                Iterator<T> it = earnings.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    Earning.Report report = ((Earning) next).getReport();
                                    if ((report != null ? report.getDate() : null) != null) {
                                        arrayList.add(next);
                                    }
                                }
                                Iterator<T> it2 = arrayList.iterator();
                                if (it2.hasNext()) {
                                    T next2 = it2.next();
                                    if (it2.hasNext()) {
                                        Earning.Report report2 = ((Earning) next2).getReport();
                                        LocalDate date = report2 != null ? report2.getDate() : null;
                                        if (date == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        long jAbs = Math.abs(ChronoUnit.DAYS.between(date, this.$now$inlined));
                                        do {
                                            T next3 = it2.next();
                                            Earning.Report report3 = ((Earning) next3).getReport();
                                            LocalDate date2 = report3 != null ? report3.getDate() : null;
                                            if (date2 == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            long jAbs2 = Math.abs(ChronoUnit.DAYS.between(date2, this.$now$inlined));
                                            next2 = next2;
                                            if (jAbs > jAbs2) {
                                                jAbs = jAbs2;
                                                next2 = next3;
                                            }
                                        } while (it2.hasNext());
                                    }
                                    localDate = next2;
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(localDate, anonymousClass1) == coroutine_suspended) {
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
                }));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SearchHighlightsEarningRowDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SearchHighlightsEarningRowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "earningsItem", "Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightEarningsItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1$2", m3645f = "SearchHighlightsEarningRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SearchHighlightEarningsItem, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchHighlightsEarningRowDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SearchHighlightsEarningRowDuxo searchHighlightsEarningRowDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchHighlightsEarningRowDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SearchHighlightEarningsItem searchHighlightEarningsItem, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(searchHighlightEarningsItem, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchHighlightsEarningRowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightsEarningRowViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1$2$1", m3645f = "SearchHighlightsEarningRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchHighlightsEarningRowViewState, Continuation<? super SearchHighlightsEarningRowViewState>, Object> {
                final /* synthetic */ SearchHighlightEarningsItem $earningsItem;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SearchHighlightEarningsItem searchHighlightEarningsItem, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$earningsItem = searchHighlightEarningsItem;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$earningsItem, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchHighlightsEarningRowViewState searchHighlightsEarningRowViewState, Continuation<? super SearchHighlightsEarningRowViewState> continuation) {
                    return ((AnonymousClass1) create(searchHighlightsEarningRowViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((SearchHighlightsEarningRowViewState) this.L$0).copy(this.$earningsItem);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((SearchHighlightEarningsItem) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void updateStores(UUID assetId) {
        this.instrumentStore.pingInstruments(CollectionsKt.listOf(assetId));
        this.earningsStore.refresh(assetId, false);
    }

    /* compiled from: SearchHighlightsEarningRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightsEarningRowDuxo$InitialArgs;", "Landroid/os/Parcelable;", "asset", "Lsearch_coprocessor/v1/AssetDto;", "<init>", "(Lsearch_coprocessor/v1/AssetDto;)V", "getAsset", "()Lsearch_coprocessor/v1/AssetDto;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InitialArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitialArgs> CREATOR = new Creator();
        private final AssetDto asset;

        /* compiled from: SearchHighlightsEarningRowDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitialArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitialArgs((AssetDto) parcel.readParcelable(InitialArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs[] newArray(int i) {
                return new InitialArgs[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.asset, flags);
        }

        public InitialArgs(AssetDto asset) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.asset = asset;
        }

        public final AssetDto getAsset() {
            return this.asset;
        }
    }

    /* compiled from: SearchHighlightsEarningRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightsEarningRowDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightsEarningRowDuxo;", "Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightsEarningRowDuxo$InitialArgs;", "<init>", "()V", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<SearchHighlightsEarningRowDuxo, InitialArgs> {
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
        public InitialArgs getArgs(SearchHighlightsEarningRowDuxo searchHighlightsEarningRowDuxo) {
            return (InitialArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, searchHighlightsEarningRowDuxo);
        }
    }
}
