package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.SnapshotState;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SduiTableColumnHeader.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeaderKt$SduiTableColumnHeader$2$1", m3645f = "SduiTableColumnHeader.kt", m3646l = {47}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeaderKt$SduiTableColumnHeader$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SduiTableColumnHeader3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InteractionSource3 $interactionSource;
    final /* synthetic */ SnapshotState<Boolean> $isClicked$delegate;
    final /* synthetic */ Function0<Unit> $onClick;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SduiTableColumnHeader3(InteractionSource3 interactionSource3, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, Continuation<? super SduiTableColumnHeader3> continuation) {
        super(2, continuation);
        this.$interactionSource = interactionSource3;
        this.$onClick = function0;
        this.$isClicked$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SduiTableColumnHeader3(this.$interactionSource, this.$onClick, this.$isClicked$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SduiTableColumnHeader3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Interaction> interactions = this.$interactionSource.getInteractions();
            final Function0<Unit> function0 = this.$onClick;
            final SnapshotState<Boolean> snapshotState = this.$isClicked$delegate;
            FlowCollector<? super Interaction> flowCollector = new FlowCollector() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeaderKt$SduiTableColumnHeader$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Interaction) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
                    if ((interaction instanceof PressInteraction.Release) && function0 != null) {
                        SduiTableColumnHeader2.SduiTableColumnHeader$lambda$7(snapshotState, true);
                        function0.invoke();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (interactions.collect(flowCollector, this) == coroutine_suspended) {
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
