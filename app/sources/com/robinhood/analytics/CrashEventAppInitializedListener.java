package com.robinhood.analytics;

import android.app.Application;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.sentry.CrashStore;
import com.robinhood.android.sentry.StackTraces;
import com.robinhood.rosetta.eventlogging.ErrorEventData;
import com.robinhood.utils.AppInitializedListener;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import io.sentry.SentryEvent;
import io.sentry.protocol.SentryId;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;
import p479j$.util.DateRetargetClass;

/* compiled from: CrashEventAppInitializedListener.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/analytics/CrashEventAppInitializedListener;", "Lcom/robinhood/utils/AppInitializedListener;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "crashStore", "Lcom/robinhood/android/sentry/CrashStore;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/sentry/CrashStore;)V", "onAppInitialized", "", "app", "Landroid/app/Application;", "reportEvents", "events", "", "Lio/sentry/SentryEvent;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class CrashEventAppInitializedListener implements AppInitializedListener {
    private final CrashStore crashStore;
    private final EventLogger eventLogger;
    private final CoroutineScope rootCoroutineScope;

    /* compiled from: CrashEventAppInitializedListener.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.CrashEventAppInitializedListener", m3645f = "CrashEventAppInitializedListener.kt", m3646l = {39, 45}, m3647m = "reportEvents")
    /* renamed from: com.robinhood.analytics.CrashEventAppInitializedListener$reportEvents$1 */
    static final class C73061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C73061(Continuation<? super C73061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrashEventAppInitializedListener.this.reportEvents(null, this);
        }
    }

    public CrashEventAppInitializedListener(@RootCoroutineScope CoroutineScope rootCoroutineScope, EventLogger eventLogger, CrashStore crashStore) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(crashStore, "crashStore");
        this.rootCoroutineScope = rootCoroutineScope;
        this.eventLogger = eventLogger;
        this.crashStore = crashStore;
    }

    @Override // com.robinhood.utils.AppInitializedListener
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        FlowKt.launchIn(FlowKt.onEach(this.crashStore.getCrashes(), new C73051(this)), this.rootCoroutineScope);
    }

    /* compiled from: CrashEventAppInitializedListener.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.CrashEventAppInitializedListener$onAppInitialized$1 */
    /* synthetic */ class C73051 extends FunctionReferenceImpl implements Function2<List<? extends SentryEvent>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C73051(Object obj) {
            super(2, obj, CrashEventAppInitializedListener.class, "reportEvents", "reportEvents(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends SentryEvent> list, Continuation<? super Unit> continuation) {
            return invoke2((List<SentryEvent>) list, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<SentryEvent> list, Continuation<? super Unit> continuation) {
            return ((CrashEventAppInitializedListener) this.receiver).reportEvents(list, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a8 -> B:17:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reportEvents(List<SentryEvent> list, Continuation<? super Unit> continuation) {
        C73061 c73061;
        Iterator<SentryEvent> it;
        SentryEvent next;
        SentryId eventId;
        if (continuation instanceof C73061) {
            c73061 = (C73061) continuation;
            int i = c73061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73061.label = i - Integer.MIN_VALUE;
            } else {
                c73061 = new C73061(continuation);
            }
        }
        Object obj = c73061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c73061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            it = list.iterator();
        } else {
            if (i2 == 1) {
                next = (SentryEvent) c73061.L$1;
                Iterator<SentryEvent> it2 = (Iterator) c73061.L$0;
                ResultKt.throwOnFailure(obj);
                it = it2;
                CrashStore crashStore = this.crashStore;
                eventId = next.getEventId();
                if (eventId != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                c73061.L$0 = it;
                c73061.L$1 = null;
                c73061.label = 2;
                if (crashStore.discard(eventId, c73061) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator<SentryEvent> it3 = (Iterator) c73061.L$0;
            ResultKt.throwOnFailure(obj);
            it = it3;
        }
        if (it.hasNext()) {
            next = it.next();
            EventLogger eventLogger = this.eventLogger;
            SentryId eventId2 = next.getEventId();
            String string2 = eventId2 != null ? eventId2.toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            ErrorEventData.ErrorType errorType = ErrorEventData.ErrorType.CRASH;
            String strStackTraceToString = StackTraces.stackTraceToString(next);
            Instant instant = DateRetargetClass.toInstant(next.getTimestamp());
            c73061.L$0 = it;
            c73061.L$1 = next;
            c73061.label = 1;
            C73061 c730612 = c73061;
            if (EventLogger.DefaultImpls.recordErrorEvent$default(eventLogger, string2, null, null, errorType, null, strStackTraceToString, instant, c730612, 22, null) != coroutine_suspended) {
                c73061 = c730612;
                CrashStore crashStore2 = this.crashStore;
                eventId = next.getEventId();
                if (eventId != null) {
                }
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
