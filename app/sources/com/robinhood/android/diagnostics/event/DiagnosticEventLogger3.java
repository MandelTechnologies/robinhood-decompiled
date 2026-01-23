package com.robinhood.android.diagnostics.event;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.lifecycle.viewmodel.internal.ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.diagnostics.p100io.ProtoStreamWriting3;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import dispatch.core.Launch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel5;
import kotlinx.coroutines.channels.Channel6;
import kotlinx.coroutines.channels.Channel7;
import kotlinx.coroutines.channels.Channel9;
import p479j$.time.Clock;

/* compiled from: DiagnosticEventLogger.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/RealDiagnosticEventLogger;", "Lcom/robinhood/android/diagnostics/event/DiagnosticEventLogger;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/diagnostics/io/ProtoStreamWriterForDiagnosticEventBatch;", "writer", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lj$/time/Clock;Lcom/robinhood/android/diagnostics/io/ProtoStreamWriterForDiagnosticEventBatch;Lkotlinx/coroutines/CoroutineScope;)V", "", "ingest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/diagnostics/event/DiagnosticEvent;", "event", "send", "(Lcom/robinhood/android/diagnostics/event/DiagnosticEvent;)V", "", "throwable", "shutDown", "(Ljava/lang/Throwable;)V", "Lj$/time/Clock;", "Lcom/robinhood/android/diagnostics/io/ProtoStreamWriterForDiagnosticEventBatch;", "", "isShuttingDown", "Z", "Lkotlinx/coroutines/channels/Channel;", "channel", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "Companion", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"LogNotTimber"})
/* renamed from: com.robinhood.android.diagnostics.event.RealDiagnosticEventLogger, reason: use source file name */
/* loaded from: classes16.dex */
public final class DiagnosticEventLogger3 implements DiagnosticEventLogger {
    public static final long BUFFER_DELAY_MILLIS = 5000;
    public static final int MAX_BUFFER_SIZE = 1000;
    public static final String TAG = "DiagnosticEventLogger";
    public static final int TARGET_BUFFER_SIZE = 500;
    private final Channel<DiagnosticEvent> channel;
    private final Clock clock;
    private volatile boolean isShuttingDown;
    private final Job job;
    private final ProtoStreamWriting3 writer;

