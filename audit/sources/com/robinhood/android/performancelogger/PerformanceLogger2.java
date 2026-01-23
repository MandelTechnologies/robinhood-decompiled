package com.robinhood.android.performancelogger;

import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PerformanceLogger.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aB\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, m3636d2 = {"logStreamPerformance", "Lkotlinx/coroutines/flow/Flow;", "T", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "streamName", "", "source", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "contextualId", "Ljava/util/UUID;", "lib-performance-logger_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.performancelogger.PerformanceLoggerKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PerformanceLogger2 {
    public static /* synthetic */ Flow logStreamPerformance$default(Flow flow, PerformanceLogger performanceLogger, String str, PerformanceMetricEventData.Source source, UUID uuid, int i, Object obj) {
        if ((i & 4) != 0) {
            source = PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED;
        }
        if ((i & 8) != 0) {
            uuid = null;
        }
        return logStreamPerformance(flow, performanceLogger, str, source, uuid);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.performancelogger.PerformanceLoggerKt$logStreamPerformance$1", m3645f = "PerformanceLogger.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.performancelogger.PerformanceLoggerKt$logStreamPerformance$1 */
    static final class C254741<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $contextualId;
        final /* synthetic */ PerformanceLogger $performanceLogger;
        final /* synthetic */ PerformanceMetricEventData.Source $source;
        final /* synthetic */ String $streamName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C254741(PerformanceLogger performanceLogger, PerformanceMetricEventData.Source source, UUID uuid, String str, Continuation<? super C254741> continuation) {
            super(2, continuation);
            this.$performanceLogger = performanceLogger;
            this.$source = source;
            this.$contextualId = uuid;
            this.$streamName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C254741(this.$performanceLogger, this.$source, this.$contextualId, this.$streamName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C254741) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$performanceLogger.beginMetric(PerformanceMetricEventData.Name.STREAM_LOAD, this.$source, this.$contextualId, new PerformanceMetricEventData.Context(false, false, false, null, null, null, null, null, new PerformanceMetricEventData.Context.StreamLoad(this.$streamName, null, null, 6, null), null, null, null, 3839, null));
            return Unit.INSTANCE;
        }
    }

    public static final <T> Flow<T> logStreamPerformance(Flow<? extends T> flow, PerformanceLogger performanceLogger, String streamName, PerformanceMetricEventData.Source source, UUID uuid) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(streamName, "streamName");
        Intrinsics.checkNotNullParameter(source, "source");
        return FlowKt.onEach(FlowKt.onStart(flow, new C254741(performanceLogger, source, uuid, streamName, null)), new C254752(new Ref.BooleanRef(), performanceLogger, uuid, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, m3636d2 = {"<anonymous>", "", "T", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.performancelogger.PerformanceLoggerKt$logStreamPerformance$2", m3645f = "PerformanceLogger.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.performancelogger.PerformanceLoggerKt$logStreamPerformance$2 */
    static final class C254752<T> extends ContinuationImpl7 implements Function2<T, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $contextualId;
        final /* synthetic */ Ref.BooleanRef $hasFirst;
        final /* synthetic */ PerformanceLogger $performanceLogger;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C254752(Ref.BooleanRef booleanRef, PerformanceLogger performanceLogger, UUID uuid, Continuation<? super C254752> continuation) {
            super(2, continuation);
            this.$hasFirst = booleanRef;
            this.$performanceLogger = performanceLogger;
            this.$contextualId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C254752(this.$hasFirst, this.$performanceLogger, this.$contextualId, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke2((C254752<T>) obj, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t, Continuation<? super Unit> continuation) {
            return ((C254752) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!this.$hasFirst.element) {
                this.$performanceLogger.completeMetric(PerformanceMetricEventData.Name.STREAM_LOAD, this.$contextualId);
                this.$hasFirst.element = true;
            }
            return Unit.INSTANCE;
        }
    }
}
