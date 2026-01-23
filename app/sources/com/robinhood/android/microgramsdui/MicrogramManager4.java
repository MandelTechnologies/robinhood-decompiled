package com.robinhood.android.microgramsdui;

import com.robinhood.android.microgramsdui.control.UiInitializer;
import com.robinhood.concurrent.KeyedInstanceManager2;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.MicrogramLaunchId;
import microgram.android.Monitoring;
import microgram.android.inject.MicrogramComponent;

/* compiled from: MicrogramManager.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00178@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/RealMicrogramManager;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "componentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/inject/MicrogramComponent$Factory;)V", "referenceManager", "Lcom/robinhood/concurrent/DefaultKeyedInstanceManager;", "Lmicrogram/android/MicrogramLaunchId;", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "getInstance", "lifecycleScope", "id", "shutDownDebounce", "Lkotlin/time/Duration;", "getInstance-moChb0s", "getInstanceOrNull", "createInstance", "destroyInstance", "", "keys", "", "getKeys$lib_microgram_sdui_externalDebug$annotations", "()V", "getKeys$lib_microgram_sdui_externalDebug", "()Ljava/util/Set;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.microgramsdui.RealMicrogramManager, reason: use source file name */
/* loaded from: classes8.dex */
public final class MicrogramManager4 implements MicrogramManager {
    public static final int $stable = 8;
    private final MicrogramComponent.Factory componentFactory;
    private final KeyedInstanceManager2<MicrogramLaunchId, MicrogramManager2> referenceManager;
    private final CoroutineScope rootCoroutineScope;

    /* JADX INFO: Access modifiers changed from: private */
    public static final MicrogramManager2 getInstanceOrNull$lambda$4(MicrogramManager2 getOrNull) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        return getOrNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MicrogramManager2 getInstance_moChb0s$lambda$1(MicrogramManager2 acquire) {
        Intrinsics.checkNotNullParameter(acquire, "$this$acquire");
        return acquire;
    }

    public static /* synthetic */ void getKeys$lib_microgram_sdui_externalDebug$annotations() {
    }

    public MicrogramManager4(@RootCoroutineScope CoroutineScope rootCoroutineScope, MicrogramComponent.Factory componentFactory) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        this.rootCoroutineScope = rootCoroutineScope;
        this.componentFactory = componentFactory;
        this.referenceManager = new KeyedInstanceManager2<>(new MicrogramManager8(this), new Function2() { // from class: com.robinhood.android.microgramsdui.RealMicrogramManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MicrogramManager4.referenceManager$lambda$0(this.f$0, (MicrogramManager2) obj, (MicrogramLaunchId) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit referenceManager$lambda$0(MicrogramManager4 microgramManager4, MicrogramManager2 DefaultKeyedInstanceManager, MicrogramLaunchId it) {
        Intrinsics.checkNotNullParameter(DefaultKeyedInstanceManager, "$this$DefaultKeyedInstanceManager");
        Intrinsics.checkNotNullParameter(it, "it");
        microgramManager4.destroyInstance(DefaultKeyedInstanceManager);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.MicrogramManager
    /* renamed from: getInstance-moChb0s */
    public MicrogramManager2 mo16548getInstancemoChb0s(CoroutineScope lifecycleScope, final MicrogramLaunchId id, final Duration shutDownDebounce) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(id, "id");
        MicrogramManager2 microgramManager2 = (MicrogramManager2) this.referenceManager.acquire(id, new Function1() { // from class: com.robinhood.android.microgramsdui.RealMicrogramManager$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MicrogramManager4.getInstance_moChb0s$lambda$1((MicrogramManager2) obj);
            }
        });
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new MicrogramManager7(null), 3, null);
        jobLaunch$default.invokeOnCompletion(new Function1() { // from class: com.robinhood.android.microgramsdui.RealMicrogramManager$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MicrogramManager4.getInstance_moChb0s$lambda$3(shutDownDebounce, this, id, (Throwable) obj);
            }
        });
        final StateFlow<Monitoring> state = microgramManager2.getComponent().getMicrogramMonitor().getState();
        FlowKt.launchIn(FlowKt.onEach(FlowKt.take(new Flow<Object>() { // from class: com.robinhood.android.microgramsdui.RealMicrogramManager$getInstance-moChb0s$$inlined$filterIsInstance$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.microgramsdui.RealMicrogramManager$getInstance-moChb0s$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.RealMicrogramManager$getInstance-moChb0s$$inlined$filterIsInstance$1$2", m3645f = "MicrogramManager.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.microgramsdui.RealMicrogramManager$getInstance-moChb0s$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
        }, 1), new MicrogramManager6(jobLaunch$default, null)), lifecycleScope);
        return microgramManager2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInstance_moChb0s$lambda$3(Duration duration, MicrogramManager4 microgramManager4, MicrogramLaunchId microgramLaunchId, Throwable th) {
        if (duration != null) {
            BuildersKt__Builders_commonKt.launch$default(microgramManager4.rootCoroutineScope, null, null, new MicrogramManager5(duration, microgramManager4, microgramLaunchId, null), 3, null);
        } else {
            microgramManager4.referenceManager.release(microgramLaunchId, new Function1() { // from class: com.robinhood.android.microgramsdui.RealMicrogramManager$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MicrogramManager4.getInstance_moChb0s$lambda$3$lambda$2((MicrogramManager2) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInstance_moChb0s$lambda$3$lambda$2(MicrogramManager2 release) {
        Intrinsics.checkNotNullParameter(release, "$this$release");
        return Unit.INSTANCE;
    }

    public final MicrogramManager2 getInstanceOrNull(MicrogramLaunchId id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return (MicrogramManager2) this.referenceManager.getOrNull(id, new Function1() { // from class: com.robinhood.android.microgramsdui.RealMicrogramManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MicrogramManager4.getInstanceOrNull$lambda$4((MicrogramManager2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MicrogramManager2 createInstance(MicrogramLaunchId id) {
        CoroutineContext.Element element = this.rootCoroutineScope.getCoroutineContext().get(Job.INSTANCE);
        if (element == null) {
            throw new IllegalStateException(("Parent context must contain a job: " + this.rootCoroutineScope).toString());
        }
        MicrogramComponent microgramComponentCreate = this.componentFactory.create(CoroutineScope2.plus(this.rootCoroutineScope, JobKt.Job((Job) element)), id.getSource(), id.getExtensions());
        Intrinsics.checkNotNull(microgramComponentCreate, "null cannot be cast to non-null type com.robinhood.android.microgramsdui.control.UiInitializer.Component");
        return new MicrogramManager2(id, microgramComponentCreate, ((UiInitializer.Component) microgramComponentCreate).getUiInitializer());
    }

    private final void destroyInstance(MicrogramManager2 microgramManager2) {
        CoroutineScope2.cancel$default(microgramManager2.getComponent().getCoroutineScope(), null, 1, null);
    }

    public final Set<MicrogramLaunchId> getKeys$lib_microgram_sdui_externalDebug() {
        return this.referenceManager.getKeys();
    }
}
