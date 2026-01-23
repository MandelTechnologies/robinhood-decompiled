package com.robinhood.android.event.gamedetail.builders;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.trade.EventStartTimeStringUtil;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.builders.StreamLiveDataTitleUseCase$invoke$$inlined$flatMapLatest$1", m3645f = "BuildGameDetailTitle.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StreamLiveDataTitleUseCase$invoke$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super TitleState>, PredictionMarketEventState, Continuation<? super Unit>, Object> {
    final /* synthetic */ Clock $clock$inlined;
    final /* synthetic */ Function0 $forceRefreshEventState$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BuildGameDetailTitle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamLiveDataTitleUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, Clock clock, BuildGameDetailTitle buildGameDetailTitle, Function0 function0) {
        super(3, continuation);
        this.$clock$inlined = clock;
        this.this$0 = buildGameDetailTitle;
        this.$forceRefreshEventState$inlined = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super TitleState> flowCollector, PredictionMarketEventState predictionMarketEventState, Continuation<? super Unit> continuation) {
        StreamLiveDataTitleUseCase$invoke$$inlined$flatMapLatest$1 streamLiveDataTitleUseCase$invoke$$inlined$flatMapLatest$1 = new StreamLiveDataTitleUseCase$invoke$$inlined$flatMapLatest$1(continuation, this.$clock$inlined, this.this$0, this.$forceRefreshEventState$inlined);
        streamLiveDataTitleUseCase$invoke$$inlined$flatMapLatest$1.L$0 = flowCollector;
        streamLiveDataTitleUseCase$invoke$$inlined$flatMapLatest$1.L$1 = predictionMarketEventState;
        return streamLiveDataTitleUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Flow<TitleState> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final PredictionMarketEventState predictionMarketEventState = (PredictionMarketEventState) this.L$1;
            Instant instant = this.$clock$inlined.instant();
            final Instant gameStartTimestamp = predictionMarketEventState.getGameStartTimestamp();
            if (gameStartTimestamp != null) {
                BuildGameDetailTitle buildGameDetailTitle = this.this$0;
                Intrinsics.checkNotNull(instant);
                if (!buildGameDetailTitle.isStartingWithin24Hours(gameStartTimestamp, instant)) {
                    flowFlowOf = gameStartTimestamp != null ? FlowKt.flowOf(this.this$0.buildPreGameTitle(predictionMarketEventState, gameStartTimestamp)) : FlowKt.flowOf(this.this$0.buildLiveGameTitle(predictionMarketEventState));
                } else {
                    final Clock clock = this.$clock$inlined;
                    final Flow<StringResource> countDownText = EventStartTimeStringUtil.getCountDownText(new Function0<Instant>() { // from class: com.robinhood.android.event.gamedetail.builders.StreamLiveDataTitleUseCase$invoke$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Instant invoke() {
                            Instant instant2 = clock.instant();
                            Intrinsics.checkNotNullExpressionValue(instant2, "instant(...)");
                            return instant2;
                        }
                    }, this.$forceRefreshEventState$inlined, gameStartTimestamp, false);
                    final BuildGameDetailTitle buildGameDetailTitle2 = this.this$0;
                    flowFlowOf = new Flow<TitleState>() { // from class: com.robinhood.android.event.gamedetail.builders.StreamLiveDataTitleUseCase$invoke$lambda$1$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.gamedetail.builders.StreamLiveDataTitleUseCase$invoke$lambda$1$$inlined$map$1$2 */
                        public static final class C162862<T> implements FlowCollector {
                            final /* synthetic */ PredictionMarketEventState $eventState$inlined;
                            final /* synthetic */ Instant $gameStartTimestamp$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ BuildGameDetailTitle this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.builders.StreamLiveDataTitleUseCase$invoke$lambda$1$$inlined$map$1$2", m3645f = "BuildGameDetailTitle.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.gamedetail.builders.StreamLiveDataTitleUseCase$invoke$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C162862.this.emit(null, this);
                                }
                            }

                            public C162862(FlowCollector flowCollector, BuildGameDetailTitle buildGameDetailTitle, PredictionMarketEventState predictionMarketEventState, Instant instant) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = buildGameDetailTitle;
                                this.$eventState$inlined = predictionMarketEventState;
                                this.$gameStartTimestamp$inlined = instant;
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
                                    TitleState titleStateBuildCountdownTitle = this.this$0.buildCountdownTitle(this.$eventState$inlined, this.$gameStartTimestamp$inlined, (StringResource) obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(titleStateBuildCountdownTitle, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super TitleState> flowCollector2, Continuation continuation) {
                            Object objCollect = countDownText.collect(new C162862(flowCollector2, buildGameDetailTitle2, predictionMarketEventState, gameStartTimestamp), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                }
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
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
