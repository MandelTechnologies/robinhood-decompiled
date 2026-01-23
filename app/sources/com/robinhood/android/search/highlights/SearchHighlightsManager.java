package com.robinhood.android.search.highlights;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.search.highlights.SearchHighlightsManager;
import com.robinhood.android.search.highlights.model.PollingInterval;
import com.robinhood.android.search.highlights.model.SearchHighlightData;
import com.robinhood.android.search.highlights.p249ui.subpages.SearchHighlightSubpageData;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.datetime.Converters4;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import p479j$.time.Clock;
import p479j$.time.Instant;
import search_coprocessor.p542v1.GetSearchHighlightsRequestDto;
import search_coprocessor.p542v1.GetSearchHighlightsResponseDto;
import search_coprocessor.p542v1.GetSearchSubpageContentRequestDto;
import search_coprocessor.p542v1.GetSearchSubpageContentResponseDto;
import search_coprocessor.p542v1.SearchHighlightsService;
import search_coprocessor.p542v1.SearchSubpageDto;
import search_coprocessor.p542v1.StreamMultiContractsHeroDetailsRequestDto;
import search_coprocessor.p542v1.StreamMultiContractsHeroDetailsResponseDto;
import search_coprocessor.p542v1.StreamSportEventHeroDetailsRequestDto;
import search_coprocessor.p542v1.StreamSportEventHeroDetailsResponseDto;
import timber.log.Timber;

