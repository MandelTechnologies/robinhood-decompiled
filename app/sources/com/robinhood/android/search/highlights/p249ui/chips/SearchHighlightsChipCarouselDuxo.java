package com.robinhood.android.search.highlights.p249ui.chips;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.librobinhood.data.store.CryptoDescriptionStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Quote;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
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
import search_coprocessor.p542v1.AssetDto;
import search_coprocessor.p542v1.AssetTypeDto;

/* compiled from: SearchHighlightsChipCarouselDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u001d\u001eB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00140\u00192\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/chips/SearchHighlightsChipCarouselDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/search/highlights/ui/chips/SearchHighlightsChipCarouselViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/search/highlights/ui/chips/SearchHighlightsChipCarouselDuxo$InitialArgs;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoDescriptionStore", "Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "assets", "", "Lsearch_coprocessor/v1/AssetDto;", "getAssets", "()Ljava/util/List;", "streamAssetQuotes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/redesign/model/AssetQuote;", "bind", "Lkotlinx/coroutines/Job;", "InitialArgs", "Companion", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchHighlightsChipCarouselDuxo extends BaseDuxo4<SearchHighlightsChipCarouselViewState> implements HasArgs<InitialArgs> {
    private final CryptoDescriptionStore cryptoDescriptionStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final QuoteStore quoteStore;
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
    /* JADX WARN: Multi-variable type inference failed */
    public SearchHighlightsChipCarouselDuxo(QuoteStore quoteStore, CryptoQuoteStore cryptoQuoteStore, CryptoDescriptionStore cryptoDescriptionStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new SearchHighlightsChipCarouselViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoDescriptionStore, "cryptoDescriptionStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.quoteStore = quoteStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptoDescriptionStore = cryptoDescriptionStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final List<AssetDto> getAssets() {
        return ((InitialArgs) INSTANCE.getArgs((HasArgs) this)).getAssets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<AssetQuote>> streamAssetQuotes(List<AssetDto> assets) {
        Flow flowFlowOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : assets) {
            AssetTypeDto asset_type = ((AssetDto) obj).getAsset_type();
            Object arrayList = linkedHashMap.get(asset_type);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(asset_type, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        List listEmptyList = (List) linkedHashMap.get(AssetTypeDto.EQUITY);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(StringsKt.toUuid(((AssetDto) it.next()).getId()));
        }
        List listEmptyList2 = (List) linkedHashMap.get(AssetTypeDto.CRYPTOCURRENCY);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(StringsKt.toUuid(((AssetDto) it2.next()).getId()));
        }
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(arrayList3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        for (IndexedValue indexedValue : iterableWithIndex) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
            linkedHashMap2.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        if (arrayList2.isEmpty()) {
            flowFlowOf = FlowKt.flowOf(CollectionsKt.emptyList());
        } else {
            final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.quoteStore.pollQuotesByInstrumentIds(arrayList2)), Integer.MAX_VALUE, null, 2, null);
            flowFlowOf = FlowKt.distinctUntilChanged(new Flow<List<? extends AssetQuote.Equity>>() { // from class: com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$streamAssetQuotes$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$streamAssetQuotes$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$streamAssetQuotes$$inlined$map$1$2", m3645f = "SearchHighlightsChipCarouselDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$streamAssetQuotes$$inlined$map$1$2$1, reason: invalid class name */
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

                    /* JADX WARN: Multi-variable type inference failed */
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
                            Iterable iterable = (Iterable) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                            Iterator<T> it = iterable.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new AssetQuote.Equity((Quote) it.next(), null, 2, 0 == true ? 1 : 0));
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super List<? extends AssetQuote.Equity>> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
        }
        return FlowKt.combine(flowFlowOf, !arrayList3.isEmpty() ? FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.cryptoQuoteStore.getPollCryptoQuotes().asFlow(arrayList3), new C27940xfef59620(null, linkedHashMap2, this))) : FlowKt.flowOf(CollectionsKt.emptyList()), new C279461(null));
    }

    /* compiled from: SearchHighlightsChipCarouselDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/redesign/model/AssetQuote;", "equities", "Lcom/robinhood/android/redesign/model/AssetQuote$Equity;", "cryptos", "Lcom/robinhood/android/redesign/model/AssetQuote$Crypto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$streamAssetQuotes$1", m3645f = "SearchHighlightsChipCarouselDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$streamAssetQuotes$1 */
    static final class C279461 extends ContinuationImpl7 implements Function3<List<? extends AssetQuote.Equity>, List<? extends AssetQuote.Crypto>, Continuation<? super List<? extends AssetQuote>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C279461(Continuation<? super C279461> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AssetQuote.Equity> list, List<? extends AssetQuote.Crypto> list2, Continuation<? super List<? extends AssetQuote>> continuation) {
            return invoke2((List<AssetQuote.Equity>) list, (List<AssetQuote.Crypto>) list2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AssetQuote.Equity> list, List<AssetQuote.Crypto> list2, Continuation<? super List<? extends AssetQuote>> continuation) {
            C279461 c279461 = new C279461(continuation);
            c279461.L$0 = list;
            c279461.L$1 = list2;
            return c279461.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CollectionsKt.plus((Collection) this.L$0, (Iterable) this.L$1);
        }
    }

    public final Job bind() {
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C279451(null), 2, null);
        return completableJobSupervisorJob$default;
    }

    /* compiled from: SearchHighlightsChipCarouselDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$bind$1", m3645f = "SearchHighlightsChipCarouselDuxo.kt", m3646l = {98}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$bind$1 */
    static final class C279451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C279451(Continuation<? super C279451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchHighlightsChipCarouselDuxo.this.new C279451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SearchHighlightsChipCarouselDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "assetQuotes", "", "Lcom/robinhood/android/redesign/model/AssetQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$bind$1$1", m3645f = "SearchHighlightsChipCarouselDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends AssetQuote>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchHighlightsChipCarouselDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchHighlightsChipCarouselDuxo searchHighlightsChipCarouselDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = searchHighlightsChipCarouselDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends AssetQuote> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchHighlightsChipCarouselDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/chips/SearchHighlightsChipCarouselViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$bind$1$1$1", m3645f = "SearchHighlightsChipCarouselDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.search.highlights.ui.chips.SearchHighlightsChipCarouselDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505281 extends ContinuationImpl7 implements Function2<SearchHighlightsChipCarouselViewState, Continuation<? super SearchHighlightsChipCarouselViewState>, Object> {
                final /* synthetic */ List<AssetQuote> $assetQuotes;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SearchHighlightsChipCarouselDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C505281(List<? extends AssetQuote> list, SearchHighlightsChipCarouselDuxo searchHighlightsChipCarouselDuxo, Continuation<? super C505281> continuation) {
                    super(2, continuation);
                    this.$assetQuotes = list;
                    this.this$0 = searchHighlightsChipCarouselDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505281 c505281 = new C505281(this.$assetQuotes, this.this$0, continuation);
                    c505281.L$0 = obj;
                    return c505281;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchHighlightsChipCarouselViewState searchHighlightsChipCarouselViewState, Continuation<? super SearchHighlightsChipCarouselViewState> continuation) {
                    return ((C505281) create(searchHighlightsChipCarouselViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SearchHighlightsChipCarouselViewState searchHighlightsChipCarouselViewState = (SearchHighlightsChipCarouselViewState) this.L$0;
                    ImmutableList3 persistentList = extensions2.toPersistentList(this.$assetQuotes);
                    List<AssetDto> assets = this.this$0.getAssets();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(assets, 10)), 16));
                    for (AssetDto assetDto : assets) {
                        Tuples2 tuples2M3642to = Tuples4.m3642to(assetDto.getId(), assetDto.getAsset_type());
                        linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                    }
                    return searchHighlightsChipCarouselViewState.copy(persistentList, extensions2.toImmutableMap(linkedHashMap));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                SearchHighlightsChipCarouselDuxo searchHighlightsChipCarouselDuxo = this.this$0;
                searchHighlightsChipCarouselDuxo.applyMutation(new C505281(list, searchHighlightsChipCarouselDuxo, null));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SearchHighlightsChipCarouselDuxo searchHighlightsChipCarouselDuxo = SearchHighlightsChipCarouselDuxo.this;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(searchHighlightsChipCarouselDuxo.streamAssetQuotes(searchHighlightsChipCarouselDuxo.getAssets()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SearchHighlightsChipCarouselDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: SearchHighlightsChipCarouselDuxo.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/chips/SearchHighlightsChipCarouselDuxo$InitialArgs;", "Landroid/os/Parcelable;", "assets", "", "Lsearch_coprocessor/v1/AssetDto;", "id", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getAssets", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitialArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitialArgs> CREATOR = new Creator();
        private final List<AssetDto> assets;
        private final String id;

        /* compiled from: SearchHighlightsChipCarouselDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitialArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(InitialArgs.class.getClassLoader()));
                }
                return new InitialArgs(arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs[] newArray(int i) {
                return new InitialArgs[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InitialArgs copy$default(InitialArgs initialArgs, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = initialArgs.assets;
            }
            if ((i & 2) != 0) {
                str = initialArgs.id;
            }
            return initialArgs.copy(list, str);
        }

        public final List<AssetDto> component1() {
            return this.assets;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final InitialArgs copy(List<AssetDto> assets, String id) {
            Intrinsics.checkNotNullParameter(assets, "assets");
            Intrinsics.checkNotNullParameter(id, "id");
            return new InitialArgs(assets, id);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitialArgs)) {
                return false;
            }
            InitialArgs initialArgs = (InitialArgs) other;
            return Intrinsics.areEqual(this.assets, initialArgs.assets) && Intrinsics.areEqual(this.id, initialArgs.id);
        }

        public int hashCode() {
            return (this.assets.hashCode() * 31) + this.id.hashCode();
        }

        public String toString() {
            return "InitialArgs(assets=" + this.assets + ", id=" + this.id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<AssetDto> list = this.assets;
            dest.writeInt(list.size());
            Iterator<AssetDto> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.id);
        }

        public InitialArgs(List<AssetDto> assets, String id) {
            Intrinsics.checkNotNullParameter(assets, "assets");
            Intrinsics.checkNotNullParameter(id, "id");
            this.assets = assets;
            this.id = id;
        }

        public final List<AssetDto> getAssets() {
            return this.assets;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: SearchHighlightsChipCarouselDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/chips/SearchHighlightsChipCarouselDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/search/highlights/ui/chips/SearchHighlightsChipCarouselDuxo;", "Lcom/robinhood/android/search/highlights/ui/chips/SearchHighlightsChipCarouselDuxo$InitialArgs;", "<init>", "()V", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<SearchHighlightsChipCarouselDuxo, InitialArgs> {
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
        public InitialArgs getArgs(SearchHighlightsChipCarouselDuxo searchHighlightsChipCarouselDuxo) {
            return (InitialArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, searchHighlightsChipCarouselDuxo);
        }
    }
}
