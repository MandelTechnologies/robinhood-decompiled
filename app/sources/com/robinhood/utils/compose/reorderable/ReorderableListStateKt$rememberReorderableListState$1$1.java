package com.robinhood.utils.compose.reorderable;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReorderableListState.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.utils.compose.reorderable.ReorderableListStateKt$rememberReorderableListState$1$1", m3645f = "ReorderableListState.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ReorderableListStateKt$rememberReorderableListState$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isReorderActive$delegate;
    final /* synthetic */ ImmutableList<T> $items;
    final /* synthetic */ SnapshotState<ImmutableList<T>> $localItems$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReorderableListStateKt$rememberReorderableListState$1$1(ImmutableList<? extends T> immutableList, SnapshotState<Boolean> snapshotState, SnapshotState<ImmutableList<T>> snapshotState2, Continuation<? super ReorderableListStateKt$rememberReorderableListState$1$1> continuation) {
        super(2, continuation);
        this.$items = immutableList;
        this.$isReorderActive$delegate = snapshotState;
        this.$localItems$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReorderableListStateKt$rememberReorderableListState$1$1(this.$items, this.$isReorderActive$delegate, this.$localItems$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReorderableListStateKt$rememberReorderableListState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!ReorderableListStateKt.rememberReorderableListState_KVH2U2I$lambda$1(this.$isReorderActive$delegate)) {
                this.$localItems$delegate.setValue(this.$items);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
