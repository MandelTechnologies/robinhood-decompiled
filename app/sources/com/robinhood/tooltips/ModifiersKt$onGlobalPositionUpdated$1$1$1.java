package com.robinhood.tooltips;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.tooltips.ModifiersKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.tooltips.ModifiersKt$onGlobalPositionUpdated$1$1$1", m3645f = "Modifiers.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ModifiersKt$onGlobalPositionUpdated$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Offset> $offsetInRoot$delegate;
    final /* synthetic */ Function2<Offset, IntSize, Unit> $onGlobalPosition;
    final /* synthetic */ SnapshotState<IntSize> $size$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ModifiersKt$onGlobalPositionUpdated$1$1$1(Function2<? super Offset, ? super IntSize, Unit> function2, SnapshotState<Offset> snapshotState, SnapshotState<IntSize> snapshotState2, Continuation<? super ModifiersKt$onGlobalPositionUpdated$1$1$1> continuation) {
        super(2, continuation);
        this.$onGlobalPosition = function2;
        this.$offsetInRoot$delegate = snapshotState;
        this.$size$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModifiersKt$onGlobalPositionUpdated$1$1$1(this.$onGlobalPosition, this.$offsetInRoot$delegate, this.$size$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModifiersKt$onGlobalPositionUpdated$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$onGlobalPosition.invoke(Offset.m6534boximpl(ModifiersKt.C416611.invoke$lambda$1(this.$offsetInRoot$delegate)), IntSize.m8055boximpl(ModifiersKt.C416611.invoke$lambda$4(this.$size$delegate)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
