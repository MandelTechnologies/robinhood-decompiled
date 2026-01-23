package com.robinhood.android.equitytradeladder.marketsession;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equitytradeladder.C15889R;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.utils.datetime.TemporalTransformer;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.temporal.TemporalAccessor;

/* compiled from: GetMarketSessionChangeState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a:\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m3636d2 = {"", "isAdt", "Lcom/robinhood/models/db/TradingSession;", "tradingSession", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/equitytradeladder/marketsession/MarketSessionChangeDataState;", "getMarketSessionChangeState", "(ZLcom/robinhood/models/db/TradingSession;Lj$/time/Clock;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/MarketHours;", "nextOpenMarketHours", "generateOpenMarketHeader", "(Lj$/time/Clock;Lcom/robinhood/models/db/MarketHours;Z)Lkotlinx/coroutines/flow/Flow;", "generateClosedMarketHeader", "(Lj$/time/Clock;Lcom/robinhood/models/db/TradingSession;Z)Lkotlinx/coroutines/flow/Flow;", "isOpen", "j$/time/Instant", "nearestOpen", "Lcom/robinhood/utils/resource/StringResource;", "getPremarketSessionHeader", "(ZZLj$/time/Instant;)Lcom/robinhood/utils/resource/StringResource;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "sessionChangeCountDown", "(Lkotlinx/coroutines/flow/FlowCollector;ZZLj$/time/Instant;Lj$/time/Clock;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "MIN_DELAY_MS", "J", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "TIME_FORMATTER", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "getTIME_FORMATTER", "()Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.marketsession.GetMarketSessionChangeStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GetMarketSessionChangeState {
    private static final long MIN_DELAY_MS = 1000;
    private static final TemporalFormatter<Instant> TIME_FORMATTER;

    /* compiled from: GetMarketSessionChangeState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.marketsession.GetMarketSessionChangeStateKt", m3645f = "GetMarketSessionChangeState.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m3647m = "sessionChangeCountDown")
    /* renamed from: com.robinhood.android.equitytradeladder.marketsession.GetMarketSessionChangeStateKt$sessionChangeCountDown$1 */
    static final class C159391 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        C159391(Continuation<? super C159391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetMarketSessionChangeState.sessionChangeCountDown(null, false, false, null, null, this);
        }
    }

    static {
        TemporalFormatter.Companion companion = TemporalFormatter.INSTANCE;
        TemporalFormatter temporalFormatterOfPatternResource = companion.ofPatternResource(C15889R.string.equities_ladder_format_local_date_time);
        TemporalTransformer.Companion companion2 = TemporalTransformer.INSTANCE;
        TIME_FORMATTER = companion.transforming(temporalFormatterOfPatternResource, new TemporalTransformer<Instant, TemporalAccessor>() { // from class: com.robinhood.android.equitytradeladder.marketsession.GetMarketSessionChangeStateKt$special$$inlined$invoke$1
            @Override // com.robinhood.utils.datetime.TemporalTransformer
            public TemporalAccessor transform(Instant source) {
                Intrinsics.checkNotNullParameter(source, "source");
                ZonedDateTime zonedDateTimeAtZone = source.atZone(ZoneId.systemDefault());
                Intrinsics.checkNotNullExpressionValue(zonedDateTimeAtZone, "atZone(...)");
                return zonedDateTimeAtZone;
            }
        });
    }

    public static final TemporalFormatter<Instant> getTIME_FORMATTER() {
        return TIME_FORMATTER;
    }

    public static final Flow<MarketSessionChangeDataState> getMarketSessionChangeState(boolean z, TradingSession tradingSession, Clock clock) {
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        Intrinsics.checkNotNullParameter(clock, "clock");
        if ((tradingSession instanceof TradingSession.Extended.AfterHours) || (tradingSession instanceof TradingSession.Extended.PreMarket) || (tradingSession instanceof TradingSession.Regular)) {
            return FlowKt.flowOf(new MarketSessionChangeDataState(Boolean.valueOf(tradingSession.getTodaysMarketOpen()), null));
        }
        if (!(tradingSession instanceof TradingSession.Overnight)) {
            throw new NoWhenBranchMatchedException();
        }
        if (tradingSession.getTodaysMarketOpen()) {
            return generateOpenMarketHeader(clock, ((TradingSession.Overnight) tradingSession).getNextOpenMarketHours(), z);
        }
        return generateClosedMarketHeader(clock, tradingSession, z);
    }

    /* compiled from: GetMarketSessionChangeState.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/equitytradeladder/marketsession/MarketSessionChangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.marketsession.GetMarketSessionChangeStateKt$generateOpenMarketHeader$1", m3645f = "GetMarketSessionChangeState.kt", m3646l = {75, 97, 109, 112}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.marketsession.GetMarketSessionChangeStateKt$generateOpenMarketHeader$1 */
    static final class C159381 extends ContinuationImpl7 implements Function2<FlowCollector<? super MarketSessionChangeDataState>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Clock $clock;
        final /* synthetic */ boolean $isAdt;
        final /* synthetic */ MarketHours $nextOpenMarketHours;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C159381(boolean z, Clock clock, MarketHours marketHours, Continuation<? super C159381> continuation) {
            super(2, continuation);
            this.$isAdt = z;
            this.$clock = clock;
            this.$nextOpenMarketHours = marketHours;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C159381 c159381 = new C159381(this.$isAdt, this.$clock, this.$nextOpenMarketHours, continuation);
            c159381.L$0 = obj;
            return c159381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super MarketSessionChangeDataState> flowCollector, Continuation<? super Unit> continuation) {
            return ((C159381) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        
            if (r0.emit(r1, r15) == r6) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bf -> B:36:0x00c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d6 -> B:36:0x00c1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            long jM28738getInWholeMillisecondsimpl;
            FlowCollector flowCollector2;
            long j;
            long j2;
            long jCoerceAtLeast;
            long epochMilli;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                if (this.$isAdt) {
                    MarketSessionChangeDataState marketSessionChangeDataState = new MarketSessionChangeDataState(boxing.boxBoolean(true), null);
                    this.label = 1;
                } else {
                    Duration.Companion companion = Duration.INSTANCE;
                    jM28738getInWholeMillisecondsimpl = Duration.m28738getInWholeMillisecondsimpl(Duration3.toDuration(1, DurationUnitJvm.DAYS));
                    Instant instant = this.$clock.instant();
                    Instant extendedOpensAt = this.$nextOpenMarketHours.getExtendedOpensAt();
                    epochMilli = extendedOpensAt.toEpochMilli() - instant.toEpochMilli();
                    if (epochMilli <= 0) {
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    j2 = this.J$1;
                    j = this.J$0;
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    jCoerceAtLeast = RangesKt.coerceAtLeast(j2 - j, 1000L);
                    this.L$0 = flowCollector2;
                    this.J$0 = j;
                    this.label = 3;
                    if (DelayKt.delay(jCoerceAtLeast, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = this.J$0;
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                jM28738getInWholeMillisecondsimpl = j3;
                flowCollector = flowCollector3;
                Instant instant2 = this.$clock.instant();
                Instant extendedOpensAt2 = this.$nextOpenMarketHours.getExtendedOpensAt();
                epochMilli = extendedOpensAt2.toEpochMilli() - instant2.toEpochMilli();
                if (epochMilli <= 0) {
                    if (epochMilli > jM28738getInWholeMillisecondsimpl) {
                        MarketSessionChangeDataState marketSessionChangeDataState2 = new MarketSessionChangeDataState(boxing.boxBoolean(true), GetMarketSessionChangeState.getPremarketSessionHeader(true, false, extendedOpensAt2));
                        this.L$0 = flowCollector;
                        this.J$0 = jM28738getInWholeMillisecondsimpl;
                        this.J$1 = epochMilli;
                        this.label = 2;
                        if (flowCollector.emit(marketSessionChangeDataState2, this) != coroutine_suspended) {
                            flowCollector2 = flowCollector;
                            j2 = epochMilli;
                            j = jM28738getInWholeMillisecondsimpl;
                            jCoerceAtLeast = RangesKt.coerceAtLeast(j2 - j, 1000L);
                            this.L$0 = flowCollector2;
                            this.J$0 = j;
                            this.label = 3;
                            if (DelayKt.delay(jCoerceAtLeast, this) != coroutine_suspended) {
                                j3 = j;
                                flowCollector3 = flowCollector2;
                                jM28738getInWholeMillisecondsimpl = j3;
                                flowCollector = flowCollector3;
                                Instant instant22 = this.$clock.instant();
                                Instant extendedOpensAt22 = this.$nextOpenMarketHours.getExtendedOpensAt();
                                epochMilli = extendedOpensAt22.toEpochMilli() - instant22.toEpochMilli();
                                if (epochMilli <= 0) {
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    } else {
                        Clock clock = this.$clock;
                        this.L$0 = flowCollector;
                        this.J$0 = jM28738getInWholeMillisecondsimpl;
                        this.label = 4;
                        if (GetMarketSessionChangeState.sessionChangeCountDown(flowCollector, true, false, extendedOpensAt22, clock, this) != coroutine_suspended) {
                            flowCollector3 = flowCollector;
                            j3 = jM28738getInWholeMillisecondsimpl;
                            jM28738getInWholeMillisecondsimpl = j3;
                            flowCollector = flowCollector3;
                            Instant instant222 = this.$clock.instant();
                            Instant extendedOpensAt222 = this.$nextOpenMarketHours.getExtendedOpensAt();
                            epochMilli = extendedOpensAt222.toEpochMilli() - instant222.toEpochMilli();
                            if (epochMilli <= 0) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Flow<MarketSessionChangeDataState> generateOpenMarketHeader(Clock clock, MarketHours marketHours, boolean z) {
        return FlowKt.flow(new C159381(z, clock, marketHours, null));
    }

    /* compiled from: GetMarketSessionChangeState.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/equitytradeladder/marketsession/MarketSessionChangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.marketsession.GetMarketSessionChangeStateKt$generateClosedMarketHeader$1", m3645f = "GetMarketSessionChangeState.kt", m3646l = {150, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 165}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.marketsession.GetMarketSessionChangeStateKt$generateClosedMarketHeader$1 */
    static final class C159371 extends ContinuationImpl7 implements Function2<FlowCollector<? super MarketSessionChangeDataState>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Clock $clock;
        final /* synthetic */ boolean $isAdt;
        final /* synthetic */ TradingSession $tradingSession;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C159371(Clock clock, boolean z, TradingSession tradingSession, Continuation<? super C159371> continuation) {
            super(2, continuation);
            this.$clock = clock;
            this.$isAdt = z;
            this.$tradingSession = tradingSession;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C159371 c159371 = new C159371(this.$clock, this.$isAdt, this.$tradingSession, continuation);
            c159371.L$0 = obj;
            return c159371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super MarketSessionChangeDataState> flowCollector, Continuation<? super Unit> continuation) {
            return ((C159371) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ba -> B:32:0x00bc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d2 -> B:32:0x00bc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            long jM28738getInWholeMillisecondsimpl;
            FlowCollector flowCollector2;
            long j;
            long j2;
            long jCoerceAtLeast;
            Instant extendedOpensAt;
            long epochMilli;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Duration.Companion companion = Duration.INSTANCE;
                jM28738getInWholeMillisecondsimpl = Duration.m28738getInWholeMillisecondsimpl(Duration3.toDuration(1, DurationUnitJvm.DAYS));
                Instant instant = this.$clock.instant();
                if (!this.$isAdt) {
                }
                Instant instant2 = extendedOpensAt;
                epochMilli = instant2.toEpochMilli() - instant.toEpochMilli();
                if (epochMilli <= 0) {
                }
            } else {
                if (i == 1) {
                    j2 = this.J$1;
                    j = this.J$0;
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    jCoerceAtLeast = RangesKt.coerceAtLeast(j2 - j, 1000L);
                    this.L$0 = flowCollector2;
                    this.J$0 = j;
                    this.label = 2;
                    if (DelayKt.delay(jCoerceAtLeast, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = this.J$0;
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                jM28738getInWholeMillisecondsimpl = j3;
                flowCollector = flowCollector3;
                Instant instant3 = this.$clock.instant();
                if (!this.$isAdt) {
                    extendedOpensAt = this.$tradingSession.getCurrentMarketHours().getAllDayOpensAt();
                } else {
                    extendedOpensAt = this.$tradingSession.getCurrentMarketHours().getExtendedOpensAt();
                }
                Instant instant22 = extendedOpensAt;
                epochMilli = instant22.toEpochMilli() - instant3.toEpochMilli();
                if (epochMilli <= 0) {
                    if (epochMilli > jM28738getInWholeMillisecondsimpl) {
                        MarketSessionChangeDataState marketSessionChangeDataState = new MarketSessionChangeDataState(boxing.boxBoolean(false), GetMarketSessionChangeState.getPremarketSessionHeader(this.$tradingSession.getTodaysMarketOpen(), this.$isAdt, instant22));
                        this.L$0 = flowCollector;
                        this.J$0 = jM28738getInWholeMillisecondsimpl;
                        this.J$1 = epochMilli;
                        this.label = 1;
                        if (flowCollector.emit(marketSessionChangeDataState, this) != coroutine_suspended) {
                            flowCollector2 = flowCollector;
                            j2 = epochMilli;
                            j = jM28738getInWholeMillisecondsimpl;
                            jCoerceAtLeast = RangesKt.coerceAtLeast(j2 - j, 1000L);
                            this.L$0 = flowCollector2;
                            this.J$0 = j;
                            this.label = 2;
                            if (DelayKt.delay(jCoerceAtLeast, this) != coroutine_suspended) {
                                j3 = j;
                                flowCollector3 = flowCollector2;
                                jM28738getInWholeMillisecondsimpl = j3;
                                flowCollector = flowCollector3;
                                Instant instant32 = this.$clock.instant();
                                if (!this.$isAdt) {
                                }
                                Instant instant222 = extendedOpensAt;
                                epochMilli = instant222.toEpochMilli() - instant32.toEpochMilli();
                                if (epochMilli <= 0) {
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    } else {
                        boolean z = this.$isAdt;
                        Clock clock = this.$clock;
                        this.L$0 = flowCollector;
                        this.J$0 = jM28738getInWholeMillisecondsimpl;
                        this.label = 3;
                        if (GetMarketSessionChangeState.sessionChangeCountDown(flowCollector, false, z, instant222, clock, this) != coroutine_suspended) {
                            flowCollector3 = flowCollector;
                            j3 = jM28738getInWholeMillisecondsimpl;
                            jM28738getInWholeMillisecondsimpl = j3;
                            flowCollector = flowCollector3;
                            Instant instant322 = this.$clock.instant();
                            if (!this.$isAdt) {
                            }
                            Instant instant2222 = extendedOpensAt;
                            epochMilli = instant2222.toEpochMilli() - instant322.toEpochMilli();
                            if (epochMilli <= 0) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            }
        }
    }

    private static final Flow<MarketSessionChangeDataState> generateClosedMarketHeader(Clock clock, TradingSession tradingSession, boolean z) {
        return FlowKt.flow(new C159371(clock, z, tradingSession, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StringResource getPremarketSessionHeader(boolean z, boolean z2, Instant instant) {
        if (!z && z2) {
            return StringResource.INSTANCE.invoke(C15889R.string.equity_ladder_twenty_four_session_header_long, TIME_FORMATTER.format(instant));
        }
        if (z2) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C15889R.string.equity_ladder_pre_market_header_long, TIME_FORMATTER.format(instant));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r0, r9) == r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01a0 -> B:56:0x01a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object sessionChangeCountDown(FlowCollector<? super MarketSessionChangeDataState> flowCollector, boolean z, boolean z2, Instant instant, Clock clock, Continuation<? super Unit> continuation) {
        C159391 c159391;
        FlowCollector flowCollector2;
        boolean z3;
        Instant instant2;
        Clock clock2;
        C159391 c1593912;
        boolean z4;
        FlowCollector flowCollector3;
        Instant instant3;
        boolean z5;
        int i;
        long duration;
        char c;
        p479j$.time.Duration durationBetween;
        StringResource stringResourceInvoke;
        if (continuation instanceof C159391) {
            c159391 = (C159391) continuation;
            int i2 = c159391.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c159391.label = i2 - Integer.MIN_VALUE;
            } else {
                c159391 = new C159391(continuation);
            }
        }
        Object obj = c159391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c159391.label;
        int i4 = 1;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector2 = flowCollector;
            z3 = z2;
            instant2 = instant;
            clock2 = clock;
            c1593912 = c159391;
            z4 = z;
            Instant instant4 = clock2.instant();
            Intrinsics.checkNotNullExpressionValue(instant4, "instant(...)");
            durationBetween = p479j$.time.Duration.between(instant4, instant2);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            if (durationBetween.toMillis() <= 0) {
            }
        } else {
            if (i3 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i3 == 2) {
                z3 = c159391.Z$1;
                z5 = c159391.Z$0;
                clock2 = (Clock) c159391.L$2;
                instant3 = (Instant) c159391.L$1;
                flowCollector3 = (FlowCollector) c159391.L$0;
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                i = 1;
                duration = Duration3.toDuration(1, DurationUnitJvm.SECONDS);
                c159391.L$0 = flowCollector3;
                c159391.L$1 = instant3;
                c159391.L$2 = clock2;
                c159391.Z$0 = z5;
                c159391.Z$1 = z3;
                c = 3;
                c159391.label = 3;
                if (DelayKt.m28786delayVtjQ1oo(duration, c159391) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = c159391.Z$1;
            boolean z6 = c159391.Z$0;
            clock2 = (Clock) c159391.L$2;
            Instant instant5 = (Instant) c159391.L$1;
            flowCollector3 = (FlowCollector) c159391.L$0;
            ResultKt.throwOnFailure(obj);
            c1593912 = c159391;
            z4 = z6;
            instant2 = instant5;
            c = 3;
            i = 1;
            i4 = i;
            flowCollector2 = flowCollector3;
            Instant instant42 = clock2.instant();
            Intrinsics.checkNotNullExpressionValue(instant42, "instant(...)");
            durationBetween = p479j$.time.Duration.between(instant42, instant2);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            if (durationBetween.toMillis() <= 0) {
                if (durationBetween.toMillis() < 1000) {
                    long millis = durationBetween.toMillis();
                    c1593912.L$0 = null;
                    c1593912.L$1 = null;
                    c1593912.L$2 = null;
                    c1593912.label = i4;
                } else {
                    long hours = durationBetween.toHours();
                    p479j$.time.Duration durationMinusHours = durationBetween.minusHours(hours);
                    long minutes = durationMinusHours.toMinutes();
                    long seconds = durationMinusHours.minusMinutes(minutes).getSeconds();
                    if (z3) {
                        if (z4) {
                            stringResourceInvoke = null;
                        } else if (hours > 0) {
                            stringResourceInvoke = StringResource.INSTANCE.invoke(C15889R.string.equity_ladder_twenty_four_session_header_hhmmss, boxing.boxLong(hours), boxing.boxLong(minutes), boxing.boxLong(seconds));
                        } else if (minutes > 0) {
                            stringResourceInvoke = StringResource.INSTANCE.invoke(C15889R.string.equity_ladder_twenty_four_session_header_mmss, boxing.boxLong(minutes), boxing.boxLong(seconds));
                        } else {
                            stringResourceInvoke = StringResource.INSTANCE.invoke(C15889R.string.equity_ladder_twenty_four_session_header_ss, boxing.boxLong(seconds));
                        }
                    } else if (hours > 0) {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C15889R.string.equity_ladder_pre_market_header_hhmmss, boxing.boxLong(hours), boxing.boxLong(minutes), boxing.boxLong(seconds));
                    } else if (minutes > 0) {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C15889R.string.equity_ladder_pre_market_header_mmss, boxing.boxLong(minutes), boxing.boxLong(seconds));
                    } else {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C15889R.string.equity_ladder_pre_market_header_ss, boxing.boxLong(seconds));
                    }
                    MarketSessionChangeDataState marketSessionChangeDataState = new MarketSessionChangeDataState(boxing.boxBoolean(z4), stringResourceInvoke);
                    c1593912.L$0 = flowCollector2;
                    c1593912.L$1 = instant2;
                    c1593912.L$2 = clock2;
                    c1593912.Z$0 = z4;
                    c1593912.Z$1 = z3;
                    c1593912.label = 2;
                    if (flowCollector2.emit(marketSessionChangeDataState, c1593912) != coroutine_suspended) {
                        Instant instant6 = instant2;
                        z5 = z4;
                        c159391 = c1593912;
                        instant3 = instant6;
                        flowCollector3 = flowCollector2;
                        Duration.Companion companion2 = Duration.INSTANCE;
                        i = 1;
                        duration = Duration3.toDuration(1, DurationUnitJvm.SECONDS);
                        c159391.L$0 = flowCollector3;
                        c159391.L$1 = instant3;
                        c159391.L$2 = clock2;
                        c159391.Z$0 = z5;
                        c159391.Z$1 = z3;
                        c = 3;
                        c159391.label = 3;
                        if (DelayKt.m28786delayVtjQ1oo(duration, c159391) != coroutine_suspended) {
                            Instant instant7 = instant3;
                            c1593912 = c159391;
                            z4 = z5;
                            instant2 = instant7;
                            i4 = i;
                            flowCollector2 = flowCollector3;
                            Instant instant422 = clock2.instant();
                            Intrinsics.checkNotNullExpressionValue(instant422, "instant(...)");
                            durationBetween = p479j$.time.Duration.between(instant422, instant2);
                            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                            if (durationBetween.toMillis() <= 0) {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
    }
}
