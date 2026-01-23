package com.robinhood.android.eventcontracts.trade;

import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.datetime.Converters4;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDate2;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZoneJvm2;
import kotlinx.datetime.TimeZoneKt;

/* compiled from: InstantExt.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¨\u0006\u000b"}, m3636d2 = {"streamDayChanges", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/datetime/Instant;", "getNow", "Lkotlin/Function0;", "timeZone", "Lkotlinx/datetime/TimeZone;", "formatGtdTimeInForce", "Lcom/robinhood/utils/resource/StringResource;", "now", "expireTime", "lib-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.trade.InstantExtKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class InstantExt {
    public static /* synthetic */ Flow streamDayChanges$default(Function0 function0, TimeZoneJvm2 timeZoneJvm2, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZoneJvm2 = TimeZoneJvm2.INSTANCE.currentSystemDefault();
        }
        return streamDayChanges(function0, timeZoneJvm2);
    }

    /* compiled from: InstantExt.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/datetime/Instant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.trade.InstantExtKt$streamDayChanges$1", m3645f = "InstantExt.kt", m3646l = {27, 37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.eventcontracts.trade.InstantExtKt$streamDayChanges$1 */
    static final class C166141 extends ContinuationImpl7 implements Function2<FlowCollector<? super Instant>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Instant> $getNow;
        final /* synthetic */ TimeZoneJvm2 $timeZone;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C166141(Function0<Instant> function0, TimeZoneJvm2 timeZoneJvm2, Continuation<? super C166141> continuation) {
            super(2, continuation);
            this.$getNow = function0;
            this.$timeZone = timeZoneJvm2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C166141 c166141 = new C166141(this.$getNow, this.$timeZone, continuation);
            c166141.L$0 = obj;
            return c166141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Instant> flowCollector, Continuation<? super Unit> continuation) {
            return ((C166141) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[PHI: r1 r9
          0x0048: PHI (r1v1 kotlinx.datetime.Instant) = (r1v6 kotlinx.datetime.Instant), (r1v8 kotlinx.datetime.Instant) binds: [B:12:0x0045, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0048: PHI (r9v3 kotlinx.coroutines.flow.FlowCollector) = (r9v4 kotlinx.coroutines.flow.FlowCollector), (r9v5 kotlinx.coroutines.flow.FlowCollector) binds: [B:12:0x0045, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007c -> B:11:0x0033). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Instant instantInvoke;
            long jCoerceAtLeast;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
            } else {
                if (i == 1) {
                    instantInvoke = (Instant) this.L$1;
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector2;
                    jCoerceAtLeast = RangesKt.coerceAtLeast(TimeZoneKt.atStartOfDayIn(LocalDate2.plus(TimeZoneKt.toLocalDateTime(instantInvoke, this.$timeZone).getDate(), 1, (DateTimeUnit.DateBased) DateTimeUnit.INSTANCE.getDAY()), this.$timeZone).toEpochMilliseconds() - instantInvoke.toEpochMilliseconds(), 1L);
                    this.L$0 = flowCollector;
                    this.L$1 = null;
                    this.label = 2;
                    if (DelayKt.delay(jCoerceAtLeast, this) != coroutine_suspended) {
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
            this.L$0 = flowCollector;
            this.L$1 = instantInvoke;
            this.label = 1;
            if (flowCollector.emit(instantInvoke, this) != coroutine_suspended) {
                jCoerceAtLeast = RangesKt.coerceAtLeast(TimeZoneKt.atStartOfDayIn(LocalDate2.plus(TimeZoneKt.toLocalDateTime(instantInvoke, this.$timeZone).getDate(), 1, (DateTimeUnit.DateBased) DateTimeUnit.INSTANCE.getDAY()), this.$timeZone).toEpochMilliseconds() - instantInvoke.toEpochMilliseconds(), 1L);
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.label = 2;
                if (DelayKt.delay(jCoerceAtLeast, this) != coroutine_suspended) {
                    instantInvoke = this.$getNow.invoke();
                    this.L$0 = flowCollector;
                    this.L$1 = instantInvoke;
                    this.label = 1;
                    if (flowCollector.emit(instantInvoke, this) != coroutine_suspended) {
                    }
                }
            }
            return coroutine_suspended;
        }
    }

    public static final Flow<Instant> streamDayChanges(Function0<Instant> getNow, TimeZoneJvm2 timeZone) {
        Intrinsics.checkNotNullParameter(getNow, "getNow");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        return FlowKt.flow(new C166141(getNow, timeZone, null));
    }

    public static final StringResource formatGtdTimeInForce(Instant now, Instant expireTime) {
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(expireTime, "expireTime");
        TimeZoneJvm2 timeZoneJvm2CurrentSystemDefault = TimeZoneJvm2.INSTANCE.currentSystemDefault();
        LocalDateTime localDateTime = TimeZoneKt.toLocalDateTime(expireTime, timeZoneJvm2CurrentSystemDefault);
        LocalDate date = TimeZoneKt.toLocalDateTime(now, timeZoneJvm2CurrentSystemDefault).getDate();
        LocalDate date2 = localDateTime.getDate();
        String str = InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format(Converters4.toJavaInstant(expireTime));
        DateTimeUnit.Companion companion = DateTimeUnit.INSTANCE;
        LocalDate localDatePlus = LocalDate2.plus(date, 1, (DateTimeUnit.DateBased) companion.getDAY());
        LocalDate localDatePlus2 = LocalDate2.plus(date, 2, (DateTimeUnit.DateBased) companion.getDAY());
        if (expireTime.compareTo(now) < 0) {
            return StringResource.INSTANCE.invoke(C16615R.string.events_order_form_time_in_force_arbitrary_date, InstantFormatter.DATE_WITHOUT_PADDING_OPTIONAL_YEAR_IN_SYSTEM_ZONE.format(Converters4.toJavaInstant(expireTime)), str);
        }
        if (date2.compareTo(localDatePlus) < 0) {
            return StringResource.INSTANCE.invoke(C16615R.string.events_order_form_time_in_force_today, str);
        }
        if (date2.compareTo(localDatePlus2) < 0) {
            return StringResource.INSTANCE.invoke(C16615R.string.events_order_form_time_in_force_tomorrow, str);
        }
        return StringResource.INSTANCE.invoke(C16615R.string.events_order_form_time_in_force_arbitrary_date, InstantFormatter.DATE_WITHOUT_PADDING_OPTIONAL_YEAR_IN_SYSTEM_ZONE.format(Converters4.toJavaInstant(expireTime)), str);
    }
}
