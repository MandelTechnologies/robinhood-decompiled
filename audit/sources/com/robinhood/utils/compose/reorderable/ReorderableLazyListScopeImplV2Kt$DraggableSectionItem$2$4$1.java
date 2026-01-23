package com.robinhood.utils.compose.reorderable;

import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: ReorderableLazyListScopeImplV2.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$4$1", m3645f = "ReorderableLazyListScopeImplV2.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, 300}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$4$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InteractionSource3 $interactionSource;
    final /* synthetic */ boolean $isDragGroup;
    final /* synthetic */ SnapshotState<Boolean> $sectionExpanded$delegate;
    final /* synthetic */ ImmutableList<S> $sectionItems;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$4$1(boolean z, ImmutableList<? extends S> immutableList, InteractionSource3 interactionSource3, SnapshotState<Boolean> snapshotState, Continuation<? super ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$4$1> continuation) {
        super(2, continuation);
        this.$isDragGroup = z;
        this.$sectionItems = immutableList;
        this.$interactionSource = interactionSource3;
        this.$sectionExpanded$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$4$1(this.$isDragGroup, this.$sectionItems, this.$interactionSource, this.$sectionExpanded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (r13.emit(r1, r12) != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[PHI: r1
      0x0083: PHI (r1v6 androidx.compose.foundation.interaction.PressInteraction$Release) = 
      (r1v5 androidx.compose.foundation.interaction.PressInteraction$Release)
      (r1v10 androidx.compose.foundation.interaction.PressInteraction$Release)
     binds: [B:22:0x0080, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PressInteraction.Release release;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$isDragGroup && ReorderableLazyListScopeImplV2Kt.DraggableSectionItem_Bn9xFrM$lambda$8(this.$sectionExpanded$delegate) && !this.$sectionItems.isEmpty()) {
                PressInteraction.Press press = new PressInteraction.Press(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), null);
                release = new PressInteraction.Release(press);
                InteractionSource3 interactionSource3 = this.$interactionSource;
                this.L$0 = release;
                this.label = 1;
                if (interactionSource3.emit(press, this) != coroutine_suspended) {
                    this.L$0 = release;
                    this.label = 2;
                    if (DelayKt.delay(200L, this) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            release = (PressInteraction.Release) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = release;
            this.label = 2;
            if (DelayKt.delay(200L, this) != coroutine_suspended) {
                InteractionSource3 interactionSource32 = this.$interactionSource;
                this.L$0 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        release = (PressInteraction.Release) this.L$0;
        ResultKt.throwOnFailure(obj);
        InteractionSource3 interactionSource322 = this.$interactionSource;
        this.L$0 = null;
        this.label = 3;
    }
}
