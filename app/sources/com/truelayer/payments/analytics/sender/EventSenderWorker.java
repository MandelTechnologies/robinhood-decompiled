package com.truelayer.payments.analytics.sender;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.truelayer.payments.analytics.configuration.AnalyticsNetworkConfiguration;
import com.truelayer.payments.analytics.configuration.HttpClientConfig2;
import com.truelayer.payments.analytics.events.AnalyticsEvent;
import com.truelayer.payments.analytics.network.AnalyticsApi;
import com.truelayer.payments.analytics.store.AnalyticsStore2;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import retrofit2.HttpException;

/* compiled from: EventSenderWorker.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/truelayer/payments/analytics/sender/EventSenderWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "api", "Lcom/truelayer/payments/analytics/network/AnalyticsApi;", "db", "Lcom/truelayer/payments/analytics/store/AnalyticsStoreImpl;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", "", "analyticsEvent", "Lcom/truelayer/payments/analytics/events/AnalyticsEvent;", "(Lcom/truelayer/payments/analytics/events/AnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EventSenderWorker extends CoroutineWorker {
    public static final String INPUT_DATA_KEY_CONFIGURATION = "configuration";
    public static final String WORKER_NAME = "EventSenderWorker";
    private final AnalyticsApi api;
    private final AnalyticsStore2 db;

    /* compiled from: EventSenderWorker.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.analytics.sender.EventSenderWorker", m3645f = "EventSenderWorker.kt", m3646l = {49}, m3647m = "doWork")
    /* renamed from: com.truelayer.payments.analytics.sender.EventSenderWorker$doWork$1 */
    static final class C427141 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C427141(Continuation<? super C427141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventSenderWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventSenderWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        AnalyticsStore2.Companion companion = AnalyticsStore2.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.db = AnalyticsStore2.Companion.shared$default(companion, applicationContext, null, null, false, null, 30, null);
        String string2 = getInputData().getString(INPUT_DATA_KEY_CONFIGURATION);
        if (string2 == null) {
            throw new IllegalStateException("Input data 'configuration' missing.");
        }
        Json.Companion companion2 = Json.INSTANCE;
        companion2.getSerializersModule();
        AnalyticsNetworkConfiguration analyticsNetworkConfiguration = (AnalyticsNetworkConfiguration) companion2.decodeFromString(AnalyticsNetworkConfiguration.INSTANCE.serializer(), string2);
        this.api = new AnalyticsApi(HttpUrl.INSTANCE.get(analyticsNetworkConfiguration.getApiUrlString()), HttpClientConfig2.getOkhttpClient(analyticsNetworkConfiguration.getHeaders(), analyticsNetworkConfiguration.getEnableDebugLogging()));
    }

    /* compiled from: EventSenderWorker.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.analytics.sender.EventSenderWorker$doWork$2", m3645f = "EventSenderWorker.kt", m3646l = {52}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.analytics.sender.EventSenderWorker$doWork$2 */
    static final class C427152 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
        int label;

        C427152(Continuation<? super C427152> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventSenderWorker.this.new C427152(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
            return ((C427152) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<AnalyticsEvent> first = EventSenderWorker.this.db.getFirst();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(EventSenderWorker.this);
                    this.label = 1;
                    if (first.collect(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ListenableWorker.Result.success();
            } catch (Throwable th) {
                if (th instanceof EventSenderWorker3 ? true : th instanceof SocketException ? true : th instanceof IOException ? true : th instanceof ConnectException) {
                    return ListenableWorker.Result.retry();
                }
                return ListenableWorker.Result.failure();
            }
        }

        /* compiled from: EventSenderWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/truelayer/payments/analytics/events/AnalyticsEvent;", "emit", "(Lcom/truelayer/payments/analytics/events/AnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.truelayer.payments.analytics.sender.EventSenderWorker$doWork$2$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ EventSenderWorker this$0;

            AnonymousClass1(EventSenderWorker eventSenderWorker) {
                this.this$0 = eventSenderWorker;
            }

            /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
            
                if (r10.remove(r9, r0) == r1) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
            
                if (r10.remove(r9, r0) != r1) goto L50;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r2v0, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(AnalyticsEvent analyticsEvent, Continuation<? super Unit> continuation) throws EventSenderWorker3 {
                EventSenderWorker2 eventSenderWorker2;
                AnonymousClass1<T> anonymousClass1;
                if (continuation instanceof EventSenderWorker2) {
                    eventSenderWorker2 = (EventSenderWorker2) continuation;
                    int i = eventSenderWorker2.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        eventSenderWorker2.label = i - Integer.MIN_VALUE;
                    } else {
                        eventSenderWorker2 = new EventSenderWorker2(this, continuation);
                    }
                }
                Object objSendEvent = eventSenderWorker2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                AnonymousClass1 anonymousClass12 = eventSenderWorker2.label;
                try {
                } catch (SerializationExceptions2 unused) {
                } catch (HttpException e) {
                    e = e;
                }
                if (anonymousClass12 == 0) {
                    ResultKt.throwOnFailure(objSendEvent);
                    try {
                        EventSenderWorker eventSenderWorker = this.this$0;
                        eventSenderWorker2.L$0 = this;
                        eventSenderWorker2.L$1 = analyticsEvent;
                        eventSenderWorker2.label = 1;
                        objSendEvent = eventSenderWorker.sendEvent(analyticsEvent, eventSenderWorker2);
                        if (objSendEvent != coroutine_suspended) {
                            anonymousClass1 = this;
                        }
                    } catch (SerializationExceptions2 unused2) {
                        anonymousClass12 = this;
                        AnalyticsStore2 analyticsStore2 = anonymousClass12.this$0.db;
                        eventSenderWorker2.L$0 = null;
                        eventSenderWorker2.L$1 = null;
                        eventSenderWorker2.label = 3;
                    } catch (HttpException e2) {
                        e = e2;
                        anonymousClass12 = this;
                        int iCode = e.code();
                        if (400 <= iCode && iCode < 500) {
                            AnalyticsStore2 analyticsStore22 = anonymousClass12.this$0.db;
                            eventSenderWorker2.L$0 = null;
                            eventSenderWorker2.L$1 = null;
                            eventSenderWorker2.label = 4;
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (anonymousClass12 != 1) {
                    if (anonymousClass12 == 2) {
                        ResultKt.throwOnFailure(objSendEvent);
                    } else {
                        if (anonymousClass12 != 3 && anonymousClass12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(objSendEvent);
                    }
                    return Unit.INSTANCE;
                }
                analyticsEvent = (AnalyticsEvent) eventSenderWorker2.L$1;
                anonymousClass1 = (AnonymousClass1) eventSenderWorker2.L$0;
                ResultKt.throwOnFailure(objSendEvent);
                if (((Boolean) objSendEvent).booleanValue()) {
                    AnalyticsStore2 analyticsStore23 = anonymousClass1.this$0.db;
                    eventSenderWorker2.L$0 = anonymousClass1;
                    eventSenderWorker2.L$1 = analyticsEvent;
                    eventSenderWorker2.label = 2;
                    if (analyticsStore23.remove(analyticsEvent, eventSenderWorker2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                throw new EventSenderWorker3();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AnalyticsEvent) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        C427141 c427141;
        if (continuation instanceof C427141) {
            c427141 = (C427141) continuation;
            int i = c427141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c427141.label = i - Integer.MIN_VALUE;
            } else {
                c427141 = new C427141(continuation);
            }
        }
        Object objWithContext = c427141.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c427141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C427152 c427152 = new C427152(null);
            c427141.label = 1;
            objWithContext = BuildersKt.withContext(io2, c427152, c427141);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "withContext(...)");
        return objWithContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendEvent(AnalyticsEvent analyticsEvent, Continuation<? super Boolean> continuation) {
        return this.api.track(analyticsEvent, continuation);
    }
}
