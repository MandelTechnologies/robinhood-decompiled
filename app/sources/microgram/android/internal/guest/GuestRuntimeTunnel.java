package microgram.android.internal.guest;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import com.robinhood.coroutines.job.SpecialCancellation2;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jdk7.AutoCloseableJVM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel5;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.serialization.json.Json;
import microgram.MicrogramError;
import microgram.android.GuestError3;
import microgram.android.MessageHandler;
import microgram.android.Monitoring3;
import microgram.android.internal.HostPlatformMessageTunnel;
import microgram.android.internal.HostReceiveMessageHandler;
import microgram.android.internal.MicrogramDebug;
import microgram.android.internal.guest.GuestRuntime;
import microgram.android.internal.guest.GuestRuntimeTunnel;

/* compiled from: GuestRuntimeTunnel.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002=>B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u001c\u001a\u00020\u001b*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0014\u0010/\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0018048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0018078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, m3636d2 = {"Lmicrogram/android/internal/guest/GuestRuntimeTunnel;", "Lmicrogram/android/internal/HostPlatformMessageTunnel;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lmicrogram/android/internal/guest/GuestRuntime$Factory;", "guestRuntimeFactory", "Lmicrogram/android/internal/HostReceiveMessageHandler;", "receiveMessageHandler", "Lmicrogram/android/MonitorListener;", "monitor", "Lcom/robinhood/android/tracing/TrackTrace;", "instanceTrace", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/internal/guest/GuestRuntime$Factory;Lmicrogram/android/internal/HostReceiveMessageHandler;Lmicrogram/android/MonitorListener;Lcom/robinhood/android/tracing/TrackTrace;)V", "", "run", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/android/internal/guest/GuestRuntime;", "runtime", "Lmicrogram/android/internal/guest/GuestRuntimeTunnel$Event;", "event", "handleEvent", "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/internal/guest/GuestRuntime;Lmicrogram/android/internal/guest/GuestRuntimeTunnel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/android/internal/guest/GuestRuntimeTunnel$State;", "", "messageData", "", "send", "(Lmicrogram/android/internal/guest/GuestRuntimeTunnel$State;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/android/internal/guest/RuntimeMessage;", "message", "onGuestEvent", "(Lmicrogram/android/internal/guest/RuntimeMessage;)V", "onReady", "()V", "identifier", "Lmicrogram/android/MessageHandler;", "handler", "registerMessageHandler", "(Ljava/lang/String;Lmicrogram/android/MessageHandler;)V", "sendMessage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "Lmicrogram/android/internal/guest/GuestRuntime$Factory;", "Lmicrogram/android/internal/HostReceiveMessageHandler;", "Lmicrogram/android/MonitorListener;", "localTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "Lkotlinx/coroutines/channels/Channel;", "events", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/Flow;", "readyState", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/Job;", "globalJob", "Lkotlinx/coroutines/Job;", "State", "Event", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class GuestRuntimeTunnel implements HostPlatformMessageTunnel, Closeable {
    private final Channel<Event> events;
    private final Job globalJob;
    private final GuestRuntime.Factory guestRuntimeFactory;
    private final RhTrace6 localTrace;
    private final Monitoring3 monitor;
    private final Flow<State> readyState;
    private final HostReceiveMessageHandler receiveMessageHandler;
    private final StateFlow2<State> state;

    /* compiled from: GuestRuntimeTunnel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.guest.GuestRuntimeTunnel", m3645f = "GuestRuntimeTunnel.kt", m3646l = {101, 104, 113}, m3647m = "handleEvent")
    /* renamed from: microgram.android.internal.guest.GuestRuntimeTunnel$handleEvent$1 */
    static final class C462721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C462721(Continuation<? super C462721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GuestRuntimeTunnel.this.handleEvent(null, null, null, this);
        }
    }

    /* compiled from: GuestRuntimeTunnel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.guest.GuestRuntimeTunnel", m3645f = "GuestRuntimeTunnel.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, 74}, m3647m = "run")
    /* renamed from: microgram.android.internal.guest.GuestRuntimeTunnel$run$1 */
    static final class C462731 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C462731(Continuation<? super C462731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GuestRuntimeTunnel.this.run(this);
        }
    }

    public GuestRuntimeTunnel(CoroutineScope scope, GuestRuntime.Factory guestRuntimeFactory, HostReceiveMessageHandler receiveMessageHandler, Monitoring3 monitor, RhTrace6 instanceTrace) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(guestRuntimeFactory, "guestRuntimeFactory");
        Intrinsics.checkNotNullParameter(receiveMessageHandler, "receiveMessageHandler");
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
        this.guestRuntimeFactory = guestRuntimeFactory;
        this.receiveMessageHandler = receiveMessageHandler;
        this.monitor = monitor;
        this.localTrace = instanceTrace.withMethodNamePrefix("GuestRuntimeTunnel.");
        this.events = Channel4.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        StateFlow2<State> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
        this.state = stateFlow2MutableStateFlow;
        final Flow flowFilterNotNull = FlowKt.filterNotNull(stateFlow2MutableStateFlow);
        this.readyState = new Flow<State>() { // from class: microgram.android.internal.guest.GuestRuntimeTunnel$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: microgram.android.internal.guest.GuestRuntimeTunnel$special$$inlined$filter$1$2 */
            public static final class C462712<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "microgram.android.internal.guest.GuestRuntimeTunnel$special$$inlined$filter$1$2", m3645f = "GuestRuntimeTunnel.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: microgram.android.internal.guest.GuestRuntimeTunnel$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C462712.this.emit(null, this);
                    }
                }

                public C462712(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((GuestRuntimeTunnel.State) obj).getStatus() == GuestRuntimeTunnel.State.Status.READY) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super GuestRuntimeTunnel.State> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new C462712(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(scope, null, null, new GuestRuntimeTunnel2(this, null), 3, null);
        jobLaunch$default.invokeOnCompletion(new Function1() { // from class: microgram.android.internal.guest.GuestRuntimeTunnel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GuestRuntimeTunnel.globalJob$lambda$2$lambda$1(this.f$0, (Throwable) obj);
            }
        });
        this.globalJob = jobLaunch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit globalJob$lambda$2$lambda$1(GuestRuntimeTunnel guestRuntimeTunnel, Throwable th) {
        guestRuntimeTunnel.monitor.onClosed();
        guestRuntimeTunnel.close();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.robinhood.android.tracing.SpanHandle] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.robinhood.android.tracing.SpanHandle] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.coroutines.Continuation, microgram.android.internal.guest.GuestRuntimeTunnel$run$1] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.robinhood.android.tracing.SpanHandle] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.robinhood.android.tracing.SpanHandle] */
    /* JADX WARN: Type inference failed for: r8v9, types: [microgram.android.internal.guest.GuestRuntime$Factory] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run(Continuation<? super Unit> continuation) throws Throwable {
        ?? c462731;
        GuestRuntime guestRuntime;
        AutoCloseable autoCloseable;
        Throwable th;
        if (continuation instanceof C462731) {
            C462731 c4627312 = (C462731) continuation;
            int i = c4627312.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4627312.label = i - Integer.MIN_VALUE;
                c462731 = c4627312;
            } else {
                c462731 = new C462731(continuation);
            }
        }
        Object objCreate = c462731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c462731.label;
        try {
            try {
                try {
                    try {
                        if (r2 == 0) {
                            ResultKt.throwOnFailure(objCreate);
                            RhTrace6 rhTrace6 = this.localTrace;
                            RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("run");
                            ?? r8 = this.guestRuntimeFactory;
                            GuestRuntimeTunnel4 guestRuntimeTunnel4 = new GuestRuntimeTunnel4(this);
                            c462731.L$0 = rhTrace3BeginSpan;
                            c462731.label = 1;
                            objCreate = r8.create(guestRuntimeTunnel4, c462731);
                            r2 = rhTrace3BeginSpan;
                            if (objCreate == coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        if (r2 != 1) {
                            if (r2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            autoCloseable = (AutoCloseable) c462731.L$1;
                            c462731 = (RhTrace3) c462731.L$0;
                            try {
                                ResultKt.throwOnFailure(objCreate);
                                c462731 = c462731;
                                Unit unit = Unit.INSTANCE;
                                AutoCloseableJVM.closeFinally(autoCloseable, null);
                                if (c462731 != 0) {
                                    c462731.end();
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    AutoCloseableJVM.closeFinally(autoCloseable, th);
                                    throw th3;
                                }
                            }
                        }
                        RhTrace3 rhTrace3 = (RhTrace3) c462731.L$0;
                        ResultKt.throwOnFailure(objCreate);
                        r2 = rhTrace3;
                        GuestRuntimeTunnel5 guestRuntimeTunnel5 = new GuestRuntimeTunnel5(this, guestRuntime, null);
                        c462731.L$0 = r2;
                        c462731.L$1 = guestRuntime;
                        c462731.label = 2;
                        if (CoroutineScope2.coroutineScope(guestRuntimeTunnel5, c462731) != coroutine_suspended) {
                            autoCloseable = guestRuntime;
                            c462731 = r2;
                            Unit unit2 = Unit.INSTANCE;
                            AutoCloseableJVM.closeFinally(autoCloseable, null);
                            if (c462731 != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th4) {
                        autoCloseable = guestRuntime;
                        th = th4;
                        c462731 = r2;
                        throw th;
                    }
                    guestRuntime = (GuestRuntime) objCreate;
                } catch (GuestRuntimeUnavailableException e) {
                    this.monitor.onException(e);
                    JobKt.cancel(this.globalJob, "Guest runtime is unavailable", e);
                    Unit unit3 = Unit.INSTANCE;
                    if (r2 != 0) {
                        r2.end();
                    }
                    return unit3;
                }
            } catch (Throwable th5) {
                th = th5;
                r2 = c462731;
                if (r2 != 0) {
                    r2.end();
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            if (r2 != 0) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0148 A[Catch: all -> 0x0040, TryCatch #1 {all -> 0x0040, blocks: (B:14:0x003b, B:69:0x0135, B:77:0x0148, B:79:0x014e, B:81:0x016f, B:90:0x017e, B:91:0x0181, B:74:0x013c, B:80:0x0161, B:88:0x017c), top: B:100:0x002a, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0174  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.robinhood.android.tracing.SpanHandle] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleEvent(CoroutineScope coroutineScope, GuestRuntime guestRuntime, Event event, Continuation<? super Unit> continuation) throws Throwable {
        C462721 c462721;
        RhTrace3 rhTrace3;
        Object objProcessIncomingMessage;
        RhTrace3 rhTrace3BeginSpan;
        Job jobLaunch$default;
        State value;
        State state;
        RhTrace3 rhTrace32;
        Job stateJob;
        Job job;
        MicrogramError microgramError;
        int value2;
        Event event2 = event;
        if (continuation instanceof C462721) {
            c462721 = (C462721) continuation;
            int i = c462721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462721.label = i - Integer.MIN_VALUE;
            } else {
                c462721 = new C462721(continuation);
            }
        }
        Object obj = c462721.result;
        RhTrace3 coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462721.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!(event2 instanceof Event.Load)) {
                    if (!(event2 instanceof Event.IncomingMessage)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RhTrace6 rhTrace6 = this.localTrace;
                    RhTrace3 rhTrace3BeginSpan2 = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("handleEvent(Event.IncomingMessage)");
                    try {
                        MicrogramDebug microgramDebug = MicrogramDebug.INSTANCE;
                        try {
                            HostReceiveMessageHandler hostReceiveMessageHandler = this.receiveMessageHandler;
                            String data = ((Event.IncomingMessage) event2).getMessage().getData();
                            c462721.L$0 = event2;
                            c462721.L$1 = rhTrace3BeginSpan2;
                            c462721.label = 3;
                            objProcessIncomingMessage = hostReceiveMessageHandler.processIncomingMessage(data, c462721);
                        } catch (CancellationException unused) {
                            rhTrace3 = rhTrace3BeginSpan2;
                            JobKt.ensureActive(c462721.getContext());
                            microgramError = MicrogramError.INTERRUPTED;
                            coroutine_suspended = rhTrace3;
                            if (microgramError == null) {
                            }
                            MicrogramDebug microgramDebug2 = MicrogramDebug.INSTANCE;
                            AutoCloseable autoCloseable = (AutoCloseable) CollectionsKt.single((List) ((Event.IncomingMessage) event2).getMessage().getPorts());
                            ((GuestRuntime3) autoCloseable).postMessage(String.valueOf(value2), new GuestRuntime2[0]);
                            Unit unit = Unit.INSTANCE;
                            AutoCloseableJVM.closeFinally(autoCloseable, null);
                            if (coroutine_suspended != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (objProcessIncomingMessage != coroutine_suspended) {
                            rhTrace3 = rhTrace3BeginSpan2;
                            obj = objProcessIncomingMessage;
                            microgramError = (MicrogramError) obj;
                            coroutine_suspended = rhTrace3;
                            if (microgramError == null) {
                            }
                            MicrogramDebug microgramDebug22 = MicrogramDebug.INSTANCE;
                            AutoCloseable autoCloseable2 = (AutoCloseable) CollectionsKt.single((List) ((Event.IncomingMessage) event2).getMessage().getPorts());
                            ((GuestRuntime3) autoCloseable2).postMessage(String.valueOf(value2), new GuestRuntime2[0]);
                            Unit unit2 = Unit.INSTANCE;
                            AutoCloseableJVM.closeFinally(autoCloseable2, null);
                            if (coroutine_suspended != 0) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        coroutine_suspended = rhTrace3BeginSpan2;
                        if (coroutine_suspended != 0) {
                            coroutine_suspended.end();
                        }
                        throw th;
                    }
                } else {
                    RhTrace6 rhTrace62 = this.localTrace;
                    rhTrace3BeginSpan = !rhTrace62.isEnabled() ? null : rhTrace62.beginSpan("handleEvent(Event.Load)");
                    try {
                        MicrogramDebug microgramDebug3 = MicrogramDebug.INSTANCE;
                        jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.LAZY, new GuestRuntimeTunnel3(event2, this, null), 1, null);
                        State state2 = new State(guestRuntime, ((Event.Load) event2).getHostPort(), State.Status.STARTED, jobLaunch$default);
                        StateFlow2<State> stateFlow2 = this.state;
                        do {
                            value = stateFlow2.getValue();
                            State state3 = value;
                        } while (!stateFlow2.compareAndSet(value, state2));
                        state = value;
                        if (state != null) {
                            HostReceiveMessageHandler hostReceiveMessageHandler2 = this.receiveMessageHandler;
                            c462721.L$0 = rhTrace3BeginSpan;
                            c462721.L$1 = jobLaunch$default;
                            c462721.L$2 = state;
                            c462721.label = 1;
                            if (hostReceiveMessageHandler2.handleUnderlyingTransportReset(c462721) != coroutine_suspended) {
                                stateJob = state.getStateJob();
                                Job.DefaultImpls.cancel$default(stateJob, null, 1, null);
                                c462721.L$0 = rhTrace3BeginSpan;
                                c462721.L$1 = jobLaunch$default;
                                c462721.L$2 = stateJob;
                                c462721.label = 2;
                                if (stateJob.join(c462721) != coroutine_suspended) {
                                }
                            }
                        } else {
                            rhTrace32 = rhTrace3BeginSpan;
                            boxing.boxBoolean(jobLaunch$default.start());
                            if (rhTrace32 != null) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        rhTrace32 = rhTrace3BeginSpan;
                        if (rhTrace32 != null) {
                        }
                        throw th;
                    }
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                state = (State) c462721.L$2;
                jobLaunch$default = (Job) c462721.L$1;
                RhTrace3 rhTrace33 = (RhTrace3) c462721.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    rhTrace3BeginSpan = rhTrace33;
                    stateJob = state.getStateJob();
                    Job.DefaultImpls.cancel$default(stateJob, null, 1, null);
                    c462721.L$0 = rhTrace3BeginSpan;
                    c462721.L$1 = jobLaunch$default;
                    c462721.L$2 = stateJob;
                    c462721.label = 2;
                    if (stateJob.join(c462721) != coroutine_suspended) {
                        rhTrace32 = rhTrace3BeginSpan;
                        job = jobLaunch$default;
                        jobLaunch$default = job;
                        boxing.boxBoolean(jobLaunch$default.start());
                        if (rhTrace32 != null) {
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    rhTrace32 = rhTrace33;
                    if (rhTrace32 != null) {
                        rhTrace32.end();
                    }
                    throw th;
                }
            }
            if (i2 == 2) {
                job = (Job) c462721.L$1;
                rhTrace32 = (RhTrace3) c462721.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    jobLaunch$default = job;
                    boxing.boxBoolean(jobLaunch$default.start());
                    if (rhTrace32 != null) {
                        rhTrace32.end();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (rhTrace32 != null) {
                    }
                    throw th;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rhTrace3 = (RhTrace3) c462721.L$1;
                event2 = (Event) c462721.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    rhTrace3 = rhTrace3;
                    microgramError = (MicrogramError) obj;
                    coroutine_suspended = rhTrace3;
                } catch (CancellationException unused2) {
                    JobKt.ensureActive(c462721.getContext());
                    microgramError = MicrogramError.INTERRUPTED;
                    coroutine_suspended = rhTrace3;
                    if (microgramError == null) {
                    }
                    MicrogramDebug microgramDebug222 = MicrogramDebug.INSTANCE;
                    AutoCloseable autoCloseable22 = (AutoCloseable) CollectionsKt.single((List) ((Event.IncomingMessage) event2).getMessage().getPorts());
                    ((GuestRuntime3) autoCloseable22).postMessage(String.valueOf(value2), new GuestRuntime2[0]);
                    Unit unit22 = Unit.INSTANCE;
                    AutoCloseableJVM.closeFinally(autoCloseable22, null);
                    if (coroutine_suspended != 0) {
                    }
                    return Unit.INSTANCE;
                }
                value2 = microgramError == null ? microgramError.getValue() : 0;
                MicrogramDebug microgramDebug2222 = MicrogramDebug.INSTANCE;
                AutoCloseable autoCloseable222 = (AutoCloseable) CollectionsKt.single((List) ((Event.IncomingMessage) event2).getMessage().getPorts());
                try {
                    ((GuestRuntime3) autoCloseable222).postMessage(String.valueOf(value2), new GuestRuntime2[0]);
                    Unit unit222 = Unit.INSTANCE;
                    AutoCloseableJVM.closeFinally(autoCloseable222, null);
                    if (coroutine_suspended != 0) {
                        coroutine_suspended.end();
                    }
                } finally {
                }
            }
            return Unit.INSTANCE;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // microgram.android.internal.HostPlatformMessageTunnel
    public void onReady() {
        State value;
        State state;
        this.monitor.onReady();
        StateFlow2<State> stateFlow2 = this.state;
        do {
            value = stateFlow2.getValue();
            state = value;
            if (state == null) {
                throw new IllegalStateException("Tunnel must be open in order to be put into the 'ready' state");
            }
        } while (!stateFlow2.compareAndSet(value, State.copy$default(state, null, null, State.Status.READY, null, 11, null)));
    }

    @Override // microgram.android.internal.HostPlatformMessageTunnel
    public void registerMessageHandler(String identifier, MessageHandler handler) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.receiveMessageHandler.registerMessageHandler(identifier, handler);
    }

    /* compiled from: GuestRuntimeTunnel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.guest.GuestRuntimeTunnel$sendMessage$2", m3645f = "GuestRuntimeTunnel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 147}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: microgram.android.internal.guest.GuestRuntimeTunnel$sendMessage$2 */
    static final class C462752 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ String $messageData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C462752(String str, Continuation<? super C462752> continuation) {
            super(2, continuation);
            this.$messageData = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GuestRuntimeTunnel.this.new C462752(this.$messageData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C462752) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MicrogramDebug microgramDebug = MicrogramDebug.INSTANCE;
                Flow flow = GuestRuntimeTunnel.this.readyState;
                this.label = 1;
                obj = FlowKt.first(flow, this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            MicrogramDebug microgramDebug2 = MicrogramDebug.INSTANCE;
            String str = this.$messageData;
            GuestRuntimeTunnel guestRuntimeTunnel = GuestRuntimeTunnel.this;
            this.label = 2;
            Object objSend = guestRuntimeTunnel.send((State) obj, str, this);
            return objSend == coroutine_suspended ? coroutine_suspended : objSend;
        }
    }

    @Override // microgram.android.internal.HostPlatformMessageTunnel
    public Object sendMessage(String str, Continuation<? super Integer> continuation) {
        return SpecialCancellation2.withCancellation(this.globalJob, new C462752(str, null), continuation);
    }

    /* compiled from: GuestRuntimeTunnel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.guest.GuestRuntimeTunnel$send$2", m3645f = "GuestRuntimeTunnel.kt", m3646l = {151, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: microgram.android.internal.guest.GuestRuntimeTunnel$send$2 */
    static final class C462742 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ String $messageData;
        final /* synthetic */ State $this_send;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C462742(State state, String str, Continuation<? super C462742> continuation) {
            super(2, continuation);
            this.$this_send = state;
            this.$messageData = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C462742(this.$this_send, this.$messageData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C462742) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            GuestRuntime3 guestRuntime3;
            GuestRuntime2 guestRuntime2;
            State state;
            AutoCloseable autoCloseable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GuestRuntime guestRuntime = this.$this_send.getGuestRuntime();
                    this.label = 1;
                    obj = guestRuntime.createMessageChannel(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    autoCloseable = (AutoCloseable) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        RuntimeMessage runtimeMessage = (RuntimeMessage) obj;
                        AutoCloseableJVM.closeFinally(autoCloseable, null);
                        MicrogramDebug microgramDebug = MicrogramDebug.INSTANCE;
                        return boxing.boxInt(Integer.parseInt(runtimeMessage.getData()));
                    } catch (Throwable th) {
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AutoCloseableJVM.closeFinally(autoCloseable, th);
                            throw th2;
                        }
                    }
                }
                ResultKt.throwOnFailure(obj);
                state.getHostPort().postMessage(this.$messageData, guestRuntime2);
                Channel8<RuntimeMessage> messages = guestRuntime3.getMessages();
                this.L$0 = guestRuntime3;
                this.label = 2;
                obj = messages.receive(this);
                if (obj != coroutine_suspended) {
                    autoCloseable = guestRuntime3;
                    RuntimeMessage runtimeMessage2 = (RuntimeMessage) obj;
                    AutoCloseableJVM.closeFinally(autoCloseable, null);
                    MicrogramDebug microgramDebug2 = MicrogramDebug.INSTANCE;
                    return boxing.boxInt(Integer.parseInt(runtimeMessage2.getData()));
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                autoCloseable = guestRuntime3;
                throw th;
            }
            Tuples2 tuples2 = (Tuples2) obj;
            guestRuntime3 = (GuestRuntime3) tuples2.component1();
            guestRuntime2 = (GuestRuntime2) tuples2.component2();
            state = this.$this_send;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object send(State state, String str, Continuation<? super Integer> continuation) {
        return SpecialCancellation2.withCancellation(state.getStateJob(), new C462742(state, str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGuestEvent(RuntimeMessage message) {
        RhTrace6 rhTrace6 = this.localTrace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("onGuestEvent");
        try {
            Json.Companion companion = Json.INSTANCE;
            String data = message.getData();
            companion.getSerializersModule();
            GuestEvent guestEvent = (GuestEvent) companion.decodeFromString(GuestEvent.INSTANCE.serializer(), data);
            if (guestEvent instanceof GuestEvent5) {
                if (Channel5.m28810isSuccessimpl(ChannelsKt.trySendBlocking(this.events, new Event.Load((GuestRuntime3) CollectionsKt.single((List) message.getPorts()))))) {
                    this.monitor.onLoading();
                }
            } else {
                if (!(guestEvent instanceof ErrorEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.monitor.onException(new GuestError3(((ErrorEvent) guestEvent).getError()));
            }
            Unit unit = Unit.INSTANCE;
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        } catch (Throwable th) {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Channel9.DefaultImpls.close$default(this.events, null, 1, null);
        Job.DefaultImpls.cancel$default(this.globalJob, null, 1, null);
    }

    /* compiled from: GuestRuntimeTunnel.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m3636d2 = {"Lmicrogram/android/internal/guest/GuestRuntimeTunnel$State;", "", "Lmicrogram/android/internal/guest/GuestRuntime;", "guestRuntime", "Lmicrogram/android/internal/guest/HostPort;", "hostPort", "Lmicrogram/android/internal/guest/GuestRuntimeTunnel$State$Status;", "status", "Lkotlinx/coroutines/Job;", "stateJob", "<init>", "(Lmicrogram/android/internal/guest/GuestRuntime;Lmicrogram/android/internal/guest/HostPort;Lmicrogram/android/internal/guest/GuestRuntimeTunnel$State$Status;Lkotlinx/coroutines/Job;)V", "copy", "(Lmicrogram/android/internal/guest/GuestRuntime;Lmicrogram/android/internal/guest/HostPort;Lmicrogram/android/internal/guest/GuestRuntimeTunnel$State$Status;Lkotlinx/coroutines/Job;)Lmicrogram/android/internal/guest/GuestRuntimeTunnel$State;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/android/internal/guest/GuestRuntime;", "getGuestRuntime", "()Lmicrogram/android/internal/guest/GuestRuntime;", "Lmicrogram/android/internal/guest/HostPort;", "getHostPort", "()Lmicrogram/android/internal/guest/HostPort;", "Lmicrogram/android/internal/guest/GuestRuntimeTunnel$State$Status;", "getStatus", "()Lmicrogram/android/internal/guest/GuestRuntimeTunnel$State$Status;", "Lkotlinx/coroutines/Job;", "getStateJob", "()Lkotlinx/coroutines/Job;", "Status", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class State {
        private final GuestRuntime guestRuntime;
        private final GuestRuntime3 hostPort;
        private final Job stateJob;
        private final Status status;

        public static /* synthetic */ State copy$default(State state, GuestRuntime guestRuntime, GuestRuntime3 guestRuntime3, Status status, Job job, int i, Object obj) {
            if ((i & 1) != 0) {
                guestRuntime = state.guestRuntime;
            }
            if ((i & 2) != 0) {
                guestRuntime3 = state.hostPort;
            }
            if ((i & 4) != 0) {
                status = state.status;
            }
            if ((i & 8) != 0) {
                job = state.stateJob;
            }
            return state.copy(guestRuntime, guestRuntime3, status, job);
        }

        public final State copy(GuestRuntime guestRuntime, GuestRuntime3 hostPort, Status status, Job stateJob) {
            Intrinsics.checkNotNullParameter(guestRuntime, "guestRuntime");
            Intrinsics.checkNotNullParameter(hostPort, "hostPort");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(stateJob, "stateJob");
            return new State(guestRuntime, hostPort, status, stateJob);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.guestRuntime, state.guestRuntime) && Intrinsics.areEqual(this.hostPort, state.hostPort) && this.status == state.status && Intrinsics.areEqual(this.stateJob, state.stateJob);
        }

        public int hashCode() {
            return (((((this.guestRuntime.hashCode() * 31) + this.hostPort.hashCode()) * 31) + this.status.hashCode()) * 31) + this.stateJob.hashCode();
        }

        public String toString() {
            return "State(guestRuntime=" + this.guestRuntime + ", hostPort=" + this.hostPort + ", status=" + this.status + ", stateJob=" + this.stateJob + ")";
        }

        public State(GuestRuntime guestRuntime, GuestRuntime3 hostPort, Status status, Job stateJob) {
            Intrinsics.checkNotNullParameter(guestRuntime, "guestRuntime");
            Intrinsics.checkNotNullParameter(hostPort, "hostPort");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(stateJob, "stateJob");
            this.guestRuntime = guestRuntime;
            this.hostPort = hostPort;
            this.status = status;
            this.stateJob = stateJob;
        }

        public final GuestRuntime getGuestRuntime() {
            return this.guestRuntime;
        }

        public final GuestRuntime3 getHostPort() {
            return this.hostPort;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final Job getStateJob() {
            return this.stateJob;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GuestRuntimeTunnel.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/android/internal/guest/GuestRuntimeTunnel$State$Status;", "", "<init>", "(Ljava/lang/String;I)V", "STARTED", "READY", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Status {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status STARTED = new Status("STARTED", 0);
            public static final Status READY = new Status("READY", 1);

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{STARTED, READY};
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i) {
            }

            static {
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GuestRuntimeTunnel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/internal/guest/GuestRuntimeTunnel$Event;", "", "<init>", "()V", "Load", "IncomingMessage", "Lmicrogram/android/internal/guest/GuestRuntimeTunnel$Event$IncomingMessage;", "Lmicrogram/android/internal/guest/GuestRuntimeTunnel$Event$Load;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static abstract class Event {
        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Event() {
        }

        /* compiled from: GuestRuntimeTunnel.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/android/internal/guest/GuestRuntimeTunnel$Event$Load;", "Lmicrogram/android/internal/guest/GuestRuntimeTunnel$Event;", "Lmicrogram/android/internal/guest/HostPort;", "hostPort", "<init>", "(Lmicrogram/android/internal/guest/HostPort;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/android/internal/guest/HostPort;", "getHostPort", "()Lmicrogram/android/internal/guest/HostPort;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Load extends Event {
            private final GuestRuntime3 hostPort;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Load) && Intrinsics.areEqual(this.hostPort, ((Load) other).hostPort);
            }

            public int hashCode() {
                return this.hostPort.hashCode();
            }

            public String toString() {
                return "Load(hostPort=" + this.hostPort + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Load(GuestRuntime3 hostPort) {
                super(null);
                Intrinsics.checkNotNullParameter(hostPort, "hostPort");
                this.hostPort = hostPort;
            }

            public final GuestRuntime3 getHostPort() {
                return this.hostPort;
            }
        }

        /* compiled from: GuestRuntimeTunnel.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/android/internal/guest/GuestRuntimeTunnel$Event$IncomingMessage;", "Lmicrogram/android/internal/guest/GuestRuntimeTunnel$Event;", "Lmicrogram/android/internal/guest/RuntimeMessage;", "message", "<init>", "(Lmicrogram/android/internal/guest/RuntimeMessage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/android/internal/guest/RuntimeMessage;", "getMessage", "()Lmicrogram/android/internal/guest/RuntimeMessage;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IncomingMessage extends Event {
            private final RuntimeMessage message;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IncomingMessage) && Intrinsics.areEqual(this.message, ((IncomingMessage) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "IncomingMessage(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IncomingMessage(RuntimeMessage message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public final RuntimeMessage getMessage() {
                return this.message;
            }
        }
    }
}
