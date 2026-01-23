package com.robinhood.android.acats.plaid.transfer.partial;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AcatsPlaidPartialTransferReadyComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$SwipeToRemoveRowLayout$1$1", m3645f = "AcatsPlaidPartialTransferReadyComposable.kt", m3646l = {355}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$SwipeToRemoveRowLayout$1$1 */
/* loaded from: classes24.dex */
final class C7549x1c697cda extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InteractionSource3 $interactionSource;
    final /* synthetic */ FocusRequester $rowFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7549x1c697cda(InteractionSource3 interactionSource3, FocusRequester focusRequester, Continuation<? super C7549x1c697cda> continuation) {
        super(2, continuation);
        this.$interactionSource = interactionSource3;
        this.$rowFocus = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7549x1c697cda(this.$interactionSource, this.$rowFocus, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C7549x1c697cda) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Interaction> interactions = this.$interactionSource.getInteractions();
            final FocusRequester focusRequester = this.$rowFocus;
            FlowCollector<? super Interaction> flowCollector = new FlowCollector() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$SwipeToRemoveRowLayout$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Interaction) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
                    if (interaction instanceof DragInteraction.Start) {
                        FocusRequester.m6497requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
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