/* compiled from: SearchHighlightsManager.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002KJB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010&\u001a\u00020#H\u0001¢\u0006\u0004\b$\u0010%J!\u0010,\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010 2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+J*\u00101\u001a\u00020\u000e2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\b\b\u0002\u00100\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\b\u0012\u0004\u0012\u0002040\u001f2\u0006\u00103\u001a\u00020\u0016¢\u0006\u0004\b5\u00106J\u001b\u00108\u001a\b\u0012\u0004\u0012\u0002070\u001f2\u0006\u00103\u001a\u00020\u0016¢\u0006\u0004\b8\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;RV\u0010?\u001aB\u0012\f\u0012\n >*\u0004\u0018\u00010=0=\u0012\f\u0012\n >*\u0004\u0018\u00010\u00110\u0011 >* \u0012\f\u0012\n >*\u0004\u0018\u00010=0=\u0012\f\u0012\n >*\u0004\u0018\u00010\u00110\u0011\u0018\u00010<0<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R(\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0A8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010\u0010\u001a\u0004\bD\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/SearchHighlightsManager;", "", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlinx/coroutines/CoroutineScope;", "rootScope", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lj$/time/Clock;Lkotlinx/coroutines/CoroutineScope;)V", "lifecycleScope", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "instance", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "", "startHighlightsPollingIfNeeded", "()V", "", "refreshCacheIfNeeded", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "fetchSearchHighlightData", "", "subpageId", "Lsearch_coprocessor/v1/GetSearchSubpageContentResponseDto;", "fetchSearchSubpageContent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsearch_coprocessor/v1/SearchHighlightsService;", "client$lib_search_highlights_externalDebug", "(Lkotlinx/coroutines/CoroutineScope;)Lsearch_coprocessor/v1/SearchHighlightsService;", "client", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/search/highlights/model/SearchHighlightData;", "streamHighlights", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlin/time/Duration;", "calculateNextRefreshDelay-UwyO8pc$lib_search_highlights_externalDebug", "()J", "calculateNextRefreshDelay", "cached", "Lkotlinx/datetime/Instant;", "now", "isCacheStillValid$lib_search_highlights_externalDebug", "(Lcom/robinhood/android/search/highlights/model/SearchHighlightData;Lkotlinx/datetime/Instant;)Z", "isCacheStillValid", "", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "targetSubpages", "force", "refreshSubpagesIfNeeded", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eventId", "Lsearch_coprocessor/v1/StreamSportEventHeroDetailsResponseDto;", "streamSportEventHeroDetails", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lsearch_coprocessor/v1/StreamMultiContractsHeroDetailsResponseDto;", "streamMultiContractHeroDetails", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "Lj$/time/Clock;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "Lcom/robinhood/android/search/highlights/SearchHighlightsManager$PendingOperation;", "kotlin.jvm.PlatformType", "pendingOperations", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "cachedData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getCachedData$lib_search_highlights_externalDebug", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getCachedData$lib_search_highlights_externalDebug$annotations", "Lkotlinx/coroutines/Job;", "pollingJob", "Lkotlinx/coroutines/Job;", "Companion", "PendingOperation", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchHighlightsManager {
    private static final boolean DEBUG_LOGGING_ENABLED = true;
    private static final String TAG = "SearchHighlight";
    private final StateFlow2<SearchHighlightData> cachedData;
    private final Clock clock;
    private final MicrogramManager microgramManager;
    private ConcurrentHashMap.KeySetView<PendingOperation, Boolean> pendingOperations;
    private Job pollingJob;
    private final CoroutineScope rootScope;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SearchHighlightsManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.SearchHighlightsManager", m3645f = "SearchHighlightsManager.kt", m3646l = {204}, m3647m = "fetchSearchHighlightData")
    /* renamed from: com.robinhood.android.search.highlights.SearchHighlightsManager$fetchSearchHighlightData$1 */
    static final class C279221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C279221(Continuation<? super C279221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SearchHighlightsManager.this.fetchSearchHighlightData(this);
        }
    }

    /* compiled from: SearchHighlightsManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.SearchHighlightsManager", m3645f = "SearchHighlightsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "fetchSearchSubpageContent")
    /* renamed from: com.robinhood.android.search.highlights.SearchHighlightsManager$fetchSearchSubpageContent$1 */
    static final class C279231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C279231(Continuation<? super C279231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SearchHighlightsManager.this.fetchSearchSubpageContent(null, this);
        }
    }

    public static /* synthetic */ void getCachedData$lib_search_highlights_externalDebug$annotations() {
    }

    public SearchHighlightsManager(MicrogramManager microgramManager, Clock clock, @RootCoroutineScope CoroutineScope rootScope) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.microgramManager = microgramManager;
        this.clock = clock;
        this.rootScope = rootScope;
        this.pendingOperations = ConcurrentHashMap.newKeySet();
        this.cachedData = StateFlow4.MutableStateFlow(null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchHighlightsManager.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/SearchHighlightsManager$PendingOperation;", "", "<init>", "(Ljava/lang/String;I)V", "SYNC_SUBPAGES", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PendingOperation {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PendingOperation[] $VALUES;
        public static final PendingOperation SYNC_SUBPAGES = new PendingOperation("SYNC_SUBPAGES", 0);

        private static final /* synthetic */ PendingOperation[] $values() {
            return new PendingOperation[]{SYNC_SUBPAGES};
        }

        public static EnumEntries<PendingOperation> getEntries() {
            return $ENTRIES;
        }

        private PendingOperation(String str, int i) {
        }

        static {
            PendingOperation[] pendingOperationArr$values = $values();
            $VALUES = pendingOperationArr$values;
            $ENTRIES = EnumEntries2.enumEntries(pendingOperationArr$values);
        }

        public static PendingOperation valueOf(String str) {
            return (PendingOperation) Enum.valueOf(PendingOperation.class, str);
        }

        public static PendingOperation[] values() {
            return (PendingOperation[]) $VALUES.clone();
        }
    }

    public final StateFlow2<SearchHighlightData> getCachedData$lib_search_highlights_externalDebug() {
        return this.cachedData;
    }

    private final MicrogramManager2 instance(CoroutineScope lifecycleScope) {
        return MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.microgramManager, lifecycleScope, new MicrogramLaunchId(new RemoteMicrogramApplication("app-search-coprocessor", null, 2, null), null, 2, null), null, 4, null);
    }

    public final SearchHighlightsService client$lib_search_highlights_externalDebug(CoroutineScope lifecycleScope) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        return (SearchHighlightsService) instance(lifecycleScope).getComponent().getServiceLocator().getClient(SearchHighlightsService.class);
    }

    public final Flow<SearchHighlightData> streamHighlights() {
        startHighlightsPollingIfNeeded();
        return this.cachedData;
    }

    /* renamed from: calculateNextRefreshDelay-UwyO8pc$lib_search_highlights_externalDebug */
    public final long m2463xadc5d1c8() {
        SearchHighlightData value = this.cachedData.getValue();
        if (value != null) {
            Instant instant = this.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            kotlinx.datetime.Instant kotlinInstant = Converters4.toKotlinInstant(instant);
            Instant highlightNextRefreshAt = value.getHighlightNextRefreshAt();
            if (highlightNextRefreshAt != null) {
                long jM28850minus5sfh64U = kotlinx.datetime.Instant.INSTANCE.fromEpochSeconds(highlightNextRefreshAt.getEpochSecond(), 0L).m28850minus5sfh64U(kotlinInstant);
                if (Duration.m28727compareToLRDsOJo(jM28850minus5sfh64U, Duration.INSTANCE.m28767getZEROUwyO8pc()) > 0) {
                    return jM28850minus5sfh64U;
                }
            }
            long jM28754minusLRDsOJo = Duration.m28754minusLRDsOJo(PollingInterval.INSTANCE.m18616getHIGHLIGHTSUwyO8pc(), kotlinInstant.m28850minus5sfh64U(value.getHighlightsFetchedAt()));
            if (Duration.m28727compareToLRDsOJo(jM28754minusLRDsOJo, Duration.INSTANCE.m28767getZEROUwyO8pc()) > 0) {
                return jM28754minusLRDsOJo;
            }
        }
        return Duration.INSTANCE.m28767getZEROUwyO8pc();
    }

    public final boolean isCacheStillValid$lib_search_highlights_externalDebug(SearchHighlightData cached, kotlinx.datetime.Instant now) {
        Intrinsics.checkNotNullParameter(now, "now");
        if (cached == null) {
            return false;
        }
        final long jM28850minus5sfh64U = now.m28850minus5sfh64U(cached.getHighlightsFetchedAt());
        if (Duration.m28727compareToLRDsOJo(jM28850minus5sfh64U, PollingInterval.INSTANCE.m18616getHIGHLIGHTSUwyO8pc()) >= 0) {
            return false;
        }
        INSTANCE.logIfAllowed(new Function0() { // from class: com.robinhood.android.search.highlights.SearchHighlightsManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchHighlightsManager.isCacheStillValid$lambda$1(jM28850minus5sfh64U);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCacheStillValid$lambda$1(long j) {
        return "Using cached highlights (age: " + Duration.m28741getInWholeSecondsimpl(j) + "s)";
    }

    private final void startHighlightsPollingIfNeeded() {
        Job job = this.pollingJob;
        if (job == null || !job.isActive()) {
            this.pollingJob = BuildersKt__Builders_commonKt.launch$default(this.rootScope, null, null, new C279261(null), 3, null);
        }
    }

    /* compiled from: SearchHighlightsManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.SearchHighlightsManager$startHighlightsPollingIfNeeded$1", m3645f = "SearchHighlightsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, 156}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.SearchHighlightsManager$startHighlightsPollingIfNeeded$1 */
    static final class C279261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C279261(Continuation<? super C279261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C279261 c279261 = SearchHighlightsManager.this.new C279261(continuation);
            c279261.L$0 = obj;
            return c279261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        
            if (kotlinx.coroutines.DelayKt.m28786delayVtjQ1oo(r4, r9) != r0) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (!CoroutineScope2.isActive(coroutineScope)) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope2;
                    if (!CoroutineScope2.isActive(coroutineScope)) {
                        SearchHighlightsManager searchHighlightsManager = SearchHighlightsManager.this;
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        Object objRefreshCacheIfNeeded = searchHighlightsManager.refreshCacheIfNeeded(this);
                        if (objRefreshCacheIfNeeded != coroutine_suspended) {
                            coroutineScope2 = coroutineScope;
                            obj = objRefreshCacheIfNeeded;
                            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            final long jM2463xadc5d1c8 = SearchHighlightsManager.this.m2463xadc5d1c8();
                            SearchHighlightsManager.INSTANCE.logIfAllowed(new Function0() { // from class: com.robinhood.android.search.highlights.SearchHighlightsManager$startHighlightsPollingIfNeeded$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchHighlightsManager.C279261.invokeSuspend$lambda$0(zBooleanValue, jM2463xadc5d1c8);
                                }
                            });
                            this.L$0 = coroutineScope2;
                            this.label = 2;
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                final boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                final long jM2463xadc5d1c82 = SearchHighlightsManager.this.m2463xadc5d1c8();
                SearchHighlightsManager.INSTANCE.logIfAllowed(new Function0() { // from class: com.robinhood.android.search.highlights.SearchHighlightsManager$startHighlightsPollingIfNeeded$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchHighlightsManager.C279261.invokeSuspend$lambda$0(zBooleanValue2, jM2463xadc5d1c82);
                    }
                });
                this.L$0 = coroutineScope2;
                this.label = 2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0(boolean z, long j) {
            return "Refreshed=" + z + " -> next highlights refresh in: " + Duration.m28741getInWholeSecondsimpl(j) + Constants.RequestParamsKeys.SESSION_ID_KEY;
        }
    }

    /* compiled from: SearchHighlightsManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.SearchHighlightsManager$refreshCacheIfNeeded$2", m3645f = "SearchHighlightsManager.kt", m3646l = {167}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.highlights.SearchHighlightsManager$refreshCacheIfNeeded$2 */
    static final class C279242 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C279242(Continuation<? super C279242> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C279242 c279242 = SearchHighlightsManager.this.new C279242(continuation);
            c279242.L$0 = obj;
            return c279242;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C279242) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            SearchHighlightData value;
            kotlinx.datetime.Instant instant;
            SearchHighlightData value2;
            SearchHighlightData searchHighlightData;
            Map<String, GetSearchSubpageContentResponseDto> mapEmptyMap;
            Map<String, kotlinx.datetime.Instant> mapEmptyMap2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                value = SearchHighlightsManager.this.getCachedData$lib_search_highlights_externalDebug().getValue();
                Instant instant2 = SearchHighlightsManager.this.clock.instant();
                Intrinsics.checkNotNullExpressionValue(instant2, "instant(...)");
                kotlinx.datetime.Instant kotlinInstant = Converters4.toKotlinInstant(instant2);
                if (SearchHighlightsManager.this.isCacheStillValid$lib_search_highlights_externalDebug(value, kotlinInstant)) {
                    return boxing.boxBoolean(false);
                }
                SearchHighlightsManager searchHighlightsManager = SearchHighlightsManager.this;
                this.L$0 = coroutineScope;
                this.L$1 = value;
                this.L$2 = kotlinInstant;
                this.label = 1;
                Object objFetchSearchHighlightData = searchHighlightsManager.fetchSearchHighlightData(this);
                if (objFetchSearchHighlightData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                instant = kotlinInstant;
                obj = objFetchSearchHighlightData;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.datetime.Instant instant3 = (kotlinx.datetime.Instant) this.L$2;
                value = (SearchHighlightData) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                instant = instant3;
            }
            CoroutineScope coroutineScope2 = coroutineScope;
            SearchHighlightData searchHighlightData2 = value;
            final GetSearchHighlightsResponseDto getSearchHighlightsResponseDto = (GetSearchHighlightsResponseDto) obj;
            StateFlow2<SearchHighlightData> cachedData$lib_search_highlights_externalDebug = SearchHighlightsManager.this.getCachedData$lib_search_highlights_externalDebug();
            do {
                value2 = cachedData$lib_search_highlights_externalDebug.getValue();
                if (searchHighlightData2 == null || (searchHighlightData = SearchHighlightData.copy$default(searchHighlightData2, getSearchHighlightsResponseDto, instant, null, null, 12, null)) == null) {
                    if (searchHighlightData2 == null || (mapEmptyMap = searchHighlightData2.getSubPageContents()) == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    if (searchHighlightData2 == null || (mapEmptyMap2 = searchHighlightData2.getSubPageLastFetchedCache()) == null) {
                        mapEmptyMap2 = MapsKt.emptyMap();
                    }
                    searchHighlightData = new SearchHighlightData(getSearchHighlightsResponseDto, instant, mapEmptyMap, mapEmptyMap2);
                }
            } while (!cachedData$lib_search_highlights_externalDebug.compareAndSet(value2, searchHighlightData));
            ConcurrentHashMap.KeySetView keySetView = SearchHighlightsManager.this.pendingOperations;
            PendingOperation pendingOperation = PendingOperation.SYNC_SUBPAGES;
            if (keySetView.contains(pendingOperation)) {
                if (!getSearchHighlightsResponseDto.getSubpages().isEmpty()) {
                    SearchHighlightsManager.INSTANCE.logIfAllowed(new Function0() { // from class: com.robinhood.android.search.highlights.SearchHighlightsManager$refreshCacheIfNeeded$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchHighlightsManager.C279242.invokeSuspend$lambda$1(getSearchHighlightsResponseDto);
                        }
                    });
                    ConcurrentHashMap.KeySetView keySetView2 = SearchHighlightsManager.this.pendingOperations;
                    Intrinsics.checkNotNullExpressionValue(keySetView2, "access$getPendingOperations$p(...)");
                    keySetView2.remove(pendingOperation);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass3(SearchHighlightsManager.this, null), 3, null);
                } else {
                    SearchHighlightsManager.INSTANCE.logIfAllowed(new Function0() { // from class: com.robinhood.android.search.highlights.SearchHighlightsManager$refreshCacheIfNeeded$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchHighlightsManager.C279242.invokeSuspend$lambda$2();
                        }
                    });
                }
            }
            return boxing.boxBoolean(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$1(GetSearchHighlightsResponseDto getSearchHighlightsResponseDto) {
            return "Processing SYNC_SUBPAGES with " + getSearchHighlightsResponseDto.getSubpages();
        }

        /* compiled from: SearchHighlightsManager.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.SearchHighlightsManager$refreshCacheIfNeeded$2$3", m3645f = "SearchHighlightsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.SearchHighlightsManager$refreshCacheIfNeeded$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchHighlightsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SearchHighlightsManager searchHighlightsManager, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = searchHighlightsManager;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SearchHighlightsManager searchHighlightsManager = this.this$0;
                    this.label = 1;
                    if (SearchHighlightsManager.refreshSubpagesIfNeeded$default(searchHighlightsManager, null, true, this, 1, null) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$2() {
            return "Cannot process SYNC_SUBPAGES: no subpages in response. Keeping pending operation for next refresh.";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object refreshCacheIfNeeded(Continuation<? super Boolean> continuation) {
        return CoroutineScope2.coroutineScope(new C279242(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSearchHighlightData(Continuation<? super GetSearchHighlightsResponseDto> continuation) {
        C279221 c279221;
        Object objM28550constructorimpl;
        if (continuation instanceof C279221) {
            c279221 = (C279221) continuation;
            int i = c279221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c279221.label = i - Integer.MIN_VALUE;
            } else {
                c279221 = new C279221(continuation);
            }
        }
        Object objGetSearchHighlights = c279221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c279221.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetSearchHighlights);
                INSTANCE.logIfAllowed(new Function0() { // from class: com.robinhood.android.search.highlights.SearchHighlightsManager$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchHighlightsManager.fetchSearchHighlightData$lambda$2();
                    }
                });
                SearchHighlightsService searchHighlightsServiceClient$lib_search_highlights_externalDebug = client$lib_search_highlights_externalDebug(this.rootScope);
                Result.Companion companion = Result.INSTANCE;
                GetSearchHighlightsRequestDto getSearchHighlightsRequestDto = new GetSearchHighlightsRequestDto();
                c279221.label = 1;
                objGetSearchHighlights = searchHighlightsServiceClient$lib_search_highlights_externalDebug.GetSearchHighlights(getSearchHighlightsRequestDto, c279221);
                if (objGetSearchHighlights == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetSearchHighlights);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((GetSearchHighlightsResponseDto) objGetSearchHighlights);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = null;
        }
        GetSearchHighlightsResponseDto getSearchHighlightsResponseDto = (GetSearchHighlightsResponseDto) objM28550constructorimpl;
        if (getSearchHighlightsResponseDto != null) {
            return getSearchHighlightsResponseDto;
        }
        return new GetSearchHighlightsResponseDto(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fetchSearchHighlightData$lambda$2() {
        return "fetchSearchHighlightData";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSearchSubpageContent(final String str, Continuation<? super GetSearchSubpageContentResponseDto> continuation) {
        C279231 c279231;
        Object objM28550constructorimpl;
        if (continuation instanceof C279231) {
            c279231 = (C279231) continuation;
            int i = c279231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c279231.label = i - Integer.MIN_VALUE;
            } else {
                c279231 = new C279231(continuation);
            }
        }
        Object objGetSearchSubpageContent = c279231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c279231.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetSearchSubpageContent);
                INSTANCE.logIfAllowed(new Function0() { // from class: com.robinhood.android.search.highlights.SearchHighlightsManager$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchHighlightsManager.fetchSearchSubpageContent$lambda$4(str);
                    }
                });
                SearchHighlightsService searchHighlightsServiceClient$lib_search_highlights_externalDebug = client$lib_search_highlights_externalDebug(this.rootScope);
                Result.Companion companion = Result.INSTANCE;
                GetSearchSubpageContentRequestDto getSearchSubpageContentRequestDto = new GetSearchSubpageContentRequestDto(str);
                c279231.label = 1;
                objGetSearchSubpageContent = searchHighlightsServiceClient$lib_search_highlights_externalDebug.GetSearchSubpageContent(getSearchSubpageContentRequestDto, c279231);
                if (objGetSearchSubpageContent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetSearchSubpageContent);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((GetSearchSubpageContentResponseDto) objGetSearchSubpageContent);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = null;
        }
        GetSearchSubpageContentResponseDto getSearchSubpageContentResponseDto = (GetSearchSubpageContentResponseDto) objM28550constructorimpl;
        if (getSearchSubpageContentResponseDto != null) {
            return getSearchSubpageContentResponseDto;
        }
        return new GetSearchSubpageContentResponseDto(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fetchSearchSubpageContent$lambda$4(String str) {
        return "fetchSearchSubpageContent(" + str + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object refreshSubpagesIfNeeded$default(SearchHighlightsManager searchHighlightsManager, List list, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return searchHighlightsManager.refreshSubpagesIfNeeded(list, z, continuation);
    }

    /* compiled from: SearchHighlightsManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.SearchHighlightsManager$refreshSubpagesIfNeeded$2", m3645f = "SearchHighlightsManager.kt", m3646l = {271}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.highlights.SearchHighlightsManager$refreshSubpagesIfNeeded$2 */
    static final class C279252 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        final /* synthetic */ List<SearchHighlightSubpageData> $targetSubpages;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C279252(List<? extends SearchHighlightSubpageData> list, boolean z, Continuation<? super C279252> continuation) {
            super(2, continuation);
            this.$targetSubpages = list;
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C279252 c279252 = SearchHighlightsManager.this.new C279252(this.$targetSubpages, this.$force, continuation);
            c279252.L$0 = obj;
            return c279252;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01e3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01c9 -> B:50:0x01ce). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            final Map linkedHashMap;
            SearchHighlightData searchHighlightData;
            Iterator it;
            kotlinx.datetime.Instant instant;
            Collection collection;
            SearchHighlightData value;
            ImmutableMap immutableMap;
            Map<String, kotlinx.datetime.Instant> subPageLastFetchedCache;
            LinkedHashMap linkedHashMap2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                SearchHighlightData value2 = SearchHighlightsManager.this.getCachedData$lib_search_highlights_externalDebug().getValue();
                if (value2 == null) {
                    SearchHighlightsManager.INSTANCE.logIfAllowed(new Function0() { // from class: com.robinhood.android.search.highlights.SearchHighlightsManager$refreshSubpagesIfNeeded$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchHighlightsManager.C279252.invokeSuspend$lambda$0();
                        }
                    });
                    ConcurrentHashMap.KeySetView keySetView = SearchHighlightsManager.this.pendingOperations;
                    Intrinsics.checkNotNullExpressionValue(keySetView, "access$getPendingOperations$p(...)");
                    keySetView.add(PendingOperation.SYNC_SUBPAGES);
                    return Unit.INSTANCE;
                }
                Instant instant2 = SearchHighlightsManager.this.clock.instant();
                Intrinsics.checkNotNullExpressionValue(instant2, "instant(...)");
                kotlinx.datetime.Instant kotlinInstant = Converters4.toKotlinInstant(instant2);
                if (this.$targetSubpages.isEmpty()) {
                    List<SearchSubpageDto> subpages = value2.getHighlightsResponse().getSubpages();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subpages, 10));
                    Iterator<T> it2 = subpages.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((SearchSubpageDto) it2.next()).getId());
                    }
                } else {
                    List<SearchHighlightSubpageData> list = this.$targetSubpages;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((SearchHighlightSubpageData) it3.next()).getId());
                    }
                }
                boolean z = this.$force;
                final ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    kotlinx.datetime.Instant distant_past = value2.getSubPageLastFetchedCache().get((String) obj2);
                    if (distant_past == null) {
                        distant_past = kotlinx.datetime.Instant.INSTANCE.getDISTANT_PAST();
                    }
                    boolean z2 = Duration.m28727compareToLRDsOJo(kotlinInstant.m28850minus5sfh64U(distant_past), PollingInterval.INSTANCE.m18617getSUBPAGEUwyO8pc()) > 0;
                    if (z || z2) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    SearchHighlightsManager.INSTANCE.logIfAllowed(new Function0() { // from class: com.robinhood.android.search.highlights.SearchHighlightsManager$refreshSubpagesIfNeeded$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchHighlightsManager.C279252.invokeSuspend$lambda$4();
                        }
                    });
                    return Unit.INSTANCE;
                }
                Companion companion = SearchHighlightsManager.INSTANCE;
                final List<SearchHighlightSubpageData> list2 = this.$targetSubpages;
                final boolean z3 = this.$force;
                companion.logIfAllowed(new Function0() { // from class: com.robinhood.android.search.highlights.SearchHighlightsManager$refreshSubpagesIfNeeded$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchHighlightsManager.C279252.invokeSuspend$lambda$6(list2, arrayList2, z3);
                    }
                });
                SearchHighlightsManager searchHighlightsManager = SearchHighlightsManager.this;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (String str : arrayList2) {
                    arrayList3.add(Tuples4.m3642to(str, BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SearchHighlightsManager2(searchHighlightsManager, str, null), 3, null)));
                }
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList3, 10)), 16));
                searchHighlightData = value2;
                it = arrayList3.iterator();
                instant = kotlinInstant;
                collection = arrayList2;
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) this.L$6;
                linkedHashMap = (Map) this.L$5;
                Iterator it4 = (Iterator) this.L$4;
                Map map = (Map) this.L$3;
                Collection collection2 = (List) this.L$2;
                kotlinx.datetime.Instant instant3 = (kotlinx.datetime.Instant) this.L$1;
                SearchHighlightData searchHighlightData2 = (SearchHighlightData) this.L$0;
                ResultKt.throwOnFailure(obj);
                SearchHighlightData searchHighlightData3 = searchHighlightData2;
                kotlinx.datetime.Instant instant4 = instant3;
                Collection collection3 = collection2;
                Iterator it5 = it4;
                Map map2 = map;
                String str3 = str2;
                Object objAwait = obj;
                Tuples2 tuples2M3642to = Tuples4.m3642to(str3, objAwait);
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                linkedHashMap = map2;
                it = it5;
                collection = collection3;
                instant = instant4;
                searchHighlightData = searchHighlightData3;
                if (it.hasNext()) {
                    Tuples2 tuples2 = (Tuples2) it.next();
                    str3 = (String) tuples2.component1();
                    Deferred deferred = (Deferred) tuples2.component2();
                    this.L$0 = searchHighlightData;
                    this.L$1 = instant;
                    this.L$2 = collection;
                    this.L$3 = linkedHashMap;
                    this.L$4 = it;
                    this.L$5 = linkedHashMap;
                    this.L$6 = str3;
                    this.label = 1;
                    objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    searchHighlightData3 = searchHighlightData;
                    instant4 = instant;
                    collection3 = collection;
                    it5 = it;
                    map2 = linkedHashMap;
                    Tuples2 tuples2M3642to2 = Tuples4.m3642to(str3, objAwait);
                    linkedHashMap.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
                    linkedHashMap = map2;
                    it = it5;
                    collection = collection3;
                    instant = instant4;
                    searchHighlightData = searchHighlightData3;
                    if (it.hasNext()) {
                        StateFlow2<SearchHighlightData> cachedData$lib_search_highlights_externalDebug = SearchHighlightsManager.this.getCachedData$lib_search_highlights_externalDebug();
                        do {
                            value = cachedData$lib_search_highlights_externalDebug.getValue();
                            immutableMap = extensions2.toImmutableMap(MapsKt.plus(searchHighlightData.getSubPageContents(), linkedHashMap));
                            subPageLastFetchedCache = searchHighlightData.getSubPageLastFetchedCache();
                            Collection collection4 = collection;
                            linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(collection4, 10)), 16));
                            for (Object obj3 : collection4) {
                                linkedHashMap2.put(obj3, instant);
                            }
                        } while (!cachedData$lib_search_highlights_externalDebug.compareAndSet(value, SearchHighlightData.copy$default(searchHighlightData, null, null, immutableMap, MapsKt.plus(subPageLastFetchedCache, linkedHashMap2), 3, null)));
                        SearchHighlightsManager.INSTANCE.logIfAllowed(new Function0() { // from class: com.robinhood.android.search.highlights.SearchHighlightsManager$refreshSubpagesIfNeeded$2$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SearchHighlightsManager.C279252.invokeSuspend$lambda$11(linkedHashMap);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Refresh subpages -> No subpages to refresh as highlights cache is empty. Aborting.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$4() {
            return "Refresh subpages -> No subpages need refreshing";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$6(List list, List list2, boolean z) {
            List list3 = list;
            boolean zIsEmpty = list3.isEmpty();
            Object obj = list3;
            if (zIsEmpty) {
                obj = ApiRenderablePlatforms.VERSIONS_ALL;
            }
            return "Refreshing subpages -> targets=" + obj + ", count=" + list2.size() + ", force=" + z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$11(Map map) {
            return "Refreshing subpages -> Updated cache for " + map.keySet();
        }
    }

    public final Object refreshSubpagesIfNeeded(List<? extends SearchHighlightSubpageData> list, boolean z, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C279252(list, z, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final Flow<StreamSportEventHeroDetailsResponseDto> streamSportEventHeroDetails(String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return client$lib_search_highlights_externalDebug(this.rootScope).StreamSportEventHeroDetails(new StreamSportEventHeroDetailsRequestDto(eventId));
    }

    public final Flow<StreamMultiContractsHeroDetailsResponseDto> streamMultiContractHeroDetails(String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return client$lib_search_highlights_externalDebug(this.rootScope).StreamMultiContractsHeroDetails(new StreamMultiContractsHeroDetailsRequestDto(eventId));
    }

    /* compiled from: SearchHighlightsManager.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/SearchHighlightsManager$Companion;", "", "<init>", "()V", "TAG", "", "DEBUG_LOGGING_ENABLED", "", "logIfAllowed", "", "message", "Lkotlin/Function0;", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logIfAllowed(Function0<String> message) {
            Timber.INSTANCE.tag(SearchHighlightsManager.TAG).mo3350d(message.invoke(), new Object[0]);
        }
    }
}
