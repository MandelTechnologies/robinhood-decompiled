package com.robinhood.coroutines.flow;

import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: ErrorHandling.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aA\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "j$/time/Duration", "retryDelay", "ignoreNetworkExceptions", "(Lkotlinx/coroutines/flow/Flow;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "", "maxRetries", "Lkotlin/Function1;", "", "", "predicate", "retryExponential", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.flow.ErrorHandlingKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class ErrorHandling3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryExponential$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ErrorHandling.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "cause", "", "<unused var>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.flow.ErrorHandlingKt$ignoreNetworkExceptions$1", m3645f = "ErrorHandling.kt", m3646l = {12}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.coroutines.flow.ErrorHandlingKt$ignoreNetworkExceptions$1 */
    static final class C329641<T> extends ContinuationImpl7 implements Function4<FlowCollector<? super T>, Throwable, Long, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Duration $retryDelay;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C329641(Duration duration, Continuation<? super C329641> continuation) {
            super(4, continuation);
            this.$retryDelay = duration;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, Long l, Continuation<? super Boolean> continuation) {
            return invoke((FlowCollector) obj, th, l.longValue(), continuation);
        }

        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
            C329641 c329641 = new C329641(this.$retryDelay, continuation);
            c329641.L$0 = th;
            return c329641.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (Throwables.isNetworkRelated((Throwable) this.L$0)) {
                    long millis = this.$retryDelay.toMillis();
                    this.label = 1;
                    if (DelayKt.delay(millis, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    z = false;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(z);
        }
    }

    public static final <T> Flow<T> ignoreNetworkExceptions(Flow<? extends T> flow, Duration retryDelay) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(retryDelay, "retryDelay");
        return FlowKt.retryWhen(flow, new C329641(retryDelay, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ErrorHandling.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "cause", "", "attempt", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.flow.ErrorHandlingKt$retryExponential$2", m3645f = "ErrorHandling.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.coroutines.flow.ErrorHandlingKt$retryExponential$2 */
    static final class C329652<T> extends ContinuationImpl7 implements Function4<FlowCollector<? super T>, Throwable, Long, Continuation<? super Boolean>, Object> {
        final /* synthetic */ int $maxRetries;
        final /* synthetic */ Function1<Throwable, Boolean> $predicate;
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C329652(int i, Function1<? super Throwable, Boolean> function1, Continuation<? super C329652> continuation) {
            super(4, continuation);
            this.$maxRetries = i;
            this.$predicate = function1;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, Long l, Continuation<? super Boolean> continuation) {
            return invoke((FlowCollector) obj, th, l.longValue(), continuation);
        }

        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
            C329652 c329652 = new C329652(this.$maxRetries, this.$predicate, continuation);
            c329652.L$0 = th;
            c329652.J$0 = j;
            return c329652.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                long j = this.J$0 + 1;
                if (j > this.$maxRetries || !this.$predicate.invoke(th).booleanValue()) {
                    z = false;
                } else {
                    long jPow = (long) Math.pow(2.0d, j);
                    this.label = 1;
                    if (DelayKt.delay(jPow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(z);
        }
    }

    public static /* synthetic */ Flow retryExponential$default(Flow flow, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.coroutines.flow.ErrorHandlingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(ErrorHandling3.retryExponential$lambda$0((Throwable) obj2));
                }
            };
        }
        return retryExponential(flow, i, function1);
    }

    public static final <T> Flow<T> retryExponential(Flow<? extends T> flow, int i, Function1<? super Throwable, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return FlowKt.retryWhen(flow, new C329652(i, predicate, null));
    }
}