    /* compiled from: DiagnosticEventLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.diagnostics.event.RealDiagnosticEventLogger", m3645f = "DiagnosticEventLogger.kt", m3646l = {113, 115}, m3647m = "ingest")
    /* renamed from: com.robinhood.android.diagnostics.event.RealDiagnosticEventLogger$ingest$1 */
    static final class C140341 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C140341(Continuation<? super C140341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DiagnosticEventLogger3.this.ingest(this);
        }
    }

    public DiagnosticEventLogger3(Clock clock, ProtoStreamWriting3 writer, @RootCoroutineScope CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.clock = clock;
        this.writer = writer;
        this.channel = Channel4.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.job = Launch.launchIO$default(coroutineScope, null, null, new DiagnosticEventLogger4(this, null), 3, null);
    }

    @Override // com.robinhood.android.diagnostics.event.DiagnosticEventLogger
    public void send(DiagnosticEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            this.channel.mo8337trySendJP2dKIU(event);
        } catch (Channel7 e) {
            if (this.isShuttingDown) {
                Log.w(TAG, "Diagnostic event was not sent because the logger is shutting down: " + event);
                return;
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (kotlinx.coroutines.Timeout6.withTimeoutOrNull(5000, r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[Catch: ClosedReceiveChannelException -> 0x0031, PHI: r2 r9
      0x005a: PHI (r2v3 java.util.ArrayList) = (r2v13 java.util.ArrayList), (r2v14 java.util.ArrayList) binds: [B:24:0x0057, B:20:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r9v11 java.lang.Object) = (r9v16 java.lang.Object), (r9v1 java.lang.Object) binds: [B:24:0x0057, B:20:0x0040] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {ClosedReceiveChannelException -> 0x0031, blocks: (B:13:0x002d, B:29:0x0074, B:31:0x0082, B:33:0x008a, B:35:0x009f, B:36:0x00a5, B:23:0x004d, B:26:0x005a, B:20:0x0040), top: B:46:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0071 -> B:29:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ingest(Continuation<? super Unit> continuation) throws Exception {
        C140341 c140341;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (continuation instanceof C140341) {
            c140341 = (C140341) continuation;
            int i = c140341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c140341.label = i - Integer.MIN_VALUE;
            } else {
                c140341 = new C140341(continuation);
            }
        }
        Object objReceive = c140341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Collection collection = c140341.label;
        try {
            if (collection == 0) {
                ResultKt.throwOnFailure(objReceive);
                arrayList = new ArrayList();
                Channel<DiagnosticEvent> channel = this.channel;
                c140341.L$0 = arrayList;
                c140341.label = 1;
                objReceive = channel.receive(c140341);
                arrayList2 = arrayList;
                if (objReceive == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (collection != 1) {
                if (collection != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) c140341.L$0;
                ResultKt.throwOnFailure(objReceive);
                collection = list;
                DiagnosticEvent diagnosticEvent = (DiagnosticEvent) Channel5.m28806getOrNullimpl(this.channel.mo28799tryReceivePtdJZtk());
                while (diagnosticEvent != null && collection.size() < 999) {
                    collection.add(diagnosticEvent);
                    diagnosticEvent = (DiagnosticEvent) Channel5.m28806getOrNullimpl(this.channel.mo28799tryReceivePtdJZtk());
                }
                if (diagnosticEvent != null) {
                    collection.add(diagnosticEvent);
                }
                this.writer.write(new DiagnosticEventBatch(collection, null, 2, null));
                this.writer.flush();
                collection.clear();
                arrayList = collection;
                Channel<DiagnosticEvent> channel2 = this.channel;
                c140341.L$0 = arrayList;
                c140341.label = 1;
                objReceive = channel2.receive(c140341);
                arrayList2 = arrayList;
                if (objReceive == coroutine_suspended) {
                    arrayList2.add((DiagnosticEvent) objReceive);
                    C140352 c140352 = new C140352(arrayList2, this, null);
                    c140341.L$0 = arrayList2;
                    c140341.label = 2;
                    collection = arrayList2;
                }
                return coroutine_suspended;
            }
            ?? r2 = (List) c140341.L$0;
            ResultKt.throwOnFailure(objReceive);
            arrayList2 = r2;
            arrayList2.add((DiagnosticEvent) objReceive);
            C140352 c1403522 = new C140352(arrayList2, this, null);
            c140341.L$0 = arrayList2;
            c140341.label = 2;
            collection = arrayList2;
        } catch (Channel6 e) {
            if (!this.isShuttingDown) {
                throw e;
            }
            Log.d(TAG, "Ingestion: flushing remaining " + collection.size() + " events...");
            try {
                this.writer.write(new DiagnosticEventBatch(collection, null, 2, null));
                this.writer.flush();
                collection.clear();
                ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0.m529m(this.writer);
            } catch (IOException unused) {
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DiagnosticEventLogger.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.diagnostics.event.RealDiagnosticEventLogger$ingest$2", m3645f = "DiagnosticEventLogger.kt", m3646l = {117}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.diagnostics.event.RealDiagnosticEventLogger$ingest$2 */
    static final class C140352 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<DiagnosticEvent> $buffer;
        Object L$0;
        int label;
        final /* synthetic */ DiagnosticEventLogger3 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C140352(List<DiagnosticEvent> list, DiagnosticEventLogger3 diagnosticEventLogger3, Continuation<? super C140352> continuation) {
            super(2, continuation);
            this.$buffer = list;
            this.this$0 = diagnosticEventLogger3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C140352(this.$buffer, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C140352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003b -> B:14:0x003e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$buffer.size() < 499) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List<DiagnosticEvent> list = (Collection) this.L$0;
                ResultKt.throwOnFailure(obj);
                list.add(obj);
                if (this.$buffer.size() < 499) {
                    list = this.$buffer;
                    Channel channel = this.this$0.channel;
                    this.L$0 = list;
                    this.label = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list.add(obj);
                    if (this.$buffer.size() < 499) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    @Override // com.robinhood.android.diagnostics.event.DiagnosticEventLogger
    public void shutDown(Throwable throwable) throws InterruptedException {
        Log.d(TAG, "Shutting down");
        this.isShuttingDown = true;
        if (throwable != null) {
            send(new DiagnosticEvent(this.clock.instant(), new LogMessage(LogLevel.LOG_LEVEL_ASSERT, TAG, "App crashed", ExceptionsKt.stackTraceToString(throwable), null, 16, null), null, 4, null));
        }
        Channel9.DefaultImpls.close$default(this.channel, null, 1, null);
        Log.d(TAG, "Shutting down: waiting to flush remaining events...");
        BuildersKt__BuildersKt.runBlocking$default(null, new C140361(null), 1, null);
        Log.d(TAG, "Shutting down: done.");
    }

    /* compiled from: DiagnosticEventLogger.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.diagnostics.event.RealDiagnosticEventLogger$shutDown$1", m3645f = "DiagnosticEventLogger.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.diagnostics.event.RealDiagnosticEventLogger$shutDown$1 */
    static final class C140361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C140361(Continuation<? super C140361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DiagnosticEventLogger3.this.new C140361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C140361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Job job = DiagnosticEventLogger3.this.job;
                this.label = 1;
                if (job.join(this) == coroutine_suspended) {
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
    }
}
