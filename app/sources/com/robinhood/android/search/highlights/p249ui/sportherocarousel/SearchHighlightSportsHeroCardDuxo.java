package com.robinhood.android.search.highlights.p249ui.sportherocarousel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.search.highlights.SearchHighlightsManager;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.delta.FloatingOpenInterestDelta;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.extensions.StringsKt;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;
import search_coprocessor.p542v1.SportEventHeroDetailsDto;
import search_coprocessor.p542v1.StreamSportEventHeroDetailsResponseDto;

/* compiled from: SearchHighlightSportsHeroCardDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0019\u0018B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDataState;", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDuxo$InitialArgs;", "Lcom/robinhood/android/search/highlights/SearchHighlightsManager;", "searchHighlightsManager", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/search/highlights/SearchHighlightsManager;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "Lkotlinx/coroutines/Job;", "bind", "()Lkotlinx/coroutines/Job;", "Lcom/robinhood/android/search/highlights/SearchHighlightsManager;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "InitialArgs", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SearchHighlightSportsHeroCardDuxo extends BaseDuxo<SearchHighlightSportsHeroCardDataState, SearchHighlightSportsHeroCardViewState> implements HasArgs<InitialArgs> {
    private final Clock clock;
    private final SavedStateHandle savedStateHandle;
    private final SearchHighlightsManager searchHighlightsManager;

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
    public SearchHighlightSportsHeroCardDuxo(SearchHighlightsManager searchHighlightsManager, Clock clock, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new SearchHighlightSportsHeroCardDataState(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), new SearchHighlightSportsHeroCardProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(searchHighlightsManager, "searchHighlightsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.searchHighlightsManager = searchHighlightsManager;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
    }

    public final Job bind() {
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C280131(null), 2, null);
        return completableJobSupervisorJob$default;
    }

    /* compiled from: SearchHighlightSportsHeroCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardDuxo$bind$1", m3645f = "SearchHighlightSportsHeroCardDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardDuxo$bind$1 */
    static final class C280131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C280131(Continuation<? super C280131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchHighlightSportsHeroCardDuxo.this.new C280131(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C280131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SearchHighlightSportsHeroCardDuxo.this.searchHighlightsManager.streamSportEventHeroDetails(((InitialArgs) SearchHighlightSportsHeroCardDuxo.INSTANCE.getArgs((HasArgs) SearchHighlightSportsHeroCardDuxo.this)).getEventId()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SearchHighlightSportsHeroCardDuxo.this, null);
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

        /* compiled from: SearchHighlightSportsHeroCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "heroDetailsResponseDto", "Lsearch_coprocessor/v1/StreamSportEventHeroDetailsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardDuxo$bind$1$1", m3645f = "SearchHighlightSportsHeroCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamSportEventHeroDetailsResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchHighlightSportsHeroCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchHighlightSportsHeroCardDuxo searchHighlightSportsHeroCardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = searchHighlightSportsHeroCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamSportEventHeroDetailsResponseDto streamSportEventHeroDetailsResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(streamSportEventHeroDetailsResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                SportEventHeroDetailsDto.EventSideDto right_side;
                IdlDecimal open_interest;
                SportEventHeroDetailsDto.EventSideDto left_side;
                IdlDecimal open_interest2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    StreamSportEventHeroDetailsResponseDto streamSportEventHeroDetailsResponseDto = (StreamSportEventHeroDetailsResponseDto) this.L$0;
                    Instant instantNow = Instant.now(this.this$0.clock);
                    SportEventHeroDetailsDto value = streamSportEventHeroDetailsResponseDto.getValue();
                    BigDecimal bigDecimalOrNull = null;
                    BigDecimal bigDecimalOrNull2 = (value == null || (left_side = value.getLeft_side()) == null || (open_interest2 = left_side.getOpen_interest()) == null) ? null : open_interest2.toBigDecimalOrNull();
                    if (value != null && (right_side = value.getRight_side()) != null && (open_interest = right_side.getOpen_interest()) != null) {
                        bigDecimalOrNull = open_interest.toBigDecimalOrNull();
                    }
                    SearchHighlightSportsHeroCardDuxo searchHighlightSportsHeroCardDuxo = this.this$0;
                    searchHighlightSportsHeroCardDuxo.applyMutation(new C505311(bigDecimalOrNull2, instantNow, bigDecimalOrNull, searchHighlightSportsHeroCardDuxo, value, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: SearchHighlightSportsHeroCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardDuxo$bind$1$1$1", m3645f = "SearchHighlightSportsHeroCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505311 extends ContinuationImpl7 implements Function2<SearchHighlightSportsHeroCardDataState, Continuation<? super SearchHighlightSportsHeroCardDataState>, Object> {
                final /* synthetic */ SportEventHeroDetailsDto $newHeroDetails;
                final /* synthetic */ BigDecimal $newLeftOI;
                final /* synthetic */ BigDecimal $newRightOI;
                final /* synthetic */ Instant $now;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SearchHighlightSportsHeroCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505311(BigDecimal bigDecimal, Instant instant, BigDecimal bigDecimal2, SearchHighlightSportsHeroCardDuxo searchHighlightSportsHeroCardDuxo, SportEventHeroDetailsDto sportEventHeroDetailsDto, Continuation<? super C505311> continuation) {
                    super(2, continuation);
                    this.$newLeftOI = bigDecimal;
                    this.$now = instant;
                    this.$newRightOI = bigDecimal2;
                    this.this$0 = searchHighlightSportsHeroCardDuxo;
                    this.$newHeroDetails = sportEventHeroDetailsDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505311 c505311 = new C505311(this.$newLeftOI, this.$now, this.$newRightOI, this.this$0, this.$newHeroDetails, continuation);
                    c505311.L$0 = obj;
                    return c505311;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchHighlightSportsHeroCardDataState searchHighlightSportsHeroCardDataState, Continuation<? super SearchHighlightSportsHeroCardDataState> continuation) {
                    return ((C505311) create(searchHighlightSportsHeroCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    UUID uuid;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SearchHighlightSportsHeroCardDataState searchHighlightSportsHeroCardDataState = (SearchHighlightSportsHeroCardDataState) this.L$0;
                    BigDecimal previousLeftOpenInterest = searchHighlightSportsHeroCardDataState.getPreviousLeftOpenInterest();
                    BigDecimal bigDecimal = this.$newLeftOI;
                    Instant instant = this.$now;
                    Intrinsics.checkNotNull(instant);
                    FloatingOpenInterestDelta floatingOpenInterestDeltaCalculateOpenInterestDelta = DeltaCalculationHelper.calculateOpenInterestDelta(previousLeftOpenInterest, bigDecimal, instant);
                    BigDecimal previousRightOpenInterest = searchHighlightSportsHeroCardDataState.getPreviousRightOpenInterest();
                    BigDecimal bigDecimal2 = this.$newRightOI;
                    Instant instant2 = this.$now;
                    Intrinsics.checkNotNull(instant2);
                    FloatingOpenInterestDelta floatingOpenInterestDeltaCalculateOpenInterestDelta2 = DeltaCalculationHelper.calculateOpenInterestDelta(previousRightOpenInterest, bigDecimal2, instant2);
                    List<FloatingOpenInterestDelta> leftSideDeltas = searchHighlightSportsHeroCardDataState.getLeftSideDeltas();
                    Instant instant3 = this.$now;
                    Intrinsics.checkNotNull(instant3);
                    List<FloatingOpenInterestDelta> listRemoveExpiredDeltas = DeltaCalculationHelper.removeExpiredDeltas(leftSideDeltas, instant3);
                    if (floatingOpenInterestDeltaCalculateOpenInterestDelta != null) {
                        listRemoveExpiredDeltas = CollectionsKt.plus((Collection<? extends FloatingOpenInterestDelta>) listRemoveExpiredDeltas, floatingOpenInterestDeltaCalculateOpenInterestDelta);
                    }
                    List<FloatingOpenInterestDelta> list = listRemoveExpiredDeltas;
                    List<FloatingOpenInterestDelta> rightSideDeltas = searchHighlightSportsHeroCardDataState.getRightSideDeltas();
                    Instant instant4 = this.$now;
                    Intrinsics.checkNotNull(instant4);
                    List<FloatingOpenInterestDelta> listRemoveExpiredDeltas2 = DeltaCalculationHelper.removeExpiredDeltas(rightSideDeltas, instant4);
                    if (floatingOpenInterestDeltaCalculateOpenInterestDelta2 != null) {
                        listRemoveExpiredDeltas2 = CollectionsKt.plus((Collection<? extends FloatingOpenInterestDelta>) listRemoveExpiredDeltas2, floatingOpenInterestDeltaCalculateOpenInterestDelta2);
                    }
                    List<FloatingOpenInterestDelta> list2 = listRemoveExpiredDeltas2;
                    try {
                        uuid = StringsKt.toUuid(((InitialArgs) SearchHighlightSportsHeroCardDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getEventId());
                    } catch (IllegalArgumentException unused) {
                        uuid = null;
                    }
                    return searchHighlightSportsHeroCardDataState.copy(uuid, this.$newHeroDetails, this.$newLeftOI, this.$newRightOI, list, list2, this.$now);
                }
            }
        }
    }

    /* compiled from: SearchHighlightSportsHeroCardDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDuxo$InitialArgs;", "Landroid/os/Parcelable;", "eventId", "", "carouselId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getCarouselId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitialArgs implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<InitialArgs> CREATOR = new Creator();
        private final String carouselId;
        private final String eventId;

        /* compiled from: SearchHighlightSportsHeroCardDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitialArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitialArgs(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs[] newArray(int i) {
                return new InitialArgs[i];
            }
        }

        public static /* synthetic */ InitialArgs copy$default(InitialArgs initialArgs, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initialArgs.eventId;
            }
            if ((i & 2) != 0) {
                str2 = initialArgs.carouselId;
            }
            return initialArgs.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCarouselId() {
            return this.carouselId;
        }

        public final InitialArgs copy(String eventId, String carouselId) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(carouselId, "carouselId");
            return new InitialArgs(eventId, carouselId);
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
            return Intrinsics.areEqual(this.eventId, initialArgs.eventId) && Intrinsics.areEqual(this.carouselId, initialArgs.carouselId);
        }

        public int hashCode() {
            return (this.eventId.hashCode() * 31) + this.carouselId.hashCode();
        }

        public String toString() {
            return "InitialArgs(eventId=" + this.eventId + ", carouselId=" + this.carouselId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.eventId);
            dest.writeString(this.carouselId);
        }

        public InitialArgs(String eventId, String carouselId) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(carouselId, "carouselId");
            this.eventId = eventId;
            this.carouselId = carouselId;
        }

        public final String getEventId() {
            return this.eventId;
        }

        public final String getCarouselId() {
            return this.carouselId;
        }
    }

    /* compiled from: SearchHighlightSportsHeroCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDuxo;", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDuxo$InitialArgs;", "<init>", "()V", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<SearchHighlightSportsHeroCardDuxo, InitialArgs> {
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
        public InitialArgs getArgs(SearchHighlightSportsHeroCardDuxo searchHighlightSportsHeroCardDuxo) {
            return (InitialArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, searchHighlightSportsHeroCardDuxo);
        }
    }
}
