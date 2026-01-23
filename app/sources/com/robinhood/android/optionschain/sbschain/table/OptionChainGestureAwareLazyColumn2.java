package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.foundation.gestures.ScrollExtensions;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: OptionChainGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$1$1", m3645f = "OptionChainGestureAwareLazyColumn.kt", m3646l = {120, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainGestureAwareLazyColumn2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $autoScrollMaxSpeedPx;
    final /* synthetic */ float $autoScrollSmoothBufferPx;
    final /* synthetic */ float $autoScrollThresholdPx;
    final /* synthetic */ SnapshotState<Float> $draggedItemY$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ SnapshotState<DragTarget> $potentialDragTarget$delegate;
    final /* synthetic */ SnapshotFloatState2 $tableViewBottomForDrag$delegate;
    float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainGestureAwareLazyColumn2(float f, float f2, LazyListState lazyListState, float f3, SnapshotState<Float> snapshotState, SnapshotState<DragTarget> snapshotState2, SnapshotFloatState2 snapshotFloatState2, Continuation<? super OptionChainGestureAwareLazyColumn2> continuation) {
        super(2, continuation);
        this.$autoScrollThresholdPx = f;
        this.$autoScrollSmoothBufferPx = f2;
        this.$lazyListState = lazyListState;
        this.$autoScrollMaxSpeedPx = f3;
        this.$draggedItemY$delegate = snapshotState;
        this.$potentialDragTarget$delegate = snapshotState2;
        this.$tableViewBottomForDrag$delegate = snapshotFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionChainGestureAwareLazyColumn2(this.$autoScrollThresholdPx, this.$autoScrollSmoothBufferPx, this.$lazyListState, this.$autoScrollMaxSpeedPx, this.$draggedItemY$delegate, this.$potentialDragTarget$delegate, this.$tableViewBottomForDrag$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionChainGestureAwareLazyColumn2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r8 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r8 == r0) goto L40;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00bf -> B:22:0x0056). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Float fOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$18 = OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$18(this.$draggedItemY$delegate);
            if (fOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$18 != null) {
                float fFloatValue = fOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$18.floatValue();
                if (OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1(this.$potentialDragTarget$delegate) == null || (this.$autoScrollThresholdPx <= fFloatValue && fFloatValue <= this.$tableViewBottomForDrag$delegate.getFloatValue())) {
                    return Unit.INSTANCE;
                }
                f = fFloatValue;
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i == 1) {
                f = this.F$0;
                ResultKt.throwOnFailure(obj);
                ((Number) obj).floatValue();
                this.F$0 = f;
                this.label = 3;
                if (DelayKt.delay(16L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 2) {
                f = this.F$0;
                ResultKt.throwOnFailure(obj);
                ((Number) obj).floatValue();
                this.F$0 = f;
                this.label = 3;
                if (DelayKt.delay(16L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = this.F$0;
            ResultKt.throwOnFailure(obj);
        }
        if (OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1(this.$potentialDragTarget$delegate) != null && (f < this.$autoScrollThresholdPx || f > this.$tableViewBottomForDrag$delegate.getFloatValue())) {
            float f2 = this.$autoScrollThresholdPx;
            if (f < f2) {
                float autoScrollSpeedFactor = OptionChainGestureAwareLazyColumn.getAutoScrollSpeedFactor(f2 - f, this.$autoScrollSmoothBufferPx);
                LazyListState lazyListState = this.$lazyListState;
                float f3 = (-this.$autoScrollMaxSpeedPx) * autoScrollSpeedFactor;
                this.F$0 = f;
                this.label = 1;
                obj = ScrollExtensions.scrollBy(lazyListState, f3, this);
            } else {
                float autoScrollSpeedFactor2 = OptionChainGestureAwareLazyColumn.getAutoScrollSpeedFactor(f - this.$tableViewBottomForDrag$delegate.getFloatValue(), this.$autoScrollSmoothBufferPx);
                LazyListState lazyListState2 = this.$lazyListState;
                float f4 = this.$autoScrollMaxSpeedPx * autoScrollSpeedFactor2;
                this.F$0 = f;
                this.label = 2;
                obj = ScrollExtensions.scrollBy(lazyListState2, f4, this);
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
