package com.robinhood.android.blackwidow.p068ui.upsell;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
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

/* compiled from: ExploreLegendUpsellComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$logFirstScroll$1$1$1", m3645f = "ExploreLegendUpsellComposable.kt", m3646l = {1221}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ExploreLegendUpsellComposableKt$logFirstScroll$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserInteractionEventDescriptor $descriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExploreLegendUpsellComposableKt$logFirstScroll$1$1$1(LazyListState lazyListState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Continuation<? super ExploreLegendUpsellComposableKt$logFirstScroll$1$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$eventLogger = eventLogger;
        this.$descriptor = userInteractionEventDescriptor;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExploreLegendUpsellComposableKt$logFirstScroll$1$1$1(this.$listState, this.$eventLogger, this.$descriptor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExploreLegendUpsellComposableKt$logFirstScroll$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Interaction> interactions = this.$listState.getInteractionSource().getInteractions();
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
            FlowCollector<? super Interaction> flowCollector = new FlowCollector() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$logFirstScroll$1$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Interaction) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
                    if (interaction instanceof DragInteraction.Start) {
                        eventLogger.logScroll(userInteractionEventDescriptor.getAction(), userInteractionEventDescriptor.getScreen(), userInteractionEventDescriptor.getComponent(), userInteractionEventDescriptor.getComponentHierarchy(), userInteractionEventDescriptor.getContext());
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
