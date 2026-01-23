package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.collection.ScatterSet2;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateObjectImpl2;
import com.plaid.internal.EnumC7081g;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel5;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SnapshotFlow.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0002*\u0002H\u0007\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u0002H\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\r\u001a%\u0010\u000e\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0002\b\u0014¨\u0006\u0015"}, m3636d2 = {"snapshotFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function0;", "collectAsState", "Landroidx/compose/runtime/State;", "R", "initial", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "intersects", "", "Landroidx/collection/MutableScatterSet;", "", "set", "", "intersects$SnapshotStateKt__SnapshotFlowKt", "runtime_release"}, m3637k = 5, m3638mv = {1, 9, 0}, m3640xi = 48, m3641xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt, reason: use source file name */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotFlow {
    public static final <T> SnapshotState4<T> collectAsState(StateFlow<? extends T> stateFlow, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = CoroutineContextImpl6.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:48)");
        }
        SnapshotState4<T> snapshotState4CollectAsState = SnapshotStateKt.collectAsState(stateFlow, stateFlow.getValue(), coroutineContext2, composer, (i & 14) | ((i << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return snapshotState4CollectAsState;
    }

    public static final <T extends R, R> SnapshotState4<R> collectAsState(Flow<? extends T> flow, R r, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            coroutineContext = CoroutineContextImpl6.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:64)");
        }
        boolean zChangedInstance = composer.changedInstance(coroutineContext2) | composer.changedInstance(flow);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SnapshotFlow2(coroutineContext2, flow, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState4<R> snapshotState4ProduceState = SnapshotStateKt.produceState(r, flow, coroutineContext2, (Function2) objRememberedValue, composer, ((i >> 3) & 14) | ((i << 3) & 112) | (i & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return snapshotState4ProduceState;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SnapshotFlow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", m3645f = "SnapshotFlow.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 */
    static final class C17611<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<T> $block;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C17611(Function0<? extends T> function0, Continuation<? super C17611> continuation) {
            super(2, continuation);
            this.$block = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17611 c17611 = new C17611(this.$block, continuation);
            c17611.L$0 = obj;
            return c17611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C17611) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:34:0x00e2, B:38:0x00eb], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:42:0x00fa, B:58:0x0139], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:58:0x0139, B:42:0x00fa], limit reached: 75 */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:32:0x00de, B:34:0x00e2, B:39:0x00ec, B:42:0x00fa, B:46:0x0110, B:48:0x0119, B:56:0x0135, B:57:0x0138, B:15:0x0050, B:43:0x0105, B:45:0x010d, B:54:0x0131, B:55:0x0134), top: B:74:0x0050, inners: #5 }] */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v5 */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ObserverHandle observerHandleRegisterApplyObserver;
            ?? r10;
            final ScatterSet2 scatterSet2;
            Function1<Object, Unit> function1;
            final Channel channelChannel$default;
            Object objInvoke;
            ObserverHandle observerHandle;
            ?? r11;
            ScatterSet2 scatterSet22;
            Function1<Object, Unit> function12;
            Channel channel;
            Object obj2;
            int i;
            Set set;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    r10 = (FlowCollector) this.L$0;
                    scatterSet2 = new ScatterSet2(0, 1, null);
                    function1 = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj3) {
                            invoke2(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object obj3) {
                            if (obj3 instanceof StateObjectImpl) {
                                ((StateObjectImpl) obj3).m6432recordReadInh_f27i8$runtime_release(StateObjectImpl2.m6430constructorimpl(4));
                            }
                            scatterSet2.add(obj3);
                        }
                    };
                    channelChannel$default = Channel4.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    observerHandleRegisterApplyObserver = companion.registerApplyObserver(new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Set<? extends Object> set2, Snapshot snapshot) {
                            if (!(set2 instanceof ScatterSetWrapper)) {
                                Set<? extends Object> set3 = set2;
                                if ((set3 instanceof Collection) && set3.isEmpty()) {
                                    return;
                                }
                                for (Object obj3 : set3) {
                                    if (!(obj3 instanceof StateObjectImpl) || ((StateObjectImpl) obj3).m6431isReadInh_f27i8$runtime_release(StateObjectImpl2.m6430constructorimpl(4))) {
                                    }
                                }
                                return;
                            }
                            ScatterSet set$runtime_release = ((ScatterSetWrapper) set2).getSet$runtime_release();
                            Object[] objArr = set$runtime_release.elements;
                            long[] jArr = set$runtime_release.metadata;
                            int length = jArr.length - 2;
                            if (length < 0) {
                                return;
                            }
                            int i3 = 0;
                            loop0: while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        if ((255 & j) < 128) {
                                            Object obj4 = objArr[(i3 << 3) + i5];
                                            if (!(obj4 instanceof StateObjectImpl) || ((StateObjectImpl) obj4).m6431isReadInh_f27i8$runtime_release(StateObjectImpl2.m6430constructorimpl(4))) {
                                                break loop0;
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i4 != 8) {
                                        return;
                                    }
                                }
                                if (i3 == length) {
                                    return;
                                } else {
                                    i3++;
                                }
                            }
                            channelChannel$default.mo8337trySendJP2dKIU(set2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set2, Snapshot snapshot) {
                            invoke2(set2, snapshot);
                            return Unit.INSTANCE;
                        }
                    });
                    Snapshot snapshotTakeSnapshot = companion.takeSnapshot(function1);
                    Function0<T> function0 = this.$block;
                    try {
                        Snapshot snapshotMakeCurrent = snapshotTakeSnapshot.makeCurrent();
                        try {
                            objInvoke = function0.invoke();
                            snapshotTakeSnapshot.dispose();
                            this.L$0 = r10;
                            this.L$1 = scatterSet2;
                            this.L$2 = function1;
                            this.L$3 = channelChannel$default;
                            this.L$4 = observerHandleRegisterApplyObserver;
                            this.L$5 = objInvoke;
                            this.label = 1;
                            if (r10.emit(objInvoke, this) == coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } finally {
                        }
                    } finally {
                    }
                }
                if (i2 == 1) {
                    objInvoke = this.L$5;
                    observerHandleRegisterApplyObserver = (ObserverHandle) this.L$4;
                    channelChannel$default = (Channel) this.L$3;
                    function1 = (Function1) this.L$2;
                    scatterSet2 = (ScatterSet2) this.L$1;
                    r10 = (FlowCollector) this.L$0;
                } else if (i2 == 2) {
                    i = this.I$0;
                    obj2 = this.L$5;
                    observerHandle = (ObserverHandle) this.L$4;
                    channel = (Channel) this.L$3;
                    function12 = (Function1) this.L$2;
                    scatterSet22 = (ScatterSet2) this.L$1;
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r11 = flowCollector;
                        set = (Set) obj;
                        do {
                            i = (i == 0 || SnapshotFlow.intersects$SnapshotStateKt__SnapshotFlowKt(scatterSet22, set)) ? 1 : 0;
                            set = (Set) Channel5.m28806getOrNullimpl(channel.mo28799tryReceivePtdJZtk());
                        } while (set != null);
                        if (i != 0) {
                            scatterSet22.clear();
                            Snapshot snapshotTakeSnapshot2 = Snapshot.INSTANCE.takeSnapshot(function12);
                            Function0<T> function02 = this.$block;
                            try {
                                try {
                                    objInvoke = function02.invoke();
                                    snapshotTakeSnapshot2.dispose();
                                    if (!Intrinsics.areEqual(objInvoke, obj2)) {
                                        this.L$0 = r11;
                                        this.L$1 = scatterSet22;
                                        this.L$2 = function12;
                                        this.L$3 = channel;
                                        this.L$4 = observerHandle;
                                        this.L$5 = objInvoke;
                                        this.label = 3;
                                        if (r11.emit(objInvoke, this) != coroutine_suspended) {
                                            observerHandleRegisterApplyObserver = observerHandle;
                                            channelChannel$default = channel;
                                            function1 = function12;
                                            scatterSet2 = scatterSet22;
                                            r10 = r11;
                                        }
                                        return coroutine_suspended;
                                    }
                                } finally {
                                }
                                Snapshot snapshotMakeCurrent2 = snapshotTakeSnapshot2.makeCurrent();
                            } finally {
                            }
                        }
                        objInvoke = obj2;
                        observerHandleRegisterApplyObserver = observerHandle;
                        channelChannel$default = channel;
                        function1 = function12;
                        scatterSet2 = scatterSet22;
                        r10 = r11;
                    } catch (Throwable th) {
                        th = th;
                        observerHandleRegisterApplyObserver = observerHandle;
                        observerHandleRegisterApplyObserver.dispose();
                        throw th;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objInvoke = this.L$5;
                    observerHandleRegisterApplyObserver = (ObserverHandle) this.L$4;
                    channelChannel$default = (Channel) this.L$3;
                    function1 = (Function1) this.L$2;
                    scatterSet2 = (ScatterSet2) this.L$1;
                    r10 = (FlowCollector) this.L$0;
                }
                ResultKt.throwOnFailure(obj);
                this.L$0 = r10;
                this.L$1 = scatterSet2;
                this.L$2 = function1;
                this.L$3 = channelChannel$default;
                this.L$4 = observerHandleRegisterApplyObserver;
                this.L$5 = objInvoke;
                this.I$0 = 0;
                this.label = 2;
                obj = channelChannel$default.receive(this);
                if (obj != coroutine_suspended) {
                    r11 = r10;
                    scatterSet22 = scatterSet2;
                    function12 = function1;
                    channel = channelChannel$default;
                    observerHandle = observerHandleRegisterApplyObserver;
                    obj2 = objInvoke;
                    i = 0;
                    set = (Set) obj;
                    do {
                        if (i == 0) {
                        }
                        set = (Set) Channel5.m28806getOrNullimpl(channel.mo28799tryReceivePtdJZtk());
                    } while (set != null);
                    if (i != 0) {
                    }
                    objInvoke = obj2;
                    observerHandleRegisterApplyObserver = observerHandle;
                    channelChannel$default = channel;
                    function1 = function12;
                    scatterSet2 = scatterSet22;
                    r10 = r11;
                    this.L$0 = r10;
                    this.L$1 = scatterSet2;
                    this.L$2 = function1;
                    this.L$3 = channelChannel$default;
                    this.L$4 = observerHandleRegisterApplyObserver;
                    this.L$5 = objInvoke;
                    this.I$0 = 0;
                    this.label = 2;
                    obj = channelChannel$default.receive(this);
                    if (obj != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                observerHandleRegisterApplyObserver.dispose();
                throw th;
            }
        }
    }

    public static final <T> Flow<T> snapshotFlow(Function0<? extends T> function0) {
        return FlowKt.flow(new C17611(function0, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean intersects$SnapshotStateKt__SnapshotFlowKt(ScatterSet2<Object> scatterSet2, Set<? extends Object> set) {
        Object[] objArr = scatterSet2.elements;
        long[] jArr = scatterSet2.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && set.contains(objArr[(i << 3) + i3])) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}
