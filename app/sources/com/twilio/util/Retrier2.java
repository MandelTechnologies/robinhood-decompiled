package com.twilio.util;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import kotlinx.coroutines.DelayKt;

/* compiled from: Retrier.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a<\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\"\u0010\n\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bH\u0086@¢\u0006\u0002\u0010\u000f\"\u001b\u0010\u0000\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"logger", "Lcom/twilio/util/TwilioLogger;", "getLogger", "()Lcom/twilio/util/TwilioLogger;", "logger$delegate", "Lkotlin/Lazy;", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "", "config", "Lcom/twilio/util/RetrierConfig;", "onRetrierAttempt", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "", "(Lcom/twilio/util/RetrierConfig;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared-internal_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.util.RetrierKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class Retrier2 {
    private static final Lazy logger$delegate = LazyKt.lazy(new Function0<TwilioLogger>() { // from class: com.twilio.util.RetrierKt$logger$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TwilioLogger invoke() {
            return TwilioLogger.INSTANCE.getLogger("Retrier");
        }
    });

    /* compiled from: Retrier.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.util.RetrierKt", m3645f = "Retrier.kt", m3646l = {62, 69, 95}, m3647m = AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY)
    /* renamed from: com.twilio.util.RetrierKt$retry$1 */
    static final class C435271 extends ContinuationImpl {
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C435271(Continuation<? super C435271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Retrier2.retry(null, null, this);
        }
    }

    private static final TwilioLogger getLogger() {
        return (TwilioLogger) logger$delegate.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(7:13|75|86|34|(9:37|82|38|39|44|(2:46|(4:50|(1:52)|54|(2:78|79)(5:56|(3:58|(1:61)|(2:64|65))|63|66|(4:68|(1:70)|71|(1:88)(5:74|75|86|34|(0)))(2:76|77)))(2:48|49))|53|54|(0)(0))|32|73)(2:14|15))(12:16|84|17|18|82|38|39|44|(0)|53|54|(0)(0)))(1:21))(4:22|(1:24)|25|(3:27|(1:29)|30)(2:80|81))|33|86|34|(0)|32|73) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
    
        if (kotlinx.coroutines.DelayKt.m28786delayVtjQ1oo(r12, r2) == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0166, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Path cross not found for [B:46:0x0177, B:53:0x01b8], limit reached: 87 */
    /* JADX WARN: Path cross not found for [B:53:0x01b8, B:46:0x0177], limit reached: 87 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x026f -> B:75:0x0271). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retry(RetrierConfig retrierConfig, Function1<? super Continuation<? super Result<Unit>>, ? extends Object> function1, Continuation<? super Unit> continuation) throws Throwable {
        C435271 c435271;
        long jM28773markNowz9LOYto;
        Ref.IntRef intRef;
        Function1<? super Continuation<? super Result<Unit>>, ? extends Object> function12;
        long jM27253getStartDelayUwyO8pc;
        long j;
        long j2;
        Function1<? super Continuation<? super Result<Unit>>, ? extends Object> function13;
        Ref.LongRef longRef;
        Ref.IntRef intRef2;
        RetrierConfig retrierConfig2;
        Throwable th;
        Object objM28550constructorimpl;
        Object obj;
        Object obj2;
        Throwable thM28553exceptionOrNullimpl;
        RetrierConfig retrierConfig3;
        Object objInvoke;
        RetrierConfig retrierConfig4 = retrierConfig;
        if (continuation instanceof C435271) {
            c435271 = (C435271) continuation;
            int i = c435271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c435271.label = i - Integer.MIN_VALUE;
            } else {
                c435271 = new C435271(continuation);
            }
        }
        Object obj3 = c435271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c435271.label;
        Throwable th2 = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj3);
            TwilioLogger logger = getLogger();
            if (logger.isDebugEnabled()) {
                logger.m3189d("Started with config: " + retrierConfig4, (Throwable) null);
            }
            if (Duration.m28733equalsimpl0(retrierConfig4.m27252getMinDelayUwyO8pc(), Duration.INSTANCE.m28767getZEROUwyO8pc())) {
                throw new IllegalArgumentException("minDelay must be positive value");
            }
            jM28773markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m28773markNowz9LOYto();
            intRef = new Ref.IntRef();
            TwilioLogger logger2 = getLogger();
            if (logger2.isDebugEnabled()) {
                logger2.m3189d("next attempt after " + ((Object) Duration.m28761toStringimpl(retrierConfig4.m27253getStartDelayUwyO8pc())), (Throwable) null);
            }
            long jM27253getStartDelayUwyO8pc2 = retrierConfig4.m27253getStartDelayUwyO8pc();
            c435271.L$0 = retrierConfig4;
            function12 = function1;
            c435271.L$1 = function12;
            c435271.L$2 = intRef;
            c435271.J$0 = jM28773markNowz9LOYto;
            c435271.label = 1;
        } else if (i2 == 1) {
            jM28773markNowz9LOYto = c435271.J$0;
            Ref.IntRef intRef3 = (Ref.IntRef) c435271.L$2;
            function12 = (Function1) c435271.L$1;
            RetrierConfig retrierConfig5 = (RetrierConfig) c435271.L$0;
            ResultKt.throwOnFailure(obj3);
            intRef = intRef3;
            retrierConfig4 = retrierConfig5;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = c435271.J$2;
                long j4 = c435271.J$1;
                j = c435271.J$0;
                Ref.LongRef longRef2 = (Ref.LongRef) c435271.L$3;
                Ref.IntRef intRef4 = (Ref.IntRef) c435271.L$2;
                Function1<? super Continuation<? super Result<Unit>>, ? extends Object> function14 = (Function1) c435271.L$1;
                RetrierConfig retrierConfig6 = (RetrierConfig) c435271.L$0;
                ResultKt.throwOnFailure(obj3);
                retrierConfig2 = retrierConfig6;
                long j5 = j3;
                Object obj4 = coroutine_suspended;
                function13 = function14;
                intRef2 = intRef4;
                longRef = longRef2;
                long rawValue = ((Duration) RangesKt.coerceIn(Duration.m28726boximpl(Duration.m28755plusLRDsOJo(j4, j5)), Duration.m28726boximpl(retrierConfig2.m27252getMinDelayUwyO8pc()), Duration.m28726boximpl(retrierConfig2.m27251getMaxDelayUwyO8pc()))).getRawValue();
                longRef.element = rawValue;
                coroutine_suspended = obj4;
                long j6 = j5;
                th2 = null;
                j2 = rawValue;
                jM27253getStartDelayUwyO8pc = j6;
                Result.Companion companion = Result.INSTANCE;
                c435271.L$0 = retrierConfig2;
                c435271.L$1 = function13;
                c435271.L$2 = intRef2;
                c435271.L$3 = longRef;
                c435271.J$0 = j;
                c435271.J$1 = jM27253getStartDelayUwyO8pc;
                c435271.J$2 = j2;
                c435271.label = 2;
                objInvoke = function13.invoke(c435271);
                if (objInvoke != coroutine_suspended) {
                    retrierConfig3 = retrierConfig2;
                    obj3 = objInvoke;
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        retrierConfig2 = retrierConfig3;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                        }
                        obj = objM28550constructorimpl;
                        obj2 = coroutine_suspended;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
                        if (thM28553exceptionOrNullimpl != null) {
                        }
                    }
                    objM28550constructorimpl = Result.m28550constructorimpl(Result.m28549boximpl(((Result) obj3).getValue()));
                    retrierConfig2 = retrierConfig3;
                    if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                        Object value = ((Result) objM28550constructorimpl).getValue();
                        if (Result.m28556isSuccessimpl(value)) {
                            TwilioLogger.d$default(getLogger(), "RetrierAttempt succeeded", th2, 2, th2);
                            return Unit.INSTANCE;
                        }
                        Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(value);
                        if (thM28553exceptionOrNullimpl2 != null) {
                            TwilioLogger logger3 = getLogger();
                            obj = objM28550constructorimpl;
                            StringBuilder sb = new StringBuilder();
                            obj2 = coroutine_suspended;
                            sb.append("RetrierAttempt failed: ");
                            sb.append(thM28553exceptionOrNullimpl2);
                            TwilioLogger.d$default(logger3, sb.toString(), (Throwable) null, 2, (Object) null);
                        }
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
                        if (thM28553exceptionOrNullimpl != null) {
                            getLogger().m3202w("RetrierAttempt finished with exception, retrier stopped: ", thM28553exceptionOrNullimpl);
                            throw thM28553exceptionOrNullimpl;
                        }
                        Integer maxAttemptsCount = retrierConfig2.getMaxAttemptsCount();
                        if (maxAttemptsCount != null) {
                            int iIntValue = maxAttemptsCount.intValue();
                            int i3 = intRef2.element + 1;
                            intRef2.element = i3;
                            if (i3 <= iIntValue) {
                                maxAttemptsCount = null;
                            }
                            if (maxAttemptsCount != null) {
                                throw new TwilioException(new ErrorInfo(TwilioException2.RetrierReachedMaxAttempsCount, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null), null, 2, null);
                            }
                        }
                        long j7 = j2;
                        long j8 = jM27253getStartDelayUwyO8pc;
                        long j9 = j;
                        longRef.element = Duration.m28755plusLRDsOJo(longRef.element, Duration.m28756timesUwyO8pc(Duration.m28756timesUwyO8pc(longRef.element, retrierConfig2.getRandomizeFactor()), Random.INSTANCE.nextDouble(0.0d, 1.0d)));
                        long jM28755plusLRDsOJo = Duration.m28755plusLRDsOJo(TimeSource.Monotonic.ValueTimeMark.m28775elapsedNowUwyO8pc(j9), longRef.element);
                        if (Duration.m28727compareToLRDsOJo(jM28755plusLRDsOJo, retrierConfig2.m27250getMaxAttemptsTimeUwyO8pc()) > 0) {
                            RetrierConfig retrierConfig7 = retrierConfig2;
                            TwilioLogger.d$default(getLogger(), "stopped: max time reached: " + ((Object) Duration.m28761toStringimpl(jM28755plusLRDsOJo)), (Throwable) null, 2, (Object) null);
                            throw new TwilioException(new ErrorInfo(TwilioException2.RetrierReachedMaxTime, 0, 0, "maxAttemptsTime=" + ((Object) Duration.m28761toStringimpl(retrierConfig7.m27250getMaxAttemptsTimeUwyO8pc())), (String) null, 22, (DefaultConstructorMarker) null), null, 2, null);
                        }
                        TwilioLogger logger4 = getLogger();
                        if (logger4.isDebugEnabled()) {
                            logger4.m3189d("next attempt after " + ((Object) Duration.m28761toStringimpl(longRef.element)), (Throwable) null);
                        }
                        long j10 = longRef.element;
                        c435271.L$0 = retrierConfig2;
                        c435271.L$1 = function13;
                        c435271.L$2 = intRef2;
                        c435271.L$3 = longRef;
                        j = j9;
                        c435271.J$0 = j;
                        j4 = j8;
                        c435271.J$1 = j4;
                        RetrierConfig retrierConfig8 = retrierConfig2;
                        c435271.J$2 = j7;
                        c435271.label = 3;
                        obj4 = obj2;
                        if (DelayKt.m28786delayVtjQ1oo(j10, c435271) == obj4) {
                            return obj4;
                        }
                        j5 = j7;
                        retrierConfig2 = retrierConfig8;
                        long rawValue2 = ((Duration) RangesKt.coerceIn(Duration.m28726boximpl(Duration.m28755plusLRDsOJo(j4, j5)), Duration.m28726boximpl(retrierConfig2.m27252getMinDelayUwyO8pc()), Duration.m28726boximpl(retrierConfig2.m27251getMaxDelayUwyO8pc()))).getRawValue();
                        longRef.element = rawValue2;
                        coroutine_suspended = obj4;
                        long j62 = j5;
                        th2 = null;
                        j2 = rawValue2;
                        jM27253getStartDelayUwyO8pc = j62;
                        Result.Companion companion3 = Result.INSTANCE;
                        c435271.L$0 = retrierConfig2;
                        c435271.L$1 = function13;
                        c435271.L$2 = intRef2;
                        c435271.L$3 = longRef;
                        c435271.J$0 = j;
                        c435271.J$1 = jM27253getStartDelayUwyO8pc;
                        c435271.J$2 = j2;
                        c435271.label = 2;
                        objInvoke = function13.invoke(c435271);
                        if (objInvoke != coroutine_suspended) {
                        }
                    }
                    obj = objM28550constructorimpl;
                    obj2 = coroutine_suspended;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                }
                return coroutine_suspended;
            }
            j2 = c435271.J$2;
            jM27253getStartDelayUwyO8pc = c435271.J$1;
            j = c435271.J$0;
            longRef = (Ref.LongRef) c435271.L$3;
            intRef2 = (Ref.IntRef) c435271.L$2;
            function13 = (Function1) c435271.L$1;
            RetrierConfig retrierConfig9 = (RetrierConfig) c435271.L$0;
            try {
                ResultKt.throwOnFailure(obj3);
                retrierConfig3 = retrierConfig9;
            } catch (Throwable th4) {
                th = th4;
                retrierConfig2 = retrierConfig9;
                Result.Companion companion22 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                }
                obj = objM28550constructorimpl;
                obj2 = coroutine_suspended;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
                if (thM28553exceptionOrNullimpl != null) {
                }
            }
            objM28550constructorimpl = Result.m28550constructorimpl(Result.m28549boximpl(((Result) obj3).getValue()));
            retrierConfig2 = retrierConfig3;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            }
            obj = objM28550constructorimpl;
            obj2 = coroutine_suspended;
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
            if (thM28553exceptionOrNullimpl != null) {
            }
        }
        jM27253getStartDelayUwyO8pc = retrierConfig4.m27253getStartDelayUwyO8pc();
        long jM27252getMinDelayUwyO8pc = retrierConfig4.m27252getMinDelayUwyO8pc();
        Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = retrierConfig4.m27252getMinDelayUwyO8pc();
        j = jM28773markNowz9LOYto;
        j2 = jM27252getMinDelayUwyO8pc;
        function13 = function12;
        longRef = longRef3;
        intRef2 = intRef;
        retrierConfig2 = retrierConfig4;
        Result.Companion companion32 = Result.INSTANCE;
        c435271.L$0 = retrierConfig2;
        c435271.L$1 = function13;
        c435271.L$2 = intRef2;
        c435271.L$3 = longRef;
        c435271.J$0 = j;
        c435271.J$1 = jM27253getStartDelayUwyO8pc;
        c435271.J$2 = j2;
        c435271.label = 2;
        objInvoke = function13.invoke(c435271);
        if (objInvoke != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public static /* synthetic */ Object retry$default(RetrierConfig retrierConfig, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            retrierConfig = new RetrierConfig(0L, 0L, 0L, 0.0d, null, 0L, 63, null);
        }
        return retry(retrierConfig, function1, continuation);
    }
}
