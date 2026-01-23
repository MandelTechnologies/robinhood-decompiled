package com.robinhood.android.eventcontracts.trade;

import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState4;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: EventStartTimeStringUtil.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001aC\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"j$/time/Instant", "timestamp", "Lcom/robinhood/android/models/event/db/predictionmarkets/GameStartFormat;", "format", "Lcom/robinhood/utils/resource/StringResource;", "getEventStartTimeText", "(Lj$/time/Instant;Lcom/robinhood/android/models/event/db/predictionmarkets/GameStartFormat;)Lcom/robinhood/utils/resource/StringResource;", "Lkotlin/Function0;", "getNow", "", "forceRefreshEventState", "gameStartTimestamp", "", "enableCountdownWithDays", "Lkotlinx/coroutines/flow/Flow;", "getCountDownText", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lj$/time/Instant;Z)Lkotlinx/coroutines/flow/Flow;", "lib-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.trade.EventStartTimeStringUtilKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventStartTimeStringUtil {

    /* compiled from: EventStartTimeStringUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.trade.EventStartTimeStringUtilKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PredictionMarketEventState4.values().length];
            try {
                iArr[PredictionMarketEventState4.GAME_START_FORMAT_MONTH_DAY_TIME_AM_PM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PredictionMarketEventState4.GAME_START_FORMAT_MONTH_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PredictionMarketEventState4.GAME_START_FORMAT_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getEventStartTimeText(Instant timestamp, PredictionMarketEventState4 format2) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(format2, "format");
        int i = WhenMappings.$EnumSwitchMapping$0[format2.ordinal()];
        if (i == 1) {
            String str = InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format(timestamp);
            return StringResource.INSTANCE.invoke(C16615R.string.event_start_date_and_time, InstantFormatter.DATE_WITHOUT_PADDING_NO_YEAR_IN_SYSTEM_ZONE.format(timestamp), str);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(InstantFormatter.DATE_WITHOUT_PADDING_NO_YEAR_IN_SYSTEM_ZONE.format(timestamp));
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: EventStartTimeStringUtil.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/resource/StringResource;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.trade.EventStartTimeStringUtilKt$getCountDownText$1", m3645f = "EventStartTimeStringUtil.kt", m3646l = {44, 51, 52, 100, 101}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.eventcontracts.trade.EventStartTimeStringUtilKt$getCountDownText$1 */
    static final class C166131 extends ContinuationImpl7 implements Function2<FlowCollector<? super StringResource>, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $enableCountdownWithDays;
        final /* synthetic */ Function0<Unit> $forceRefreshEventState;
        final /* synthetic */ Instant $gameStartTimestamp;
        final /* synthetic */ Function0<Instant> $getNow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C166131(Instant instant, Function0<Instant> function0, Function0<Unit> function02, boolean z, Continuation<? super C166131> continuation) {
            super(2, continuation);
            this.$gameStartTimestamp = instant;
            this.$getNow = function0;
            this.$forceRefreshEventState = function02;
            this.$enableCountdownWithDays = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C166131 c166131 = new C166131(this.$gameStartTimestamp, this.$getNow, this.$forceRefreshEventState, this.$enableCountdownWithDays, continuation);
            c166131.L$0 = obj;
            return c166131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super StringResource> flowCollector, Continuation<? super Unit> continuation) {
            return ((C166131) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
        
            if (r2.emit(null, r20) != r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x013e, code lost:
        
            if (kotlinx.coroutines.DelayKt.m28786delayVtjQ1oo(r5, r20) != r1) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
        
            if (r2.emit(null, r20) == r1) goto L54;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x013e -> B:51:0x0141). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            long epochMilli;
            StringResource stringResourceInvoke;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 3;
            int i3 = 2;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Instant instant = this.$gameStartTimestamp;
                if (instant == null || instant.isBefore(this.$getNow.invoke())) {
                    this.label = 1;
                } else {
                    epochMilli = this.$gameStartTimestamp.toEpochMilli() - this.$getNow.invoke().toEpochMilli();
                    if (epochMilli >= 1000) {
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = i2;
            } else {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    this.$forceRefreshEventState.invoke();
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    i2 = 3;
                    i3 = 2;
                    epochMilli = this.$gameStartTimestamp.toEpochMilli() - this.$getNow.invoke().toEpochMilli();
                    if (epochMilli >= 1000) {
                        if (epochMilli > 0) {
                            this.L$0 = flowCollector;
                            this.label = i3;
                            if (DelayKt.delay(epochMilli, this) != coroutine_suspended) {
                            }
                        }
                        this.L$0 = null;
                        this.label = i2;
                    } else {
                        long j = epochMilli / 1000;
                        long j2 = OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC;
                        long j3 = j / j2;
                        long j4 = OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC;
                        long j5 = (j % j2) / j4;
                        long j6 = 60;
                        long j7 = (j % j4) / j6;
                        long j8 = j % j6;
                        if (this.$enableCountdownWithDays && j3 > 0) {
                            stringResourceInvoke = StringResource.INSTANCE.invoke(C16615R.string.event_detail_countdown_ddhhmmss, boxing.boxLong(j3), boxing.boxLong(j5), boxing.boxLong(j7), boxing.boxLong(j8));
                        } else if (j5 > 0) {
                            stringResourceInvoke = StringResource.INSTANCE.invoke(C16615R.string.event_detail_countdown_hhmmss, boxing.boxLong(j5), boxing.boxLong(j7), boxing.boxLong(j8));
                        } else if (j7 > 0) {
                            stringResourceInvoke = StringResource.INSTANCE.invoke(C16615R.string.event_detail_countdown_mmss, boxing.boxLong(j7), boxing.boxLong(j8));
                        } else {
                            stringResourceInvoke = StringResource.INSTANCE.invoke(C16615R.string.event_detail_countdown_ss, boxing.boxLong(j8));
                        }
                        this.L$0 = flowCollector;
                        this.label = 4;
                        if (flowCollector.emit(stringResourceInvoke, this) != coroutine_suspended) {
                            Duration.Companion companion = Duration.INSTANCE;
                            long duration = Duration3.toDuration(1, DurationUnitJvm.SECONDS);
                            this.L$0 = flowCollector;
                            this.label = 5;
                        }
                    }
                    return coroutine_suspended;
                }
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion2 = Duration.INSTANCE;
                long duration2 = Duration3.toDuration(1, DurationUnitJvm.SECONDS);
                this.L$0 = flowCollector;
                this.label = 5;
            }
            return Unit.INSTANCE;
        }
    }

    public static final Flow<StringResource> getCountDownText(Function0<Instant> getNow, Function0<Unit> forceRefreshEventState, Instant instant, boolean z) {
        Intrinsics.checkNotNullParameter(getNow, "getNow");
        Intrinsics.checkNotNullParameter(forceRefreshEventState, "forceRefreshEventState");
        return FlowKt.flow(new C166131(instant, getNow, forceRefreshEventState, z, null));
    }
}
