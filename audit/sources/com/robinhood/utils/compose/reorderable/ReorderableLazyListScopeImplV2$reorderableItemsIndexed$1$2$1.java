package com.robinhood.utils.compose.reorderable;

import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReorderableLazyListScopeImplV2.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1", m3645f = "ReorderableLazyListScopeImplV2.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DragStateV2 $dragState;
    final /* synthetic */ int $groupId;
    final /* synthetic */ HapticFeedback $haptics;
    final /* synthetic */ List<T> $items;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onDragFinish;
    final /* synthetic */ Function0<Unit> $onDragStart;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onDragUpdate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1(DragStateV2 dragStateV2, int i, List<? extends T> list, Function0<Unit> function0, HapticFeedback hapticFeedback, Function2<? super Integer, ? super Integer, Unit> function2, Function2<? super Integer, ? super Integer, Unit> function22, Continuation<? super ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1> continuation) {
        super(2, continuation);
        this.$dragState = dragStateV2;
        this.$groupId = i;
        this.$items = list;
        this.$onDragStart = function0;
        this.$haptics = hapticFeedback;
        this.$onDragUpdate = function2;
        this.$onDragFinish = function22;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1(this.$dragState, this.$groupId, this.$items, this.$onDragStart, this.$haptics, this.$onDragUpdate, this.$onDragFinish, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DragStateV2 dragStateV2 = this.$dragState;
        int i = this.$groupId;
        int size = this.$items.size();
        final Function0<Unit> function0 = this.$onDragStart;
        final HapticFeedback hapticFeedback = this.$haptics;
        Function0<Unit> function02 = new Function0<Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1.1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
                hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            }
        };
        final Function2<Integer, Integer, Unit> function2 = this.$onDragUpdate;
        final HapticFeedback hapticFeedback2 = this.$haptics;
        Function2<Integer, Integer, Unit> function22 = new Function2<Integer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                invoke(num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i2, int i3) {
                Function2<Integer, Integer, Unit> function23 = function2;
                if (function23 != null) {
                    function23.invoke(Integer.valueOf(i2), Integer.valueOf(i3));
                }
                hapticFeedback2.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
            }
        };
        final Function2<Integer, Integer, Unit> function23 = this.$onDragFinish;
        final HapticFeedback hapticFeedback3 = this.$haptics;
        dragStateV2.registerGroup(i, size, function02, function22, new Function2<Integer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1.3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                invoke(num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i2, int i3) {
                function23.invoke(Integer.valueOf(i2), Integer.valueOf(i3));
                hapticFeedback3.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            }
        });
        return Unit.INSTANCE;
    }
}
