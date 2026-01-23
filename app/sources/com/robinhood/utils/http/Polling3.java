package com.robinhood.utils.http;

import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: Polling.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a_\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0004\b\u000b\u0010\u000e\"\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lretrofit2/Response;", "T", "j$/time/Duration", "interval", "", "retryIfNetworkError", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "Lkotlinx/coroutines/flow/Flow;", "networkPollWithBackendInterval", "(Lj$/time/Duration;ZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "responseToIntervalMapper", "(Lkotlin/jvm/functions/Function1;Lj$/time/Duration;ZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "getPollInterval", "(Lretrofit2/Response;)Lj$/time/Duration;", "pollInterval", "lib-utils-http"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.http.PollingKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Polling3 {
    public static /* synthetic */ Flow networkPollWithBackendInterval$default(Duration duration, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return networkPollWithBackendInterval(duration, z, function1);
    }

    public static final <T extends Response<?>> Flow<T> networkPollWithBackendInterval(Duration interval, boolean z, Function1<? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(block, "block");
        return networkPollWithBackendInterval(new Function1() { // from class: com.robinhood.utils.http.PollingKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Polling3.networkPollWithBackendInterval$lambda$0((Response) obj);
            }
        }, interval, z, block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Duration networkPollWithBackendInterval$lambda$0(Response response) {
        if (response != null) {
            return getPollInterval(response);
        }
        return null;
    }

    public static /* synthetic */ Flow networkPollWithBackendInterval$default(Function1 function1, Duration duration, boolean z, Function1 function12, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return networkPollWithBackendInterval(function1, duration, z, function12);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Polling.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.http.PollingKt$networkPollWithBackendInterval$2", m3645f = "Polling.kt", m3646l = {46, 54, 61, 64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.utils.http.PollingKt$networkPollWithBackendInterval$2 */
    static final class C419622<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
        final /* synthetic */ Duration $interval;
        final /* synthetic */ Function1<T, Duration> $responseToIntervalMapper;
        final /* synthetic */ boolean $retryIfNetworkError;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C419622(Function1<? super Continuation<? super T>, ? extends Object> function1, boolean z, Duration duration, Function1<? super T, Duration> function12, Continuation<? super C419622> continuation) {
            super(2, continuation);
            this.$block = function1;
            this.$retryIfNetworkError = z;
            this.$interval = duration;
            this.$responseToIntervalMapper = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C419622 c419622 = new C419622(this.$block, this.$retryIfNetworkError, this.$interval, this.$responseToIntervalMapper, continuation);
            c419622.L$0 = obj;
            return c419622;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C419622) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007a -> B:18:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a9 -> B:18:0x0040). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            boolean zIsNetworkRelated;
            boolean z;
            Object objDelay;
            FlowCollector flowCollector2;
            FlowCollector flowCollector3;
            Object obj2;
            Duration duration;
            long millis;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
            } else {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        flowCollector2 = flowCollector;
                    } finally {
                        if (zIsNetworkRelated) {
                            if (z) {
                                if (objDelay != coroutine_suspended) {
                                    Function1<Continuation<? super T>, Object> function1 = this.$block;
                                    this.L$0 = flowCollector;
                                    this.label = 1;
                                    obj = function1.invoke(this);
                                    flowCollector2 = flowCollector;
                                    if (obj != coroutine_suspended) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                        }
                    }
                    this.L$0 = flowCollector2;
                    this.L$1 = obj;
                    this.label = 3;
                    if (flowCollector2.emit(obj, this) != coroutine_suspended) {
                        flowCollector3 = flowCollector2;
                        obj2 = obj;
                        duration = (Duration) this.$responseToIntervalMapper.invoke(obj2);
                        if (duration == null) {
                        }
                        millis = duration.toMillis();
                        this.L$0 = flowCollector3;
                        this.L$1 = null;
                        this.label = 4;
                        if (DelayKt.delay(millis, this) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    if (i == 3) {
                        obj2 = this.L$1;
                        flowCollector3 = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        duration = (Duration) this.$responseToIntervalMapper.invoke(obj2);
                        if (duration == null) {
                            duration = this.$interval;
                        }
                        millis = duration.toMillis();
                        this.L$0 = flowCollector3;
                        this.L$1 = null;
                        this.label = 4;
                        if (DelayKt.delay(millis, this) != coroutine_suspended) {
                            flowCollector = flowCollector3;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector4;
            }
            Function1<Continuation<? super T>, Object> function12 = this.$block;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = function12.invoke(this);
            flowCollector2 = flowCollector;
            if (obj != coroutine_suspended) {
                this.L$0 = flowCollector2;
                this.L$1 = obj;
                this.label = 3;
                if (flowCollector2.emit(obj, this) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public static final <T> Flow<T> networkPollWithBackendInterval(Function1<? super T, Duration> responseToIntervalMapper, Duration interval, boolean z, Function1<? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(responseToIntervalMapper, "responseToIntervalMapper");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(block, "block");
        return FlowKt.flow(new C419622(block, z, interval, responseToIntervalMapper, null));
    }

    public static final Duration getPollInterval(Response<?> response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        String str = response.headers().get(Headers.POLL_INTERVAL);
        if (str == null) {
            return null;
        }
        try {
            BigDecimal bigDecimalMultiply = new BigDecimal(str).multiply(new BigDecimal(1000));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return Duration.ofMillis(BigDecimals7.toLongRounded(bigDecimalMultiply));
        } catch (NumberFormatException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("NumberFormatException when parsing X-Poll-Interval:" + str, e), false, new EventMetadata(SentryTeam.MOBILE_PLATFORM, null, MapsKt.mapOf(Tuples4.m3642to(Headers.POLL_INTERVAL, str)), 2, null), 2, null);
            return null;
        }
    }
}
