package com.robinhood.android.eventcontracts.trade;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.datetime.Converters4;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.Instant;
import kotlinx.datetime.Instant6;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDate2;
import kotlinx.datetime.TimeZoneJvm2;
import kotlinx.datetime.TimeZoneKt;
import p479j$.time.Clock;

/* compiled from: StreamGtdExpireTimestamp.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\t\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\n\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"j$/time/Clock", Card.Icon.CLOCK, "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/eventcontracts/trade/GtdTimeInForceInfo;", "streamGtdExpireTimestampFormatted", "(Lj$/time/Clock;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function0;", "Lkotlinx/datetime/Instant;", "getNow", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;", "streamGtdExpireTimestamp", "nextGtdExpirationTime", "(Lkotlinx/datetime/Instant;)Lkotlinx/datetime/Instant;", "lib-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.trade.StreamGtdExpireTimestampKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class StreamGtdExpireTimestamp2 {
    public static final Flow<GtdTimeInForceInfo> streamGtdExpireTimestampFormatted(final Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        return streamGtdExpireTimestampFormatted((Function0<Instant>) new Function0() { // from class: com.robinhood.android.eventcontracts.trade.StreamGtdExpireTimestampKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamGtdExpireTimestamp2.streamGtdExpireTimestampFormatted$lambda$0(clock);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Instant streamGtdExpireTimestampFormatted$lambda$0(Clock clock) {
        p479j$.time.Instant instant = clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        return Converters4.toKotlinInstant(instant);
    }

    /* compiled from: StreamGtdExpireTimestamp.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/trade/GtdTimeInForceInfo;", "now", "Lkotlinx/datetime/Instant;", "expireTime"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.trade.StreamGtdExpireTimestampKt$streamGtdExpireTimestampFormatted$2", m3645f = "StreamGtdExpireTimestamp.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.eventcontracts.trade.StreamGtdExpireTimestampKt$streamGtdExpireTimestampFormatted$2 */
    static final class C166172 extends ContinuationImpl7 implements Function3<Instant, Instant, Continuation<? super GtdTimeInForceInfo>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C166172(Continuation<? super C166172> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Instant instant, Instant instant2, Continuation<? super GtdTimeInForceInfo> continuation) {
            C166172 c166172 = new C166172(continuation);
            c166172.L$0 = instant;
            c166172.L$1 = instant2;
            return c166172.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Instant instant = (Instant) this.L$0;
            Instant instant2 = (Instant) this.L$1;
            return new GtdTimeInForceInfo(Converters4.toJavaInstant(instant2), InstantExt.formatGtdTimeInForce(instant, instant2));
        }
    }

    public static final Flow<GtdTimeInForceInfo> streamGtdExpireTimestampFormatted(Function0<Instant> getNow) {
        Intrinsics.checkNotNullParameter(getNow, "getNow");
        return FlowKt.distinctUntilChanged(FlowKt.combine(InstantExt.streamDayChanges$default(getNow, null, 2, null), streamGtdExpireTimestamp(getNow), new C166172(null)));
    }

    /* compiled from: StreamGtdExpireTimestamp.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/datetime/Instant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.trade.StreamGtdExpireTimestampKt$streamGtdExpireTimestamp$1", m3645f = "StreamGtdExpireTimestamp.kt", m3646l = {42, 44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.eventcontracts.trade.StreamGtdExpireTimestampKt$streamGtdExpireTimestamp$1 */
    static final class C166161 extends ContinuationImpl7 implements Function2<FlowCollector<? super Instant>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Instant> $getNow;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C166161(Function0<Instant> function0, Continuation<? super C166161> continuation) {
            super(2, continuation);
            this.$getNow = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C166161 c166161 = new C166161(this.$getNow, continuation);
            c166161.L$0 = obj;
            return c166161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Instant> flowCollector, Continuation<? super Unit> continuation) {
            return ((C166161) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[PHI: r1 r4 r9
          0x0053: PHI (r1v1 kotlinx.datetime.Instant) = (r1v8 kotlinx.datetime.Instant), (r1v10 kotlinx.datetime.Instant) binds: [B:12:0x0050, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0053: PHI (r4v0 kotlinx.datetime.Instant) = (r4v4 kotlinx.datetime.Instant), (r4v6 kotlinx.datetime.Instant) binds: [B:12:0x0050, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0053: PHI (r9v3 kotlinx.coroutines.flow.FlowCollector) = (r9v4 kotlinx.coroutines.flow.FlowCollector), (r9v5 kotlinx.coroutines.flow.FlowCollector) binds: [B:12:0x0050, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0070 -> B:11:0x0037). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Instant instantInvoke;
            Instant instantNextGtdExpirationTime;
            long jM28755plusLRDsOJo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
            } else {
                if (i == 1) {
                    instantNextGtdExpirationTime = (Instant) this.L$2;
                    instantInvoke = (Instant) this.L$1;
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector2;
                    long jM28850minus5sfh64U = instantNextGtdExpirationTime.m28850minus5sfh64U(instantInvoke);
                    Duration.Companion companion = Duration.INSTANCE;
                    jM28755plusLRDsOJo = Duration.m28755plusLRDsOJo(jM28850minus5sfh64U, Duration3.toDuration(1, DurationUnitJvm.MILLISECONDS));
                    this.L$0 = flowCollector;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (DelayKt.m28786delayVtjQ1oo(jM28755plusLRDsOJo, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector3;
            }
            instantInvoke = this.$getNow.invoke();
            instantNextGtdExpirationTime = StreamGtdExpireTimestamp2.nextGtdExpirationTime(instantInvoke);
            this.L$0 = flowCollector;
            this.L$1 = instantInvoke;
            this.L$2 = instantNextGtdExpirationTime;
            this.label = 1;
            if (flowCollector.emit(instantNextGtdExpirationTime, this) != coroutine_suspended) {
                long jM28850minus5sfh64U2 = instantNextGtdExpirationTime.m28850minus5sfh64U(instantInvoke);
                Duration.Companion companion2 = Duration.INSTANCE;
                jM28755plusLRDsOJo = Duration.m28755plusLRDsOJo(jM28850minus5sfh64U2, Duration3.toDuration(1, DurationUnitJvm.MILLISECONDS));
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (DelayKt.m28786delayVtjQ1oo(jM28755plusLRDsOJo, this) != coroutine_suspended) {
                    instantInvoke = this.$getNow.invoke();
                    instantNextGtdExpirationTime = StreamGtdExpireTimestamp2.nextGtdExpirationTime(instantInvoke);
                    this.L$0 = flowCollector;
                    this.L$1 = instantInvoke;
                    this.L$2 = instantNextGtdExpirationTime;
                    this.label = 1;
                    if (flowCollector.emit(instantNextGtdExpirationTime, this) != coroutine_suspended) {
                    }
                }
            }
            return coroutine_suspended;
        }
    }

    public static final Flow<Instant> streamGtdExpireTimestamp(Function0<Instant> getNow) {
        Intrinsics.checkNotNullParameter(getNow, "getNow");
        return FlowKt.flow(new C166161(getNow, null));
    }

    public static final Instant nextGtdExpirationTime(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        TimeZoneJvm2 timeZoneJvm2M3732of = TimeZoneJvm2.INSTANCE.m3732of("America/New_York");
        LocalDate date = TimeZoneKt.toLocalDateTime(instant, timeZoneJvm2M3732of).getDate();
        DateTimeUnit.Companion companion = DateTimeUnit.INSTANCE;
        return Instant6.plus(TimeZoneKt.atStartOfDayIn(LocalDate2.plus(date, 1, (DateTimeUnit.DateBased) companion.getDAY()), timeZoneJvm2M3732of), 3, companion.getHOUR());
    }
}
