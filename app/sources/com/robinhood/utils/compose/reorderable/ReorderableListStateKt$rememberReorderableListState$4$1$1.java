package com.robinhood.utils.compose.reorderable;

import androidx.compose.runtime.SnapshotState;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* compiled from: ReorderableListState.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.utils.compose.reorderable.ReorderableListStateKt$rememberReorderableListState$4$1$1", m3645f = "ReorderableListState.kt", m3646l = {104}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ReorderableListStateKt$rememberReorderableListState$4$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isReorderActive$delegate;
    final /* synthetic */ SnapshotState<ImmutableList<T>> $localItems$delegate;
    final /* synthetic */ Function2<List<? extends T>, Duration, Job> $onReorder;
    final /* synthetic */ Function0<Unit> $onReorderFinish;
    final /* synthetic */ long $reorderDebounceDelay;
    final /* synthetic */ SnapshotState<Job> $reorderJob$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReorderableListStateKt$rememberReorderableListState$4$1$1(Function2<? super List<? extends T>, ? super Duration, ? extends Job> function2, long j, Function0<Unit> function0, SnapshotState<ImmutableList<T>> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<Job> snapshotState3, Continuation<? super ReorderableListStateKt$rememberReorderableListState$4$1$1> continuation) {
        super(2, continuation);
        this.$onReorder = function2;
        this.$reorderDebounceDelay = j;
        this.$onReorderFinish = function0;
        this.$localItems$delegate = snapshotState;
        this.$isReorderActive$delegate = snapshotState2;
        this.$reorderJob$delegate = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReorderableListStateKt$rememberReorderableListState$4$1$1 reorderableListStateKt$rememberReorderableListState$4$1$1 = new ReorderableListStateKt$rememberReorderableListState$4$1$1(this.$onReorder, this.$reorderDebounceDelay, this.$onReorderFinish, this.$localItems$delegate, this.$isReorderActive$delegate, this.$reorderJob$delegate, continuation);
        reorderableListStateKt$rememberReorderableListState$4$1$1.L$0 = obj;
        return reorderableListStateKt$rememberReorderableListState$4$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReorderableListStateKt$rememberReorderableListState$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Job job = (Job) this.$onReorder.invoke(ReorderableListStateKt.rememberReorderableListState_KVH2U2I$lambda$4(this.$localItems$delegate), Duration.m28726boximpl(this.$reorderDebounceDelay));
                Job[] jobArr = {job, BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C418701(this.$reorderDebounceDelay, null), 3, null)};
                this.L$0 = job;
                this.label = 1;
                r1 = job;
                if (Await2.joinAll(jobArr, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r1 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Job job2 = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                r1 = job2;
            }
            Function0<Unit> function0 = this.$onReorderFinish;
            if (function0 != null) {
                function0.invoke();
            }
            ReorderableListStateKt.rememberReorderableListState_KVH2U2I$lambda$2(this.$isReorderActive$delegate, false);
            this.$reorderJob$delegate.setValue(null);
        } catch (CancellationException e) {
            r1.cancel(e);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ReorderableListState.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.compose.reorderable.ReorderableListStateKt$rememberReorderableListState$4$1$1$1", m3645f = "ReorderableListState.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.utils.compose.reorderable.ReorderableListStateKt$rememberReorderableListState$4$1$1$1 */
    static final class C418701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $reorderDebounceDelay;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C418701(long j, Continuation<? super C418701> continuation) {
            super(2, continuation);
            this.$reorderDebounceDelay = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C418701(this.$reorderDebounceDelay, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C418701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.$reorderDebounceDelay;
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(j, this) == coroutine_suspended) {
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
