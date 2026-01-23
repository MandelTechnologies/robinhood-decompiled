package microgram.android.inject;

import com.robinhood.coroutines.job.CachedJobManager2;
import com.robinhood.coroutines.job.CachedJobManager5;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.MicrogramSource;
import microgram.android.Monitoring;
import microgram.android.extension.ServiceExtension;
import microgram.android.inject.MicrogramComponent;

/* compiled from: MicrogramCachedComponentManager.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BA\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramCachedComponentManager;", "Lcom/robinhood/coroutines/job/AbstractCachedJobManager;", "Lmicrogram/android/inject/MicrogramComponent;", "", "Lkotlinx/coroutines/CoroutineScope;", "parentScope", "Lkotlin/time/Duration;", "idleTimeout", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "componentFactory", "Lmicrogram/android/MicrogramSource;", "microgramSource", "", "", "Lmicrogram/android/extension/ServiceExtension$Factory;", "extensions", "<init>", "(Lkotlinx/coroutines/CoroutineScope;JLmicrogram/android/inject/MicrogramComponent$Factory;Lmicrogram/android/MicrogramSource;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "scope", "launchComponent", "(Lkotlinx/coroutines/CoroutineScope;)Lmicrogram/android/inject/MicrogramComponent;", "Lkotlinx/coroutines/CoroutineScope;", "getParentScope", "()Lkotlinx/coroutines/CoroutineScope;", "J", "getIdleTimeout-UwyO8pc", "()J", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "Lmicrogram/android/MicrogramSource;", "Ljava/util/Map;", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/android/MicrogramState;", "microgramStateFlow", "Lkotlinx/coroutines/flow/Flow;", "getMicrogramStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MicrogramCachedComponentManager extends CachedJobManager2<MicrogramComponent> {
    private final MicrogramComponent.Factory componentFactory;
    private final Map<String, ServiceExtension.Factory> extensions;
    private final long idleTimeout;
    private final MicrogramSource microgramSource;
    private final Flow<Monitoring> microgramStateFlow;
    private final CoroutineScope parentScope;

    public /* synthetic */ MicrogramCachedComponentManager(@RootCoroutineScope CoroutineScope coroutineScope, long j, MicrogramComponent.Factory factory, MicrogramSource microgramSource, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, j, factory, microgramSource, map);
    }

    @Override // com.robinhood.coroutines.job.CachedJobManager2
    protected CoroutineScope getParentScope() {
        return this.parentScope;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MicrogramCachedComponentManager(CoroutineScope coroutineScope, long j, MicrogramComponent.Factory factory, MicrogramSource microgramSource, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            j = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
        }
        this(coroutineScope, j, factory, microgramSource, (i & 16) != 0 ? MapsKt.emptyMap() : map, null);
    }

    @Override // com.robinhood.coroutines.job.CachedJobManager2
    /* renamed from: getIdleTimeout-UwyO8pc, reason: from getter */
    protected long getIdleTimeout() {
        return this.idleTimeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MicrogramCachedComponentManager(CoroutineScope parentScope, long j, MicrogramComponent.Factory componentFactory, MicrogramSource microgramSource, Map<String, ? extends ServiceExtension.Factory> extensions) {
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        Intrinsics.checkNotNullParameter(microgramSource, "microgramSource");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.parentScope = parentScope;
        this.idleTimeout = j;
        this.componentFactory = componentFactory;
        this.microgramSource = microgramSource;
        this.extensions = extensions;
        this.microgramStateFlow = CachedJobManager5.flowFrom(this, new MicrogramCachedComponentManager2(null));
    }

    public Flow<Monitoring> getMicrogramStateFlow() {
        return this.microgramStateFlow;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.coroutines.job.CachedJobManager2
    public MicrogramComponent launchComponent(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        MicrogramComponent microgramComponentCreate = this.componentFactory.create(scope, this.microgramSource, this.extensions);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C462501(microgramComponentCreate, this, null), 3, null);
        return microgramComponentCreate;
    }

    /* compiled from: MicrogramCachedComponentManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.inject.MicrogramCachedComponentManager$launchComponent$1", m3645f = "MicrogramCachedComponentManager.kt", m3646l = {38, 40}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: microgram.android.inject.MicrogramCachedComponentManager$launchComponent$1 */
    static final class C462501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MicrogramComponent $result;
        int label;
        final /* synthetic */ MicrogramCachedComponentManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C462501(MicrogramComponent microgramComponent, MicrogramCachedComponentManager microgramCachedComponentManager, Continuation<? super C462501> continuation) {
            super(2, continuation);
            this.$result = microgramComponent;
            this.this$0 = microgramCachedComponentManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C462501(this.$result, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C462501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r1.sleep("Microgram was terminated", r5, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<Monitoring> state = this.$result.getMicrogramMonitor().getState();
                Flow<Object> flow = new Flow<Object>() { // from class: microgram.android.inject.MicrogramCachedComponentManager$launchComponent$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: microgram.android.inject.MicrogramCachedComponentManager$launchComponent$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "microgram.android.inject.MicrogramCachedComponentManager$launchComponent$1$invokeSuspend$$inlined$filterIsInstance$1$2", m3645f = "MicrogramCachedComponentManager.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: microgram.android.inject.MicrogramCachedComponentManager$launchComponent$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
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
                                if (obj instanceof Monitoring.Terminated) {
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
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object objCollect = state.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                obj = FlowKt.first(flow, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            MicrogramCachedComponentManager microgramCachedComponentManager = this.this$0;
            IOException exception = ((Monitoring.Terminated) obj).getException();
            this.label = 2;
        }
    }
}
